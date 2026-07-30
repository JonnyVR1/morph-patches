package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class bjv0 {

    /* JADX INFO: renamed from: a */
    public final mfv0 f77025a;

    /* JADX INFO: renamed from: b */
    public boolean f77026b;

    public bjv0(mfv0 mfv0Var) {
        this.f77025a = mfv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m104773a() throws InterruptedException {
        while (!this.f77026b) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m104774b() {
        boolean z = false;
        while (!this.f77026b) {
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
    public final synchronized boolean m104775c() {
        boolean z;
        z = this.f77026b;
        this.f77026b = false;
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m104776d() {
        return this.f77026b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m104777e() {
        if (this.f77026b) {
            return false;
        }
        this.f77026b = true;
        notifyAll();
        return true;
    }

    public bjv0() {
        throw null;
    }
}
