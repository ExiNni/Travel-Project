<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.kh.mainPage.mainPage"%>
<%@ page import="com.kh.mainPage.mainPageDAO"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>삿포로 관광지</title>
    <style>
        * {
            padding: 0px;
            margin: 0px;
        }

        h1 {
            text-align: center;
            background-color: black;
            color: white;
            padding: 50px;
        }

        img {
            width: 300px;
            height: 300px;
            border-radius: 30px;
            margin: 0 auto;
            margin-right: 15px;
            padding-top: 14px;
            padding: 10px 0px 0px 10px;
            filter: drop-shadow(10px 6px 6px #c3c3c3);
        }

        .tour-container {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(48%, 1fr));
            gap: 0.5%; /* Adjust this value to reduce the gap */
            box-sizing: border-box;
            justify-content: center;
        }

        .tour {
            position: relative;
            vertical-align: middle;
            width: 100%;
            box-sizing: border-box;
        }

        p {
            font-size: 20px;
            text-align: center;
            padding-top: 150px;
        }

        a {
            text-decoration-line: none;
        }

        .all {
            text-align: center;
        }

        .modal {
            position: absolute;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.8);
            top: 0;
            left: 0;
            display: none;
        }
    </style>
</head>
<body>
<h1>삿포로 여행정보</h1>



<div class="tour-container">
    
    <%
        mainPageDAO tDAO = new mainPageDAO();
        List<mainPage> Tour = tDAO.getAlltours();

        for (mainPage t : Tour) {
    %>

    <div class="tour">

        <p>
            <a href="tourDetail2.jsp?tourId=<%=t.getTour_id()%>"><b><%=t.getTour_id()%><%=t.getTour_name() %></b></a>
        </p>

        <div class="all">
        
        
            <%
                String imageName = "1111";
                if (t.getTour_name().equals("오도리공원")) {
                    imageName = "오도리공원.jpg";
                } else if (t.getTour_name().equals("오타루운하")) {
                    imageName = "오타루운하.jpg";
                } else if (t.getTour_name().equals("시로이코이비토 파크")) {
                    imageName = "시로이코이비토 파크.jpg";
                } else if (t.getTour_name().equals("다누키코지 상점가")) {
                    imageName = "5.jpg";
                } else if (t.getTour_name().equals("조잔케이 온천")) {
                    imageName = "1.jpg";
                } else if (t.getTour_name().equals("홋카이도 신궁")) {
                    imageName = "6.jpg";
                }
            %>
            <img src="<%=imageName%>">
        </div>
    </div>

    <div class="modal">
        <div class="modal_content">
        </div>
    </div>

    <%
        }
    %>
    
</div>
</body>
</html>
