package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePrivateKeyParameters extends McElieceKeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* JADX INFO: renamed from: h */
    private GF2Matrix f206935h;

    /* JADX INFO: renamed from: k */
    private int f206936k;

    /* JADX INFO: renamed from: n */
    private int f206937n;
    private String oid;

    /* JADX INFO: renamed from: p1 */
    private Permutation f206938p1;

    /* JADX INFO: renamed from: p2 */
    private Permutation f206939p2;
    private PolynomialGF2mSmallM[] qInv;
    private GF2Matrix sInv;

    public McEliecePrivateKeyParameters(String str, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7, McElieceParameters mcElieceParameters) {
        super(true, mcElieceParameters);
        this.oid = str;
        this.f206937n = i;
        this.f206936k = i2;
        GF2mField gF2mField = new GF2mField(bArr);
        this.field = gF2mField;
        this.goppaPoly = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.sInv = new GF2Matrix(bArr3);
        this.f206938p1 = new Permutation(bArr4);
        this.f206939p2 = new Permutation(bArr5);
        this.f206935h = new GF2Matrix(bArr6);
        this.qInv = new PolynomialGF2mSmallM[bArr7.length];
        for (int i3 = 0; i3 < bArr7.length; i3++) {
            this.qInv[i3] = new PolynomialGF2mSmallM(this.field, bArr7[i3]);
        }
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f206935h;
    }

    public int getK() {
        return this.f206936k;
    }

    public int getN() {
        return this.f206937n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public Permutation getP1() {
        return this.f206938p1;
    }

    public Permutation getP2() {
        return this.f206939p2;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public GF2Matrix getSInv() {
        return this.sInv;
    }

    public McEliecePrivateKeyParameters(String str, int i, int i2, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, GF2Matrix gF2Matrix, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix2, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr, McElieceParameters mcElieceParameters) {
        super(true, mcElieceParameters);
        this.oid = str;
        this.f206936k = i2;
        this.f206937n = i;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.sInv = gF2Matrix;
        this.f206938p1 = permutation;
        this.f206939p2 = permutation2;
        this.f206935h = gF2Matrix2;
        this.qInv = polynomialGF2mSmallMArr;
    }
}
