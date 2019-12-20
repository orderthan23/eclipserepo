<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Introduce Our Team ${memberCnt} => ${ username }</h1>
	<h3> ${ userinfo.id } </h3>
	<div>We can give the best advice to you for your pet</div>
	<table border='1'>
		<thead>
			<tr>
				<th>Name</th>
				<th>Position</th>
				<th>Photo</th>
				<th>Join</th>
				<th>Exit</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${teamList}" var="Team">
				<tr>
					<td>${Team.team_name}</td>
					<td>${Team.team_position}</td>
					<td>${Team.team_pic}</td>
					<td>${Team.regdate}</td>
					<td>${Team.deldate}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>
