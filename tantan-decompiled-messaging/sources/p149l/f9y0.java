package p149l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class f9y0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public long f96544a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public long f96545b;

    /* JADX INFO: renamed from: c */
    public final ftr0 f96546c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n8y0 f96547d;

    public f9y0(n8y0 n8y0Var) {
        this.f96547d = n8y0Var;
        this.f96546c = new o9y0(this, n8y0Var.f165891a);
        long jElapsedRealtime = n8y0Var.zzb().elapsedRealtime();
        this.f96544a = jElapsedRealtime;
        this.f96545b = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m120132c(f9y0 f9y0Var) {
        f9y0Var.f96547d.mo15092h();
        f9y0Var.m120135d(false, false, f9y0Var.f96547d.zzb().elapsedRealtime());
        f9y0Var.f96547d.mo15093i().m128970p(f9y0Var.f96547d.zzb().elapsedRealtime());
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final long m120133a(long j) {
        long j2 = j - this.f96545b;
        this.f96545b = j;
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m120134b() {
        this.f96546c.m123084a();
        if (this.f96547d.mo15085a().m192648n(q8s0.f153276c1)) {
            this.f96544a = this.f96547d.zzb().elapsedRealtime();
        } else {
            this.f96544a = 0L;
        }
        this.f96545b = this.f96544a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final boolean m120135d(boolean z, boolean z2, long j) {
        this.f96547d.mo15092h();
        this.f96547d.m115400p();
        if (this.f96547d.f165891a.m194118k()) {
            this.f96547d.mo15088d().f175530r.m187783b(this.f96547d.zzb().currentTimeMillis());
        }
        long jM120133a = j - this.f96544a;
        if (!z && jM120133a < 1000) {
            this.f96547d.zzj().m211416E().m123937b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jM120133a));
            return false;
        }
        if (!z2) {
            jM120133a = m120133a(j);
        }
        this.f96547d.zzj().m211416E().m123937b("Recording user engagement, ms", Long.valueOf(jM120133a));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jM120133a);
        bey0.m101433S(this.f96547d.mo15097m().m152642x(!this.f96547d.mo15085a().m192639P()), bundle, true);
        if (!z2) {
            this.f96547d.mo15096l().m15197V0("auto", "_e", bundle);
        }
        this.f96544a = j;
        this.f96546c.m123084a();
        this.f96546c.m123085b(q8s0.f153278d0.m188827a(null).longValue());
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m120136e(long j) {
        this.f96546c.m123084a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public final void m120137f(long j) {
        this.f96547d.mo15092h();
        this.f96546c.m123084a();
        this.f96544a = j;
        this.f96545b = j;
    }
}
