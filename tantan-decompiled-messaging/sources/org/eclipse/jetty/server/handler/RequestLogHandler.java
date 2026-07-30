package org.eclipse.jetty.server.handler;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.RequestLog;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public class RequestLogHandler extends HandlerWrapper {
    private static final Logger LOG = Log.getLogger((Class<?>) RequestLogHandler.class);
    private RequestLog _requestLog;

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        RequestLog requestLog = this._requestLog;
        if (requestLog != null) {
            requestLog.start();
        }
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
        RequestLog requestLog = this._requestLog;
        if (requestLog != null) {
            requestLog.stop();
        }
    }

    public RequestLog getRequestLog() {
        return this._requestLog;
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (!request.getAsyncContinuation().isInitial()) {
            request.setDispatchTime(System.currentTimeMillis());
        }
        try {
            super.handle(str, request, httpServletRequest, httpServletResponse);
        } finally {
            if (this._requestLog != null && DispatcherType.REQUEST.equals(request.getDispatcherType())) {
                this._requestLog.log(request, (Response) httpServletResponse);
            }
        }
    }

    public void setRequestLog(RequestLog requestLog) {
        RequestLogHandler requestLogHandler;
        RequestLog requestLog2;
        RequestLog requestLog3;
        try {
            RequestLog requestLog4 = this._requestLog;
            if (requestLog4 != null) {
                requestLog4.stop();
            }
        } catch (Exception e) {
            LOG.warn(e);
        }
        if (getServer() != null) {
            requestLogHandler = this;
            requestLog2 = requestLog;
            getServer().getContainer().update((Object) requestLogHandler, (Object) this._requestLog, (Object) requestLog2, "logimpl", true);
        } else {
            requestLogHandler = this;
            requestLog2 = requestLog;
        }
        requestLogHandler._requestLog = requestLog2;
        try {
            if (!requestLogHandler.isStarted() || (requestLog3 = requestLogHandler._requestLog) == null) {
                return;
            }
            requestLog3.start();
        } catch (Exception e2) {
            aag0.m95543a(e2);
        }
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        RequestLogHandler requestLogHandler;
        if (this._requestLog == null) {
            super.setServer(server);
            return;
        }
        if (getServer() == null || getServer() == server) {
            requestLogHandler = this;
        } else {
            requestLogHandler = this;
            getServer().getContainer().update((Object) requestLogHandler, (Object) this._requestLog, (Object) null, "logimpl", true);
        }
        super.setServer(server);
        if (server == null || server == requestLogHandler.getServer()) {
            return;
        }
        server.getContainer().update((Object) requestLogHandler, (Object) null, (Object) requestLogHandler._requestLog, "logimpl", true);
    }
}
