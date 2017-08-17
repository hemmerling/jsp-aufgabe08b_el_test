<%-- 
    Document   : index
    Created on : 17.08.2017, 12:19:11
    Author     : rhemmerling
--%>

<%@page import="java.util.Map"%>
<%@page import="com.hemmerling.aufgabe8b_el_test.view.AttributeSetter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" tagdir="/WEB-INF/tags/hemmerling/" %>
<!-- ################ Set Request Attributes !!!! ################ -->
<% AttributeSetter.setSomeAttributes(request, response);%> 
<!-- ############################################################# -->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Startseite [Web Components ( aufgabe8b_el_test )]</title>
    </head>
    <body>
        <h1>Web Components ( aufgabe8b_el_test )</h1>
        <h2>Context-Parameter</h2>
        <h2>Request Methods</h2>
        <h2>Response Methods</h2>
        <h2>SevletContext Methods</h2>
        <p:request_info />
        \${pageContext.request}: ${pageContext.request}<br/><br/> 
    </body>
</html>
