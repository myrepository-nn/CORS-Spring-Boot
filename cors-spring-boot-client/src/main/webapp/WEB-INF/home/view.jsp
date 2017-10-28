<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script>
   function executeQuery() {
		$.ajax({
			type: "GET",
			url : "http://localhost:8082/home/get/nishant"
		}).then(function(data, status, jqxhr) {
			$('.view-rec').append(data);
			console.log(jqxhr);
			$.ajax({
				  type: "POST",
				  url: "http://localhost:8081/home/capture",
				  data: data,
				  dataType: "text"
				});
		});
		setTimeout(executeQuery, 2000);
   }
	$(document).ready(function() {
		setInterval(executeQuery(), 2000);
	});
</script>
</head>
<body>

	<p class="view-rec">Hello View</p>
</body>
</html>