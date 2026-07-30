package org.spongycastle.crypto.engines;

import l.ig3;
import l.kjc0;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv */
    private byte[] f10174iv;
    private byte[] key;

    /* JADX INFO: renamed from: p */
    private int[] f10175p = new int[512];

    /* JADX INFO: renamed from: q */
    private int[] f10176q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i, int i2) {
        return mod512(i - i2);
    }

    /* JADX INFO: renamed from: f1 */
    private static int m9656f1(int i) {
        return (i >>> 3) ^ (rotateRight(i, 7) ^ rotateRight(i, 18));
    }

    /* JADX INFO: renamed from: f2 */
    private static int m9657f2(int i) {
        return (i >>> 10) ^ (rotateRight(i, 17) ^ rotateRight(i, 19));
    }

    /* JADX INFO: renamed from: g1 */
    private int m9658g1(int i, int i2, int i3) {
        return (rotateRight(i, 10) ^ rotateRight(i3, 23)) + rotateRight(i2, 8);
    }

    /* JADX INFO: renamed from: g2 */
    private int m9659g2(int i, int i2, int i3) {
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
    private int m9660h1(int i) {
        int[] iArr = this.f10176q;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    /* JADX INFO: renamed from: h2 */
    private int m9661h2(int i) {
        int[] iArr = this.f10175p;
        return iArr[i & 255] + iArr[((i >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            ig3.a("The key must be 128 bits long");
            return;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i = 0; i < 16; i++) {
            int i2 = i >> 2;
            iArr[i2] = ((this.key[i] & 255) << ((i & 3) * 8)) | iArr[i2];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f10174iv;
            if (i3 >= bArr.length || i3 >= 16) {
                break;
            }
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = ((bArr[i3] & 255) << ((i3 & 3) * 8)) | iArr[i4];
            i3++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i5 = 16; i5 < 1280; i5++) {
            iArr[i5] = m9657f2(iArr[i5 - 2]) + iArr[i5 - 7] + m9656f1(iArr[i5 - 15]) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 256, this.f10175p, 0, 512);
        System.arraycopy(iArr, 768, this.f10176q, 0, 512);
        for (int i6 = 0; i6 < 512; i6++) {
            this.f10175p[i6] = step();
        }
        for (int i7 = 0; i7 < 512; i7++) {
            this.f10176q[i7] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i) {
        return i & 1023;
    }

    private static int mod512(int i) {
        return i & 511;
    }

    private static int rotateLeft(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int step() {
        int iM9661h2;
        int i;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f10175p;
            iArr[iMod512] = iArr[iMod512] + m9658g1(iArr[dim(iMod512, 3)], this.f10175p[dim(iMod512, 10)], this.f10175p[dim(iMod512, 511)]);
            iM9661h2 = m9660h1(this.f10175p[dim(iMod512, 12)]);
            i = this.f10175p[iMod512];
        } else {
            int[] iArr2 = this.f10176q;
            iArr2[iMod512] = iArr2[iMod512] + m9659g2(iArr2[dim(iMod512, 3)], this.f10176q[dim(iMod512, 10)], this.f10176q[dim(iMod512, 511)]);
            iM9661h2 = m9661h2(this.f10176q[dim(iMod512, 12)]);
            i = this.f10176q[iMod512];
        }
        int i2 = i ^ iM9661h2;
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
            kjc0.a(getAlgorithmName(), " not initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C0303g.m4499a("output buffer too short");
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
            this.f10174iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f10174iv = new byte[0];
            parameters = cipherParameters;
        }
        if (parameters instanceof KeyParameter) {
            this.key = ((KeyParameter) parameters).getKey();
            init();
            this.initialised = true;
            return;
        }
        ig3.a("Invalid parameter passed to HC128 init - ".concat(cipherParameters.getClass().getName()));
    }
}
