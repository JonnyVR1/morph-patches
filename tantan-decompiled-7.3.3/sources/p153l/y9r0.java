package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class y9r0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f198119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f198120b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n9s0 f198121c;

    public y9r0(n9s0 n9s0Var, String str, long j) {
        this.f198119a = str;
        this.f198120b = j;
        this.f198121c = n9s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n9s0.m162036u(this.f198121c, this.f198119a, this.f198120b);
    }
}
