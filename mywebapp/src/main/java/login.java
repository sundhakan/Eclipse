import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;   
    public login() 
    {
    super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String username1=(String)request.getParameter("username");
	String password1=(String)request.getParameter("password");
		
	System.out.println(username1);
	System.out.println(password1);
		
	System.out.println("try");
	System.out.println("testee");
	System.out.println("chnages");
	response.getWriter().append("Served at: ").append(request.getContextPath());
	//RequestDispatcher rd1=request.getRequestDispatcher("guesterror.jsp");
	//rd1.forward(request, response);
	}
}
