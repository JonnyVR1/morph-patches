package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nn4 {
    /* JADX INFO: renamed from: a */
    public static void m160189a(long j, d860 d860Var, m6j0[] m6j0VarArr) {
        while (true) {
            if (d860Var.m110295a() <= 1) {
                return;
            }
            int iM160191c = m160191c(d860Var);
            int iM160191c2 = m160191c(d860Var);
            int iM110300f = d860Var.m110300f() + iM160191c2;
            if (iM160191c2 == -1 || iM160191c2 > d860Var.m110295a()) {
                jwv.m143689i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iM110300f = d860Var.m110301g();
            } else if (iM160191c == 4 && iM160191c2 >= 8) {
                int iM110279H = d860Var.m110279H();
                int iM110285N = d860Var.m110285N();
                int iM110311q = iM110285N == 49 ? d860Var.m110311q() : 0;
                int iM110279H2 = d860Var.m110279H();
                if (iM110285N == 47) {
                    d860Var.m110293V(1);
                }
                boolean z = iM110279H == 181 && (iM110285N == 49 || iM110285N == 47) && iM110279H2 == 3;
                if (iM110285N == 49) {
                    z &= iM110311q == 1195456820;
                }
                if (z) {
                    m160190b(j, d860Var, m6j0VarArr);
                }
            }
            d860Var.m110292U(iM110300f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m160190b(long j, d860 d860Var, m6j0[] m6j0VarArr) {
        long j2;
        int iM110279H = d860Var.m110279H();
        if ((iM110279H & 64) != 0) {
            d860Var.m110293V(1);
            int i = (iM110279H & 31) * 3;
            int iM110300f = d860Var.m110300f();
            int length = m6j0VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                m6j0 m6j0Var = m6j0VarArr[i2];
                d860Var.m110292U(iM110300f);
                m6j0Var.m153238d(d860Var, i);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    m6j0Var.mo11109a(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i2++;
                j = j2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m160191c(d860 d860Var) {
        int i = 0;
        while (d860Var.m110295a() != 0) {
            int iM110279H = d860Var.m110279H();
            i += iM110279H;
            if (iM110279H != 255) {
                return i;
            }
        }
        return -1;
    }
}
