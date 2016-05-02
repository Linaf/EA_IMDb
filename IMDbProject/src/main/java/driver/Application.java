package driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import edu.mum.hw2.domain.Artist;
//import edu.mum.hw2.domain.Movie;

public class Application {

	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("finally");

		
		//printMoviesReport();
		emf.close();
	}

}
