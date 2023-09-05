/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.renehm_practica1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rene
 */
@WebServlet(name = "RespXML", urlPatterns = {"/RespXML"})
public class RespXML extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<?xml version=\"1.0\" encoding=\"UTF-8?>");
            out.println("<CATALOGO>");
            out.println("<CD>");
            out.println("<TITULO>tinta roja</TITULO>");
            out.println("<ARTISTA> Andres Calamaro</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>5.90</PRECIO>");
            out.println("<AÑO>2006</AÑO>");
            out.println("</CD>");
            out.println("<CD>");
            out.println("<TITULO> La lengua Popular</TITULO>");
            out.println("<ARTISTA> Andres Calamaro</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>9.90</PRECIO>");
            out.println("<AÑO>2007</AÑO>");
            out.println("</CD>");
            out.println("</CATALOGO>");        
        }finally{
            out.close();
        }
    }
}

