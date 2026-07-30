package org.eclipse.jetty.server.handler;

import java.io.IOException;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractHandler extends AggregateLifeCycle implements Handler {
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractHandler.class);
    private Server _server;

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Destroyable
    public void destroy() {
        if (!isStopped()) {
            qkq0.m175383a("!STOPPED");
            return;
        }
        super.destroy();
        Server server = this._server;
        if (server != null) {
            server.getContainer().removeBean(this);
        }
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        LOG.debug("starting {}", this);
        super.doStart();
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        LOG.debug("stopping {}", this);
        super.doStop();
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle
    public void dumpThis(Appendable appendable) throws IOException {
        appendable.append(toString()).append(" - ").append(getState()).append('\n');
    }

    @Override // org.eclipse.jetty.server.Handler
    public Server getServer() {
        return this._server;
    }

    @Override // org.eclipse.jetty.server.Handler
    public void setServer(Server server) {
        Server server2 = this._server;
        if (server2 != null && server2 != server) {
            server2.getContainer().removeBean(this);
        }
        this._server = server;
        if (server == null || server == server2) {
            return;
        }
        server.getContainer().addBean(this);
    }
}
