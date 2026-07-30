package org.spongycastle.crypto.prng.drbg;

import org.spongycastle.math.p131ec.ECPoint;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public class DualECPoints {
    private final int cofactor;

    /* JADX INFO: renamed from: p */
    private final ECPoint f206752p;

    /* JADX INFO: renamed from: q */
    private final ECPoint f206753q;
    private final int securityStrength;

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i2) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            ig3.m135964a("points need to be on the same curve");
            throw null;
        }
        this.securityStrength = i;
        this.f206752p = eCPoint;
        this.f206753q = eCPoint2;
        this.cofactor = i2;
    }

    private static int log2(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f206752p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f206752p;
    }

    public ECPoint getQ() {
        return this.f206753q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f206752p.getCurve().getFieldSize();
    }
}
