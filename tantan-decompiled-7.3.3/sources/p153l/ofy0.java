package p153l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class ofy0 implements kay0 {

    /* JADX INFO: renamed from: a */
    public final mfv0 f147167a;

    /* JADX INFO: renamed from: b */
    public boolean f147168b;

    /* JADX INFO: renamed from: c */
    public long f147169c;

    /* JADX INFO: renamed from: d */
    public long f147170d;

    /* JADX INFO: renamed from: e */
    public iet0 f147171e = iet0.f114611d;

    public ofy0(mfv0 mfv0Var) {
        this.f147167a = mfv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m167518a(long j) {
        this.f147169c = j;
        if (this.f147168b) {
            this.f147170d = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m167519b() {
        if (this.f147168b) {
            return;
        }
        this.f147170d = SystemClock.elapsedRealtime();
        this.f147168b = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m167520c() {
        if (this.f147168b) {
            m167518a(zza());
            this.f147168b = false;
        }
    }

    @Override // p153l.kay0
    /* JADX INFO: renamed from: g */
    public final void mo148998g(iet0 iet0Var) {
        if (this.f147168b) {
            m167518a(zza());
        }
        this.f147171e = iet0Var;
    }

    @Override // p153l.kay0
    public final long zza() {
        long j = this.f147169c;
        if (!this.f147168b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f147170d;
        iet0 iet0Var = this.f147171e;
        return j + (iet0Var.f114615a == 1.0f ? mpw0.m159393F(jElapsedRealtime) : iet0Var.m139648a(jElapsedRealtime));
    }

    @Override // p153l.kay0
    public final iet0 zzc() {
        return this.f147171e;
    }

    @Override // p153l.kay0
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
