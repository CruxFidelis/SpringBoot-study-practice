package com.crux.springbootExercise.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * SpringBoot整合Filter方式二
 * @author wushuhua
 * @date 2019/11/15 2:34
 */
public class SecondFilter implements Filter {
    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("##############进入SecondFilter##############");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("##############离开SecondFilter##############");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
