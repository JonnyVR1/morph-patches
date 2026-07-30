package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x */
    private int[] f206673x;

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j, byte[] bArr) {
        int[] iArrOneAsInts = GCMUtil.oneAsInts();
        if (j > 0) {
            int[] iArrClone = Arrays.clone(this.f206673x);
            do {
                if ((1 & j) != 0) {
                    GCMUtil.multiply(iArrOneAsInts, iArrClone);
                }
                GCMUtil.multiply(iArrClone, iArrClone);
                j >>>= 1;
            } while (j > 0);
        }
        GCMUtil.asBytes(iArrOneAsInts, bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f206673x = GCMUtil.asInts(bArr);
    }
}
