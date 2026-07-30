package org.spongycastle.asn1.p128x9;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class X9FieldID extends ASN1Object implements X9ObjectIdentifiers {

    /* JADX INFO: renamed from: id */
    private ASN1ObjectIdentifier f206328id;
    private ASN1Primitive parameters;

    public X9FieldID(int i, int i2, int i3, int i4) {
        this.f206328id = X9ObjectIdentifiers.characteristic_two_field;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(i));
        if (i3 == 0) {
            if (i4 != 0) {
                ig3.m135964a("inconsistent k values");
                throw null;
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.tpBasis);
            aSN1EncodableVector.add(new ASN1Integer(i2));
        } else {
            if (i3 <= i2 || i4 <= i3) {
                ig3.m135964a("inconsistent k values");
                throw null;
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.ppBasis);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(i2));
            aSN1EncodableVector2.add(new ASN1Integer(i3));
            aSN1EncodableVector2.add(new ASN1Integer(i4));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        this.parameters = new DERSequence(aSN1EncodableVector);
    }

    public static X9FieldID getInstance(Object obj) {
        if (obj instanceof X9FieldID) {
            return (X9FieldID) obj;
        }
        if (obj != null) {
            return new X9FieldID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getIdentifier() {
        return this.f206328id;
    }

    public ASN1Primitive getParameters() {
        return this.parameters;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f206328id);
        aSN1EncodableVector.add(this.parameters);
        return new DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public X9FieldID(BigInteger bigInteger) {
        this.f206328id = X9ObjectIdentifiers.prime_field;
        this.parameters = new ASN1Integer(bigInteger);
    }

    private X9FieldID(ASN1Sequence aSN1Sequence) {
        this.f206328id = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.parameters = aSN1Sequence.getObjectAt(1).toASN1Primitive();
    }
}
