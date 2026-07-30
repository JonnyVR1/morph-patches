package org.spongycastle.pqc.asn1;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class McElieceCCA2PrivateKey extends ASN1Object {
    private byte[] encField;
    private byte[] encGp;
    private byte[] encH;
    private byte[] encP;
    private byte[][] encqInv;

    /* JADX INFO: renamed from: k */
    private int f10501k;

    /* JADX INFO: renamed from: n */
    private int f10502n;
    private ASN1ObjectIdentifier oid;

    private McElieceCCA2PrivateKey(ASN1Sequence aSN1Sequence) {
        this.oid = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.f10502n = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f10501k = ((ASN1Integer) aSN1Sequence.getObjectAt(2)).getValue().intValue();
        this.encField = ((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
        this.encGp = ((ASN1OctetString) aSN1Sequence.getObjectAt(4)).getOctets();
        this.encP = ((ASN1OctetString) aSN1Sequence.getObjectAt(5)).getOctets();
        this.encH = ((ASN1OctetString) aSN1Sequence.getObjectAt(6)).getOctets();
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(7);
        this.encqInv = new byte[aSN1Sequence2.size()][];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            this.encqInv[i] = ((ASN1OctetString) aSN1Sequence2.getObjectAt(i)).getOctets();
        }
    }

    public static McElieceCCA2PrivateKey getInstance(Object obj) {
        if (obj instanceof McElieceCCA2PrivateKey) {
            return (McElieceCCA2PrivateKey) obj;
        }
        if (obj != null) {
            return new McElieceCCA2PrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2mField getField() {
        return new GF2mField(this.encField);
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return new PolynomialGF2mSmallM(getField(), this.encGp);
    }

    public GF2Matrix getH() {
        return new GF2Matrix(this.encH);
    }

    public int getK() {
        return this.f10501k;
    }

    public int getN() {
        return this.f10502n;
    }

    public ASN1ObjectIdentifier getOID() {
        return this.oid;
    }

    public Permutation getP() {
        return new Permutation(this.encP);
    }

    public PolynomialGF2mSmallM[] getQInv() {
        PolynomialGF2mSmallM[] polynomialGF2mSmallMArr = new PolynomialGF2mSmallM[this.encqInv.length];
        GF2mField field = getField();
        int i = 0;
        while (true) {
            byte[][] bArr = this.encqInv;
            if (i >= bArr.length) {
                return polynomialGF2mSmallMArr;
            }
            polynomialGF2mSmallMArr[i] = new PolynomialGF2mSmallM(field, bArr[i]);
            i++;
        }
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.oid);
        aSN1EncodableVector.add(new ASN1Integer(this.f10502n));
        aSN1EncodableVector.add(new ASN1Integer(this.f10501k));
        aSN1EncodableVector.add(new DEROctetString(this.encField));
        aSN1EncodableVector.add(new DEROctetString(this.encGp));
        aSN1EncodableVector.add(new DEROctetString(this.encP));
        aSN1EncodableVector.add(new DEROctetString(this.encH));
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            byte[][] bArr = this.encqInv;
            if (i >= bArr.length) {
                aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
                return new DERSequence(aSN1EncodableVector);
            }
            aSN1EncodableVector2.add(new DEROctetString(bArr[i]));
            i++;
        }
    }

    public McElieceCCA2PrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, int i2, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, GF2Matrix gF2Matrix, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        this.oid = aSN1ObjectIdentifier;
        this.f10502n = i;
        this.f10501k = i2;
        this.encField = gF2mField.getEncoded();
        this.encGp = polynomialGF2mSmallM.getEncoded();
        this.encP = permutation.getEncoded();
        this.encH = gF2Matrix.getEncoded();
        this.encqInv = new byte[polynomialGF2mSmallMArr.length][];
        for (int i3 = 0; i3 != polynomialGF2mSmallMArr.length; i3++) {
            this.encqInv[i3] = polynomialGF2mSmallMArr[i3].getEncoded();
        }
    }
}
