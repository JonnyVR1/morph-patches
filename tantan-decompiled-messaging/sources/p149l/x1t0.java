package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class x1t0 {

    /* JADX INFO: renamed from: a */
    public final Object f189100a = new Object();

    /* JADX INFO: renamed from: c */
    public volatile int f189102c = 1;

    /* JADX INFO: renamed from: b */
    public volatile long f189101b = 0;

    public /* synthetic */ x1t0(w1t0 w1t0Var) {
    }

    /* JADX INFO: renamed from: a */
    public final void m206763a() {
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
        synchronized (this.f189100a) {
            try {
                if (this.f189102c == 3) {
                    if (this.f189101b + ((Long) d1s0.m109677c().m144697a(m7s0.f132126X5)).longValue() <= jCurrentTimeMillis) {
                        this.f189102c = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long jCurrentTimeMillis2 = vny0.m199064b().currentTimeMillis();
        synchronized (this.f189100a) {
            try {
                if (this.f189102c != 2) {
                    return;
                }
                this.f189102c = 3;
                if (this.f189102c == 3) {
                    this.f189101b = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
