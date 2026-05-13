package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Largest extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        int n3 = Integer.parseInt(request.getParameter("n3"));

        String result;
        int largest;

        if (n1 >= n2 && n1 >= n3) {

            result = "First Number is Largest";
            largest = n1;

        } 
        else if (n2 >= n1 && n2 >= n3) {

            result = "Second Number is Largest";
            largest = n2;

        } 
        else {

            result = "Third Number is Largest";
            largest = n3;
        }

        out.println("<!DOCTYPE html>");

        out.println("<html lang='en'>");

        out.println("<head>");

        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");

        out.println("<title>Result</title>");

        out.println("<link rel='preconnect' href='https://fonts.googleapis.com'>");
        out.println("<link rel='preconnect' href='https://fonts.gstatic.com' crossorigin>");

        out.println("<link href='https://fonts.googleapis.com/css2?family=Outfit:wght@400;500;600;700&display=swap' rel='stylesheet'>");

        out.println("<style>");

        out.println(":root {");
        out.println("--bg-color: #f8fafc;");
        out.println("--card-bg: #ffffff;");
        out.println("--primary: #2563eb;");
        out.println("--primary-hover: #1d4ed8;");
        out.println("--text-heading: #0f172a;");
        out.println("--text-body: #475569;");
        out.println("--border: #e2e8f0;");
        out.println("--shadow: 0 10px 15px -3px rgba(0,0,0,0.1), 0 4px 6px -2px rgba(0,0,0,0.05);");
        out.println("}");

        out.println("* {");
        out.println("margin: 0;");
        out.println("padding: 0;");
        out.println("box-sizing: border-box;");
        out.println("font-family: 'Outfit', sans-serif;");
        out.println("}");

        out.println("body {");
        out.println("background: var(--bg-color);");
        out.println("min-height: 100vh;");
        out.println("display: flex;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("padding: 20px;");
        out.println("}");

        out.println(".card {");
        out.println("background: var(--card-bg);");
        out.println("padding: 40px;");
        out.println("border-radius: 18px;");
        out.println("box-shadow: var(--shadow);");
        out.println("width: 100%;");
        out.println("max-width: 500px;");
        out.println("text-align: center;");
        out.println("border: 1px solid var(--border);");
        out.println("}");

        out.println("h1 {");
        out.println("font-size: 32px;");
        out.println("color: var(--text-heading);");
        out.println("margin-bottom: 20px;");
        out.println("}");

        out.println(".result {");
        out.println("background: #eff6ff;");
        out.println("padding: 20px;");
        out.println("border-radius: 14px;");
        out.println("margin-top: 20px;");
        out.println("}");

        out.println(".result-text {");
        out.println("font-size: 24px;");
        out.println("font-weight: 700;");
        out.println("color: var(--primary);");
        out.println("margin-bottom: 10px;");
        out.println("}");

        out.println(".number {");
        out.println("font-size: 42px;");
        out.println("font-weight: 700;");
        out.println("color: var(--text-heading);");
        out.println("}");

        out.println(".btn {");
        out.println("display: inline-block;");
        out.println("margin-top: 30px;");
        out.println("padding: 14px 28px;");
        out.println("background: var(--primary);");
        out.println("color: white;");
        out.println("text-decoration: none;");
        out.println("border-radius: 10px;");
        out.println("font-weight: 600;");
        out.println("transition: 0.2s;");
        out.println("}");

        out.println(".btn:hover {");
        out.println("background: var(--primary-hover);");
        out.println("}");

        out.println("</style>");

        out.println("</head>");

        out.println("<body>");

        out.println("<div class='card'>");

        out.println("<h1>Comparison Result</h1>");

        out.println("<div class='result'>");

        out.println("<div class='result-text'>");
        out.println(result);
        out.println("</div>");

        out.println("<div class='number'>");
        out.println(largest);
        out.println("</div>");

        out.println("</div>");

        out.println("<a href='index.html' class='btn'>Try Again</a>");

        out.println("</div>");

        out.println("</body>");

        out.println("</html>");
    }
}