package p028v;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.xdl0;
import p003l.w9j;
import p028v.C1378a;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1378a {

    /* JADX INFO: renamed from: a */
    public View f13116a;

    /* JADX INFO: renamed from: b */
    public View f13117b;

    /* JADX INFO: renamed from: d */
    public float f13119d;

    /* JADX INFO: renamed from: e */
    public float f13120e;

    /* JADX INFO: renamed from: f */
    public float f13121f;

    /* JADX INFO: renamed from: g */
    public float f13122g;

    /* JADX INFO: renamed from: h */
    public float f13123h;

    /* JADX INFO: renamed from: i */
    public float f13124i;

    /* JADX INFO: renamed from: j */
    public float f13125j;

    /* JADX INFO: renamed from: k */
    public float f13126k;

    /* JADX INFO: renamed from: l */
    public float f13127l;

    /* JADX INFO: renamed from: m */
    public float f13128m;

    /* JADX INFO: renamed from: n */
    public float f13129n;

    /* JADX INFO: renamed from: o */
    public float f13130o;

    /* JADX INFO: renamed from: p */
    public float f13131p;

    /* JADX INFO: renamed from: q */
    public float f13132q;

    /* JADX INFO: renamed from: r */
    public boolean f13133r;

    /* JADX INFO: renamed from: s */
    public float f13134s;

    /* JADX INFO: renamed from: t */
    public float f13135t;

    /* JADX INFO: renamed from: u */
    public float f13136u;

    /* JADX INFO: renamed from: v */
    public float f13137v;

    /* JADX INFO: renamed from: w */
    public float f13138w;

    /* JADX INFO: renamed from: x */
    public float f13139x;

    /* JADX INFO: renamed from: c */
    public String f13118c = null;

    /* JADX INFO: renamed from: y */
    public Rect f13140y = new Rect();

    /* JADX INFO: renamed from: v.a$a */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f13141a;

        public a(boolean z) {
            this.f13141a = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m11844b() {
            if (C1378a.this.f13117b != null) {
                C1378a.this.f13117b.setVisibility(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13141a) {
                C1378a.this.f13133r = false;
            }
            boolean z = this.f13141a;
            C1378a c1378a = C1378a.this;
            if (z) {
                if (c1378a.f13117b != null) {
                    C1378a.this.f13117b.post(new Runnable() { // from class: l.mqh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5741a.m11844b();
                        }
                    });
                }
            } else if (c1378a.f13117b != null) {
                C1378a.this.f13117b.setVisibility(0);
                C1378a.this.f13117b = null;
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
        String mo879k();

        /* JADX INFO: renamed from: l */
        ValueAnimator mo880l(ViewGroup viewGroup);

        /* JADX INFO: renamed from: n */
        ValueAnimator mo881n(ViewGroup viewGroup);
    }

    public C1378a(View view) {
        this.f13116a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m11809a(b bVar, View view) {
        if (view instanceof b) {
            b bVar2 = (b) view;
            if (bVar2.mo879k() != null && bVar.mo879k() != null && bVar2.mo879k().equals(bVar.mo879k())) {
                return Boolean.valueOf(view.getGlobalVisibleRect(new Rect()));
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: A */
    public final void m11815A(float f) {
        if (xdl0.S(f)) {
            return;
        }
        this.f13116a.setScaleX(f);
        this.f13116a.setScaleY(f);
    }

    /* JADX INFO: renamed from: B */
    public void m11816B(String str) {
        this.f13118c = str;
    }

    /* JADX INFO: renamed from: C */
    public final int m11817C() {
        if (m11838v() > m11837u()) {
            float f = this.f13127l;
            float f2 = this.f13128m;
            if (f > f2) {
                return 2;
            }
            return f2 / f < m11829m() / m11830n() ? 0 : 1;
        }
        float f3 = this.f13128m;
        float f4 = this.f13127l;
        if (f3 > f4) {
            return f3 / f4 < m11829m() / m11830n() ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: D */
    public final ValueAnimator m11818D(final boolean z) {
        this.f13133r = true;
        final float fM11840x = m11840x();
        if (!z) {
            this.f13131p = this.f13116a.getTranslationX();
            this.f13132q = this.f13116a.getTranslationY();
            this.f13139x = this.f13116a.getScaleX();
        }
        this.f13129n = (this.f13125j + (this.f13123h / 2.0f)) - (m11830n() / 2.0f);
        this.f13130o = (this.f13126k + (this.f13124i / 2.0f)) - (m11829m() / 2.0f);
        this.f13116a.setPivotX(m11830n() / 2.0f);
        this.f13116a.setPivotY(m11829m() / 2.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(180L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lqh0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f5386a.m11836t(z, fM11840x, valueAnimator);
            }
        });
        duration.addListener(new a(z));
        return duration;
    }

    /* JADX INFO: renamed from: E */
    public final ValueAnimator m11819E(final boolean z, ViewGroup viewGroup) {
        View viewM11824h = m11824h((b) this.f13116a, viewGroup);
        this.f13117b = viewM11824h;
        if (!(this.f13116a instanceof b) || viewM11824h == null) {
            return null;
        }
        xdl0.g gVarI0 = xdl0.i0(viewM11824h);
        this.f13123h = gVarI0.c;
        this.f13124i = gVarI0.d;
        this.f13125j = gVarI0.a;
        this.f13126k = gVarI0.b - xdl0.F0();
        this.f13117b.postDelayed(new Runnable() { // from class: l.jqh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4702a.m11835s(z);
            }
        }, 10L);
        return m11818D(z);
    }

    /* JADX INFO: renamed from: F */
    public String m11820F() {
        return this.f13118c;
    }

    /* JADX INFO: renamed from: G */
    public ValueAnimator m11821G(ViewGroup viewGroup) {
        return m11819E(true, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public ValueAnimator m11822H(ViewGroup viewGroup) {
        return m11819E(false, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m11823g(@NonNull Canvas canvas) {
        if (this.f13133r) {
            canvas.clipRect(this.f13134s, this.f13135t, this.f13136u, this.f13137v);
        }
    }

    /* JADX INFO: renamed from: h */
    public final View m11824h(final b bVar, ViewGroup viewGroup) {
        return xdl0.q(viewGroup, new w9j() { // from class: l.kqh0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return C1378a.m11809a(bVar, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public float m11825i() {
        return this.f13128m;
    }

    /* JADX INFO: renamed from: j */
    public float m11826j() {
        return this.f13127l;
    }

    /* JADX INFO: renamed from: k */
    public final float m11827k() {
        return m11817C() == 1 ? m11829m() : m11830n() / m11837u();
    }

    /* JADX INFO: renamed from: l */
    public final float m11828l() {
        return m11817C() == 1 ? m11829m() * m11837u() : m11830n();
    }

    /* JADX INFO: renamed from: m */
    public final float m11829m() {
        return this.f13116a.getHeight();
    }

    /* JADX INFO: renamed from: n */
    public final float m11830n() {
        return this.f13116a.getWidth();
    }

    /* JADX INFO: renamed from: o */
    public final void m11831o(float f, float f2) {
        if (m11817C() == 0) {
            float fM11827k = (m11827k() / m11838v()) * m11837u();
            this.f13122g = fM11827k + ((m11829m() - fM11827k) * f);
            this.f13120e = m11830n();
            this.f13119d = 0.0f;
            this.f13121f = (m11829m() - this.f13122g) / 2.0f;
        } else if (m11817C() == 1) {
            float fM11828l = m11828l() / m11838v();
            this.f13122g = fM11828l + ((m11829m() - fM11828l) * f);
            this.f13120e = m11830n();
            this.f13119d = 0.0f;
            this.f13121f = (m11829m() - this.f13122g) / 2.0f;
        } else if (m11817C() == 2) {
            float fM11827k2 = m11827k() * m11838v();
            this.f13120e = fM11827k2 + ((m11830n() - fM11827k2) * f);
            this.f13122g = m11829m();
            this.f13121f = 0.0f;
            this.f13119d = (m11830n() - this.f13120e) / 2.0f;
        }
        float f3 = f2 + ((1.0f - f2) * f);
        this.f13138w = f3;
        m11815A(f3);
        float f4 = 1.0f - f;
        this.f13116a.setTranslationX(this.f13129n * f4);
        this.f13116a.setTranslationY(this.f13130o * f4);
        float f5 = this.f13119d;
        this.f13134s = f5;
        float f6 = this.f13121f;
        this.f13135t = f6;
        this.f13136u = f5 + this.f13120e;
        this.f13137v = f6 + this.f13122g;
        m11832p(f);
    }

    /* JADX INFO: renamed from: p */
    public final void m11832p(float f) {
        View view = this.f13117b;
        if (view != null) {
            view.getLocalVisibleRect(this.f13140y);
        }
        if (this.f13140y.isEmpty()) {
            return;
        }
        Rect rect = this.f13140y;
        int i = rect.left;
        int i2 = rect.right;
        float f2 = rect.top;
        float f3 = rect.bottom;
        float fM11828l = 0.0f;
        float f4 = this.f13124i;
        if (f2 != 0.0f) {
            float f5 = f2 / f4;
            float fM11827k = m11827k();
            if (f == 1.0f) {
                this.f13135t = this.f13121f;
                return;
            }
            if (m11817C() == 2) {
                this.f13135t = ((m11829m() - fM11827k) / 2.0f) + (fM11827k * f5 * (1.0f - f));
                return;
            }
            if (m11817C() == 0) {
                fM11828l = m11837u() * (m11827k() / m11838v());
            } else if (m11817C() == 1) {
                fM11828l = m11828l() / m11838v();
            }
            this.f13135t = this.f13121f + (fM11828l * f5 * (1.0f - f));
            return;
        }
        if (f3 != f4) {
            float f6 = (f4 - f3) / f4;
            float fM11827k2 = m11827k();
            if (f != 1.0f) {
                if (m11817C() == 2) {
                    this.f13137v = (this.f13121f + this.f13122g) - (((m11829m() - fM11827k2) / 2.0f) + ((fM11827k2 * f6) * (1.0f - f)));
                    return;
                }
                if (m11817C() == 0) {
                    fM11828l = m11837u() * (m11827k() / m11838v());
                } else if (m11817C() == 1) {
                    fM11828l = m11828l() / m11838v();
                }
                this.f13137v = (this.f13121f + this.f13122g) - ((fM11828l * f6) * (1.0f - f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11833q(float f, float f2) {
        if (m11817C() == 0) {
            this.f13122g = m11829m() - ((m11829m() - ((m11827k() / m11838v()) * m11837u())) * f);
            this.f13120e = m11830n();
            this.f13119d = 0.0f;
            this.f13121f = (m11829m() - this.f13122g) / 2.0f;
        } else if (m11817C() == 1) {
            this.f13122g = m11829m() - ((m11829m() - (m11828l() / m11838v())) * f);
            this.f13120e = m11830n();
            this.f13119d = 0.0f;
            this.f13121f = (m11829m() - this.f13122g) / 2.0f;
        } else if (m11817C() == 2) {
            this.f13120e = m11830n() - ((m11830n() - (m11827k() * m11838v())) * f);
            this.f13122g = m11829m();
            this.f13121f = 0.0f;
            this.f13119d = (m11830n() - this.f13120e) / 2.0f;
        }
        float f3 = this.f13139x;
        float f4 = f3 - ((f3 - f2) * f);
        this.f13138w = f4;
        m11815A(f4);
        View view = this.f13116a;
        float f5 = this.f13131p;
        view.setTranslationX(f5 + ((this.f13129n - f5) * f));
        View view2 = this.f13116a;
        float f6 = this.f13132q;
        view2.setTranslationY(f6 + ((this.f13130o - f6) * f));
        float f7 = this.f13119d;
        this.f13134s = f7;
        float f8 = this.f13121f;
        this.f13135t = f8;
        this.f13136u = f7 + this.f13120e;
        this.f13137v = f8 + this.f13122g;
        m11834r(f);
    }

    /* JADX INFO: renamed from: r */
    public final void m11834r(float f) {
        if (this.f13117b != null && this.f13140y.isEmpty()) {
            this.f13117b.getLocalVisibleRect(this.f13140y);
        }
        if (this.f13140y.isEmpty()) {
            return;
        }
        Rect rect = this.f13140y;
        int i = rect.left;
        int i2 = rect.right;
        float f2 = rect.top;
        float f3 = rect.bottom;
        float fM11828l = 0.0f;
        float f4 = this.f13124i;
        if (f2 != 0.0f) {
            float f5 = f2 / f4;
            float fM11827k = m11827k();
            if (m11817C() == 2) {
                this.f13135t = ((m11829m() - fM11827k) / 2.0f) + (fM11827k * f5 * f);
                return;
            }
            if (m11817C() == 0) {
                fM11828l = m11837u() * (m11827k() / m11838v());
            } else if (m11817C() == 1) {
                fM11828l = m11828l() / m11838v();
            }
            this.f13135t = this.f13121f + (fM11828l * f5 * f);
            return;
        }
        if (f3 != f4) {
            float f6 = (f4 - f3) / f4;
            float fM11827k2 = m11827k();
            if (m11817C() == 2) {
                this.f13137v = (this.f13121f + this.f13122g) - (((m11829m() - fM11827k2) / 2.0f) + ((fM11827k2 * f6) * f));
                return;
            }
            if (m11817C() == 0) {
                fM11828l = m11837u() * (m11827k() / m11838v());
            } else if (m11817C() == 1) {
                fM11828l = m11828l() / m11838v();
            }
            this.f13137v = (this.f13121f + this.f13122g) - ((fM11828l * f6) * f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m11835s(boolean z) {
        View view = this.f13117b;
        if (view != null) {
            if (z || this.f13132q <= 0.0f) {
                view.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m11836t(boolean z, float f, ValueAnimator valueAnimator) {
        if (z) {
            m11831o(valueAnimator.getAnimatedFraction(), f);
        } else {
            m11833q(valueAnimator.getAnimatedFraction(), f);
        }
        this.f13116a.invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final float m11837u() {
        return this.f13127l / this.f13128m;
    }

    /* JADX INFO: renamed from: v */
    public final float m11838v() {
        return this.f13123h / this.f13124i;
    }

    /* JADX INFO: renamed from: w */
    public final float m11839w() {
        return m11830n() / m11829m();
    }

    /* JADX INFO: renamed from: x */
    public final float m11840x() {
        if (m11839w() > m11837u()) {
            return this.f13123h / (m11829m() * m11837u());
        }
        return this.f13128m > this.f13127l ? this.f13123h / m11830n() : this.f13124i / (m11830n() / m11837u());
    }

    /* JADX INFO: renamed from: y */
    public void m11841y(float f) {
        this.f13128m = f;
    }

    /* JADX INFO: renamed from: z */
    public void m11842z(float f) {
        this.f13127l = f;
    }
}
