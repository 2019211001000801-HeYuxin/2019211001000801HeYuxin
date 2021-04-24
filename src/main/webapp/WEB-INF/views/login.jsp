<%@ page import="javafx.scene.web.HTMLEditor" %>
<%@ page import="java.io.PrintStream" %><%--
  Created by IntelliJ IDEA.
  User: 41509
  Date: 2021/4/1
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="header.jsp"%>
<h1>Login</h1>
<%
    if(request.getAttribute("message")!=null){
        out.print("<h3>"+request.getAttribute("message")+"</h3>");
    }
%>
<%
    Cookie[] allCookies=request.getCookies();
    String username="",password="",rememberMeval="";
    if(allCookies!=null){
        for(Cookie c:allCookies){
            if(c.getName().equals("cUsername")){
                username=c.getValue();
            }
            if(c.getName().equals("cPassword")){
                password=c.getValue();
            }
            if(c.getName().equals("cRememberMe")){
                rememberMeval=c.getValue();
            }
        }
    }
%>
<form method="post" action="/2019211001000801HeYuxin_war_exploded/login">
    Username:<input type="text" name="username" value="<%=username%>"><br/>
    Password:<input type="password" name="password" value="<%=password%>"><br/>
    <input type="checkbox" name="rememberMe" value="1" <%=rememberMeval.equals("1")?"checked":""%>checked />  RememberMe<br/>
  <input type="submit" value="Login"/>
</form>
</body>
<%@ include file="footer.jsp"%>
</html>