package p151v;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p151v.C22700a;
import p153l.bnl0;
import p153l.qcj;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22700a {

    /* JADX INFO: renamed from: a */
    public View f210413a;

    /* JADX INFO: renamed from: b */
    public View f210414b;

    /* JADX INFO: renamed from: d */
    public float f210416d;

    /* JADX INFO: renamed from: e */
    public float f210417e;

    /* JADX INFO: renamed from: f */
    public float f210418f;

    /* JADX INFO: renamed from: g */
    public float f210419g;

    /* JADX INFO: renamed from: h */
    public float f210420h;

    /* JADX INFO: renamed from: i */
    public float f210421i;

    /* JADX INFO: renamed from: j */
    public float f210422j;

    /* JADX INFO: renamed from: k */
    public float f210423k;

    /* JADX INFO: renamed from: l */
    public float f210424l;

    /* JADX INFO: renamed from: m */
    public float f210425m;

    /* JADX INFO: renamed from: n */
    public float f210426n;

    /* JADX INFO: renamed from: o */
    public float f210427o;

    /* JADX INFO: renamed from: p */
    public float f210428p;

    /* JADX INFO: renamed from: q */
    public float f210429q;

    /* JADX INFO: renamed from: r */
    public boolean f210430r;

    /* JADX INFO: renamed from: s */
    public float f210431s;

    /* JADX INFO: renamed from: t */
    public float f210432t;

    /* JADX INFO: renamed from: u */
    public float f210433u;

    /* JADX INFO: renamed from: v */
    public float f210434v;

    /* JADX INFO: renamed from: w */
    public float f210435w;

    /* JADX INFO: renamed from: x */
    public float f210436x;

    /* JADX INFO: renamed from: c */
    public String f210415c = null;

    /* JADX INFO: renamed from: y */
    public Rect f210437y = new Rect();

    /* JADX INFO: renamed from: v.a$a */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f210438a;

        public a(boolean z) {
            this.f210438a = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m224598b() {
            if (C22700a.this.f210414b != null) {
                C22700a.this.f210414b.setVisibility(0);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f210438a) {
                C22700a.this.f210430r = false;
            }
            boolean z = this.f210438a;
            C22700a c22700a = C22700a.this;
            if (z) {
                if (c22700a.f210414b != null) {
                    C22700a.this.f210414b.post(new Runnable() { // from class: l.tyh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f176678a.m224598b();
                        }
                    });
                }
            } else if (c22700a.f210414b != null) {
                C22700a.this.f210414b.setVisibility(0);
                C22700a.this.f210414b = null;
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
        String mo45129k();

        /* JADX INFO: renamed from: l */
        ValueAnimator mo45130l(ViewGroup viewGroup);

        /* JADX INFO: renamed from: n */
        ValueAnimator mo45131n(ViewGroup viewGroup);
    }

    public C22700a(View view) {
        this.f210413a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m224563a(b bVar, View view) {
        if (view instanceof b) {
            b bVar2 = (b) view;
            if (bVar2.mo45129k() != null && bVar.mo45129k() != null && bVar2.mo45129k().equals(bVar.mo45129k())) {
                return Boolean.valueOf(view.getGlobalVisibleRect(new Rect()));
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: A */
    public final void m224569A(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        this.f210413a.setScaleX(f);
        this.f210413a.setScaleY(f);
    }

    /* JADX INFO: renamed from: B */
    public void m224570B(String str) {
        this.f210415c = str;
    }

    /* JADX INFO: renamed from: C */
    public final int m224571C() {
        if (m224592v() > m224591u()) {
            float f = this.f210424l;
            float f2 = this.f210425m;
            if (f > f2) {
                return 2;
            }
            return f2 / f < m224583m() / m224584n() ? 0 : 1;
        }
        float f3 = this.f210425m;
        float f4 = this.f210424l;
        if (f3 > f4) {
            return f3 / f4 < m224583m() / m224584n() ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: D */
    public final ValueAnimator m224572D(final boolean z) {
        this.f210430r = true;
        final float fM224594x = m224594x();
        if (!z) {
            this.f210428p = this.f210413a.getTranslationX();
            this.f210429q = this.f210413a.getTranslationY();
            this.f210436x = this.f210413a.getScaleX();
        }
        this.f210426n = (this.f210422j + (this.f210420h / 2.0f)) - (m224584n() / 2.0f);
        this.f210427o = (this.f210423k + (this.f210421i / 2.0f)) - (m224583m() / 2.0f);
        this.f210413a.setPivotX(m224584n() / 2.0f);
        this.f210413a.setPivotY(m224583m() / 2.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(180L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.syh0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f171255a.m224590t(z, fM224594x, valueAnimator);
            }
        });
        duration.addListener(new a(z));
        return duration;
    }

    /* JADX INFO: renamed from: E */
    public final ValueAnimator m224573E(final boolean z, ViewGroup viewGroup) {
        View viewM224578h = m224578h((b) this.f210413a, viewGroup);
        this.f210414b = viewM224578h;
        if (!(this.f210413a instanceof b) || viewM224578h == null) {
            return null;
        }
        bnl0.C16067g c16067gM105560i0 = bnl0.m105560i0(viewM224578h);
        this.f210420h = c16067gM105560i0.f77561c;
        this.f210421i = c16067gM105560i0.f77562d;
        this.f210422j = c16067gM105560i0.f77559a;
        this.f210423k = c16067gM105560i0.f77560b - bnl0.m105511F0();
        this.f210414b.postDelayed(new Runnable() { // from class: l.qyh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160149a.m224589s(z);
            }
        }, 10L);
        return m224572D(z);
    }

    /* JADX INFO: renamed from: F */
    public String m224574F() {
        return this.f210415c;
    }

    /* JADX INFO: renamed from: G */
    public ValueAnimator m224575G(ViewGroup viewGroup) {
        return m224573E(true, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public ValueAnimator m224576H(ViewGroup viewGroup) {
        return m224573E(false, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m224577g(@NonNull Canvas canvas) {
        if (this.f210430r) {
            canvas.clipRect(this.f210431s, this.f210432t, this.f210433u, this.f210434v);
        }
    }

    /* JADX INFO: renamed from: h */
    public final View m224578h(final b bVar, ViewGroup viewGroup) {
        return bnl0.m105575q(viewGroup, new qcj() { // from class: l.ryh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22700a.m224563a(bVar, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public float m224579i() {
        return this.f210425m;
    }

    /* JADX INFO: renamed from: j */
    public float m224580j() {
        return this.f210424l;
    }

    /* JADX INFO: renamed from: k */
    public final float m224581k() {
        return m224571C() == 1 ? m224583m() : m224584n() / m224591u();
    }

    /* JADX INFO: renamed from: l */
    public final float m224582l() {
        return m224571C() == 1 ? m224583m() * m224591u() : m224584n();
    }

    /* JADX INFO: renamed from: m */
    public final float m224583m() {
        return this.f210413a.getHeight();
    }

    /* JADX INFO: renamed from: n */
    public final float m224584n() {
        return this.f210413a.getWidth();
    }

    /* JADX INFO: renamed from: o */
    public final void m224585o(float f, float f2) {
        if (m224571C() == 0) {
            float fM224581k = (m224581k() / m224592v()) * m224591u();
            this.f210419g = fM224581k + ((m224583m() - fM224581k) * f);
            this.f210417e = m224584n();
            this.f210416d = 0.0f;
            this.f210418f = (m224583m() - this.f210419g) / 2.0f;
        } else if (m224571C() == 1) {
            float fM224582l = m224582l() / m224592v();
            this.f210419g = fM224582l + ((m224583m() - fM224582l) * f);
            this.f210417e = m224584n();
            this.f210416d = 0.0f;
            this.f210418f = (m224583m() - this.f210419g) / 2.0f;
        } else if (m224571C() == 2) {
            float fM224581k2 = m224581k() * m224592v();
            this.f210417e = fM224581k2 + ((m224584n() - fM224581k2) * f);
            this.f210419g = m224583m();
            this.f210418f = 0.0f;
            this.f210416d = (m224584n() - this.f210417e) / 2.0f;
        }
        float f3 = f2 + ((1.0f - f2) * f);
        this.f210435w = f3;
        m224569A(f3);
        float f4 = 1.0f - f;
        this.f210413a.setTranslationX(this.f210426n * f4);
        this.f210413a.setTranslationY(this.f210427o * f4);
        float f5 = this.f210416d;
        this.f210431s = f5;
        float f6 = this.f210418f;
        this.f210432t = f6;
        this.f210433u = f5 + this.f210417e;
        this.f210434v = f6 + this.f210419g;
        m224586p(f);
    }

    /* JADX INFO: renamed from: p */
    public final void m224586p(float f) {
        View view = this.f210414b;
        if (view != null) {
            view.getLocalVisibleRect(this.f210437y);
        }
        if (this.f210437y.isEmpty()) {
            return;
        }
        Rect rect = this.f210437y;
        int i = rect.left;
        int i2 = rect.right;
        float f2 = rect.top;
        float f3 = rect.bottom;
        float fM224582l = 0.0f;
        float f4 = this.f210421i;
        if (f2 != 0.0f) {
            float f5 = f2 / f4;
            float fM224581k = m224581k();
            if (f == 1.0f) {
                this.f210432t = this.f210418f;
                return;
            }
            if (m224571C() == 2) {
                this.f210432t = ((m224583m() - fM224581k) / 2.0f) + (fM224581k * f5 * (1.0f - f));
                return;
            }
            if (m224571C() == 0) {
                fM224582l = m224591u() * (m224581k() / m224592v());
            } else if (m224571C() == 1) {
                fM224582l = m224582l() / m224592v();
            }
            this.f210432t = this.f210418f + (fM224582l * f5 * (1.0f - f));
            return;
        }
        if (f3 != f4) {
            float f6 = (f4 - f3) / f4;
            float fM224581k2 = m224581k();
            if (f != 1.0f) {
                if (m224571C() == 2) {
                    this.f210434v = (this.f210418f + this.f210419g) - (((m224583m() - fM224581k2) / 2.0f) + ((fM224581k2 * f6) * (1.0f - f)));
                    return;
                }
                if (m224571C() == 0) {
                    fM224582l = m224591u() * (m224581k() / m224592v());
                } else if (m224571C() == 1) {
                    fM224582l = m224582l() / m224592v();
                }
                this.f210434v = (this.f210418f + this.f210419g) - ((fM224582l * f6) * (1.0f - f));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m224587q(float f, float f2) {
        if (m224571C() == 0) {
            this.f210419g = m224583m() - ((m224583m() - ((m224581k() / m224592v()) * m224591u())) * f);
            this.f210417e = m224584n();
            this.f210416d = 0.0f;
            this.f210418f = (m224583m() - this.f210419g) / 2.0f;
        } else if (m224571C() == 1) {
            this.f210419g = m224583m() - ((m224583m() - (m224582l() / m224592v())) * f);
            this.f210417e = m224584n();
            this.f210416d = 0.0f;
            this.f210418f = (m224583m() - this.f210419g) / 2.0f;
        } else if (m224571C() == 2) {
            this.f210417e = m224584n() - ((m224584n() - (m224581k() * m224592v())) * f);
            this.f210419g = m224583m();
            this.f210418f = 0.0f;
            this.f210416d = (m224584n() - this.f210417e) / 2.0f;
        }
        float f3 = this.f210436x;
        float f4 = f3 - ((f3 - f2) * f);
        this.f210435w = f4;
        m224569A(f4);
        View view = this.f210413a;
        float f5 = this.f210428p;
        view.setTranslationX(f5 + ((this.f210426n - f5) * f));
        View view2 = this.f210413a;
        float f6 = this.f210429q;
        view2.setTranslationY(f6 + ((this.f210427o - f6) * f));
        float f7 = this.f210416d;
        this.f210431s = f7;
        float f8 = this.f210418f;
        this.f210432t = f8;
        this.f210433u = f7 + this.f210417e;
        this.f210434v = f8 + this.f210419g;
        m224588r(f);
    }

    /* JADX INFO: renamed from: r */
    public final void m224588r(float f) {
        if (this.f210414b != null && this.f210437y.isEmpty()) {
            this.f210414b.getLocalVisibleRect(this.f210437y);
        }
        if (this.f210437y.isEmpty()) {
            return;
        }
        Rect rect = this.f210437y;
        int i = rect.left;
        int i2 = rect.right;
        float f2 = rect.top;
        float f3 = rect.bottom;
        float fM224582l = 0.0f;
        float f4 = this.f210421i;
        if (f2 != 0.0f) {
            float f5 = f2 / f4;
            float fM224581k = m224581k();
            if (m224571C() == 2) {
                this.f210432t = ((m224583m() - fM224581k) / 2.0f) + (fM224581k * f5 * f);
                return;
            }
            if (m224571C() == 0) {
                fM224582l = m224591u() * (m224581k() / m224592v());
            } else if (m224571C() == 1) {
                fM224582l = m224582l() / m224592v();
            }
            this.f210432t = this.f210418f + (fM224582l * f5 * f);
            return;
        }
        if (f3 != f4) {
            float f6 = (f4 - f3) / f4;
            float fM224581k2 = m224581k();
            if (m224571C() == 2) {
                this.f210434v = (this.f210418f + this.f210419g) - (((m224583m() - fM224581k2) / 2.0f) + ((fM224581k2 * f6) * f));
                return;
            }
            if (m224571C() == 0) {
                fM224582l = m224591u() * (m224581k() / m224592v());
            } else if (m224571C() == 1) {
                fM224582l = m224582l() / m224592v();
            }
            this.f210434v = (this.f210418f + this.f210419g) - ((fM224582l * f6) * f);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m224589s(boolean z) {
        View view = this.f210414b;
        if (view != null) {
            if (z || this.f210429q <= 0.0f) {
                view.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m224590t(boolean z, float f, ValueAnimator valueAnimator) {
        if (z) {
            m224585o(valueAnimator.getAnimatedFraction(), f);
        } else {
            m224587q(valueAnimator.getAnimatedFraction(), f);
        }
        this.f210413a.invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final float m224591u() {
        return this.f210424l / this.f210425m;
    }

    /* JADX INFO: renamed from: v */
    public final float m224592v() {
        return this.f210420h / this.f210421i;
    }

    /* JADX INFO: renamed from: w */
    public final float m224593w() {
        return m224584n() / m224583m();
    }

    /* JADX INFO: renamed from: x */
    public final float m224594x() {
        if (m224593w() > m224591u()) {
            return this.f210420h / (m224583m() * m224591u());
        }
        return this.f210425m > this.f210424l ? this.f210420h / m224584n() : this.f210421i / (m224584n() / m224591u());
    }

    /* JADX INFO: renamed from: y */
    public void m224595y(float f) {
        this.f210425m = f;
    }

    /* JADX INFO: renamed from: z */
    public void m224596z(float f) {
        this.f210424l = f;
    }
}
