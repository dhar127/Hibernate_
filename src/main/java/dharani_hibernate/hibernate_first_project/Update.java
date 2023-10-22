package dharani_hibernate.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dharani_hibernate.entity.song;

public class Update {
	public static void main(String[] agrs) {
	Configuration config=new Configuration();
	config.configure();
	config.addAnnotatedClass(song.class);
	SessionFactory sessionFactory=config.buildSessionFactory();
	Session session =sessionFactory.openSession();
	song s=session.get(song.class, 2);
	s.setSongname("Tum hi ho");
	s.setSinger("Arjit singh");
	session.beginTransaction();
	session.merge(s);
	session.getTransaction().commit();
	System.out.print(s);
}
}
