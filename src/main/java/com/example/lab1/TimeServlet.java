package com.example.lab1;
import java.io.*;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "timeServlet", value = "/time")

public class TimeServlet extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Date date = new Date();
        request.setAttribute("date", date.toString());
        request.getRequestDispatcher("time.jsp").forward(request, response);

    }

    public void destroy() {
    }

}
