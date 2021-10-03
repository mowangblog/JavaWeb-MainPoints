package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ServletHttpServletResponseDemo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 20:36
 **/
@WebServlet(name = "ServletHttpServletResponseDemo", value = "/ServletHttpServletResponseDemo")
public class ServletHttpServletResponseDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        System.out.println("response.getCharacterEncoding() = " + response.getCharacterEncoding());
        PrintWriter writer = response.getWriter();
        writer.write("<h1>mowangblog,魔王博客</h1>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
