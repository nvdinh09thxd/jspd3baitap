package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterUserController1")
public class RegisterUserController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterUserController1() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();

		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		String repassword = request.getParameter("repass");
		String adress = request.getParameter("address");
		String notification = "";
		if ("".equals(username) || "".equals(password) || "".equals(repassword) || "".equals(adress)) {
			notification = "Không được để trống";
			request.setAttribute("notification", notification);
			RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register1.jsp");
			rd.forward(request, response);
			return;
		} else if (password.length() > 0) {
			if ((password.charAt(0) != 'V' && password.charAt(1) != 'N' && password.charAt(2) != 'E')) {
				notification = "Nhập lại password có kí tự VNE bắt đầu";
				request.setAttribute("notification", notification);
				RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register1.jsp");
				rd.forward(request, response);
				return;
			}
			if (!(password.equals(repassword))) {
				notification = "Mật khẩu không khớp";
				request.setAttribute("notification", notification);
				RequestDispatcher rd = request.getRequestDispatcher("vne_baitap/register1.jsp");
				rd.forward(request, response);
				return;
			}
			InformationUserController1 iuc = new InformationUserController1();
			iuc.doGet(request, response);
		}

	}

}
