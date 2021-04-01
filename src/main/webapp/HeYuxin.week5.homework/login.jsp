<%--
  Created by IntelliJ IDEA.
  User: 41509
  Date: 2021/4/1
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
<%@include file="header.jsp"%>
<h1>Login</h1>
<form method="post" action="/2019211001000801HeYuxin_war_exploded/login">
    Username:<input type="text" name="username" ><br/>
    Password:<input type="password" name="password"><br/>
    <input type="submit" value="Login"/>
</form>
<%@ include file="footer.jsp"%>
</body>
</html>