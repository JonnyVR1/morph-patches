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
public class GOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f9870a;
    int keySize;

    /* JADX INFO: renamed from: p */
    ASN1Integer f9871p;

    /* JADX INFO: renamed from: q */
    ASN1Integer f9872q;

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).getValue().intValue();
        this.f9871p = (ASN1Integer) objects.nextElement();
        this.f9872q = (ASN1Integer) objects.nextElement();
        this.f9870a = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        ig3.a("Invalid GOST3410Parameter: ".concat(obj.getClass().getName()));
        return null;
    }

    public BigInteger getA() {
        return this.f9870a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f9871p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f9872q.getPositiveValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.keySize));
        aSN1EncodableVector.add(this.f9871p);
        aSN1EncodableVector.add(this.f9872q);
        aSN1EncodableVector.add(this.f9870a);
        return new DERSequence(aSN1EncodableVector);
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public GOST3410ParamSetParameters(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i;
        this.f9871p = new ASN1Integer(bigInteger);
        this.f9872q = new ASN1Integer(bigInteger2);
        this.f9870a = new ASN1Integer(bigInteger3);
    }
}
