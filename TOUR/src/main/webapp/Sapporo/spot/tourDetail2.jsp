<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.kh.mainPage.mainPage" %>
<%@ page import="com.kh.mainPage.mainPageDAO" %>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style>
        * {
            padding: 0;
            margin-top: 10px;
            text-align: center;
        
        }
        
        html {
        
        	overflow: scroll;
        }

        .detail {
            margin-top: 50px;
            font-size: 30px;
        }

        .image-container {
            margin-top: 50px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 500px;
        }

        img {
            max-width: 100%; /* Adjust this if needed */
            max-height: 500px;
            border-radius: 20px;
            display: none;
            filter: drop-shadow(10px 6px 6px #c3c3c3);
        }
        
        h2 {
        	margin-top: 150px;
        	font-size: 60px;
        	filter: drop-shadow(10px 6px 6px #ffc0cb); 
        	color: #ffc0cb;
        	
        }
    </style>
    <script>
        var currentIndex = 0;

        function showImage(index) {
            var images = document.getElementsByClassName("tour-image");
            for (var i = 0; i < images.length; i++) {
                images[i].style.display = "none";
            }

            images[index].style.display = "block";
            currentIndex = index;

            setTimeout(function() {
                var nextIndex = (currentIndex + 1) % images.length;
                showImage(nextIndex);
            }, 3000);
        }

        window.onload = function() {
            showImage(currentIndex);
        };
    </script>
</head>
<body>

    

    <%
        mainPage tour = null;

        String tourIdParam = request.getParameter("tourId");
        int pageNumber = (request.getParameter("pageNumber") != null) ? Integer.parseInt(request.getParameter("pageNumber")) : 1;
        int imagesPerPage = 3; 

        if (tourIdParam != null) {

            int tourId = Integer.parseInt(tourIdParam);
            mainPageDAO tDAO2 = new mainPageDAO();
            tour = tDAO2.getTourById(tourId);
       %>     
		
			<h2><i class="fa-solid fa-plane"></i><%=tour.getTour_name()%> 관광지 상세정보</h2>

		<% 
            String[] odoriParkImages = null;

            if (tour.getTour_name().equals("오도리공원")) {
                odoriParkImages = new String[]{"1.jpg", "7.jpg", "8.jpg"}; 
            } else if (tour.getTour_name().equals("오타루운하")) {
                odoriParkImages = new String[]{"4.jpg", "5.jpg", "6.jpg"}; 
            } else if (tour.getTour_name().equals("시로이코이비토 파크")) {
                odoriParkImages = new String[]{"7_1.jpg", "7_2.jpg", "7_3.jpg"}; 
            } else if (tour.getTour_name().equals("다누키코지 상점가")) {
                odoriParkImages = new String[]{"5_1.jpg", "5_2.jpg", "5_3.jpg"}; 
            } else if (tour.getTour_name().equals("조잔케이 온천")) {
                odoriParkImages = new String[]{"1_1.jpg", "1_2.jpg", "1_3.jpg"}; 
            } else if (tour.getTour_name().equals("홋카이도 신궁")) {
                odoriParkImages = new String[]{"6_1.jpg", "6_2.jpg", "6_3.jpg"}; 
            }

            int startIndex = (pageNumber - 1) * imagesPerPage;
            int endIndex = Math.min(startIndex + imagesPerPage, odoriParkImages.length);

            %>

            <div class="detail">

                <div class="image-container">
                    <%
                        for (int i = startIndex; i < endIndex; i++) {
                            String imageName = odoriParkImages[i];
                    %>
                            <img class="tour-image" src="<%= imageName %>">
                    <%
                        }
                    %>
                </div>

                <p>관광지 이름 : <%= tour.getTour_name() %></p>
                <p>관광지 위치: <%= tour.getTour_location() %></p>
                <p>전화번호: <%= tour.getTour_phone() %></p>
                <p>운영시간 : <%= tour.getTour_time() %></p>
                
              

			
                <%
            } else {
                %>
                <p>여행지를 찾을 수 없습니다...</p>
                <%
            }
            %>

        </div>
        
        
        
        
	
    </body>
    </html>
