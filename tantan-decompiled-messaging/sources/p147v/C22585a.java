package p147v;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p147v.C22585a;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22585a {

    /* JADX INFO: renamed from: a */
    public View f209491a;

    /* JADX INFO: renamed from: b */
    public View f209492b;

    /* JADX INFO: renamed from: d */
    public float f209494d;

    /* JADX INFO: renamed from: e */
    public float f209495e;

    /* JADX INFO: renamed from: f */
    public float f209496f;

    /* JADX INFO: renamed from: g */
    public float f209497g;

    /* JADX INFO: renamed from: h */
    public float f209498h;

    /* JADX INFO: renamed from: i */
    public float f209499i;

    /* JADX INFO: renamed from: j */
    public float f209500j;

    /* JADX INFO: renamed from: k */
    public float f209501k;

    /* JADX INFO: renamed from: l */
    public float f209502l;

    /* JADX INFO: renamed from: m */
    public float f209503m;

    /* JADX INFO: renamed from: n */
    public float f209504n;

    /* JADX INFO: renamed from: o */
    public float f209505o;

    /* JADX INFO: renamed from: p */
    public float f209506p;

    /* JADX INFO: renamed from: q */
    public float f209507q;

    /* JADX INFO: renamed from: r */
    public boolean f209508r;

    /* JADX INFO: renamed from: s */
    public float f209509s;

    /* JADX INFO: renamed from: t */
    public float f209510t;

    /* JADX INFO: renamed from: u */
    public float f209511u;

    /* JADX INFO: renamed from: v */
    public float f209512v;

    /* JADX INFO: renamed from: w */
    public float f209513w;

    /* JADX INFO: renamed from: x */
    public float f209514x;

    /* JADX INFO: renamed from: c */
    public String f209493c = null;

    /* JADX INFO: renamed from: y */
    public Rect f209515y = new Rect();

    /* JADX INFO: renamed from: v.a$a */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f209516a;

        public a(boolean z) {
            this.f209516a = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m223352b() {
            if (C22585a.this.f209492b != null) {
                C22585a.this.f209492b.setVisibility(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f209516a) {
                C22585a.this.f209508r = false;
            }
            boolean z = this.f209516a;
            C22585a c22585a = C22585a.this;
            if (z) {
                if (c22585a.f209492b != null) {
                    C22585a.this.f209492b.post(new Runnable() { // from class: l.mqh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f135241a.m223352b();
                        }
                    });
                }
            } else if (c22585a.f209492b != null) {
                C22585a.this.f209492b.setVisibility(0);
                C22585a.this.f209492b = null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: v.a$b */
    public interface b {
        /* JADX INFO: renamed from: k */
        String mo43946k();

        /* JADX INFO: renamed from: l */
        ValueAnimator mo43947l(ViewGroup viewGroup);

        /* JADX INFO: renamed from: n */
        ValueAnimator mo43948n(ViewGroup viewGroup);
    }

    public C22585a(View view) {
        this.f209491a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m223317a(b bVar, View view) {
        if (view instanceof b) {
            b bVar2 = (b) view;
            if (bVar2.mo43946k() != null && bVar.mo43946k() != null && bVar2.mo43946k().equals(bVar.mo43946k())) {
                return Boolean.valueOf(view.getGlobalVisibleRect(new Rect()));
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: A */
    public final void m223323A(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        this.f209491a.setScaleX(f);
        this.f209491a.setScaleY(f);
    }

    /* JADX INFO: renamed from: B */
    public void m223324B(String str) {
        this.f209493c = str;
    }

    /* JADX INFO: renamed from: C */
    public final int m223325C() {
        if (m223346v() > m223345u()) {
            float f = this.f209502l;
            float f2 = this.f209503m;
            if (f > f2) {
                return 2;
            }
            return f2 / f < m223337m() / m223338n() ? 0 : 1;
        }
        float f3 = this.f209503m;
        float f4 = this.f209502l;
        if (f3 > f4) {
            return f3 / f4 < m223337m() / m223338n() ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: D */
    public final ValueAnimator m223326D(final boolean z) {
        this.f209508r = true;
        final float fM223348x = m223348x();
        if (!z) {
            this.f209506p = this.f209491a.getTranslationX();
            this.f209507q = this.f209491a.getTranslationY();
            this.f209514x = this.f209491a.getScaleX();
        }
        this.f209504n = (this.f209500j + (this.f209498h / 2.0f)) - (m223338n() / 2.0f);
        this.f209505o = (this.f209501k + (this.f209499i / 2.0f)) - (m223337m() / 2.0f);
        this.f209491a.setPivotX(m223338n() / 2.0f);
        this.f209491a.setPivotY(m223337m() / 2.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(180L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lqh0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f129340a.m223344t(z, fM223348x, valueAnimator);
            }
        });
        duration.addListener(new a(z));
        return duration;
    }

    /* JADX INFO: renamed from: E */
    public final ValueAnimator m223327E(final boolean z, ViewGroup viewGroup) {
        View viewM223332h = m223332h((b) this.f209491a, viewGroup);
        this.f209492b = viewM223332h;
        if (!(this.f209491a instanceof b) || viewM223332h == null) {
            return null;
        }
        xdl0.C21104g c21104gM208380i0 = xdl0.m208380i0(viewM223332h);
        this.f209498h = c21104gM208380i0.f192420c;
        this.f209499i = c21104gM208380i0.f192421d;
        this.f209500j = c21104gM208380i0.f192418a;
        this.f209501k = c21104gM208380i0.f192419b - xdl0.m208331F0();
        this.f209492b.postDelayed(new Runnable() { // from class: l.jqh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f119281a.m223343s(z);
            }
        }, 10L);
        return m223326D(z);
    }

    /* JADX INFO: renamed from: F */
    public String m223328F() {
        return this.f209493c;
    }

    /* JADX INFO: renamed from: G */
    public ValueAnimator m223329G(ViewGroup viewGroup) {
        return m223327E(true, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public ValueAnimator m223330H(ViewGroup viewGroup) {
        return m223327E(false, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m223331g(@NonNull Canvas canvas) {
        if (this.f209508r) {
            canvas.clipRect(this.f209509s, this.f209510t, this.f209511u, this.f209512v);
        }
    }

    /* JADX INFO: renamed from: h */
    public final View m223332h(final b bVar, ViewGroup viewGroup) {
        return xdl0.m208395q(viewGroup, new w9j() { // from class: l.kqh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22585a.m223317a(bVar, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public float m223333i() {
        return this.f209503m;
    }

    /* JADX INFO: renamed from: j */
    public float m223334j() {
        return this.f209502l;
    }

    /* JADX INFO: renamed from: k */
    public final float m223335k() {
        return m223325C() == 1 ? m223337m() : m223338n() / m223345u();
    }

    /* JADX INFO: renamed from: l */
    public final float m223336l() {
        return m223325C() == 1 ? m223337m() * m223345u() : m223338n();
    }

    /* JADX INFO: renamed from: m */
    public final float m223337m() {
        return this.f209491a.getHeight();
    }

    /* JADX INFO: renamed from: n */
    public final float m223338n() {
        return this.f209491a.getWidth();
    }

    /* JADX INFO: renamed from: o */
    public final void m223339o(float f, float f2) {
        if (m223325C() == 0) {
            float fM223335k = (m223335k() / m223346v()) * m223345u();
            this.f209497g = fM223335k + ((m223337m() - fM223335k) * f);
            this.f209495e = m223338n();
            this.f209494d = 0.0f;
            this.f209496f = (m223337m() - this.f209497g) / 2.0f;
        } else if (m223325C() == 1) {
            float fM223336l = m223336l() / m223346v();
            this.f209497g = fM223336l + ((m223337m() - fM223336l) * f);
            this.f209495e = m223338n();
            this.f209494d = 0.0f;
            this.f209496f = (m223337m() - this.f209497g) / 2.0f;
        } else if (m223325C() == 2) {
            float fM223335k2 = m223335k() * m223346v();
            this.f209495e = fM223335k2 + ((m223338n() - fM223335k2) * f);
            this.f209497g = m223337m();
            this.f209496f = 0.0f;
            this.f209494d = (m223338n() - this.f209495e) / 2.0f;
        }
        float f3 = f2 + ((1.0f - f2) * f);
        this.f209513w = f3;
        m223323A(f3);
        float f4 = 1.0f - f;
        this.f209491a.setTranslationX(this.f209504n * f4);
        this.f209491a.setTranslationY(this.f209505o * f4);
        float f5 = this.f209494d;
        this.f209509s = f5;
        float f6 = this.f209496f;
        this.f209510t = f6;
        this.f209511u = f5 + this.f209495e;
        this.f209512v = f6 + this.f209497g;
        m223340p(f);
    }

    /* JADX INFO: renamed from: p */
    public final void m223340p(float f) {
        View view = this.f209492b;
        if (view != null) {
            view.getLocalVisibleRect(this.f209515y);
        }
        if (this.f209515y.isEmpty()) {
            return;
        }
        Rect rect = this.f209515y;
        int i = rect.left;
        int i2 = rect.right;
        float f2 = rect.top;
        float f3 = rect.bottom;
        float fM223336l = 0.0f;
        float f4 = this.f209499i;
        if (f2 != 0.0f) {
            float f5 = f2 / f4;
            float fM223335k = m223335k();
            if (f == 1.0f) {
                this.f209510t = this.f209496f;
                return;
            }
            if (m223325C() == 2) {
                this.f209510t = ((m223337m() - fM223335k) / 2.0f) + (fM223335k * f5 * (1.0f - f));
                return;
            }
            if (m223325C() == 0) {
                fM223336l = m223345u() * (m223335k() / m223346v());
            } else if (m223325C() == 1) {
                fM223336l = m223336l() / m223346v();
            }
            this.f209510t = this.f209496f + (fM223336l * f5 * (1.0f - f));
            return;
        }
        if (f3 != f4) {
            float f6 = (f4 - f3) / f4;
            float fM223335k2 = m223335k();
            if (f != 1.0f) {
                if (m223325C() == 2) {
                    this.f209512v = (this.f209496f + this.f209497g) - (((m223337m() - fM223335k2) / 2.0f) + ((fM223335k2 * f6) * (1.0f - f)));
                    return;
                }
                if (m223325C() == 0) {
                    fM223336l = m223345u() * (m223335k() / m223346v());
                } else if (m223325C() == 1) {
                    fM223336l = m223336l() / m223346v();
                }
                this.f209512v = (this.f209496f + this.f209497g) - ((fM223336l * f6) * (1.0f - f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m223341q(float f, float f2) {
        if (m223325C() == 0) {
            this.f209497g = m223337m() - ((m223337m() - ((m223335k() / m223346v()) * m223345u())) * f);
            this.f209495e = m223338n();
            this.f209494d = 0.0f;
            this.f209496f = (m223337m() - this.f209497g) / 2.0f;
        } else if (m223325C() == 1) {
            this.f209497g = m223337m() - ((m223337m() - (m223336l() / m223346v())) * f);
            this.f209495e = m223338n();
            this.f209494d = 0.0f;
            this.f209496f = (m223337m() - this.f209497g) / 2.0f;
        } else if (m223325C() == 2) {
            this.f209495e = m223338n() - ((m223338n() - (m223335k() * m223346v())) * f);
            this.f209497g = m223337m();
            this.f209496f = 0.0f;
            this.f209494d = (m223338n() - this.f209495e) / 2.0f;
        }
        float f3 = this.f209514x;
        float f4 = f3 - ((f3 - f2) * f);
        this.f209513w = f4;
        m223323A(f4);
        View view = this.f209491a;
        float f5 = this.f209506p;
        view.setTranslationX(f5 + ((this.f209504n - f5) * f));
        View view2 = this.f209491a;
        float f6 = this.f209507q;
        view2.setTranslationY(f6 + ((this.f209505o - f6) * f));
        float f7 = this.f209494d;
        this.f209509s = f7;
        float f8 = this.f209496f;
        this.f209510t = f8;
        this.f209511u = f7 + this.f209495e;
        this.f209512v = f8 + this.f209497g;
        m223342r(f);
    }

    /* JADX INFO: renamed from: r */
    public final void m223342r(float f) {
        if (this.f209492b != null && this.f209515y.isEmpty()) {
            this.f209492b.getLocalVisibleRect(this.f209515y);
        }
        if (this.f209515y.isEmpty()) {
            return;
        }
        Rect rect = this.f209515y;
        int i = rect.left;
        int i2 = rect.right;
        float f2 = rect.top;
        float f3 = rect.bottom;
        float fM223336l = 0.0f;
        float f4 = this.f209499i;
        if (f2 != 0.0f) {
            float f5 = f2 / f4;
            float fM223335k = m223335k();
            if (m223325C() == 2) {
                this.f209510t = ((m223337m() - fM223335k) / 2.0f) + (fM223335k * f5 * f);
                return;
            }
            if (m223325C() == 0) {
                fM223336l = m223345u() * (m223335k() / m223346v());
            } else if (m223325C() == 1) {
                fM223336l = m223336l() / m223346v();
            }
            this.f209510t = this.f209496f + (fM223336l * f5 * f);
            return;
        }
        if (f3 != f4) {
            float f6 = (f4 - f3) / f4;
            float fM223335k2 = m223335k();
            if (m223325C() == 2) {
                this.f209512v = (this.f209496f + this.f209497g) - (((m223337m() - fM223335k2) / 2.0f) + ((fM223335k2 * f6) * f));
                return;
            }
            if (m223325C() == 0) {
                fM223336l = m223345u() * (m223335k() / m223346v());
            } else if (m223325C() == 1) {
                fM223336l = m223336l() / m223346v();
            }
            this.f209512v = (this.f209496f + this.f209497g) - ((fM223336l * f6) * f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m223343s(boolean z) {
        View view = this.f209492b;
        if (view != null) {
            if (z || this.f209507q <= 0.0f) {
                view.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m223344t(boolean z, float f, ValueAnimator valueAnimator) {
        if (z) {
            m223339o(valueAnimator.getAnimatedFraction(), f);
        } else {
            m223341q(valueAnimator.getAnimatedFraction(), f);
        }
        this.f209491a.invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final float m223345u() {
        return this.f209502l / this.f209503m;
    }

    /* JADX INFO: renamed from: v */
    public final float m223346v() {
        return this.f209498h / this.f209499i;
    }

    /* JADX INFO: renamed from: w */
    public final float m223347w() {
        return m223338n() / m223337m();
    }

    /* JADX INFO: renamed from: x */
    public final float m223348x() {
        if (m223347w() > m223345u()) {
            return this.f209498h / (m223337m() * m223345u());
        }
        return this.f209503m > this.f209502l ? this.f209498h / m223338n() : this.f209499i / (m223338n() / m223345u());
    }

    /* JADX INFO: renamed from: y */
    public void m223349y(float f) {
        this.f209503m = f;
    }

    /* JADX INFO: renamed from: z */
    public void m223350z(float f) {
        this.f209502l = f;
    }
}
