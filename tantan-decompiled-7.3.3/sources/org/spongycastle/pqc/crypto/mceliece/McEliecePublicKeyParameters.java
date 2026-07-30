package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g */
    private GF2Matrix f207862g;

    /* JADX INFO: renamed from: n */
    private int f207863n;
    private String oid;

    /* JADX INFO: renamed from: t */
    private int f207864t;

    public McEliecePublicKeyParameters(String str, int i, int i2, GF2Matrix gF2Matrix, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f207863n = i;
        this.f207864t = i2;
        this.f207862g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f207862g;
    }

    public int getK() {
        return this.f207862g.getNumRows();
    }

    public int getN() {
        return this.f207863n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f207864t;
    }

    public McEliecePublicKeyParameters(String str, int i, int i2, byte[] bArr, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f207863n = i2;
        this.f207864t = i;
        this.f207862g = new GF2Matrix(bArr);
    }
}
