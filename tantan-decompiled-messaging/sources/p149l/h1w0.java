package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class h1w0 {

    /* JADX INFO: renamed from: a */
    public final a1w0 f105470a;

    /* JADX INFO: renamed from: b */
    public final gnr f105471b;

    /* JADX INFO: renamed from: c */
    public boolean f105472c = false;

    /* JADX INFO: renamed from: d */
    public boolean f105473d = false;

    public h1w0(final b0w0 b0w0Var, final z0w0 z0w0Var, final a1w0 a1w0Var) {
        this.f105470a = a1w0Var;
        this.f105471b = jmw0.m142233f(jmw0.m142241n(z0w0Var.mo176488b(a1w0Var), new rlw0() { // from class: l.f1w0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f94117a.m129083b(z0w0Var, b0w0Var, a1w0Var, (o0w0) obj);
            }
        }, a1w0Var.zzb()), Exception.class, new rlw0() { // from class: l.g1w0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f100220a.m129084c(z0w0Var, (Exception) obj);
            }
        }, a1w0Var.zzb());
    }

    /* JADX INFO: renamed from: a */
    public final synchronized gnr m129082a(a1w0 a1w0Var) {
        if (!this.f105473d && !this.f105472c && this.f105470a.zza() != null && a1w0Var.zza() != null && this.f105470a.zza().equals(a1w0Var.zza())) {
            this.f105472c = true;
            return this.f105471b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnr m129083b(z0w0 z0w0Var, b0w0 b0w0Var, a1w0 a1w0Var, o0w0 o0w0Var) throws Exception {
        synchronized (this) {
            try {
                this.f105473d = true;
                z0w0Var.mo176487a(o0w0Var);
                if (this.f105472c) {
                    return jmw0.m142235h(new y0w0(o0w0Var, a1w0Var));
                }
                b0w0Var.mo99794b(a1w0Var.zza(), o0w0Var);
                return jmw0.m142235h(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m129084c(z0w0 z0w0Var, Exception exc) throws Exception {
        synchronized (this) {
            this.f105473d = true;
            throw exc;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m129085d(fmw0 fmw0Var) {
        jmw0.m142245r(jmw0.m142241n(this.f105471b, new rlw0() { // from class: l.e1w0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142236i();
            }
        }, this.f105470a.zzb()), fmw0Var, this.f105470a.zzb());
    }
}
