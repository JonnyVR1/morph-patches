package com.p000p1.mobile.putong.core.p001ui.profile;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.p1.mobile.putong.data.Media;
import l.bt0;
import l.c40;
import l.fwl;
import p002l.dqk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class VReorderCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f866a;

    /* JADX INFO: renamed from: b */
    public boolean f867b;

    /* JADX INFO: renamed from: c */
    public dqk0 f868c;

    /* JADX INFO: renamed from: d */
    public c40 f869d;

    /* JADX INFO: renamed from: e */
    public int f870e;

    /* JADX INFO: renamed from: f */
    public int f871f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f872g;

    /* JADX INFO: renamed from: h */
    public View f873h;

    /* JADX INFO: renamed from: i */
    public int f874i;

    /* JADX INFO: renamed from: j */
    public int f875j;

    /* JADX INFO: renamed from: k */
    public boolean f876k;

    /* JADX INFO: renamed from: l */
    public boolean f877l;

    /* JADX INFO: renamed from: m */
    public fwl f878m;

    /* JADX INFO: renamed from: n */
    public boolean f879n;

    /* JADX INFO: renamed from: o */
    public boolean f880o;

    /* JADX INFO: renamed from: p */
    public boolean f881p;

    /* JADX INFO: renamed from: q */
    public String f882q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCard$a */
    public class C0048a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public OvershootInterpolator f883a = new OvershootInterpolator();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f884b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f885c;

        public C0048a(float f, float f2) {
            this.f884b = f;
            this.f885c = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VReorderCard vReorderCard = VReorderCard.this;
            int iM1231B = (int) vReorderCard.m1231B(vReorderCard.f870e);
            VReorderCard vReorderCard2 = VReorderCard.this;
            int iM1232C = (int) vReorderCard2.m1232C(vReorderCard2.f871f);
            float interpolation = this.f883a.getInterpolation(animatedFraction);
            float f = (this.f884b * (1.0f - interpolation)) + (this.f885c * interpolation);
            VReorderCard.this.f873h.setScaleX(f);
            VReorderCard.this.f873h.setScaleY(f);
            VReorderCard vReorderCard3 = VReorderCard.this;
            float f2 = 1.0f - animatedFraction;
            vReorderCard3.setTranslationX((vReorderCard3.getTranslationX() * f2) + (iM1231B * animatedFraction));
            VReorderCard vReorderCard4 = VReorderCard.this;
            vReorderCard4.setTranslationY((vReorderCard4.getTranslationY() * f2) + (animatedFraction * iM1232C));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.VReorderCard$b */
    public class C0049b implements Animator.AnimatorListener {
        public C0049b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VReorderCard.this.f872g = null;
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
        this.f866a = false;
        this.f867b = true;
        this.f868c = null;
        this.f869d = null;
        this.f879n = true;
        this.f880o = true;
        this.f881p = false;
        this.f882q = "";
    }

    /* JADX INFO: renamed from: A */
    public void m1230A(MotionEvent motionEvent) {
        this.f866a = true;
        m1235h().setDragging(this.f866a);
        if (m1235h().m1263n()) {
            this.f870e = (int) motionEvent.getX();
            this.f871f = (int) motionEvent.getY();
            this.f874i = this.f870e - this.f868c.m11994b();
            this.f875j = this.f871f - this.f868c.m11995c();
            mo1143w(true);
            m1237j();
            return;
        }
        float scaleX = this.f873h.getScaleX();
        float f = (m1235h().f907r * 0.8f) / m1235h().f908s;
        this.f872g = ValueAnimator.ofFloat(300.0f);
        this.f870e = (int) motionEvent.getX();
        this.f871f = (int) motionEvent.getY();
        this.f872g.addUpdateListener(new C0048a(scaleX, f));
        this.f872g.setDuration(200L);
        this.f872g.addListener(new C0049b());
        this.f872g.start();
    }

    /* JADX INFO: renamed from: B */
    public float m1231B(float f) {
        return f - (getMeasuredWidth() / 2.0f);
    }

    /* JADX INFO: renamed from: C */
    public float m1232C(float f) {
        return f - (getMeasuredHeight() / 2.0f);
    }

    /* JADX INFO: renamed from: f */
    public void m1233f() {
        this.f868c.m11993a();
    }

    /* JADX INFO: renamed from: g */
    public void m1234g() {
        this.f876k = true;
        bt0.b(this, bt0.f(bt0.z(new Animator[]{bt0.p(this, "translationX", 0L, 300L, new OvershootInterpolator(1.5f), new float[]{m1231B(this.f868c.m11994b())}), bt0.p(this, "translationY", 0L, 300L, new OvershootInterpolator(1.5f), new float[]{m1232C(this.f868c.m11995c())}), bt0.l(this.f873h, bt0.i, 0L, 300L, new OvershootInterpolator(1.5f), new float[]{m1249z(1.0f)})}), new Runnable() { // from class: l.ypk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23033a.m1243q();
            }
        }));
    }

    public String getCurPageId() {
        return this.f882q;
    }

    /* JADX INFO: renamed from: h */
    public VReorderCards m1235h() {
        return (VReorderCards) getParent();
    }

    /* JADX INFO: renamed from: i */
    public int m1236i() {
        return m1235h().m1258i();
    }

    /* JADX INFO: renamed from: j */
    public final void m1237j() {
        Runnable runnable = new Runnable() { // from class: l.xpk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22398a.m1241o();
            }
        };
        bt0.g(bt0.l(this, bt0.i, 0L, 300L, bt0.d, new float[]{1.0f, 1.1f, 1.0f}), runnable, runnable).start();
    }

    /* JADX INFO: renamed from: k */
    public void mo1128k(boolean z) {
        this.f867b = z;
    }

    /* JADX INFO: renamed from: l */
    public void m1238l() {
        dqk0 dqk0Var = this.f868c;
        mo1128k(true);
        dqk0Var.m11997e();
    }

    /* JADX INFO: renamed from: m */
    public boolean m1239m() {
        return this.f876k || this.f877l;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1240n() {
        return this.f867b;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m1241o() {
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f873h = getChildAt(0);
    }

    /* JADX INFO: renamed from: p */
    public void m1242p(int i, int i2) {
        if (this.f872g != null) {
            this.f870e = i;
            this.f871f = i2;
        } else if (m1235h().m1263n()) {
            setTranslationX(m1231B(i - this.f874i));
            setTranslationY(m1232C(i2 - this.f875j));
        } else {
            setTranslationX(m1231B(i));
            setTranslationY(m1232C(i2));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1243q() {
        this.f876k = false;
    }

    /* JADX INFO: renamed from: r */
    public void mo1136r(Media media, Runnable runnable) {
    }

    /* JADX INFO: renamed from: s */
    public void m1244s() {
        this.f877l = false;
    }

    public void setCurPageId(String str) {
        this.f882q = str;
    }

    public void setMediaOperation(fwl fwlVar) {
        this.f878m = fwlVar;
    }

    /* JADX INFO: renamed from: t */
    public void m1245t() {
        this.f876k = false;
        this.f877l = false;
    }

    /* JADX INFO: renamed from: u */
    public void mo1140u() {
    }

    /* JADX INFO: renamed from: v */
    public int m1246v() {
        return this.f868c.f9398e;
    }

    /* JADX INFO: renamed from: w */
    public void mo1143w(boolean z) {
    }

    /* JADX INFO: renamed from: x */
    public void m1247x() {
        final VReorderCard vReorderCard;
        ValueAnimator valueAnimator = this.f872g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f866a) {
            this.f873h.animate().translationZ(0.0f);
            this.f877l = true;
            vReorderCard = this;
            bt0.b(vReorderCard, bt0.f(bt0.z(new Animator[]{bt0.l(this.f873h, bt0.i, 0L, 200L, (Interpolator) null, new float[]{m1249z(1.0f)}), bt0.p(this, "translationX", 0L, 200L, (Interpolator) null, new float[]{m1231B(this.f868c.m11994b())}), bt0.p(vReorderCard, "translationY", 0L, 200L, (Interpolator) null, new float[]{vReorderCard.m1232C(vReorderCard.f868c.m11995c())})}), new Runnable() { // from class: l.wpk0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21905a.m1244s();
                }
            }));
        } else {
            vReorderCard = this;
        }
        if (vReorderCard.m1235h().m1263n()) {
            vReorderCard.mo1143w(false);
        }
        vReorderCard.f866a = false;
        vReorderCard.m1235h().setDragging(false);
    }

    /* JADX INFO: renamed from: y */
    public void m1248y() {
        setTranslationX(m1231B(this.f868c.m11994b()));
        setTranslationY(m1232C(this.f868c.m11995c()));
        setTranslationZ(0.0f);
        this.f873h.setScaleX(m1249z(1.0f));
        this.f873h.setScaleY(m1249z(1.0f));
        m1245t();
    }

    /* JADX INFO: renamed from: z */
    public float m1249z(float f) {
        return (f * this.f868c.m12000h()) / m1235h().f908s;
    }

    public VReorderCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f866a = false;
        this.f867b = true;
        this.f868c = null;
        this.f869d = null;
        this.f879n = true;
        this.f880o = true;
        this.f881p = false;
        this.f882q = "";
    }

    public VReorderCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f866a = false;
        this.f867b = true;
        this.f868c = null;
        this.f869d = null;
        this.f879n = true;
        this.f880o = true;
        this.f881p = false;
        this.f882q = "";
    }
}
