package org.spongycastle.asn1.p127ua;

import java.math.BigInteger;
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
import org.spongycastle.math.p131ec.ECAlgorithms;
import org.spongycastle.math.p131ec.ECCurve;
import org.spongycastle.util.Arrays;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145ECBinary extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f206273a;

    /* JADX INFO: renamed from: b */
    ASN1OctetString f206274b;

    /* JADX INFO: renamed from: bp */
    ASN1OctetString f206275bp;

    /* JADX INFO: renamed from: f */
    DSTU4145BinaryField f206276f;

    /* JADX INFO: renamed from: n */
    ASN1Integer f206277n;
    BigInteger version;

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        this.version = BigInteger.valueOf(0L);
        ECCurve curve = eCDomainParameters.getCurve();
        if (!ECAlgorithms.isF2mCurve(curve)) {
            ig3.m135964a("only binary domain is possible");
            throw null;
        }
        int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            this.f206276f = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                ig3.m135964a("curve must have a trinomial or pentanomial basis");
                throw null;
            }
            this.f206276f = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.f206273a = new ASN1Integer(curve.getA().toBigInteger());
        this.f206274b = new DEROctetString(curve.getB().getEncoded());
        this.f206277n = new ASN1Integer(eCDomainParameters.getN());
        this.f206275bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
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
        return this.f206273a.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f206274b.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f206276f;
    }

    public byte[] getG() {
        return Arrays.clone(this.f206275bp.getOctets());
    }

    public BigInteger getN() {
        return this.f206277n.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version.compareTo(BigInteger.valueOf(0L)) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new ASN1Integer(this.version)));
        }
        aSN1EncodableVector.add(this.f206276f);
        aSN1EncodableVector.add(this.f206273a);
        aSN1EncodableVector.add(this.f206274b);
        aSN1EncodableVector.add(this.f206277n);
        aSN1EncodableVector.add(this.f206275bp);
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
                ig3.m135964a("object parse error");
                throw null;
            }
        }
        this.f206276f = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i));
        this.f206273a = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.f206274b = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.f206277n = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 3));
        this.f206275bp = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 4));
    }
}
