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
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f206238a;

    /* JADX INFO: renamed from: b */
    ASN1Integer f206239b;

    /* JADX INFO: renamed from: p */
    ASN1Integer f206240p;

    /* JADX INFO: renamed from: q */
    ASN1Integer f206241q;

    /* JADX INFO: renamed from: x */
    ASN1Integer f206242x;

    /* JADX INFO: renamed from: y */
    ASN1Integer f206243y;

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f206238a = (ASN1Integer) objects.nextElement();
        this.f206239b = (ASN1Integer) objects.nextElement();
        this.f206240p = (ASN1Integer) objects.nextElement();
        this.f206241q = (ASN1Integer) objects.nextElement();
        this.f206242x = (ASN1Integer) objects.nextElement();
        this.f206243y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        ig3.m135964a("Invalid GOST3410Parameter: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getA() {
        return this.f206238a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f206240p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f206241q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f206238a);
        aSN1EncodableVector.add(this.f206239b);
        aSN1EncodableVector.add(this.f206240p);
        aSN1EncodableVector.add(this.f206241q);
        aSN1EncodableVector.add(this.f206242x);
        aSN1EncodableVector.add(this.f206243y);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f206238a = new ASN1Integer(bigInteger);
        this.f206239b = new ASN1Integer(bigInteger2);
        this.f206240p = new ASN1Integer(bigInteger3);
        this.f206241q = new ASN1Integer(bigInteger4);
        this.f206242x = new ASN1Integer(i);
        this.f206243y = new ASN1Integer(bigInteger5);
    }
}
