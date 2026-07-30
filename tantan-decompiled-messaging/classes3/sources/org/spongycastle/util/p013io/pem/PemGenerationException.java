package org.spongycastle.util.p013io.pem;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PemGenerationException extends IOException {
    private Throwable cause;

    public PemGenerationException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PemGenerationException(String str) {
        super(str);
    }
}
