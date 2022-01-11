package com.example.secondjavaee;

import kz.javaee.db.DBManager;
import kz.javaee.db.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/show")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Footballer> footballers = DBManager.getAllFootballers();

        PrintWriter out = response.getWriter();
        out.println("<h1>FOOTBALLERS LIST</h1>");
        for (Footballer footballer : footballers) {
            out.println("<h3 style='color:green'>"+ footballer.getName()+" "+ footballer.getSurname() +"</h3>");
            out.println("<h4>Club: "+footballer.getClub()+"</h4>");
            out.println("<h4>Annual salary: "+footballer.getSalary()+" EUR</h4>");
            out.println("<h4>Transfer price: "+footballer.getTransferPrice()+" EUR</h4>");
            out.println("\n\n");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
