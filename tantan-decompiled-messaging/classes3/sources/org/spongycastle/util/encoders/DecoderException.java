package org.spongycastle.util.encoders;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DecoderException extends IllegalStateException {
    private Throwable cause;

    public DecoderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
