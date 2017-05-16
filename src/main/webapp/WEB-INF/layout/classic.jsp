<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
</head>
<body>

	<header>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="navigation" />
	</header>

	<div>
		<tiles:insertAttribute name="body" />
	</div>

	<footer>
		<tiles:insertAttribute name="footer" />
	</footer>

</body>
</html>