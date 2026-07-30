package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public class DLOutputStream extends ASN1OutputStream {
    public DLOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.spongycastle.asn1.ASN1OutputStream
    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable != null) {
            aSN1Encodable.toASN1Primitive().toDLObject().encode(this);
        } else {
            zpg0.m220844a("null object detected");
        }
    }
}
