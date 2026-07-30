package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface ASN1SequenceParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable readObject() throws IOException;
}
