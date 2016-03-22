<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<input type="button" value="Eleve" onclick="self.location.href='http://localhost:8080/test/Eleve/index'"/>
<input type="button" value="Professeurr" onclick="self.location.href='http://localhost:8080/test/prof/index'"/>
<input type="button" value="Admin" onclick="self.location.href='http://localhost:8080/test/admin/index'"/>

<c:forEach items="${listProf}"  var="p" > 

<p> ${p.nom} <p/> 

</c:forEach>

</body>
</html>
