package p153l;

import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class kfr0 {
    /* JADX INFO: renamed from: a */
    public static int m149622a(bgw0 bgw0Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return bgw0Var.m104245B() + 1;
            case 7:
                return bgw0Var.m104249F() + 1;
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
    public static long m149623b(qer0 qer0Var, ofr0 ofr0Var) throws IOException {
        qer0Var.zzj();
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.m125318j(1, false);
        byte[] bArr = new byte[1];
        fer0Var.mo125313c(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        fer0Var.m125318j(2, false);
        int i2 = 1 != i ? 6 : 7;
        bgw0 bgw0Var = new bgw0(i2);
        bgw0Var.m104268j(ter0.m190891a(qer0Var, bgw0Var.m104271m(), 0, i2));
        qer0Var.zzj();
        jfr0 jfr0Var = new jfr0();
        if (m149625d(bgw0Var, ofr0Var, z, jfr0Var)) {
            return jfr0Var.f120617a;
        }
        throw zzcc.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae A[RETURN] */
    /* JADX INFO: renamed from: c */
    public static boolean m149624c(bgw0 bgw0Var, ofr0 ofr0Var, int i, jfr0 jfr0Var) {
        int iM149622a;
        int iM104277s = bgw0Var.m104277s();
        long jM104253J = bgw0Var.m104253J();
        long j = jM104253J >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jM104253J >> 12;
        long j3 = jM104253J >> 8;
        long j4 = jM104253J >> 4;
        long j5 = jM104253J >> 1;
        long j6 = jM104253J & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || ofr0Var.f147152g != 2) : i2 == ofr0Var.f147152g - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == ofr0Var.f147154i) && j6 != 1 && m149625d(bgw0Var, ofr0Var, z, jfr0Var) && (iM149622a = m149622a(bgw0Var, (int) (j2 & 15))) != -1 && iM149622a <= ofr0Var.f147147b) {
                int i4 = ofr0Var.f147150e;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 <= 11) {
                        if (i5 == ofr0Var.f147151f) {
                            if (bgw0Var.m104245B() == mpw0.m159422t(bgw0Var.m104271m(), iM104277s, bgw0Var.m104277s() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 == 12) {
                        if (bgw0Var.m104245B() * 1000 == i4) {
                            if (bgw0Var.m104245B() == mpw0.m159422t(bgw0Var.m104271m(), iM104277s, bgw0Var.m104277s() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 <= 14) {
                        int iM104249F = bgw0Var.m104249F();
                        if (i5 == 14) {
                            iM104249F *= 10;
                        }
                        if (iM104249F == i4) {
                            if (bgw0Var.m104245B() == mpw0.m159422t(bgw0Var.m104271m(), iM104277s, bgw0Var.m104277s() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (bgw0Var.m104245B() == mpw0.m159422t(bgw0Var.m104271m(), iM104277s, bgw0Var.m104277s() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m149625d(bgw0 bgw0Var, ofr0 ofr0Var, boolean z, jfr0 jfr0Var) {
        try {
            long jM104255L = bgw0Var.m104255L();
            if (!z) {
                jM104255L *= (long) ofr0Var.f147147b;
            }
            jfr0Var.f120617a = jM104255L;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
