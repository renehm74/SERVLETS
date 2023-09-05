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
import javax.swing.text.Document;


@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vn.ms-pdf");
        response.setHeader("Content-Disposition", "inline; filename=archivo.pdf");
        PrintWriter out = response.getWriter();
        try{
            out.println("ESTE ES LA PRUEBA EN PDF");
            out.println("HOLA ");
            out.println("200");
            out.println("La suma es:\t");
            out.println("suma(A2:A3)");            
        }finally{
            out.close();
        }    }
}

