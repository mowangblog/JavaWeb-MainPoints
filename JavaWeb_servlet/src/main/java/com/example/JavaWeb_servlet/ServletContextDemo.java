package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.WeakHashMap;

/**
 * ServletContextDemo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 11:02
 **/
@WebServlet(name = "ServletContextDemo", value = "/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        System.out.println("servletContext.getInitParameter(\"name\") = " + servletContext.getInitParameter("name"));
        System.out.println("servletContext.getInitParameter(\"url\") = " + servletContext.getInitParameter("url"));
        System.out.println("获得工程路径" + servletContext.getContextPath());
        System.out.println("获得工程部署路径" + servletContext.getRealPath("/WEB-INF"));
        servletContext.setAttribute("user","mowang");
        System.out.println("servletContext.getAttribute(\"user\") = " + servletContext.getAttribute("user"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
