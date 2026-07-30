package org.spongycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f206245a;
    int keySize;

    /* JADX INFO: renamed from: p */
    ASN1Integer f206246p;

    /* JADX INFO: renamed from: q */
    ASN1Integer f206247q;

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).getValue().intValue();
        this.f206246p = (ASN1Integer) objects.nextElement();
        this.f206247q = (ASN1Integer) objects.nextElement();
        this.f206245a = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        ig3.m135964a("Invalid GOST3410Parameter: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getA() {
        return this.f206245a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f206246p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f206247q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.keySize));
        aSN1EncodableVector.add(this.f206246p);
        aSN1EncodableVector.add(this.f206247q);
        aSN1EncodableVector.add(this.f206245a);
        return new DERSequence(aSN1EncodableVector);
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public GOST3410ParamSetParameters(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i;
        this.f206246p = new ASN1Integer(bigInteger);
        this.f206247q = new ASN1Integer(bigInteger2);
        this.f206245a = new ASN1Integer(bigInteger3);
    }
}
