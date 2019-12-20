<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>front.jsp Hello world! ${memberCnt} => ${ username }</h1>
	
	<h3> ${ userinfo.id } </h3>
	<table>
		<thead>
			<tr>
				<th>제목</th>
				<th>내용</th>
				<th>링크</th>
				<th>아이콘</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${frontList}" var="frontinfoVO">
				<tr>
					
					<td>${frontinfoVO.front_title}</td>
					<td>${frontinfoVO.front_content}</td>
					<td>${frontinfoVO.front_link}</td>
					<td>${frontinfoVO.front_icon}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>
