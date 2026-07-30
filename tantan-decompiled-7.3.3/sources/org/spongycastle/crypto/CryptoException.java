package org.spongycastle.crypto;

/* JADX INFO: loaded from: classes3.dex */
public class CryptoException extends Exception {
    private Throwable cause;

    public CryptoException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public CryptoException(String str) {
        super(str);
    }

    public CryptoException() {
    }
}
