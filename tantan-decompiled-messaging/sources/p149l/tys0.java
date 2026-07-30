package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class tys0 {

    /* JADX INFO: renamed from: a */
    public long f172625a;

    /* JADX INFO: renamed from: b */
    public long f172626b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public final Object f172627c = new Object();

    public tys0(long j) {
        this.f172625a = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m191069a(long j) {
        synchronized (this.f172627c) {
            this.f172625a = j;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m191070b() {
        synchronized (this.f172627c) {
            try {
                long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
                if (this.f172626b + this.f172625a > jElapsedRealtime) {
                    return false;
                }
                this.f172626b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
