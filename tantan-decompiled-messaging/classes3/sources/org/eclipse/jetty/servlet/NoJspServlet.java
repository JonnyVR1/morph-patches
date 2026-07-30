package org.eclipse.jetty.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NoJspServlet extends HttpServlet {
    private boolean _warned;

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (!this._warned) {
            getServletContext().log("No JSP support.  Check that JSP jars are in lib/jsp and that the JSP option has been specified to start.jar");
        }
        this._warned = true;
        httpServletResponse.sendError(HttpStatus.INTERNAL_SERVER_ERROR_500, "JSP support not configured");
    }
}
