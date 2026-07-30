package p149l;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes6.dex */
public final class k8t0 implements k0y0 {

    /* JADX INFO: renamed from: a */
    public final wwy0 f121856a = new wwy0(true, 65536);

    /* JADX INFO: renamed from: b */
    public long f121857b = 15000000;

    /* JADX INFO: renamed from: c */
    public long f121858c = 30000000;

    /* JADX INFO: renamed from: d */
    public long f121859d = 2500000;

    /* JADX INFO: renamed from: e */
    public long f121860e = 5000000;

    /* JADX INFO: renamed from: f */
    public int f121861f;

    /* JADX INFO: renamed from: g */
    public boolean f121862g;

    @Override // p149l.k0y0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo127307a(xqt0 xqt0Var, eqy0 eqy0Var, p5y0[] p5y0VarArr, kty0 kty0Var, hwy0[] hwy0VarArr) {
        int i = 0;
        this.f121861f = 0;
        while (true) {
            int length = p5y0VarArr.length;
            if (i >= 2) {
                this.f121856a.m205893f(this.f121861f);
                return;
            } else {
                if (hwy0VarArr[i] != null) {
                    this.f121861f += p5y0VarArr[i].mo146606c() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // p149l.k0y0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo127308b(xqt0 xqt0Var, eqy0 eqy0Var, long j, float f, boolean z, long j2) {
        long j3 = z ? this.f121860e : this.f121859d;
        return j3 <= 0 || j >= j3;
    }

    @Override // p149l.k0y0
    /* JADX INFO: renamed from: c */
    public final boolean mo127309c(long j, long j2, float f) {
        char c;
        boolean z = true;
        if (j2 > this.f121858c) {
            c = 0;
        } else {
            c = j2 < this.f121857b ? (char) 2 : (char) 1;
        }
        int iM205888a = this.f121856a.m205888a();
        int i = this.f121861f;
        if (c != 2 && (c != 1 || !this.f121862g || iM205888a >= i)) {
            z = false;
        }
        this.f121862g = z;
        return z;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m144972d(boolean z) {
        this.f121861f = 0;
        this.f121862g = false;
        if (z) {
            this.f121856a.m205892e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m144973e(int i) {
        this.f121859d = ((long) i) * 1000;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m144974f(int i) {
        this.f121860e = ((long) i) * 1000;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m144975g(int i) {
        this.f121858c = ((long) i) * 1000;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m144976h(int i) {
        this.f121857b = ((long) i) * 1000;
    }

    @Override // p149l.k0y0
    public final long zza() {
        return 0L;
    }

    @Override // p149l.k0y0
    public final void zzb() {
        m144972d(false);
    }

    @Override // p149l.k0y0
    public final void zzc() {
        m144972d(true);
    }

    @Override // p149l.k0y0
    public final void zzd() {
        m144972d(true);
    }

    @Override // p149l.k0y0
    public final boolean zzf() {
        return false;
    }

    @Override // p149l.k0y0
    public final wwy0 zzi() {
        return this.f121856a;
    }
}
