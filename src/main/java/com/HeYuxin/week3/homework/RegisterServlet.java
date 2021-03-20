package com.HeYuxin.week3.homework;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet",value = "/RegisterServlet"  )
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Username = request.getParameter("Username");
        String password = request.getParameter("password");
        String Email = request.getParameter("Email");
        String Gender = request.getParameter("sex");
        String BirthDate = request.getParameter("BirthDate");
        PrintWriter writer = response.getWriter();

        writer.println("<br/>Username :" + Username);
        writer.println("<br/>Password :" + password);
        writer.println("<br/>Email :" + Email);
        writer.println("<br/>Gender :" + Gender);
        writer.println("<br/>BirthDate :" + BirthDate);

        writer.close();

    }
}
