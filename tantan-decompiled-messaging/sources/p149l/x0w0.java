package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class x0w0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a1w0 f188998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b1w0 f188999b;

    public x0w0(b1w0 b1w0Var, a1w0 a1w0Var) {
        this.f188998a = a1w0Var;
        this.f188999b = b1w0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        synchronized (this.f188999b) {
            this.f188999b.f72635e = null;
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f188999b) {
            try {
                this.f188999b.f72635e = null;
                this.f188999b.f72634d.addFirst(this.f188998a);
                b1w0 b1w0Var = this.f188999b;
                if (b1w0Var.f72636f == 1) {
                    b1w0Var.m99884h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
