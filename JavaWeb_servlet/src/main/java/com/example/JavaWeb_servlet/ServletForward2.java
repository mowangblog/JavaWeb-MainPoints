package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/**
 * ServletForward
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 20:22
 **/
@WebServlet(name = "ServletForward2", value = "/ServletForward2")
public class ServletForward2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servlet2 处理 = " + request.getAttribute("user"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
