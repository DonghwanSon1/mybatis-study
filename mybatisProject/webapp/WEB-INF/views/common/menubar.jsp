<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴바 페이지</title>
<style>
	.login-area a{
		text-decoration: none;
		color:black;
		font-size: 12px;
	}
	.nav-area {
		background-color: tomato;
		color: white;
		height: 30px;
	}
	.menu{
		display: table-cell;
		width: 250px;
		height: 30px;
		vertical-align: center;
		font-size: 20px;
		font-weight: bold;
	}
	.menu:hover{
		cursor:pointer;
		background-color: rgb(235, 81, 54);
	}
	.outer{
		width: 900px;
		background-color: tomato;
		color: white;
		margin: auto;
		margin-left:auto;
		margin-right: auto;
		margin-top: 20px;
	}
	h1, h2{
		color: tomato;
	}



</style>
</head>
<body>

	<h1 align="center">무한한 공간 저너머로</h1>
	<h2 align="center">(김정길씨 아이디어)</h2>
	<br>

	<div class="login-area" align="right">
		<c:choose>
			<c:when test="${ empty loginUser }" >
				
				<!-- case1. 로그인 전 -->
				<form action="login.me" method="post">
					<table>
						<tr>
							<td>아이디</td>
							<td><input type="text" name="userId" required></td>
							<td rowspan="2"><button type="submit" style="height: 50px;">로그인</button></td>
						</tr>
						<tr>
							<td>비밀번호</td>
							<td><input type="password" name="userPwd" required></td>
							<td></td>
						</tr>
						<tr>
							<td colspan="3" align="center">
								<a href="enrollForm.me">회원가입</a>
								<a href="">ID/PW찾기</a>
							</td>
						</tr>
					</table>
				</form>
			</c:when>
			<c:otherwise>
				<!-- case2. 로그인 후 -->
				<div>
					<table>
						<tr>
							<td colspan="2">
								<h3>${ sessionScope.loginUser.userName }님 환영합니다.</h3>
							</td>
						</tr>
						<tr>
							<td><a href="">마이페이지</a></td>
							<td><a href="">로그아웃</a></td>
						</tr>
					</table>
				</div>
			</c:otherwise>	
		</c:choose>
		
	</div>

	<br>
	
	<div class="nav-area" align="center">
		<div class="menu">HOME</div>
		<div class="menu">공지사항</div>
		<div class="menu" onclick="location.href='list.bo?currentPage=1'">게시판</div>
		<div class="menu">ETC</div>
	</div>










</body>
</html>