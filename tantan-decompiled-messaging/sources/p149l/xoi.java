package p149l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xoi {

    /* JADX INFO: renamed from: l.xoi$a */
    public static final class C21194a {

        /* JADX INFO: renamed from: a */
        public long f193846a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m210419a(d860 d860Var, bpi bpiVar, int i) {
        int iM210428j = m210428j(d860Var, i);
        return iM210428j != -1 && iM210428j <= bpiVar.f76629b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m210420b(d860 d860Var, int i) {
        return d860Var.m110279H() == vck0.m197892u(d860Var.m110299e(), i, d860Var.m110300f() - 1, 0);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m210421c(d860 d860Var, bpi bpiVar, boolean z, C21194a c21194a) {
        try {
            long jM110286O = d860Var.m110286O();
            if (!z) {
                jM110286O *= (long) bpiVar.f76629b;
            }
            c21194a.f193846a = jM110286O;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m210422d(d860 d860Var, bpi bpiVar, int i, C21194a c21194a) {
        int iM110300f = d860Var.m110300f();
        long jM110281J = d860Var.m110281J();
        long j = jM110281J >>> 16;
        if (j != i) {
            return false;
        }
        return m210425g((int) ((jM110281J >> 4) & 15), bpiVar) && m210424f((int) ((jM110281J >> 1) & 7), bpiVar) && !(((jM110281J & 1) > 1L ? 1 : ((jM110281J & 1) == 1L ? 0 : -1)) == 0) && m210421c(d860Var, bpiVar, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, c21194a) && m210419a(d860Var, bpiVar, (int) ((jM110281J >> 12) & 15)) && m210423e(d860Var, bpiVar, (int) ((jM110281J >> 8) & 15)) && m210420b(d860Var, iM110300f);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m210423e(d860 d860Var, bpi bpiVar, int i) {
        int i2 = bpiVar.f76632e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == bpiVar.f76633f;
        }
        if (i == 12) {
            return d860Var.m110279H() * 1000 == i2;
        }
        if (i <= 14) {
            int iM110285N = d860Var.m110285N();
            if (i == 14) {
                iM110285N *= 10;
            }
            if (iM110285N == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m210424f(int i, bpi bpiVar) {
        return i == 0 || i == bpiVar.f76636i;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m210425g(int i, bpi bpiVar) {
        if (i <= 7) {
            return i == bpiVar.f76634g - 1;
        }
        return i <= 10 && bpiVar.f76634g == 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m210426h(tqf tqfVar, bpi bpiVar, int i, C21194a c21194a) throws IOException {
        long jMo150659k = tqfVar.mo150659k();
        byte[] bArr = new byte[2];
        tqfVar.mo150655f(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            tqfVar.mo150657h();
            tqfVar.mo150660m((int) (jMo150659k - tqfVar.getPosition()));
            return false;
        }
        d860 d860Var = new d860(16);
        System.arraycopy(bArr, 0, d860Var.m110299e(), 0, 2);
        d860Var.m110291T(vqf.m199484c(tqfVar, d860Var.m110299e(), 2, 14));
        tqfVar.mo150657h();
        tqfVar.mo150660m((int) (jMo150659k - tqfVar.getPosition()));
        return m210422d(d860Var, bpiVar, i, c21194a);
    }

    /* JADX INFO: renamed from: i */
    public static long m210427i(tqf tqfVar, bpi bpiVar) throws IOException {
        tqfVar.mo150657h();
        tqfVar.mo150660m(1);
        byte[] bArr = new byte[1];
        tqfVar.mo150655f(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        tqfVar.mo150660m(2);
        int i = z ? 7 : 6;
        d860 d860Var = new d860(i);
        d860Var.m110291T(vqf.m199484c(tqfVar, d860Var.m110299e(), 0, i));
        tqfVar.mo150657h();
        C21194a c21194a = new C21194a();
        if (m210421c(d860Var, bpiVar, z, c21194a)) {
            return c21194a.f193846a;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* JADX INFO: renamed from: j */
    public static int m210428j(d860 d860Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return d860Var.m110279H() + 1;
            case 7:
                return d860Var.m110285N() + 1;
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
}
