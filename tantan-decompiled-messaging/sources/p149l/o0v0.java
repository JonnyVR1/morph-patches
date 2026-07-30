package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class o0v0 {

    /* JADX INFO: renamed from: a */
    public long f141375a = 0;

    /* JADX INFO: renamed from: b */
    public int f141376b = 0;

    /* JADX INFO: renamed from: c */
    public long f141377c = 0;

    /* JADX INFO: renamed from: d */
    public long f141378d = 0;

    /* JADX INFO: renamed from: e */
    public long f141379e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f141380f = new Object();

    /* JADX INFO: renamed from: g */
    public final Object f141381g = new Object();

    /* JADX INFO: renamed from: h */
    public final Object f141382h = new Object();

    /* JADX INFO: renamed from: i */
    public final Object f141383i = new Object();

    /* JADX INFO: renamed from: j */
    public final Object f141384j = new Object();

    /* JADX INFO: renamed from: a */
    public final int m162177a() {
        int i;
        synchronized (this.f141381g) {
            i = this.f141376b;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m162178b() {
        long j;
        synchronized (this.f141384j) {
            j = this.f141379e;
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m162179c() {
        long j;
        synchronized (this.f141383i) {
            j = this.f141378d;
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m162180d() {
        long j;
        synchronized (this.f141380f) {
            j = this.f141375a;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final long m162181e() {
        long j;
        synchronized (this.f141382h) {
            j = this.f141377c;
        }
        return j;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m162182f(long j) {
        synchronized (this.f141384j) {
            this.f141379e = j;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m162183g(long j) {
        synchronized (this.f141383i) {
            this.f141378d = j;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m162184h(long j) {
        synchronized (this.f141380f) {
            this.f141375a = j;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m162185i(int i) {
        synchronized (this.f141381g) {
            this.f141376b = i;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m162186j(long j) {
        synchronized (this.f141382h) {
            this.f141377c = j;
        }
    }
}
