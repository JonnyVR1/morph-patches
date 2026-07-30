package p153l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tri {

    /* JADX INFO: renamed from: l.tri$a */
    public static final class C20384a {

        /* JADX INFO: renamed from: a */
        public long f175880a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m192501a(ig60 ig60Var, xri xriVar, int i) {
        int iM192510j = m192510j(ig60Var, i);
        return iM192510j != -1 && iM192510j <= xriVar.f195913b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m192502b(ig60 ig60Var, int i) {
        return ig60Var.m139795H() == bmk0.m105170u(ig60Var.m139815e(), i, ig60Var.m139816f() - 1, 0);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m192503c(ig60 ig60Var, xri xriVar, boolean z, C20384a c20384a) {
        try {
            long jM139802O = ig60Var.m139802O();
            if (!z) {
                jM139802O *= (long) xriVar.f195913b;
            }
            c20384a.f175880a = jM139802O;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m192504d(ig60 ig60Var, xri xriVar, int i, C20384a c20384a) {
        int iM139816f = ig60Var.m139816f();
        long jM139797J = ig60Var.m139797J();
        long j = jM139797J >>> 16;
        if (j != i) {
            return false;
        }
        return m192507g((int) ((jM139797J >> 4) & 15), xriVar) && m192506f((int) ((jM139797J >> 1) & 7), xriVar) && !(((jM139797J & 1) > 1L ? 1 : ((jM139797J & 1) == 1L ? 0 : -1)) == 0) && m192503c(ig60Var, xriVar, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, c20384a) && m192501a(ig60Var, xriVar, (int) ((jM139797J >> 12) & 15)) && m192505e(ig60Var, xriVar, (int) ((jM139797J >> 8) & 15)) && m192502b(ig60Var, iM139816f);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m192505e(ig60 ig60Var, xri xriVar, int i) {
        int i2 = xriVar.f195916e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == xriVar.f195917f;
        }
        if (i == 12) {
            return ig60Var.m139795H() * 1000 == i2;
        }
        if (i <= 14) {
            int iM139801N = ig60Var.m139801N();
            if (i == 14) {
                iM139801N *= 10;
            }
            if (iM139801N == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m192506f(int i, xri xriVar) {
        return i == 0 || i == xriVar.f195920i;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m192507g(int i, xri xriVar) {
        if (i <= 7) {
            return i == xriVar.f195918g - 1;
        }
        return i <= 10 && xriVar.f195918g == 2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m192508h(asf asfVar, xri xriVar, int i, C20384a c20384a) throws IOException {
        long jMo99903k = asfVar.mo99903k();
        byte[] bArr = new byte[2];
        asfVar.mo99900f(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            asfVar.mo99902h();
            asfVar.mo99904m((int) (jMo99903k - asfVar.getPosition()));
            return false;
        }
        ig60 ig60Var = new ig60(16);
        System.arraycopy(bArr, 0, ig60Var.m139815e(), 0, 2);
        ig60Var.m139807T(csf.m112178c(asfVar, ig60Var.m139815e(), 2, 14));
        asfVar.mo99902h();
        asfVar.mo99904m((int) (jMo99903k - asfVar.getPosition()));
        return m192504d(ig60Var, xriVar, i, c20384a);
    }

    /* JADX INFO: renamed from: i */
    public static long m192509i(asf asfVar, xri xriVar) throws IOException {
        asfVar.mo99902h();
        asfVar.mo99904m(1);
        byte[] bArr = new byte[1];
        asfVar.mo99900f(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        asfVar.mo99904m(2);
        int i = z ? 7 : 6;
        ig60 ig60Var = new ig60(i);
        ig60Var.m139807T(csf.m112178c(asfVar, ig60Var.m139815e(), 0, i));
        asfVar.mo99902h();
        C20384a c20384a = new C20384a();
        if (m192503c(ig60Var, xriVar, z, c20384a)) {
            return c20384a.f175880a;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* JADX INFO: renamed from: j */
    public static int m192510j(ig60 ig60Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return ig60Var.m139795H() + 1;
            case 7:
                return ig60Var.m139801N() + 1;
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
