<%--
  Created by IntelliJ IDEA.
  User: 41509
  Date: 2021/3/14
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
New User Registration!<br/><br/>
<form method="post">
    <input type="text" name="Username" placeholder ="Username" style="background:#FFFCEC;border: 0;width:300px;height:30px;margin-bottom: 10px;"><br/>
    <input type="password" name="password" minlength="8" placeholder ="password" style="background:#FFFCEC;border: 0;width:300px;height:30px;margin-bottom: 10px;"><br/>
    <input type="email" name="Email" placeholder ="Email" style="background:#FFFCEC;border: 0;width:300px;height:30px;margin-bottom: 10px;"><br/>
    Gender<input type="radio" name="sex" value="male" checked>Male
    <input type="radio" name="sex" value="female" style="margin-bottom: 10px;">Female
    <br/>
    <input type="date" name="BirthDate" placeholder ="Date of Birth(yyyy-mm-dd)" style="background:#FFFCEC;border: 0;height:30px;width:300px;margin-bottom: 10px;"><br/>
    <input type="submit" value="Register" style="background:#FF9224; color:#fff; width:100px; height:30px;border: 0;"/>
</form>
</body>
</html>
