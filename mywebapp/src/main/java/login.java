import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class login extends HttpServlet 
{
	private static final long serialVersionUID = 1L;   
    public login() 
    {
    super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	Userinfo ui=new Userinfo();
	ui.setUserid((String)request.getParameter("username"));
	ui.setUsername((String)request.getParameter("password"));
	
	//File f = new File("C:hibernate.cfg.xml");
//	sessions = new Configuration().configure(f).buildSessionFactory(); 
	
    SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
	
    Session session=sessionfactory.openSession();
    session.beginTransaction();
    session.save(ui);
    session.getTransaction().commit();
    
	/*System.out.println(username1);
	System.out.println(password1);
		
	System.out.println("try");
	System.out.println("testee");
	System.out.println("chnages");*/
	response.getWriter().append("Served at: ").append(request.getContextPath());
	//RequestDispatcher rd1=request.getRequestDispatcher("guesterror.jsp");
	//rd1.forward(request, response);
	}
}
