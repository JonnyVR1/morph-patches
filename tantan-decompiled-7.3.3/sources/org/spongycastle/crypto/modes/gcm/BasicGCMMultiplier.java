package org.spongycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes3.dex */
public class BasicGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: H */
    private int[] f207596H;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.f207596H = GCMUtil.asInts(bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArrAsInts = GCMUtil.asInts(bArr);
        GCMUtil.multiply(iArrAsInts, this.f207596H);
        GCMUtil.asBytes(iArrAsInts, bArr);
    }
}
