package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class dls0 implements p3t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uls0 f86853a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l4w0 f86854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vls0 f86855c;

    public dls0(vls0 vls0Var, uls0 uls0Var, l4w0 l4w0Var) {
        this.f86853a = uls0Var;
        this.f86854b = l4w0Var;
        this.f86855c = vls0Var;
    }

    @Override // p149l.p3t0
    public final void zza() {
        xsu0.m210834k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f86855c.f181980a) {
            try {
                xsu0.m210834k("loadNewJavascriptEngine (failure): Lock acquired");
                this.f86855c.f181988i = 1;
                xsu0.m210834k("Failed loading new engine. Marking new engine destroyable.");
                this.f86853a.m194262g();
                if (((Boolean) l9s0.f127143d.m115379e()).booleanValue()) {
                    vls0 vls0Var = this.f86855c;
                    if (vls0Var.f181984e != null) {
                        b5w0 b5w0Var = vls0Var.f181984e;
                        l4w0 l4w0Var = this.f86854b;
                        l4w0Var.zzc("Failed loading new engine");
                        l4w0Var.mo129461S(false);
                        b5w0Var.m100344b(l4w0Var.zzl());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xsu0.m210834k("loadNewJavascriptEngine (failure): Lock released");
    }
}
