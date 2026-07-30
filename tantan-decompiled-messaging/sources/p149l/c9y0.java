package p149l;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class c9y0 {

    /* JADX INFO: renamed from: a */
    public z8y0 f79992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n8y0 f79993b;

    public c9y0(n8y0 n8y0Var) {
        this.f79993b = n8y0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m105919a() {
        this.f79993b.mo15092h();
        if (this.f79992a != null) {
            this.f79993b.f137706c.removeCallbacks(this.f79992a);
        }
        this.f79993b.mo15088d().f175533u.m207309a(false);
        this.f79993b.m158513x(false);
        if (this.f79993b.mo15085a().m192648n(q8s0.f153241M0) && this.f79993b.mo15096l().m15171D0()) {
            this.f79993b.zzj().m211416E().m123936a("Retrying trigger URI registration in foreground");
            this.f79993b.mo15096l().m15167B0();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m105920b(long j) {
        this.f79992a = new z8y0(this, this.f79993b.zzb().currentTimeMillis(), j);
        this.f79993b.f137706c.postDelayed(this.f79992a, 2000L);
    }
}
