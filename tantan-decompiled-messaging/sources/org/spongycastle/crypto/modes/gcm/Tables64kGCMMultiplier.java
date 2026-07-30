package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class Tables64kGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: H */
    private byte[] f206676H;

    /* JADX INFO: renamed from: M */
    private int[][][] f206677M;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        int i = 0;
        if (this.f206677M == null) {
            this.f206677M = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, 16, 256, 4);
        } else if (Arrays.areEqual(this.f206676H, bArr)) {
            return;
        }
        this.f206676H = Arrays.clone(bArr);
        GCMUtil.asInts(bArr, this.f206677M[0][128]);
        for (int i2 = 64; i2 >= 1; i2 >>= 1) {
            int[][] iArr = this.f206677M[0];
            GCMUtil.multiplyP(iArr[i2 + i2], iArr[i2]);
        }
        while (true) {
            for (int i3 = 2; i3 < 256; i3 += i3) {
                for (int i4 = 1; i4 < i3; i4++) {
                    int[][] iArr2 = this.f206677M[i];
                    GCMUtil.xor(iArr2[i3], iArr2[i4], iArr2[i3 + i4]);
                }
            }
            int i5 = i + 1;
            if (i5 == 16) {
                return;
            }
            for (int i6 = 128; i6 > 0; i6 >>= 1) {
                int[][][] iArr3 = this.f206677M;
                GCMUtil.multiplyP8(iArr3[i][i6], iArr3[i5][i6]);
            }
            i = i5;
        }
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i = 15; i >= 0; i--) {
            int[] iArr2 = this.f206677M[i][bArr[i] & 255];
            iArr[0] = iArr[0] ^ iArr2[0];
            iArr[1] = iArr[1] ^ iArr2[1];
            iArr[2] = iArr[2] ^ iArr2[2];
            iArr[3] = iArr2[3] ^ iArr[3];
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}
