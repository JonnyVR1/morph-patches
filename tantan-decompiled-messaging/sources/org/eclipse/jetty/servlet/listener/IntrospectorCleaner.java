package org.eclipse.jetty.servlet.listener;

import java.beans.Introspector;
import javax.servlet.ServletContextEvent;
import p149l.xje0;

/* JADX INFO: loaded from: classes3.dex */
public class IntrospectorCleaner implements xje0 {
    @Override // p149l.xje0
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        Introspector.flushCaches();
    }

    @Override // p149l.xje0
    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
