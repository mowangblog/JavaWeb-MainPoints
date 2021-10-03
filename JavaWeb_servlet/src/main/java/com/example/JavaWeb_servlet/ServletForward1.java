package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.Year;

/**
 * ServletForward
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 20:22
 **/
@WebServlet(name = "ServletForward1", value = "/ServletForward1")
public class ServletForward1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        System.out.println("servlet1获得参数："+user);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ServletForward2");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
