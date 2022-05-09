<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html>
<head>
  <link rel="stylesheet" type="text/css" href="/styles/index.css">
  <style>
  footer {
	font-size: 30px;
}

body {
	text-align: center;
	background:
		url('/resources/project.jpg');
	background-size: cover;
	color: white;
}

h1 {
	letter-spacing: 12px;
	margin-top: 200px;
	margin-bottom: 100px;
	margin-right: 150px;
	margin-left: 27px;
	font-size: 50px;
	text-align: left;
	font-family: Perpetua;
	color: black;
	opacity: 0.8
}

button {
	margin-top: 50px;
	
	margin-left: 650px;
	border: none;
	color: black;
	padding: 15px 32px;
	text-align:right;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	border-radius: 12px;
	opacity: 0.7;
}

img {
	margin: 40px 0px 0px 0px;
	border: 7px solid white;
	border-radius: 20px;
}
pre{
text-align:left;
margin-left:27px;
margin-top:20px;
font-size:20px;
color:white;
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
 <h1>Transliterator</h1>
 <pre>   
      A web application 
      based on  hindi to
      english transliteration.
  </pre>
  <button onclick="window.location.href = 'home.jsp';">Lets Begin</button>
</body>
</html>


	