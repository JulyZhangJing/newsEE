package com.ZJ.Register;

import com.ZJ.Users.DBUser;
import com.ZJ.Users.User;
import com.ZJ.entity.Book;
import com.ZJ.show.DoLogin;
import com.ZJ.util.DButil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by lenovo on 2017/3/17.
 */
public class RegisterServlet  extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String userName = request.getParameter("userName");
        String pwd = request.getParameter("pwd");
        //处理业务逻辑
        DBRUser inn=new DBRUser();
        //分发转向
        inn.FindUser(userName,pwd);
        DBUser dl=new DBUser();
        User user=dl.FindUser(userName,pwd);
        if(user!=null){

            out.write("注册成功！！");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            out.write("注册失败！！");
            //设置2秒跳到重新登录
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
