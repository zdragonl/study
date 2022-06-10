package com.lab2;

import javax.servlet.*;
import java.io.IOException;

public class ZhangLongFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("zhanglongFilter--->before chain");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("zhanglongFilter--->after chain");
    }

    @Override
    public void destroy() {

    }
}
