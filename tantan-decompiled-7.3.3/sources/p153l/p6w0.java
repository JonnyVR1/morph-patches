package p153l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class p6w0 {

    /* JADX INFO: renamed from: a */
    public final Clock f150878a;

    /* JADX INFO: renamed from: b */
    public final Object f150879b = new Object();

    /* JADX INFO: renamed from: d */
    public volatile int f150881d = 1;

    /* JADX INFO: renamed from: c */
    public volatile long f150880c = 0;

    public p6w0(Clock clock) {
        this.f150878a = clock;
    }

    /* JADX INFO: renamed from: a */
    public final void m171080a() {
        m171085f(2, 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m171081b(boolean z) {
        if (z) {
            m171085f(1, 2);
        } else {
            m171085f(2, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m171082c() {
        boolean z;
        synchronized (this.f150879b) {
            m171084e();
            z = this.f150881d == 3;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m171083d() {
        boolean z;
        synchronized (this.f150879b) {
            m171084e();
            z = this.f150881d == 2;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m171084e() {
        long jCurrentTimeMillis = this.f150878a.currentTimeMillis();
        synchronized (this.f150879b) {
            try {
                if (this.f150881d == 3) {
                    if (this.f150880c + ((Long) jas0.m144075c().m176505a(sgs0.f168197X5)).longValue() <= jCurrentTimeMillis) {
                        this.f150881d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m171085f(int i, int i2) {
        m171084e();
        Object obj = this.f150879b;
        long jCurrentTimeMillis = this.f150878a.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f150881d != i) {
                    return;
                }
                this.f150881d = i2;
                if (this.f150881d == 3) {
                    this.f150880c = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
