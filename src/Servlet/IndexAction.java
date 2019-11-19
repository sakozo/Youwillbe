package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/IndexAction")
public class IndexAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//パラメータの名前を取得
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");

		//名前をセッションに保存
		HttpSession session = request.getSession();
		session.setAttribute("name", name);

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/TimeAction");
		dispatcher.forward(request, response);
	}

}
