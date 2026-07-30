package org.spongycastle.asn1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable cause;

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ASN1ParsingException(String str) {
        super(str);
    }
}
