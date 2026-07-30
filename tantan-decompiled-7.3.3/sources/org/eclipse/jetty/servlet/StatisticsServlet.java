package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.StatisticsHandler;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class StatisticsServlet extends HttpServlet {
    private static final Logger LOG = Log.getLogger((Class<?>) StatisticsServlet.class);
    private Connector[] _connectors;
    private MemoryMXBean _memoryBean;
    boolean _restrictToLocalhost = true;
    private StatisticsHandler _statsHandler;

    private void sendTextResponse(HttpServletResponse httpServletResponse) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(this._statsHandler.toStatsHTML());
        sb.append("<h2>Connections:</h2>\n");
        for (Connector connector : this._connectors) {
            sb.append("<h3>");
            sb.append(connector.getName());
            sb.append("</h3>");
            if (connector.getStatsOn()) {
                sb.append("Statistics gathering started ");
                sb.append(connector.getStatsOnMs());
                sb.append("ms ago<br />\nTotal connections: ");
                sb.append(connector.getConnections());
                sb.append("<br />\nCurrent connections open: ");
                sb.append(connector.getConnectionsOpen());
                sb.append("Max concurrent connections open: ");
                sb.append(connector.getConnectionsOpenMax());
                sb.append("<br />\nTotal connections duration: ");
                sb.append(connector.getConnectionsDurationTotal());
                sb.append("<br />\nMean connection duration: ");
                sb.append(connector.getConnectionsDurationMean());
                sb.append("<br />\nMax connection duration: ");
                sb.append(connector.getConnectionsDurationMax());
                sb.append("<br />\nConnection duration standard deviation: ");
                sb.append(connector.getConnectionsDurationStdDev());
                sb.append("<br />\nTotal requests: ");
                sb.append(connector.getRequests());
                sb.append("<br />\nMean requests per connection: ");
                sb.append(connector.getConnectionsRequestsMean());
                sb.append("<br />\nMax requests per connection: ");
                sb.append(connector.getConnectionsRequestsMax());
                sb.append("<br />\nRequests per connection standard deviation: ");
                sb.append(connector.getConnectionsRequestsStdDev());
                sb.append("<br />\n");
            } else {
                sb.append("Statistics gathering off.\n");
            }
        }
        sb.append("<h2>Memory:</h2>\nHeap memory usage: ");
        sb.append(this._memoryBean.getHeapMemoryUsage().getUsed());
        sb.append(" bytes<br />\nNon-heap memory usage: ");
        sb.append(this._memoryBean.getNonHeapMemoryUsage().getUsed());
        sb.append(" bytes<br />\n");
        httpServletResponse.setContentType(MimeTypes.TEXT_HTML);
        httpServletResponse.getWriter().write(sb.toString());
    }

    private void sendXmlResponse(HttpServletResponse httpServletResponse) throws IOException {
        StringBuilder sb = new StringBuilder("<statistics>\n  <requests>\n    <statsOnMs>");
        sb.append(this._statsHandler.getStatsOnMs());
        sb.append("</statsOnMs>\n    <requests>");
        sb.append(this._statsHandler.getRequests());
        sb.append("</requests>\n    <requestsActive>");
        sb.append(this._statsHandler.getRequestsActive());
        sb.append("</requestsActive>\n    <requestsActiveMax>");
        sb.append(this._statsHandler.getRequestsActiveMax());
        sb.append("</requestsActiveMax>\n    <requestsTimeTotal>");
        sb.append(this._statsHandler.getRequestTimeTotal());
        sb.append("</requestsTimeTotal>\n    <requestsTimeMean>");
        sb.append(this._statsHandler.getRequestTimeMean());
        sb.append("</requestsTimeMean>\n    <requestsTimeMax>");
        sb.append(this._statsHandler.getRequestTimeMax());
        sb.append("</requestsTimeMax>\n    <requestsTimeStdDev>");
        sb.append(this._statsHandler.getRequestTimeStdDev());
        sb.append("</requestsTimeStdDev>\n    <dispatched>");
        sb.append(this._statsHandler.getDispatched());
        sb.append("</dispatched>\n    <dispatchedActive>");
        sb.append(this._statsHandler.getDispatchedActive());
        sb.append("</dispatchedActive>\n    <dispatchedActiveMax>");
        sb.append(this._statsHandler.getDispatchedActiveMax());
        sb.append("</dispatchedActiveMax>\n    <dispatchedTimeTotal>");
        sb.append(this._statsHandler.getDispatchedTimeTotal());
        sb.append("</dispatchedTimeTotal>\n    <dispatchedTimeMean");
        sb.append(this._statsHandler.getDispatchedTimeMean());
        sb.append("</dispatchedTimeMean>\n    <dispatchedTimeMax>");
        sb.append(this._statsHandler.getDispatchedTimeMax());
        sb.append("</dispatchedTimeMax>\n    <dispatchedTimeStdDev");
        sb.append(this._statsHandler.getDispatchedTimeStdDev());
        sb.append("</dispatchedTimeStdDev>\n    <requestsSuspended>");
        sb.append(this._statsHandler.getSuspends());
        sb.append("</requestsSuspended>\n    <requestsExpired>");
        sb.append(this._statsHandler.getExpires());
        sb.append("</requestsExpired>\n    <requestsResumed>");
        sb.append(this._statsHandler.getResumes());
        sb.append("</requestsResumed>\n  </requests>\n  <responses>\n    <responses1xx>");
        sb.append(this._statsHandler.getResponses1xx());
        sb.append("</responses1xx>\n    <responses2xx>");
        sb.append(this._statsHandler.getResponses2xx());
        sb.append("</responses2xx>\n    <responses3xx>");
        sb.append(this._statsHandler.getResponses3xx());
        sb.append("</responses3xx>\n    <responses4xx>");
        sb.append(this._statsHandler.getResponses4xx());
        sb.append("</responses4xx>\n    <responses5xx>");
        sb.append(this._statsHandler.getResponses5xx());
        sb.append("</responses5xx>\n    <responsesBytesTotal>");
        sb.append(this._statsHandler.getResponsesBytesTotal());
        sb.append("</responsesBytesTotal>\n  </responses>\n  <connections>\n");
        for (Connector connector : this._connectors) {
            sb.append("    <connector>\n      <name>");
            sb.append(connector.getName());
            sb.append("</name>\n      <statsOn>");
            sb.append(connector.getStatsOn());
            sb.append("</statsOn>\n");
            if (connector.getStatsOn()) {
                sb.append("    <statsOnMs>");
                sb.append(connector.getStatsOnMs());
                sb.append("</statsOnMs>\n    <connections>");
                sb.append(connector.getConnections());
                sb.append("</connections>\n    <connectionsOpen>");
                sb.append(connector.getConnectionsOpen());
                sb.append("</connectionsOpen>\n    <connectionsOpenMax>");
                sb.append(connector.getConnectionsOpenMax());
                sb.append("</connectionsOpenMax>\n    <connectionsDurationTotal>");
                sb.append(connector.getConnectionsDurationTotal());
                sb.append("</connectionsDurationTotal>\n    <connectionsDurationMean>");
                sb.append(connector.getConnectionsDurationMean());
                sb.append("</connectionsDurationMean>\n    <connectionsDurationMax>");
                sb.append(connector.getConnectionsDurationMax());
                sb.append("</connectionsDurationMax>\n    <connectionsDurationStdDev>");
                sb.append(connector.getConnectionsDurationStdDev());
                sb.append("</connectionsDurationStdDev>\n    <requests>");
                sb.append(connector.getRequests());
                sb.append("</requests>\n    <connectionsRequestsMean>");
                sb.append(connector.getConnectionsRequestsMean());
                sb.append("</connectionsRequestsMean>\n    <connectionsRequestsMax>");
                sb.append(connector.getConnectionsRequestsMax());
                sb.append("</connectionsRequestsMax>\n    <connectionsRequestsStdDev>");
                sb.append(connector.getConnectionsRequestsStdDev());
                sb.append("</connectionsRequestsStdDev>\n");
            }
            sb.append("    </connector>\n");
        }
        sb.append("  </connections>\n  <memory>\n    <heapMemoryUsage>");
        sb.append(this._memoryBean.getHeapMemoryUsage().getUsed());
        sb.append("</heapMemoryUsage>\n    <nonHeapMemoryUsage>");
        sb.append(this._memoryBean.getNonHeapMemoryUsage().getUsed());
        sb.append("</nonHeapMemoryUsage>\n  </memory>\n</statistics>\n");
        httpServletResponse.setContentType(MimeTypes.TEXT_XML);
        httpServletResponse.getWriter().write(sb.toString());
    }

    @Override // javax.servlet.http.HttpServlet
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (this._statsHandler == null) {
            LOG.warn("Statistics Handler not installed!", new Object[0]);
            httpServletResponse.sendError(HttpStatus.SERVICE_UNAVAILABLE_503);
            return;
        }
        if (this._restrictToLocalhost && !"127.0.0.1".equals(httpServletRequest.getRemoteAddr())) {
            httpServletResponse.sendError(HttpStatus.SERVICE_UNAVAILABLE_503);
            return;
        }
        String parameter = httpServletRequest.getParameter("xml");
        if (parameter == null) {
            parameter = httpServletRequest.getParameter("XML");
        }
        if (parameter == null || !"true".equalsIgnoreCase(parameter)) {
            sendTextResponse(httpServletResponse);
        } else {
            sendXmlResponse(httpServletResponse);
        }
    }

    @Override // javax.servlet.http.HttpServlet
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        doGet(httpServletRequest, httpServletResponse);
    }

    @Override // javax.servlet.GenericServlet
    public void init() throws ServletException {
        Server server = ((ContextHandler.Context) getServletContext()).getContextHandler().getServer();
        Handler childHandlerByClass = server.getChildHandlerByClass(StatisticsHandler.class);
        if (childHandlerByClass == null) {
            LOG.warn("Statistics Handler not installed!", new Object[0]);
            return;
        }
        this._statsHandler = (StatisticsHandler) childHandlerByClass;
        this._memoryBean = ManagementFactory.getMemoryMXBean();
        this._connectors = server.getConnectors();
        if (getInitParameter("restrictToLocalhost") != null) {
            this._restrictToLocalhost = "true".equals(getInitParameter("restrictToLocalhost"));
        }
    }
}
