package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MadLib;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //MadLib userMadLib = new MadLib();

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String authorFirstName = request.getParameter("firstName");
		String authorLastName = request.getParameter("lastName");
		
		//userMadLib.setFirstName(authorFirstName);
		//userMadLib.setLastName(authorLastName);
		
		//request.setAttribute("userMadLib", userMadLib);
		
		request.setAttribute("authorFirstName", authorFirstName);
		request.setAttribute("authorLastName", authorLastName);
		
		// Thanks to Zixuan Herting for posting this helpful info on the blackboard discussion forum
		// I was having a similar issue but was struggling to ask the right question when researching
		// The HttpSession helps by storing the data in the session which makes it accessible to other
		// servlets.
		HttpSession session = request.getSession();
		session.setAttribute("authorFirstName", authorFirstName);
		session.setAttribute("authorLastName", authorLastName);
		
		request.getServletContext().getRequestDispatcher("/createMadLib.jsp").forward(request, response);
		
		// Returns null for some reason....
//		PrintWriter writer = response.getWriter();
//		writer.println(userMadLib.getFirstName() + " " + userMadLib.getLastName());
//		writer.close();
	}

}
