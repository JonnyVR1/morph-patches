package org.spongycastle.asn1.p131ua;

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
import org.spongycastle.math.p135ec.ECAlgorithms;
import org.spongycastle.math.p135ec.ECCurve;
import org.spongycastle.util.Arrays;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU4145ECBinary extends ASN1Object {

    /* JADX INFO: renamed from: a */
    ASN1Integer f207195a;

    /* JADX INFO: renamed from: b */
    ASN1OctetString f207196b;

    /* JADX INFO: renamed from: bp */
    ASN1OctetString f207197bp;

    /* JADX INFO: renamed from: f */
    DSTU4145BinaryField f207198f;

    /* JADX INFO: renamed from: n */
    ASN1Integer f207199n;
    BigInteger version;

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        this.version = BigInteger.valueOf(0L);
        ECCurve curve = eCDomainParameters.getCurve();
        if (!ECAlgorithms.isF2mCurve(curve)) {
            wg3.m206174a("only binary domain is possible");
            throw null;
        }
        int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
        if (exponentsPresent.length == 3) {
            this.f207198f = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
        } else {
            if (exponentsPresent.length != 5) {
                wg3.m206174a("curve must have a trinomial or pentanomial basis");
                throw null;
            }
            this.f207198f = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
        }
        this.f207195a = new ASN1Integer(curve.getA().toBigInteger());
        this.f207196b = new DEROctetString(curve.getB().getEncoded());
        this.f207199n = new ASN1Integer(eCDomainParameters.getN());
        this.f207197bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
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
        return this.f207195a.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f207196b.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f207198f;
    }

    public byte[] getG() {
        return Arrays.clone(this.f207197bp.getOctets());
    }

    public BigInteger getN() {
        return this.f207199n.getValue();
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version.compareTo(BigInteger.valueOf(0L)) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new ASN1Integer(this.version)));
        }
        aSN1EncodableVector.add(this.f207198f);
        aSN1EncodableVector.add(this.f207195a);
        aSN1EncodableVector.add(this.f207196b);
        aSN1EncodableVector.add(this.f207199n);
        aSN1EncodableVector.add(this.f207197bp);
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
                wg3.m206174a("object parse error");
                throw null;
            }
        }
        this.f207198f = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i));
        this.f207195a = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.f207196b = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.f207199n = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 3));
        this.f207197bp = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i + 4));
    }
}
