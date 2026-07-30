package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import p149l.rhg0;

/* JADX INFO: loaded from: classes3.dex */
public class BEROutputStream extends DEROutputStream {
    public BEROutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof ASN1Primitive) {
            ((ASN1Primitive) obj).encode(this);
        } else if (obj instanceof ASN1Encodable) {
            ((ASN1Encodable) obj).toASN1Primitive().encode(this);
        } else {
            rhg0.m179353a("object not BEREncodable");
        }
    }
}
