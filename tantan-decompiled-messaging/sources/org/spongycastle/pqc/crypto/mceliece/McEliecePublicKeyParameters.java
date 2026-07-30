package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g */
    private GF2Matrix f206940g;

    /* JADX INFO: renamed from: n */
    private int f206941n;
    private String oid;

    /* JADX INFO: renamed from: t */
    private int f206942t;

    public McEliecePublicKeyParameters(String str, int i, int i2, GF2Matrix gF2Matrix, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f206941n = i;
        this.f206942t = i2;
        this.f206940g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f206940g;
    }

    public int getK() {
        return this.f206940g.getNumRows();
    }

    public int getN() {
        return this.f206941n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f206942t;
    }

    public McEliecePublicKeyParameters(String str, int i, int i2, byte[] bArr, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f206941n = i2;
        this.f206942t = i;
        this.f206940g = new GF2Matrix(bArr);
    }
}
