package p149l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public final class i6y0 implements e1y0 {

    /* JADX INFO: renamed from: a */
    public final g6v0 f111790a;

    /* JADX INFO: renamed from: b */
    public boolean f111791b;

    /* JADX INFO: renamed from: c */
    public long f111792c;

    /* JADX INFO: renamed from: d */
    public long f111793d;

    /* JADX INFO: renamed from: e */
    public c5t0 f111794e = c5t0.f79412d;

    public i6y0(g6v0 g6v0Var) {
        this.f111790a = g6v0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m134671a(long j) {
        this.f111792c = j;
        if (this.f111791b) {
            this.f111793d = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m134672b() {
        if (this.f111791b) {
            return;
        }
        this.f111793d = SystemClock.elapsedRealtime();
        this.f111791b = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m134673c() {
        if (this.f111791b) {
            m134671a(zza());
            this.f111791b = false;
        }
    }

    @Override // p149l.e1y0
    /* JADX INFO: renamed from: g */
    public final void mo114455g(c5t0 c5t0Var) {
        if (this.f111791b) {
            m134671a(zza());
        }
        this.f111794e = c5t0Var;
    }

    @Override // p149l.e1y0
    public final long zza() {
        long j = this.f111792c;
        if (!this.f111791b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f111793d;
        c5t0 c5t0Var = this.f111794e;
        return j + (c5t0Var.f79416a == 1.0f ? ggw0.m126049F(jElapsedRealtime) : c5t0Var.m105357a(jElapsedRealtime));
    }

    @Override // p149l.e1y0
    public final c5t0 zzc() {
        return this.f111794e;
    }

    @Override // p149l.e1y0
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
