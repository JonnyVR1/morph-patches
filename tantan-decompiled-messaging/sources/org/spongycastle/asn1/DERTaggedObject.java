package org.spongycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DERTaggedObject extends ASN1TaggedObject {
    private static final byte[] ZERO_BYTES = new byte[0];

    public DERTaggedObject(int i, ASN1Encodable aSN1Encodable) {
        super(true, i, aSN1Encodable);
    }

    @Override // org.spongycastle.asn1.ASN1TaggedObject, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        if (this.empty) {
            aSN1OutputStream.writeEncoded(160, this.tagNo, ZERO_BYTES);
            return;
        }
        ASN1Primitive dERObject = this.obj.toASN1Primitive().toDERObject();
        if (!this.explicit) {
            aSN1OutputStream.writeTag(dERObject.isConstructed() ? 160 : 128, this.tagNo);
            aSN1OutputStream.writeImplicitObject(dERObject);
        } else {
            aSN1OutputStream.writeTag(160, this.tagNo);
            aSN1OutputStream.writeLength(dERObject.encodedLength());
            aSN1OutputStream.writeObject(dERObject);
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        int iEncodedLength = this.obj.toASN1Primitive().toDERObject().encodedLength();
        boolean z = this.explicit;
        int i = this.tagNo;
        if (z) {
            return StreamUtil.calculateTagLength(i) + StreamUtil.calculateBodyLength(iEncodedLength) + iEncodedLength;
        }
        return StreamUtil.calculateTagLength(i) + (iEncodedLength - 1);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        if (this.empty || this.explicit) {
            return true;
        }
        return this.obj.toASN1Primitive().toDERObject().isConstructed();
    }

    public DERTaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }
}
