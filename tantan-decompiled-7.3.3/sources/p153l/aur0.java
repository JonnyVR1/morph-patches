package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class aur0 implements itr0 {

    /* JADX INFO: renamed from: a */
    public final dfw0 f73541a = new dfw0(new byte[4], 4);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cur0 f73542b;

    public aur0(cur0 cur0Var) {
        this.f73542b = cur0Var;
    }

    @Override // p153l.itr0
    /* JADX INFO: renamed from: b */
    public final void mo100404b(bgw0 bgw0Var) {
        if (bgw0Var.m104245B() == 0 && (bgw0Var.m104245B() & 128) != 0) {
            bgw0Var.m104270l(6);
            int iM104275q = bgw0Var.m104275q() / 4;
            for (int i = 0; i < iM104275q; i++) {
                bgw0Var.m104264f(this.f73541a, 4);
                dfw0 dfw0Var = this.f73541a;
                int iM115552d = dfw0Var.m115552d(16);
                dfw0Var.m115561m(3);
                dfw0 dfw0Var2 = this.f73541a;
                if (iM115552d == 0) {
                    dfw0Var2.m115561m(13);
                } else {
                    int iM115552d2 = dfw0Var2.m115552d(13);
                    if (this.f73542b.f83878f.get(iM115552d2) == null) {
                        cur0 cur0Var = this.f73542b;
                        cur0Var.f83878f.put(iM115552d2, new jtr0(new bur0(cur0Var, iM115552d2)));
                        this.f73542b.f83884l++;
                    }
                }
            }
            this.f73542b.f83878f.remove(0);
        }
    }

    @Override // p153l.itr0
    /* JADX INFO: renamed from: a */
    public final void mo100403a(nnw0 nnw0Var, ser0 ser0Var, gur0 gur0Var) {
    }
}
