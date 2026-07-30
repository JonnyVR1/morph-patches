package org.spongycastle.crypto.p133ec;

import org.spongycastle.math.p135ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPair {

    /* JADX INFO: renamed from: x */
    private final ECPoint f207410x;

    /* JADX INFO: renamed from: y */
    private final ECPoint f207411y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f207410x = eCPoint;
        this.f207411y = eCPoint2;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f207410x;
    }

    public ECPoint getY() {
        return this.f207411y;
    }

    public int hashCode() {
        return this.f207410x.hashCode() + (this.f207411y.hashCode() * 37);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }
}
