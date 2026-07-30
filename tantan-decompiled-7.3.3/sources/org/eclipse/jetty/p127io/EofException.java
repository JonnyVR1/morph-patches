package org.eclipse.jetty.p127io;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
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
