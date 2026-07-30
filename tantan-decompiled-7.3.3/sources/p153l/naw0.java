package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class naw0 {

    /* JADX INFO: renamed from: a */
    public final gaw0 f141052a;

    /* JADX INFO: renamed from: b */
    public final hpr f141053b;

    /* JADX INFO: renamed from: c */
    public boolean f141054c = false;

    /* JADX INFO: renamed from: d */
    public boolean f141055d = false;

    public naw0(final h9w0 h9w0Var, final faw0 faw0Var, final gaw0 gaw0Var) {
        this.f141052a = gaw0Var;
        this.f141053b = pvw0.m173979f(pvw0.m173987n(faw0Var.mo124794b(gaw0Var), new xuw0() { // from class: l.law0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f130739a.m162102b(faw0Var, h9w0Var, gaw0Var, (u9w0) obj);
            }
        }, gaw0Var.zzb()), Exception.class, new xuw0() { // from class: l.maw0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return this.f135606a.m162103c(faw0Var, (Exception) obj);
            }
        }, gaw0Var.zzb());
    }

    /* JADX INFO: renamed from: a */
    public final synchronized hpr m162101a(gaw0 gaw0Var) {
        if (!this.f141055d && !this.f141054c && this.f141052a.zza() != null && gaw0Var.zza() != null && this.f141052a.zza().equals(gaw0Var.zza())) {
            this.f141054c = true;
            return this.f141053b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpr m162102b(faw0 faw0Var, h9w0 h9w0Var, gaw0 gaw0Var, u9w0 u9w0Var) throws Exception {
        synchronized (this) {
            try {
                this.f141055d = true;
                faw0Var.mo124793a(u9w0Var);
                if (this.f141054c) {
                    return pvw0.m173981h(new eaw0(u9w0Var, gaw0Var));
                }
                h9w0Var.mo134088b(gaw0Var.zza(), u9w0Var);
                return pvw0.m173981h(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m162103c(faw0 faw0Var, Exception exc) throws Exception {
        synchronized (this) {
            this.f141055d = true;
            throw exc;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m162104d(lvw0 lvw0Var) {
        pvw0.m173991r(pvw0.m173987n(this.f141053b, new xuw0() { // from class: l.kaw0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173982i();
            }
        }, this.f141052a.zzb()), lvw0Var, this.f141052a.zzb());
    }
}
