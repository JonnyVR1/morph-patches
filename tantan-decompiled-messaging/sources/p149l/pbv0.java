package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class pbv0 implements fdv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qbv0 f148118a;

    public pbv0(qbv0 qbv0Var) {
        this.f148118a = qbv0Var;
    }

    @Override // p149l.fdv0
    public final void zza() {
        synchronized (this.f148118a) {
            this.f148118a.f153708i = null;
        }
    }

    @Override // p149l.fdv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ont0 ont0Var = (ont0) obj;
        synchronized (this.f148118a) {
            try {
                qbv0 qbv0Var = this.f148118a;
                if (qbv0Var.f153708i != null) {
                    qbv0Var.f153708i.mo106177b();
                }
                this.f148118a.f153708i = ont0Var;
                this.f148118a.f153708i.mo106179c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
