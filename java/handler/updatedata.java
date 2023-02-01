package handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatedata
 */
@WebServlet("/updatedata")
public class updatedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  PrintWriter pw=response.getWriter();
		  
		  
		

		 // int hammer2 = Integer.parseInt(request.getParameter("hammer5"));
		
		  int hammer = Integer.parseInt(request.getParameter("hammer2"));
		  int wood = Integer.parseInt(request.getParameter("wood2"));
		  int axe = Integer.parseInt(request.getParameter("axe2"));
		  int grasscutter = Integer.parseInt(request.getParameter("grasscutter2"));
		  int pipe = Integer.parseInt(request.getParameter("pipe2"));
		  int doorlock = Integer.parseInt(request.getParameter("doorlock2"));
		  int sefty = Integer.parseInt(request.getParameter("sefty2"));
		  int cooler = Integer.parseInt(request.getParameter("cooler2"));
		  
		 
		    
		  try 
		  {
			  
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS_project","root","1qaz2wsx");
            
			
	
	String sql="update adminlogin set hammer=?, wood=?, axe=?, grasscutter=?, pipe=?, doorlock=?, sefty=?, cooler=? where uname='admin'";
	
			
		   PreparedStatement ps=con.prepareStatement(sql);
		   
		   ps.setInt(1, hammer);
		   ps.setInt(2, wood);
		   ps.setInt(3, axe);
			  ps.setInt(4, grasscutter);
			  ps.setInt(5, pipe);
			  ps.setInt(6, doorlock);
			  ps.setInt(7, sefty);
			  ps.setInt(8, cooler);
			  
		   ps.executeUpdate();
		   pw.print("Your data has been successfully updated");
		   
		   
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
		

	}

}
