package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class mvr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jwr0 f138942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nvr0 f138943b;

    public mvr0(nvr0 nvr0Var, jwr0 jwr0Var) {
        this.f138942a = jwr0Var;
        this.f138943b = nvr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f138943b.f143850b.put(this.f138942a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
