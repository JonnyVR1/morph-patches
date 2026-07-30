package p149l;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class eri0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public long f92930a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public long f92931b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public long f92932c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal<Long> f92933d = new ThreadLocal<>();

    public eri0(long j) {
        m117842h(j);
    }

    /* JADX INFO: renamed from: g */
    public static long m117833g(long j) {
        return (j * 1000000) / 90000;
    }

    /* JADX INFO: renamed from: j */
    public static long m117834j(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX INFO: renamed from: k */
    public static long m117835k(long j) {
        return m117834j(j) % 8589934592L;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m117836a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!m117841f()) {
                long jLongValue = this.f92930a;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) p11.m167011e(this.f92933d.get())).longValue();
                }
                this.f92931b = jLongValue - j;
                notifyAll();
            }
            this.f92932c = j;
            return j + this.f92931b;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized long m117837b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f92932c;
            if (j2 != -9223372036854775807L) {
                long jM117834j = m117834j(j2);
                long j3 = (4294967296L + jM117834j) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jM117834j) < Math.abs(j - jM117834j)) {
                    j = j4;
                }
            }
            return m117836a(m117833g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized long m117838c() {
        long j;
        j = this.f92930a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: d */
    public synchronized long m117839d() {
        long j;
        try {
            j = this.f92932c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.f92931b : m117838c();
    }

    /* JADX INFO: renamed from: e */
    public synchronized long m117840e() {
        return this.f92931b;
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m117841f() {
        return this.f92931b != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m117842h(long j) {
        this.f92930a = j;
        this.f92931b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f92932c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m117843i(boolean z, long j, long j2) throws InterruptedException, TimeoutException {
        try {
            p11.m167013g(this.f92930a == 9223372036854775806L);
            if (m117841f()) {
                return;
            }
            if (z) {
                this.f92933d.set(Long.valueOf(j));
            } else {
                long jElapsedRealtime = 0;
                long j3 = j2;
                while (!m117841f()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        p11.m167013g(j3 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j3);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j2 && !m117841f()) {
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
