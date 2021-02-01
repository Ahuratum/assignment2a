package assignment;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
//		System.out.println("Inside of the init method");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
//		System.out.println("Inside of the destroy method");
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String firstName = request.getParameter("fname");
		 String LastName = request.getParameter("lname");
	 
		 request.setAttribute("fname", firstName);
		 request.setAttribute("lname", LastName);
	 
		 request.getRequestDispatcher("TestResponse.jsp").forward(request, response);
		 
//		init();
//		System.out.println("Inside of the doGet method");
//		destroy();
		
//		 response.getWriter().append("Name: " + firstName + " " + LastName);
//		 
//		 response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		if(firstName != null && !firstName.isEmpty()) {
			if(lastName != null && !lastName.isEmpty()) {
				doGet(request, response);
			}
		}
		request.getRequestDispatcher("TestError.jsp").forward(request, response);;
	}
}
