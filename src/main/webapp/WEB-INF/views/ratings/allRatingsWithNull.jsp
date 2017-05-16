<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Null Rating Date Page</h1>
<div>
	<table>
		<tr>
			<td>id</td>
			<td>UserName</td>
			<td>RatingDate</td>
		</tr>
		<c:forEach var="rat" items="${ratings}">
			<tr>
				<td>${rat.id}</td>
				<td>${rat.user.name}</td>
				<td>${rat.ratingDate}</td>
				<td><a
					href="${pageContext.request.contextPath}/task1/${rat.id}"> Set
						to today's date</a></td>

			</tr>

		</c:forEach>
	</table>
</div>