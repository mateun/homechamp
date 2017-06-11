<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create a user</title>
  </head>
  <body>
    <s:form action="createUser">
      <s:textfield name="userName" label="Your name" />
      <s:textfield name="passWord" label="Choose password" />
      <s:submit value="Submit" />
    </s:form>
  </body>
</html>