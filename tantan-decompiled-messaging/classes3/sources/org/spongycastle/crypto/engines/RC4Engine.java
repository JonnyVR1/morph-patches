package org.spongycastle.crypto.engines;

import l.ig3;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import p003l.C0303g;
import p003l.npk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState = null;

    /* JADX INFO: renamed from: x */
    private int f10187x = 0;

    /* JADX INFO: renamed from: y */
    private int f10188y = 0;
    private byte[] workingKey = null;

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f10187x = 0;
        this.f10188y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.engineState[i] = (byte) i;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = bArr[length] & 255;
            byte[] bArr2 = this.engineState;
            byte b = bArr2[i3];
            i2 = (i4 + b + i2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.a("invalid parameter passed to RC4 init - ".concat(cipherParameters.getClass().getName()));
            return;
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        setKey(key);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            npk0.m6558a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C0303g.m4499a("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.f10187x + 1) & 255;
            this.f10187x = i5;
            byte[] bArr3 = this.engineState;
            byte b = bArr3[i5];
            int i6 = (this.f10188y + b) & 255;
            this.f10188y = i6;
            bArr3[i5] = bArr3[i6];
            bArr3[i6] = b;
            bArr2[i4 + i3] = (byte) (bArr3[(bArr3[i5] + b) & 255] ^ bArr[i4 + i]);
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        int i = (this.f10187x + 1) & 255;
        this.f10187x = i;
        byte[] bArr = this.engineState;
        byte b2 = bArr[i];
        int i2 = (this.f10188y + b2) & 255;
        this.f10188y = i2;
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
        return (byte) (bArr[(bArr[i] + b2) & 255] ^ b);
    }
}
