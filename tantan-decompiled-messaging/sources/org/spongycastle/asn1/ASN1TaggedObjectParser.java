package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i, boolean z) throws IOException;

    int getTagNo();
}
