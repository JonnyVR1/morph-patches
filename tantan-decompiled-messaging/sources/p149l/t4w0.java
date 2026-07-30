package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class t4w0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w4w0 f167755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l4w0 f167756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f167757c;

    public t4w0(w4w0 w4w0Var, l4w0 l4w0Var, boolean z) {
        this.f167755a = w4w0Var;
        this.f167756b = l4w0Var;
        this.f167757c = z;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        l4w0 l4w0Var = this.f167756b;
        if (l4w0Var.zzj()) {
            w4w0 w4w0Var = this.f167755a;
            l4w0Var.mo129463b(th);
            l4w0Var.mo129461S(false);
            w4w0Var.m201583a(l4w0Var);
            if (this.f167757c) {
                this.f167755a.m201589g();
            }
        }
    }

    @Override // p149l.fmw0
    public final void zzb(Object obj) {
        l4w0 l4w0Var = this.f167756b;
        l4w0Var.mo129461S(true);
        this.f167755a.m201583a(l4w0Var);
        if (this.f167757c) {
            this.f167755a.m201589g();
        }
    }
}
