package org.spongycastle.asn1.misc;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CAST5CBCParameters extends ASN1Object {

    /* JADX INFO: renamed from: iv */
    ASN1OctetString f9883iv;
    ASN1Integer keyLength;

    public CAST5CBCParameters(ASN1Sequence aSN1Sequence) {
        this.f9883iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.keyLength = (ASN1Integer) aSN1Sequence.getObjectAt(1);
    }

    public static CAST5CBCParameters getInstance(Object obj) {
        if (obj instanceof CAST5CBCParameters) {
            return (CAST5CBCParameters) obj;
        }
        if (obj != null) {
            return new CAST5CBCParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getIV() {
        return this.f9883iv.getOctets();
    }

    public int getKeyLength() {
        return this.keyLength.getValue().intValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f9883iv);
        aSN1EncodableVector.add(this.keyLength);
        return new DERSequence(aSN1EncodableVector);
    }

    public CAST5CBCParameters(byte[] bArr, int i) {
        this.f9883iv = new DEROctetString(bArr);
        this.keyLength = new ASN1Integer(i);
    }
}
