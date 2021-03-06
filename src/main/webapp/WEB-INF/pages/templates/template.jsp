<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Todo Manager</title>
		
		<script src="/TodoManager/resources/3rdparty/handlebars/handlebars-v4.0.11.js"></script>
		<script src="/TodoManager/resources/js/constants.js"></script>
		<script src="/TodoManager/resources/3rdparty/moment/moment.min.js"></script>
		
		<link rel="stylesheet" href="/TodoManager/resources/content/css/template.css">
	</head>

	<body>
		<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
			
			<tiles:insertAttribute name="header"/>
			<tiles:insertAttribute name="menu"/>
			
			<main class="mdl-layout__content">
				<tiles:insertAttribute name="body"/>
			</main>
<%-- 			<tiles:insertAttribute name="footer"/> --%>

		</div>
	    
	    <script src="/TodoManager/resources/3rdparty/mdl/material.min.js"></script>
	    <link rel="stylesheet" href="/TodoManager/resources/3rdparty/mdl/material.min.css">
		<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
	</body>
</html>