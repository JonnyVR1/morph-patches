package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wsv0 implements fdv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xsv0 f187980a;

    public wsv0(xsv0 xsv0Var) {
        this.f187980a = xsv0Var;
    }

    @Override // p149l.fdv0
    public final void zza() {
        synchronized (this.f187980a) {
            this.f187980a.f194317k = null;
        }
    }

    @Override // p149l.fdv0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zmt0 zmt0Var = (zmt0) obj;
        synchronized (this.f187980a) {
            try {
                zmt0 zmt0Var2 = this.f187980a.f194317k;
                if (zmt0Var2 != null) {
                    zmt0Var2.mo106177b();
                }
                xsv0 xsv0Var = this.f187980a;
                xsv0Var.f194317k = zmt0Var;
                zmt0Var.m219375j(xsv0Var);
                xsv0 xsv0Var2 = this.f187980a;
                xsv0Var2.f194312f.m171254z(new jnt0(zmt0Var, xsv0Var2, xsv0Var2.f194312f, xsv0Var2.f194314h));
                zmt0Var.mo106179c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
