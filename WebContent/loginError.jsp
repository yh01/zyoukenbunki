<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>

	<body> <!-- indexからbodyを持ってきて中身を書き換える -->
	<s:property value="#session.date2"/>
	<s:property value="maisu"/>
	<s:property value="#session.path"/>
	<s:property value="dd"/>
		<s:form action="GOhyouAction">
		<s:submit value="kotaki"/>
		</s:form>
	</body>
</html>