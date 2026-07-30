package org.eclipse.jetty.servlet.listener;

import java.beans.Introspector;
import javax.servlet.ServletContextEvent;
import l.xje0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IntrospectorCleaner implements xje0 {
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        Introspector.flushCaches();
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
