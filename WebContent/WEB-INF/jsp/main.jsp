<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Model.Time" %>
<%@page import="Model.ReTimes" %>
<%@page import="Model.Bexxx" %>
<%@page import="java.util.ArrayList" %>
<%
String name = (String) session.getAttribute("name");
Time time = (Time) session.getAttribute("time");
ReTimes reTimes = (ReTimes) session.getAttribute("reTimes");
ArrayList<Integer> list = (ArrayList<Integer>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>You will be...?</title>
</head>
<body>
<p><%=name %>さんは</p>
<p>平日に1日<%=reTimes.getReTime() %>時間</p>
<p>土日に1日<%=reTimes.getReTime2() %>時間の自由時間を持っています。</p>
<p>一週間の合計で<%=reTimes.getTotalReTime() %>時間の自由時間を持っています。</p>

<%=name %>さんは<%=list %>週間後にプログラマーになっているかもしれません。
<%-- <% for(ArrayList<Integer> weekList : list){ %>

<% } %> --%>

</body>
</html>