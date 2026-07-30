package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.bubble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import java.util.Objects;
import p147v.VDraweeView;
import p149l.bii0;
import p149l.bt0;
import p149l.d30;
import p149l.dt0;
import p149l.hxs;
import p149l.ihs;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftLongPressFlyView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public Animator f45270o;

    public LiveVChatGiftLongPressFlyView(Context context) {
        super(context);
    }

    private Animator getAlphaAnim() {
        Animator animatorM103737j = bt0.m103737j(900);
        Animator animatorM103741n = bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(animatorM103737j, animatorM103741n);
        return animatorSet;
    }

    private Animator getScaleAnim() {
        Animator animatorM103741n = bt0.m103741n(this, bt0.f77162i, 1.0f, 0.5f);
        animatorM103741n.setDuration(800L);
        animatorM103741n.setStartDelay(300L);
        return animatorM103741n;
    }

    /* JADX INFO: renamed from: A */
    public void m69570A(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int[] iArr, int[] iArr2, int i, d30 d30Var) {
        Animator animatorM69572x = m69572x(liveVChatGiftItemView, ihsVar, iArr);
        Animator alphaAnim = getAlphaAnim();
        Animator scaleAnim = getScaleAnim();
        Animator animatorM69571w = m69571w(iArr2, i);
        Objects.requireNonNull(d30Var);
        bt0.m103733f(alphaAnim, new bii0(d30Var));
        Animator animatorM103753z = bt0.m103753z(animatorM69572x, alphaAnim, scaleAnim, animatorM69571w);
        this.f45270o = animatorM103753z;
        animatorM103753z.start();
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        dt0.m113501A(this.f45270o);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: w */
    public final Animator m69571w(int[] iArr, int i) {
        int i2;
        setRotation(0.0f);
        int i3 = iArr[i % iArr.length];
        if (i3 > 0) {
            i2 = 0;
        } else {
            i3 += 360;
            i2 = 360;
        }
        Animator animatorM103741n = bt0.m103741n(this, View.ROTATION, i2, i3);
        animatorM103741n.setDuration(800L);
        animatorM103741n.setStartDelay(300L);
        return animatorM103741n;
    }

    /* JADX INFO: renamed from: x */
    public final Animator m69572x(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int[] iArr) {
        liveVChatGiftItemView.getLocationOnScreen(new int[2]);
        final FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        setAlpha(1.0f);
        hxs.m133406s("context_livingAct", this, ihsVar.m136283h().url);
        int i = layoutParams.leftMargin;
        int iM208412y0 = iArr[0] - (xdl0.m208412y0() / 7);
        int i2 = layoutParams.topMargin;
        int iM186890d = iArr[1] - t100.m186890d(52.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iM208412y0);
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.setInterpolator(null);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tku
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f170915a.m69573y(layoutParams, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i2, iM186890d);
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.setInterpolator(null);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.uku
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f176966a.m69574z(layoutParams, valueAnimator);
            }
        });
        Animator animatorM103737j = bt0.m103737j(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfInt).with(valueAnimatorOfInt2).after(animatorM103737j);
        return animatorSet;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m69573y(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m69574z(FrameLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setLayoutParams(layoutParams);
    }

    public LiveVChatGiftLongPressFlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
