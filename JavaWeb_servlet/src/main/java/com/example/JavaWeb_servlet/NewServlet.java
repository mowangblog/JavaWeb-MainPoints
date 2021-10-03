package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 新servlet
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 10:23
 **/
@WebServlet(name = "NewServlet", value = "/NewServlet")
public class NewServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println(config);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        System.out.println("servletConfig.getServletName() = " + servletConfig.getServletName());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
