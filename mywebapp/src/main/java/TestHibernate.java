import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {

		Userinfo ui=new Userinfo();
		ui.setUserid("username444");
		ui.setUsername("password");
		
		//File f = new File("C://hibernate.cfg.xml");
//		sessions = new Configuration().configure(f).buildSessionFactory(); 
		
	    SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		
	    Session session=sessionfactory.openSession();
	    session.beginTransaction();
	    session.save(ui);
	    session.getTransaction().commit();
		// TODO Auto-generated method stub

	}

}


