# 일본 여행 계획 사이트 떠나조 

<p align="center">
  <br>
  <img src="https://github.com/ExiNni/semi_EJ/blob/master/%EB%96%A0%EB%82%98%EC%A1%B0%20%EB%A9%94%EC%9D%B8.PNG">
  <br>
</p>

## 0. 목차
1. 프로젝트 소개
2. 기술 스택
3. 구현 기능
4. 피드백



## 1. 프로젝트 소개

<p align="justify">
프로젝트를 만들게 된 개요나 동기를 작성해주세요.
</p>
<br>

## 2. 기술 스택

### 개발언어
<div style="width: 200px; height: 100px;">
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white" width="180" height="80"> 
  <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white" width="180" height="80">
  <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white" width="180" height="80">
  <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" width="180" height="80"> 
  <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white" width="180" height="80">
</div>

<br>

### 데이터베이스
<div style="width: 200px; height: 100px;">
  <img src="https://img.shields.io/badge/oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white" width="180" height="80">
</div>
<br>

### 개발 도구
<div style="width: 200px; height: 100px;">
  <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white" width="180" height="80">
  <img src="https://img.shields.io/badge/VS_CODE-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" width="180" height="80">
</div>
<br>

### 서버
<div style="width: 200px; height: 100px;">
  <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white" width="180" height="80">
</div>
<br>

### 협업 툴
<div style="width: 200px; height: 100px;">
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white" width="180" height="80">
  <img src="https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=slack&logoColor=white" width="180" height="80">
</div>
<br>

## 3. 구현 기능

### 기능 1. 로그인 및 회원가입
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EB%A1%9C%EA%B7%B8%EC%9D%B82.PNG">
<p align="justify">
로그인 페이지
</p>
<br>

### 기능 2. 마이페이지
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EB%A7%88%EC%9D%B4%ED%8E%98%EC%9D%B4%EC%A7%80.png">
<p align="justify">
로그인을 하면 마이페이지로 이동이 가능하며 로그인을 하지 않은 경우 로그인페이지로 연결됩니다. <br><br><br>
마이페이지에서는 회원정보 수정, 비밀번호 변경, 내가 쓴 게시글, 회원 탈퇴가 가능합니다.<br><br><br>
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%20%EB%B3%80%EA%B2%BD.png"><br>
비밀번호 변경의 경우 입력한 비밀번호와 현재 로그인한 계정의 비밀번호가 일치하면 비밀번호 변경 페이지로 이동이 가능합니다.<br><br><br>
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%20%EB%B3%80%EA%B2%BD2.png"><br>
변경할 비밀번호와 재입력한 비밀번호가 일치하면 비밀번호 변경이 완료됩니.<br><br><br>
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%20%EB%B3%80%EA%B2%BD3.png"><br>
alert 창으로 비밀번호가 변경이 되었다는 것을 알려준 후 다시 마이페이지로 이동하게 됩니다.<br><br><br>
</p>
<br>

### 기능 3. 게시판
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EC%9E%90%EC%9C%A0%EA%B2%8C%EC%8B%9C%ED%8C%902.png"><br>
로그인 한 유저만 게시판을 이용할 수 있습니다.<br>
작성자 아이디는 현재 로그인한 유저의 아이디를 가져오게 설정했습니다.<br>
제목과 내용을 작성한 후 라디오 버튼을 클릭하여 도시와 카테고리를 설정할 수 있습니다. <br>
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EC%9E%90%EC%9C%A0%EA%B2%8C%EC%8B%9C%ED%8C%903.png"><br>
작성한 게시글을 저장하면 자유게시판에 올라와있는 모습입니다. <br>
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EC%9E%90%EC%9C%A0%EA%B2%8C%EC%8B%9C%ED%8C%904.png"><br>
게시글 작성자와 현재 로그인한 유저의 아이디가 일치하면 글을 수정 및 삭제할 수 있습니다. <br>
<img src="https://github.com/ExiNni/Travel-Project/blob/master/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EC%9E%90%EC%9C%A0%EA%B2%8C%EC%8B%9C%ED%8C%905.png"><br>
작성자가 아니라면 수정하기 버튼과 삭제하기 버튼은 보이지 않습니다.


### 기능 4
<img src="">
<p align="justify">
설명란
</p>
<br>

## 4. 피드백

<p align="justify">
4-1. 좋았던 점

4-2. 아쉬웠던 점

</p>

<br>
