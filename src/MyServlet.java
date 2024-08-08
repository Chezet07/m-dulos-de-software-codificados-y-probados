package com.asistente.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myServlet")
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>Bienvenido a la Asistente Virtual</h1>");
        response.getWriter().println("<p>Seleccione una opción para explorar e interactuar:</p>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li><a href='documents'>Acceder a Documentos</a></li>");
        response.getWriter().println("<li><a href='devices'>Vincular Dispositivos</a></li>");
        response.getWriter().println("</ul>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String param = request.getParameter("param");
        response.getWriter().println("<h1>POST request received with param: " + param + "</h1>");
    }
}
