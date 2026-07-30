package org.eclipse.jetty.util.preventers;

import java.security.Security;

/* JADX INFO: loaded from: classes2.dex */
public class SecurityProviderLeakPreventer extends AbstractLeakPreventer {
    @Override // org.eclipse.jetty.util.preventers.AbstractLeakPreventer
    public void prevent(ClassLoader classLoader) {
        Security.getProviders();
    }
}
