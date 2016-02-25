<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="06.select.css">
		<link rel="stylesheet" type="text/css" href="botan.css">
	</head>

	<body> <!-- indexからbodyを持ってきて中身を書き換える -->
	<div class="checkbox">
	<table>

		<tr>
		<td><s:property value="#session.date2"/></td>
		<td><s:property value="#session.path"/></td>
		<td><s:property value="maisu"/></td>
		</tr>

	</table>
	</div>
		<s:form action="GOhyouAction">
		<s:submit value="kotaki"/>
		</s:form>
		<s:form action="MainHyouAction">
		<s:submit value="kotaki"/>
		</s:form>
	</body>
</html>