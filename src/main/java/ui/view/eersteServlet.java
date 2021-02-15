package ui.view;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.*;

@WebServlet("/DynamischePagina")
public class eersteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<body>");
    out.println(" <body><h2><a href='index.html'>Link naar homepage</a></h2>");
    out.println("<h2>Ik schat jouw leeftijd op "+Math.round(Math.ceil(Math.random()*25+10))+".</h2>");
    out.println("<h3>(De uitgever is niet veratwoordelijk voor de inschattingen van de servlet)</h3></body>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
