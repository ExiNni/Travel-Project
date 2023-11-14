import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JDBC 불러오기
		
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String jdbcUsername = "project1";
		String jdbcPassword = "123456";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		
			//넣고자하는 DB 값 설정
			/*
			 * CREATE TABLE MemberInfo (
				    MNO INT PRIMARY KEY,
				    MName VARCHAR(50),
				    MEmail VARCHAR(100),
				    MBirth  DATE
			);*/
			String USER_ID = request.getParameter("USER_ID");
			String USER_PW = request.getParameter("USER_PW");
			String USER_EMAIL = request.getParameter("USER_EMAIL");
			String USER_PHONE = request.getParameter("USER_PHONE");
			String USER_NAME = request.getParameter("USER_NAME");
			String USER_SEX = request.getParameter("USER_SEX");
			String USER_AGE = request.getParameter("USER_AGE");
			String USER_DATE = request.getParameter("USER_DATE");
			
			//회원가입 insert 
			String sql = "INSERT INTO USER_INFO (USER_ID, USER_PW, USER_EMAIL, USER_PHONE, USER_NAME, USER_SEX, USER_AGE, USER_DATE) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, USER_ID);
			preparedStatement.setString(2, USER_PW);
			preparedStatement.setString(3, USER_EMAIL);
			preparedStatement.setString(4, USER_PHONE);
			preparedStatement.setString(5, USER_NAME);
			preparedStatement.setString(6, USER_SEX);
			preparedStatement.setDate(7, java.sql.Date.valueOf(USER_AGE));
			preparedStatement.setDate(8, java.sql.Date.valueOf(USER_DATE));

	            preparedStatement.executeUpdate();
			
			//가입 성공할 경우 회원 정보를 세션에 저장
			//세션 객체를 통해 클라이언트와 서버간에 전송할 데이터를 저장하고
			//공유하는 작업을 수행
			//session "mno"라는 이름으로 데이터를 저장하는 역할
			//request : 현재 클라이언트의 요청에 대한 정보를 제공하는 역할을 함
			//session 이란 ? 웹이나 애플리케이션 상태를 유지하고 데이터를 저장하기 위해 사용
			//getSession() : request에서 현재 세션을 가지고 옴
			//setAttribute("mno", mno) : 세션에 데이터를 저장하는 메서드
			//"mno" 데이터를 저장하고, "mno" 변수 값이 해당 데이터로 설정되게 함
			//이렇게 저장된 데이터는 다른 서블릿이나 jsp 페이지에서 접근 가능함
	            request.getSession().setAttribute("USER_ID", USER_ID);
				request.getSession().setAttribute("USER_PW", USER_PW);
				request.getSession().setAttribute("USER_EMAIL", USER_EMAIL);
				request.getSession().setAttribute("USER_PHONE", USER_PHONE);
				request.getSession().setAttribute("USER_NAME", USER_NAME);
				request.getSession().setAttribute("USER_SEX", USER_SEX);
				request.getSession().setAttribute("USER_AGE", USER_AGE);
				request.getSession().setAttribute("USER_DATE", USER_DATE);
		
			//성공할 경우 이동할 페이지 설정해주고 다시 전송
			response.sendRedirect("register_success.jsp");
			
		} catch (SQLException e) {
			// 실패할 경우 이동할 페이지 설정
			response.sendRedirect("register_error.jsp");
			e.printStackTrace();
		}
	}

}