package org.spongycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g */
    ASN1Integer f9889g;

    /* JADX INFO: renamed from: l */
    ASN1Integer f9890l;

    /* JADX INFO: renamed from: p */
    ASN1Integer f9891p;

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f9891p = ASN1Integer.getInstance(objects.nextElement());
        this.f9889g = ASN1Integer.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.f9890l = (ASN1Integer) objects.nextElement();
        } else {
            this.f9890l = null;
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
        return this.f9889g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f9890l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f9891p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f9891p);
        aSN1EncodableVector.add(this.f9889g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f9890l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f9891p = new ASN1Integer(bigInteger);
        this.f9889g = new ASN1Integer(bigInteger2);
        if (i != 0) {
            this.f9890l = new ASN1Integer(i);
        } else {
            this.f9890l = null;
        }
    }
}
