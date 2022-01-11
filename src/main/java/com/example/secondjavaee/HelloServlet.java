package com.example.secondjavaee;

import kz.javaee.db.DBManager;
import kz.javaee.db.Footballer;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/home")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ArrayList<Footballer> footballers = DBManager.getAllFootballers();
        request.setAttribute("footballers", footballers);

        request.getRequestDispatcher("/home.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
}