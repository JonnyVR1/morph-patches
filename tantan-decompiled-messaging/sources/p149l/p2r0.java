package p149l;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class p2r0 {

    /* JADX INFO: renamed from: a */
    public final y1r0 f146911a = new y1r0();

    /* JADX INFO: renamed from: b */
    @Nullable
    public final l2r0 f146912b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final o2r0 f146913c;

    /* JADX INFO: renamed from: d */
    public boolean f146914d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Surface f146915e;

    /* JADX INFO: renamed from: f */
    public float f146916f;

    /* JADX INFO: renamed from: g */
    public float f146917g;

    /* JADX INFO: renamed from: h */
    public float f146918h;

    /* JADX INFO: renamed from: i */
    public float f146919i;

    /* JADX INFO: renamed from: j */
    public int f146920j;

    /* JADX INFO: renamed from: k */
    public long f146921k;

    /* JADX INFO: renamed from: l */
    public long f146922l;

    /* JADX INFO: renamed from: m */
    public long f146923m;

    /* JADX INFO: renamed from: n */
    public long f146924n;

    /* JADX INFO: renamed from: o */
    public long f146925o;

    /* JADX INFO: renamed from: p */
    public long f146926p;

    /* JADX INFO: renamed from: q */
    public long f146927q;

    public p2r0(@Nullable Context context) {
        l2r0 l2r0VarM157677b;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = ggw0.f102568a;
            l2r0VarM157677b = n2r0.m157677b(applicationContext);
            if (l2r0VarM157677b == null) {
                l2r0VarM157677b = m2r0.m152702b(applicationContext);
            }
        } else {
            l2r0VarM157677b = null;
        }
        this.f146912b = l2r0VarM157677b;
        this.f146913c = l2r0VarM157677b != null ? o2r0.m162318a() : null;
        this.f146921k = -9223372036854775807L;
        this.f146922l = -9223372036854775807L;
        this.f146916f = -1.0f;
        this.f146919i = 1.0f;
        this.f146920j = 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m167208b(p2r0 p2r0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            p2r0Var.f146921k = refreshRate;
            p2r0Var.f146922l = (refreshRate * 80) / 100;
        } else {
            svv0.m186111f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            p2r0Var.f146921k = -9223372036854775807L;
            p2r0Var.f146922l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m167209a(long j) {
        long j2;
        if (this.f146926p != -1 && this.f146911a.m212267g()) {
            long jM212263c = this.f146927q + ((long) ((this.f146911a.m212263c() * (this.f146923m - this.f146926p)) / this.f146919i));
            if (Math.abs(j - jM212263c) > 20000000) {
                m167219l();
            } else {
                j = jM212263c;
            }
        }
        this.f146924n = this.f146923m;
        this.f146925o = j;
        o2r0 o2r0Var = this.f146913c;
        if (o2r0Var != null && this.f146921k != -9223372036854775807L) {
            long j3 = o2r0Var.f141547a;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f146921k;
                long j5 = j3 + (((j - j3) / j4) * j4);
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    long j6 = j4 + j5;
                    j2 = j5;
                    j5 = j6;
                }
                long j7 = this.f146922l;
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - j7;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public final void m167210c(float f) {
        this.f146916f = f;
        this.f146911a.m212266f();
        m167220m();
    }

    /* JADX INFO: renamed from: d */
    public final void m167211d(long j) {
        long j2 = this.f146924n;
        if (j2 != -1) {
            this.f146926p = j2;
            this.f146927q = this.f146925o;
        }
        this.f146923m++;
        this.f146911a.m212265e(j * 1000);
        m167220m();
    }

    /* JADX INFO: renamed from: e */
    public final void m167212e(float f) {
        this.f146919i = f;
        m167219l();
        m167221n(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m167213f() {
        m167219l();
    }

    /* JADX INFO: renamed from: g */
    public final void m167214g() {
        this.f146914d = true;
        m167219l();
        if (this.f146912b != null) {
            o2r0 o2r0Var = this.f146913c;
            o2r0Var.getClass();
            o2r0Var.m162319b();
            this.f146912b.mo148295a(new i2r0(this));
        }
        m167221n(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m167215h() {
        this.f146914d = false;
        l2r0 l2r0Var = this.f146912b;
        if (l2r0Var != null) {
            l2r0Var.zza();
            o2r0 o2r0Var = this.f146913c;
            o2r0Var.getClass();
            o2r0Var.m162320c();
        }
        m167218k();
    }

    /* JADX INFO: renamed from: i */
    public final void m167216i(@Nullable Surface surface) {
        int i = ggw0.f102568a;
        boolean zM139492a = j2r0.m139492a(surface);
        Surface surface2 = this.f146915e;
        if (true == zM139492a) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        m167218k();
        this.f146915e = surface;
        m167221n(true);
    }

    /* JADX INFO: renamed from: j */
    public final void m167217j(int i) {
        if (this.f146920j == i) {
            return;
        }
        this.f146920j = i;
        m167221n(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m167218k() {
        Surface surface;
        if (ggw0.f102568a < 30 || (surface = this.f146915e) == null || this.f146920j == Integer.MIN_VALUE || this.f146918h == 0.0f) {
            return;
        }
        this.f146918h = 0.0f;
        k2r0.m144338a(surface, 0.0f);
    }

    /* JADX INFO: renamed from: l */
    public final void m167219l() {
        this.f146923m = 0L;
        this.f146926p = -1L;
        this.f146924n = -1L;
    }

    /* JADX INFO: renamed from: m */
    public final void m167220m() {
        if (ggw0.f102568a < 30 || this.f146915e == null) {
            return;
        }
        float fM212261a = this.f146911a.m212267g() ? this.f146911a.m212261a() : this.f146916f;
        float f = this.f146917g;
        if (fM212261a != f) {
            if (fM212261a != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.f146911a.m212267g() && this.f146911a.m212264d() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if (Math.abs(fM212261a - this.f146917g) < f2) {
                    return;
                }
            } else if (fM212261a == -1.0f && this.f146911a.m212262b() < 30) {
                return;
            }
            this.f146917g = fM212261a;
            m167221n(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m167221n(boolean z) {
        Surface surface;
        if (ggw0.f102568a < 30 || (surface = this.f146915e) == null || this.f146920j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.f146914d) {
            float f2 = this.f146917g;
            if (f2 != -1.0f) {
                f = this.f146919i * f2;
            }
        }
        if (z || this.f146918h != f) {
            this.f146918h = f;
            k2r0.m144338a(surface, f);
        }
    }
}
