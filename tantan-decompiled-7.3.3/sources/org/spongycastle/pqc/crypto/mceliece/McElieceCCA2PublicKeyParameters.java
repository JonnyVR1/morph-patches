package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n */
    private int f207833n;
    private String oid;

    /* JADX INFO: renamed from: t */
    private int f207834t;

    public McElieceCCA2PublicKeyParameters(String str, int i, int i2, GF2Matrix gF2Matrix, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(false, mcElieceCCA2Parameters);
        this.oid = str;
        this.f207833n = i;
        this.f207834t = i2;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public GF2Matrix getMatrixG() {
        return this.matrixG;
    }

    public int getN() {
        return this.f207833n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f207834t;
    }

    public McElieceCCA2PublicKeyParameters(String str, int i, int i2, byte[] bArr, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(false, mcElieceCCA2Parameters);
        this.oid = str;
        this.f207833n = i;
        this.f207834t = i2;
        this.matrixG = new GF2Matrix(bArr);
    }
}
