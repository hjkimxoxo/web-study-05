package web_study_05.unit03;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result(request, response);
		
	}
	
	private void result(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String id= "pinksung";
		String pw="1234";
		String name="성윤정";
		
		session.setAttribute("id", "pinksung");
		session.setAttribute("pwd", "1234");
		session.setAttribute("name", "성윤정");
		
		if(id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pw")) ){
			session.setAttribute("loginUser", name);
			response.sendRedirect("10_main.jsp"); 
			
			
		}else {
			response.sendRedirect("10_loginForm.jsp");
		}
		
	
		
		
	}


}
