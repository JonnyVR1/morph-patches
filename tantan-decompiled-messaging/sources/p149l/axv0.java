package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class axv0 implements fdv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bxv0 f72238a;

    public axv0(bxv0 bxv0Var) {
        this.f72238a = bxv0Var;
    }

    @Override // p149l.fdv0
    public final void zza() {
        synchronized (this.f72238a) {
            this.f72238a.f77833i = null;
        }
    }

    @Override // p149l.fdv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f72238a) {
            try {
                this.f72238a.f77833i = (eju0) obj;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132368q3)).booleanValue()) {
                    ((eju0) obj).m116903k().f77972a = this.f72238a.f77828d;
                }
                this.f72238a.f77833i.mo106179c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
