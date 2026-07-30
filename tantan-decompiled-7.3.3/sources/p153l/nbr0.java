package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;

/* JADX INFO: loaded from: classes6.dex */
public final class nbr0 {

    /* JADX INFO: renamed from: a */
    public final mbr0 f141246a;

    /* JADX INFO: renamed from: b */
    public final vbr0 f141247b;

    /* JADX INFO: renamed from: c */
    public boolean f141248c;

    /* JADX INFO: renamed from: f */
    public long f141251f;

    /* JADX INFO: renamed from: d */
    public int f141249d = 0;

    /* JADX INFO: renamed from: e */
    public long f141250e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f141252g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f141253h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public float f141254i = 1.0f;

    /* JADX INFO: renamed from: j */
    public mfv0 f141255j = mfv0.f136676a;

    public nbr0(Context context, mbr0 mbr0Var, long j) {
        this.f141246a = mbr0Var;
        this.f141247b = new vbr0(context);
    }

    /* JADX INFO: renamed from: a */
    public final int m162173a(long j, long j2, long j3, long j4, boolean z, lbr0 lbr0Var) throws zziz {
        boolean z2;
        lbr0.m153592g(lbr0Var);
        if (this.f141250e == -9223372036854775807L) {
            this.f141250e = j2;
        }
        if (this.f141252g != j) {
            this.f141247b.m200732d(j);
            this.f141252g = j;
        }
        long jM159393F = (long) ((j - j2) / ((double) this.f141254i));
        if (this.f141248c) {
            jM159393F -= mpw0.m159393F(SystemClock.elapsedRealtime()) - j3;
        }
        lbr0Var.f131224a = jM159393F;
        long j5 = lbr0Var.f131224a;
        if (this.f141253h != -9223372036854775807L) {
            z2 = false;
        } else {
            int i = this.f141249d;
            if (i == 0) {
                z2 = false;
                if (this.f141248c) {
                    return 0;
                }
            } else {
                if (i == 1) {
                    return 0;
                }
                if (i == 2) {
                    z2 = false;
                    if (j2 >= j4) {
                        return 0;
                    }
                } else {
                    if (i != 3) {
                        wpg0.m207458a();
                        return 0;
                    }
                    z2 = false;
                    long jM159393F2 = mpw0.m159393F(SystemClock.elapsedRealtime()) - this.f141251f;
                    if (this.f141248c && this.f141246a.mo134395i(j5, jM159393F2)) {
                        return 0;
                    }
                }
            }
        }
        if (!this.f141248c || j2 == this.f141250e) {
            return 5;
        }
        vbr0 vbr0Var = this.f141247b;
        long jNanoTime = System.nanoTime();
        lbr0Var.f131225b = vbr0Var.m200730a((lbr0Var.f131224a * 1000) + jNanoTime);
        lbr0Var.f131224a = (lbr0Var.f131225b - jNanoTime) / 1000;
        boolean z3 = this.f141253h != -9223372036854775807L ? true : z2;
        if (this.f141246a.mo134396j(lbr0Var.f131224a, j2, j3, z, z3)) {
            return 4;
        }
        if (this.f141246a.mo134405x(lbr0Var.f131224a, j3, z)) {
            return z3 ? 3 : 2;
        }
        return lbr0Var.f131224a > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m162174b() {
        if (this.f141249d == 0) {
            this.f141249d = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m162175c() {
        this.f141253h = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final void m162176d() {
        m162189q(0);
    }

    /* JADX INFO: renamed from: e */
    public final void m162177e(boolean z) {
        this.f141249d = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m162178f() {
        m162189q(2);
    }

    /* JADX INFO: renamed from: g */
    public final void m162179g() {
        this.f141248c = true;
        this.f141251f = mpw0.m159393F(SystemClock.elapsedRealtime());
        this.f141247b.m200735g();
    }

    /* JADX INFO: renamed from: h */
    public final void m162180h() {
        this.f141248c = false;
        this.f141253h = -9223372036854775807L;
        this.f141247b.m200736h();
    }

    /* JADX INFO: renamed from: i */
    public final void m162181i() {
        this.f141247b.m200734f();
        this.f141252g = -9223372036854775807L;
        this.f141250e = -9223372036854775807L;
        m162189q(1);
        this.f141253h = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: j */
    public final void m162182j(int i) {
        this.f141247b.m200738j(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m162183k(mfv0 mfv0Var) {
        this.f141255j = mfv0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m162184l(float f) {
        this.f141247b.m200731c(f);
    }

    /* JADX INFO: renamed from: m */
    public final void m162185m(@Nullable Surface surface) {
        this.f141247b.m200737i(surface);
        m162189q(1);
    }

    /* JADX INFO: renamed from: n */
    public final void m162186n(float f) {
        this.f141254i = f;
        this.f141247b.m200733e(f);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m162187o(boolean z) {
        boolean z2 = true;
        if (z && this.f141249d == 3) {
            this.f141253h = -9223372036854775807L;
        } else {
            if (this.f141253h == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.f141253h) {
                z2 = false;
                this.f141253h = -9223372036854775807L;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m162188p() {
        int i = this.f141249d;
        this.f141249d = 3;
        this.f141251f = mpw0.m159393F(SystemClock.elapsedRealtime());
        return i != 3;
    }

    /* JADX INFO: renamed from: q */
    public final void m162189q(int i) {
        this.f141249d = Math.min(this.f141249d, i);
    }
}
