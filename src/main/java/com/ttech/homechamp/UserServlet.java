package com.ttech.homechamp;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.lang.Override;

/**
 * Created by martin on 11/06/2017.
 */
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        PrintWriter out = resp.getWriter();

        // ugly...
        out.println("hello world");
    }
}
