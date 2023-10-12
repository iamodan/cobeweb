<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	board list test

	<%-- 임시로 화면만 뿌리기 위함 --%>
	<c:forEach var="board" items="${list }">
		<li>번호 : ${board.bno }, 작성자 : ${board.writer },  작성일 : ${board.regdate }</li>
	</c:forEach> 
	<%-- 완료  커밋 하면 끝이요 --%>
</body>
</html>