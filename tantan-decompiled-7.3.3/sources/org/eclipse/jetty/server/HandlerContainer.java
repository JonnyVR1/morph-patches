package org.eclipse.jetty.server;

import org.eclipse.jetty.util.component.LifeCycle;

/* JADX INFO: loaded from: classes2.dex */
public interface HandlerContainer extends LifeCycle {
    <T extends Handler> T getChildHandlerByClass(Class<T> cls);

    Handler[] getChildHandlers();

    Handler[] getChildHandlersByClass(Class<?> cls);

    Handler[] getHandlers();
}
