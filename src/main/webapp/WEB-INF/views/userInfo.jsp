<%@ page import="com.HeYuxin.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 41509
  Date: 2021/4/11
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<%
    User user=(User)request.getAttribute("user");
%>
<table>
    <tr>
        <td>Username:</td><td><%=user.getUsername()%></td>
        <td>Password:</td><td><%=user.getPassword()%></td>
        <td>Email:</td><td><%=user.getEmail()%></td>
        <td>Gender:</td><td><%=user.getGender()%></td>
        <td>Birth Date:</td><td><%=user.getBirthDate()%></td>
    </tr>
</table>
<%@include file="footer.jsp"%>
