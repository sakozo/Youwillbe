<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//セッションスコープから名前をとってくる
String name = (String) session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>You will be ...?</title>
</head>
<body>
<p><%=name %>さん　こんにちは</p>
<p><%=name %>さんの1日の過ごし方を教えてください</p>
<form action="/Youwillbe/MainAction" method="post">
平日<br>
睡眠時間<input type="text" name ="sleep" value=7>時間<br>
支度時間<input type="text" name ="prepare" value=1>時間<br>
通勤時間(往復)<input type="text" name ="commute" value=2>時間<br>
勤務時間<input type="text" name ="work" value=8>時間<br>
食事時間(合計)<input type="text" name ="eat" value=1.5>時間<br>
家事時間<input type="text" name ="house" value=1.5>時間<br>
風呂時間<input type="text" name ="bath" value=0.5>時間<br>
<br>
土日<br>
睡眠時間<input type="text" name ="sleep2" value=7>時間<br>
支度時間<input type="text" name ="prepare2" value=1>時間<br>
通勤時間(往復)<input type="text" name ="commute2" value=2>時間<br>
勤務時間<input type="text" name ="work2" value=0>時間<br>
食事時間(合計)<input type="text" name ="eat2" value=1.5>時間<br>
家事時間<input type="text" name ="house2" value=1.5>時間<br>
風呂時間<input type="text" name ="bath2" value=0.5>時間<br>
<input type ="submit" value="OK">
</form>
</body>
</html>