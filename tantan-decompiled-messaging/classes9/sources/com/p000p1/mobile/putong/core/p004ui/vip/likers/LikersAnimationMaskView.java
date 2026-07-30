package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAnimationMaskView;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.b3c0;
import l.d30;
import l.vhr;
import p006l.qib0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersAnimationMaskView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7027a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7028b;

    /* JADX INFO: renamed from: c */
    public VImage f7029c;

    /* JADX INFO: renamed from: d */
    public VImage f7030d;

    /* JADX INFO: renamed from: e */
    public VImage f7031e;

    /* JADX INFO: renamed from: f */
    public VText f7032f;

    /* JADX INFO: renamed from: g */
    public VText f7033g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.LikersAnimationMaskView$a */
    public class C0398a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f7034a;

        public C0398a(d30 d30Var) {
            this.f7034a = d30Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LikersAnimationMaskView.this.getVisibility() == 0) {
                LikersAnimationMaskView.this.setVisibility(8);
            }
            this.f7034a.call();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public LikersAnimationMaskView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ float m9988a(float f) {
        if (f <= 0.8d) {
            return ((-6.25f) * f * f) + (f * 5.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m9989b(View view) {
        vhr.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m9990c() {
        this.f7031e.setVisibility(0);
        this.f7031e.setAlpha(0.0f);
        this.f7030d.setVisibility(0);
        this.f7030d.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m9991d() {
        qib0.f19782G.m12767Y0(this.f7028b, TEnum.equals(CoreModule.f1534c.f3628e0.m21490p9().gender, "female") ? b3c0.s6 : b3c0.r6);
        setVisibility(0);
        setClickable(true);
        this.f7033g.setText(getContext().getString(R.string.f1));
    }

    /* JADX INFO: renamed from: e */
    public void m9992e(d30 d30Var) {
        m9990c();
        Interpolator interpolator = new Interpolator() { // from class: l.uhr
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return LikersAnimationMaskView.m9988a(f);
            }
        };
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7027a, "translationX", 0.0f, -200.0f);
        objectAnimatorOfFloat.setInterpolator(interpolator);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f7030d, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f7027a, "rotation", 0.0f, -4.0f);
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        objectAnimatorOfFloat3.setDuration(800L);
        objectAnimatorOfFloat3.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f7027a, "translationX", 0.0f, 200.0f);
        objectAnimatorOfFloat4.setInterpolator(interpolator);
        objectAnimatorOfFloat4.setDuration(800L);
        objectAnimatorOfFloat4.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f7031e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat5.setInterpolator(interpolator);
        objectAnimatorOfFloat5.setDuration(800L);
        objectAnimatorOfFloat5.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f7027a, "rotation", 0.0f, 4.0f);
        objectAnimatorOfFloat6.setInterpolator(interpolator);
        objectAnimatorOfFloat6.setDuration(800L);
        objectAnimatorOfFloat6.setRepeatCount(1);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat5);
        animatorSet.play(animatorSet3).after(2100L).after(animatorSet2);
        animatorSet.addListener(new C0398a(d30Var));
        animatorSet.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9989b(this);
    }

    public LikersAnimationMaskView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersAnimationMaskView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
