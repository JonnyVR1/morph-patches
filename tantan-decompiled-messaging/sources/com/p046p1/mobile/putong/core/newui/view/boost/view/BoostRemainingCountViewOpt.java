package com.p046p1.mobile.putong.core.newui.view.boost.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VText_AutoFit;
import p149l.b3c0;
import p149l.bt0;
import p149l.m93;
import p149l.t0g0;

/* JADX INFO: loaded from: classes11.dex */
public class BoostRemainingCountViewOpt extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f27045a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f27046b;

    public BoostRemainingCountViewOpt(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m43816f(View view) {
        m93.m153582a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m43817g(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setRotationY(iIntValue);
        ImageView imageView = this.f27045a;
        if (iIntValue >= 90) {
            imageView.setVisibility(8);
            this.f27046b.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            this.f27046b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m43818h(View view) {
        view.setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m43819i(final View view) {
        CoreModule.m29935P().m94651a().mo33453Yo(false);
        view.animate().alpha(1.0f).setDuration(300L).start();
        animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: l.l93
            @Override // java.lang.Runnable
            public final void run() {
                this.f126911a.m43818h(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m43820j(View view) {
        CoreModule.m29935P().m94651a().mo33453Yo(false);
        view.setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m43821k(AnimatorSet animatorSet) {
        bt0.m103729b(this, animatorSet);
    }

    /* JADX INFO: renamed from: l */
    public void m43822l(final View view, int i) {
        this.f27046b.setText(t0g0.m186860a(i, 99L));
        CoreModule.m29935P().m94651a().mo33453Yo(true);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 180);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(180, 0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: l.h93
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f106510a.m43817g(valueAnimator);
            }
        };
        valueAnimatorOfInt.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfInt2.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.setStartDelay(2000L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2, bt0.m103737j(200));
        bt0.m103734g(animatorSet, new Runnable() { // from class: l.i93
            @Override // java.lang.Runnable
            public final void run() {
                this.f112098a.m43819i(view);
            }
        }, new Runnable() { // from class: l.j93
            @Override // java.lang.Runnable
            public final void run() {
                this.f116839a.m43820j(view);
            }
        });
        ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(300L);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = animate().alpha(1.0f).setDuration(300L).withEndAction(new Runnable() { // from class: l.k93
            @Override // java.lang.Runnable
            public final void run() {
                this.f121897a.m43821k(animatorSet);
            }
        });
        duration.start();
        viewPropertyAnimatorWithEndAction.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43816f(this);
        this.f27045a.setBackgroundResource(b3c0.f73042f);
        this.f27045a.setImageResource(b3c0.f73049f6);
    }

    public BoostRemainingCountViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostRemainingCountViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
