<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>MoviesWithoutRatings</h1>
<div>
	<table>
		<c:forEach var="movie" items="${movies}">
			<tr>
					<c:if test="${movie.ratings.size() == 0}">
				<td>${movie.title}</td>
				</c:if>
			</tr>
		</c:forEach>
	</table>
</div>
