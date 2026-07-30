package org.spongycastle.util;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public class Properties {
    public static boolean isOverrideSet(final String str) {
        try {
            return "true".equals(AccessController.doPrivileged(new PrivilegedAction() { // from class: org.spongycastle.util.Properties.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    String property = System.getProperty(str);
                    if (property == null) {
                        return null;
                    }
                    return Strings.toLowerCase(property);
                }
            }));
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
