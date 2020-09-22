<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.edu.fatecpg.poo.Data"%>
<%
    Data hoje = new Data();
    hoje.setDia(21);
    hoje.setMes(9);
    hoje.setAno(2020);
    Data nasc = new Data();
    nasc.setDia(12);
    nasc.setMes(12);
    nasc.setAno(2001);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>POO - Data</title>
    </head>
    <body>
        <h1>Data</h1>
        <h2><a href="index.jsp">Voltar</a></h2>
        <h3>Hoje é: <%= hoje.getDia()+"/"+hoje.getMes()+"/"+hoje.getAno() %></h3>
    </body>
</html>
