<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="website.css">

<style>
.main_logo {
	color: #7AB730;
	text-decoration-line: none;
	font-size: 25px;
	margin-left: 15%;
}

.main_title2 {
	color: black;
}

#dropdownBtn {
	display: inline-block;
	position: relative;
	margin-left: 60%;
}

#dropdownContent {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

#dropdownContent a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

#dropdownContent a:hover {
	background-color: #f1f1f1;
}

.mid_row1 {
	display: inline-block;
	text-decoration-line: none;
	color: #7AB730;
	font-size: 20px;
}

.mid_row2 {
	border: 1px solid #ccc;
	height: 70px;
	padding: 15px;
	text-align: center;
}

.search {
	justify-content: space-between;
	align-items: center;
	padding: 8px;
	margin-top: 5%;
	margin-bottom: 5%;
}

.info {
	margin-left: 10%;
	margin-right: 10%;
}

.category_img {
	width: 500px;
	height: 300px;
}
</style>
<body>
	<form action="LoginServlet" method="post">
        <input type="hidden" name="formAction" value="userInfoForm">
	
		<a href="mainpage.jsp" class="main_logo">
			<h1 style="display: inline-block;">
				떠나<span class="main_title2">조</span>
			</h1>
		</a> 
		<%
		String loggedIn = (String) session.getAttribute("user_id");
		%>

		<button type="button" id="dropdownBtn">
			<span>더보기</span>
			<div id="dropdownContent" style="display: none;">
				<a href="mainpage.jsp">메인페이지</a>

				<%
				if (loggedIn != null && !loggedIn.isEmpty()) {
				%>
				<a href="myPage/user-info.jsp">마이페이지</a>
				<%
				}
				%>
				<div id="citiesDropdown">
					<a href="#">도시 선택</a>
					<div id="citiesContent" style="display: none;">
						<a href="#">교토</a> <a href="#">나가사키</a> <a href="#">나고야</a> <a
							href="#">도쿄</a> <a href="#">사포로</a> <a href="#">시즈오카</a> <a
							href="#">오사카</a> <a href="#">후쿠오카</a>
					</div>
				</div>
				<%
				loggedIn = (String) session.getAttribute("user_id");

				if (loggedIn != null && !loggedIn.isEmpty()) {
				%>
				<a href="LoginServlet">로그아웃</a>
				<%
				} else {
				%>
				<a href="login.jsp">로그인</a>
				<%
				}
				%>
			
		</button>

		<div id="imageSlider">
			<a href=""><img src="./관광지/4. 도쿄 타워/4. 도쿄 타워/3.jpg" class="top10"
				alt=""></a> <a href=""><img
				src="../오사카/관광지/3. 오사카 성/3. 오사카 성/1.jpg" class="top10" alt=""></a>
			<a href=""><img src="./관광지/9. 도쿄역/9. 도쿄역/1.jpg" class="top10"
				alt=""></a> <a href=""><img
				src="../오사카/관광지/9. 도톤보리/9. 도톤보리/1.jpg" class="top10" alt=""></a> <a
				href=""><img src="../오사카/관광지/1. 유니버설/1. 유니버설/3.jpg"
				class="top10" alt=""></a>
		</div>
		<!-- Navbar End -->


		<!-- Header Start -->


		<!-- Header End -->



		<!-- Booking Start -->
		<nav id="topMenu">
			<ul>
				<li class="Menu"><a class="menuLink" href="">삿포로</a>
					<ul class="submenu">
						<li><a href="#" class="sub">관광지</a></li>
						<li><a href="#" class="sub">맛집</a></li>
						<li><a href="#" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink" href="">도쿄</a>
					<ul class="submenu">
						<li><a href="./tokyo_tour.html" class="sub">관광지</a></li>
						<li><a href="./tokyo_food.html" class="sub">맛집</a></li>
						<li><a href="./tokyo_accomodation.html" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink" href="">시즈오카</a>
					<ul class="submenu">
						<li><a href="" class="sub">관광지</a></li>
						<li><a href="" class="sub">맛집</a></li>
						<li><a href="" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink">나고야</a>
					<ul class="submenu2">
						<li><a href="" class="sub">관광지</a></li>
						<li><a href="" class="sub">맛집</a></li>
						<li><a href="" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink">교토</a>
					<ul class="submenu2">
						<li><a href="" class="sub">관광지</a></li>
						<li><a href="" class="sub">맛집</a></li>
						<li><a href="" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink">오사카</a>
					<ul class="submenu2">
						<li><a href="../오사카/osaka_tour.html" class="sub">관광지</a></li>
						<li><a href="../오사카/osaka_food.html" class="sub">맛집</a></li>
						<li><a href="../오사카/osaka_accomodation.html" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink">후쿠오카</a>
					<ul class="submenu3">
						<li><a href="" class="sub">관광지</a></li>
						<li><a href="" class="sub">맛집</a></li>
						<li><a href="" class="sub">숙박</a></li>
					</ul></li>

				<li class="Menu"><a class="menuLink">나가사키</a>
					<ul class="submenu3">
						<li><a href="" class="sub">관광지</a></li>
						<li><a href="" class="sub">맛집</a></li>
						<li><a href="" class="sub">숙박</a></li>
					</ul></li>

			</ul>
		</nav>

		<!-- Search Form -->
		<div class="search" style="text-align: center;">
			<input type="text" class="" placeholder="검색"
				style="display: inline-block;">
			<button type="button" id="searchButton">
				<span>검색</span>
			</button>
		</div>
		<!-- Booking End -->


		<!-- Blog Start -->
		<div class="container px-4 text-center">
			<div class="row gx-5">
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/1. 시즈테츠 호텔/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">시즈테츠 호텔</a>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/2. 미츠이 가든/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">미츠이 가든</a>
						</div>
					</div>
				</div>

			</div>
			<div class="row gx-5">
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/3. 도큐 스테이/정면.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">도큐 스테이</a>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/4. 마이스테이/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">마이스테이</a>
						</div>
					</div>
				</div>

			</div>
			<div class="row gx-5">
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/5. 료칸 가모가와/정면.avif" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">료칸 가모가와</a>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/6. 프로스타일 료칸/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">프로스타일 료칸</a>
						</div>
					</div>
				</div>

			</div>
			<div class="row gx-5">
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/7. 차시츠 료칸 아사쿠사/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">차치츠 료칸</a>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/8. omo5/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">omo5</a>
						</div>
					</div>
				</div>

			</div>
			<div class="row gx-5">
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/9. 베스트/외관.webp" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">베스트</a>
						</div>
					</div>
				</div>
				<div class="col">
					<div class="p-3">
						<div class="">
							<a href=""><img class="category_img"
								src="../도쿄/숙박/10. 더 게이트/외관.jpg" alt=""></a>
							<div class=""></div>
						</div>
						<div class="">
							<div class="">
								<h6>도쿄 |</h6>
							</div>
							<a class="h5 m-0 text-decoration-none" href="">더 게이트</a>
						</div>
					</div>
				</div>

			</div>

		</div>


		<script>
			var dropdownBtn = document.getElementById("dropdownBtn");
			var dropdownContent = document.getElementById("dropdownContent");

			dropdownBtn.addEventListener("click", function() {
				if (dropdownContent.style.display === "none"
						|| dropdownContent.style.display === "") {
					dropdownContent.style.display = "block";
				} else {
					dropdownContent.style.display = "none";
				}
			});

			document.addEventListener("click", function(event) {
				if (event.target !== dropdownBtn
						&& event.target !== dropdownContent) {
					dropdownContent.style.display = "none";
				}
			});

			let slideIndex = 0;
			const images = document.querySelectorAll('#imageSlider img');

			function showSlides() {
				for (let i = 0; i < images.length; i++) {
					images[i].style.display = 'none';
				}
				slideIndex++;
				if (slideIndex > images.length) {
					slideIndex = 1;
				}
				images[slideIndex - 1].style.display = 'block';
				setTimeout(showSlides, 3000); // Change image every 2 seconds (2000 milliseconds)
			}

			showSlides(); // Start the image slider
		</script>
	</form>

</body>
</html>