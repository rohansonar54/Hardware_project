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
 * Servlet implementation class signuphandler
 */
@WebServlet("/signuphandler")
public class signuphandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signuphandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  PrintWriter pw=response.getWriter();
		  
		  String uname=request.getParameter("uname");
		  String upass=request.getParameter("upass");
		  String cpass=request.getParameter("cpass");
		  String sname=request.getParameter("sname");
		 
	
		  int spno = Integer.parseInt(request.getParameter("spno"));
		 
		  String smail=request.getParameter("smail");
		 
		  
		  int hammer = Integer.parseInt(request.getParameter("hammer"));
		  int wood = Integer.parseInt(request.getParameter("wood"));
		  int axe = Integer.parseInt(request.getParameter("axe"));
		  int grasscutter = Integer.parseInt(request.getParameter("grasscutter"));
		  int pipe = Integer.parseInt(request.getParameter("pipe"));
		  int doorlock = Integer.parseInt(request.getParameter("doorlock"));
		  int sefty = Integer.parseInt(request.getParameter("sefty"));
		  int cooler = Integer.parseInt(request.getParameter("cooler"));
		try 
		  {
			  
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS_project","root","1qaz2wsx");
			  
			  PreparedStatement ps=con.prepareStatement("insert into adminlogin(uname,upass,cpass,sname,spno,smail,hammer,wood,axe,grasscutter,pipe,doorlock,sefty,cooler) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			  ps.setString(1, uname);
			  ps.setString(2, upass);
			  ps.setString(3, cpass);
			  ps.setString(4, sname);
			  ps.setInt(5, spno);
			  ps.setString(6, smail);
			  ps.setInt(7, hammer);
			  ps.setInt(8, wood);
			  ps.setInt(9, axe);
			  ps.setInt(10, grasscutter);
			  ps.setInt(11, pipe);
			  ps.setInt(12, doorlock);
			  ps.setInt(13, sefty);
			  ps.setInt(14, cooler);
			  
			  ps.executeUpdate();
				
				pw.print("Data Successfully inserted");
				
				pw.print("<br><a href='login.jsp'><input type='button' value='login page'></a>");
				  
				
				con.close();
				
				
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	}

}
