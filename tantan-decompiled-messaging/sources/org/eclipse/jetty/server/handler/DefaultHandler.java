package org.eclipse.jetty.server.handler;

import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.ByteArrayISO8859Writer;
import org.eclipse.jetty.util.C21953IO;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import p149l.zje0;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultHandler extends AbstractHandler {
    private static final Logger LOG = Log.getLogger((Class<?>) DefaultHandler.class);
    byte[] _favicon;
    final long _faviconModified = (System.currentTimeMillis() / 1000) * 1000;
    boolean _serveIcon = true;
    boolean _showContexts = true;

    public DefaultHandler() {
        try {
            URL resource = getClass().getClassLoader().getResource("org/eclipse/jetty/favicon.ico");
            if (resource != null) {
                this._favicon = C21953IO.readBytes(Resource.newResource(resource).getInputStream());
            }
        } catch (Exception e) {
            LOG.warn(e);
        }
    }

    public boolean getServeIcon() {
        return this._serveIcon;
    }

    public boolean getShowContexts() {
        return this._showContexts;
    }

    @Override // org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (httpServletResponse.isCommitted() || request.isHandled()) {
            return;
        }
        request.setHandled(true);
        String method = httpServletRequest.getMethod();
        if (this._serveIcon && this._favicon != null && method.equals("GET") && httpServletRequest.getRequestURI().equals("/favicon.ico")) {
            if (httpServletRequest.getDateHeader("If-Modified-Since") == this._faviconModified) {
                httpServletResponse.setStatus(HttpStatus.NOT_MODIFIED_304);
                return;
            }
            httpServletResponse.setStatus(200);
            httpServletResponse.setContentType("image/x-icon");
            httpServletResponse.setContentLength(this._favicon.length);
            httpServletResponse.setDateHeader("Last-Modified", this._faviconModified);
            httpServletResponse.setHeader("Cache-Control", "max-age=360000,public");
            httpServletResponse.getOutputStream().write(this._favicon);
            return;
        }
        if (!method.equals("GET") || !httpServletRequest.getRequestURI().equals("/")) {
            httpServletResponse.sendError(404);
            return;
        }
        httpServletResponse.setStatus(404);
        httpServletResponse.setContentType(MimeTypes.TEXT_HTML);
        ByteArrayISO8859Writer byteArrayISO8859Writer = new ByteArrayISO8859Writer(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        byteArrayISO8859Writer.write("<HTML>\n<HEAD>\n<TITLE>Error 404 - Not Found");
        byteArrayISO8859Writer.write("</TITLE>\n<BODY>\n<H2>Error 404 - Not Found.</H2>\n");
        byteArrayISO8859Writer.write("No context on this server matched or handled this request.<BR>");
        if (this._showContexts) {
            byteArrayISO8859Writer.write("Contexts known to this server are: <ul>");
            Server server = getServer();
            Handler[] childHandlersByClass = server == null ? null : server.getChildHandlersByClass(ContextHandler.class);
            for (int i = 0; childHandlersByClass != null && i < childHandlersByClass.length; i++) {
                ContextHandler contextHandler = (ContextHandler) childHandlersByClass[i];
                if (contextHandler.isRunning()) {
                    byteArrayISO8859Writer.write("<li><a href=\"");
                    if (contextHandler.getVirtualHosts() != null && contextHandler.getVirtualHosts().length > 0) {
                        byteArrayISO8859Writer.write("http://" + contextHandler.getVirtualHosts()[0] + ":" + httpServletRequest.getLocalPort());
                    }
                    byteArrayISO8859Writer.write(contextHandler.getContextPath());
                    if (contextHandler.getContextPath().length() > 1 && contextHandler.getContextPath().endsWith("/")) {
                        byteArrayISO8859Writer.write("/");
                    }
                    byteArrayISO8859Writer.write("\">");
                    byteArrayISO8859Writer.write(contextHandler.getContextPath());
                    if (contextHandler.getVirtualHosts() != null && contextHandler.getVirtualHosts().length > 0) {
                        byteArrayISO8859Writer.write("&nbsp;@&nbsp;" + contextHandler.getVirtualHosts()[0] + ":" + httpServletRequest.getLocalPort());
                    }
                    byteArrayISO8859Writer.write("&nbsp;--->&nbsp;");
                    byteArrayISO8859Writer.write(contextHandler.toString());
                    byteArrayISO8859Writer.write("</a></li>\n");
                } else {
                    byteArrayISO8859Writer.write("<li>");
                    byteArrayISO8859Writer.write(contextHandler.getContextPath());
                    if (contextHandler.getVirtualHosts() != null && contextHandler.getVirtualHosts().length > 0) {
                        byteArrayISO8859Writer.write("&nbsp;@&nbsp;" + contextHandler.getVirtualHosts()[0] + ":" + httpServletRequest.getLocalPort());
                    }
                    byteArrayISO8859Writer.write("&nbsp;--->&nbsp;");
                    byteArrayISO8859Writer.write(contextHandler.toString());
                    if (contextHandler.isFailed()) {
                        byteArrayISO8859Writer.write(" [failed]");
                    }
                    if (contextHandler.isStopped()) {
                        byteArrayISO8859Writer.write(" [stopped]");
                    }
                    byteArrayISO8859Writer.write("</li>\n");
                }
            }
        }
        for (int i2 = 0; i2 < 10; i2++) {
            byteArrayISO8859Writer.write("\n<!-- Padding for IE                  -->");
        }
        byteArrayISO8859Writer.write("\n</BODY>\n</HTML>\n");
        byteArrayISO8859Writer.flush();
        httpServletResponse.setContentLength(byteArrayISO8859Writer.size());
        zje0 outputStream = httpServletResponse.getOutputStream();
        byteArrayISO8859Writer.writeTo(outputStream);
        outputStream.close();
    }

    public void setServeIcon(boolean z) {
        this._serveIcon = z;
    }

    public void setShowContexts(boolean z) {
        this._showContexts = z;
    }
}
