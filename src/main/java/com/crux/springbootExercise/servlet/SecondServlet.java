package com.crux.springbootExercise.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * SpringBoot整合Servlet方式二
 * @author wushuhua
 * @date 2019/11/14 15:44
 */
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("##############SecondServlet##############");
    }
}
