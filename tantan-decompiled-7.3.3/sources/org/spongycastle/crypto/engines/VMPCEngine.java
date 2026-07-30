package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p153l.C17103g;
import p153l.tyk0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX INFO: renamed from: n */
    protected byte f207518n = 0;

    /* JADX INFO: renamed from: P */
    protected byte[] f207517P = null;

    /* JADX INFO: renamed from: s */
    protected byte f207519s = 0;

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            wg3.m206174a("VMPC init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            wg3.m206174a("VMPC init parameters must include a key");
            return;
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            wg3.m206174a("VMPC requires 1 to 768 bytes of IV");
            return;
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
    }

    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f207519s = (byte) 0;
        this.f207517P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f207517P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f207517P;
            byte b = this.f207519s;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f207519s = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f207517P;
            byte b4 = this.f207519s;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.f207519s = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.f207518n = (byte) 0;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            tyk0.m193596a("input buffer too short");
            return 0;
        }
        if (i3 + i2 > bArr2.length) {
            C17103g.m128363a("output buffer too short");
            return 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.f207517P;
            byte b = this.f207519s;
            byte b2 = this.f207518n;
            byte b3 = bArr3[(b + bArr3[b2 & 255]) & 255];
            this.f207519s = b3;
            byte b4 = bArr3[(bArr3[bArr3[b3 & 255] & 255] + 1) & 255];
            byte b5 = bArr3[b2 & 255];
            bArr3[b2 & 255] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b5;
            this.f207518n = (byte) ((b2 + 1) & 255);
            bArr2[i4 + i3] = (byte) (bArr[i4 + i] ^ b4);
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        byte[] bArr = this.f207517P;
        byte b2 = this.f207519s;
        byte b3 = this.f207518n;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.f207519s = b4;
        byte b5 = bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255];
        byte b6 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b6;
        this.f207518n = (byte) ((b3 + 1) & 255);
        return (byte) (b ^ b5);
    }
}
