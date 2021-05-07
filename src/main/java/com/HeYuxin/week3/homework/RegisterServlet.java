package com.HeYuxin.week3.homework;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns= {"/register"} )
public class RegisterServlet extends HttpServlet {
    Connection con = null;
    public void init() throws ServletException{
//        String driver = getServletContext().getInitParameter("driver");
//        String url = getServletContext().getInitParameter("url");
//        String username = getServletContext().getInitParameter("username");
//        String password = getServletContext().getInitParameter("password");
//
//        try{
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, username, password);
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
        con = (Connection) getServletContext().getAttribute("con");
        }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Username = request.getParameter("Username");
        String password = request.getParameter("password");
        String Email = request.getParameter("Email");
        String Gender = request.getParameter("sex");
        String BirthDate = request.getParameter("BirthDate");
        PrintWriter writer = response.getWriter();
//
//        writer.println("<br/>Username :" + Username);
//        writer.println("<br/>Password :" + password);
//        writer.println("<br/>Email :" + Email);
//        writer.println("<br/>Gender :" + Gender);
//        writer.println("<br/>BirthDate :" + BirthDate);
//
//        writer.close();
        String[][] arr=new String[100][6];
        int a=0;
        try {
            System.out.println("con:"+con);
            Statement createDbStatement = con.createStatement();
            String add="insert into usertable values('"+Username+"','"+password+"','"+Email+"','"+Gender+"','"+BirthDate+"')";
            createDbStatement.executeUpdate(add);

//            String rs="select * from usertable";
//            ResultSet result=createDbStatement.executeQuery(rs);
//            while(result.next()) {
//                arr[a][0]=result.getString(1);
//                arr[a][1]=result.getString(2);
//                arr[a][2]=result.getString(3);
//                arr[a][3]=result.getString(4);
//                arr[a++][4]=result.getString(5);
//            }
            //week-9
            response.sendRedirect("login");
        } catch (Exception e) {
            System.out.println(e);
        }
        //response.sendRedirect("login.jsp");
//        writer.println("<table border=\"1\">");
//        writer.println("<tr><th>ID</th><th>UserName</th><th>Password</th><th>Email</th><th>Gender</th><th>Birthdate</th></tr>");
//        for(int i=0;i<a;i++) {
//            writer.println("<tr><td>"+(i+1)+"</td>");
//            for(int j=1;j<=5;j++) {
//                writer.println("<td>"+arr[i][j]+"</td>");
//            }
//            writer.println("</tr>");
//        }
//        writer.println("</table>");
    }

}


