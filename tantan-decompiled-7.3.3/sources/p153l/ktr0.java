package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ktr0 {

    /* JADX INFO: renamed from: a */
    public final List f128731a;

    /* JADX INFO: renamed from: b */
    public final sgr0[] f128732b;

    public ktr0(List list) {
        this.f128731a = list;
        this.f128732b = new sgr0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m151396a(long j, bgw0 bgw0Var) {
        cer0.m109449a(j, bgw0Var, this.f128732b);
    }

    /* JADX INFO: renamed from: b */
    public final void m151397b(ser0 ser0Var, gur0 gur0Var) {
        for (int i = 0; i < this.f128732b.length; i++) {
            gur0Var.m132386c();
            sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 3);
            sqr0 sqr0Var = (sqr0) this.f128731a.get(i);
            String str = sqr0Var.f170251l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            lev0.m153957e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strM132385b = sqr0Var.f170240a;
            if (strM132385b == null) {
                strM132385b = gur0Var.m132385b();
            }
            znr0 znr0Var = new znr0();
            znr0Var.m220658k(strM132385b);
            znr0Var.m220672w(str);
            znr0Var.m220674y(sqr0Var.f170243d);
            znr0Var.m220663n(sqr0Var.f170242c);
            znr0Var.m220655i0(sqr0Var.f170236D);
            znr0Var.m220660l(sqr0Var.f170253n);
            sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
            this.f128732b[i] = sgr0VarMo101550i;
        }
    }
}
