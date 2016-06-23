<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<script type="text/javascript" src="extends/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="extends/json3.min.js"></script>
<html>
<body>
<h2>Hello World!</h2>
<div id="test">
<div>
</body>
</html>
	<script type="text/javascript">
		$(document).ready(function() {
			s();
		});	
		function s(){
			$.ajax({
				  type: 'POST',
				  url: 'rest/system/event/allEvent/',
				  data:JSON3.stringify({
						id:"1"
					}),
				  success: function(result){
					  debugger;
					  list =result.data;
					  $("#test").html(JSON3.stringify(result.data))
					  alert(result)
				  },
				  dataType: "json",
				  contentType:"application/json"
			});
		}
	</script>
