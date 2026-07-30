package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class fxv0 implements fdv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hxv0 f99815a;

    public fxv0(hxv0 hxv0Var) {
        this.f99815a = hxv0Var;
    }

    @Override // p149l.fdv0
    public final void zza() {
        synchronized (this.f99815a) {
            this.f99815a.f109933d = null;
        }
    }

    @Override // p149l.fdv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f99815a) {
            try {
                this.f99815a.f109933d = (eju0) obj;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132368q3)).booleanValue()) {
                    ((eju0) obj).m116903k().f77972a = this.f99815a.f109932c;
                }
                this.f99815a.f109933d.mo106179c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
