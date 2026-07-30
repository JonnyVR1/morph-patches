package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.jbc0;
import p153l.k5c0;
import p153l.p9r;
import p153l.qa00;
import p153l.rec0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class QuickChatPrivilegeAnimView extends ConstraintLayout {

    /* JADX INFO: renamed from: s */
    public static final LinearInterpolator f35988s = new LinearInterpolator();

    /* JADX INFO: renamed from: t */
    public static final InterpolatorC8966d f35989t = new InterpolatorC8966d(0.5f);

    /* JADX INFO: renamed from: u */
    public static long f35990u = 550;

    /* JADX INFO: renamed from: d */
    public Guideline f35991d;

    /* JADX INFO: renamed from: e */
    public Guideline f35992e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f35993f;

    /* JADX INFO: renamed from: g */
    public AutoVDraweeView f35994g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f35995h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f35996i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f35997j;

    /* JADX INFO: renamed from: k */
    public TextView f35998k;

    /* JADX INFO: renamed from: l */
    public ImageView f35999l;

    /* JADX INFO: renamed from: m */
    public ImageView f36000m;

    /* JADX INFO: renamed from: n */
    public ImageView f36001n;

    /* JADX INFO: renamed from: o */
    public ImageView f36002o;

    /* JADX INFO: renamed from: p */
    public ImageView f36003p;

    /* JADX INFO: renamed from: q */
    public View f36004q;

    /* JADX INFO: renamed from: r */
    public boolean f36005r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$a */
    public class C8963a extends AnimatorListenerAdapter {
        public C8963a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            QuickChatPrivilegeAnimView.this.m55495w0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105525M0(QuickChatPrivilegeAnimView.this.f35993f, true);
            bnl0.m105525M0(QuickChatPrivilegeAnimView.this.f35995h, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$b */
    public class C8964b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f36007a;

        public C8964b(View view) {
            this.f36007a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f36007a;
            QuickChatPrivilegeAnimView quickChatPrivilegeAnimView = QuickChatPrivilegeAnimView.this;
            if (view == quickChatPrivilegeAnimView.f35999l) {
                quickChatPrivilegeAnimView.m55494v0();
            }
            QuickChatPrivilegeAnimView.this.m55496y0(this.f36007a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            bnl0.m105525M0(this.f36007a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$c */
    public class C8965c extends AnimatorListenerAdapter {
        public C8965c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            bnl0.m105524M(QuickChatPrivilegeAnimView.this.f35997j, false);
            QuickChatPrivilegeAnimView.this.f36005r = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView$d */
    public static class InterpolatorC8966d implements Interpolator {

        /* JADX INFO: renamed from: a */
        public float f36010a;

        public InterpolatorC8966d(float f) {
            this.f36010a = f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            double dPow = Math.pow(2.0d, (-10.0f) * f);
            float f2 = this.f36010a;
            return (float) ((dPow * Math.sin((((double) (f - (f2 / 4.0f))) * 6.283185307179586d) / ((double) f2))) + 1.0d);
        }
    }

    public QuickChatPrivilegeAnimView(Context context) {
        super(context);
        this.f36005r = false;
        init();
    }

    private void init() {
        m55489m0(p9r.m171370a(getContext()).inflate(rec0.f162560h3, this));
        if (bnl0.m105588w0() < 960) {
            m55488s0();
        }
        this.f36003p.setImageResource(jbc0.f119511b0);
        this.f35999l.setImageResource(jbc0.f119533c8);
        this.f36000m.setImageResource(jbc0.f119505a8);
        this.f36001n.setImageResource(jbc0.f119519b8);
        this.f36002o.setImageResource(jbc0.f119547d8);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        this.f35994g.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
        if (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "female")) {
            m55485p0();
            return;
        }
        if (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
            m55486q0();
        } else if (TEnum.equals(userM116600p9.gender, "female")) {
            m55486q0();
        } else {
            m55485p0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m55485p0() {
        uqb0.f180374G.m127138Y0(this.f35996i, jbc0.f119495Zb);
        uqb0.f180374G.m127138Y0(this.f35997j, jbc0.f119509ac);
    }

    /* JADX INFO: renamed from: q0 */
    private void m55486q0() {
        uqb0.f180374G.m127138Y0(this.f35996i, jbc0.f119523bc);
        uqb0.f180374G.m127138Y0(this.f35997j, jbc0.f119537cc);
    }

    /* JADX INFO: renamed from: r0 */
    private void m55487r0() {
        this.f36003p.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: s0 */
    private void m55488s0() {
        int iM175859d = qa00.m175859d(70.0f);
        int iM175859d2 = qa00.m175859d(84.0f);
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f36003p.getLayoutParams();
        int i = qa00.f156337x;
        ((ViewGroup.MarginLayoutParams) c0221a).width = i;
        ((ViewGroup.MarginLayoutParams) c0221a).height = i;
        this.f36003p.setLayoutParams(c0221a);
        ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f35993f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a2).width = iM175859d2;
        ((ViewGroup.MarginLayoutParams) c0221a2).height = iM175859d2;
        this.f35993f.setLayoutParams(c0221a2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35994g.getLayoutParams();
        layoutParams.width = iM175859d;
        layoutParams.height = iM175859d;
        this.f35994g.setLayoutParams(layoutParams);
        ConstraintLayout.C0221a c0221a3 = (ConstraintLayout.C0221a) this.f35995h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a3).width = iM175859d2;
        ((ViewGroup.MarginLayoutParams) c0221a3).height = iM175859d2;
        this.f35995h.setLayoutParams(c0221a3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35996i.getLayoutParams();
        layoutParams2.width = iM175859d;
        layoutParams2.height = iM175859d;
        this.f35996i.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f35997j.getLayoutParams();
        layoutParams3.width = iM175859d;
        layoutParams3.height = iM175859d;
        this.f35997j.setLayoutParams(layoutParams3);
        this.f35991d.setGuidelinePercent(0.46f);
        this.f35992e.setGuidelinePercent(0.54f);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m55489m0(View view) {
        k5c0.m148350a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final ObjectAnimator m55490n0(View view, long j, boolean z) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(BLiveGiftItem.TYPE_ROTATION, z ? -30.0f : 30.0f, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f)).setDuration(350L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.setStartDelay(j);
        duration.addListener(new C8964b(view));
        return duration;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m55491o0(int i, int[] iArr) {
        int i2 = iArr[0];
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35993f, "translationX", -this.f35993f.getRight(), 0.0f);
        InterpolatorC8966d interpolatorC8966d = f35989t;
        objectAnimatorOfFloat.setInterpolator(interpolatorC8966d);
        objectAnimatorOfFloat.setDuration(650L);
        FrameLayout frameLayout = this.f35995h;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(frameLayout, "translationX", i2 - frameLayout.getLeft(), 0.0f);
        objectAnimatorOfFloat2.setDuration(650L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f36003p, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setInterpolator(f35988s);
        objectAnimatorOfFloat3.setDuration(150L);
        objectAnimatorOfFloat3.setStartDelay(500L);
        objectAnimatorOfFloat2.setInterpolator(interpolatorC8966d);
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setStartDelay(i);
        animatorSet.addListener(new C8963a());
        animatorSet.start();
    }

    /* JADX INFO: renamed from: t0 */
    public void m55492t0() {
        m55493u0(250);
    }

    /* JADX INFO: renamed from: u0 */
    public void m55493u0(final int i) {
        if (this.f36005r) {
            return;
        }
        m55487r0();
        this.f36005r = true;
        bnl0.m105533Q0(this.f36004q, new y20() { // from class: l.j5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118414a.m55491o0(i, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m55494v0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f35997j, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f35988s);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.addListener(new C8965c());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m55495w0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m55490n0(this.f35999l, 0L, true), m55490n0(this.f36001n, f35990u, false), m55490n0(this.f36000m, f35990u * 2, true), m55490n0(this.f36002o, f35990u * 3, false));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m55496y0(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f35988s);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setStartDelay(350L);
        objectAnimatorOfFloat.start();
    }

    public QuickChatPrivilegeAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36005r = false;
        init();
    }

    public QuickChatPrivilegeAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36005r = false;
        init();
    }
}
