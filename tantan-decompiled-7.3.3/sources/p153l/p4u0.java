package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class p4u0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f150562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f150563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n9s0 f150564c;

    public p4u0(n9s0 n9s0Var, String str, long j) {
        this.f150562a = str;
        this.f150563b = j;
        this.f150564c = n9s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n9s0.m162038x(this.f150564c, this.f150562a, this.f150563b);
    }
}
