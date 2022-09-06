<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>

	<jsp:include page="../common/menubar.jsp"/>
	
    <div class="outer">
        <br>
        <h1 align="center" style="color:white;">회원가입 페이지</h1>

        <form action="insert.me" method="post">
            <table align="center">
                <tr>
                    <td>* ID</td>
                    <td><input name="userId" type="text" required></td>
                </tr>
                <tr>
                    <td>*PWD</td>
                    <td><input name="userPwd" type="password" required></td>
                </tr>
                <tr>
                    <td>* NAME</td>
                    <td><input type="text" name="userName" required></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;EMAIL</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;BIRTHDAY</td>
                    <td><input type="text" name="birthday" placeholder="생년월일(6자리)"></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;GENDER</td>
                    <td align="center">
                        <input type="radio" name="gender" value="M">남
                        <input type="radio" name="gender" value="F">여
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;PHONE</td>
                    <td><input type="text" name="phone" placeholder="-포함"></td>
                </tr>
                <tr>
                    <td>&nbsp;&nbsp;ADDRESS</td>
                    <td><input type="text" name="address"></td>
                </tr>
            </table>
            <br>
            <div align="center">
                <button type="reset">초기화</button쇼ㅔㄷ>
                <button type="submit">회원가입</button>
            </div>
        </form>
        <br><br>
    </div>
	
















</body>
</html>