package p149l;

/* JADX INFO: loaded from: classes.dex */
public final class bfg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ slg0 f75309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f75310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Exception f75311c;

    public bfg0(slg0 slg0Var, int i, Exception exc) {
        this.f75309a = slg0Var;
        this.f75310b = i;
        this.f75311c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75309a.f165204p.m140924i(this.f75309a, this.f75310b, this.f75311c);
    }
}
