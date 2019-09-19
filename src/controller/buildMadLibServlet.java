package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLib;

/**
 * Servlet implementation class buildMadLibServlet
 */
@WebServlet("/buildMadLibServlet")
public class buildMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buildMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String characterName = request.getParameter("characterName");
		String bodyPart = request.getParameter("bodyPart");
		String liquid = request.getParameter("liquid");
		String substance = request.getParameter("substance");
		
		MadLib userMadLib = new MadLib();
		
		//String authorFirstName = userMadLib.getTempFirstName();
		//String authorLastName = userMadLib.getTempLastName();
		
		String authorFirstName = request.getParameter("authorFirstName");
		String authorLastName = request.getParameter("authorLastName");
		
		userMadLib.setFirstName(authorFirstName);
		userMadLib.setLastName(authorLastName);
		userMadLib.setCharacterName(characterName);
		userMadLib.setBodyPart(bodyPart);
		userMadLib.setLiquid(liquid);
		userMadLib.setSubstance(substance);
		
		request.setAttribute("userMadLib", userMadLib);
		
		request.getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		
	}

}
