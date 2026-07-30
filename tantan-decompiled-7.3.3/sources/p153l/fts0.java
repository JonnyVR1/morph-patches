package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fts0 extends g6s0 {
    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        if (str == null || str.isEmpty() || !gix0Var.m130399g(str)) {
            gzi0.m133102a("Command not found: %s", new Object[]{str});
            return null;
        }
        ewr0 ewr0VarM130393a = gix0Var.m130393a(str);
        if (ewr0VarM130393a instanceof mpr0) {
            return ((mpr0) ewr0VarM130393a).mo107102d(gix0Var, list);
        }
        gzi0.m133102a("Function %s is not defined", new Object[]{str});
        return null;
    }
}
