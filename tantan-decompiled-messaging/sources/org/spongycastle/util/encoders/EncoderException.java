package org.spongycastle.util.encoders;

/* JADX INFO: loaded from: classes3.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    public EncoderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
