package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2PrivateKeyParameters extends McElieceCCA2KeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* JADX INFO: renamed from: h */
    private GF2Matrix f206907h;

    /* JADX INFO: renamed from: k */
    private int f206908k;

    /* JADX INFO: renamed from: n */
    private int f206909n;
    private String oid;

    /* JADX INFO: renamed from: p */
    private Permutation f206910p;
    private PolynomialGF2mSmallM[] qInv;

    public McElieceCCA2PrivateKeyParameters(String str, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][] bArr5, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(true, mcElieceCCA2Parameters);
        this.oid = str;
        this.f206909n = i;
        this.f206908k = i2;
        GF2mField gF2mField = new GF2mField(bArr);
        this.field = gF2mField;
        this.goppaPoly = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.f206910p = new Permutation(bArr3);
        this.f206907h = new GF2Matrix(bArr4);
        this.qInv = new PolynomialGF2mSmallM[bArr5.length];
        for (int i3 = 0; i3 < bArr5.length; i3++) {
            this.qInv[i3] = new PolynomialGF2mSmallM(this.field, bArr5[i3]);
        }
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f206907h;
    }

    public int getK() {
        return this.f206908k;
    }

    public int getN() {
        return this.f206909n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public Permutation getP() {
        return this.f206910p;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public int getT() {
        return this.goppaPoly.getDegree();
    }

    public McElieceCCA2PrivateKeyParameters(String str, int i, int i2, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, GF2Matrix gF2Matrix, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(true, mcElieceCCA2Parameters);
        this.oid = str;
        this.f206909n = i;
        this.f206908k = i2;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.f206910p = permutation;
        this.f206907h = gF2Matrix;
        this.qInv = polynomialGF2mSmallMArr;
    }
}
