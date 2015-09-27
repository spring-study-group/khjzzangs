<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script> <!-- 제이쿼리 등록 -->
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script> <!-- 제이쿼리 ui 등록 -->
  <link rel="stylesheet" href="/resources/demos/style.css">
	<title>Home</title>
	<script>

  $(function() {
    $( "#datepicker" ).datepicker({
      changeMonth: true,
      changeYear: true
    });
  });

  function add(){
	   console.log($("#datepicker").val());
  }
  
  </script>


	
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<input type="date" name="user" id="datepicker">
<button type="button" onclick="add()"></button>
</body>
</html>