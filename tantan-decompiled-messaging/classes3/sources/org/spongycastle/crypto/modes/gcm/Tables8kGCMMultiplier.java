package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: H */
    private byte[] f10303H;

    /* JADX INFO: renamed from: M */
    private int[][][] f10304M;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        int[][][] iArr;
        int i = 0;
        if (this.f10304M == null) {
            this.f10304M = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 16, 4);
        } else if (Arrays.areEqual(this.f10303H, bArr)) {
            return;
        }
        this.f10303H = Arrays.clone(bArr);
        GCMUtil.asInts(bArr, this.f10304M[1][8]);
        int i2 = 4;
        while (true) {
            iArr = this.f10304M;
            if (i2 < 1) {
                break;
            }
            int[][] iArr2 = iArr[1];
            GCMUtil.multiplyP(iArr2[i2 + i2], iArr2[i2]);
            i2 >>= 1;
        }
        GCMUtil.multiplyP(iArr[1][1], iArr[0][8]);
        for (int i3 = 4; i3 >= 1; i3 >>= 1) {
            int[][] iArr3 = this.f10304M[0];
            GCMUtil.multiplyP(iArr3[i3 + i3], iArr3[i3]);
        }
        while (true) {
            for (int i4 = 2; i4 < 16; i4 += i4) {
                for (int i5 = 1; i5 < i4; i5++) {
                    int[][] iArr4 = this.f10304M[i];
                    GCMUtil.xor(iArr4[i4], iArr4[i5], iArr4[i4 + i5]);
                }
            }
            int i6 = i + 1;
            if (i6 == 32) {
                return;
            }
            if (i6 > 1) {
                for (int i7 = 8; i7 > 0; i7 >>= 1) {
                    int[][][] iArr5 = this.f10304M;
                    GCMUtil.multiplyP8(iArr5[i - 1][i7], iArr5[i6][i7]);
                }
            }
            i = i6;
        }
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i = 15; i >= 0; i--) {
            int[][][] iArr2 = this.f10304M;
            int i2 = i + i;
            int[][] iArr3 = iArr2[i2];
            byte b = bArr[i];
            int[] iArr4 = iArr3[b & 15];
            int i3 = iArr[0] ^ iArr4[0];
            iArr[0] = i3;
            int i4 = iArr[1] ^ iArr4[1];
            iArr[1] = i4;
            int i5 = iArr[2] ^ iArr4[2];
            iArr[2] = i5;
            int i6 = iArr[3] ^ iArr4[3];
            iArr[3] = i6;
            int[] iArr5 = iArr2[i2 + 1][(b & 240) >>> 4];
            iArr[0] = iArr5[0] ^ i3;
            iArr[1] = iArr5[1] ^ i4;
            iArr[2] = iArr5[2] ^ i5;
            iArr[3] = iArr5[3] ^ i6;
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}
