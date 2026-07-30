package org.spongycastle.pqc.crypto.gmss.util;

import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class WinternitzOTSVerify {
    private Digest messDigestOTS;

    /* JADX INFO: renamed from: w */
    private int f10527w;

    public WinternitzOTSVerify(Digest digest, int i) {
        this.f10527w = i;
        this.messDigestOTS = digest;
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int i2 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize2 = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i3 = digestSize << 3;
        int i4 = this.f10527w;
        int i5 = ((i4 - 1) + i3) / i4;
        boolean z = true;
        int log = getLog((i5 << i4) + 1);
        int i6 = this.f10527w;
        int i7 = ((((log + i6) - 1) / i6) + i5) * digestSize;
        if (i7 != bArr2.length) {
            return null;
        }
        byte[] bArr5 = new byte[i7];
        int i8 = 8;
        if (8 % i6 == 0) {
            int i9 = 8 / i6;
            int i10 = (1 << i6) - 1;
            byte[] bArr6 = new byte[digestSize];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < digestSize2) {
                while (i2 < i9) {
                    int i14 = bArr4[i11] & i10;
                    i12 += i14;
                    int i15 = digestSize2;
                    int i16 = i13 * digestSize;
                    byte[] bArr7 = bArr4;
                    System.arraycopy(bArr2, i16, bArr6, 0, digestSize);
                    int i17 = i14;
                    while (i17 < i10) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i17++;
                        i2 = i2;
                        i5 = i5;
                    }
                    System.arraycopy(bArr6, 0, bArr5, i16, digestSize);
                    bArr7[i11] = (byte) (bArr7[i11] >>> this.f10527w);
                    i13++;
                    i2++;
                    digestSize2 = i15;
                    bArr4 = bArr7;
                    i5 = i5;
                }
                i11++;
                i2 = 0;
            }
            int i18 = (i5 << this.f10527w) - i12;
            int i19 = 0;
            while (i19 < log) {
                int i20 = i13 * digestSize;
                System.arraycopy(bArr2, i20, bArr6, 0, digestSize);
                for (int i21 = i18 & i10; i21 < i10; i21++) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                System.arraycopy(bArr6, 0, bArr5, i20, digestSize);
                int i22 = this.f10527w;
                i18 >>>= i22;
                i13++;
                i19 += i22;
            }
        } else if (i6 < 8) {
            int i23 = digestSize / i6;
            int i24 = (1 << i6) - 1;
            byte[] bArr8 = new byte[digestSize];
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i25 < i23) {
                boolean z2 = z;
                long j = 0;
                for (int i29 = 0; i29 < this.f10527w; i29++) {
                    j ^= (long) ((bArr4[i26] & 255) << (i29 << 3));
                    i26++;
                }
                int i30 = 0;
                while (i30 < i8) {
                    int i31 = (int) (j & ((long) i24));
                    i27 += i31;
                    int i32 = i28 * digestSize;
                    int i33 = i8;
                    System.arraycopy(bArr2, i32, bArr8, 0, digestSize);
                    while (i31 < i24) {
                        this.messDigestOTS.update(bArr8, 0, bArr8.length);
                        bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr8, 0);
                        i31++;
                        i23 = i23;
                        i25 = i25;
                    }
                    System.arraycopy(bArr8, 0, bArr5, i32, digestSize);
                    j >>>= this.f10527w;
                    i28++;
                    i30++;
                    i8 = i33;
                    i23 = i23;
                }
                i25++;
                z = z2;
            }
            int i34 = digestSize % this.f10527w;
            int i35 = 0;
            long j2 = 0;
            while (i35 < i34) {
                j2 ^= (long) ((bArr4[i26] & 255) << (i35 << 3));
                i26++;
                i35++;
                bArr8 = bArr8;
            }
            int i36 = i34 << 3;
            int i37 = 0;
            while (i37 < i36) {
                int i38 = (int) (((long) i24) & j2);
                i27 += i38;
                int i39 = i28 * digestSize;
                System.arraycopy(bArr2, i39, bArr8, 0, digestSize);
                while (i38 < i24) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                    i38++;
                    i36 = i36;
                    i37 = i37;
                }
                int i40 = i36;
                System.arraycopy(bArr8, 0, bArr5, i39, digestSize);
                int i41 = this.f10527w;
                j2 >>>= i41;
                i28++;
                i37 += i41;
                i36 = i40;
            }
            int i42 = (i5 << this.f10527w) - i27;
            int i43 = 0;
            while (i43 < log) {
                int i44 = i28 * digestSize;
                System.arraycopy(bArr2, i44, bArr8, 0, digestSize);
                for (int i45 = i42 & i24; i45 < i24; i45++) {
                    this.messDigestOTS.update(bArr8, 0, bArr8.length);
                    bArr8 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr8, 0);
                }
                System.arraycopy(bArr8, 0, bArr5, i44, digestSize);
                int i46 = this.f10527w;
                i42 >>>= i46;
                i28++;
                i43 += i46;
            }
        } else if (i6 < 57) {
            int i47 = i3 - i6;
            int i48 = (1 << i6) - 1;
            byte[] bArr9 = new byte[digestSize];
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            while (i51 <= i47) {
                int i52 = i51 >>> 3;
                int i53 = i51 % 8;
                i51 += this.f10527w;
                int i54 = (i51 + 7) >>> 3;
                int i55 = 0;
                long j3 = 0;
                while (i52 < i54) {
                    j3 ^= (long) ((bArr4[i52] & 255) << (i55 << 3));
                    i55++;
                    i52++;
                    i47 = i47;
                    i50 = i50;
                }
                int i56 = i47;
                int i57 = i50;
                long j4 = i48;
                long j5 = (j3 >>> i53) & j4;
                i49 = (int) (((long) i49) + j5);
                int i58 = i57 * digestSize;
                System.arraycopy(bArr2, i58, bArr9, 0, digestSize);
                while (j5 < j4) {
                    this.messDigestOTS.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr9, 0);
                    j5++;
                }
                System.arraycopy(bArr9, 0, bArr5, i58, digestSize);
                i50 = i57 + 1;
                i47 = i56;
            }
            int i59 = i50;
            int i60 = i51 >>> 3;
            if (i60 < digestSize) {
                int i61 = i51 % 8;
                int i62 = 0;
                long j6 = 0;
                while (i60 < digestSize) {
                    j6 ^= (long) ((bArr4[i60] & 255) << (i62 << 3));
                    i62++;
                    i60++;
                }
                long j7 = j6 >>> i61;
                long j8 = i48;
                long j9 = j7 & j8;
                i49 = (int) (((long) i49) + j9);
                int i63 = i59 * digestSize;
                System.arraycopy(bArr2, i63, bArr9, 0, digestSize);
                while (j9 < j8) {
                    this.messDigestOTS.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr9, 0);
                    j9++;
                    i49 = i49;
                }
                System.arraycopy(bArr9, 0, bArr5, i63, digestSize);
                i = i59 + 1;
            } else {
                i = i59;
            }
            int i64 = (i5 << this.f10527w) - i49;
            int i65 = 0;
            while (i65 < log) {
                long j10 = i64 & i48;
                int i66 = i * digestSize;
                System.arraycopy(bArr2, i66, bArr9, 0, digestSize);
                while (j10 < i48) {
                    this.messDigestOTS.update(bArr9, 0, bArr9.length);
                    bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr9, 0);
                    j10++;
                    i48 = i48;
                }
                System.arraycopy(bArr9, 0, bArr5, i66, digestSize);
                int i67 = this.f10527w;
                i64 >>>= i67;
                i++;
                i65 += i67;
                i48 = i48;
            }
        }
        byte[] bArr10 = new byte[digestSize];
        this.messDigestOTS.update(bArr5, 0, i7);
        byte[] bArr11 = new byte[this.messDigestOTS.getDigestSize()];
        this.messDigestOTS.doFinal(bArr11, 0);
        return bArr11;
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.f10527w;
        int i2 = ((digestSize << 3) + (i - 1)) / i;
        int log = getLog((i2 << i) + 1);
        int i3 = this.f10527w;
        return digestSize * (i2 + (((log + i3) - 1) / i3));
    }
}
