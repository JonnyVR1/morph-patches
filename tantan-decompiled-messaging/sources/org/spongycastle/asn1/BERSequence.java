package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class BERSequence extends ASN1Sequence {
    public BERSequence() {
    }

    @Override // org.spongycastle.asn1.ASN1Sequence, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.write(48);
        aSN1OutputStream.write(128);
        Enumeration objects = getObjects();
        while (objects.hasMoreElements()) {
            aSN1OutputStream.writeObject((ASN1Encodable) objects.nextElement());
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        Enumeration objects = getObjects();
        int iEncodedLength = 0;
        while (objects.hasMoreElements()) {
            iEncodedLength += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().encodedLength();
        }
        return iEncodedLength + 4;
    }

    public BERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
    }

    public BERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
    }
}
