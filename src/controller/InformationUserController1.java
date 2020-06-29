package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InformationUserController
 */
@WebServlet("/InformationUserController1")
public class InformationUserController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InformationUserController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		String repassword = request.getParameter("repass");
		String adress = request.getParameter("address");
		
		request.setAttribute("name", username);
		request.setAttribute("pass", password);
		request.setAttribute("repass", repassword);
		request.setAttribute("adress",adress);
		
		RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/index1.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
