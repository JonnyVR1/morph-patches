package org.eclipse.jetty.servlet.listener;

import java.beans.Introspector;
import javax.servlet.ServletContextEvent;
import p153l.cse0;

/* JADX INFO: loaded from: classes2.dex */
public class IntrospectorCleaner implements cse0 {
    @Override // p153l.cse0
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        Introspector.flushCaches();
    }

    @Override // p153l.cse0
    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
