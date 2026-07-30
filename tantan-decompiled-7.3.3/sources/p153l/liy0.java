package p153l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class liy0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public long f132273a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public long f132274b;

    /* JADX INFO: renamed from: c */
    public final l2s0 f132275c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ thy0 f132276d;

    public liy0(thy0 thy0Var) {
        this.f132276d = thy0Var;
        this.f132275c = new uiy0(this, thy0Var.f202159a);
        long jElapsedRealtime = thy0Var.zzb().elapsedRealtime();
        this.f132273a = jElapsedRealtime;
        this.f132274b = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m154431c(liy0 liy0Var) {
        liy0Var.f132276d.mo15146h();
        liy0Var.m154434d(false, false, liy0Var.f132276d.zzb().elapsedRealtime());
        liy0Var.f132276d.mo15147i().m162039p(liy0Var.f132276d.zzb().elapsedRealtime());
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final long m154432a(long j) {
        long j2 = j - this.f132274b;
        this.f132274b = j;
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m154433b() {
        this.f132275c.m152632a();
        if (this.f132276d.mo15139a().m98440n(whs0.f189252c1)) {
            this.f132273a = this.f132276d.zzb().elapsedRealtime();
        } else {
            this.f132273a = 0L;
        }
        this.f132274b = this.f132273a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final boolean m154434d(boolean z, boolean z2, long j) {
        this.f132276d.mo15146h();
        this.f132276d.m149988p();
        if (this.f132276d.f202159a.m100298k()) {
            this.f132276d.mo15142d().f71911r.m219991b(this.f132276d.zzb().currentTimeMillis());
        }
        long jM154432a = j - this.f132273a;
        if (!z && jM154432a < 1000) {
            this.f132276d.zzj().m114562E().m153301b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jM154432a));
            return false;
        }
        if (!z2) {
            jM154432a = m154432a(j);
        }
        this.f132276d.zzj().m114562E().m153301b("Recording user engagement, ms", Long.valueOf(jM154432a));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jM154432a);
        hny0.m136300S(this.f132276d.mo15151m().m185291x(!this.f132276d.mo15139a().m98431P()), bundle, true);
        if (!z2) {
            this.f132276d.mo15150l().m15251V0("auto", "_e", bundle);
        }
        this.f132273a = j;
        this.f132275c.m152632a();
        this.f132275c.m152633b(whs0.f189254d0.m220931a(null).longValue());
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m154435e(long j) {
        this.f132275c.m152632a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public final void m154436f(long j) {
        this.f132276d.mo15146h();
        this.f132275c.m152632a();
        this.f132273a = j;
        this.f132274b = j;
    }
}
