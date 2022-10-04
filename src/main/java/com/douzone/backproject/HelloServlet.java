package com.douzone.backproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


@WebServlet("/dev.do")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Writer out = response.getWriter();
        out.write("{\"dev\" : \"it\"}");
        System.out.println("여기 들어옴");
    }

    // @Override
    // protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //     System.out.println("서비스 들어옴");
    // }
}