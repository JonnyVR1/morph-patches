package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class mfr0 {
    /* JADX INFO: renamed from: a */
    public static void m154408a(nfr0 nfr0Var, qfr0 qfr0Var, bbv0 bbv0Var) {
        for (int i = 0; i < nfr0Var.zza(); i++) {
            long jMo121422e = nfr0Var.mo121422e(i);
            List listMo121423f = nfr0Var.mo121423f(jMo121422e);
            if (!listMo121423f.isEmpty()) {
                if (i == nfr0Var.zza() - 1) {
                    ohg0.m164364a();
                    return;
                }
                bbv0Var.zza(new kfr0(listMo121423f, jMo121422e, nfr0Var.mo121422e(i + 1) - nfr0Var.mo121422e(i)));
            }
        }
    }
}
