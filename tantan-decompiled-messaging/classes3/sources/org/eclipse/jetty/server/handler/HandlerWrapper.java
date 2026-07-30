package org.eclipse.jetty.server.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.qkq0;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.AbstractLifeCycle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HandlerWrapper extends AbstractHandlerContainer {
    protected Handler _handler;

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Destroyable
    public void destroy() {
        if (!isStopped()) {
            qkq0.a("!STOPPED");
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
        Handler handler = this._handler;
        if (handler != null) {
            handler.start();
        }
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        Handler handler = this._handler;
        if (handler != null) {
            handler.stop();
        }
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
        Handler handler = this._handler;
        return handler == null ? new Handler[0] : new Handler[]{handler};
    }

    public <H extends Handler> H getNestedHandlerByClass(Class<H> cls) {
        while (!cls.isInstance(this)) {
            Handler handler = this.getHandler();
            if (!(handler instanceof HandlerWrapper)) {
                return null;
            }
            this = (HandlerWrapper) handler;
        }
        return this;
    }

    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (this._handler == null || !isStarted()) {
            return;
        }
        this._handler.handle(str, request, httpServletRequest, httpServletResponse);
    }

    public void setHandler(Handler handler) {
        if (isStarted()) {
            qkq0.a(AbstractLifeCycle.STARTED);
            return;
        }
        Handler handler2 = this._handler;
        this._handler = handler;
        if (handler != null) {
            handler.setServer(getServer());
        }
        if (getServer() != null) {
            getServer().getContainer().update(this, handler2, handler, "handler");
        }
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        Server server2 = getServer();
        if (server == server2) {
            return;
        }
        if (isStarted()) {
            qkq0.a(AbstractLifeCycle.STARTED);
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
