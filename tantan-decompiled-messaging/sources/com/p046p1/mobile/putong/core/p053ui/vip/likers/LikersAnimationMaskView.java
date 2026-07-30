package com.p046p1.mobile.putong.core.p053ui.vip.likers;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAnimationMaskView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.d30;
import p149l.qib0;
import p149l.vhr;

/* JADX INFO: loaded from: classes9.dex */
public class LikersAnimationMaskView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f37246a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37247b;

    /* JADX INFO: renamed from: c */
    public VImage f37248c;

    /* JADX INFO: renamed from: d */
    public VImage f37249d;

    /* JADX INFO: renamed from: e */
    public VImage f37250e;

    /* JADX INFO: renamed from: f */
    public VText f37251f;

    /* JADX INFO: renamed from: g */
    public VText f37252g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.LikersAnimationMaskView$a */
    public class C8962a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f37253a;

        public C8962a(d30 d30Var) {
            this.f37253a = d30Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LikersAnimationMaskView.this.getVisibility() == 0) {
                LikersAnimationMaskView.this.setVisibility(8);
            }
            this.f37253a.call();
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
    public static /* synthetic */ float m56546a(float f) {
        if (f <= 0.8d) {
            return ((-6.25f) * f * f) + (f * 5.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m56547b(View view) {
        vhr.m198470a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m56548c() {
        this.f37250e.setVisibility(0);
        this.f37250e.setAlpha(0.0f);
        this.f37249d.setVisibility(0);
        this.f37249d.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m56549d() {
        qib0.f154691G.m102354Y0(this.f37247b, TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "female") ? b3c0.f73153s6 : b3c0.f73145r6);
        setVisibility(0);
        setClickable(true);
        this.f37252g.setText(getContext().getString(R$string.f20644f1));
    }

    /* JADX INFO: renamed from: e */
    public void m56550e(d30 d30Var) {
        m56548c();
        Interpolator interpolator = new Interpolator() { // from class: l.uhr
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return LikersAnimationMaskView.m56546a(f);
            }
        };
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37246a, "translationX", 0.0f, -200.0f);
        objectAnimatorOfFloat.setInterpolator(interpolator);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f37249d, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f37246a, BLiveGiftItem.TYPE_ROTATION, 0.0f, -4.0f);
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        objectAnimatorOfFloat3.setDuration(800L);
        objectAnimatorOfFloat3.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f37246a, "translationX", 0.0f, 200.0f);
        objectAnimatorOfFloat4.setInterpolator(interpolator);
        objectAnimatorOfFloat4.setDuration(800L);
        objectAnimatorOfFloat4.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f37250e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat5.setInterpolator(interpolator);
        objectAnimatorOfFloat5.setDuration(800L);
        objectAnimatorOfFloat5.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f37246a, BLiveGiftItem.TYPE_ROTATION, 0.0f, 4.0f);
        objectAnimatorOfFloat6.setInterpolator(interpolator);
        objectAnimatorOfFloat6.setDuration(800L);
        objectAnimatorOfFloat6.setRepeatCount(1);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat5);
        animatorSet.play(animatorSet3).after(2100L).after(animatorSet2);
        animatorSet.addListener(new C8962a(d30Var));
        animatorSet.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56547b(this);
    }

    public LikersAnimationMaskView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersAnimationMaskView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
