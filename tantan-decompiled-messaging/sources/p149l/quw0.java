package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class quw0 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f156548a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f156549b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f156550c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f156551d = new int[10];

    /* JADX INFO: renamed from: a */
    public static int m176658a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        f5v0.m119535f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m176663f(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m176663f(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m176663f(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m176663f(zArr);
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
    public static int m176659b(byte[] bArr, int i) {
        int i2;
        synchronized (f156550c) {
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
                    int[] iArr = f156551d;
                    int length = iArr.length;
                    if (length <= i4) {
                        f156551d = Arrays.copyOf(iArr, length + length);
                    }
                    f156551d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = f156551d[i8] - i6;
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
    public static zqw0 m176660c(byte[] bArr, int i, int i2) {
        int iM175708b;
        int i3;
        int i4;
        int[] iArrCopyOf;
        int i5;
        int i6;
        vvw0 vvw0Var = new vvw0(bArr, i, i2);
        int i7 = 4;
        vvw0Var.m200216e(4);
        int iM200212a = vvw0Var.m200212a(3);
        vvw0Var.m200215d();
        int iM200212a2 = vvw0Var.m200212a(2);
        boolean zM200217f = vvw0Var.m200217f();
        int iM200212a3 = vvw0Var.m200212a(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (vvw0Var.m200217f()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = vvw0Var.m200212a(8);
        }
        int iM200212a4 = vvw0Var.m200212a(8);
        int i12 = 0;
        for (int i13 = 0; i13 < iM200212a; i13++) {
            if (vvw0Var.m200217f()) {
                i12 += 89;
            }
            if (vvw0Var.m200217f()) {
                i12 += 8;
            }
        }
        vvw0Var.m200216e(i12);
        if (iM200212a > 0) {
            int i14 = 8 - iM200212a;
            vvw0Var.m200216e(i14 + i14);
        }
        int iM200214c = vvw0Var.m200214c();
        int iM200214c2 = vvw0Var.m200214c();
        if (iM200214c2 == 3) {
            vvw0Var.m200215d();
            iM200214c2 = 3;
        }
        int iM200214c3 = vvw0Var.m200214c();
        int iM200214c4 = vvw0Var.m200214c();
        if (vvw0Var.m200217f()) {
            int iM200214c5 = vvw0Var.m200214c();
            int iM200214c6 = vvw0Var.m200214c();
            int iM200214c7 = vvw0Var.m200214c();
            int iM200214c8 = vvw0Var.m200214c();
            if (iM200214c2 == 1) {
                i6 = 2;
            } else if (iM200214c2 == 2) {
                iM200214c2 = 2;
                i6 = 2;
            } else {
                i6 = 1;
            }
            iM200214c3 -= i6 * (iM200214c5 + iM200214c6);
            iM200214c4 -= (iM200214c2 == 1 ? 2 : 1) * (iM200214c7 + iM200214c8);
        }
        int i15 = i8;
        int iM200214c9 = vvw0Var.m200214c();
        int iM200214c10 = vvw0Var.m200214c();
        int iM200214c11 = vvw0Var.m200214c();
        for (int i16 = true != vvw0Var.m200217f() ? iM200212a : 0; i16 <= iM200212a; i16++) {
            vvw0Var.m200214c();
            vvw0Var.m200214c();
            vvw0Var.m200214c();
        }
        vvw0Var.m200214c();
        vvw0Var.m200214c();
        vvw0Var.m200214c();
        vvw0Var.m200214c();
        vvw0Var.m200214c();
        vvw0Var.m200214c();
        if (vvw0Var.m200217f() && vvw0Var.m200217f()) {
            int i17 = 0;
            while (i17 < i7) {
                int i18 = 0;
                while (i18 < i10) {
                    if (vvw0Var.m200217f()) {
                        int iMin = Math.min(64, 1 << ((i17 + i17) + 4));
                        if (i17 > 1) {
                            vvw0Var.m200213b();
                        }
                        for (int i19 = 0; i19 < iMin; i19++) {
                            vvw0Var.m200213b();
                        }
                    } else {
                        vvw0Var.m200214c();
                    }
                    i18 += i17 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i17++;
                i7 = 4;
                i10 = 6;
            }
        }
        vvw0Var.m200216e(2);
        if (vvw0Var.m200217f()) {
            vvw0Var.m200216e(8);
            vvw0Var.m200214c();
            vvw0Var.m200214c();
            vvw0Var.m200215d();
        }
        int i20 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf2 = new int[0];
        int i21 = -1;
        int iM200214c12 = -1;
        int i22 = -1;
        for (int iM200214c13 = vvw0Var.m200214c(); i20 < iM200214c13; iM200214c13 = iM200214c13) {
            if (i20 == 0 || !vvw0Var.m200217f()) {
                int iM200214c14 = vvw0Var.m200214c();
                iM200214c12 = vvw0Var.m200214c();
                iArrCopyOf = new int[iM200214c14];
                int i23 = 0;
                while (i23 < iM200214c14) {
                    iArrCopyOf[i23] = (i23 > 0 ? iArrCopyOf[i23 - 1] : 0) - (vvw0Var.m200214c() + 1);
                    vvw0Var.m200215d();
                    i23++;
                }
                int[] iArr3 = new int[iM200214c12];
                int i24 = 0;
                while (i24 < iM200214c12) {
                    iArr3[i24] = (i24 > 0 ? iArr3[i24 - 1] : 0) + vvw0Var.m200214c() + 1;
                    vvw0Var.m200215d();
                    i24++;
                }
                i22 = iM200214c14;
                iArrCopyOf2 = iArr3;
            } else {
                int i25 = i22 + iM200214c12;
                boolean zM200217f2 = vvw0Var.m200217f();
                int iM200214c15 = vvw0Var.m200214c() + 1;
                int i26 = 1 - ((zM200217f2 ? 1 : 0) + (zM200217f2 ? 1 : 0));
                int i27 = i25 + 1;
                boolean[] zArr = new boolean[i27];
                for (int i28 = 0; i28 <= i25; i28++) {
                    if (vvw0Var.m200217f()) {
                        zArr[i28] = true;
                    } else {
                        zArr[i28] = vvw0Var.m200217f();
                    }
                }
                int i29 = iM200214c12 - 1;
                int[] iArr4 = new int[i27];
                int[] iArr5 = new int[i27];
                int i30 = 0;
                while (true) {
                    i5 = i26 * iM200214c15;
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
                for (int i39 = 0; i39 < iM200214c12; i39++) {
                    int i40 = iArrCopyOf2[i39] + i5;
                    if (i40 > 0 && zArr[i22 + i39]) {
                        iArr5[i38] = i40;
                        i38++;
                    }
                }
                iArrCopyOf2 = Arrays.copyOf(iArr5, i38);
                i22 = i32;
                iM200214c12 = i38;
            }
            iArr2 = iArrCopyOf;
            i20++;
            iM200214c = iM200214c;
        }
        int i41 = iM200214c;
        if (vvw0Var.m200217f()) {
            int iM200214c16 = vvw0Var.m200214c();
            for (int i42 = 0; i42 < iM200214c16; i42++) {
                vvw0Var.m200216e(iM200214c11 + 5);
            }
        }
        vvw0Var.m200216e(2);
        float f = 1.0f;
        if (vvw0Var.m200217f()) {
            if (vvw0Var.m200217f()) {
                int iM200212a5 = vvw0Var.m200212a(8);
                if (iM200212a5 == 255) {
                    int iM200212a6 = vvw0Var.m200212a(16);
                    int iM200212a7 = vvw0Var.m200212a(16);
                    if (iM200212a6 != 0 && iM200212a7 != 0) {
                        f = iM200212a6 / iM200212a7;
                    }
                } else if (iM200212a5 < 17) {
                    f = f156549b[iM200212a5];
                } else {
                    svv0.m186111f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM200212a5);
                }
            }
            if (vvw0Var.m200217f()) {
                vvw0Var.m200215d();
            }
            if (vvw0Var.m200217f()) {
                vvw0Var.m200216e(3);
                int i43 = true != vvw0Var.m200217f() ? 2 : 1;
                if (vvw0Var.m200217f()) {
                    int iM200212a8 = vvw0Var.m200212a(8);
                    int iM200212a9 = vvw0Var.m200212a(8);
                    vvw0Var.m200216e(8);
                    int iM175707a = qny0.m175707a(iM200212a8);
                    iM175708b = qny0.m175708b(iM200212a9);
                    i4 = iM175707a;
                } else {
                    i4 = -1;
                    iM175708b = -1;
                }
                i21 = i43;
            } else {
                i4 = -1;
                iM175708b = -1;
            }
            if (vvw0Var.m200217f()) {
                vvw0Var.m200214c();
                vvw0Var.m200214c();
            }
            vvw0Var.m200215d();
            if (vvw0Var.m200217f()) {
                iM200214c4 += iM200214c4;
            }
            i3 = i21;
            i21 = i4;
        } else {
            iM175708b = -1;
            i3 = -1;
        }
        return new zqw0(iM200212a2, zM200217f, iM200212a3, i15, iM200214c2, iM200214c9, iM200214c10, iArr, iM200212a4, i41, iM200214c3, iM200214c4, f, i21, i3, iM175708b);
    }

    /* JADX INFO: renamed from: d */
    public static dsw0 m176661d(byte[] bArr, int i, int i2) {
        vvw0 vvw0Var = new vvw0(bArr, 4, i2);
        int iM200214c = vvw0Var.m200214c();
        int iM200214c2 = vvw0Var.m200214c();
        vvw0Var.m200215d();
        return new dsw0(iM200214c, iM200214c2, vvw0Var.m200217f());
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
    public static jtw0 m176662e(byte[] bArr, int i, int i2) {
        int iM200214c;
        int i3;
        boolean zM200217f;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int iM200213b;
        int i10;
        int i11;
        int iM200214c2;
        boolean z2;
        int i12;
        boolean zM200217f2;
        int i13;
        int i14;
        int i15;
        int iM175707a;
        int i16;
        int iM175708b;
        float f;
        int iM200212a;
        int iM200212a2;
        int i17;
        vvw0 vvw0Var = new vvw0(bArr, i, i2);
        int i18 = 8;
        int iM200212a3 = vvw0Var.m200212a(8);
        int iM200212a4 = vvw0Var.m200212a(8);
        int iM200212a5 = vvw0Var.m200212a(8);
        int iM200214c3 = vvw0Var.m200214c();
        int i19 = 1;
        if (iM200212a3 == 100 || iM200212a3 == 110 || iM200212a3 == 122 || iM200212a3 == 244 || iM200212a3 == 44 || iM200212a3 == 83 || iM200212a3 == 86 || iM200212a3 == 118 || iM200212a3 == 128) {
            iM200214c = vvw0Var.m200214c();
            if (iM200214c == 3) {
                zM200217f = vvw0Var.m200217f();
                i3 = 3;
            } else {
                i3 = iM200214c;
                zM200217f = false;
            }
            int iM200214c4 = vvw0Var.m200214c();
            int iM200214c5 = vvw0Var.m200214c();
            vvw0Var.m200215d();
            if (vvw0Var.m200217f()) {
                if (i3 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                i8 = 0;
                while (i8 < i7) {
                    if (!vvw0Var.m200217f()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iM200213b = i18;
                        i10 = iM200213b;
                        for (i11 = 0; i11 < i9; i11++) {
                            if (iM200213b != 0) {
                                iM200213b = ((i10 + vvw0Var.m200213b()) + 256) % 256;
                            }
                            if (iM200213b != 0) {
                                i10 = iM200213b;
                            }
                        }
                    }
                    i8++;
                    i18 = 8;
                }
            }
            i4 = 16;
            i5 = iM200214c4;
            i6 = iM200214c5;
            z = zM200217f;
        } else if (iM200212a3 == 138) {
            iM200212a3 = 138;
            iM200214c = vvw0Var.m200214c();
            if (iM200214c == 3) {
                zM200217f = vvw0Var.m200217f();
                i3 = 3;
            } else {
                i3 = iM200214c;
                zM200217f = false;
            }
            int iM200214c6 = vvw0Var.m200214c();
            int iM200214c7 = vvw0Var.m200214c();
            vvw0Var.m200215d();
            if (vvw0Var.m200217f()) {
                if (i3 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                i8 = 0;
                while (i8 < i7) {
                    if (!vvw0Var.m200217f()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iM200213b = i18;
                        i10 = iM200213b;
                        while (i11 < i9) {
                            if (iM200213b != 0) {
                                iM200213b = ((i10 + vvw0Var.m200213b()) + 256) % 256;
                            }
                            if (iM200213b != 0) {
                                i10 = iM200213b;
                            }
                        }
                    }
                    i8++;
                    i18 = 8;
                }
            }
            i4 = 16;
            i5 = iM200214c6;
            i6 = iM200214c7;
            z = zM200217f;
        } else {
            iM200214c = 1;
            i4 = 16;
            i5 = 0;
            i6 = 0;
            z = false;
        }
        int i20 = iM200212a3;
        int iM200214c8 = vvw0Var.m200214c() + 4;
        int iM200214c9 = vvw0Var.m200214c();
        if (iM200214c9 != 0) {
            if (iM200214c9 == 1) {
                boolean zM200217f3 = vvw0Var.m200217f();
                vvw0Var.m200213b();
                vvw0Var.m200213b();
                long jM200214c = vvw0Var.m200214c();
                i19 = 1;
                for (int i21 = 0; i21 < jM200214c; i21++) {
                    vvw0Var.m200214c();
                }
                z2 = zM200217f3;
                iM200214c9 = 1;
                iM200214c2 = 0;
            } else {
                iM200214c2 = 0;
            }
            int iM200214c10 = vvw0Var.m200214c();
            vvw0Var.m200215d();
            int iM200214c11 = vvw0Var.m200214c() + i19;
            int iM200214c12 = vvw0Var.m200214c() + i19;
            i12 = i19;
            zM200217f2 = vvw0Var.m200217f();
            i13 = 2 - (zM200217f2 ? 1 : 0);
            if (!zM200217f2) {
                vvw0Var.m200215d();
            }
            vvw0Var.m200215d();
            i14 = iM200214c11 * 16;
            i15 = iM200214c12 * i13 * 16;
            if (vvw0Var.m200217f()) {
                int iM200214c13 = vvw0Var.m200214c();
                int iM200214c14 = vvw0Var.m200214c();
                int iM200214c15 = vvw0Var.m200214c();
                int iM200214c16 = vvw0Var.m200214c();
                if (iM200214c != 0) {
                    if (iM200214c != 3) {
                        i12 = 2;
                    }
                    if (iM200214c == i12) {
                        i17 = 2;
                    } else {
                        i17 = 1;
                    }
                    i13 *= i17;
                }
                i14 -= (iM200214c13 + iM200214c14) * i12;
                i15 -= (iM200214c15 + iM200214c16) * i13;
            }
            int i22 = i15;
            iM175707a = -1;
            if (vvw0Var.m200217f()) {
                if (vvw0Var.m200217f()) {
                    iM200212a = vvw0Var.m200212a(8);
                    if (iM200212a == 255) {
                        int i23 = i4;
                        iM200212a2 = vvw0Var.m200212a(i23);
                        int iM200212a6 = vvw0Var.m200212a(i23);
                        if (iM200212a2 != 0 || iM200212a6 == 0) {
                            f = 1.0f;
                        } else {
                            f = iM200212a2 / iM200212a6;
                        }
                    } else if (iM200212a < 17) {
                        f = f156549b[iM200212a];
                    } else {
                        svv0.m186111f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM200212a);
                        f = 1.0f;
                    }
                } else {
                    f = 1.0f;
                }
                if (vvw0Var.m200217f()) {
                    vvw0Var.m200215d();
                }
                if (vvw0Var.m200217f()) {
                    vvw0Var.m200216e(3);
                    i16 = true == vvw0Var.m200217f() ? 1 : 2;
                    if (vvw0Var.m200217f()) {
                        int iM200212a7 = vvw0Var.m200212a(8);
                        int iM200212a8 = vvw0Var.m200212a(8);
                        vvw0Var.m200216e(8);
                        iM175707a = qny0.m175707a(iM200212a7);
                        iM175708b = qny0.m175708b(iM200212a8);
                    } else {
                        iM175708b = -1;
                    }
                } else {
                    i16 = -1;
                    iM175708b = -1;
                }
            } else {
                i16 = -1;
                iM175708b = -1;
                f = 1.0f;
            }
            return new jtw0(i20, iM200212a4, iM200212a5, iM200214c3, iM200214c10, i14, i22, f, i5, i6, z, zM200217f2, iM200214c8, iM200214c9, iM200214c2, z2, iM175707a, i16, iM175708b);
        }
        iM200214c2 = vvw0Var.m200214c() + 4;
        z2 = false;
        int iM200214c17 = vvw0Var.m200214c();
        vvw0Var.m200215d();
        int iM200214c18 = vvw0Var.m200214c() + i19;
        int iM200214c19 = vvw0Var.m200214c() + i19;
        i12 = i19;
        zM200217f2 = vvw0Var.m200217f();
        i13 = 2 - (zM200217f2 ? 1 : 0);
        if (!zM200217f2) {
            vvw0Var.m200215d();
        }
        vvw0Var.m200215d();
        i14 = iM200214c18 * 16;
        i15 = iM200214c19 * i13 * 16;
        if (vvw0Var.m200217f()) {
            int iM200214c110 = vvw0Var.m200214c();
            int iM200214c111 = vvw0Var.m200214c();
            int iM200214c112 = vvw0Var.m200214c();
            int iM200214c113 = vvw0Var.m200214c();
            if (iM200214c != 0) {
                if (iM200214c != 3) {
                    i12 = 2;
                }
                if (iM200214c == i12) {
                    i17 = 2;
                } else {
                    i17 = 1;
                }
                i13 *= i17;
            }
            i14 -= (iM200214c110 + iM200214c111) * i12;
            i15 -= (iM200214c112 + iM200214c113) * i13;
        }
        int i24 = i15;
        iM175707a = -1;
        if (vvw0Var.m200217f()) {
            if (vvw0Var.m200217f()) {
                f = 1.0f;
            } else {
                iM200212a = vvw0Var.m200212a(8);
                if (iM200212a == 255) {
                    int i25 = i4;
                    iM200212a2 = vvw0Var.m200212a(i25);
                    int iM200212a9 = vvw0Var.m200212a(i25);
                    if (iM200212a2 != 0) {
                        f = 1.0f;
                    } else {
                        f = 1.0f;
                    }
                } else if (iM200212a < 17) {
                    f = f156549b[iM200212a];
                } else {
                    svv0.m186111f("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM200212a);
                    f = 1.0f;
                }
            }
            if (vvw0Var.m200217f()) {
                vvw0Var.m200215d();
            }
            if (vvw0Var.m200217f()) {
                vvw0Var.m200216e(3);
                if (true == vvw0Var.m200217f()) {
                }
                if (vvw0Var.m200217f()) {
                    int iM200212a10 = vvw0Var.m200212a(8);
                    int iM200212a11 = vvw0Var.m200212a(8);
                    vvw0Var.m200216e(8);
                    iM175707a = qny0.m175707a(iM200212a10);
                    iM175708b = qny0.m175708b(iM200212a11);
                } else {
                    iM175708b = -1;
                }
            } else {
                i16 = -1;
                iM175708b = -1;
            }
        } else {
            i16 = -1;
            iM175708b = -1;
            f = 1.0f;
        }
        return new jtw0(i20, iM200212a4, iM200212a5, iM200214c3, iM200214c17, i14, i24, f, i5, i6, z, zM200217f2, iM200214c8, iM200214c9, iM200214c2, z2, iM175707a, i16, iM175708b);
    }

    /* JADX INFO: renamed from: f */
    public static void m176663f(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
