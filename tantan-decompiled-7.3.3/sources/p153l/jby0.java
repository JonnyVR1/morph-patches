package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class jby0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f120000a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ say0 f120001b;

    public jby0(say0 say0Var, long j) {
        this.f120000a = j;
        this.f120001b = say0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f120001b.mo15147i().m162039p(this.f120000a);
        this.f120001b.f167086e = null;
    }
}
