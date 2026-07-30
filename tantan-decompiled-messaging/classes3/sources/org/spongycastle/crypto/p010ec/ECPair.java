package org.spongycastle.crypto.p010ec;

import org.spongycastle.math.p012ec.ECPoint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ECPair {

    /* JADX INFO: renamed from: x */
    private final ECPoint f10113x;

    /* JADX INFO: renamed from: y */
    private final ECPoint f10114y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f10113x = eCPoint;
        this.f10114y = eCPoint2;
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }

    public ECPoint getX() {
        return this.f10113x;
    }

    public ECPoint getY() {
        return this.f10114y;
    }

    public int hashCode() {
        return this.f10113x.hashCode() + (this.f10114y.hashCode() * 37);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }
}
