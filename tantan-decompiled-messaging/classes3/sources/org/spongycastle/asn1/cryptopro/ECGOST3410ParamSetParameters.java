package org.spongycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f9863a;

    /* JADX INFO: renamed from: b */
    ASN1Integer f9864b;

    /* JADX INFO: renamed from: p */
    ASN1Integer f9865p;

    /* JADX INFO: renamed from: q */
    ASN1Integer f9866q;

    /* JADX INFO: renamed from: x */
    ASN1Integer f9867x;

    /* JADX INFO: renamed from: y */
    ASN1Integer f9868y;

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f9863a = (ASN1Integer) objects.nextElement();
        this.f9864b = (ASN1Integer) objects.nextElement();
        this.f9865p = (ASN1Integer) objects.nextElement();
        this.f9866q = (ASN1Integer) objects.nextElement();
        this.f9867x = (ASN1Integer) objects.nextElement();
        this.f9868y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        ig3.a("Invalid GOST3410Parameter: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getA() {
        return this.f9863a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f9865p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f9866q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f9863a);
        aSN1EncodableVector.add(this.f9864b);
        aSN1EncodableVector.add(this.f9865p);
        aSN1EncodableVector.add(this.f9866q);
        aSN1EncodableVector.add(this.f9867x);
        aSN1EncodableVector.add(this.f9868y);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f9863a = new ASN1Integer(bigInteger);
        this.f9864b = new ASN1Integer(bigInteger2);
        this.f9865p = new ASN1Integer(bigInteger3);
        this.f9866q = new ASN1Integer(bigInteger4);
        this.f9867x = new ASN1Integer(i);
        this.f9868y = new ASN1Integer(bigInteger5);
    }
}
