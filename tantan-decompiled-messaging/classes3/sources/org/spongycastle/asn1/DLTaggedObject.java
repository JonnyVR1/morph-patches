package org.spongycastle.asn1;

import java.io.IOException;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DLTaggedObject extends ASN1TaggedObject {
    private static final byte[] ZERO_BYTES = new byte[0];

    public DLTaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    @Override // org.spongycastle.asn1.ASN1TaggedObject, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        boolean z = this.empty;
        int i = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
        if (z) {
            aSN1OutputStream.writeEncoded(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, this.tagNo, ZERO_BYTES);
            return;
        }
        ASN1Primitive dLObject = this.obj.toASN1Primitive().toDLObject();
        if (this.explicit) {
            aSN1OutputStream.writeTag(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, this.tagNo);
            aSN1OutputStream.writeLength(dLObject.encodedLength());
            aSN1OutputStream.writeObject(dLObject);
        } else {
            if (!dLObject.isConstructed()) {
                i = 128;
            }
            aSN1OutputStream.writeTag(i, this.tagNo);
            aSN1OutputStream.writeImplicitObject(dLObject);
        }
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        int iEncodedLength = this.obj.toASN1Primitive().toDLObject().encodedLength();
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
        return this.obj.toASN1Primitive().toDLObject().isConstructed();
    }
}
