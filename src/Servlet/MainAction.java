package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Bexxx;
import Model.ReTimes;
import Model.Time;

@WebServlet("/MainAction")
public class MainAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		double sleep = Double.parseDouble(request.getParameter("sleep"));
		double prepare = Double.parseDouble(request.getParameter("prepare"));
		double commute = Double.parseDouble(request.getParameter("commute"));
		double work = Double.parseDouble(request.getParameter("work"));
		double eat = Double.parseDouble(request.getParameter("eat"));
		double house = Double.parseDouble(request.getParameter("house"));
		double bath = Double.parseDouble(request.getParameter("bath"));

		double sleep2 = Double.parseDouble(request.getParameter("sleep2"));
		double prepare2 = Double.parseDouble(request.getParameter("prepare2"));
		double commute2 = Double.parseDouble(request.getParameter("commute2"));
		double work2 = Double.parseDouble(request.getParameter("work2"));
		double eat2 = Double.parseDouble(request.getParameter("eat2"));
		double house2 = Double.parseDouble(request.getParameter("house2"));
		double bath2 = Double.parseDouble(request.getParameter("bath2"));

		//Timeクラスに設定
		Time time = new Time(sleep, prepare, commute, work, eat, house, bath, sleep2, prepare2, commute2, work2, eat2, house2, bath2);

		//セッションにtimeインスタンスを保存
		HttpSession session = request.getSession();
		session.setAttribute("time",time);

		//平日の1日の残り時間を計算
		double reTime = 24- (sleep+prepare+commute+work+eat+house+bath);

		//土日の残り時間
		double reTime2 = 24- (sleep2+prepare2+commute2+work2+eat2+house2+bath2);

		//一週間の総残り時間
		double totalReTime = reTime*5 + reTime2*2;

		//ReTimesインスタンスの生成とコンストラクタ呼び出しと、セッションに保存
		ReTimes reTimes = new ReTimes(reTime, reTime2, totalReTime);
		session.setAttribute("reTimes", reTimes);

		//何周かかるか計算
		ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(0,cal( totalReTime , Bexxx.getProgrammer()));
		 request.setAttribute("list", list);


		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		dispatcher.forward(request, response);
	}

	public int cal(Double totalReTime, int takeTime) {
		int result =0;
		result = (int) (takeTime/totalReTime) +1;
		return result;
	}

}
