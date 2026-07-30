package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PKCS12PBEParams extends ASN1Object {
    ASN1Integer iterations;

    /* JADX INFO: renamed from: iv */
    ASN1OctetString f9892iv;

    private PKCS12PBEParams(ASN1Sequence aSN1Sequence) {
        this.f9892iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.iterations = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static PKCS12PBEParams getInstance(Object obj) {
        if (obj instanceof PKCS12PBEParams) {
            return (PKCS12PBEParams) obj;
        }
        if (obj != null) {
            return new PKCS12PBEParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getIV() {
        return this.f9892iv.getOctets();
    }

    public BigInteger getIterations() {
        return this.iterations.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f9892iv);
        aSN1EncodableVector.add(this.iterations);
        return new DERSequence(aSN1EncodableVector);
    }

    public PKCS12PBEParams(byte[] bArr, int i) {
        this.f9892iv = new DEROctetString(bArr);
        this.iterations = new ASN1Integer(i);
    }
}
