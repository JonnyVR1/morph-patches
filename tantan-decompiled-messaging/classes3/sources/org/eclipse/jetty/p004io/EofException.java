package org.eclipse.jetty.p004io;

import java.io.EOFException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EofException extends EOFException {
    public EofException(Throwable th) {
        if (th != null) {
            initCause(th);
        }
    }

    public EofException(String str) {
        super(str);
    }

    public EofException() {
    }
}
