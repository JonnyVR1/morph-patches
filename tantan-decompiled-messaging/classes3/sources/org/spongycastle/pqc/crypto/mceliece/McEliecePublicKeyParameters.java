package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g */
    private GF2Matrix f10565g;

    /* JADX INFO: renamed from: n */
    private int f10566n;
    private String oid;

    /* JADX INFO: renamed from: t */
    private int f10567t;

    public McEliecePublicKeyParameters(String str, int i, int i2, GF2Matrix gF2Matrix, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f10566n = i;
        this.f10567t = i2;
        this.f10565g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f10565g;
    }

    public int getK() {
        return this.f10565g.getNumRows();
    }

    public int getN() {
        return this.f10566n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f10567t;
    }

    public McEliecePublicKeyParameters(String str, int i, int i2, byte[] bArr, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f10566n = i2;
        this.f10567t = i;
        this.f10565g = new GF2Matrix(bArr);
    }
}
