package org.spongycastle.asn1.p008ua;

import java.math.BigInteger;
import l.ig3;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.math.p012ec.ECAlgorithms;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DSTU4145ECBinary extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f9898a;

    /* JADX INFO: renamed from: b */
    ASN1OctetString f9899b;

    /* JADX INFO: renamed from: bp */
    ASN1OctetString f9900bp;

    /* JADX INFO: renamed from: f */
    DSTU4145BinaryField f9901f;

    /* JADX INFO: renamed from: n */
    ASN1Integer f9902n;
    BigInteger version;

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        this.version = BigInteger.valueOf(0L);
        ECCurve curve = eCDomainParameters.getCurve();
        if (!ECAlgorithms.isF2mCurve(curve)) {
            ig3.a("only binary domain is possible");
            throw null;
        }
        int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            this.f9901f = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                ig3.a("curve must have a trinomial or pentanomial basis");
                throw null;
            }
            this.f9901f = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.f9898a = new ASN1Integer(curve.getA().toBigInteger());
        this.f9899b = new DEROctetString(curve.getB().getEncoded());
        this.f9902n = new ASN1Integer(eCDomainParameters.getN());
        this.f9900bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
    }

    public static DSTU4145ECBinary getInstance(Object obj) {
        if (obj instanceof DSTU4145ECBinary) {
            return (DSTU4145ECBinary) obj;
        }
        if (obj != null) {
            return new DSTU4145ECBinary(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getA() {
        return this.f9898a.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f9899b.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f9901f;
    }

    public byte[] getG() {
        return Arrays.clone(this.f9900bp.getOctets());
    }

    public BigInteger getN() {
        return this.f9902n.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version.compareTo(BigInteger.valueOf(0L)) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new ASN1Integer(this.version)));
        }
        aSN1EncodableVector.add(this.f9901f);
        aSN1EncodableVector.add(this.f9898a);
        aSN1EncodableVector.add(this.f9899b);
        aSN1EncodableVector.add(this.f9902n);
        aSN1EncodableVector.add(this.f9900bp);
        return new DERSequence(aSN1EncodableVector);
    }

    private DSTU4145ECBinary(ASN1Sequence aSN1Sequence) {
        this.version = BigInteger.valueOf(0L);
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (aSN1TaggedObject.isExplicit() && aSN1TaggedObject.getTagNo() == 0) {
                this.version = ASN1Integer.getInstance(aSN1TaggedObject.getLoadedObject()).getValue();
                i = 1;
            } else {
                ig3.a("object parse error");
                throw null;
            }
        }
        this.f9901f = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i));
        this.f9898a = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.f9899b = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.f9902n = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 3));
        this.f9900bp = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 4));
    }
}
