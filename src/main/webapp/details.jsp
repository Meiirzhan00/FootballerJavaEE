<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.javaee.db.Footballer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <%@include file="vendor/head.jsp"%>
</head>
<body>
    <%@include file="vendor/navbar.jsp"%>
    <div class="container">
        <div class="row mt-5">
            <div class="col-sm-12">
                <div class="jumbotron">
                    <%
                        Footballer footballer = (Footballer) request.getAttribute("footballer");

                        if (footballer != null){
                    %>

                        <h1 class="display-4">
                            <%=footballer.getName()+" "+footballer.getSurname()%>
                        </h1>
                        <p class="lead">
                            CLUB : <%=footballer.getClub()%>
                        </p>
                        <hr class="my-4">
                        <p>
                            SALARY : <%=footballer.getSalary()%> EUR
                        </p>
                        <p>
                            TRANSFERPRICE : <%=footballer.getTransferPrice()%> EUR
                        </p>
                        <p class="lead">
                            <a class="btn btn-primary btn-sm" href="#" role="button">EDIT</a>
                        </p>
                    <%
                        }

                        else request.getRequestDispatcher("/404.jsp");
                    %>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
