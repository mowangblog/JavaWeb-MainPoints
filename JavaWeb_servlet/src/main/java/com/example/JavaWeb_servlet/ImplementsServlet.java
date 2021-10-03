package com.example.JavaWeb_servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * JavaWeb-MainPoints
 * 直接实现servlet接口
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/03 10:42
 **/
public class ImplementsServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servletConfig.getServletName() = " + servletConfig.getServletName());
        System.out.println("servletConfig.getInitParameter(\"name\") = " + servletConfig.getInitParameter("name"));
        System.out.println("servletConfig.getInitParameter(\"url\") = " + servletConfig.getInitParameter("url"));
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    @SuppressWarnings("all")
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)) {
            System.out.println("GET请求");
        } else if ("POST".equals(method)) {
            System.out.println("POST请求");
        } else {
            System.out.println("其他请求");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
