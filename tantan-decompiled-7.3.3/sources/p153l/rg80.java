package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class rg80 {

    /* JADX INFO: renamed from: c */
    public static rg80 f162983c;

    /* JADX INFO: renamed from: a */
    public u310 f162984a;

    /* JADX INFO: renamed from: b */
    public u310 f162985b;

    /* JADX INFO: renamed from: a */
    public static rg80 m181401a() {
        if (f162983c == null) {
            f162983c = new rg80();
        }
        return f162983c;
    }

    /* JADX INFO: renamed from: b */
    public qwl m181402b(boolean z) {
        if (!z) {
            if (this.f162985b == null) {
                this.f162985b = new u310(zrv.f205803e).m194324j0();
            }
            this.f162984a.mo178527g(false);
            return this.f162985b;
        }
        if (this.f162984a == null) {
            this.f162984a = new u310(zrv.f205803e).m194324j0();
        }
        this.f162984a.mo178527g(false);
        m181404d();
        return this.f162984a;
    }

    /* JADX INFO: renamed from: c */
    public final void m181403c() {
        this.f162984a = new u310(zrv.f205803e).m194324j0();
    }

    /* JADX INFO: renamed from: d */
    public final void m181404d() {
        this.f162985b = new u310(zrv.f205803e).m194324j0();
    }

    /* JADX INFO: renamed from: e */
    public void m181405e(boolean z) {
        u310 u310Var = this.f162984a;
        if (u310Var != null) {
            u310Var.mo178522b(z);
            this.f162984a = null;
        }
        u310 u310Var2 = this.f162985b;
        if (u310Var2 != null) {
            u310Var2.mo178522b(z);
            this.f162985b = null;
        }
        m181403c();
    }
}
