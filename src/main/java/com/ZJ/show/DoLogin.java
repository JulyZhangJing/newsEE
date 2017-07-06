package com.ZJ.show;

import com.ZJ.Users.DBUser;
import com.ZJ.Users.User;
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
public class DoLogin extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();

        String userName=request.getParameter("userName");
        String pwd=request.getParameter("pwd");
        String code=request.getParameter("code");
        String scode=(String)request.getSession().getAttribute("scode");
       DBUser db=new DBUser();
       User u=db.FindUser(userName,pwd);

        if(u!=null) {
            if (!code.equalsIgnoreCase(scode)) {
                request.setAttribute("msg", "验证码错误");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
           }
            out.print("登录成功");
            response.setHeader("refresh", "2;url="+request.getContextPath()+"/servlet/cart");

        }
        else{

            request.getRequestDispatcher("/index.jsp").forward(request, response);

        }





    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
