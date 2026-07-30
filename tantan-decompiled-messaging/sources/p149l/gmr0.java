package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class gmr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dnr0 f103517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hmr0 f103518b;

    public gmr0(hmr0 hmr0Var, dnr0 dnr0Var) {
        this.f103517a = dnr0Var;
        this.f103518b = hmr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f103518b.f108467b.put(this.f103517a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
