package handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginhandler
 */
@WebServlet("/loginhandler")
public class loginhandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginhandler() 
    {
        super();
       
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		  PrintWriter pw=response.getWriter();
		  
		  String user=request.getParameter("user");
		  String pass=request.getParameter("pwd");
		    
		  try 
		  {
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS_project","root","1qaz2wsx");
			  
			  PreparedStatement ps=con.prepareStatement("select *from adminlogin where uname=? and upass=?");
			  ps.setString(1, user);
			  ps.setString(2, pass);
			  
			  ResultSet rs=ps.executeQuery();
			  

			  if(rs.next())
			  {
				 
				   RequestDispatcher rd=request.getRequestDispatcher("homepage.jsp");
				   rd.forward(request, response);
				  
			  }
			  else
			  {
				  response.sendRedirect("login.jsp");
			  }
			  
			  
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	

		
	}

}
