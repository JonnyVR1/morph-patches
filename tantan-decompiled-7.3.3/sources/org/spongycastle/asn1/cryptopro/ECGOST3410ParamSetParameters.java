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
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f207160a;

    /* JADX INFO: renamed from: b */
    ASN1Integer f207161b;

    /* JADX INFO: renamed from: p */
    ASN1Integer f207162p;

    /* JADX INFO: renamed from: q */
    ASN1Integer f207163q;

    /* JADX INFO: renamed from: x */
    ASN1Integer f207164x;

    /* JADX INFO: renamed from: y */
    ASN1Integer f207165y;

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f207160a = (ASN1Integer) objects.nextElement();
        this.f207161b = (ASN1Integer) objects.nextElement();
        this.f207162p = (ASN1Integer) objects.nextElement();
        this.f207163q = (ASN1Integer) objects.nextElement();
        this.f207164x = (ASN1Integer) objects.nextElement();
        this.f207165y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        wg3.m206174a("Invalid GOST3410Parameter: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getA() {
        return this.f207160a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f207162p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f207163q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f207160a);
        aSN1EncodableVector.add(this.f207161b);
        aSN1EncodableVector.add(this.f207162p);
        aSN1EncodableVector.add(this.f207163q);
        aSN1EncodableVector.add(this.f207164x);
        aSN1EncodableVector.add(this.f207165y);
        return new DERSequence(aSN1EncodableVector);
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f207160a = new ASN1Integer(bigInteger);
        this.f207161b = new ASN1Integer(bigInteger2);
        this.f207162p = new ASN1Integer(bigInteger3);
        this.f207163q = new ASN1Integer(bigInteger4);
        this.f207164x = new ASN1Integer(i);
        this.f207165y = new ASN1Integer(bigInteger5);
    }
}
