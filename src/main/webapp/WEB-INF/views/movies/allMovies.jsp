<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>All Movies</h1>
<div>
	<table>
		<c:forEach var="movie" items="${movies}">
			<tr>
				<td>${movie.id}</td>
				<td>${movie.title}</td>
				<td>${movie.director}</td>
				<td><a
					href="${pageContext.request.contextPath}/task5/${movie.id}">
						Delete </a></td>
			</tr>
		</c:forEach>
	</table>
</div>
