package p153l;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class las0 implements Comparator {
    public las0(mas0 mas0Var) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        g8s0 g8s0Var = (g8s0) obj;
        g8s0 g8s0Var2 = (g8s0) obj2;
        if (g8s0Var.m129458d() < g8s0Var2.m129458d()) {
            return -1;
        }
        if (g8s0Var.m129458d() > g8s0Var2.m129458d()) {
            return 1;
        }
        if (g8s0Var.m129456b() < g8s0Var2.m129456b()) {
            return -1;
        }
        if (g8s0Var.m129456b() > g8s0Var2.m129456b()) {
            return 1;
        }
        float fM129455a = (g8s0Var.m129455a() - g8s0Var.m129458d()) * (g8s0Var.m129457c() - g8s0Var.m129456b());
        float fM129455a2 = (g8s0Var2.m129455a() - g8s0Var2.m129458d()) * (g8s0Var2.m129457c() - g8s0Var2.m129456b());
        if (fM129455a > fM129455a2) {
            return -1;
        }
        return fM129455a < fM129455a2 ? 1 : 0;
    }
}
