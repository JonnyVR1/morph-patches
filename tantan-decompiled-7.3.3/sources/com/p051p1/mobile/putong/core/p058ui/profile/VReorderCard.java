package com.p051p1.mobile.putong.core.p058ui.profile;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.data.Media;
import p153l.gt0;
import p153l.jzk0;
import p153l.w30;
import p153l.xyl;

/* JADX INFO: loaded from: classes4.dex */
public class VReorderCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f33892a;

    /* JADX INFO: renamed from: b */
    public boolean f33893b;

    /* JADX INFO: renamed from: c */
    public jzk0 f33894c;

    /* JADX INFO: renamed from: d */
    public w30 f33895d;

    /* JADX INFO: renamed from: e */
    public int f33896e;

    /* JADX INFO: renamed from: f */
    public int f33897f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f33898g;

    /* JADX INFO: renamed from: h */
    public View f33899h;

    /* JADX INFO: renamed from: i */
    public int f33900i;

    /* JADX INFO: renamed from: j */
    public int f33901j;

    /* JADX INFO: renamed from: k */
    public boolean f33902k;

    /* JADX INFO: renamed from: l */
    public boolean f33903l;

    /* JADX INFO: renamed from: m */
    public xyl f33904m;

    /* JADX INFO: renamed from: n */
    public boolean f33905n;

    /* JADX INFO: renamed from: o */
    public boolean f33906o;

    /* JADX INFO: renamed from: p */
    public boolean f33907p;

    /* JADX INFO: renamed from: q */
    public String f33908q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCard$a */
    public class C8786a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public OvershootInterpolator f33909a = new OvershootInterpolator();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f33910b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f33911c;

        public C8786a(float f, float f2) {
            this.f33910b = f;
            this.f33911c = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VReorderCard vReorderCard = VReorderCard.this;
            int iM51968B = (int) vReorderCard.m51968B(vReorderCard.f33896e);
            VReorderCard vReorderCard2 = VReorderCard.this;
            int iM51969C = (int) vReorderCard2.m51969C(vReorderCard2.f33897f);
            float interpolation = this.f33909a.getInterpolation(animatedFraction);
            float f = (this.f33910b * (1.0f - interpolation)) + (this.f33911c * interpolation);
            VReorderCard.this.f33899h.setScaleX(f);
            VReorderCard.this.f33899h.setScaleY(f);
            VReorderCard vReorderCard3 = VReorderCard.this;
            float f2 = 1.0f - animatedFraction;
            vReorderCard3.setTranslationX((vReorderCard3.getTranslationX() * f2) + (iM51968B * animatedFraction));
            VReorderCard vReorderCard4 = VReorderCard.this;
            vReorderCard4.setTranslationY((vReorderCard4.getTranslationY() * f2) + (animatedFraction * iM51969C));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCard$b */
    public class C8787b implements Animator.AnimatorListener {
        public C8787b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VReorderCard.this.f33898g = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public VReorderCard(Context context) {
        super(context);
        this.f33892a = false;
        this.f33893b = true;
        this.f33894c = null;
        this.f33895d = null;
        this.f33905n = true;
        this.f33906o = true;
        this.f33907p = false;
        this.f33908q = "";
    }

    /* JADX INFO: renamed from: A */
    public void m51967A(MotionEvent motionEvent) {
        this.f33892a = true;
        m51972h().setDragging(this.f33892a);
        if (m51972h().m52000n()) {
            this.f33896e = (int) motionEvent.getX();
            this.f33897f = (int) motionEvent.getY();
            this.f33900i = this.f33896e - this.f33894c.m147664b();
            this.f33901j = this.f33897f - this.f33894c.m147665c();
            mo51890w(true);
            m51974j();
            return;
        }
        float scaleX = this.f33899h.getScaleX();
        float f = (m51972h().f33933r * 0.8f) / m51972h().f33934s;
        this.f33898g = ValueAnimator.ofFloat(300.0f);
        this.f33896e = (int) motionEvent.getX();
        this.f33897f = (int) motionEvent.getY();
        this.f33898g.addUpdateListener(new C8786a(scaleX, f));
        this.f33898g.setDuration(200L);
        this.f33898g.addListener(new C8787b());
        this.f33898g.start();
    }

    /* JADX INFO: renamed from: B */
    public float m51968B(float f) {
        return f - (getMeasuredWidth() / 2.0f);
    }

    /* JADX INFO: renamed from: C */
    public float m51969C(float f) {
        return f - (getMeasuredHeight() / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    public void m51970f() {
        this.f33894c.m147663a();
    }

    /* JADX INFO: renamed from: g */
    public void m51971g() {
        this.f33902k = true;
        gt0.m132156b(this, gt0.m132160f(gt0.m132180z(gt0.m132170p(this, "translationX", 0L, 300L, new OvershootInterpolator(1.5f), m51968B(this.f33894c.m147664b())), gt0.m132170p(this, "translationY", 0L, 300L, new OvershootInterpolator(1.5f), m51969C(this.f33894c.m147665c())), gt0.m132166l(this.f33899h, gt0.f106354i, 0L, 300L, new OvershootInterpolator(1.5f), m51986z(1.0f))), new Runnable() { // from class: l.ezk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96606a.m51980q();
            }
        }));
    }

    public String getCurPageId() {
        return this.f33908q;
    }

    /* JADX INFO: renamed from: h */
    public VReorderCards m51972h() {
        return (VReorderCards) getParent();
    }

    /* JADX INFO: renamed from: i */
    public int m51973i() {
        return m51972h().m51995i();
    }

    /* JADX INFO: renamed from: j */
    public final void m51974j() {
        Runnable runnable = new Runnable() { // from class: l.dzk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91369a.m51978o();
            }
        };
        gt0.m132161g(gt0.m132166l(this, gt0.f106354i, 0L, 300L, gt0.f106349d, 1.0f, 1.1f, 1.0f), runnable, runnable).start();
    }

    /* JADX INFO: renamed from: k */
    public void mo51875k(boolean z) {
        this.f33893b = z;
    }

    /* JADX INFO: renamed from: l */
    public void m51975l() {
        jzk0 jzk0Var = this.f33894c;
        mo51875k(true);
        jzk0Var.m147667e();
    }

    /* JADX INFO: renamed from: m */
    public boolean m51976m() {
        return this.f33902k || this.f33903l;
    }

    /* JADX INFO: renamed from: n */
    public boolean m51977n() {
        return this.f33893b;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m51978o() {
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33899h = getChildAt(0);
    }

    /* JADX INFO: renamed from: p */
    public void m51979p(int i, int i2) {
        if (this.f33898g != null) {
            this.f33896e = i;
            this.f33897f = i2;
        } else if (m51972h().m52000n()) {
            setTranslationX(m51968B(i - this.f33900i));
            setTranslationY(m51969C(i2 - this.f33901j));
        } else {
            setTranslationX(m51968B(i));
            setTranslationY(m51969C(i2));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m51980q() {
        this.f33902k = false;
    }

    /* JADX INFO: renamed from: r */
    public void mo51883r(Media media, Runnable runnable) {
    }

    /* JADX INFO: renamed from: s */
    public void m51981s() {
        this.f33903l = false;
    }

    public void setCurPageId(String str) {
        this.f33908q = str;
    }

    public void setMediaOperation(xyl xylVar) {
        this.f33904m = xylVar;
    }

    /* JADX INFO: renamed from: t */
    public void m51982t() {
        this.f33902k = false;
        this.f33903l = false;
    }

    /* JADX INFO: renamed from: u */
    public void mo51887u() {
    }

    /* JADX INFO: renamed from: v */
    public int m51983v() {
        return this.f33894c.f123274e;
    }

    /* JADX INFO: renamed from: w */
    public void mo51890w(boolean z) {
    }

    /* JADX INFO: renamed from: x */
    public void m51984x() {
        final VReorderCard vReorderCard;
        ValueAnimator valueAnimator = this.f33898g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f33892a) {
            this.f33899h.animate().translationZ(0.0f);
            this.f33903l = true;
            vReorderCard = this;
            gt0.m132156b(vReorderCard, gt0.m132160f(gt0.m132180z(gt0.m132166l(this.f33899h, gt0.f106354i, 0L, 200L, null, m51986z(1.0f)), gt0.m132170p(this, "translationX", 0L, 200L, null, m51968B(this.f33894c.m147664b())), gt0.m132170p(vReorderCard, "translationY", 0L, 200L, null, vReorderCard.m51969C(vReorderCard.f33894c.m147665c()))), new Runnable() { // from class: l.czk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84482a.m51981s();
                }
            }));
        } else {
            vReorderCard = this;
        }
        if (vReorderCard.m51972h().m52000n()) {
            vReorderCard.mo51890w(false);
        }
        vReorderCard.f33892a = false;
        vReorderCard.m51972h().setDragging(false);
    }

    /* JADX INFO: renamed from: y */
    public void m51985y() {
        setTranslationX(m51968B(this.f33894c.m147664b()));
        setTranslationY(m51969C(this.f33894c.m147665c()));
        setTranslationZ(0.0f);
        this.f33899h.setScaleX(m51986z(1.0f));
        this.f33899h.setScaleY(m51986z(1.0f));
        m51982t();
    }

    /* JADX INFO: renamed from: z */
    public float m51986z(float f) {
        return (f * this.f33894c.m147670h()) / m51972h().f33934s;
    }

    public VReorderCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33892a = false;
        this.f33893b = true;
        this.f33894c = null;
        this.f33895d = null;
        this.f33905n = true;
        this.f33906o = true;
        this.f33907p = false;
        this.f33908q = "";
    }

    public VReorderCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33892a = false;
        this.f33893b = true;
        this.f33894c = null;
        this.f33895d = null;
        this.f33905n = true;
        this.f33906o = true;
        this.f33907p = false;
        this.f33908q = "";
    }
}
