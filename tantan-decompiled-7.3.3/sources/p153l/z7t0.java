package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class z7t0 {

    /* JADX INFO: renamed from: a */
    public long f203266a;

    /* JADX INFO: renamed from: b */
    public long f203267b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Object f203268c = new Object();

    public z7t0(long j) {
        this.f203266a = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m218917a(long j) {
        synchronized (this.f203268c) {
            this.f203266a = j;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m218918b() {
        synchronized (this.f203268c) {
            try {
                long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
                if (this.f203267b + this.f203266a > jElapsedRealtime) {
                    return false;
                }
                this.f203267b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
