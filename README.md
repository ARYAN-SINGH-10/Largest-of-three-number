# 🔢 Largest of Three Numbers

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5" />
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3" />
  <img src="https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" alt="Maven" />
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" />
  <img src="https://img.shields.io/badge/Render-46E3B7?style=for-the-badge&logo=render&logoColor=white" alt="Render" />
</p>

A clean and intuitive Java Servlet web application to find the largest among three given numbers. The project features modern CSS styling and is fully containerized using Docker for seamless cloud deployment.

## 🚀 Live Demo

**Check out the live application here:** [https://largest-of-three-number.onrender.com/](https://largest-of-three-number.onrender.com/)

## 🛠️ Built With
- **Backend:** Java, Servlets
- **Frontend:** HTML5, Modern CSS (Custom properties, Flexbox)
- **Build Tool:** Apache Maven
- **Containerization:** Docker
- **Deployment & Hosting:** Render, Apache Tomcat

## 🌟 Features
- **Modern UI:** Clean card-based user interface using Google Fonts (`Outfit`).
- **Server-Side Rendering:** Backend logic efficiently handled via Java Servlets.
- **Containerized:** Uses a multi-stage Docker build resulting in a lightweight production artifact.
- **Live Deployment:** Hosted automatically on Render utilizing the Tomcat server.

## 💻 Local Setup

If you wish to run this application locally using Docker:

1. Clone this repository:
   ```bash
   git clone https://github.com/ARYAN-SINGH-10/Largest-of-three-number.git
   ```
2. Build the Docker image:
   ```bash
   docker build -t largest-of-three .
   ```
3. Run the container:
   ```bash
   docker run -p 8080:8080 largest-of-three
   ```
4. Visit `http://localhost:8080` in your browser.
