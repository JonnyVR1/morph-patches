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

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePrivateKey extends ASN1Object {
    private byte[] encField;
    private byte[] encGp;
    private byte[] encH;
    private byte[] encP1;
    private byte[] encP2;
    private byte[] encSInv;
    private byte[][] encqInv;

    /* JADX INFO: renamed from: k */
    private int f206880k;

    /* JADX INFO: renamed from: n */
    private int f206881n;
    private ASN1ObjectIdentifier oid;

    private McEliecePrivateKey(ASN1Sequence aSN1Sequence) {
        this.oid = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.f206881n = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue().intValue();
        this.f206880k = ((ASN1Integer) aSN1Sequence.getObjectAt(2)).getValue().intValue();
        this.encField = ((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets();
        this.encGp = ((ASN1OctetString) aSN1Sequence.getObjectAt(4)).getOctets();
        this.encSInv = ((ASN1OctetString) aSN1Sequence.getObjectAt(5)).getOctets();
        this.encP1 = ((ASN1OctetString) aSN1Sequence.getObjectAt(6)).getOctets();
        this.encP2 = ((ASN1OctetString) aSN1Sequence.getObjectAt(7)).getOctets();
        this.encH = ((ASN1OctetString) aSN1Sequence.getObjectAt(8)).getOctets();
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(9);
        this.encqInv = new byte[aSN1Sequence2.size()][];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            this.encqInv[i] = ((ASN1OctetString) aSN1Sequence2.getObjectAt(i)).getOctets();
        }
    }

    public static McEliecePrivateKey getInstance(Object obj) {
        if (obj instanceof McEliecePrivateKey) {
            return (McEliecePrivateKey) obj;
        }
        if (obj != null) {
            return new McEliecePrivateKey(ASN1Sequence.getInstance(obj));
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
        return this.f206880k;
    }

    public int getN() {
        return this.f206881n;
    }

    public ASN1ObjectIdentifier getOID() {
        return this.oid;
    }

    public Permutation getP1() {
        return new Permutation(this.encP1);
    }

    public Permutation getP2() {
        return new Permutation(this.encP2);
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

    public GF2Matrix getSInv() {
        return new GF2Matrix(this.encSInv);
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.oid);
        aSN1EncodableVector.add(new ASN1Integer(this.f206881n));
        aSN1EncodableVector.add(new ASN1Integer(this.f206880k));
        aSN1EncodableVector.add(new DEROctetString(this.encField));
        aSN1EncodableVector.add(new DEROctetString(this.encGp));
        aSN1EncodableVector.add(new DEROctetString(this.encSInv));
        aSN1EncodableVector.add(new DEROctetString(this.encP1));
        aSN1EncodableVector.add(new DEROctetString(this.encP2));
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

    public McEliecePrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, int i2, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, GF2Matrix gF2Matrix, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix2, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        this.oid = aSN1ObjectIdentifier;
        this.f206881n = i;
        this.f206880k = i2;
        this.encField = gF2mField.getEncoded();
        this.encGp = polynomialGF2mSmallM.getEncoded();
        this.encSInv = gF2Matrix.getEncoded();
        this.encP1 = permutation.getEncoded();
        this.encP2 = permutation2.getEncoded();
        this.encH = gF2Matrix2.getEncoded();
        this.encqInv = new byte[polynomialGF2mSmallMArr.length][];
        for (int i3 = 0; i3 != polynomialGF2mSmallMArr.length; i3++) {
            this.encqInv[i3] = polynomialGF2mSmallMArr[i3].getEncoded();
        }
    }
}
