package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ukr0 implements ckr0 {

    /* JADX INFO: renamed from: a */
    public final x5w0 f176954a = new x5w0(new byte[4], 4);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wkr0 f176955b;

    public ukr0(wkr0 wkr0Var) {
        this.f176955b = wkr0Var;
    }

    @Override // p149l.ckr0
    /* JADX INFO: renamed from: b */
    public final void mo107428b(v6w0 v6w0Var) {
        if (v6w0Var.m197238B() == 0 && (v6w0Var.m197238B() & 128) != 0) {
            v6w0Var.m197263l(6);
            int iM197268q = v6w0Var.m197268q() / 4;
            for (int i = 0; i < iM197268q; i++) {
                v6w0Var.m197257f(this.f176954a, 4);
                x5w0 x5w0Var = this.f176954a;
                int iM207150d = x5w0Var.m207150d(16);
                x5w0Var.m207159m(3);
                x5w0 x5w0Var2 = this.f176954a;
                if (iM207150d == 0) {
                    x5w0Var2.m207159m(13);
                } else {
                    int iM207150d2 = x5w0Var2.m207150d(13);
                    if (this.f176955b.f186807f.get(iM207150d2) == null) {
                        wkr0 wkr0Var = this.f176955b;
                        wkr0Var.f186807f.put(iM207150d2, new dkr0(new vkr0(wkr0Var, iM207150d2)));
                        this.f176955b.f186813l++;
                    }
                }
            }
            this.f176955b.f186807f.remove(0);
        }
    }

    @Override // p149l.ckr0
    /* JADX INFO: renamed from: a */
    public final void mo107427a(hew0 hew0Var, m5r0 m5r0Var, alr0 alr0Var) {
    }
}
