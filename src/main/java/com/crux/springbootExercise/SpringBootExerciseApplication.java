package com.crux.springbootExercise;

import com.crux.springbootExercise.filter.SecondFilter;
import com.crux.springbootExercise.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * SpringBoot 启动类
 */
@SpringBootApplication
@ServletComponentScan //注解作用，在SpringBoot启动时会扫描@WebServlet，并将该类实例化。
public class SpringBootExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExerciseApplication.class, args);
    }

    /**
     * 注册Servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    /**
     * 注册Filter
     */
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        bean.addUrlPatterns(new String[]{"*.do","*.jsp","/second"});
        return bean;
    }

}
