package p149l;

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
public abstract class hj1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f107993r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c */
    public final View f107996c;

    /* JADX INFO: renamed from: d */
    public Runnable f107997d;

    /* JADX INFO: renamed from: g */
    public int f108000g;

    /* JADX INFO: renamed from: h */
    public int f108001h;

    /* JADX INFO: renamed from: l */
    public boolean f108005l;

    /* JADX INFO: renamed from: m */
    public boolean f108006m;

    /* JADX INFO: renamed from: n */
    public boolean f108007n;

    /* JADX INFO: renamed from: o */
    public boolean f108008o;

    /* JADX INFO: renamed from: p */
    public boolean f108009p;

    /* JADX INFO: renamed from: q */
    public boolean f108010q;

    /* JADX INFO: renamed from: a */
    public final C17329a f107994a = new C17329a();

    /* JADX INFO: renamed from: b */
    public final Interpolator f107995b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public float[] f107998e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f */
    public float[] f107999f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i */
    public float[] f108002i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    public float[] f108003j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    public float[] f108004k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: l.hj1$a */
    public static class C17329a {

        /* JADX INFO: renamed from: a */
        public int f108011a;

        /* JADX INFO: renamed from: b */
        public int f108012b;

        /* JADX INFO: renamed from: c */
        public float f108013c;

        /* JADX INFO: renamed from: d */
        public float f108014d;

        /* JADX INFO: renamed from: j */
        public float f108020j;

        /* JADX INFO: renamed from: k */
        public int f108021k;

        /* JADX INFO: renamed from: e */
        public long f108015e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        public long f108019i = -1;

        /* JADX INFO: renamed from: f */
        public long f108016f = 0;

        /* JADX INFO: renamed from: g */
        public int f108017g = 0;

        /* JADX INFO: renamed from: h */
        public int f108018h = 0;

        /* JADX INFO: renamed from: a */
        public void m131339a() {
            if (this.f108016f == 0) {
                upk0.m194883a("Cannot compute scroll delta before calling start()");
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM131345g = m131345g(m131343e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f108016f;
            this.f108016f = jCurrentAnimationTimeMillis;
            float f = j * fM131345g;
            this.f108017g = (int) (this.f108013c * f);
            this.f108018h = (int) (f * this.f108014d);
        }

        /* JADX INFO: renamed from: b */
        public int m131340b() {
            return this.f108017g;
        }

        /* JADX INFO: renamed from: c */
        public int m131341c() {
            return this.f108018h;
        }

        /* JADX INFO: renamed from: d */
        public int m131342d() {
            float f = this.f108013c;
            return (int) (f / Math.abs(f));
        }

        /* JADX INFO: renamed from: e */
        public final float m131343e(long j) {
            long j2 = this.f108015e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f108019i;
            if (j3 < 0 || j < j3) {
                return hj1.m131320e((j - j2) / this.f108011a, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f108020j;
            return (1.0f - f) + (f * hj1.m131320e((j - j3) / this.f108021k, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: f */
        public int m131344f() {
            float f = this.f108014d;
            return (int) (f / Math.abs(f));
        }

        /* JADX INFO: renamed from: g */
        public final float m131345g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        /* JADX INFO: renamed from: h */
        public boolean m131346h() {
            return this.f108019i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f108019i + ((long) this.f108021k);
        }

        /* JADX INFO: renamed from: i */
        public void m131347i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f108021k = hj1.m131321f((int) (jCurrentAnimationTimeMillis - this.f108015e), 0, this.f108012b);
            this.f108020j = m131343e(jCurrentAnimationTimeMillis);
            this.f108019i = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: j */
        public void m131348j(int i) {
            this.f108012b = i;
        }

        /* JADX INFO: renamed from: k */
        public void m131349k(int i) {
            this.f108011a = i;
        }

        /* JADX INFO: renamed from: l */
        public void m131350l(float f, float f2) {
            this.f108013c = f;
            this.f108014d = f2;
        }

        /* JADX INFO: renamed from: m */
        public void m131351m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f108015e = jCurrentAnimationTimeMillis;
            this.f108019i = -1L;
            this.f108016f = jCurrentAnimationTimeMillis;
            this.f108020j = 0.5f;
            this.f108017g = 0;
            this.f108018h = 0;
        }
    }

    /* JADX INFO: renamed from: l.hj1$b */
    public class RunnableC17330b implements Runnable {
        public RunnableC17330b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hj1 hj1Var = hj1.this;
            if (hj1Var.f108008o) {
                if (hj1Var.f108006m) {
                    hj1Var.f108006m = false;
                    hj1Var.f107994a.m131351m();
                }
                C17329a c17329a = hj1.this.f107994a;
                if (c17329a.m131346h() || !hj1.this.m131337u()) {
                    hj1.this.f108008o = false;
                    return;
                }
                hj1 hj1Var2 = hj1.this;
                if (hj1Var2.f108007n) {
                    hj1Var2.f108007n = false;
                    hj1Var2.m131322c();
                }
                c17329a.m131339a();
                hj1.this.mo117290j(c17329a.m131340b(), c17329a.m131341c());
                gbl0.m125185b0(hj1.this.f107996c, this);
            }
        }
    }

    public hj1(@NonNull View view) {
        this.f107996c = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        m131331o(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        m131332p(f3, f3);
        m131328l(1);
        m131330n(Float.MAX_VALUE, Float.MAX_VALUE);
        m131335s(0.2f, 0.2f);
        m131336t(1.0f, 1.0f);
        m131327k(f107993r);
        m131334r(500);
        m131333q(500);
    }

    /* JADX INFO: renamed from: e */
    public static float m131320e(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: f */
    public static int m131321f(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo117288a(int i);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo117289b(int i);

    /* JADX INFO: renamed from: c */
    public void m131322c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f107996c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final float m131323d(int i, float f, float f2, float f3) {
        float fM131325h = m131325h(this.f107998e[i], f2, this.f107999f[i], f);
        if (fM131325h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f108002i[i];
        float f5 = this.f108003j[i];
        float f6 = this.f108004k[i];
        float f7 = f4 * f3;
        return fM131325h > 0.0f ? m131320e(fM131325h * f7, f5, f6) : -m131320e((-fM131325h) * f7, f5, f6);
    }

    /* JADX INFO: renamed from: g */
    public final float m131324g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f108000g;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f108008o && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final float m131325h(float f, float f2, float f3, float f4) {
        float interpolation;
        float fM131320e = m131320e(f * f2, 0.0f, f3);
        float fM131324g = m131324g(f2 - f4, fM131320e) - m131324g(f4, fM131320e);
        if (fM131324g < 0.0f) {
            interpolation = -this.f107995b.getInterpolation(-fM131324g);
        } else {
            if (fM131324g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f107995b.getInterpolation(fM131324g);
        }
        return m131320e(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m131326i() {
        if (this.f108006m) {
            this.f108008o = false;
        } else {
            this.f107994a.m131347i();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo117290j(int i, int i2);

    @NonNull
    /* JADX INFO: renamed from: k */
    public hj1 m131327k(int i) {
        this.f108001h = i;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public hj1 m131328l(int i) {
        this.f108000g = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public hj1 m131329m(boolean z) {
        if (this.f108009p && !z) {
            m131326i();
        }
        this.f108009p = z;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public hj1 m131330n(float f, float f2) {
        float[] fArr = this.f107999f;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public hj1 m131331o(float f, float f2) {
        float[] fArr = this.f108004k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f108009p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m131326i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m131326i();
                }
            }
            return !this.f108010q && this.f108008o;
        }
        this.f108007n = true;
        this.f108005l = false;
        this.f107994a.m131350l(m131323d(0, motionEvent.getX(), view.getWidth(), this.f107996c.getWidth()), m131323d(1, motionEvent.getY(), view.getHeight(), this.f107996c.getHeight()));
        if (!this.f108008o && m131337u()) {
            m131338v();
        }
        if (this.f108010q) {
        }
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public hj1 m131332p(float f, float f2) {
        float[] fArr = this.f108003j;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public hj1 m131333q(int i) {
        this.f107994a.m131348j(i);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public hj1 m131334r(int i) {
        this.f107994a.m131349k(i);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public hj1 m131335s(float f, float f2) {
        float[] fArr = this.f107998e;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public hj1 m131336t(float f, float f2) {
        float[] fArr = this.f108002i;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public boolean m131337u() {
        C17329a c17329a = this.f107994a;
        int iM131344f = c17329a.m131344f();
        int iM131342d = c17329a.m131342d();
        if (iM131344f == 0 || !mo117289b(iM131344f)) {
            return iM131342d != 0 && mo117288a(iM131342d);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m131338v() {
        int i;
        if (this.f107997d == null) {
            this.f107997d = new RunnableC17330b();
        }
        this.f108008o = true;
        this.f108006m = true;
        if (this.f108005l || (i = this.f108001h) <= 0) {
            this.f107997d.run();
        } else {
            gbl0.m125187c0(this.f107996c, this.f107997d, i);
        }
        this.f108005l = true;
    }
}
