package p149l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class wlq0<T> {

    /* JADX INFO: renamed from: a */
    private final long f186984a;

    /* JADX INFO: renamed from: b */
    private long f186985b;

    /* JADX INFO: renamed from: c */
    private long f186986c;

    /* JADX INFO: renamed from: d */
    private long f186987d;

    /* JADX INFO: renamed from: e */
    private long f186988e;

    /* JADX INFO: renamed from: f */
    private long f186989f;

    /* JADX INFO: renamed from: g */
    private long f186990g;

    /* JADX INFO: renamed from: h */
    private long f186991h;

    /* JADX INFO: renamed from: i */
    private final long f186992i;

    public wlq0(long j, long j2) {
        this.f186992i = j * 1000000;
        this.f186984a = j2;
    }

    /* JADX INFO: renamed from: a */
    public long m203874a() {
        return this.f186986c;
    }

    /* JADX INFO: renamed from: b */
    public T m203875b(Callable<T> callable) {
        T tCall;
        long j = this.f186985b;
        long j2 = this.f186992i;
        if (j > j2) {
            long j3 = (j / j2) * this.f186984a;
            this.f186985b = 0L;
            if (j3 > 0) {
                try {
                    Thread.sleep(j3);
                } catch (Exception unused) {
                }
            }
        }
        long jNanoTime = System.nanoTime();
        if (this.f186990g <= 0) {
            this.f186990g = jNanoTime;
        }
        try {
            tCall = callable.call();
        } catch (Exception e) {
            e.printStackTrace();
            tCall = null;
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        this.f186991h = System.nanoTime();
        this.f186988e++;
        if (this.f186986c < jNanoTime2) {
            this.f186986c = jNanoTime2;
        }
        if (jNanoTime2 > 0) {
            this.f186989f += jNanoTime2;
            long j4 = this.f186987d;
            if (j4 == 0 || j4 > jNanoTime2) {
                this.f186987d = jNanoTime2;
            }
        }
        this.f186985b += Math.max(jNanoTime2, 0L);
        return tCall;
    }

    /* JADX INFO: renamed from: c */
    public long m203876c() {
        return this.f186987d;
    }

    /* JADX INFO: renamed from: d */
    public long m203877d() {
        long j = this.f186989f;
        if (j > 0) {
            long j2 = this.f186988e;
            if (j2 > 0) {
                return j / j2;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public long m203878e() {
        long j = this.f186991h;
        long j2 = this.f186990g;
        if (j > j2) {
            return j - j2;
        }
        return 0L;
    }
}
