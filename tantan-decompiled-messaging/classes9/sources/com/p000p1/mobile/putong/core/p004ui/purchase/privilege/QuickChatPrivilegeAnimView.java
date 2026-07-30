package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.d3c0;
import l.e30;
import l.gxb0;
import l.m6c0;
import l.o7r;
import l.t100;
import l.xdl0;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class QuickChatPrivilegeAnimView extends ConstraintLayout {

    /* JADX INFO: renamed from: s */
    public static final LinearInterpolator f4921s = new LinearInterpolator();

    /* JADX INFO: renamed from: t */
    public static final InterpolatorC0239d f4922t = new InterpolatorC0239d(0.5f);

    /* JADX INFO: renamed from: u */
    public static long f4923u = 550;

    /* JADX INFO: renamed from: d */
    public Guideline f4924d;

    /* JADX INFO: renamed from: e */
    public Guideline f4925e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f4926f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f4927g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f4928h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4929i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f4930j;

    /* JADX INFO: renamed from: k */
    public TextView f4931k;

    /* JADX INFO: renamed from: l */
    public ImageView f4932l;

    /* JADX INFO: renamed from: m */
    public ImageView f4933m;

    /* JADX INFO: renamed from: n */
    public ImageView f4934n;

    /* JADX INFO: renamed from: o */
    public ImageView f4935o;

    /* JADX INFO: renamed from: p */
    public ImageView f4936p;

    /* JADX INFO: renamed from: q */
    public View f4937q;

    /* JADX INFO: renamed from: r */
    public boolean f4938r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$a */
    public class C0236a extends AnimatorListenerAdapter {
        public C0236a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            QuickChatPrivilegeAnimView.this.m7647w0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M0(QuickChatPrivilegeAnimView.this.f4926f, true);
            xdl0.M0(QuickChatPrivilegeAnimView.this.f4928h, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$b */
    public class C0237b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f4940a;

        public C0237b(View view) {
            this.f4940a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f4940a;
            QuickChatPrivilegeAnimView quickChatPrivilegeAnimView = QuickChatPrivilegeAnimView.this;
            if (view == quickChatPrivilegeAnimView.f4932l) {
                quickChatPrivilegeAnimView.m7646v0();
            }
            QuickChatPrivilegeAnimView.this.m7648y0(this.f4940a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.M0(this.f4940a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$c */
    public class C0238c extends AnimatorListenerAdapter {
        public C0238c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            xdl0.M(QuickChatPrivilegeAnimView.this.f4930j, false);
            QuickChatPrivilegeAnimView.this.f4938r = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$d */
    public static class InterpolatorC0239d implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f4943a;

        public InterpolatorC0239d(float f) {
            this.f4943a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f4943a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public QuickChatPrivilegeAnimView(Context context) {
        super(context);
        this.f4938r = false;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        m7641m0(o7r.a(getContext()).inflate(m6c0.h3, (ViewGroup) this));
        if (xdl0.w0() < 960) {
            m7640s0();
        }
        this.f4936p.setImageResource(d3c0.b0);
        this.f4932l.setImageResource(d3c0.c8);
        this.f4933m.setImageResource(d3c0.a8);
        this.f4934n.setImageResource(d3c0.b8);
        this.f4935o.setImageResource(d3c0.d8);
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        this.f4927g.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
        if (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "female")) {
            m7637p0();
            return;
        }
        if (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "male")) {
            m7638q0();
        } else if (TEnum.equals(userM21490p9.gender, "female")) {
            m7638q0();
        } else {
            m7637p0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m7637p0() {
        qib0.f19782G.m12767Y0(this.f4929i, d3c0.Zb);
        qib0.f19782G.m12767Y0(this.f4930j, d3c0.ac);
    }

    /* JADX INFO: renamed from: q0 */
    private void m7638q0() {
        qib0.f19782G.m12767Y0(this.f4929i, d3c0.bc);
        qib0.f19782G.m12767Y0(this.f4930j, d3c0.cc);
    }

    /* JADX INFO: renamed from: r0 */
    private void m7639r0() {
        this.f4936p.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: s0 */
    private void m7640s0() {
        int iD = t100.d(70.0f);
        int iD2 = t100.d(84.0f);
        ConstraintLayout.a layoutParams = this.f4936p.getLayoutParams();
        int i = t100.x;
        ((ViewGroup.MarginLayoutParams) layoutParams).width = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = i;
        this.f4936p.setLayoutParams(layoutParams);
        ConstraintLayout.a layoutParams2 = this.f4926f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = iD2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = iD2;
        this.f4926f.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f4927g.getLayoutParams();
        layoutParams3.width = iD;
        layoutParams3.height = iD;
        this.f4927g.setLayoutParams(layoutParams3);
        ConstraintLayout.a layoutParams4 = this.f4928h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = iD2;
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = iD2;
        this.f4928h.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f4929i.getLayoutParams();
        layoutParams5.width = iD;
        layoutParams5.height = iD;
        this.f4929i.setLayoutParams(layoutParams5);
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.f4930j.getLayoutParams();
        layoutParams6.width = iD;
        layoutParams6.height = iD;
        this.f4930j.setLayoutParams(layoutParams6);
        this.f4924d.setGuidelinePercent(0.46f);
        this.f4925e.setGuidelinePercent(0.54f);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7641m0(View view) {
        gxb0.a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final ObjectAnimator m7642n0(View view, long j, boolean z) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("rotation", z ? -30.0f : 30.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f)).setDuration(350L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.setStartDelay(j);
        duration.addListener(new C0237b(view));
        return duration;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m7643o0(int i, int[] iArr) {
        int i2 = iArr[0];
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4926f, "translationX", -this.f4926f.getRight(), 0.0f);
        InterpolatorC0239d interpolatorC0239d = f4922t;
        objectAnimatorOfFloat.setInterpolator(interpolatorC0239d);
        objectAnimatorOfFloat.setDuration(650L);
        FrameLayout frameLayout = this.f4928h;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, "translationX", i2 - frameLayout.getLeft(), 0.0f);
        objectAnimatorOfFloat2.setDuration(650L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f4936p, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(f4921s);
        objectAnimatorOfFloat3.setDuration(150L);
        objectAnimatorOfFloat3.setStartDelay(500L);
        objectAnimatorOfFloat2.setInterpolator(interpolatorC0239d);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setStartDelay(i);
        animatorSet.addListener(new C0236a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: t0 */
    public void m7644t0() {
        m7645u0(250);
    }

    /* JADX INFO: renamed from: u0 */
    public void m7645u0(final int i) {
        if (this.f4938r) {
            return;
        }
        m7639r0();
        this.f4938r = true;
        xdl0.Q0(this.f4937q, new e30() { // from class: l.fxb0
            public final void call(Object obj) {
                this.f12958a.m7643o0(i, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m7646v0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4930j, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f4921s);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.addListener(new C0238c());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m7647w0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m7642n0(this.f4932l, 0L, true), m7642n0(this.f4934n, f4923u, false), m7642n0(this.f4933m, f4923u * 2, true), m7642n0(this.f4935o, f4923u * 3, false));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m7648y0(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f4921s);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setStartDelay(350L);
        objectAnimatorOfFloat.start();
    }

    public QuickChatPrivilegeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4938r = false;
        init();
    }

    public QuickChatPrivilegeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4938r = false;
        init();
    }
}
