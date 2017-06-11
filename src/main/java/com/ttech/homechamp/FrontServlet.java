package com.ttech.homechamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;

/**
 * Created by martin on 11/06/2017.
 */
public class FrontServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>homechamp frontcontroller!</h1>");

        String jdbcUrl = System.getenv("JDBC_DATABASE_URL");

        if (null == jdbcUrl) {
            jdbcUrl = "jdbc:postgresql://localhost:5432/hc_local1?user=mgr&password=bjoern36";
            out.println("running local<hr/>");
        }

        String ctxPath = req.getPathInfo();
        String method = req.getMethod();
        StringBuffer r = req.getRequestURL();
        Enumeration<String> p = req.getParameterNames();
        while(p.hasMoreElements()) {
            String k = p.nextElement();
            out.println("param: " + k +  "=>"
                     + req.getParameterMap().get(k)[0].toString() + "<br/>");
        }
        out.println("ctxPath: " + ctxPath + " method: " + method + " url: " + r);


    }
}
