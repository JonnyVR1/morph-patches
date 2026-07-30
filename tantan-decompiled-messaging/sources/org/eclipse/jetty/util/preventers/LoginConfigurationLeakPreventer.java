package org.eclipse.jetty.util.preventers;

/* JADX INFO: loaded from: classes3.dex */
public class LoginConfigurationLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        try {
            Class.forName("javax.security.auth.login.Configuration", true, classLoader);
        } catch (ClassNotFoundException e) {
            AbstractLeakPreventer.LOG.warn(e);
        }
    }
}
