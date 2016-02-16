
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
</head>
<body>
<s:property value="#session.date2"/>
<s:property value="maisu"/>
<s:property value="#session.path"/>
<s:property value="dd"/>
	<s:form action="GOloginction">
		<p>ユーザーID：
			<s:textfield label="ID" name="id"/>
		</p>
		<p>パスワード：
			<s:password label="パスワード" name="password"/>
		</p>
		<s:submit value="ログイン" />
	</s:form>
</body>
</html>