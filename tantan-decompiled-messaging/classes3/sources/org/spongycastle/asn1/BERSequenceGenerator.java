package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BERSequenceGenerator extends BERGenerator {
    public BERSequenceGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(48);
    }

    public void addObject(ASN1Encodable aSN1Encodable) throws IOException {
        aSN1Encodable.toASN1Primitive().encode(new BEROutputStream(this._out));
    }

    public void close() throws IOException {
        writeBEREnd();
    }

    public BERSequenceGenerator(OutputStream outputStream, int i, boolean z) throws IOException {
        super(outputStream, i, z);
        writeBERHeader(48);
    }
}
