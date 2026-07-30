package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class xby0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ way0 f193236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f193237b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ say0 f193238c;

    public xby0(say0 say0Var, way0 way0Var, long j) {
        this.f193236a = way0Var;
        this.f193237b = j;
        this.f193238c = say0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f193238c.m185284I(this.f193236a, false, this.f193237b);
        say0 say0Var = this.f193238c;
        say0Var.f167086e = null;
        say0Var.mo15152n().m134543L(null);
    }
}
