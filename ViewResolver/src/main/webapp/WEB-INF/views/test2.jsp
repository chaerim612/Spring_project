<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Test2</h1>
<h3>data1 : ${requestScope.data1 }</h3>
<h3>data2 : ${requestScope.data2 }</h3>
</body>
</html>

<!-- requestScope : 요청정보가 발생하고 그 응답 결과가 브라우저로 전달될 때까지 정보가 담겨 있는 작업 범위 -->