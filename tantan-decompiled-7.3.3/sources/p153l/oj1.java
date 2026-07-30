package p153l;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class oj1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f147598r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c */
    public final View f147601c;

    /* JADX INFO: renamed from: d */
    public Runnable f147602d;

    /* JADX INFO: renamed from: g */
    public int f147605g;

    /* JADX INFO: renamed from: h */
    public int f147606h;

    /* JADX INFO: renamed from: l */
    public boolean f147610l;

    /* JADX INFO: renamed from: m */
    public boolean f147611m;

    /* JADX INFO: renamed from: n */
    public boolean f147612n;

    /* JADX INFO: renamed from: o */
    public boolean f147613o;

    /* JADX INFO: renamed from: p */
    public boolean f147614p;

    /* JADX INFO: renamed from: q */
    public boolean f147615q;

    /* JADX INFO: renamed from: a */
    public final C19148a f147599a = new C19148a();

    /* JADX INFO: renamed from: b */
    public final Interpolator f147600b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public float[] f147603e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f */
    public float[] f147604f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i */
    public float[] f147607i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    public float[] f147608j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    public float[] f147609k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: l.oj1$a */
    public static class C19148a {

        /* JADX INFO: renamed from: a */
        public int f147616a;

        /* JADX INFO: renamed from: b */
        public int f147617b;

        /* JADX INFO: renamed from: c */
        public float f147618c;

        /* JADX INFO: renamed from: d */
        public float f147619d;

        /* JADX INFO: renamed from: j */
        public float f147625j;

        /* JADX INFO: renamed from: k */
        public int f147626k;

        /* JADX INFO: renamed from: e */
        public long f147620e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        public long f147624i = -1;

        /* JADX INFO: renamed from: f */
        public long f147621f = 0;

        /* JADX INFO: renamed from: g */
        public int f147622g = 0;

        /* JADX INFO: renamed from: h */
        public int f147623h = 0;

        /* JADX INFO: renamed from: a */
        public void m167827a() {
            if (this.f147621f == 0) {
                azk0.m101074a("Cannot compute scroll delta before calling start()");
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM167833g = m167833g(m167831e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f147621f;
            this.f147621f = jCurrentAnimationTimeMillis;
            float f = j * fM167833g;
            this.f147622g = (int) (this.f147618c * f);
            this.f147623h = (int) (f * this.f147619d);
        }

        /* JADX INFO: renamed from: b */
        public int m167828b() {
            return this.f147622g;
        }

        /* JADX INFO: renamed from: c */
        public int m167829c() {
            return this.f147623h;
        }

        /* JADX INFO: renamed from: d */
        public int m167830d() {
            float f = this.f147618c;
            return (int) (f / Math.abs(f));
        }

        /* JADX INFO: renamed from: e */
        public final float m167831e(long j) {
            long j2 = this.f147620e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f147624i;
            if (j3 < 0 || j < j3) {
                return oj1.m167808e((j - j2) / this.f147616a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f147625j;
            return (1.0f - f) + (f * oj1.m167808e((j - j3) / this.f147626k, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: f */
        public int m167832f() {
            float f = this.f147619d;
            return (int) (f / Math.abs(f));
        }

        /* JADX INFO: renamed from: g */
        public final float m167833g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* JADX INFO: renamed from: h */
        public boolean m167834h() {
            return this.f147624i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f147624i + ((long) this.f147626k);
        }

        /* JADX INFO: renamed from: i */
        public void m167835i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f147626k = oj1.m167809f((int) (jCurrentAnimationTimeMillis - this.f147620e), 0, this.f147617b);
            this.f147625j = m167831e(jCurrentAnimationTimeMillis);
            this.f147624i = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: j */
        public void m167836j(int i) {
            this.f147617b = i;
        }

        /* JADX INFO: renamed from: k */
        public void m167837k(int i) {
            this.f147616a = i;
        }

        /* JADX INFO: renamed from: l */
        public void m167838l(float f, float f2) {
            this.f147618c = f;
            this.f147619d = f2;
        }

        /* JADX INFO: renamed from: m */
        public void m167839m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f147620e = jCurrentAnimationTimeMillis;
            this.f147624i = -1L;
            this.f147621f = jCurrentAnimationTimeMillis;
            this.f147625j = 0.5f;
            this.f147622g = 0;
            this.f147623h = 0;
        }
    }

    /* JADX INFO: renamed from: l.oj1$b */
    public class RunnableC19149b implements Runnable {
        public RunnableC19149b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oj1 oj1Var = oj1.this;
            if (oj1Var.f147613o) {
                if (oj1Var.f147611m) {
                    oj1Var.f147611m = false;
                    oj1Var.f147599a.m167839m();
                }
                C19148a c19148a = oj1.this.f147599a;
                if (c19148a.m167834h() || !oj1.this.m167825u()) {
                    oj1.this.f147613o = false;
                    return;
                }
                oj1 oj1Var2 = oj1.this;
                if (oj1Var2.f147612n) {
                    oj1Var2.f147612n = false;
                    oj1Var2.m167810c();
                }
                c19148a.m167827a();
                oj1.this.mo126719j(c19148a.m167828b(), c19148a.m167829c());
                kkl0.m150148b0(oj1.this.f147601c, this);
            }
        }
    }

    public oj1(@NonNull View view) {
        this.f147601c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m167819o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m167820p(f3, f3);
        m167816l(1);
        m167818n(Float.MAX_VALUE, Float.MAX_VALUE);
        m167823s(0.2f, 0.2f);
        m167824t(1.0f, 1.0f);
        m167815k(f147598r);
        m167822r(500);
        m167821q(500);
    }

    /* JADX INFO: renamed from: e */
    public static float m167808e(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: f */
    public static int m167809f(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo126717a(int i);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo126718b(int i);

    /* JADX INFO: renamed from: c */
    public void m167810c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f147601c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final float m167811d(int i, float f, float f2, float f3) {
        float fM167813h = m167813h(this.f147603e[i], f2, this.f147604f[i], f);
        if (fM167813h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f147607i[i];
        float f5 = this.f147608j[i];
        float f6 = this.f147609k[i];
        float f7 = f4 * f3;
        return fM167813h > 0.0f ? m167808e(fM167813h * f7, f5, f6) : -m167808e((-fM167813h) * f7, f5, f6);
    }

    /* JADX INFO: renamed from: g */
    public final float m167812g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f147605g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f147613o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final float m167813h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fM167808e = m167808e(f * f2, 0.0f, f3);
        float fM167812g = m167812g(f2 - f4, fM167808e) - m167812g(f4, fM167808e);
        if (fM167812g < 0.0f) {
            interpolation = -this.f147600b.getInterpolation(-fM167812g);
        } else {
            if (fM167812g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f147600b.getInterpolation(fM167812g);
        }
        return m167808e(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m167814i() {
        if (this.f147611m) {
            this.f147613o = false;
        } else {
            this.f147599a.m167835i();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo126719j(int i, int i2);

    @NonNull
    /* JADX INFO: renamed from: k */
    public oj1 m167815k(int i) {
        this.f147606h = i;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public oj1 m167816l(int i) {
        this.f147605g = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public oj1 m167817m(boolean z) {
        if (this.f147614p && !z) {
            m167814i();
        }
        this.f147614p = z;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public oj1 m167818n(float f, float f2) {
        float[] fArr = this.f147604f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public oj1 m167819o(float f, float f2) {
        float[] fArr = this.f147609k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f147614p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m167814i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m167814i();
                }
            }
            return !this.f147615q && this.f147613o;
        }
        this.f147612n = true;
        this.f147610l = false;
        this.f147599a.m167838l(m167811d(0, motionEvent.getX(), view.getWidth(), this.f147601c.getWidth()), m167811d(1, motionEvent.getY(), view.getHeight(), this.f147601c.getHeight()));
        if (!this.f147613o && m167825u()) {
            m167826v();
        }
        if (this.f147615q) {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public oj1 m167820p(float f, float f2) {
        float[] fArr = this.f147608j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public oj1 m167821q(int i) {
        this.f147599a.m167836j(i);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public oj1 m167822r(int i) {
        this.f147599a.m167837k(i);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public oj1 m167823s(float f, float f2) {
        float[] fArr = this.f147603e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public oj1 m167824t(float f, float f2) {
        float[] fArr = this.f147607i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public boolean m167825u() {
        C19148a c19148a = this.f147599a;
        int iM167832f = c19148a.m167832f();
        int iM167830d = c19148a.m167830d();
        if (iM167832f == 0 || !mo126718b(iM167832f)) {
            return iM167830d != 0 && mo126717a(iM167830d);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m167826v() {
        int i;
        if (this.f147602d == null) {
            this.f147602d = new RunnableC19149b();
        }
        this.f147613o = true;
        this.f147611m = true;
        if (this.f147610l || (i = this.f147606h) <= 0) {
            this.f147602d.run();
        } else {
            kkl0.m150150c0(this.f147601c, this.f147602d, i);
        }
        this.f147610l = true;
    }
}
