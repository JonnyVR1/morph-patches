package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class w4r0 {
    /* JADX INFO: renamed from: a */
    public static void m201559a(long j, v6w0 v6w0Var, m7r0[] m7r0VarArr) {
        int iM197273v;
        while (true) {
            if (v6w0Var.m197268q() <= 1) {
                return;
            }
            int iM201561c = m201561c(v6w0Var);
            int iM201561c2 = m201561c(v6w0Var);
            int iM197270s = v6w0Var.m197270s() + iM201561c2;
            if (iM201561c2 == -1 || iM201561c2 > v6w0Var.m197268q()) {
                svv0.m186111f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iM197270s = v6w0Var.m197271t();
            } else if (iM201561c == 4 && iM201561c2 >= 8) {
                int iM197238B = v6w0Var.m197238B();
                int iM197242F = v6w0Var.m197242F();
                if (iM197242F == 49) {
                    iM197273v = v6w0Var.m197273v();
                    iM197242F = 49;
                } else {
                    iM197273v = 0;
                }
                int iM197238B2 = v6w0Var.m197238B();
                if (iM197242F == 47) {
                    v6w0Var.m197263l(1);
                    iM197242F = 47;
                }
                boolean z = iM197238B == 181 && (iM197242F == 49 || iM197242F == 47) && iM197238B2 == 3;
                if (iM197242F == 49) {
                    z &= iM197273v == 1195456820;
                }
                if (z) {
                    m201560b(j, v6w0Var, m7r0VarArr);
                }
            }
            v6w0Var.m197262k(iM197270s);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m201560b(long j, v6w0 v6w0Var, m7r0[] m7r0VarArr) {
        int iM197238B = v6w0Var.m197238B();
        if ((iM197238B & 64) != 0) {
            int i = iM197238B & 31;
            v6w0Var.m197263l(1);
            int iM197270s = v6w0Var.m197270s();
            for (m7r0 m7r0Var : m7r0VarArr) {
                int i2 = i * 3;
                v6w0Var.m197262k(iM197270s);
                m7r0Var.mo134533f(v6w0Var, i2);
                f5v0.m119535f(j != -9223372036854775807L);
                m7r0Var.mo134530c(j, 1, i2, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m201561c(v6w0 v6w0Var) {
        int i = 0;
        while (v6w0Var.m197268q() != 0) {
            int iM197238B = v6w0Var.m197238B();
            i += iM197238B;
            if (iM197238B != 255) {
                return i;
            }
        }
        return -1;
    }
}
