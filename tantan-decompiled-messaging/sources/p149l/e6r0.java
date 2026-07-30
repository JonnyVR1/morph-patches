package p149l;

import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class e6r0 {
    /* JADX INFO: renamed from: a */
    public static int m115108a(v6w0 v6w0Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return v6w0Var.m197238B() + 1;
            case 7:
                return v6w0Var.m197242F() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m115109b(k5r0 k5r0Var, i6r0 i6r0Var) throws IOException {
        k5r0Var.zzj();
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.m217118j(1, false);
        byte[] bArr = new byte[1];
        z4r0Var.mo140051c(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        z4r0Var.m217118j(2, false);
        int i2 = 1 != i ? 6 : 7;
        v6w0 v6w0Var = new v6w0(i2);
        v6w0Var.m197261j(n5r0.m157995a(k5r0Var, v6w0Var.m197264m(), 0, i2));
        k5r0Var.zzj();
        d6r0 d6r0Var = new d6r0();
        if (m115111d(v6w0Var, i6r0Var, z, d6r0Var)) {
            return d6r0Var.f84648a;
        }
        throw zzcc.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae A[RETURN] */
    /* JADX INFO: renamed from: c */
    public static boolean m115110c(v6w0 v6w0Var, i6r0 i6r0Var, int i, d6r0 d6r0Var) {
        int iM115108a;
        int iM197270s = v6w0Var.m197270s();
        long jM197246J = v6w0Var.m197246J();
        long j = jM197246J >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jM197246J >> 12;
        long j3 = jM197246J >> 8;
        long j4 = jM197246J >> 4;
        long j5 = jM197246J >> 1;
        long j6 = jM197246J & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || i6r0Var.f111765g != 2) : i2 == i6r0Var.f111765g - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == i6r0Var.f111767i) && j6 != 1 && m115111d(v6w0Var, i6r0Var, z, d6r0Var) && (iM115108a = m115108a(v6w0Var, (int) (j2 & 15))) != -1 && iM115108a <= i6r0Var.f111760b) {
                int i4 = i6r0Var.f111763e;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 <= 11) {
                        if (i5 == i6r0Var.f111764f) {
                            if (v6w0Var.m197238B() == ggw0.m126078t(v6w0Var.m197264m(), iM197270s, v6w0Var.m197270s() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 == 12) {
                        if (v6w0Var.m197238B() * 1000 == i4) {
                            if (v6w0Var.m197238B() == ggw0.m126078t(v6w0Var.m197264m(), iM197270s, v6w0Var.m197270s() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 <= 14) {
                        int iM197242F = v6w0Var.m197242F();
                        if (i5 == 14) {
                            iM197242F *= 10;
                        }
                        if (iM197242F == i4) {
                            if (v6w0Var.m197238B() == ggw0.m126078t(v6w0Var.m197264m(), iM197270s, v6w0Var.m197270s() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (v6w0Var.m197238B() == ggw0.m126078t(v6w0Var.m197264m(), iM197270s, v6w0Var.m197270s() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m115111d(v6w0 v6w0Var, i6r0 i6r0Var, boolean z, d6r0 d6r0Var) {
        try {
            long jM197248L = v6w0Var.m197248L();
            if (!z) {
                jM197248L *= (long) i6r0Var.f111760b;
            }
            d6r0Var.f84648a = jM197248L;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
