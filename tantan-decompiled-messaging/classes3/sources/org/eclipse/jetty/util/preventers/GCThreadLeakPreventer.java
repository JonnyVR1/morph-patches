package org.eclipse.jetty.util.preventers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GCThreadLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        try {
            Class.forName("sun.misc.GC").getMethod("requestLatency", Long.TYPE).invoke(null, 9223372036854775806L);
        } catch (ClassNotFoundException e) {
            AbstractLeakPreventer.LOG.ignore(e);
        } catch (Exception e2) {
            AbstractLeakPreventer.LOG.warn(e2);
        }
    }
}
