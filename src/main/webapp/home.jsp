<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.javaee.db.Footballer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <%@include file="vendor/head.jsp"%>
</head>
<body>
    <%@include file="vendor/navbar.jsp"%>
    <div class="container">
        <div class="row mt-5">
            <div class="col-sm-12">
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                            <th>SURNAME</th>
                            <th>SALARY</th>
                            <th>CLUB</th>
                            <th>TRANSFERPRICE</th>
                            <th>DETAILS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            ArrayList<Footballer> footballers = (ArrayList<Footballer>) request.getAttribute("footballers");
                            if (footballers != null){
                                for (Footballer footballer : footballers) {

                        %>
                            <tr>
                                <td>
                                    <%=footballer.getId()%>
                                </td>
                                <td>
                                    <%=footballer.getName()%>
                                </td>
                                <td>
                                    <%=footballer.getSurname()%>
                                </td>
                                <td>
                                    <%=footballer.getSalary()%>
                                </td>
                                <td>
                                    <%=footballer.getClub()%>
                                </td>
                                <td>
                                    <%=footballer.getTransferPrice()%>
                                </td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/details?id=<%=footballer.getId()%>" class="btn btn-info btn-sm">DETAILS</a>
                                </td>
                            </tr>
                        <%
                                }
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
