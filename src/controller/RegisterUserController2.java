package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterUserController2")
public class RegisterUserController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterUserController2() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/vne_baitap/register2.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher rd = request.getRequestDispatcher("/vne_baitap/register2.jsp");
		RequestDispatcher rd1 = request.getRequestDispatcher("/vne_baitap/index2.jsp");

		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		String address = request.getParameter("address");
		boolean check = false;
		if (name == null || name.length() == 0) {
			request.setAttribute("check", "vui lòng nhập tên ");
		} else if (pass == null || pass.length() == 0) {
			request.setAttribute("check", "vui lòng nhập password ");
		} else if (repass == null || repass.length() == 0) {
			request.setAttribute("check", "vui lòng nhập lại password trên");
		} else if (address == null || address.length() == 0) {
			request.setAttribute("check", "vui lòng nhập địa chỉ ");
		} else {
			if (pass.equals(repass)) {
				if (pass.matches("^VNE.*")) {
					check = true;
				} else {
					request.setAttribute("check", "password không đúng định dạng (VNE*****)");
				}
			} else {
				request.setAttribute("check", "password nhập lại không đúng");
			}

		}

		request.setAttribute("name", name);
		request.setAttribute("pass", pass);
		request.setAttribute("repass", repass);
		request.setAttribute("address", address);
		if (check) {
			rd1.forward(request, response);
		} else
			rd.forward(request, response);
	}

}
