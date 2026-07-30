package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class c2w0 implements lmv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d2w0 f79527a;

    public c2w0(d2w0 d2w0Var) {
        this.f79527a = d2w0Var;
    }

    @Override // p153l.lmv0
    public final void zza() {
        synchronized (this.f79527a) {
            this.f79527a.f84834k = null;
        }
    }

    @Override // p153l.lmv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        fwt0 fwt0Var = (fwt0) obj;
        synchronized (this.f79527a) {
            try {
                fwt0 fwt0Var2 = this.f79527a.f84834k;
                if (fwt0Var2 != null) {
                    fwt0Var2.mo127848b();
                }
                d2w0 d2w0Var = this.f79527a;
                d2w0Var.f84834k = fwt0Var;
                fwt0Var.m127850j(d2w0Var);
                d2w0 d2w0Var2 = this.f79527a;
                d2w0Var2.f84829f.m199089z(new pwt0(fwt0Var, d2w0Var2, d2w0Var2.f84829f, d2w0Var2.f84831h));
                fwt0Var.mo140700c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
