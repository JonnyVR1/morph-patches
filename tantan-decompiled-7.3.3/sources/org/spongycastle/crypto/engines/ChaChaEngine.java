package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;
import p153l.fig0;
import p153l.iki;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i, int[] iArr, int[] iArr2) {
        int i2 = 16;
        if (iArr.length != 16) {
            fig0.m125680a();
            return;
        }
        if (iArr2.length != 16) {
            fig0.m125680a();
            return;
        }
        if (i % 2 != 0) {
            wg3.m206174a("Number of rounds must be even");
            return;
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        char c = 3;
        int i6 = iArr[3];
        char c2 = 4;
        int i7 = iArr[4];
        char c3 = 5;
        int i8 = iArr[5];
        char c4 = 6;
        int i9 = iArr[6];
        int i10 = 7;
        int i11 = iArr[7];
        int i12 = 8;
        int i13 = iArr[8];
        int i14 = iArr[9];
        int i15 = iArr[10];
        int i16 = iArr[11];
        int i17 = 12;
        int i18 = iArr[12];
        int i19 = iArr[13];
        int i20 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i20;
        int iRotl3 = i19;
        int iRotl4 = i18;
        int i21 = i16;
        int i22 = i15;
        int i23 = i14;
        int i24 = i13;
        int iRotl5 = i11;
        int iRotl6 = i9;
        int iRotl7 = i8;
        int iRotl8 = i7;
        int i25 = i6;
        int i26 = i5;
        int i27 = i4;
        int i28 = i3;
        int i29 = i;
        while (i29 > 0) {
            int i30 = i28 + iRotl8;
            char c5 = c;
            int iRotl9 = Salsa20Engine.rotl(iRotl4 ^ i30, i2);
            int i31 = i24 + iRotl9;
            int iRotl10 = Salsa20Engine.rotl(iRotl8 ^ i31, i17);
            int i32 = i30 + iRotl10;
            int iRotl11 = Salsa20Engine.rotl(iRotl9 ^ i32, i12);
            int i33 = i31 + iRotl11;
            int iRotl12 = Salsa20Engine.rotl(iRotl10 ^ i33, i10);
            int i34 = i27 + iRotl7;
            char c6 = c2;
            int iRotl13 = Salsa20Engine.rotl(iRotl3 ^ i34, i2);
            int i35 = i23 + iRotl13;
            char c7 = c3;
            int iRotl14 = Salsa20Engine.rotl(iRotl7 ^ i35, i17);
            int i36 = i34 + iRotl14;
            int iRotl15 = Salsa20Engine.rotl(iRotl13 ^ i36, i12);
            int i37 = i35 + iRotl15;
            int iRotl16 = Salsa20Engine.rotl(iRotl14 ^ i37, i10);
            int i38 = i26 + iRotl6;
            char c8 = c4;
            int iRotl17 = Salsa20Engine.rotl(iRotl2 ^ i38, i2);
            int i39 = i22 + iRotl17;
            int iRotl18 = Salsa20Engine.rotl(iRotl6 ^ i39, i17);
            int i40 = i38 + iRotl18;
            int iRotl19 = Salsa20Engine.rotl(iRotl17 ^ i40, i12);
            int i41 = i39 + iRotl19;
            int iRotl20 = Salsa20Engine.rotl(iRotl18 ^ i41, i10);
            int i42 = i25 + iRotl5;
            int iRotl21 = Salsa20Engine.rotl(iRotl ^ i42, 16);
            int i43 = i21 + iRotl21;
            int iRotl22 = Salsa20Engine.rotl(iRotl5 ^ i43, i17);
            int i44 = i42 + iRotl22;
            int iRotl23 = Salsa20Engine.rotl(iRotl21 ^ i44, 8);
            int i45 = i43 + iRotl23;
            int iRotl24 = Salsa20Engine.rotl(iRotl22 ^ i45, 7);
            int i46 = i32 + iRotl16;
            int iRotl25 = Salsa20Engine.rotl(iRotl23 ^ i46, 16);
            int i47 = i41 + iRotl25;
            int iRotl26 = Salsa20Engine.rotl(iRotl16 ^ i47, 12);
            i28 = i46 + iRotl26;
            iRotl = Salsa20Engine.rotl(iRotl25 ^ i28, 8);
            i22 = i47 + iRotl;
            iRotl7 = Salsa20Engine.rotl(iRotl26 ^ i22, 7);
            int i48 = i36 + iRotl20;
            int iRotl27 = Salsa20Engine.rotl(iRotl11 ^ i48, 16);
            int i49 = i45 + iRotl27;
            int iRotl28 = Salsa20Engine.rotl(iRotl20 ^ i49, 12);
            i27 = i48 + iRotl28;
            iRotl4 = Salsa20Engine.rotl(iRotl27 ^ i27, 8);
            i21 = i49 + iRotl4;
            iRotl6 = Salsa20Engine.rotl(iRotl28 ^ i21, 7);
            int i50 = i40 + iRotl24;
            int iRotl29 = Salsa20Engine.rotl(iRotl15 ^ i50, 16);
            int i51 = i33 + iRotl29;
            int iRotl30 = Salsa20Engine.rotl(iRotl24 ^ i51, 12);
            i26 = i50 + iRotl30;
            iRotl3 = Salsa20Engine.rotl(iRotl29 ^ i26, 8);
            i24 = i51 + iRotl3;
            iRotl5 = Salsa20Engine.rotl(iRotl30 ^ i24, 7);
            int i52 = i44 + iRotl12;
            int iRotl31 = Salsa20Engine.rotl(iRotl19 ^ i52, 16);
            int i53 = i37 + iRotl31;
            int iRotl32 = Salsa20Engine.rotl(iRotl12 ^ i53, 12);
            i25 = i52 + iRotl32;
            iRotl2 = Salsa20Engine.rotl(iRotl31 ^ i25, 8);
            i23 = i53 + iRotl2;
            iRotl8 = Salsa20Engine.rotl(iRotl32 ^ i23, 7);
            i29 -= 2;
            i2 = 16;
            c = c5;
            c2 = c6;
            c3 = c7;
            c4 = c8;
            i10 = 7;
            i12 = 8;
            i17 = 12;
        }
        char c9 = c;
        char c10 = c2;
        char c11 = c3;
        char c12 = c4;
        iArr2[0] = i28 + iArr[0];
        iArr2[1] = i27 + iArr[1];
        iArr2[2] = i26 + iArr[2];
        iArr2[c9] = i25 + iArr[c9];
        iArr2[c10] = iRotl8 + iArr[c10];
        iArr2[c11] = iRotl7 + iArr[c11];
        iArr2[c12] = iRotl6 + iArr[c12];
        iArr2[7] = iRotl5 + iArr[7];
        iArr2[8] = i24 + iArr[8];
        iArr2[9] = i23 + iArr[9];
        iArr2[10] = i22 + iArr[10];
        iArr2[11] = i21 + iArr[11];
        iArr2[12] = iRotl4 + iArr[12];
        iArr2[13] = iRotl3 + iArr[13];
        iArr2[14] = iRotl2 + iArr[14];
        iArr2[15] = iRotl + iArr[15];
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i;
        }
        int[] iArr2 = this.engineState;
        int i3 = iArr2[12];
        int i4 = i2 + i3;
        iArr2[12] = i4;
        if (i3 == 0 || i4 >= i3) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f207502x);
        Pack.intToLittleEndian(this.f207502x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[13]) << 32) | (((long) iArr[12]) & 4294967295L);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            int[] iArr = this.engineState;
            int i3 = iArr[13];
            if ((((long) i3) & 4294967295L) < (((long) i) & 4294967295L)) {
                wtq0.m207906a("attempt to reduce counter past zero.");
                return;
            }
            iArr[13] = i3 - i;
        }
        int[] iArr2 = this.engineState;
        int i4 = iArr2[12];
        if ((((long) i4) & 4294967295L) >= (4294967295L & ((long) i2))) {
            iArr2[12] = i4 - i2;
            return;
        }
        int i5 = iArr2[13];
        if (i5 == 0) {
            wtq0.m207906a("attempt to reduce counter past zero.");
        } else {
            iArr2[13] = i5 - 1;
            iArr2[12] = i4 - i2;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr != null) {
            int i = 16;
            if (bArr.length != 16 && bArr.length != 32) {
                iki.m140324a(getAlgorithmName(), " requires 128 bit or 256 bit key");
                return;
            }
            this.engineState[4] = Pack.littleEndianToInt(bArr, 0);
            this.engineState[5] = Pack.littleEndianToInt(bArr, 4);
            this.engineState[6] = Pack.littleEndianToInt(bArr, 8);
            this.engineState[7] = Pack.littleEndianToInt(bArr, 12);
            if (bArr.length == 32) {
                bArr3 = Salsa20Engine.sigma;
            } else {
                bArr3 = Salsa20Engine.tau;
                i = 0;
            }
            this.engineState[8] = Pack.littleEndianToInt(bArr, i);
            this.engineState[9] = Pack.littleEndianToInt(bArr, i + 4);
            this.engineState[10] = Pack.littleEndianToInt(bArr, i + 8);
            this.engineState[11] = Pack.littleEndianToInt(bArr, i + 12);
            this.engineState[0] = Pack.littleEndianToInt(bArr3, 0);
            this.engineState[1] = Pack.littleEndianToInt(bArr3, 4);
            this.engineState[2] = Pack.littleEndianToInt(bArr3, 8);
            this.engineState[3] = Pack.littleEndianToInt(bArr3, 12);
        }
        this.engineState[14] = Pack.littleEndianToInt(bArr2, 0);
        this.engineState[15] = Pack.littleEndianToInt(bArr2, 4);
    }

    public ChaChaEngine(int i) {
        super(i);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12];
        if (i == 0 && iArr[13] == 0) {
            wtq0.m207906a("attempt to reduce counter past zero.");
            return;
        }
        int i2 = i - 1;
        iArr[12] = i2;
        if (i2 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }
}
