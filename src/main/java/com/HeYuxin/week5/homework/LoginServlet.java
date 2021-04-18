package com.HeYuxin.week5.homework;

import com.HeYuxin.dao.UserDao;
import com.HeYuxin.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet{
    Connection con = null;
    @Override
    public void init() throws ServletException{
        super.init();
//            String driver = getServletContext().getInitParameter("driver");
//            String url = getServletContext().getInitParameter("url");
//            String username = getServletContext().getInitParameter("username");
//            String password = getServletContext().getInitParameter("password");
//
//            try{
//                Class.forName(driver);
//                con = DriverManager.getConnection(url, username, password);
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
        con = (Connection) getServletContext().getAttribute("con");
        }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        UserDao userDao=new UserDao();
        try {
            User user = userDao.findByUsernamePassword(con, username, password);
            if(user!=null){
                request.setAttribute("user",user);
                request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
            }else{
                request.setAttribute("message","Username or Password Error!!!");
                request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

//        boolean isValid = false;
//        PreparedStatement pre = null;
//        ResultSet result = null;
/*        try {
            String sql = "select * from usertable where username=? and password=?";
            pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            result = pre.executeQuery();
            if (result.next()){
                isValid = true;
//                writer.println("Login Success!!!");
//                writer.println("Welcome,"+username);
                request.setAttribute("id",result.getInt("id"));
                request.setAttribute("username",result.getString("Username"));
                request.setAttribute("password",result.getString("password"));
                request.setAttribute("email",result.getString("Email"));
                request.setAttribute("gender",result.getString("Gender"));
                request.setAttribute("birthDate",result.getString("BirthDate"));
                request.getRequestDispatcher("userInfo.jsp").forward(request,response);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        if(!isValid){
//            writer.println("Username or Password Error!!!");
            request.setAttribute("message","username or Password Error!!!");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
*/
}
}
