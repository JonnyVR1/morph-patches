package org.eclipse.jetty.server.handler.jmx;

import java.io.IOException;
import org.eclipse.jetty.jmx.ObjectMBean;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.handler.AbstractHandlerContainer;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class AbstractHandlerMBean extends ObjectMBean {
    private static final Logger LOG = Log.getLogger((Class<?>) AbstractHandlerMBean.class);

    public AbstractHandlerMBean(Object obj) {
        super(obj);
    }

    public String getContextName(ContextHandler contextHandler) {
        String contextPath;
        if (contextHandler.getContextPath() == null || contextHandler.getContextPath().length() <= 0) {
            contextPath = null;
        } else {
            int iLastIndexOf = contextHandler.getContextPath().lastIndexOf(47);
            contextPath = iLastIndexOf < 0 ? contextHandler.getContextPath() : contextHandler.getContextPath().substring(iLastIndexOf + 1);
            if (contextPath == null || contextPath.length() == 0) {
                contextPath = org.slf4j.Logger.ROOT_LOGGER_NAME;
            }
        }
        if (contextPath != null || contextHandler.getBaseResource() == null) {
            return contextPath;
        }
        try {
            return contextHandler.getBaseResource().getFile() != null ? contextHandler.getBaseResource().getFile().getName() : contextPath;
        } catch (IOException e) {
            LOG.ignore(e);
            return contextHandler.getBaseResource().getName();
        }
    }

    public String getObjectContextBasis() {
        AbstractHandler abstractHandler;
        Server server;
        ContextHandler contextHandler;
        if (this._managed != null) {
            String contextName = null;
            if (this._managed instanceof ContextHandler) {
                return null;
            }
            if ((this._managed instanceof AbstractHandler) && (server = (abstractHandler = (AbstractHandler) this._managed).getServer()) != null && (contextHandler = (ContextHandler) AbstractHandlerContainer.findContainerOf(server, ContextHandler.class, abstractHandler)) != null) {
                contextName = getContextName(contextHandler);
            }
            if (contextName != null) {
                return contextName;
            }
        }
        return super.getObjectContextBasis();
    }

    public String getObjectNameBasis() {
        if (this._managed != null) {
            String contextName = this._managed instanceof ContextHandler ? getContextName((ContextHandler) this._managed) : null;
            if (contextName != null) {
                return contextName;
            }
        }
        return super.getObjectNameBasis();
    }
}
