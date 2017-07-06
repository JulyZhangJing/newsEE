package com.ZJ.servlet;

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
public class showCart extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.print("购物车有以下商品:<br/>");
        HttpSession session=request.getSession();
        List<Book> books=(List<Book>)session.getAttribute("cart");
        if(books==null)
        {
            out.print("你还什么都没买呢");
            response.setHeader("refresh","2;url="+request.getContextPath()+"/servlet/showCart");
            return;
        }
        for(Book book:books){
            out.write(book.getName()+"<br/>");
        }




    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
