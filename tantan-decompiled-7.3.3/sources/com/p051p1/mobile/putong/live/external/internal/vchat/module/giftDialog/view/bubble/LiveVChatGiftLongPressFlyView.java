package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.Objects;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.bri0;
import p153l.gt0;
import p153l.it0;
import p153l.izs;
import p153l.jjs;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftLongPressFlyView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Animator f46118o;

    public LiveVChatGiftLongPressFlyView(Context context) {
        super(context);
    }

    private Animator getAlphaAnim() {
        Animator animatorM132164j = gt0.m132164j(900);
        Animator animatorM132168n = gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorM132164j, animatorM132168n);
        return animatorSet;
    }

    private Animator getScaleAnim() {
        Animator animatorM132168n = gt0.m132168n(this, gt0.f106354i, 1.0f, 0.5f);
        animatorM132168n.setDuration(800L);
        animatorM132168n.setStartDelay(300L);
        return animatorM132168n;
    }

    /* JADX INFO: renamed from: A */
    public void m70753A(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int[] iArr, int[] iArr2, int i, x20 x20Var) {
        Animator animatorM70755x = m70755x(liveVChatGiftItemView, jjsVar, iArr);
        Animator alphaAnim = getAlphaAnim();
        Animator scaleAnim = getScaleAnim();
        Animator animatorM70754w = m70754w(iArr2, i);
        Objects.requireNonNull(x20Var);
        gt0.m132160f(alphaAnim, new bri0(x20Var));
        Animator animatorM132180z = gt0.m132180z(animatorM70755x, alphaAnim, scaleAnim, animatorM70754w);
        this.f46118o = animatorM132180z;
        animatorM132180z.start();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        it0.m142007A(this.f46118o);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: w */
    public final Animator m70754w(int[] iArr, int i) {
        int i2;
        setRotation(0.0f);
        int i3 = iArr[i % iArr.length];
        if (i3 > 0) {
            i2 = 0;
        } else {
            i3 += 360;
            i2 = 360;
        }
        Animator animatorM132168n = gt0.m132168n(this, View.ROTATION, i2, i3);
        animatorM132168n.setDuration(800L);
        animatorM132168n.setStartDelay(300L);
        return animatorM132168n;
    }

    /* JADX INFO: renamed from: x */
    public final Animator m70755x(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int[] iArr) {
        liveVChatGiftItemView.getLocationOnScreen(new int[2]);
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        setAlpha(1.0f);
        izs.m142868s("context_livingAct", this, jjsVar.m145122h().url);
        int i = layoutParams.leftMargin;
        int iM105592y0 = iArr[0] - (bnl0.m105592y0() / 7);
        int i2 = layoutParams.topMargin;
        int iM175859d = iArr[1] - qa00.m175859d(52.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iM105592y0);
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.umu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f179674a.m70756y(layoutParams, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i2, iM175859d);
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.setInterpolator(null);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vmu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f184786a.m70757z(layoutParams, valueAnimator);
            }
        });
        Animator animatorM132164j = gt0.m132164j(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfInt2).after(animatorM132164j);
        return animatorSet;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m70756y(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m70757z(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(layoutParams);
    }

    public LiveVChatGiftLongPressFlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
