package org.eclipse.jetty.server.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import p149l.aag0;
import p149l.ig3;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class HotSwapHandler extends AbstractHandlerContainer {
    private volatile Handler _handler;

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Destroyable
    public void destroy() {
        if (!isStopped()) {
            qkq0.m175383a("!STOPPED");
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            setHandler(null);
            handler.destroy();
        }
        super.destroy();
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandlerContainer
    public Object expandChildren(Object obj, Class cls) {
        return expandHandler(this._handler, obj, cls);
    }

    public Handler getHandler() {
        return this._handler;
    }

    @Override // org.eclipse.jetty.server.HandlerContainer
    public Handler[] getHandlers() {
        return new Handler[]{this._handler};
    }

    @Override // org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (this._handler == null || !isStarted()) {
            return;
        }
        this._handler.handle(str, request, httpServletRequest, httpServletResponse);
    }

    public void setHandler(Handler handler) {
        if (handler == null) {
            ig3.m135964a("Parameter handler is null.");
            return;
        }
        try {
            Handler handler2 = this._handler;
            this._handler = handler;
            Server server = getServer();
            handler.setServer(server);
            addBean(handler);
            if (server != null) {
                server.getContainer().update(this, handler2, handler, "handler");
            }
            if (handler2 != null) {
                removeBean(handler2);
            }
        } catch (Exception e) {
            aag0.m95543a(e);
        }
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        Server server2 = getServer();
        if (server == server2) {
            return;
        }
        if (isRunning()) {
            qkq0.m175383a(AbstractLifeCycle.RUNNING);
            return;
        }
        super.setServer(server);
        Handler handler = getHandler();
        if (handler != null) {
            handler.setServer(server);
        }
        if (server == null || server == server2) {
            return;
        }
        server.getContainer().update(this, (Object) null, this._handler, "handler");
    }
}
