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
public class SessionDemo2 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
       HttpSession session=request.getSession();
       String name=(String)session.getAttribute("name");
       if(name!=null)
       {
           out.print(name);
       }
       else{
           out.print("你不能访问此资源");
       }
       out.print(session.getId());


    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
