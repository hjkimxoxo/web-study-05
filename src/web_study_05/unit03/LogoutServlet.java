package web_study_05.unit03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		result(request, response);
	}
	
	private void result(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException {
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("logout");
		HttpSession session = request.getSession();
		//session.invalidate();
		response.sendRedirect("10_logout.jsp");
		
		
		
		if(request.isRequestedSessionIdValid()==true){
			System.out.println("유효합니다");
		}else{
			System.out.println("유효ㄴㄴ");
		}
	}


}
