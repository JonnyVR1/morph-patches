package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class w3x0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f187180a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f187181b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f187182c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f187183d = new int[10];

    /* JADX INFO: renamed from: a */
    public static int m204791a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        lev0.m153958f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m204796f(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m204796f(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m204796f(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m204796f(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m204792b(byte[] bArr, int i) {
        int i2;
        synchronized (f187182c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f187183d;
                    int length = iArr.length;
                    if (length <= i4) {
                        f187183d = Arrays.copyOf(iArr, length + length);
                    }
                    f187183d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = f187183d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static f0x0 m204793c(byte[] bArr, int i, int i2) {
        int iM208353b;
        int i3;
        int i4;
        int[] iArrCopyOf;
        int i5;
        int i6;
        b5x0 b5x0Var = new b5x0(bArr, i, i2);
        int i7 = 4;
        b5x0Var.m102671e(4);
        int iM102667a = b5x0Var.m102667a(3);
        b5x0Var.m102670d();
        int iM102667a2 = b5x0Var.m102667a(2);
        boolean zM102672f = b5x0Var.m102672f();
        int iM102667a3 = b5x0Var.m102667a(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (b5x0Var.m102672f()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = b5x0Var.m102667a(8);
        }
        int iM102667a4 = b5x0Var.m102667a(8);
        int i12 = 0;
        for (int i13 = 0; i13 < iM102667a; i13++) {
            if (b5x0Var.m102672f()) {
                i12 += 89;
            }
            if (b5x0Var.m102672f()) {
                i12 += 8;
            }
        }
        b5x0Var.m102671e(i12);
        if (iM102667a > 0) {
            int i14 = 8 - iM102667a;
            b5x0Var.m102671e(i14 + i14);
        }
        int iM102669c = b5x0Var.m102669c();
        int iM102669c2 = b5x0Var.m102669c();
        if (iM102669c2 == 3) {
            b5x0Var.m102670d();
            iM102669c2 = 3;
        }
        int iM102669c3 = b5x0Var.m102669c();
        int iM102669c4 = b5x0Var.m102669c();
        if (b5x0Var.m102672f()) {
            int iM102669c5 = b5x0Var.m102669c();
            int iM102669c6 = b5x0Var.m102669c();
            int iM102669c7 = b5x0Var.m102669c();
            int iM102669c8 = b5x0Var.m102669c();
            if (iM102669c2 == 1) {
                i6 = 2;
            } else if (iM102669c2 == 2) {
                iM102669c2 = 2;
                i6 = 2;
            } else {
                i6 = 1;
            }
            iM102669c3 -= i6 * (iM102669c5 + iM102669c6);
            iM102669c4 -= (iM102669c2 == 1 ? 2 : 1) * (iM102669c7 + iM102669c8);
        }
        int i15 = i8;
        int iM102669c9 = b5x0Var.m102669c();
        int iM102669c10 = b5x0Var.m102669c();
        int iM102669c11 = b5x0Var.m102669c();
        for (int i16 = true != b5x0Var.m102672f() ? iM102667a : 0; i16 <= iM102667a; i16++) {
            b5x0Var.m102669c();
            b5x0Var.m102669c();
            b5x0Var.m102669c();
        }
        b5x0Var.m102669c();
        b5x0Var.m102669c();
        b5x0Var.m102669c();
        b5x0Var.m102669c();
        b5x0Var.m102669c();
        b5x0Var.m102669c();
        if (b5x0Var.m102672f() && b5x0Var.m102672f()) {
            int i17 = 0;
            while (i17 < i7) {
                int i18 = 0;
                while (i18 < i10) {
                    if (b5x0Var.m102672f()) {
                        int iMin = Math.min(64, 1 << ((i17 + i17) + 4));
                        if (i17 > 1) {
                            b5x0Var.m102668b();
                        }
                        for (int i19 = 0; i19 < iMin; i19++) {
                            b5x0Var.m102668b();
                        }
                    } else {
                        b5x0Var.m102669c();
                    }
                    i18 += i17 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i17++;
                i7 = 4;
                i10 = 6;
            }
        }
        b5x0Var.m102671e(2);
        if (b5x0Var.m102672f()) {
            b5x0Var.m102671e(8);
            b5x0Var.m102669c();
            b5x0Var.m102669c();
            b5x0Var.m102670d();
        }
        int i20 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i21 = -1;
        int iM102669c12 = -1;
        int i22 = -1;
        for (int iM102669c13 = b5x0Var.m102669c(); i20 < iM102669c13; iM102669c13 = iM102669c13) {
            if (i20 == 0 || !b5x0Var.m102672f()) {
                int iM102669c14 = b5x0Var.m102669c();
                iM102669c12 = b5x0Var.m102669c();
                iArrCopyOf = new int[iM102669c14];
                int i23 = 0;
                while (i23 < iM102669c14) {
                    iArrCopyOf[i23] = (i23 > 0 ? iArrCopyOf[i23 - 1] : 0) - (b5x0Var.m102669c() + 1);
                    b5x0Var.m102670d();
                    i23++;
                }
                int[] iArr3 = new int[iM102669c12];
                int i24 = 0;
                while (i24 < iM102669c12) {
                    iArr3[i24] = (i24 > 0 ? iArr3[i24 - 1] : 0) + b5x0Var.m102669c() + 1;
                    b5x0Var.m102670d();
                    i24++;
                }
                i22 = iM102669c14;
                iArrCopyOf2 = iArr3;
            } else {
                int i25 = i22 + iM102669c12;
                boolean zM102672f2 = b5x0Var.m102672f();
                int iM102669c15 = b5x0Var.m102669c() + 1;
                int i26 = 1 - ((zM102672f2 ? 1 : 0) + (zM102672f2 ? 1 : 0));
                int i27 = i25 + 1;
                boolean[] zArr = new boolean[i27];
                for (int i28 = 0; i28 <= i25; i28++) {
                    if (b5x0Var.m102672f()) {
                        zArr[i28] = true;
                    } else {
                        zArr[i28] = b5x0Var.m102672f();
                    }
                }
                int i29 = iM102669c12 - 1;
                int[] iArr4 = new int[i27];
                int[] iArr5 = new int[i27];
                int i30 = 0;
                while (true) {
                    i5 = i26 * iM102669c15;
                    if (i29 < 0) {
                        break;
                    }
                    int i31 = iArrCopyOf2[i29] + i5;
                    if (i31 < 0 && zArr[i22 + i29]) {
                        iArr4[i30] = i31;
                        i30++;
                    }
                    i29--;
                }
                if (i5 < 0 && zArr[i25]) {
                    iArr4[i30] = i5;
                    i30++;
                }
                int i32 = i30;
                for (int i33 = 0; i33 < i22; i33++) {
                    int i34 = iArr2[i33] + i5;
                    if (i34 < 0 && zArr[i33]) {
                        iArr4[i32] = i34;
                        i32++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr4, i32);
                int i35 = 0;
                for (int i36 = i22 - 1; i36 >= 0; i36--) {
                    int i37 = iArr2[i36] + i5;
                    if (i37 > 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                if (i5 > 0 && zArr[i25]) {
                    iArr5[i35] = i5;
                    i35++;
                }
                int i38 = i35;
                for (int i39 = 0; i39 < iM102669c12; i39++) {
                    int i40 = iArrCopyOf2[i39] + i5;
                    if (i40 > 0 && zArr[i22 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr5, i38);
                i22 = i32;
                iM102669c12 = i38;
            }
            iArr2 = iArrCopyOf;
            i20++;
            iM102669c = iM102669c;
        }
        int i41 = iM102669c;
        if (b5x0Var.m102672f()) {
            int iM102669c16 = b5x0Var.m102669c();
            for (int i42 = 0; i42 < iM102669c16; i42++) {
                b5x0Var.m102671e(iM102669c11 + 5);
            }
        }
        b5x0Var.m102671e(2);
        float f = 1.0f;
        if (b5x0Var.m102672f()) {
            if (b5x0Var.m102672f()) {
                int iM102667a5 = b5x0Var.m102667a(8);
                if (iM102667a5 == 255) {
                    int iM102667a6 = b5x0Var.m102667a(16);
                    int iM102667a7 = b5x0Var.m102667a(16);
                    if (iM102667a6 != 0 && iM102667a7 != 0) {
                        f = iM102667a6 / iM102667a7;
                    }
                } else if (iM102667a5 < 17) {
                    f = f187181b[iM102667a5];
                } else {
                    y4w0.m214278f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM102667a5);
                }
            }
            if (b5x0Var.m102672f()) {
                b5x0Var.m102670d();
            }
            if (b5x0Var.m102672f()) {
                b5x0Var.m102671e(3);
                int i43 = true != b5x0Var.m102672f() ? 2 : 1;
                if (b5x0Var.m102672f()) {
                    int iM102667a8 = b5x0Var.m102667a(8);
                    int iM102667a9 = b5x0Var.m102667a(8);
                    b5x0Var.m102671e(8);
                    int iM208352a = wwy0.m208352a(iM102667a8);
                    iM208353b = wwy0.m208353b(iM102667a9);
                    i4 = iM208352a;
                } else {
                    i4 = -1;
                    iM208353b = -1;
                }
                i21 = i43;
            } else {
                i4 = -1;
                iM208353b = -1;
            }
            if (b5x0Var.m102672f()) {
                b5x0Var.m102669c();
                b5x0Var.m102669c();
            }
            b5x0Var.m102670d();
            if (b5x0Var.m102672f()) {
                iM102669c4 += iM102669c4;
            }
            i3 = i21;
            i21 = i4;
        } else {
            iM208353b = -1;
            i3 = -1;
        }
        return new f0x0(iM102667a2, zM102672f, iM102667a3, i15, iM102669c2, iM102669c9, iM102669c10, iArr, iM102667a4, i41, iM102669c3, iM102669c4, f, i21, i3, iM208353b);
    }

    /* JADX INFO: renamed from: d */
    public static j1x0 m204794d(byte[] bArr, int i, int i2) {
        b5x0 b5x0Var = new b5x0(bArr, 4, i2);
        int iM102669c = b5x0Var.m102669c();
        int iM102669c2 = b5x0Var.m102669c();
        b5x0Var.m102670d();
        return new j1x0(iM102669c, iM102669c2, b5x0Var.m102672f());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166  */
    /* JADX WARN: Code duplicated, block: B:86:0x0170  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183  */
    /* JADX WARN: Code duplicated, block: B:91:0x0186  */
    /* JADX WARN: Code duplicated, block: B:93:0x018a  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x018f, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static p2x0 m204795e(byte[] bArr, int i, int i2) {
        int iM102669c;
        int i3;
        boolean zM102672f;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int iM102668b;
        int i10;
        int i11;
        int iM102669c2;
        boolean z2;
        int i12;
        boolean zM102672f2;
        int i13;
        int i14;
        int i15;
        int iM208352a;
        int i16;
        int iM208353b;
        float f;
        int iM102667a;
        int iM102667a2;
        int i17;
        b5x0 b5x0Var = new b5x0(bArr, i, i2);
        int i18 = 8;
        int iM102667a3 = b5x0Var.m102667a(8);
        int iM102667a4 = b5x0Var.m102667a(8);
        int iM102667a5 = b5x0Var.m102667a(8);
        int iM102669c3 = b5x0Var.m102669c();
        int i19 = 1;
        if (iM102667a3 == 100 || iM102667a3 == 110 || iM102667a3 == 122 || iM102667a3 == 244 || iM102667a3 == 44 || iM102667a3 == 83 || iM102667a3 == 86 || iM102667a3 == 118 || iM102667a3 == 128) {
            iM102669c = b5x0Var.m102669c();
            if (iM102669c == 3) {
                zM102672f = b5x0Var.m102672f();
                i3 = 3;
            } else {
                i3 = iM102669c;
                zM102672f = false;
            }
            int iM102669c4 = b5x0Var.m102669c();
            int iM102669c5 = b5x0Var.m102669c();
            b5x0Var.m102670d();
            if (b5x0Var.m102672f()) {
                if (i3 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                i8 = 0;
                while (i8 < i7) {
                    if (!b5x0Var.m102672f()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iM102668b = i18;
                        i10 = iM102668b;
                        for (i11 = 0; i11 < i9; i11++) {
                            if (iM102668b != 0) {
                                iM102668b = ((i10 + b5x0Var.m102668b()) + 256) % 256;
                            }
                            if (iM102668b != 0) {
                                i10 = iM102668b;
                            }
                        }
                    }
                    i8++;
                    i18 = 8;
                }
            }
            i4 = 16;
            i5 = iM102669c4;
            i6 = iM102669c5;
            z = zM102672f;
        } else if (iM102667a3 == 138) {
            iM102667a3 = 138;
            iM102669c = b5x0Var.m102669c();
            if (iM102669c == 3) {
                zM102672f = b5x0Var.m102672f();
                i3 = 3;
            } else {
                i3 = iM102669c;
                zM102672f = false;
            }
            int iM102669c6 = b5x0Var.m102669c();
            int iM102669c7 = b5x0Var.m102669c();
            b5x0Var.m102670d();
            if (b5x0Var.m102672f()) {
                if (i3 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                i8 = 0;
                while (i8 < i7) {
                    if (!b5x0Var.m102672f()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iM102668b = i18;
                        i10 = iM102668b;
                        while (i11 < i9) {
                            if (iM102668b != 0) {
                                iM102668b = ((i10 + b5x0Var.m102668b()) + 256) % 256;
                            }
                            if (iM102668b != 0) {
                                i10 = iM102668b;
                            }
                        }
                    }
                    i8++;
                    i18 = 8;
                }
            }
            i4 = 16;
            i5 = iM102669c6;
            i6 = iM102669c7;
            z = zM102672f;
        } else {
            iM102669c = 1;
            i4 = 16;
            i5 = 0;
            i6 = 0;
            z = false;
        }
        int i20 = iM102667a3;
        int iM102669c8 = b5x0Var.m102669c() + 4;
        int iM102669c9 = b5x0Var.m102669c();
        if (iM102669c9 != 0) {
            if (iM102669c9 == 1) {
                boolean zM102672f3 = b5x0Var.m102672f();
                b5x0Var.m102668b();
                b5x0Var.m102668b();
                long jM102669c = b5x0Var.m102669c();
                i19 = 1;
                for (int i21 = 0; i21 < jM102669c; i21++) {
                    b5x0Var.m102669c();
                }
                z2 = zM102672f3;
                iM102669c9 = 1;
                iM102669c2 = 0;
            } else {
                iM102669c2 = 0;
            }
            int iM102669c10 = b5x0Var.m102669c();
            b5x0Var.m102670d();
            int iM102669c11 = b5x0Var.m102669c() + i19;
            int iM102669c12 = b5x0Var.m102669c() + i19;
            i12 = i19;
            zM102672f2 = b5x0Var.m102672f();
            i13 = 2 - (zM102672f2 ? 1 : 0);
            if (!zM102672f2) {
                b5x0Var.m102670d();
            }
            b5x0Var.m102670d();
            i14 = iM102669c11 * 16;
            i15 = iM102669c12 * i13 * 16;
            if (b5x0Var.m102672f()) {
                int iM102669c13 = b5x0Var.m102669c();
                int iM102669c14 = b5x0Var.m102669c();
                int iM102669c15 = b5x0Var.m102669c();
                int iM102669c16 = b5x0Var.m102669c();
                if (iM102669c != 0) {
                    if (iM102669c != 3) {
                        i12 = 2;
                    }
                    if (iM102669c == i12) {
                        i17 = 2;
                    } else {
                        i17 = 1;
                    }
                    i13 *= i17;
                }
                i14 -= (iM102669c13 + iM102669c14) * i12;
                i15 -= (iM102669c15 + iM102669c16) * i13;
            }
            int i22 = i15;
            iM208352a = -1;
            if (b5x0Var.m102672f()) {
                if (b5x0Var.m102672f()) {
                    iM102667a = b5x0Var.m102667a(8);
                    if (iM102667a == 255) {
                        int i23 = i4;
                        iM102667a2 = b5x0Var.m102667a(i23);
                        int iM102667a6 = b5x0Var.m102667a(i23);
                        if (iM102667a2 != 0 || iM102667a6 == 0) {
                            f = 1.0f;
                        } else {
                            f = iM102667a2 / iM102667a6;
                        }
                    } else if (iM102667a < 17) {
                        f = f187181b[iM102667a];
                    } else {
                        y4w0.m214278f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM102667a);
                        f = 1.0f;
                    }
                } else {
                    f = 1.0f;
                }
                if (b5x0Var.m102672f()) {
                    b5x0Var.m102670d();
                }
                if (b5x0Var.m102672f()) {
                    b5x0Var.m102671e(3);
                    i16 = true == b5x0Var.m102672f() ? 1 : 2;
                    if (b5x0Var.m102672f()) {
                        int iM102667a7 = b5x0Var.m102667a(8);
                        int iM102667a8 = b5x0Var.m102667a(8);
                        b5x0Var.m102671e(8);
                        iM208352a = wwy0.m208352a(iM102667a7);
                        iM208353b = wwy0.m208353b(iM102667a8);
                    } else {
                        iM208353b = -1;
                    }
                } else {
                    i16 = -1;
                    iM208353b = -1;
                }
            } else {
                i16 = -1;
                iM208353b = -1;
                f = 1.0f;
            }
            return new p2x0(i20, iM102667a4, iM102667a5, iM102669c3, iM102669c10, i14, i22, f, i5, i6, z, zM102672f2, iM102669c8, iM102669c9, iM102669c2, z2, iM208352a, i16, iM208353b);
        }
        iM102669c2 = b5x0Var.m102669c() + 4;
        z2 = false;
        int iM102669c17 = b5x0Var.m102669c();
        b5x0Var.m102670d();
        int iM102669c18 = b5x0Var.m102669c() + i19;
        int iM102669c19 = b5x0Var.m102669c() + i19;
        i12 = i19;
        zM102672f2 = b5x0Var.m102672f();
        i13 = 2 - (zM102672f2 ? 1 : 0);
        if (!zM102672f2) {
            b5x0Var.m102670d();
        }
        b5x0Var.m102670d();
        i14 = iM102669c18 * 16;
        i15 = iM102669c19 * i13 * 16;
        if (b5x0Var.m102672f()) {
            int iM102669c110 = b5x0Var.m102669c();
            int iM102669c111 = b5x0Var.m102669c();
            int iM102669c112 = b5x0Var.m102669c();
            int iM102669c113 = b5x0Var.m102669c();
            if (iM102669c != 0) {
                if (iM102669c != 3) {
                    i12 = 2;
                }
                if (iM102669c == i12) {
                    i17 = 2;
                } else {
                    i17 = 1;
                }
                i13 *= i17;
            }
            i14 -= (iM102669c110 + iM102669c111) * i12;
            i15 -= (iM102669c112 + iM102669c113) * i13;
        }
        int i24 = i15;
        iM208352a = -1;
        if (b5x0Var.m102672f()) {
            if (b5x0Var.m102672f()) {
                f = 1.0f;
            } else {
                iM102667a = b5x0Var.m102667a(8);
                if (iM102667a == 255) {
                    int i25 = i4;
                    iM102667a2 = b5x0Var.m102667a(i25);
                    int iM102667a9 = b5x0Var.m102667a(i25);
                    if (iM102667a2 != 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                } else if (iM102667a < 17) {
                    f = f187181b[iM102667a];
                } else {
                    y4w0.m214278f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM102667a);
                    f = 1.0f;
                }
            }
            if (b5x0Var.m102672f()) {
                b5x0Var.m102670d();
            }
            if (b5x0Var.m102672f()) {
                b5x0Var.m102671e(3);
                if (true == b5x0Var.m102672f()) {
                }
                if (b5x0Var.m102672f()) {
                    int iM102667a10 = b5x0Var.m102667a(8);
                    int iM102667a11 = b5x0Var.m102667a(8);
                    b5x0Var.m102671e(8);
                    iM208352a = wwy0.m208352a(iM102667a10);
                    iM208353b = wwy0.m208353b(iM102667a11);
                } else {
                    iM208353b = -1;
                }
            } else {
                i16 = -1;
                iM208353b = -1;
            }
        } else {
            i16 = -1;
            iM208353b = -1;
            f = 1.0f;
        }
        return new p2x0(i20, iM102667a4, iM102667a5, iM102669c3, iM102669c17, i14, i24, f, i5, i6, z, zM102672f2, iM102669c8, iM102669c9, iM102669c2, z2, iM208352a, i16, iM208353b);
    }

    /* JADX INFO: renamed from: f */
    public static void m204796f(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
