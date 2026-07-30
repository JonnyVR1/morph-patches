package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class cer0 {
    /* JADX INFO: renamed from: a */
    public static void m109449a(long j, bgw0 bgw0Var, sgr0[] sgr0VarArr) {
        int iM104280v;
        while (true) {
            if (bgw0Var.m104275q() <= 1) {
                return;
            }
            int iM109451c = m109451c(bgw0Var);
            int iM109451c2 = m109451c(bgw0Var);
            int iM104277s = bgw0Var.m104277s() + iM109451c2;
            if (iM109451c2 == -1 || iM109451c2 > bgw0Var.m104275q()) {
                y4w0.m214278f("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iM104277s = bgw0Var.m104278t();
            } else if (iM109451c == 4 && iM109451c2 >= 8) {
                int iM104245B = bgw0Var.m104245B();
                int iM104249F = bgw0Var.m104249F();
                if (iM104249F == 49) {
                    iM104280v = bgw0Var.m104280v();
                    iM104249F = 49;
                } else {
                    iM104280v = 0;
                }
                int iM104245B2 = bgw0Var.m104245B();
                if (iM104249F == 47) {
                    bgw0Var.m104270l(1);
                    iM104249F = 47;
                }
                boolean z = iM104245B == 181 && (iM104249F == 49 || iM104249F == 47) && iM104245B2 == 3;
                if (iM104249F == 49) {
                    z &= iM104280v == 1195456820;
                }
                if (z) {
                    m109450b(j, bgw0Var, sgr0VarArr);
                }
            }
            bgw0Var.m104269k(iM104277s);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m109450b(long j, bgw0 bgw0Var, sgr0[] sgr0VarArr) {
        int iM104245B = bgw0Var.m104245B();
        if ((iM104245B & 64) != 0) {
            int i = iM104245B & 31;
            bgw0Var.m104270l(1);
            int iM104277s = bgw0Var.m104277s();
            for (sgr0 sgr0Var : sgr0VarArr) {
                int i2 = i * 3;
                bgw0Var.m104269k(iM104277s);
                sgr0Var.mo99375f(bgw0Var, i2);
                lev0.m153958f(j != -9223372036854775807L);
                sgr0Var.mo99372c(j, 1, i2, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m109451c(bgw0 bgw0Var) {
        int i = 0;
        while (bgw0Var.m104275q() != 0) {
            int iM104245B = bgw0Var.m104245B();
            i += iM104245B;
            if (iM104245B != 255) {
                return i;
            }
        }
        return -1;
    }
}
