package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wsf0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f190629a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static boolean m207765a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f190629a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m207766b(asf asfVar) throws IOException {
        return m207767c(asfVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static boolean m207767c(asf asfVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        int i;
        long length = asfVar.getLength();
        long j = -1;
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i2 != 0 && length <= 4096) {
            j2 = length;
        }
        int i3 = (int) j2;
        ig60 ig60Var = new ig60(64);
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 < i3) {
                ig60Var.m139804Q(8);
                if (asfVar.mo99901g(ig60Var.m139815e(), i4, 8, true)) {
                    long jM139797J = ig60Var.m139797J();
                    int iM139827q = ig60Var.m139827q();
                    if (jM139797J == 1) {
                        asfVar.mo99900f(ig60Var.m139815e(), 8, 8);
                        ig60Var.m139807T(16);
                        i = 16;
                        jM139797J = ig60Var.m139788A();
                    } else {
                        if (jM139797J == 0) {
                            long length2 = asfVar.getLength();
                            if (length2 != j) {
                                jM139797J = (length2 - asfVar.mo99903k()) + 8;
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (jM139797J < j3) {
                        return i4;
                    }
                    int i6 = i5 + i;
                    boolean z5 = i4;
                    if (iM139827q == 1836019574) {
                        i3 += (int) jM139797J;
                        if (i2 != 0 && i3 > length) {
                            i3 = (int) length;
                        }
                        i5 = i6;
                        i4 = z5 ? 1 : 0;
                        j = -1;
                    } else {
                        if (iM139827q == 1836019558 || iM139827q == 1836475768) {
                            z3 = true;
                            return z4 && z == z3;
                        }
                        int i7 = i2;
                        if ((((long) i6) + jM139797J) - j3 < i3) {
                            int i8 = (int) (jM139797J - j3);
                            i5 = i6 + i8;
                            if (iM139827q == 1718909296) {
                                if (i8 < 8) {
                                    return z5;
                                }
                                ig60Var.m139804Q(i8);
                                asfVar.mo99900f(ig60Var.m139815e(), z5 ? 1 : 0, i8);
                                int i9 = i8 / 4;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if (i10 != 1) {
                                        if (m207765a(ig60Var.m139827q(), z2)) {
                                            z4 = true;
                                            break;
                                        }
                                    } else {
                                        ig60Var.m139809V(4);
                                    }
                                }
                                if (!z4) {
                                    return false;
                                }
                            } else if (i8 != 0) {
                                asfVar.mo99904m(i8);
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
    public static boolean m207768d(asf asfVar, boolean z) throws IOException {
        return m207767c(asfVar, false, z);
    }
}
