package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class cls0 implements r3t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uls0 f81463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l4w0 f81464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vls0 f81465c;

    public cls0(vls0 vls0Var, uls0 uls0Var, l4w0 l4w0Var) {
        this.f81463a = uls0Var;
        this.f81464b = l4w0Var;
        this.f81465c = vls0Var;
    }

    @Override // p149l.r3t0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        xsu0.m210834k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f81465c.f181980a) {
            try {
                xsu0.m210834k("loadNewJavascriptEngine (success): Lock acquired");
                this.f81465c.f181988i = 0;
                vls0 vls0Var = this.f81465c;
                if (vls0Var.f181987h != null && this.f81463a != vls0Var.f181987h) {
                    xsu0.m210834k("New JS engine is loaded, marking previous one as destroyable.");
                    this.f81465c.f181987h.m194262g();
                }
                this.f81465c.f181987h = this.f81463a;
                if (((Boolean) l9s0.f127143d.m115379e()).booleanValue()) {
                    vls0 vls0Var2 = this.f81465c;
                    if (vls0Var2.f181984e != null) {
                        b5w0 b5w0Var = vls0Var2.f181984e;
                        l4w0 l4w0Var = this.f81464b;
                        l4w0Var.mo129461S(true);
                        b5w0Var.m100344b(l4w0Var.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xsu0.m210834k("loadNewJavascriptEngine (success): Lock released");
    }
}
