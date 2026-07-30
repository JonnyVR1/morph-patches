package org.spongycastle.crypto.engines;

import com.p074ss.bytertc.engine.type.ErrorCode;
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
public class HC256Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv */
    private byte[] f207474iv;
    private byte[] key;

    /* JADX INFO: renamed from: p */
    private int[] f207475p = new int[1024];

    /* JADX INFO: renamed from: q */
    private int[] f207476q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

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

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            wg3.m206174a("The key must be 128/256 bits long");
            return;
        }
        if (this.f207474iv.length < 16) {
            wg3.m206174a("The IV must be at least 128 bits long");
            return;
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.f207474iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f207474iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f207474iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.key[i] & 255) << ((i & 3) * 8));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            int i4 = (i3 >> 2) + 8;
            iArr[i4] = iArr[i4] | ((this.f207474iv[i3] & 255) << ((i3 & 3) * 8));
        }
        for (int i5 = 16; i5 < 2560; i5++) {
            int i6 = iArr[i5 - 2];
            int i7 = iArr[i5 - 15];
            iArr[i5] = ((i6 >>> 10) ^ (rotateRight(i6, 17) ^ rotateRight(i6, 19))) + iArr[i5 - 7] + ((i7 >>> 3) ^ (rotateRight(i7, 7) ^ rotateRight(i7, 18))) + iArr[i5 - 16] + i5;
        }
        System.arraycopy(iArr, 512, this.f207475p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f207476q, 0, 1024);
        for (int i8 = 0; i8 < 4096; i8++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int step() {
        int i;
        int i2;
        int i3 = this.cnt;
        int i4 = i3 & 1023;
        if (i3 < 1024) {
            int[] iArr = this.f207475p;
            int i5 = iArr[(i4 - 3) & 1023];
            int i6 = iArr[(i4 + ErrorCode.ERROR_CODE_LICENSE_INFORMATION_NOT_MATCH) & 1023];
            int i7 = iArr[i4];
            int iRotateRight = iArr[(i4 - 10) & 1023] + (rotateRight(i6, 23) ^ rotateRight(i5, 10));
            int[] iArr2 = this.f207476q;
            iArr[i4] = i7 + iRotateRight + iArr2[(i5 ^ i6) & 1023];
            int[] iArr3 = this.f207475p;
            int i8 = iArr3[(i4 - 12) & 1023];
            i = iArr2[i8 & 255] + iArr2[((i8 >> 8) & 255) + 256] + iArr2[((i8 >> 16) & 255) + 512] + iArr2[((i8 >> 24) & 255) + 768];
            i2 = iArr3[i4];
        } else {
            int[] iArr4 = this.f207476q;
            int i9 = iArr4[(i4 - 3) & 1023];
            int i10 = iArr4[(i4 + ErrorCode.ERROR_CODE_LICENSE_INFORMATION_NOT_MATCH) & 1023];
            int i11 = iArr4[i4];
            int iRotateRight2 = iArr4[(i4 - 10) & 1023] + (rotateRight(i10, 23) ^ rotateRight(i9, 10));
            int[] iArr5 = this.f207475p;
            iArr4[i4] = i11 + iRotateRight2 + iArr5[(i9 ^ i10) & 1023];
            int[] iArr6 = this.f207476q;
            int i12 = iArr6[(i4 - 12) & 1023];
            i = iArr5[i12 & 255] + iArr5[((i12 >> 8) & 255) + 256] + iArr5[((i12 >> 16) & 255) + 512] + iArr5[((i12 >> 24) & 255) + 768];
            i2 = iArr6[i4];
        }
        int i13 = i2 ^ i;
        this.cnt = (this.cnt + 1) & 2047;
        return i13;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
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
            this.f207474iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f207474iv = new byte[0];
            parameters = cipherParameters;
        }
        if (parameters instanceof KeyParameter) {
            this.key = ((KeyParameter) parameters).getKey();
            init();
            this.initialised = true;
            return;
        }
        wg3.m206174a("Invalid parameter passed to HC256 init - ".concat(cipherParameters.getClass().getName()));
    }
}
