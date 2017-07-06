<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/3/17
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"  %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form action="/servlet/registerSerlet" method="post">
        用户名：<input type="text" name="userName"/><br>
        密码：<input type="password" name="pwd"/><br>
        <input type="submit" value="注册"><br/>
    </form>

</body>
</html>
