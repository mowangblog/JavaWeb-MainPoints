package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * ServletContextDemo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 11:02
 **/
@WebServlet(name = "ServletContextDemo", value = "/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {

    /*
        servlet

     */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
