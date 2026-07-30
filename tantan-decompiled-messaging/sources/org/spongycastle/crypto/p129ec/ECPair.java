package org.spongycastle.crypto.p129ec;

import org.spongycastle.math.p131ec.ECPoint;

/* JADX INFO: loaded from: classes3.dex */
public class ECPair {

    /* JADX INFO: renamed from: x */
    private final ECPoint f206488x;

    /* JADX INFO: renamed from: y */
    private final ECPoint f206489y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f206488x = eCPoint;
        this.f206489y = eCPoint2;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f206488x;
    }

    public ECPoint getY() {
        return this.f206489y;
    }

    public int hashCode() {
        return this.f206488x.hashCode() + (this.f206489y.hashCode() * 37);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }
}
