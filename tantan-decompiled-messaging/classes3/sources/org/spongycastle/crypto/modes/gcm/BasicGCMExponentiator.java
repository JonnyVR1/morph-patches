package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: x */
    private int[] f10298x;

    @Override // org.spongycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j, byte[] bArr) {
        int[] iArrOneAsInts = GCMUtil.oneAsInts();
        if (j > 0) {
            int[] iArrClone = Arrays.clone(this.f10298x);
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
        this.f10298x = GCMUtil.asInts(bArr);
    }
}
