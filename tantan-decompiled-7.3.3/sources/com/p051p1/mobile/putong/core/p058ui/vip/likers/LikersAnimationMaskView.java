package com.p051p1.mobile.putong.core.p058ui.vip.likers;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAnimationMaskView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.gbc0;
import p153l.uqb0;
import p153l.wjr;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class LikersAnimationMaskView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f38094a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f38095b;

    /* JADX INFO: renamed from: c */
    public VImage f38096c;

    /* JADX INFO: renamed from: d */
    public VImage f38097d;

    /* JADX INFO: renamed from: e */
    public VImage f38098e;

    /* JADX INFO: renamed from: f */
    public VText f38099f;

    /* JADX INFO: renamed from: g */
    public VText f38100g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.LikersAnimationMaskView$a */
    public class C9125a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f38101a;

        public C9125a(x20 x20Var) {
            this.f38101a = x20Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (LikersAnimationMaskView.this.getVisibility() == 0) {
                LikersAnimationMaskView.this.setVisibility(8);
            }
            this.f38101a.call();
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
    public static /* synthetic */ float m57729a(float f) {
        if (f <= 0.8d) {
            return ((-6.25f) * f * f) + (f * 5.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m57730b(View view) {
        wjr.m206732a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m57731c() {
        this.f38098e.setVisibility(0);
        this.f38098e.setAlpha(0.0f);
        this.f38097d.setVisibility(0);
        this.f38097d.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m57732d() {
        uqb0.f180374G.m127138Y0(this.f38095b, TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "female") ? gbc0.f103404s6 : gbc0.f103396r6);
        setVisibility(0);
        setClickable(true);
        this.f38100g.setText(getContext().getString(R$string.f21386f1));
    }

    /* JADX INFO: renamed from: e */
    public void m57733e(x20 x20Var) {
        m57731c();
        Interpolator interpolator = new Interpolator() { // from class: l.vjr
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return LikersAnimationMaskView.m57729a(f);
            }
        };
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f38094a, "translationX", 0.0f, -200.0f);
        objectAnimatorOfFloat.setInterpolator(interpolator);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f38097d, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(interpolator);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f38094a, BLiveGiftItem.TYPE_ROTATION, 0.0f, -4.0f);
        objectAnimatorOfFloat3.setInterpolator(interpolator);
        objectAnimatorOfFloat3.setDuration(800L);
        objectAnimatorOfFloat3.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f38094a, "translationX", 0.0f, 200.0f);
        objectAnimatorOfFloat4.setInterpolator(interpolator);
        objectAnimatorOfFloat4.setDuration(800L);
        objectAnimatorOfFloat4.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f38098e, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat5.setInterpolator(interpolator);
        objectAnimatorOfFloat5.setDuration(800L);
        objectAnimatorOfFloat5.setRepeatCount(1);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f38094a, BLiveGiftItem.TYPE_ROTATION, 0.0f, 4.0f);
        objectAnimatorOfFloat6.setInterpolator(interpolator);
        objectAnimatorOfFloat6.setDuration(800L);
        objectAnimatorOfFloat6.setRepeatCount(1);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat3, objectAnimatorOfFloat2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat6, objectAnimatorOfFloat5);
        animatorSet.play(animatorSet3).after(2100L).after(animatorSet2);
        animatorSet.addListener(new C9125a(x20Var));
        animatorSet.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57730b(this);
    }

    public LikersAnimationMaskView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersAnimationMaskView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
