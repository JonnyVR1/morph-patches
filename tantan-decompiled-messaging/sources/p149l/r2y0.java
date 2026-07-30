package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class r2y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q1y0 f157463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f157464b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m1y0 f157465c;

    public r2y0(m1y0 m1y0Var, q1y0 q1y0Var, long j) {
        this.f157463a = q1y0Var;
        this.f157464b = j;
        this.f157465c = m1y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f157465c.m152635I(this.f157463a, false, this.f157464b);
        m1y0 m1y0Var = this.f157465c;
        m1y0Var.f130865e = null;
        m1y0Var.mo15098n().m100143L(null);
    }
}
