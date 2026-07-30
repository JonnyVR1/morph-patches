package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class gnr0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f105137a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static boolean m130978a(qer0 qer0Var) throws IOException {
        return m130980c(qer0Var, true, false);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m130979b(qer0 qer0Var, boolean z) throws IOException {
        return m130980c(qer0Var, false, z);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100 A[LOOP:2: B:65:0x00f7->B:70:0x0100, LOOP_END] */
    /* JADX INFO: renamed from: c */
    public static boolean m130980c(qer0 qer0Var, boolean z, boolean z2) throws IOException {
        long jM104252I;
        int i;
        bgw0 bgw0Var;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        long jZzd = qer0Var.zzd();
        long j = -1;
        long j2 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j2 = jZzd;
        }
        bgw0 bgw0Var2 = new bgw0(64);
        int i5 = (int) j2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= i5) {
                i6 = 0;
                break;
            }
            bgw0Var2.m104266h(8);
            if (!qer0Var.mo125313c(bgw0Var2.m104271m(), i6, 8, true)) {
                break;
            }
            long jM104253J = bgw0Var2.m104253J();
            int iM104280v = bgw0Var2.m104280v();
            if (jM104253J == 1) {
                qer0Var.mo125317i(bgw0Var2.m104271m(), 8, 8);
                i = 16;
                bgw0Var2.m104268j(16);
                jM104252I = bgw0Var2.m104252I();
            } else {
                if (jM104253J == 0) {
                    long jZzd2 = qer0Var.zzd();
                    if (jZzd2 != j) {
                        jM104253J = (jZzd2 - qer0Var.zze()) + 8;
                    }
                }
                jM104252I = jM104253J;
                i = 8;
            }
            long j3 = i;
            if (jM104252I >= j3) {
                i7 += i;
                if (iM104280v != 1836019574) {
                    if (iM104280v == 1836019558) {
                        i6 = 1;
                        break;
                    }
                    if (iM104280v == 1836475768) {
                        i6 = 1;
                        break;
                    }
                    i8 |= (iM104280v == 1835295092 ? i6 : 1) ^ 1;
                    bgw0 bgw0Var3 = bgw0Var2;
                    if ((((long) i7) + jM104252I) - j3 >= i5) {
                        i6 = i6;
                        break;
                    }
                    int i9 = (int) (jM104252I - j3);
                    i7 += i9;
                    if (iM104280v != 1718909296) {
                        bgw0Var = bgw0Var3;
                        if (i9 != 0) {
                            qer0Var.zzg(i9);
                        }
                    } else {
                        if (i9 < 8) {
                            return i6;
                        }
                        bgw0Var = bgw0Var3;
                        bgw0Var.m104266h(i9);
                        qer0Var.mo125317i(bgw0Var.m104271m(), i2, i9);
                        int i10 = i9 >> 2;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i10) {
                                i2 = i6;
                                i3 = i8;
                                break;
                            }
                            if (i11 != 1) {
                                int iM104280v2 = bgw0Var.m104280v();
                                if ((iM104280v2 >>> 8) == 3368816) {
                                    i2 = i6;
                                } else if (iM104280v2 != 1751476579) {
                                    i2 = i6;
                                    iArr = f105137a;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < 29) {
                                            continue;
                                        } else if (iArr[i4] == iM104280v2) {
                                            i4++;
                                        }
                                    }
                                } else if (!z2) {
                                    iM104280v2 = 1751476579;
                                    i2 = i6;
                                    iArr = f105137a;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < 29) {
                                            continue;
                                        } else if (iArr[i4] == iM104280v2) {
                                            i4++;
                                        }
                                    }
                                }
                                i3 = 1;
                                break;
                            }
                            i2 = i6;
                            bgw0Var.m104270l(4);
                            i11++;
                        }
                        if (i3 == 0) {
                            return false;
                        }
                        i8 = i3;
                    }
                    bgw0Var2 = bgw0Var;
                    j = -1;
                    i6 = 0;
                } else {
                    i5 += (int) jM104252I;
                    if (jZzd != -1 && i5 > jZzd) {
                        i5 = (int) jZzd;
                    }
                    bgw0Var2 = bgw0Var2;
                    i6 = i6;
                    j = -1;
                }
            } else {
                return i6;
            }
        }
        return i8 != 0 && z == i6;
    }
}
