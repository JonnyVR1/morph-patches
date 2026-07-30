package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class wvr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f190984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f190985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jwr0 f190986c;

    public wvr0(jwr0 jwr0Var, String str, long j) {
        this.f190984a = str;
        this.f190985b = j;
        this.f190986c = jwr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f190986c.f122956a.m183459a(this.f190984a, this.f190985b);
        jwr0 jwr0Var = this.f190986c;
        jwr0Var.f122956a.m183460b(jwr0Var.toString());
    }
}
