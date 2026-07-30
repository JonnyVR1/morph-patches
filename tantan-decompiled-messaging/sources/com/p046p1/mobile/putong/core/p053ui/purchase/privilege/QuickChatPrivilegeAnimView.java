package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p149l.d3c0;
import p149l.e30;
import p149l.gxb0;
import p149l.m6c0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class QuickChatPrivilegeAnimView extends ConstraintLayout {

    /* JADX INFO: renamed from: s */
    public static final LinearInterpolator f35140s = new LinearInterpolator();

    /* JADX INFO: renamed from: t */
    public static final InterpolatorC8803d f35141t = new InterpolatorC8803d(0.5f);

    /* JADX INFO: renamed from: u */
    public static long f35142u = 550;

    /* JADX INFO: renamed from: d */
    public Guideline f35143d;

    /* JADX INFO: renamed from: e */
    public Guideline f35144e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f35145f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f35146g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f35147h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f35148i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f35149j;

    /* JADX INFO: renamed from: k */
    public TextView f35150k;

    /* JADX INFO: renamed from: l */
    public ImageView f35151l;

    /* JADX INFO: renamed from: m */
    public ImageView f35152m;

    /* JADX INFO: renamed from: n */
    public ImageView f35153n;

    /* JADX INFO: renamed from: o */
    public ImageView f35154o;

    /* JADX INFO: renamed from: p */
    public ImageView f35155p;

    /* JADX INFO: renamed from: q */
    public View f35156q;

    /* JADX INFO: renamed from: r */
    public boolean f35157r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$a */
    public class C8800a extends AnimatorListenerAdapter {
        public C8800a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            QuickChatPrivilegeAnimView.this.m54312w0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208345M0(QuickChatPrivilegeAnimView.this.f35145f, true);
            xdl0.m208345M0(QuickChatPrivilegeAnimView.this.f35147h, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$b */
    public class C8801b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f35159a;

        public C8801b(View view) {
            this.f35159a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f35159a;
            QuickChatPrivilegeAnimView quickChatPrivilegeAnimView = QuickChatPrivilegeAnimView.this;
            if (view == quickChatPrivilegeAnimView.f35151l) {
                quickChatPrivilegeAnimView.m54311v0();
            }
            QuickChatPrivilegeAnimView.this.m54313y0(this.f35159a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            xdl0.m208345M0(this.f35159a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$c */
    public class C8802c extends AnimatorListenerAdapter {
        public C8802c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            xdl0.m208344M(QuickChatPrivilegeAnimView.this.f35149j, false);
            QuickChatPrivilegeAnimView.this.f35157r = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$d */
    public static class InterpolatorC8803d implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f35162a;

        public InterpolatorC8803d(float f) {
            this.f35162a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f35162a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public QuickChatPrivilegeAnimView(Context context) {
        super(context);
        this.f35157r = false;
        init();
    }

    private void init() {
        m54306m0(o7r.m163037a(getContext()).inflate(m6c0.f131600h3, this));
        if (xdl0.m208408w0() < 960) {
            m54305s0();
        }
        this.f35155p.setImageResource(d3c0.f83856b0);
        this.f35151l.setImageResource(d3c0.f83878c8);
        this.f35152m.setImageResource(d3c0.f83850a8);
        this.f35153n.setImageResource(d3c0.f83864b8);
        this.f35154o.setImageResource(d3c0.f83892d8);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        this.f35146g.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
        if (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "female")) {
            m54302p0();
            return;
        }
        if (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
            m54303q0();
        } else if (TEnum.equals(userM169527p9.gender, "female")) {
            m54303q0();
        } else {
            m54302p0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m54302p0() {
        qib0.f154691G.m102354Y0(this.f35148i, d3c0.f83840Zb);
        qib0.f154691G.m102354Y0(this.f35149j, d3c0.f83854ac);
    }

    /* JADX INFO: renamed from: q0 */
    private void m54303q0() {
        qib0.f154691G.m102354Y0(this.f35148i, d3c0.f83868bc);
        qib0.f154691G.m102354Y0(this.f35149j, d3c0.f83882cc);
    }

    /* JADX INFO: renamed from: r0 */
    private void m54304r0() {
        this.f35155p.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: s0 */
    private void m54305s0() {
        int iM186890d = t100.m186890d(70.0f);
        int iM186890d2 = t100.m186890d(84.0f);
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f35155p.getLayoutParams();
        int i = t100.f167275x;
        ((ViewGroup.MarginLayoutParams) c0220a).width = i;
        ((ViewGroup.MarginLayoutParams) c0220a).height = i;
        this.f35155p.setLayoutParams(c0220a);
        ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f35145f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a2).width = iM186890d2;
        ((ViewGroup.MarginLayoutParams) c0220a2).height = iM186890d2;
        this.f35145f.setLayoutParams(c0220a2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35146g.getLayoutParams();
        layoutParams.width = iM186890d;
        layoutParams.height = iM186890d;
        this.f35146g.setLayoutParams(layoutParams);
        ConstraintLayout.C0220a c0220a3 = (ConstraintLayout.C0220a) this.f35147h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a3).width = iM186890d2;
        ((ViewGroup.MarginLayoutParams) c0220a3).height = iM186890d2;
        this.f35147h.setLayoutParams(c0220a3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35148i.getLayoutParams();
        layoutParams2.width = iM186890d;
        layoutParams2.height = iM186890d;
        this.f35148i.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35149j.getLayoutParams();
        layoutParams3.width = iM186890d;
        layoutParams3.height = iM186890d;
        this.f35149j.setLayoutParams(layoutParams3);
        this.f35143d.setGuidelinePercent(0.46f);
        this.f35144e.setGuidelinePercent(0.54f);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m54306m0(View view) {
        gxb0.m128542a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final ObjectAnimator m54307n0(View view, long j, boolean z) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(BLiveGiftItem.TYPE_ROTATION, z ? -30.0f : 30.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f)).setDuration(350L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.setStartDelay(j);
        duration.addListener(new C8801b(view));
        return duration;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m54308o0(int i, int[] iArr) {
        int i2 = iArr[0];
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35145f, "translationX", -this.f35145f.getRight(), 0.0f);
        InterpolatorC8803d interpolatorC8803d = f35141t;
        objectAnimatorOfFloat.setInterpolator(interpolatorC8803d);
        objectAnimatorOfFloat.setDuration(650L);
        FrameLayout frameLayout = this.f35147h;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, "translationX", i2 - frameLayout.getLeft(), 0.0f);
        objectAnimatorOfFloat2.setDuration(650L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f35155p, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(f35140s);
        objectAnimatorOfFloat3.setDuration(150L);
        objectAnimatorOfFloat3.setStartDelay(500L);
        objectAnimatorOfFloat2.setInterpolator(interpolatorC8803d);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setStartDelay(i);
        animatorSet.addListener(new C8800a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: t0 */
    public void m54309t0() {
        m54310u0(250);
    }

    /* JADX INFO: renamed from: u0 */
    public void m54310u0(final int i) {
        if (this.f35157r) {
            return;
        }
        m54304r0();
        this.f35157r = true;
        xdl0.m208353Q0(this.f35156q, new e30() { // from class: l.fxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99747a.m54308o0(i, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m54311v0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35149j, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f35140s);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.addListener(new C8802c());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m54312w0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m54307n0(this.f35151l, 0L, true), m54307n0(this.f35153n, f35142u, false), m54307n0(this.f35152m, f35142u * 2, true), m54307n0(this.f35154o, f35142u * 3, false));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m54313y0(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f35140s);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setStartDelay(350L);
        objectAnimatorOfFloat.start();
    }

    public QuickChatPrivilegeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35157r = false;
        init();
    }

    public QuickChatPrivilegeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35157r = false;
        init();
    }
}
