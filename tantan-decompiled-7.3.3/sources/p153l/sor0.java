package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sor0 {
    /* JADX INFO: renamed from: a */
    public static void m187275a(tor0 tor0Var, wor0 wor0Var, hkv0 hkv0Var) {
        for (int i = 0; i < tor0Var.zza(); i++) {
            long jMo155502e = tor0Var.mo155502e(i);
            List listMo155503f = tor0Var.mo155503f(jMo155502e);
            if (!listMo155503f.isEmpty()) {
                if (i == tor0Var.zza() - 1) {
                    wpg0.m207458a();
                    return;
                }
                hkv0Var.zza(new qor0(listMo155503f, jMo155502e, tor0Var.mo155502e(i + 1) - tor0Var.mo155502e(i)));
            }
        }
    }
}
