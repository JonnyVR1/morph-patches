package org.eclipse.jetty.server.jmx;

import org.eclipse.jetty.jmx.ObjectMBean;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

/* JADX INFO: loaded from: classes2.dex */
public class ServerMBean extends ObjectMBean {
    private final Server server;
    private final long startupTime;

    public ServerMBean(Object obj) {
        super(obj);
        this.startupTime = System.currentTimeMillis();
        this.server = (Server) obj;
    }

    public Handler[] getContexts() {
        return this.server.getChildHandlersByClass(ContextHandler.class);
    }

    public long getStartupTime() {
        return this.startupTime;
    }
}
