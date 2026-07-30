package p153l;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class qht0 implements q9y0 {

    /* JADX INFO: renamed from: a */
    public final c6z0 f157756a = new c6z0(true, 65536);

    /* JADX INFO: renamed from: b */
    public long f157757b = 15000000;

    /* JADX INFO: renamed from: c */
    public long f157758c = 30000000;

    /* JADX INFO: renamed from: d */
    public long f157759d = 2500000;

    /* JADX INFO: renamed from: e */
    public long f157760e = 5000000;

    /* JADX INFO: renamed from: f */
    public int f157761f;

    /* JADX INFO: renamed from: g */
    public boolean f157762g;

    @Override // p153l.q9y0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo160708a(d0u0 d0u0Var, kzy0 kzy0Var, vey0[] vey0VarArr, q2z0 q2z0Var, n5z0[] n5z0VarArr) {
        int i = 0;
        this.f157761f = 0;
        while (true) {
            int length = vey0VarArr.length;
            if (i >= 2) {
                this.f157756a.m108199f(this.f157761f);
                return;
            } else {
                if (n5z0VarArr[i] != null) {
                    this.f157761f += vey0VarArr[i].mo97570c() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // p153l.q9y0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo160709b(d0u0 d0u0Var, kzy0 kzy0Var, long j, float f, boolean z, long j2) {
        long j3 = z ? this.f157760e : this.f157759d;
        return j3 <= 0 || j >= j3;
    }

    @Override // p153l.q9y0
    /* JADX INFO: renamed from: c */
    public final boolean mo160710c(long j, long j2, float f) {
        char c;
        boolean z = true;
        if (j2 > this.f157758c) {
            c = 0;
        } else {
            c = j2 < this.f157757b ? (char) 2 : (char) 1;
        }
        int iM108194a = this.f157756a.m108194a();
        int i = this.f157761f;
        if (c != 2 && (c != 1 || !this.f157762g || iM108194a >= i)) {
            z = false;
        }
        this.f157762g = z;
        return z;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m176616d(boolean z) {
        this.f157761f = 0;
        this.f157762g = false;
        if (z) {
            this.f157756a.m108198e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m176617e(int i) {
        this.f157759d = ((long) i) * 1000;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m176618f(int i) {
        this.f157760e = ((long) i) * 1000;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m176619g(int i) {
        this.f157758c = ((long) i) * 1000;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m176620h(int i) {
        this.f157757b = ((long) i) * 1000;
    }

    @Override // p153l.q9y0
    public final long zza() {
        return 0L;
    }

    @Override // p153l.q9y0
    public final void zzb() {
        m176616d(false);
    }

    @Override // p153l.q9y0
    public final void zzc() {
        m176616d(true);
    }

    @Override // p153l.q9y0
    public final void zzd() {
        m176616d(true);
    }

    @Override // p153l.q9y0
    public final boolean zzf() {
        return false;
    }

    @Override // p153l.q9y0
    public final c6z0 zzi() {
        return this.f157756a;
    }
}
