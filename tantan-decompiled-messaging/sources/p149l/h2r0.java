package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zziz;

/* JADX INFO: loaded from: classes6.dex */
public final class h2r0 {

    /* JADX INFO: renamed from: a */
    public final g2r0 f105552a;

    /* JADX INFO: renamed from: b */
    public final p2r0 f105553b;

    /* JADX INFO: renamed from: c */
    public boolean f105554c;

    /* JADX INFO: renamed from: f */
    public long f105557f;

    /* JADX INFO: renamed from: d */
    public int f105555d = 0;

    /* JADX INFO: renamed from: e */
    public long f105556e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f105558g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f105559h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public float f105560i = 1.0f;

    /* JADX INFO: renamed from: j */
    public g6v0 f105561j = g6v0.f101315a;

    public h2r0(Context context, g2r0 g2r0Var, long j) {
        this.f105552a = g2r0Var;
        this.f105553b = new p2r0(context);
    }

    /* JADX INFO: renamed from: a */
    public final int m129126a(long j, long j2, long j3, long j4, boolean z, f2r0 f2r0Var) throws zziz {
        boolean z2;
        f2r0.m119235g(f2r0Var);
        if (this.f105556e == -9223372036854775807L) {
            this.f105556e = j2;
        }
        if (this.f105558g != j) {
            this.f105553b.m167211d(j);
            this.f105558g = j;
        }
        long jM126049F = (long) ((j - j2) / ((double) this.f105560i));
        if (this.f105554c) {
            jM126049F -= ggw0.m126049F(SystemClock.elapsedRealtime()) - j3;
        }
        f2r0Var.f94231a = jM126049F;
        long j5 = f2r0Var.f94231a;
        if (this.f105559h != -9223372036854775807L) {
            z2 = false;
        } else {
            int i = this.f105555d;
            if (i == 0) {
                z2 = false;
                if (this.f105554c) {
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
                        ohg0.m164364a();
                        return 0;
                    }
                    z2 = false;
                    long jM126049F2 = ggw0.m126049F(SystemClock.elapsedRealtime()) - this.f105557f;
                    if (this.f105554c && this.f105552a.mo100006i(j5, jM126049F2)) {
                        return 0;
                    }
                }
            }
        }
        if (!this.f105554c || j2 == this.f105556e) {
            return 5;
        }
        p2r0 p2r0Var = this.f105553b;
        long jNanoTime = System.nanoTime();
        f2r0Var.f94232b = p2r0Var.m167209a((f2r0Var.f94231a * 1000) + jNanoTime);
        f2r0Var.f94231a = (f2r0Var.f94232b - jNanoTime) / 1000;
        boolean z3 = this.f105559h != -9223372036854775807L ? true : z2;
        if (this.f105552a.mo100007j(f2r0Var.f94231a, j2, j3, z, z3)) {
            return 4;
        }
        if (this.f105552a.mo100016x(f2r0Var.f94231a, j3, z)) {
            return z3 ? 3 : 2;
        }
        return f2r0Var.f94231a > 50000 ? 5 : 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m129127b() {
        if (this.f105555d == 0) {
            this.f105555d = 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m129128c() {
        this.f105559h = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: d */
    public final void m129129d() {
        m129142q(0);
    }

    /* JADX INFO: renamed from: e */
    public final void m129130e(boolean z) {
        this.f105555d = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m129131f() {
        m129142q(2);
    }

    /* JADX INFO: renamed from: g */
    public final void m129132g() {
        this.f105554c = true;
        this.f105557f = ggw0.m126049F(SystemClock.elapsedRealtime());
        this.f105553b.m167214g();
    }

    /* JADX INFO: renamed from: h */
    public final void m129133h() {
        this.f105554c = false;
        this.f105559h = -9223372036854775807L;
        this.f105553b.m167215h();
    }

    /* JADX INFO: renamed from: i */
    public final void m129134i() {
        this.f105553b.m167213f();
        this.f105558g = -9223372036854775807L;
        this.f105556e = -9223372036854775807L;
        m129142q(1);
        this.f105559h = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: j */
    public final void m129135j(int i) {
        this.f105553b.m167217j(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m129136k(g6v0 g6v0Var) {
        this.f105561j = g6v0Var;
    }

    /* JADX INFO: renamed from: l */
    public final void m129137l(float f) {
        this.f105553b.m167210c(f);
    }

    /* JADX INFO: renamed from: m */
    public final void m129138m(@Nullable Surface surface) {
        this.f105553b.m167216i(surface);
        m129142q(1);
    }

    /* JADX INFO: renamed from: n */
    public final void m129139n(float f) {
        this.f105560i = f;
        this.f105553b.m167212e(f);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m129140o(boolean z) {
        boolean z2 = true;
        if (z && this.f105555d == 3) {
            this.f105559h = -9223372036854775807L;
        } else {
            if (this.f105559h == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.f105559h) {
                z2 = false;
                this.f105559h = -9223372036854775807L;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m129141p() {
        int i = this.f105555d;
        this.f105555d = 3;
        this.f105557f = ggw0.m126049F(SystemClock.elapsedRealtime());
        return i != 3;
    }

    /* JADX INFO: renamed from: q */
    public final void m129142q(int i) {
        this.f105555d = Math.min(this.f105555d, i);
    }
}
