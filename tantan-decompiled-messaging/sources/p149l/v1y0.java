package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class v1y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q1y0 f179304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q1y0 f179305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f179306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f179307d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m1y0 f179308e;

    public v1y0(m1y0 m1y0Var, q1y0 q1y0Var, q1y0 q1y0Var2, long j, boolean z) {
        this.f179304a = q1y0Var;
        this.f179305b = q1y0Var2;
        this.f179306c = j;
        this.f179307d = z;
        this.f179308e = m1y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f179308e.m152634H(this.f179304a, this.f179305b, this.f179306c, this.f179307d, null);
    }
}
