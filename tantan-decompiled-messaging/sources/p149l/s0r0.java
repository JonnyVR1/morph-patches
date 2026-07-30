package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class s0r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f161797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f161798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h0s0 f161799c;

    public s0r0(h0s0 h0s0Var, String str, long j) {
        this.f161797a = str;
        this.f161798b = j;
        this.f161799c = h0s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0s0.m128967u(this.f161799c, this.f161797a, this.f161798b);
    }
}
