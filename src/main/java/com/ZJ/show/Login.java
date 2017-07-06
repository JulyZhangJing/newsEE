package com.ZJ.show;

import cn.dsna.util.images.ValidateCode;
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
public class Login extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ValidateCode  vc=new ValidateCode(110,25,4,9);
        request.getSession().setAttribute("scode",vc.getCode());
        vc.write(response.getOutputStream());





    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
