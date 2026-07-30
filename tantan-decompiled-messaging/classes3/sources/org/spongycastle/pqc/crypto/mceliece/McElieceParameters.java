package org.spongycastle.pqc.crypto.mceliece;

import l.ig3;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m */
    private int f10553m;

    /* JADX INFO: renamed from: n */
    private int f10554n;

    /* JADX INFO: renamed from: t */
    private int f10555t;

    public McElieceParameters(int i, int i2, int i3) throws IllegalArgumentException {
        this.f10553m = i;
        if (i < 1) {
            ig3.a("m must be positive");
            throw null;
        }
        if (i > 32) {
            ig3.a(" m is too large");
            throw null;
        }
        int i4 = 1 << i;
        this.f10554n = i4;
        this.f10555t = i2;
        if (i2 < 0) {
            ig3.a("t must be positive");
            throw null;
        }
        if (i2 > i4) {
            ig3.a("t must be less than n = 2^m");
            throw null;
        }
        if (PolynomialRingGF2.degree(i3) == i && PolynomialRingGF2.isIrreducible(i3)) {
            this.fieldPoly = i3;
        } else {
            ig3.a("polynomial is not a field polynomial for GF(2^m)");
            throw null;
        }
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f10553m;
    }

    public int getN() {
        return this.f10554n;
    }

    public int getT() {
        return this.f10555t;
    }

    public McElieceParameters(int i) throws IllegalArgumentException {
        if (i >= 1) {
            this.f10553m = 0;
            this.f10554n = 1;
            while (true) {
                int i2 = this.f10554n;
                if (i2 < i) {
                    this.f10554n = i2 << 1;
                    this.f10553m++;
                } else {
                    int i3 = i2 >>> 1;
                    this.f10555t = i3;
                    int i4 = this.f10553m;
                    this.f10555t = i3 / i4;
                    this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i4);
                    return;
                }
            }
        } else {
            ig3.a("key size must be positive");
            throw null;
        }
    }

    public McElieceParameters(int i, int i2) throws IllegalArgumentException {
        if (i < 1) {
            ig3.a("m must be positive");
            throw null;
        }
        if (i <= 32) {
            this.f10553m = i;
            int i3 = 1 << i;
            this.f10554n = i3;
            if (i2 < 0) {
                ig3.a("t must be positive");
                throw null;
            }
            if (i2 <= i3) {
                this.f10555t = i2;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
                return;
            } else {
                ig3.a("t must be less than n = 2^m");
                throw null;
            }
        }
        ig3.a("m is too large");
        throw null;
    }

    public McElieceParameters() {
        this(11, 50);
    }
}
