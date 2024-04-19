

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ValidateServlet
 */
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uName = request.getParameter("username");
		String pass = request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.print("<body>");
		
		if ("dhruv".equals(uName) && "partner".equals(pass)) {
		    pw.print("<h1>Welcome back"  + uName);
		} else {
		    pw.print("Access Denied");
		}

		
		pw.println("</body>");
		pw.println("</html>");
	}

}
