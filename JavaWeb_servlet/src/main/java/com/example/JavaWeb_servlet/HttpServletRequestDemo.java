package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * HttpServletRequest
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 19:00
 **/
@WebServlet(name = "HttpServletRequestDemo", value = "/ServletRequest")
public class HttpServletRequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //资源路径
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        //统一资源定位符 绝地路径
        System.out.println("request.getRequestURL() = " + request.getRequestURL());
        //获取客户端ip
        System.out.println("request.getRemoteHost() = " + request.getRemoteHost());
        //获得请求方式get or post
        System.out.println("request.getMethod() = " + request.getMethod());
        //获取请求头中的User-Agent参数
        System.out.println("request.getHeader(\"User-Agent\") = " + request.getHeader("User-Agent"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("user");
        String[] passwords = request.getParameterValues("password");
        System.out.println("用户名："+user+"密码："+passwords[0]);
    }
}
