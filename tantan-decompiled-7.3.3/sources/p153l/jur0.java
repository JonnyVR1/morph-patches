package p153l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jur0 {

    /* JADX INFO: renamed from: a */
    public final List f122735a;

    /* JADX INFO: renamed from: b */
    public final sgr0[] f122736b;

    public jur0(List list) {
        this.f122735a = list;
        this.f122736b = new sgr0[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m146995a(long j, bgw0 bgw0Var) {
        if (bgw0Var.m104275q() < 9) {
            return;
        }
        int iM104280v = bgw0Var.m104280v();
        int iM104280v2 = bgw0Var.m104280v();
        int iM104245B = bgw0Var.m104245B();
        if (iM104280v == 434 && iM104280v2 == 1195456820 && iM104245B == 3) {
            cer0.m109450b(j, bgw0Var, this.f122736b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m146996b(ser0 ser0Var, gur0 gur0Var) {
        for (int i = 0; i < this.f122736b.length; i++) {
            gur0Var.m132386c();
            sgr0 sgr0VarMo101550i = ser0Var.mo101550i(gur0Var.m132384a(), 3);
            sqr0 sqr0Var = (sqr0) this.f122735a.get(i);
            String str = sqr0Var.f170251l;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            lev0.m153957e(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            znr0 znr0Var = new znr0();
            znr0Var.m220658k(gur0Var.m132385b());
            znr0Var.m220672w(str);
            znr0Var.m220674y(sqr0Var.f170243d);
            znr0Var.m220663n(sqr0Var.f170242c);
            znr0Var.m220655i0(sqr0Var.f170236D);
            znr0Var.m220660l(sqr0Var.f170253n);
            sgr0VarMo101550i.mo99373d(znr0Var.m220645D());
            this.f122736b[i] = sgr0VarMo101550i;
        }
    }
}
