package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class jxv0 {

    /* JADX INFO: renamed from: a */
    public final Clock f120264a;

    /* JADX INFO: renamed from: b */
    public final Object f120265b = new Object();

    /* JADX INFO: renamed from: d */
    public volatile int f120267d = 1;

    /* JADX INFO: renamed from: c */
    public volatile long f120266c = 0;

    public jxv0(Clock clock) {
        this.f120264a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m143826a() {
        m143831f(2, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m143827b(boolean z) {
        if (z) {
            m143831f(1, 2);
        } else {
            m143831f(2, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m143828c() {
        boolean z;
        synchronized (this.f120265b) {
            m143830e();
            z = this.f120267d == 3;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m143829d() {
        boolean z;
        synchronized (this.f120265b) {
            m143830e();
            z = this.f120267d == 2;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m143830e() {
        long jCurrentTimeMillis = this.f120264a.currentTimeMillis();
        synchronized (this.f120265b) {
            try {
                if (this.f120267d == 3) {
                    if (this.f120266c + ((Long) d1s0.m109677c().m144697a(m7s0.f132126X5)).longValue() <= jCurrentTimeMillis) {
                        this.f120267d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m143831f(int i, int i2) {
        m143830e();
        Object obj = this.f120265b;
        long jCurrentTimeMillis = this.f120264a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f120267d != i) {
                    return;
                }
                this.f120267d = i2;
                if (this.f120267d == 3) {
                    this.f120266c = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
