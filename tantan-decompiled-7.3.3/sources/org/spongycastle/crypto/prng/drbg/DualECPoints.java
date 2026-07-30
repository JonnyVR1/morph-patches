package org.spongycastle.crypto.prng.drbg;

import org.spongycastle.math.p135ec.ECPoint;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class DualECPoints {
    private final int cofactor;

    /* JADX INFO: renamed from: p */
    private final ECPoint f207674p;

    /* JADX INFO: renamed from: q */
    private final ECPoint f207675q;
    private final int securityStrength;

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i2) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            wg3.m206174a("points need to be on the same curve");
            throw null;
        }
        this.securityStrength = i;
        this.f207674p = eCPoint;
        this.f207675q = eCPoint2;
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
        return ((this.f207674p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f207674p;
    }

    public ECPoint getQ() {
        return this.f207675q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f207674p.getCurve().getFieldSize();
    }
}
