package signin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.openjava.signin.dto.UserInfo;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");//한글 깨질경우 인코딩처리
		response.setContentType("text/html;charset=UTF=8");//한글 깨질경우 인코딩처리
		response.setContentType("text/html");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userid=request.getParameter("id");
		String password=request.getParameter("pw");
		String checkid="arduino";
		String checkpw="ard1234";
		userid=(userid==null)?"": userid;
		
		RequestDispatcher dispatcher;
		if(checkid.equals(userid)) {
		
			if(checkpw.equals(password)) {
			dispatcher = request.getRequestDispatcher("main.jsp");
			UserInfo user= new UserInfo("고종현","서울","arduino","ard1234");
			request.setAttribute("user",user);
			
			List<UserInfo> userList = new ArrayList<UserInfo>();
			user= new UserInfo("고종현","서울","arduino","ard1234");
			userList.add(user);
			user= new UserInfo("표재원","외계","fuck","shit6974");
			userList.add(user);
			user= new UserInfo("이금","부산","arduino","ard1234");
			userList.add(user);
			user= new UserInfo("권상훈","화성","arduino","ard1234");
			userList.add(user);
			user= new UserInfo("오청유","제주도","arduino","ard1234");
			userList.add(user);
			request.setAttribute("userList",userList);
			
			
			
			}
			else {
				dispatcher = request.getRequestDispatcher("passwordNotMatch.jsp");
				
				
			}
		}
			else {
				dispatcher = request.getRequestDispatcher("idNotFound.jsp");
				
				
			}
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
