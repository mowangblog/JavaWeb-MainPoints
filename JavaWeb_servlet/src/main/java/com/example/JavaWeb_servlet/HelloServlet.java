package com.example.JavaWeb_servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 * JavaWeb-servlet
 * servlet入门
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-03 00:15
 **/
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "Hello World!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}