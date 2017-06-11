package com.ttech.homechamp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.lang.Override;
import java.sql.*;

/**
 * Created by martin on 11/06/2017.
 */
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>homechamp backend</h1>");

        String jdbcUrl = System.getenv("JDBC_DATABASE_URL");

        if (null == jdbcUrl) {
            jdbcUrl = "jdbc:postgresql://localhost:5432/hc_local1?user=mgr&password=bjoern36";
            out.println("running local<hr/>");
        }

        try {
            Connection conn = DriverManager.getConnection(jdbcUrl);
            String selectQuery = "SELECT id, name from hc_user";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                out.println("<br>" + id + " - " + name + "</br>");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println("<br/><br/>");

    }
}
