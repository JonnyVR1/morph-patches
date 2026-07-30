package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class l6w0 implements lmv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n6w0 f130294a;

    public l6w0(n6w0 n6w0Var) {
        this.f130294a = n6w0Var;
    }

    @Override // p153l.lmv0
    public final void zza() {
        synchronized (this.f130294a) {
            this.f130294a.f140495d = null;
        }
    }

    @Override // p153l.lmv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f130294a) {
            try {
                this.f130294a.f140495d = (ksu0) obj;
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168439q3)).booleanValue()) {
                    ((ksu0) obj).m151286k().f108172a = this.f130294a.f140494c;
                }
                this.f130294a.f140495d.mo140700c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
