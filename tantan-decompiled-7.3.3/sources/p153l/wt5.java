package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class wt5 {

    /* JADX INFO: renamed from: a */
    public final qa5 f190713a;

    /* JADX INFO: renamed from: b */
    public boolean f190714b;

    public wt5() {
        this(qa5.f156345a);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m207817a() throws InterruptedException {
        while (!this.f190714b) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m207818b() {
        boolean z = false;
        while (!this.f190714b) {
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
    public synchronized boolean m207819c() {
        boolean z;
        z = this.f190714b;
        this.f190714b = false;
        return z;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m207820d() {
        return this.f190714b;
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m207821e() {
        if (this.f190714b) {
            return false;
        }
        this.f190714b = true;
        notifyAll();
        return true;
    }

    public wt5(qa5 qa5Var) {
        this.f190713a = qa5Var;
    }
}
