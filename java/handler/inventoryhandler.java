package handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inventoryhandler
 */
@WebServlet("/inventoryhandler")
public class inventoryhandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inventoryhandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter ob = response.getWriter();
		
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS_project","root","1qaz2wsx");
	
		Statement  st=con.createStatement();
		
//		ResultSet rs=st.executeQuery("select *from adminlogin");
//				
//		ob.print("<html><body><table border='1' style:padding='20px'><tr><td>UNAME</td><td>SNAME</td><td>SPNO</td><td>SMAIL</td></tr>");
//		while(rs.next()) {
//			
//			ob.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getInt(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
//			 
//		}
//		ob.print("</table></body></html>");
//		
	
		ob.print("invetory as below");
		
		ob.print("<html><body><table border='1' style:padding='20px'><tr><tr><td>HAMMER</td><td>WOOD</td><td>AXE</td><td>GRASSCUTTER</td><td>PIPE</td><td>DOORLOCK</td><td>SEFTY</td><td>COOLER</td></tr>");

		ResultSet rs2=st.executeQuery("select *from adminlogin");	
		
		while(rs2.next()) 
		{	
			ob.print("<tr><td>"+rs2.getInt(7)+"</td><td>"+rs2.getInt(8)+"</td><td>"+rs2.getInt(9)+"</td><td>"+rs2.getInt(10)+"</td><td>"+rs2.getInt(11)+"</td><td>"+rs2.getInt(12)+"</td><td>"+rs2.getInt(13)+"</td><td>"+rs2.getInt(14)+"</td></tr>");		 
		}
		ob.print("</table></body></html>");
		
		
		ob.print("sucess");
		con.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}

}
