package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    ASN1Integer f206264g;

    /* JADX INFO: renamed from: l */
    ASN1Integer f206265l;

    /* JADX INFO: renamed from: p */
    ASN1Integer f206266p;

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f206266p = ASN1Integer.getInstance(objects.nextElement());
        this.f206264g = ASN1Integer.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.f206265l = (ASN1Integer) objects.nextElement();
        } else {
            this.f206265l = null;
        }
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f206264g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f206265l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f206266p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f206266p);
        aSN1EncodableVector.add(this.f206264g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f206265l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f206266p = new ASN1Integer(bigInteger);
        this.f206264g = new ASN1Integer(bigInteger2);
        if (i != 0) {
            this.f206265l = new ASN1Integer(i);
        } else {
            this.f206265l = null;
        }
    }
}
