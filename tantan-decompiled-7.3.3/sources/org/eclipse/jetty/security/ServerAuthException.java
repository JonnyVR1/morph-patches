package org.eclipse.jetty.security;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public class ServerAuthException extends GeneralSecurityException {
    public ServerAuthException() {
    }

    public ServerAuthException(String str) {
        super(str);
    }

    public ServerAuthException(String str, Throwable th) {
        super(str, th);
    }

    public ServerAuthException(Throwable th) {
        super(th);
    }
}
