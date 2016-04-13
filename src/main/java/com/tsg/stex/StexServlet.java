package com.tsg.stex;

/**
 * Created by tsg on 12.04.2016.
 */

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/stex")
public class StexServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String q = req.getParameter("q");
        if ((q != null)  && (!q.trim().isEmpty())) {
            req.setAttribute("q", q);
            RequestDispatcher dispatcher = req.getRequestDispatcher("stex.jsp");
            dispatcher.forward(req, resp);
        }
        return;
    }
}
