package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m */
    private int f206928m;

    /* JADX INFO: renamed from: n */
    private int f206929n;

    /* JADX INFO: renamed from: t */
    private int f206930t;

    public McElieceParameters(int i, int i2, int i3) throws IllegalArgumentException {
        this.f206928m = i;
        if (i < 1) {
            ig3.m135964a("m must be positive");
            throw null;
        }
        if (i > 32) {
            ig3.m135964a(" m is too large");
            throw null;
        }
        int i4 = 1 << i;
        this.f206929n = i4;
        this.f206930t = i2;
        if (i2 < 0) {
            ig3.m135964a("t must be positive");
            throw null;
        }
        if (i2 > i4) {
            ig3.m135964a("t must be less than n = 2^m");
            throw null;
        }
        if (PolynomialRingGF2.degree(i3) == i && PolynomialRingGF2.isIrreducible(i3)) {
            this.fieldPoly = i3;
        } else {
            ig3.m135964a("polynomial is not a field polynomial for GF(2^m)");
            throw null;
        }
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f206928m;
    }

    public int getN() {
        return this.f206929n;
    }

    public int getT() {
        return this.f206930t;
    }

    public McElieceParameters(int i) throws IllegalArgumentException {
        if (i >= 1) {
            this.f206928m = 0;
            this.f206929n = 1;
            while (true) {
                int i2 = this.f206929n;
                if (i2 < i) {
                    this.f206929n = i2 << 1;
                    this.f206928m++;
                } else {
                    int i3 = i2 >>> 1;
                    this.f206930t = i3;
                    int i4 = this.f206928m;
                    this.f206930t = i3 / i4;
                    this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i4);
                    return;
                }
            }
        } else {
            ig3.m135964a("key size must be positive");
            throw null;
        }
    }

    public McElieceParameters(int i, int i2) throws IllegalArgumentException {
        if (i < 1) {
            ig3.m135964a("m must be positive");
            throw null;
        }
        if (i <= 32) {
            this.f206928m = i;
            int i3 = 1 << i;
            this.f206929n = i3;
            if (i2 < 0) {
                ig3.m135964a("t must be positive");
                throw null;
            }
            if (i2 <= i3) {
                this.f206930t = i2;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i);
                return;
            } else {
                ig3.m135964a("t must be less than n = 2^m");
                throw null;
            }
        }
        ig3.m135964a("m is too large");
        throw null;
    }

    public McElieceParameters() {
        this(11, 50);
    }
}
