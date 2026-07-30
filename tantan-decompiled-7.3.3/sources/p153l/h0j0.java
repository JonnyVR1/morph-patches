package p153l;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class h0j0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public long f107304a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public long f107305b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public long f107306c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Long> f107307d = new ThreadLocal<>();

    public h0j0(long j) {
        m133179h(j);
    }

    /* JADX INFO: renamed from: g */
    public static long m133170g(long j) {
        return (j * 1000000) / 90000;
    }

    /* JADX INFO: renamed from: j */
    public static long m133171j(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX INFO: renamed from: k */
    public static long m133172k(long j) {
        return m133171j(j) % 8589934592L;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m133173a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m133178f()) {
                long jLongValue = this.f107304a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) w11.m204369e(this.f107307d.get())).longValue();
                }
                this.f107305b = jLongValue - j;
                notifyAll();
            }
            this.f107306c = j;
            return j + this.f107305b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized long m133174b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f107306c;
            if (j2 != -9223372036854775807L) {
                long jM133171j = m133171j(j2);
                long j3 = (4294967296L + jM133171j) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jM133171j) < Math.abs(j - jM133171j)) {
                    j = j4;
                }
            }
            return m133173a(m133170g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized long m133175c() {
        long j;
        j = this.f107304a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public synchronized long m133176d() {
        long j;
        try {
            j = this.f107306c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.f107305b : m133175c();
    }

    /* JADX INFO: renamed from: e */
    public synchronized long m133177e() {
        return this.f107305b;
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m133178f() {
        return this.f107305b != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m133179h(long j) {
        this.f107304a = j;
        this.f107305b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f107306c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m133180i(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        try {
            w11.m204371g(this.f107304a == 9223372036854775806L);
            if (m133178f()) {
                return;
            }
            if (z) {
                this.f107307d.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!m133178f()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        w11.m204371g(j3 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !m133178f()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j3 = j2 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
