package org.spongycastle.crypto.p134io;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class CipherIOException extends IOException {
    private static final long serialVersionUID = 1;
    private final Throwable cause;

    public CipherIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
