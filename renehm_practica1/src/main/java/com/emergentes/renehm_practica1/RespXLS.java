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
@WebServlet(name = "RespXLS", urlPatterns = {"/RespXLS"})
public class RespXLS extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/vn.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=archivo.xls");
        PrintWriter out = response.getWriter();
        try{
            out.println("Respuesta generada desde Excel");
            out.println("100");
            out.println("200");
            out.println("La suma es:\t");
            out.println("suma(A2:A3)");            
        }finally{
            out.close();
        }
    }
}
