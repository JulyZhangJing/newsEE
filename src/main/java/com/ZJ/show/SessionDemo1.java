package com.ZJ.show;

import com.ZJ.entity.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by lenovo on 2017/3/16.
 */
public class SessionDemo1 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
        if(name!=null)
        {
            name=new String(name.getBytes("iso-8859-1"),"UTF-8");

        }
        HttpSession session=request.getSession();
        session.setAttribute("name",name);
        response.getWriter().write(session.getId());




    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
