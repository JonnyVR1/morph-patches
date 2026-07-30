package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mo4 {
    /* JADX INFO: renamed from: a */
    public static void m159233a(long j, ig60 ig60Var, qfj0[] qfj0VarArr) {
        while (true) {
            if (ig60Var.m139811a() <= 1) {
                return;
            }
            int iM159235c = m159235c(ig60Var);
            int iM159235c2 = m159235c(ig60Var);
            int iM139816f = ig60Var.m139816f() + iM159235c2;
            if (iM159235c2 == -1 || iM159235c2 > ig60Var.m139811a()) {
                kyv.m152151i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iM139816f = ig60Var.m139817g();
            } else if (iM159235c == 4 && iM159235c2 >= 8) {
                int iM139795H = ig60Var.m139795H();
                int iM139801N = ig60Var.m139801N();
                int iM139827q = iM139801N == 49 ? ig60Var.m139827q() : 0;
                int iM139795H2 = ig60Var.m139795H();
                if (iM139801N == 47) {
                    ig60Var.m139809V(1);
                }
                boolean z = iM139795H == 181 && (iM139801N == 49 || iM139801N == 47) && iM139795H2 == 3;
                if (iM139801N == 49) {
                    z &= iM139827q == 1195456820;
                }
                if (z) {
                    m159234b(j, ig60Var, qfj0VarArr);
                }
            }
            ig60Var.m139808U(iM139816f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m159234b(long j, ig60 ig60Var, qfj0[] qfj0VarArr) {
        long j2;
        int iM139795H = ig60Var.m139795H();
        if ((iM139795H & 64) != 0) {
            ig60Var.m139809V(1);
            int i = (iM139795H & 31) * 3;
            int iM139816f = ig60Var.m139816f();
            int length = qfj0VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                qfj0 qfj0Var = qfj0VarArr[i2];
                ig60Var.m139808U(iM139816f);
                qfj0Var.m176370d(ig60Var, i);
                if (j != -9223372036854775807L) {
                    j2 = j;
                    qfj0Var.mo11163a(j2, 1, i, 0, null);
                } else {
                    j2 = j;
                }
                i2++;
                j = j2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m159235c(ig60 ig60Var) {
        int i = 0;
        while (ig60Var.m139811a() != 0) {
            int iM139795H = ig60Var.m139795H();
            i += iM139795H;
            if (iM139795H != 255) {
                return i;
            }
        }
        return -1;
    }
}
