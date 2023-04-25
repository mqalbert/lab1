package com.example.lab1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String name;
    private int course;
    private String group;
    private String theme;

    public void init() {
        name = "Albert Mkrychian";
        course = 2;
        group = "AD-212";
        theme = "web";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Student info</h1>");
        out.println("<p>" + "Name: " + name + "</p>");
        out.println("<p>" + "Course: " + course + "</p>");
        out.println("<p>" + "Group: " + group + "</p>");
        out.println("<p>" + "Theme: " + theme + "</p>");
        out.println("<p><a href=\"./\">Go back.</a></p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}

