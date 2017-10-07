<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List,twitter4j.Status" %>
<%
    List<Status> statuses = (List<Status>) request.getAttribute("statuses");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Twitterblet</title>
</head>
<body>
twitterblet
<% for (Status status : statuses) { %>
<div>
<%= status.getUser().getName() + ":" + status.getText() %>
</div>
<% } %>
</body>
</html>