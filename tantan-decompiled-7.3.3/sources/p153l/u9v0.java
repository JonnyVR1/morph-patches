package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class u9v0 {

    /* JADX INFO: renamed from: a */
    public long f178147a = 0;

    /* JADX INFO: renamed from: b */
    public int f178148b = 0;

    /* JADX INFO: renamed from: c */
    public long f178149c = 0;

    /* JADX INFO: renamed from: d */
    public long f178150d = 0;

    /* JADX INFO: renamed from: e */
    public long f178151e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f178152f = new Object();

    /* JADX INFO: renamed from: g */
    public final Object f178153g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f178154h = new Object();

    /* JADX INFO: renamed from: i */
    public final Object f178155i = new Object();

    /* JADX INFO: renamed from: j */
    public final Object f178156j = new Object();

    /* JADX INFO: renamed from: a */
    public final int m195132a() {
        int i;
        synchronized (this.f178153g) {
            i = this.f178148b;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m195133b() {
        long j;
        synchronized (this.f178156j) {
            j = this.f178151e;
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m195134c() {
        long j;
        synchronized (this.f178155i) {
            j = this.f178150d;
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m195135d() {
        long j;
        synchronized (this.f178152f) {
            j = this.f178147a;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final long m195136e() {
        long j;
        synchronized (this.f178154h) {
            j = this.f178149c;
        }
        return j;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m195137f(long j) {
        synchronized (this.f178156j) {
            this.f178151e = j;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m195138g(long j) {
        synchronized (this.f178155i) {
            this.f178150d = j;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m195139h(long j) {
        synchronized (this.f178152f) {
            this.f178147a = j;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m195140i(int i) {
        synchronized (this.f178153g) {
            this.f178148b = i;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m195141j(long j) {
        synchronized (this.f178154h) {
            this.f178149c = j;
        }
    }
}
