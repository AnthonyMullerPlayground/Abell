package anthony.muller.celestia.abell.web;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * The Startup Servlet loads intitial data and provides some additional basic
 * services.
 */
public class StartupServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static EntityManagerFactory emf;

	@Override
	public void init() throws ServletException {
		try {
			//emf = JpaEntityManagerFactory.getEntityManagerFactory();
//			DataLoader loader = new DataLoader(emf);
//			loader.loadData();
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	/*
	 * Closes the JPA entity manager factory.
	 */
	@Override
	public void destroy() {
		emf.close();
	}

}
