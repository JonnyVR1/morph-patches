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
    ASN1Integer f207186g;

    /* JADX INFO: renamed from: l */
    ASN1Integer f207187l;

    /* JADX INFO: renamed from: p */
    ASN1Integer f207188p;

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f207188p = ASN1Integer.getInstance(objects.nextElement());
        this.f207186g = ASN1Integer.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.f207187l = (ASN1Integer) objects.nextElement();
        } else {
            this.f207187l = null;
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
        return this.f207186g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f207187l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f207188p.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f207188p);
        aSN1EncodableVector.add(this.f207186g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f207187l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f207188p = new ASN1Integer(bigInteger);
        this.f207186g = new ASN1Integer(bigInteger2);
        if (i != 0) {
            this.f207187l = new ASN1Integer(i);
        } else {
            this.f207187l = null;
        }
    }
}
