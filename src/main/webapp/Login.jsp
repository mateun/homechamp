<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
  </head>
  <body>
    <h1>Login</h1>

    <s:form action="doLogin">
    	<s:textfield name="userName" label="User Name"></s:textfield>
    	<s:textfield name="passWord" label="Password" type="password"></s:textfield>
    	<s:submit value="Login"></s:submit>
    </s:form>

  </body>
</html>