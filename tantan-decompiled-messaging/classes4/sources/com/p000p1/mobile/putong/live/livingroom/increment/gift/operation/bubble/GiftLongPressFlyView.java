package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.bubble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.Objects;
import l.bii0;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.ihs;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftLongPressFlyView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Animator f5816o;

    public GiftLongPressFlyView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Animator getAlphaAnim() {
        Animator animatorJ = bt0.j(900);
        Animator animatorN = bt0.n(this, View.ALPHA, new float[]{1.0f, 0.0f});
        animatorN.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorJ, animatorN);
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Animator getScaleAnim() {
        Animator animatorN = bt0.n(this, bt0.i, new float[]{1.0f, 0.5f});
        animatorN.setDuration(800L);
        animatorN.setStartDelay(300L);
        return animatorN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private Animator m7272w(int[] iArr, int i) {
        int i2;
        setRotation(0.0f);
        int i3 = iArr[i % iArr.length];
        if (i3 > 0) {
            i2 = 0;
        } else {
            i3 += 360;
            i2 = 360;
        }
        Animator animatorN = bt0.n(this, View.ROTATION, new float[]{i2, i3});
        animatorN.setDuration(800L);
        animatorN.setStartDelay(300L);
        return animatorN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m7273y(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m7274z(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: A */
    public void m7275A(LiveGiftItemView liveGiftItemView, ihs ihsVar, int[] iArr, int[] iArr2, int i, d30 d30Var) {
        Animator animatorM7276x = m7276x(liveGiftItemView, ihsVar, iArr);
        Animator alphaAnim = getAlphaAnim();
        Animator scaleAnim = getScaleAnim();
        Animator animatorM7272w = m7272w(iArr2, i);
        Objects.requireNonNull(d30Var);
        bt0.f(alphaAnim, new bii0(d30Var));
        Animator animatorZ = bt0.z(new Animator[]{animatorM7276x, alphaAnim, scaleAnim, animatorM7272w});
        this.f5816o = animatorZ;
        animatorZ.start();
    }

    public void onDetachedFromWindow() {
        dt0.A(this.f5816o);
        super/*com.facebook.drawee.view.DraweeView*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final Animator m7276x(LiveGiftItemView liveGiftItemView, ihs ihsVar, int[] iArr) {
        liveGiftItemView.getLocationOnScreen(new int[2]);
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        setAlpha(1.0f);
        hxs.s("context_livingAct", this, ihsVar.m15160h().url);
        int i = layoutParams.leftMargin;
        int iY0 = iArr[0] - (xdl0.y0() / 7);
        int i2 = layoutParams.topMargin;
        int iD = iArr[1] - t100.d(52.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iY0);
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.urj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20760a.m7273y(layoutParams, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i2, iD);
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.setInterpolator(null);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vrj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f21277a.m7274z(layoutParams, valueAnimator);
            }
        });
        Animator animatorJ = bt0.j(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfInt2).after(animatorJ);
        return animatorSet;
    }

    public GiftLongPressFlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
