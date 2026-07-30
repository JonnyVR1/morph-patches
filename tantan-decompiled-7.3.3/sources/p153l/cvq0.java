package p153l;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class cvq0<T> {

    /* JADX INFO: renamed from: a */
    private final long f84048a;

    /* JADX INFO: renamed from: b */
    private long f84049b;

    /* JADX INFO: renamed from: c */
    private long f84050c;

    /* JADX INFO: renamed from: d */
    private long f84051d;

    /* JADX INFO: renamed from: e */
    private long f84052e;

    /* JADX INFO: renamed from: f */
    private long f84053f;

    /* JADX INFO: renamed from: g */
    private long f84054g;

    /* JADX INFO: renamed from: h */
    private long f84055h;

    /* JADX INFO: renamed from: i */
    private final long f84056i;

    public cvq0(long j, long j2) {
        this.f84056i = j * 1000000;
        this.f84048a = j2;
    }

    /* JADX INFO: renamed from: a */
    public long m112857a() {
        return this.f84050c;
    }

    /* JADX INFO: renamed from: b */
    public T m112858b(Callable<T> callable) {
        T tCall;
        long j = this.f84049b;
        long j2 = this.f84056i;
        if (j > j2) {
            long j3 = (j / j2) * this.f84048a;
            this.f84049b = 0L;
            if (j3 > 0) {
                try {
                    Thread.sleep(j3);
                } catch (Exception unused) {
                }
            }
        }
        long jNanoTime = System.nanoTime();
        if (this.f84054g <= 0) {
            this.f84054g = jNanoTime;
        }
        try {
            tCall = callable.call();
        } catch (Exception e) {
            e.printStackTrace();
            tCall = null;
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        this.f84055h = System.nanoTime();
        this.f84052e++;
        if (this.f84050c < jNanoTime2) {
            this.f84050c = jNanoTime2;
        }
        if (jNanoTime2 > 0) {
            this.f84053f += jNanoTime2;
            long j4 = this.f84051d;
            if (j4 == 0 || j4 > jNanoTime2) {
                this.f84051d = jNanoTime2;
            }
        }
        this.f84049b += Math.max(jNanoTime2, 0L);
        return tCall;
    }

    /* JADX INFO: renamed from: c */
    public long m112859c() {
        return this.f84051d;
    }

    /* JADX INFO: renamed from: d */
    public long m112860d() {
        long j = this.f84053f;
        if (j > 0) {
            long j2 = this.f84052e;
            if (j2 > 0) {
                return j / j2;
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public long m112861e() {
        long j = this.f84055h;
        long j2 = this.f84054g;
        if (j > j2) {
            return j - j2;
        }
        return 0L;
    }
}
