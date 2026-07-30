package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class dbt0 {

    /* JADX INFO: renamed from: a */
    public final Object f87707a = new Object();

    /* JADX INFO: renamed from: c */
    public volatile int f87709c = 1;

    /* JADX INFO: renamed from: b */
    public volatile long f87708b = 0;

    public /* synthetic */ dbt0(cbt0 cbt0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final void m115169a() {
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
        synchronized (this.f87707a) {
            try {
                if (this.f87709c == 3) {
                    if (this.f87708b + ((Long) jas0.m144075c().m176505a(sgs0.f168197X5)).longValue() <= jCurrentTimeMillis) {
                        this.f87709c = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long jCurrentTimeMillis2 = bxy0.m106918b().currentTimeMillis();
        synchronized (this.f87707a) {
            try {
                if (this.f87709c != 2) {
                    return;
                }
                this.f87709c = 3;
                if (this.f87709c == 3) {
                    this.f87708b = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
