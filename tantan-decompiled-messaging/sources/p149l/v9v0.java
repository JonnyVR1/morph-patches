package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class v9v0 {

    /* JADX INFO: renamed from: a */
    public final g6v0 f180679a;

    /* JADX INFO: renamed from: b */
    public boolean f180680b;

    public v9v0(g6v0 g6v0Var) {
        this.f180679a = g6v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m197601a() throws InterruptedException {
        while (!this.f180680b) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m197602b() {
        boolean z = false;
        while (!this.f180680b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m197603c() {
        boolean z;
        z = this.f180680b;
        this.f180680b = false;
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m197604d() {
        return this.f180680b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m197605e() {
        if (this.f180680b) {
            return false;
        }
        this.f180680b = true;
        notifyAll();
        return true;
    }

    public v9v0() {
        throw null;
    }
}
