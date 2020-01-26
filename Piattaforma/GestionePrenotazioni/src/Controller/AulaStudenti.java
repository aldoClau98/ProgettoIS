package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AulaStudenti
 */
@WebServlet("/AulaStudenti")
public class AulaStudenti extends ServletBasic {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String aula= request.getParameter("aula");
	String edificio =  request.getParameter("edificio");
	String tipoaula =  request.getParameter("tipoaula");
	
	int result;
	if(Integer.parseInt(tipoaula)==1)
		 result= struttDAO.doUpdate(aula, edificio,"0");
	else
		 result= struttDAO.doUpdate(aula, edificio,"1");

	request.setAttribute("result", result);
	
	RequestDispatcher view  =  request.getRequestDispatcher("WEB-INF/Homepage.jsp");
	view.forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
