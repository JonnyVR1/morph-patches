package p149l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class f1s0 implements Comparator {
    public f1s0(g1s0 g1s0Var) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        azr0 azr0Var = (azr0) obj;
        azr0 azr0Var2 = (azr0) obj2;
        if (azr0Var.m99727d() < azr0Var2.m99727d()) {
            return -1;
        }
        if (azr0Var.m99727d() > azr0Var2.m99727d()) {
            return 1;
        }
        if (azr0Var.m99725b() < azr0Var2.m99725b()) {
            return -1;
        }
        if (azr0Var.m99725b() > azr0Var2.m99725b()) {
            return 1;
        }
        float fM99724a = (azr0Var.m99724a() - azr0Var.m99727d()) * (azr0Var.m99726c() - azr0Var.m99725b());
        float fM99724a2 = (azr0Var2.m99724a() - azr0Var2.m99727d()) * (azr0Var2.m99726c() - azr0Var2.m99725b());
        if (fM99724a > fM99724a2) {
            return -1;
        }
        return fM99724a < fM99724a2 ? 1 : 0;
    }
}
