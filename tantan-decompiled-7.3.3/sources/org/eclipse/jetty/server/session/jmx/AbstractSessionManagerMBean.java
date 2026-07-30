package org.eclipse.jetty.server.session.jmx;

import org.eclipse.jetty.server.handler.AbstractHandlerContainer;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.jmx.AbstractHandlerMBean;
import org.eclipse.jetty.server.session.AbstractSessionManager;
import org.eclipse.jetty.server.session.SessionHandler;

/* JADX INFO: loaded from: classes2.dex */
public class AbstractSessionManagerMBean extends AbstractHandlerMBean {
    public AbstractSessionManagerMBean(Object obj) {
        super(obj);
    }

    @Override // org.eclipse.jetty.server.handler.jmx.AbstractHandlerMBean
    public String getObjectContextBasis() {
        ContextHandler contextHandler;
        if (this._managed != null && (this._managed instanceof AbstractSessionManager)) {
            SessionHandler sessionHandler = ((AbstractSessionManager) this._managed).getSessionHandler();
            String contextName = (sessionHandler == null || (contextHandler = (ContextHandler) AbstractHandlerContainer.findContainerOf(sessionHandler.getServer(), ContextHandler.class, sessionHandler)) == null) ? null : getContextName(contextHandler);
            if (contextName != null) {
                return contextName;
            }
        }
        return super.getObjectContextBasis();
    }
}
