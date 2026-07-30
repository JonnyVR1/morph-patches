package org.eclipse.jetty.util.preventers;

/* JADX INFO: loaded from: classes2.dex */
public class LDAPLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        try {
            Class.forName("com.sun.jndi.LdapPoolManager", true, classLoader);
        } catch (ClassNotFoundException e) {
            AbstractLeakPreventer.LOG.ignore(e);
        }
    }
}
