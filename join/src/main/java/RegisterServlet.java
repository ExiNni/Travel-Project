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
		// JDBC �ҷ�����
		
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
		
			//�ְ����ϴ� DB �� ����
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
			
			//ȸ������ insert 
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
			
			//���� ������ ��� ȸ�� ������ ���ǿ� ����
			//���� ��ü�� ���� Ŭ���̾�Ʈ�� �������� ������ �����͸� �����ϰ�
			//�����ϴ� �۾��� ����
			//session "mno"��� �̸����� �����͸� �����ϴ� ����
			//request : ���� Ŭ���̾�Ʈ�� ��û�� ���� ������ �����ϴ� ������ ��
			//session �̶� ? ���̳� ���ø����̼� ���¸� �����ϰ� �����͸� �����ϱ� ���� ���
			//getSession() : request���� ���� ������ ������ ��
			//setAttribute("mno", mno) : ���ǿ� �����͸� �����ϴ� �޼���
			//"mno" �����͸� �����ϰ�, "mno" ���� ���� �ش� �����ͷ� �����ǰ� ��
			//�̷��� ����� �����ʹ� �ٸ� �����̳� jsp ���������� ���� ������
	            request.getSession().setAttribute("USER_ID", USER_ID);
				request.getSession().setAttribute("USER_PW", USER_PW);
				request.getSession().setAttribute("USER_EMAIL", USER_EMAIL);
				request.getSession().setAttribute("USER_PHONE", USER_PHONE);
				request.getSession().setAttribute("USER_NAME", USER_NAME);
				request.getSession().setAttribute("USER_SEX", USER_SEX);
				request.getSession().setAttribute("USER_AGE", USER_AGE);
				request.getSession().setAttribute("USER_DATE", USER_DATE);
		
			//������ ��� �̵��� ������ �������ְ� �ٽ� ����
			response.sendRedirect("register_success.jsp");
			
		} catch (SQLException e) {
			// ������ ��� �̵��� ������ ����
			response.sendRedirect("register_error.jsp");
			e.printStackTrace();
		}
	}

}