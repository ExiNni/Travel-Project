<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<form action="RegisterServlet" method="post">
		<p>
			<label for="USER_NAME">이름</label> <input type="text" name="USER_NAME"
				id="USER_NAME" required> <br>
		</p>

		<p>
			<label for="USER_ID">아이디</label> <input type="text" name="USER_ID"
				id="USER_ID" required> <span class="err_id">*
				4~12글자까지만 입력 가능합니다.</span><br>
		</p>

		<p>
			<!--input 타입을 텍스트에서 패스워드로 변경-->
			<label for="USER_PW">비밀번호</label> <input type="password"
				name="USER_PW" id="USER_PW" required> <br> <span
				class="err_pwd">* 4~12글자까지만 입력 가능합니다.</span>
		</p>



		<p>
			<label for="USER_AGE">생년월일:</label> <input type="date" id="USER_AGE"
				name="USER_AGE"><br>
		</p>

		<p>
			<label for="USER_SEX">성별:</label> <input type="text" id="USER_SEX"
				name="USER_SEX"><br>
		</p>



		<p>
			<label for="USER_EMAIL">이메일:</label> <input type="email"
				id="USER_EMAIL" name="USER_EMAIL" required><br>
		</p>

		<p>
			<label for="USER_PHONE">전화번호</label> <input type="text"
				name="USER_PHONE" id="USER_PHONE"> <br> <span
				class="err_mobile">* '-'없이 숫자만 입력</span>
		</p>

		<p>
			<label for="USER_DATE">가입날짜: </label> <input type="date"
				id="USER_DATE" name="USER_DATE"><br>
		</p>

		<p>
			<button type="button" class="btn">이전으로</button>
			<input type="submit" value="가입">
		</p>

	</form>

</body>
</html>

