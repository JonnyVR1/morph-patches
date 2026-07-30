package org.spongycastle.math.p012ec;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FixedPointPreCompInfo implements PreCompInfo {
    protected ECPoint[] preComp = null;
    protected int width = -1;

    public ECPoint[] getPreComp() {
        return this.preComp;
    }

    public int getWidth() {
        return this.width;
    }

    public void setPreComp(ECPoint[] eCPointArr) {
        this.preComp = eCPointArr;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
