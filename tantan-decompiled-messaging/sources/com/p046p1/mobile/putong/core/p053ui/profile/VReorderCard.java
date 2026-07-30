package com.p046p1.mobile.putong.core.p053ui.profile;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.data.Media;
import p149l.bt0;
import p149l.c40;
import p149l.dqk0;
import p149l.fwl;

/* JADX INFO: loaded from: classes4.dex */
public class VReorderCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f33044a;

    /* JADX INFO: renamed from: b */
    public boolean f33045b;

    /* JADX INFO: renamed from: c */
    public dqk0 f33046c;

    /* JADX INFO: renamed from: d */
    public c40 f33047d;

    /* JADX INFO: renamed from: e */
    public int f33048e;

    /* JADX INFO: renamed from: f */
    public int f33049f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f33050g;

    /* JADX INFO: renamed from: h */
    public View f33051h;

    /* JADX INFO: renamed from: i */
    public int f33052i;

    /* JADX INFO: renamed from: j */
    public int f33053j;

    /* JADX INFO: renamed from: k */
    public boolean f33054k;

    /* JADX INFO: renamed from: l */
    public boolean f33055l;

    /* JADX INFO: renamed from: m */
    public fwl f33056m;

    /* JADX INFO: renamed from: n */
    public boolean f33057n;

    /* JADX INFO: renamed from: o */
    public boolean f33058o;

    /* JADX INFO: renamed from: p */
    public boolean f33059p;

    /* JADX INFO: renamed from: q */
    public String f33060q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCard$a */
    public class C8623a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public OvershootInterpolator f33061a = new OvershootInterpolator();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f33062b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f33063c;

        public C8623a(float f, float f2) {
            this.f33062b = f;
            this.f33063c = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VReorderCard vReorderCard = VReorderCard.this;
            int iM50785B = (int) vReorderCard.m50785B(vReorderCard.f33048e);
            VReorderCard vReorderCard2 = VReorderCard.this;
            int iM50786C = (int) vReorderCard2.m50786C(vReorderCard2.f33049f);
            float interpolation = this.f33061a.getInterpolation(animatedFraction);
            float f = (this.f33062b * (1.0f - interpolation)) + (this.f33063c * interpolation);
            VReorderCard.this.f33051h.setScaleX(f);
            VReorderCard.this.f33051h.setScaleY(f);
            VReorderCard vReorderCard3 = VReorderCard.this;
            float f2 = 1.0f - animatedFraction;
            vReorderCard3.setTranslationX((vReorderCard3.getTranslationX() * f2) + (iM50785B * animatedFraction));
            VReorderCard vReorderCard4 = VReorderCard.this;
            vReorderCard4.setTranslationY((vReorderCard4.getTranslationY() * f2) + (animatedFraction * iM50786C));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCard$b */
    public class C8624b implements Animator.AnimatorListener {
        public C8624b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VReorderCard.this.f33050g = null;
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
        this.f33044a = false;
        this.f33045b = true;
        this.f33046c = null;
        this.f33047d = null;
        this.f33057n = true;
        this.f33058o = true;
        this.f33059p = false;
        this.f33060q = "";
    }

    /* JADX INFO: renamed from: A */
    public void m50784A(MotionEvent motionEvent) {
        this.f33044a = true;
        m50789h().setDragging(this.f33044a);
        if (m50789h().m50817n()) {
            this.f33048e = (int) motionEvent.getX();
            this.f33049f = (int) motionEvent.getY();
            this.f33052i = this.f33048e - this.f33046c.m113075b();
            this.f33053j = this.f33049f - this.f33046c.m113076c();
            mo50707w(true);
            m50791j();
            return;
        }
        float scaleX = this.f33051h.getScaleX();
        float f = (m50789h().f33085r * 0.8f) / m50789h().f33086s;
        this.f33050g = ValueAnimator.ofFloat(300.0f);
        this.f33048e = (int) motionEvent.getX();
        this.f33049f = (int) motionEvent.getY();
        this.f33050g.addUpdateListener(new C8623a(scaleX, f));
        this.f33050g.setDuration(200L);
        this.f33050g.addListener(new C8624b());
        this.f33050g.start();
    }

    /* JADX INFO: renamed from: B */
    public float m50785B(float f) {
        return f - (getMeasuredWidth() / 2.0f);
    }

    /* JADX INFO: renamed from: C */
    public float m50786C(float f) {
        return f - (getMeasuredHeight() / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    public void m50787f() {
        this.f33046c.m113074a();
    }

    /* JADX INFO: renamed from: g */
    public void m50788g() {
        this.f33054k = true;
        bt0.m103729b(this, bt0.m103733f(bt0.m103753z(bt0.m103743p(this, "translationX", 0L, 300L, new OvershootInterpolator(1.5f), m50785B(this.f33046c.m113075b())), bt0.m103743p(this, "translationY", 0L, 300L, new OvershootInterpolator(1.5f), m50786C(this.f33046c.m113076c())), bt0.m103739l(this.f33051h, bt0.f77162i, 0L, 300L, new OvershootInterpolator(1.5f), m50803z(1.0f))), new Runnable() { // from class: l.ypk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199461a.m50797q();
            }
        }));
    }

    public String getCurPageId() {
        return this.f33060q;
    }

    /* JADX INFO: renamed from: h */
    public VReorderCards m50789h() {
        return (VReorderCards) getParent();
    }

    /* JADX INFO: renamed from: i */
    public int m50790i() {
        return m50789h().m50812i();
    }

    /* JADX INFO: renamed from: j */
    public final void m50791j() {
        Runnable runnable = new Runnable() { // from class: l.xpk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193926a.m50795o();
            }
        };
        bt0.m103734g(bt0.m103739l(this, bt0.f77162i, 0L, 300L, bt0.f77157d, 1.0f, 1.1f, 1.0f), runnable, runnable).start();
    }

    /* JADX INFO: renamed from: k */
    public void mo50692k(boolean z) {
        this.f33045b = z;
    }

    /* JADX INFO: renamed from: l */
    public void m50792l() {
        dqk0 dqk0Var = this.f33046c;
        mo50692k(true);
        dqk0Var.m113078e();
    }

    /* JADX INFO: renamed from: m */
    public boolean m50793m() {
        return this.f33054k || this.f33055l;
    }

    /* JADX INFO: renamed from: n */
    public boolean m50794n() {
        return this.f33045b;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m50795o() {
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33051h = getChildAt(0);
    }

    /* JADX INFO: renamed from: p */
    public void m50796p(int i, int i2) {
        if (this.f33050g != null) {
            this.f33048e = i;
            this.f33049f = i2;
        } else if (m50789h().m50817n()) {
            setTranslationX(m50785B(i - this.f33052i));
            setTranslationY(m50786C(i2 - this.f33053j));
        } else {
            setTranslationX(m50785B(i));
            setTranslationY(m50786C(i2));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m50797q() {
        this.f33054k = false;
    }

    /* JADX INFO: renamed from: r */
    public void mo50700r(Media media, Runnable runnable) {
    }

    /* JADX INFO: renamed from: s */
    public void m50798s() {
        this.f33055l = false;
    }

    public void setCurPageId(String str) {
        this.f33060q = str;
    }

    public void setMediaOperation(fwl fwlVar) {
        this.f33056m = fwlVar;
    }

    /* JADX INFO: renamed from: t */
    public void m50799t() {
        this.f33054k = false;
        this.f33055l = false;
    }

    /* JADX INFO: renamed from: u */
    public void mo50704u() {
    }

    /* JADX INFO: renamed from: v */
    public int m50800v() {
        return this.f33046c.f87434e;
    }

    /* JADX INFO: renamed from: w */
    public void mo50707w(boolean z) {
    }

    /* JADX INFO: renamed from: x */
    public void m50801x() {
        final VReorderCard vReorderCard;
        ValueAnimator valueAnimator = this.f33050g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f33044a) {
            this.f33051h.animate().translationZ(0.0f);
            this.f33055l = true;
            vReorderCard = this;
            bt0.m103729b(vReorderCard, bt0.m103733f(bt0.m103753z(bt0.m103739l(this.f33051h, bt0.f77162i, 0L, 200L, null, m50803z(1.0f)), bt0.m103743p(this, "translationX", 0L, 200L, null, m50785B(this.f33046c.m113075b())), bt0.m103743p(vReorderCard, "translationY", 0L, 200L, null, vReorderCard.m50786C(vReorderCard.f33046c.m113076c()))), new Runnable() { // from class: l.wpk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187537a.m50798s();
                }
            }));
        } else {
            vReorderCard = this;
        }
        if (vReorderCard.m50789h().m50817n()) {
            vReorderCard.mo50707w(false);
        }
        vReorderCard.f33044a = false;
        vReorderCard.m50789h().setDragging(false);
    }

    /* JADX INFO: renamed from: y */
    public void m50802y() {
        setTranslationX(m50785B(this.f33046c.m113075b()));
        setTranslationY(m50786C(this.f33046c.m113076c()));
        setTranslationZ(0.0f);
        this.f33051h.setScaleX(m50803z(1.0f));
        this.f33051h.setScaleY(m50803z(1.0f));
        m50799t();
    }

    /* JADX INFO: renamed from: z */
    public float m50803z(float f) {
        return (f * this.f33046c.m113081h()) / m50789h().f33086s;
    }

    public VReorderCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33044a = false;
        this.f33045b = true;
        this.f33046c = null;
        this.f33047d = null;
        this.f33057n = true;
        this.f33058o = true;
        this.f33059p = false;
        this.f33060q = "";
    }

    public VReorderCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33044a = false;
        this.f33045b = true;
        this.f33046c = null;
        this.f33047d = null;
        this.f33057n = true;
        this.f33058o = true;
        this.f33059p = false;
        this.f33060q = "";
    }
}
