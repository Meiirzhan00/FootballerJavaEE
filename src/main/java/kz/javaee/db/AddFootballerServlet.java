package kz.javaee.db;

import kz.javaee.db.DBManager;
import kz.javaee.db.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/addfootballer")
public class AddFootballerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/addfootballer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        int salary = Integer.parseInt(request.getParameter("salary"));
        String club = request.getParameter("club");
        int transferPrice = Integer.parseInt(request.getParameter("transferprice"));

        Footballer footballer = new Footballer(null,name,surname,salary,club,transferPrice);

//        footballer.setName(name);
//        footballer.setSurname(surname);
//        footballer.setSalary(salary);
//        footballer.setClub(club);
//        footballer.setTransferPrice(transferPrice);

        DBManager.addFootballer(footballer);
        response.sendRedirect("/addfootballer?success");
    }
}
