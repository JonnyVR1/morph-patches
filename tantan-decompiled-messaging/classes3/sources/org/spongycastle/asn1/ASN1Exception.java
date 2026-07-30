package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ASN1Exception extends IOException {
    private Throwable cause;

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ASN1Exception(String str) {
        super(str);
    }
}
