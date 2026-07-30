package org.spongycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class ElGamalParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    ASN1Integer f206262g;

    /* JADX INFO: renamed from: p */
    ASN1Integer f206263p;

    private ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f206263p = (ASN1Integer) objects.nextElement();
        this.f206262g = (ASN1Integer) objects.nextElement();
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f206262g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f206263p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f206263p);
        aSN1EncodableVector.add(this.f206262g);
        return new DERSequence(aSN1EncodableVector);
    }

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f206263p = new ASN1Integer(bigInteger);
        this.f206262g = new ASN1Integer(bigInteger2);
    }
}
