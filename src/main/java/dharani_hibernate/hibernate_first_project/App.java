package dharani_hibernate.hibernate_first_project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dharani_hibernate.entity.song;

public class App 
{
    
	public static void main( String[] args )
    
    {   
    	Configuration config=new Configuration();
    	config.configure("hibernate.cfg.xml");
    	config.addAnnotatedClass(song.class);
    	SessionFactory sessionFactory=config.buildSessionFactory();
    	Session session =sessionFactory.openSession();
    	song s1=new song();
        s1.setSongid(3);
        s1.setSongname("En kadhal solla");
        s1.setSinger("Yuvan");
        session.beginTransaction();
        session.persist(s1);
        session.getTransaction().commit();
        System.out.print("saved...");
    }
}
 