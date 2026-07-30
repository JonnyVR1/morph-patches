package org.eclipse.jetty.util.preventers;

import java.awt.Toolkit;

/* JADX INFO: loaded from: classes2.dex */
public class AWTLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        AbstractLeakPreventer.LOG.debug("Pinning classloader for java.awt.EventQueue using " + classLoader, new Object[0]);
        Toolkit.getDefaultToolkit();
    }
}
