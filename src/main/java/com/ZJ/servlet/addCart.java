package com.ZJ.servlet;

import com.ZJ.entity.Book;
import com.ZJ.util.DButil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/3/16.
 */
public class addCart extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String id=request.getParameter("id");
        Book book=DButil.findBookById(id);
        HttpSession session=request.getSession();
        List<Book> list=(List<Book>)session.getAttribute("cart");
        if(list==null)
        {
            list=new ArrayList<Book>();
        }
        list.add(book);




    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
