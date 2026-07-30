package org.spongycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERSequence;
import p003l.bub;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSAParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    ASN1Integer f9923g;

    /* JADX INFO: renamed from: p */
    ASN1Integer f9924p;

    /* JADX INFO: renamed from: q */
    ASN1Integer f9925q;

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            bub.m3170a("Bad sequence size: ", aSN1Sequence.size());
            throw null;
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f9924p = ASN1Integer.getInstance(objects.nextElement());
        this.f9925q = ASN1Integer.getInstance(objects.nextElement());
        this.f9923g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f9923g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f9924p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f9925q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f9924p);
        aSN1EncodableVector.add(this.f9925q);
        aSN1EncodableVector.add(this.f9923g);
        return new DERSequence(aSN1EncodableVector);
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f9924p = new ASN1Integer(bigInteger);
        this.f9925q = new ASN1Integer(bigInteger2);
        this.f9923g = new ASN1Integer(bigInteger3);
    }
}
