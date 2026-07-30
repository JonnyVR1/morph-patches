package org.eclipse.jetty.util.preventers;

/* JADX INFO: loaded from: classes2.dex */
public class Java2DLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        try {
            Class.forName("sun.java2d.Disposer", true, classLoader);
        } catch (ClassNotFoundException e) {
            AbstractLeakPreventer.LOG.ignore(e);
        }
    }
}
