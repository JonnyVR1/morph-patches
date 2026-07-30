package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class uhw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g9x0 f176606a;

    public uhw0(g9x0 g9x0Var) {
        this.f176606a = g9x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f176606a.f101609b) {
            try {
                g9x0 g9x0Var = this.f176606a;
                if (g9x0Var.f101610c != null) {
                    g9x0Var.f101610c.onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
