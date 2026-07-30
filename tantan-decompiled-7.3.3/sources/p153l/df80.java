package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class df80 {

    /* JADX INFO: renamed from: c */
    public static df80 f88140c;

    /* JADX INFO: renamed from: a */
    public u310 f88141a;

    /* JADX INFO: renamed from: b */
    public u310 f88142b;

    /* JADX INFO: renamed from: a */
    public static df80 m115507a() {
        if (f88140c == null) {
            f88140c = new df80();
        }
        return f88140c;
    }

    /* JADX INFO: renamed from: b */
    public qwl m115508b(boolean z) {
        if (!z) {
            if (this.f88142b == null) {
                this.f88142b = new u310(zrv.f205803e).m194324j0();
            }
            this.f88141a.mo178527g(false);
            return this.f88142b;
        }
        if (this.f88141a == null) {
            this.f88141a = new u310(zrv.f205803e).m194324j0();
        }
        this.f88141a.mo178527g(false);
        m115510d();
        return this.f88141a;
    }

    /* JADX INFO: renamed from: c */
    public final void m115509c() {
        this.f88141a = new u310(zrv.f205803e).m194324j0();
    }

    /* JADX INFO: renamed from: d */
    public final void m115510d() {
        this.f88142b = new u310(zrv.f205803e).m194324j0();
    }

    /* JADX INFO: renamed from: e */
    public void m115511e(boolean z) {
        u310 u310Var = this.f88141a;
        if (u310Var != null) {
            u310Var.mo178522b(z);
            this.f88141a = null;
        }
        u310 u310Var2 = this.f88142b;
        if (u310Var2 != null) {
            u310Var2.mo178522b(z);
            this.f88142b = null;
        }
        m115509c();
    }
}
