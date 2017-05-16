<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Hello. This is not a start page :)</h1>
<div>
	<table>
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
			</tr>
		</c:forEach>
	</table>
</div>