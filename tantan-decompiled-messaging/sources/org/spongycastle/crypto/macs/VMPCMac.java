package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import p149l.ig3;
import p149l.npk0;

/* JADX INFO: loaded from: classes3.dex */
public class VMPCMac implements Mac {

    /* JADX INFO: renamed from: T */
    private byte[] f206647T;

    /* JADX INFO: renamed from: g */
    private byte f206648g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x1 */
    private byte f206651x1;

    /* JADX INFO: renamed from: x2 */
    private byte f206652x2;

    /* JADX INFO: renamed from: x3 */
    private byte f206653x3;

    /* JADX INFO: renamed from: x4 */
    private byte f206654x4;

    /* JADX INFO: renamed from: n */
    private byte f206649n = 0;

    /* JADX INFO: renamed from: P */
    private byte[] f206646P = null;

    /* JADX INFO: renamed from: s */
    private byte f206650s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f206650s = (byte) 0;
        this.f206646P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.f206646P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.f206646P;
            byte b = this.f206650s;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.f206650s = b3;
            bArr3[i3] = bArr3[b3 & 255];
            bArr3[b3 & 255] = b2;
        }
        for (int i4 = 0; i4 < 768; i4++) {
            byte[] bArr4 = this.f206646P;
            byte b4 = this.f206650s;
            int i5 = i4 & 255;
            byte b5 = bArr4[i5];
            byte b6 = bArr4[(b4 + b5 + bArr2[i4 % bArr2.length]) & 255];
            this.f206650s = b6;
            bArr4[i5] = bArr4[b6 & 255];
            bArr4[b6 & 255] = b5;
        }
        this.f206649n = (byte) 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.f206646P;
            byte b = this.f206650s;
            byte b2 = this.f206649n;
            byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
            this.f206650s = b3;
            byte b4 = this.f206654x4;
            byte b5 = this.f206653x3;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.f206654x4 = b6;
            byte b7 = this.f206652x2;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.f206653x3 = b8;
            byte b9 = this.f206651x1;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.f206652x2 = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.f206651x1 = b11;
            byte[] bArr3 = this.f206647T;
            byte b12 = this.f206648g;
            bArr3[b12 & 31] = (byte) (b11 ^ bArr3[b12 & 31]);
            bArr3[(b12 + 1) & 31] = (byte) (b10 ^ bArr3[(b12 + 1) & 31]);
            bArr3[(b12 + 2) & 31] = (byte) (b8 ^ bArr3[(b12 + 2) & 31]);
            bArr3[(b12 + 3) & 31] = (byte) (b6 ^ bArr3[(b12 + 3) & 31]);
            this.f206648g = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[b2 & 255];
            bArr2[b2 & 255] = bArr2[b3 & 255];
            bArr2[b3 & 255] = b13;
            this.f206649n = (byte) ((b2 + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr4 = this.f206646P;
            byte b14 = this.f206650s;
            int i4 = i3 & 255;
            byte b15 = bArr4[i4];
            byte b16 = bArr4[(b14 + b15 + this.f206647T[i3 & 31]) & 255];
            this.f206650s = b16;
            bArr4[i4] = bArr4[b16 & 255];
            bArr4[b16 & 255] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i5 = 0; i5 < 20; i5++) {
            byte[] bArr6 = this.f206646P;
            int i6 = i5 & 255;
            byte b17 = bArr6[(this.f206650s + bArr6[i6]) & 255];
            this.f206650s = b17;
            bArr5[i5] = bArr6[(bArr6[bArr6[b17 & 255] & 255] + 1) & 255];
            byte b18 = bArr6[i6];
            bArr6[i6] = bArr6[b17 & 255];
            bArr6[b17 & 255] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            ig3.m135964a("VMPC-MAC Init parameters must include an IV");
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            ig3.m135964a("VMPC-MAC Init parameters must include a key");
            return;
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            ig3.m135964a("VMPC-MAC requires 1 to 768 bytes of IV");
        } else {
            this.workingKey = keyParameter.getKey();
            reset();
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f206649n = (byte) 0;
        this.f206654x4 = (byte) 0;
        this.f206653x3 = (byte) 0;
        this.f206652x2 = (byte) 0;
        this.f206651x1 = (byte) 0;
        this.f206648g = (byte) 0;
        this.f206647T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.f206647T[i] = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.f206646P;
        byte b2 = this.f206650s;
        byte b3 = this.f206649n;
        byte b4 = bArr[(b2 + bArr[b3 & 255]) & 255];
        this.f206650s = b4;
        byte b5 = (byte) (b ^ bArr[(bArr[bArr[b4 & 255] & 255] + 1) & 255]);
        byte b6 = this.f206654x4;
        byte b7 = this.f206653x3;
        byte b8 = bArr[(b6 + b7) & 255];
        this.f206654x4 = b8;
        byte b9 = this.f206652x2;
        byte b10 = bArr[(b7 + b9) & 255];
        this.f206653x3 = b10;
        byte b11 = this.f206651x1;
        byte b12 = bArr[(b9 + b11) & 255];
        this.f206652x2 = b12;
        byte b13 = bArr[(b11 + b4 + b5) & 255];
        this.f206651x1 = b13;
        byte[] bArr2 = this.f206647T;
        byte b14 = this.f206648g;
        bArr2[b14 & 31] = (byte) (b13 ^ bArr2[b14 & 31]);
        bArr2[(b14 + 1) & 31] = (byte) (b12 ^ bArr2[(b14 + 1) & 31]);
        bArr2[(b14 + 2) & 31] = (byte) (b10 ^ bArr2[(b14 + 2) & 31]);
        bArr2[(b14 + 3) & 31] = (byte) (b8 ^ bArr2[(b14 + 3) & 31]);
        this.f206648g = (byte) ((b14 + 4) & 31);
        byte b15 = bArr[b3 & 255];
        bArr[b3 & 255] = bArr[b4 & 255];
        bArr[b4 & 255] = b15;
        this.f206649n = (byte) ((b3 + 1) & 255);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        if (i + i2 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
