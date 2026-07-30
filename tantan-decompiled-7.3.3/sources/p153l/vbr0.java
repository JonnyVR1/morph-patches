package p153l;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class vbr0 {

    /* JADX INFO: renamed from: a */
    public final ebr0 f183274a = new ebr0();

    /* JADX INFO: renamed from: b */
    @Nullable
    public final rbr0 f183275b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final ubr0 f183276c;

    /* JADX INFO: renamed from: d */
    public boolean f183277d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Surface f183278e;

    /* JADX INFO: renamed from: f */
    public float f183279f;

    /* JADX INFO: renamed from: g */
    public float f183280g;

    /* JADX INFO: renamed from: h */
    public float f183281h;

    /* JADX INFO: renamed from: i */
    public float f183282i;

    /* JADX INFO: renamed from: j */
    public int f183283j;

    /* JADX INFO: renamed from: k */
    public long f183284k;

    /* JADX INFO: renamed from: l */
    public long f183285l;

    /* JADX INFO: renamed from: m */
    public long f183286m;

    /* JADX INFO: renamed from: n */
    public long f183287n;

    /* JADX INFO: renamed from: o */
    public long f183288o;

    /* JADX INFO: renamed from: p */
    public long f183289p;

    /* JADX INFO: renamed from: q */
    public long f183290q;

    public vbr0(@Nullable Context context) {
        rbr0 rbr0VarM190069b;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = mpw0.f137957a;
            rbr0VarM190069b = tbr0.m190069b(applicationContext);
            if (rbr0VarM190069b == null) {
                rbr0VarM190069b = sbr0.m185331b(applicationContext);
            }
        } else {
            rbr0VarM190069b = null;
        }
        this.f183275b = rbr0VarM190069b;
        this.f183276c = rbr0VarM190069b != null ? ubr0.m195292a() : null;
        this.f183284k = -9223372036854775807L;
        this.f183285l = -9223372036854775807L;
        this.f183279f = -1.0f;
        this.f183282i = 1.0f;
        this.f183283j = 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m200729b(vbr0 vbr0Var, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            vbr0Var.f183284k = refreshRate;
            vbr0Var.f183285l = (refreshRate * 80) / 100;
        } else {
            y4w0.m214278f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            vbr0Var.f183284k = -9223372036854775807L;
            vbr0Var.f183285l = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m200730a(long j) {
        long j2;
        if (this.f183289p != -1 && this.f183274a.m120215g()) {
            long jM120211c = this.f183290q + ((long) ((this.f183274a.m120211c() * (this.f183286m - this.f183289p)) / this.f183282i));
            if (Math.abs(j - jM120211c) > 20000000) {
                m200740l();
            } else {
                j = jM120211c;
            }
        }
        this.f183287n = this.f183286m;
        this.f183288o = j;
        ubr0 ubr0Var = this.f183276c;
        if (ubr0Var != null && this.f183284k != -9223372036854775807L) {
            long j3 = ubr0Var.f178350a;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f183284k;
                long j5 = j3 + (((j - j3) / j4) * j4);
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    long j6 = j4 + j5;
                    j2 = j5;
                    j5 = j6;
                }
                long j7 = this.f183285l;
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - j7;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public final void m200731c(float f) {
        this.f183279f = f;
        this.f183274a.m120214f();
        m200741m();
    }

    /* JADX INFO: renamed from: d */
    public final void m200732d(long j) {
        long j2 = this.f183287n;
        if (j2 != -1) {
            this.f183289p = j2;
            this.f183290q = this.f183288o;
        }
        this.f183286m++;
        this.f183274a.m120213e(j * 1000);
        m200741m();
    }

    /* JADX INFO: renamed from: e */
    public final void m200733e(float f) {
        this.f183282i = f;
        m200740l();
        m200742n(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m200734f() {
        m200740l();
    }

    /* JADX INFO: renamed from: g */
    public final void m200735g() {
        this.f183277d = true;
        m200740l();
        if (this.f183275b != null) {
            ubr0 ubr0Var = this.f183276c;
            ubr0Var.getClass();
            ubr0Var.m195293b();
            this.f183275b.mo180758a(new obr0(this));
        }
        m200742n(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m200736h() {
        this.f183277d = false;
        rbr0 rbr0Var = this.f183275b;
        if (rbr0Var != null) {
            rbr0Var.zza();
            ubr0 ubr0Var = this.f183276c;
            ubr0Var.getClass();
            ubr0Var.m195294c();
        }
        m200739k();
    }

    /* JADX INFO: renamed from: i */
    public final void m200737i(@Nullable Surface surface) {
        int i = mpw0.f137957a;
        boolean zM171528a = pbr0.m171528a(surface);
        Surface surface2 = this.f183278e;
        if (true == zM171528a) {
            surface = null;
        }
        if (surface2 == surface) {
            return;
        }
        m200739k();
        this.f183278e = surface;
        m200742n(true);
    }

    /* JADX INFO: renamed from: j */
    public final void m200738j(int i) {
        if (this.f183283j == i) {
            return;
        }
        this.f183283j = i;
        m200742n(true);
    }

    /* JADX INFO: renamed from: k */
    public final void m200739k() {
        Surface surface;
        if (mpw0.f137957a < 30 || (surface = this.f183278e) == null || this.f183283j == Integer.MIN_VALUE || this.f183281h == 0.0f) {
            return;
        }
        this.f183281h = 0.0f;
        qbr0.m176067a(surface, 0.0f);
    }

    /* JADX INFO: renamed from: l */
    public final void m200740l() {
        this.f183286m = 0L;
        this.f183289p = -1L;
        this.f183287n = -1L;
    }

    /* JADX INFO: renamed from: m */
    public final void m200741m() {
        if (mpw0.f137957a < 30 || this.f183278e == null) {
            return;
        }
        float fM120209a = this.f183274a.m120215g() ? this.f183274a.m120209a() : this.f183279f;
        float f = this.f183280g;
        if (fM120209a != f) {
            if (fM120209a != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.f183274a.m120215g() && this.f183274a.m120212d() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if (Math.abs(fM120209a - this.f183280g) < f2) {
                    return;
                }
            } else if (fM120209a == -1.0f && this.f183274a.m120210b() < 30) {
                return;
            }
            this.f183280g = fM120209a;
            m200742n(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m200742n(boolean z) {
        Surface surface;
        if (mpw0.f137957a < 30 || (surface = this.f183278e) == null || this.f183283j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.f183277d) {
            float f2 = this.f183280g;
            if (f2 != -1.0f) {
                f = this.f183282i * f2;
            }
        }
        if (z || this.f183281h != f) {
            this.f183281h = f;
            qbr0.m176067a(surface, f);
        }
    }
}
