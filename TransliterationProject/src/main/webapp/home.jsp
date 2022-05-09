<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Converter</title>
<script src="/webjars/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/ajax.js"></script>
<style>
footer {
	font-size: 20px;
	margin-bottom: 80px;
}

h2 {
	text-align: left;
	opacity: 0.9;
	letter-spacing: 5px;
	margin-top: 90px;
	margin-left:165px;
	text-decoration: underline;
}

div {
	margin-top: 80px;
	opacity: 0.8;
}

body {
	text-align: center;
	background:
		url('/resources/project.jpg');
	background-size: cover;
	color: white;
}

button {
	margin-top: 60px;
	margin-right: 90px;
	margin-left: 90px;
	border: none;
	color: black;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	border-radius: 12px;
	opacity: 0.9;
}

img {
	margin: 40px 0px 0px 0px;
	border: 7px solid white;
	border-radius: 20px;
}

@media ( max-width : 500px) {
	h1 {
		font-size: 36px;
		padding: 5px;
	}
}
</style>
</head>
<body>
	<h2>Transliterator</h2>
	<div>
		<textarea name="message" rows="15" cols="70" id="hindi" placeholder="Enter in Hindi...">
</textarea>
		<textarea name="message" rows="15" cols="70" id="english" placeholder="Result">
</textarea>
	</div>
	<button type="button" id="convert">Convert</button>
	<button type="button" id="clear">Reset</button>

</html>