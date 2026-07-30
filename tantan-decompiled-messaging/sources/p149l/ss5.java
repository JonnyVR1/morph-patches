package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ss5 {

    /* JADX INFO: renamed from: a */
    public final p95 f166159a;

    /* JADX INFO: renamed from: b */
    public boolean f166160b;

    public ss5() {
        this(p95.f147671a);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m185710a() throws InterruptedException {
        while (!this.f166160b) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m185711b() {
        boolean z = false;
        while (!this.f166160b) {
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
    public synchronized boolean m185712c() {
        boolean z;
        z = this.f166160b;
        this.f166160b = false;
        return z;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m185713d() {
        return this.f166160b;
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m185714e() {
        if (this.f166160b) {
            return false;
        }
        this.f166160b = true;
        notifyAll();
        return true;
    }

    public ss5(p95 p95Var) {
        this.f166159a = p95Var;
    }
}
