package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DERSequence extends ASN1Sequence {
    private int bodyLength;

    public DERSequence() {
        this.bodyLength = -1;
    }

    private int getBodyLength() throws IOException {
        if (this.bodyLength < 0) {
            Enumeration objects = getObjects();
            int iEncodedLength = 0;
            while (objects.hasMoreElements()) {
                iEncodedLength += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().toDERObject().encodedLength();
            }
            this.bodyLength = iEncodedLength;
        }
        return this.bodyLength;
    }

    @Override // org.spongycastle.asn1.ASN1Sequence, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        ASN1OutputStream dERSubStream = aSN1OutputStream.getDERSubStream();
        int bodyLength = getBodyLength();
        aSN1OutputStream.write(48);
        aSN1OutputStream.writeLength(bodyLength);
        Enumeration objects = getObjects();
        while (objects.hasMoreElements()) {
            dERSubStream.writeObject((ASN1Encodable) objects.nextElement());
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        int bodyLength = getBodyLength();
        return StreamUtil.calculateBodyLength(bodyLength) + 1 + bodyLength;
    }

    public DERSequence(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
        this.bodyLength = -1;
    }

    public DERSequence(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector);
        this.bodyLength = -1;
    }

    public DERSequence(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr);
        this.bodyLength = -1;
    }
}
