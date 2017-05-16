<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Details about Ratings</h1>
<div>
	<table>
		<tr>
			<td>id</td>
			<td>UserName</td>
			<td>MovieTitle</td>
			<td>Rating</td>
			<td>RatingDate</td>
		</tr>
		<c:forEach var="rat" items="${ratings}">
			<tr>
				<td>${rat.id}</td>
				<td>${rat.user.name}</td>
				<td>${rat.movie.title}</td>
				<td>${rat.rating}</td>
				<td>${rat.ratingDate}</td>

			</tr>
		</c:forEach>
	</table>
</div>