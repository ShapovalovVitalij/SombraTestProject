<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Sorted Page</h1>
<div>
	<table>
		<tr>
			<td>MovieId</td>
			<td>RatingDate</td>
		</tr>
		<c:forEach var="rat" items="${ratings}">
			<tr>
				<td>${rat.movie.id}</td>
				<td>${rat.ratingDate}</td>
			</tr>
		</c:forEach>
	</table>
</div>