package web_study_05.unit01;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionServlet")
public class getSetSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/*
	 * <% String id = (String) session.getAttribute("id"); String pwd = (String)
	 * session.getAttribute("pwd"); Integer age = (Integer)
	 * session.getAttribute("age"); %>
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		result(request, response);
	}
	
	private void result(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id"); 
		String pwd = (String) session.getAttribute("pwd"); 
		Integer age = (Integer) session.getAttribute("age"); 
	
		
		session.setAttribute("id", id);
		session.setAttribute("pwd", pwd);
		session.setAttribute("age", age);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("04_getSession.jsp");
		dispatcher.forward(request, response);
		
	
	}
	

}
