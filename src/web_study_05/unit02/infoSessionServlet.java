package web_study_05.unit02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/infoSessionServlet")
public class infoSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		result(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		result(request, response);
	}
	
	private void result(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String id_str = session.getId();
		long lasttime =  session.getLastAccessedTime();
		long createdtime = session.getCreationTime();
		long time_used =  (lasttime-createdtime)/60000;
		int inactive =  session.getMaxInactiveInterval()/60;
		boolean b_new =  session.isNew();
		
		session.setAttribute("id_str", id_str);
		session.setAttribute("lasttime", lasttime);
		session.setAttribute("createdtime", createdtime);
		session.setAttribute("time_used", time_used);
		session.setAttribute("inactive", inactive);
		session.setAttribute("b_new", b_new);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("07_infoSession.jsp");
		dispatcher.forward(request, response);
	
	}

}
