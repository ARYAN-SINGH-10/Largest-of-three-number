# Build stage
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
# Download dependencies first for better caching
RUN mvn dependency:go-offline

COPY src ./src
# Build the WAR file
RUN mvn clean package -DskipTests

# Run stage
FROM tomcat:9-jre17
# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*
# Copy the built WAR file to Tomcat's webapps directory as ROOT.war
COPY --from=build /app/target/ROOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
