package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class g6w0 implements lmv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h6w0 f102489a;

    public g6w0(h6w0 h6w0Var) {
        this.f102489a = h6w0Var;
    }

    @Override // p153l.lmv0
    public final void zza() {
        synchronized (this.f102489a) {
            this.f102489a.f108062i = null;
        }
    }

    @Override // p153l.lmv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f102489a) {
            try {
                this.f102489a.f108062i = (ksu0) obj;
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168439q3)).booleanValue()) {
                    ((ksu0) obj).m151286k().f108172a = this.f102489a.f108057d;
                }
                this.f102489a.f108062i.mo140700c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
