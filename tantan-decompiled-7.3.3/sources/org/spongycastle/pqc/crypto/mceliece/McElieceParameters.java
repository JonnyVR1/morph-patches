package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m */
    private int f207850m;

    /* JADX INFO: renamed from: n */
    private int f207851n;

    /* JADX INFO: renamed from: t */
    private int f207852t;

    public McElieceParameters(int i, int i2, int i3) throws IllegalArgumentException {
        this.f207850m = i;
        if (i < 1) {
            wg3.m206174a("m must be positive");
            throw null;
        }
        if (i > 32) {
            wg3.m206174a(" m is too large");
            throw null;
        }
        int i4 = 1 << i;
        this.f207851n = i4;
        this.f207852t = i2;
        if (i2 < 0) {
            wg3.m206174a("t must be positive");
            throw null;
        }
        if (i2 > i4) {
            wg3.m206174a("t must be less than n = 2^m");
            throw null;
        }
        if (PolynomialRingGF2.degree(i3) == i && PolynomialRingGF2.isIrreducible(i3)) {
            this.fieldPoly = i3;
        } else {
            wg3.m206174a("polynomial is not a field polynomial for GF(2^m)");
            throw null;
        }
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f207850m;
    }

    public int getN() {
        return this.f207851n;
    }

    public int getT() {
        return this.f207852t;
    }

    public McElieceParameters(int i) throws IllegalArgumentException {
        if (i >= 1) {
            this.f207850m = 0;
            this.f207851n = 1;
            while (true) {
                int i2 = this.f207851n;
                if (i2 < i) {
                    this.f207851n = i2 << 1;
                    this.f207850m++;
                } else {
                    int i3 = i2 >>> 1;
                    this.f207852t = i3;
                    int i4 = this.f207850m;
                    this.f207852t = i3 / i4;
                    this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i4);
                    return;
                }
            }
        } else {
            wg3.m206174a("key size must be positive");
            throw null;
        }
    }

    public McElieceParameters(int i, int i2) throws IllegalArgumentException {
        if (i < 1) {
            wg3.m206174a("m must be positive");
            throw null;
        }
        if (i <= 32) {
            this.f207850m = i;
            int i3 = 1 << i;
            this.f207851n = i3;
            if (i2 < 0) {
                wg3.m206174a("t must be positive");
                throw null;
            }
            if (i2 <= i3) {
                this.f207852t = i2;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
                return;
            } else {
                wg3.m206174a("t must be less than n = 2^m");
                throw null;
            }
        }
        wg3.m206174a("m is too large");
        throw null;
    }

    public McElieceParameters() {
        this(11, 50);
    }
}
