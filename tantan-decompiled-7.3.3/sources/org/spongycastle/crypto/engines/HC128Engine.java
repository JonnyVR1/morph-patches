package org.spongycastle.crypto.engines;

import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p153l.C17103g;
import p153l.rrc0;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv */
    private byte[] f207471iv;
    private byte[] key;

    /* JADX INFO: renamed from: p */
    private int[] f207472p = new int[512];

    /* JADX INFO: renamed from: q */
    private int[] f207473q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i, int i2) {
        return mod512(i - i2);
    }

    /* JADX INFO: renamed from: f1 */
    private static int m222445f1(int i) {
        return (i >>> 3) ^ (rotateRight(i, 7) ^ rotateRight(i, 18));
    }

    /* JADX INFO: renamed from: f2 */
    private static int m222446f2(int i) {
        return (i >>> 10) ^ (rotateRight(i, 17) ^ rotateRight(i, 19));
    }

    /* JADX INFO: renamed from: g1 */
    private int m222447g1(int i, int i2, int i3) {
        return (rotateRight(i, 10) ^ rotateRight(i3, 23)) + rotateRight(i2, 8);
    }

    /* JADX INFO: renamed from: g2 */
    private int m222448g2(int i, int i2, int i3) {
        return (rotateLeft(i, 10) ^ rotateLeft(i3, 23)) + rotateLeft(i2, 8);
    }

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (iStep & 255);
            bArr[1] = (byte) ((iStep >> 8) & 255);
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i = this.idx;
        byte b = bArr2[i];
        this.idx = 3 & (i + 1);
        return b;
    }

    /* JADX INFO: renamed from: h1 */
    private int m222449h1(int i) {
        int[] iArr = this.f207473q;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    /* JADX INFO: renamed from: h2 */
    private int m222450h2(int i) {
        int[] iArr = this.f207472p;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            wg3.m206174a("The key must be 128 bits long");
            return;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr[i2] = ((this.key[i] & 255) << ((i & 3) * 8)) | iArr[i2];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f207471iv;
            if (i3 >= bArr.length || i3 >= 16) {
                break;
            }
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
            i3++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            iArr[i5] = m222446f2(iArr[i5 - 2]) + iArr[i5 - 7] + m222445f1(iArr[i5 - 15]) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 256, this.f207472p, 0, 512);
        System.arraycopy(iArr, 768, this.f207473q, 0, 512);
        for (int i6 = 0; i6 < 512; i6++) {
            this.f207472p[i6] = step();
        }
        for (int i7 = 0; i7 < 512; i7++) {
            this.f207473q[i7] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i) {
        return i & 1023;
    }

    private static int mod512(int i) {
        return i & UnixStat.DEFAULT_LINK_PERM;
    }

    private static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int step() {
        int iM222450h2;
        int i;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f207472p;
            iArr[iMod512] = iArr[iMod512] + m222447g1(iArr[dim(iMod512, 3)], this.f207472p[dim(iMod512, 10)], this.f207472p[dim(iMod512, UnixStat.DEFAULT_LINK_PERM)]);
            iM222450h2 = m222449h1(this.f207472p[dim(iMod512, 12)]);
            i = this.f207472p[iMod512];
        } else {
            int[] iArr2 = this.f207473q;
            iArr2[iMod512] = iArr2[iMod512] + m222448g2(iArr2[dim(iMod512, 3)], this.f207473q[dim(iMod512, 10)], this.f207473q[dim(iMod512, UnixStat.DEFAULT_LINK_PERM)]);
            iM222450h2 = m222450h2(this.f207473q[dim(iMod512, 12)]);
            i = this.f207473q[iMod512];
        }
        int i2 = i ^ iM222450h2;
        this.cnt = mod1024(this.cnt + 1);
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.initialised) {
            rrc0.m182720a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C17103g.m128363a("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getByte());
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        return (byte) (getByte() ^ b);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f207471iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f207471iv = new byte[0];
            parameters = cipherParameters;
        }
        if (parameters instanceof KeyParameter) {
            this.key = ((KeyParameter) parameters).getKey();
            init();
            this.initialised = true;
            return;
        }
        wg3.m206174a("Invalid parameter passed to HC128 init - ".concat(cipherParameters.getClass().getName()));
    }
}
