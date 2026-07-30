package org.eclipse.jetty.util.preventers;

import java.sql.DriverManager;

/* JADX INFO: loaded from: classes2.dex */
public class DriverManagerLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        AbstractLeakPreventer.LOG.debug("Pinning DriverManager classloader with " + classLoader, new Object[0]);
        DriverManager.getDrivers();
    }
}
