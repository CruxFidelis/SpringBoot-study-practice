package com.crux.springbootExercise.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * SpringBoot整合Filter方式一
 * @author wushuhua
 * @date 2019/11/14 23:15
 */

@WebFilter(filterName = "FirstFilter",urlPatterns = {"*.do","*.jsp","/first"})
//@WebFilter(filterName = "FirstFilter",urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("##############进入FirstFilter##############");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("##############离开FirstFilter##############");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
