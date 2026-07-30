package p149l;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class hew0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public long f107414a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public long f107415b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public long f107416c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f107417d = new ThreadLocal();

    public hew0(long j) {
        m130709i(0L);
    }

    /* JADX INFO: renamed from: g */
    public static long m130701g(long j) {
        return (j * 1000000) / 90000;
    }

    /* JADX INFO: renamed from: h */
    public static long m130702h(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m130703a(long j) {
        try {
            if (!m130710j()) {
                long jLongValue = this.f107414a;
                if (jLongValue == 9223372036854775806L) {
                    Long l2 = (Long) this.f107417d.get();
                    if (l2 == null) {
                        throw null;
                    }
                    jLongValue = l2.longValue();
                }
                this.f107415b = jLongValue - j;
                notifyAll();
            }
            this.f107416c = j;
        } catch (Throwable th) {
            throw th;
        }
        return j + this.f107415b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m130704b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f107416c;
            if (j2 != -9223372036854775807L) {
                long jM130702h = m130702h(j2);
                long j3 = (4294967296L + jM130702h) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jM130702h) < Math.abs(j - jM130702h)) {
                    j = j4;
                }
            }
            return m130703a(m130701g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m130705c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f107416c;
            if (j2 != -9223372036854775807L) {
                long jM130702h = m130702h(j2);
                long j3 = jM130702h / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jM130702h) {
                    j = j4;
                }
            }
            return m130703a(m130701g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m130706d() {
        long j = this.f107414a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m130707e() {
        long j;
        try {
            j = this.f107416c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.f107415b : m130706d();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized long m130708f() {
        return this.f107415b;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m130709i(long j) {
        this.f107414a = j;
        this.f107415b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f107416c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m130710j() {
        return this.f107415b != -9223372036854775807L;
    }
}
