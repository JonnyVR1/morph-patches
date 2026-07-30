package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nkf0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f139413a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static boolean m159836a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f139413a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m159837b(tqf tqfVar) throws IOException {
        return m159838c(tqfVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m159838c(tqf tqfVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        int i;
        long length = tqfVar.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && length <= 4096) {
            j2 = length;
        }
        int i3 = (int) j2;
        d860 d860Var = new d860(64);
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 < i3) {
                d860Var.m110288Q(8);
                if (tqfVar.mo150656g(d860Var.m110299e(), i4, 8, true)) {
                    long jM110281J = d860Var.m110281J();
                    int iM110311q = d860Var.m110311q();
                    if (jM110281J == 1) {
                        tqfVar.mo150655f(d860Var.m110299e(), 8, 8);
                        d860Var.m110291T(16);
                        i = 16;
                        jM110281J = d860Var.m110272A();
                    } else {
                        if (jM110281J == 0) {
                            long length2 = tqfVar.getLength();
                            if (length2 != j) {
                                jM110281J = (length2 - tqfVar.mo150659k()) + 8;
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (jM110281J < j3) {
                        return i4;
                    }
                    int i6 = i5 + i;
                    boolean z5 = i4;
                    if (iM110311q == 1836019574) {
                        i3 += (int) jM110281J;
                        if (i2 != 0 && i3 > length) {
                            i3 = (int) length;
                        }
                        i5 = i6;
                        i4 = z5 ? 1 : 0;
                        j = -1;
                    } else {
                        if (iM110311q == 1836019558 || iM110311q == 1836475768) {
                            z3 = true;
                            return z4 && z == z3;
                        }
                        int i7 = i2;
                        if ((((long) i6) + jM110281J) - j3 < i3) {
                            int i8 = (int) (jM110281J - j3);
                            i5 = i6 + i8;
                            if (iM110311q == 1718909296) {
                                if (i8 < 8) {
                                    return z5;
                                }
                                d860Var.m110288Q(i8);
                                tqfVar.mo150655f(d860Var.m110299e(), z5 ? 1 : 0, i8);
                                int i9 = i8 / 4;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if (i10 != 1) {
                                        if (m159836a(d860Var.m110311q(), z2)) {
                                            z4 = true;
                                            break;
                                        }
                                    } else {
                                        d860Var.m110293V(4);
                                    }
                                }
                                if (!z4) {
                                    return false;
                                }
                            } else if (i8 != 0) {
                                tqfVar.mo150660m(i8);
                            }
                            i2 = i7;
                            j = -1;
                            i4 = 0;
                        }
                    }
                }
            }
            z3 = false;
            if (z4) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m159839d(tqf tqfVar, boolean z) throws IOException {
        return m159838c(tqfVar, false, z);
    }
}
