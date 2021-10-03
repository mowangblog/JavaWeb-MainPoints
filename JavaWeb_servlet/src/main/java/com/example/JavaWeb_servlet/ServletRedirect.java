package com.example.JavaWeb_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JavaWeb-MainPoints
 * redirect
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/03 20:43
 **/
@WebServlet(name = "ServletRedirect", value = "/ServletRedirect")
public class ServletRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/");
    }
}
