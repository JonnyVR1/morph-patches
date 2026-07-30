package p153l;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class iiy0 {

    /* JADX INFO: renamed from: a */
    public fiy0 f115159a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ thy0 f115160b;

    public iiy0(thy0 thy0Var) {
        this.f115160b = thy0Var;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final void m140171a() {
        this.f115160b.mo15146h();
        if (this.f115159a != null) {
            this.f115160b.f174430c.removeCallbacks(this.f115159a);
        }
        this.f115160b.mo15142d().f71914u.m115832a(false);
        this.f115160b.m191306x(false);
        if (this.f115160b.mo15139a().m98440n(whs0.f189217M0) && this.f115160b.mo15150l().m15225D0()) {
            this.f115160b.zzj().m114562E().m153300a("Retrying trigger URI registration in foreground");
            this.f115160b.mo15150l().m15221B0();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m140172b(long j) {
        this.f115159a = new fiy0(this, this.f115160b.zzb().currentTimeMillis(), j);
        this.f115160b.f174430c.postDelayed(this.f115159a, 2000L);
    }
}
