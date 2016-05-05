package driver;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.Artist;
import Model.Movie;

//import edu.mum.hw2.domain.Artist;
//import edu.mum.hw2.domain.Movie;

public class Application {

	private static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}



	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("initally");	
		addMovies();
		System.out.println("finally");
		sessionFactory.close();
	}
	
	private static void addMovies() {
		
	}


}
