package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n */
    private int f206911n;
    private String oid;

    /* JADX INFO: renamed from: t */
    private int f206912t;

    public McElieceCCA2PublicKeyParameters(String str, int i, int i2, GF2Matrix gF2Matrix, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(false, mcElieceCCA2Parameters);
        this.oid = str;
        this.f206911n = i;
        this.f206912t = i2;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public GF2Matrix getMatrixG() {
        return this.matrixG;
    }

    public int getN() {
        return this.f206911n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f206912t;
    }

    public McElieceCCA2PublicKeyParameters(String str, int i, int i2, byte[] bArr, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(false, mcElieceCCA2Parameters);
        this.oid = str;
        this.f206911n = i;
        this.f206912t = i2;
        this.matrixG = new GF2Matrix(bArr);
    }
}
