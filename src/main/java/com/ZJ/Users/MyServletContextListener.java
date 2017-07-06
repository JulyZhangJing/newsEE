package com.ZJ.Users;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by lenovo on 2017/3/16.
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
    public static ServletContext context;

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        context = servletContextEvent.getServletContext();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

