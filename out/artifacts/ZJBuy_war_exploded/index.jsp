<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/3/15
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page  language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>购物车</title>
  </head>
  <body>
  <%
    String msg = (String)request.getAttribute("msg");
    if(msg!=null){
     out.print(msg);
    }
  %>
  <form action="/servlet/doLogin" method="post">
    用户名：<input type="text" name="userName"/><br>
    密码：<input type="password" name="pwd"/><br>
    验证码：<input type="text" name="code"/>
    <img src="/servlet/login" onclick="changeCode()"/>
    <a href="javascript:changeCode()" >看不清换一张</a><br/>
    <input type="submit" value="登录"/><br>
  </form>
  <form action="${pageContext.request.contextPath}/register.jsp" method="post">
  <input type="submit" value="注册"/><br>
  </form>
  </body>
</html>
