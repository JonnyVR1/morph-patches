package p153l;

import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class nnw0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public long f142894a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public long f142895b;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public long f142896c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f142897d = new ThreadLocal();

    public nnw0(long j) {
        m164004i(0L);
    }

    /* JADX INFO: renamed from: g */
    public static long m163996g(long j) {
        return (j * 1000000) / 90000;
    }

    /* JADX INFO: renamed from: h */
    public static long m163997h(long j) {
        return (j * 90000) / 1000000;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m163998a(long j) {
        try {
            if (!m164005j()) {
                long jLongValue = this.f142894a;
                if (jLongValue == 9223372036854775806L) {
                    Long l2 = (Long) this.f142897d.get();
                    if (l2 == null) {
                        throw null;
                    }
                    jLongValue = l2.longValue();
                }
                this.f142895b = jLongValue - j;
                notifyAll();
            }
            this.f142896c = j;
        } catch (Throwable th) {
            throw th;
        }
        return j + this.f142895b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m163999b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f142896c;
            if (j2 != -9223372036854775807L) {
                long jM163997h = m163997h(j2);
                long j3 = (4294967296L + jM163997h) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jM163997h) < Math.abs(j - jM163997h)) {
                    j = j4;
                }
            }
            return m163998a(m163996g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m164000c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.f142896c;
            if (j2 != -9223372036854775807L) {
                long jM163997h = m163997h(j2);
                long j3 = jM163997h / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j += (j3 + 1) * 8589934592L;
                if (j4 >= jM163997h) {
                    j = j4;
                }
            }
            return m163998a(m163996g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m164001d() {
        long j = this.f142894a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized long m164002e() {
        long j;
        try {
            j = this.f142896c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.f142895b : m164001d();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized long m164003f() {
        return this.f142895b;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m164004i(long j) {
        this.f142894a = j;
        this.f142895b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f142896c = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized boolean m164005j() {
        return this.f142895b != -9223372036854775807L;
    }
}
