<%--
  Created by IntelliJ IDEA.
  User: 41509
  Date: 2021/4/1
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h2>Welcome to My Online Shop Home Page.</h2>
<form method="get"  target="_blank" action="search">
    <input type="text" name="txt" size=30/>
    <select name="search">
        <option value="Baidu">Baidu</option>
        <option value="Bing">Bing</option>
        <option value="Google">Google</option>
    </select>
    <input type="submit" value="Search"/>
</form>
<%--<h1>Welcome to my home page.</h1>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/index.jsp">Hello Servlet-week1</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/HelloWorldServlet">HelloWoldServlet-week2</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/HeYuxin.week2.homework/register.jsp">Register Servlet-week2</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/register">Register-getParameter-week3</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/config">Config parameter-week4</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/register">Register JDBC-week4</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/HeYuxin.week5.homework/MyJsp.jsp">include-week5</a>--%>
<%--</br>--%>
<%--<a href="http://localhost:8080/2019211001000801HeYuxin_war_exploded/HeYuxin.week5.homework/login.jsp">Login-week5</a>--%>
<%--</br>--%>
<%@ include file="footer.jsp"%>