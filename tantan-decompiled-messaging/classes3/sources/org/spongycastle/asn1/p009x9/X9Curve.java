package org.spongycastle.asn1.p009x9;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.math.p012ec.ECAlgorithms;
import org.spongycastle.math.p012ec.ECCurve;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {
    private ECCurve curve;
    private ASN1ObjectIdentifier fieldIdentifier;
    private byte[] seed;

    public X9Curve(X9FieldID x9FieldID, ASN1Sequence aSN1Sequence) {
        int iIntValue;
        int iIntValue2;
        int i;
        this.fieldIdentifier = null;
        ASN1ObjectIdentifier identifier = x9FieldID.getIdentifier();
        this.fieldIdentifier = identifier;
        if (identifier.equals(X9ObjectIdentifiers.prime_field)) {
            BigInteger value = ((ASN1Integer) x9FieldID.getParameters()).getValue();
            this.curve = new ECCurve.C1073Fp(value, new X9FieldElement(value, (ASN1OctetString) aSN1Sequence.getObjectAt(0)).getValue().toBigInteger(), new X9FieldElement(value, (ASN1OctetString) aSN1Sequence.getObjectAt(1)).getValue().toBigInteger());
        } else {
            if (!this.fieldIdentifier.equals(X9ObjectIdentifiers.characteristic_two_field)) {
                ig3.a("This type of ECCurve is not implemented");
                throw null;
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(x9FieldID.getParameters());
            int iIntValue3 = ((ASN1Integer) aSN1Sequence2.getObjectAt(0)).getValue().intValue();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1);
            if (aSN1ObjectIdentifier.equals(X9ObjectIdentifiers.tpBasis)) {
                iIntValue2 = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).getValue().intValue();
                i = 0;
                iIntValue = 0;
            } else {
                if (!aSN1ObjectIdentifier.equals(X9ObjectIdentifiers.ppBasis)) {
                    ig3.a("This type of EC basis is not implemented");
                    throw null;
                }
                ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1Sequence2.getObjectAt(2));
                int iIntValue4 = ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(0)).getValue().intValue();
                int iIntValue5 = ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(1)).getValue().intValue();
                iIntValue = ASN1Integer.getInstance(aSN1Sequence3.getObjectAt(2)).getValue().intValue();
                iIntValue2 = iIntValue4;
                i = iIntValue5;
            }
            this.curve = new ECCurve.F2m(iIntValue3, iIntValue2, i, iIntValue, new X9FieldElement(iIntValue3, iIntValue2, i, iIntValue, (ASN1OctetString) aSN1Sequence.getObjectAt(0)).getValue().toBigInteger(), new X9FieldElement(iIntValue3, iIntValue2, i, iIntValue, (ASN1OctetString) aSN1Sequence.getObjectAt(1)).getValue().toBigInteger());
        }
        if (aSN1Sequence.size() == 3) {
            this.seed = ((DERBitString) aSN1Sequence.getObjectAt(2)).getBytes();
        }
    }

    private void setFieldIdentifier() {
        if (ECAlgorithms.isFpCurve(this.curve)) {
            this.fieldIdentifier = X9ObjectIdentifiers.prime_field;
        } else if (ECAlgorithms.isF2mCurve(this.curve)) {
            this.fieldIdentifier = X9ObjectIdentifiers.characteristic_two_field;
        } else {
            ig3.a("This type of ECCurve is not implemented");
        }
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.fieldIdentifier.equals(X9ObjectIdentifiers.prime_field) || this.fieldIdentifier.equals(X9ObjectIdentifiers.characteristic_two_field)) {
            aSN1EncodableVector.add(new X9FieldElement(this.curve.getA()).toASN1Primitive());
            aSN1EncodableVector.add(new X9FieldElement(this.curve.getB()).toASN1Primitive());
        }
        if (this.seed != null) {
            aSN1EncodableVector.add(new DERBitString(this.seed));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9Curve(ECCurve eCCurve, byte[] bArr) {
        this.fieldIdentifier = null;
        this.curve = eCCurve;
        this.seed = bArr;
        setFieldIdentifier();
    }

    public X9Curve(ECCurve eCCurve) {
        this.fieldIdentifier = null;
        this.curve = eCCurve;
        this.seed = null;
        setFieldIdentifier();
    }
}
