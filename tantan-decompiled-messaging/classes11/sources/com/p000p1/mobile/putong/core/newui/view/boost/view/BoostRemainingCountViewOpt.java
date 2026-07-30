package com.p000p1.mobile.putong.core.newui.view.boost.view;

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
import com.p1.mobile.putong.core.CoreModule;
import l.b3c0;
import l.bt0;
import l.m93;
import l.t0g0;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BoostRemainingCountViewOpt extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5823a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f5824b;

    public BoostRemainingCountViewOpt(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m8080f(View view) {
        m93.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m8081g(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setRotationY(iIntValue);
        ImageView imageView = this.f5823a;
        if (iIntValue >= 90) {
            imageView.setVisibility(8);
            this.f5824b.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            this.f5824b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m8082h(View view) {
        view.setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m8083i(final View view) {
        CoreModule.P().a().Yo(false);
        view.animate().alpha(1.0f).setDuration(300L).start();
        animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: l.l93
            @Override // java.lang.Runnable
            public final void run() {
                this.f16026a.m8082h(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m8084j(View view) {
        CoreModule.P().a().Yo(false);
        view.setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m8085k(AnimatorSet animatorSet) {
        bt0.b(this, animatorSet);
    }

    /* JADX INFO: renamed from: l */
    public void m8086l(final View view, int i) {
        this.f5824b.setText(t0g0.a(i, 99L));
        CoreModule.P().a().Yo(true);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 180);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(180, 0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: l.h93
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13910a.m8081g(valueAnimator);
            }
        };
        valueAnimatorOfInt.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfInt2.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.setStartDelay(2000L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2, bt0.j(200));
        bt0.g(animatorSet, new Runnable() { // from class: l.i93
            @Override // java.lang.Runnable
            public final void run() {
                this.f14441a.m8083i(view);
            }
        }, new Runnable() { // from class: l.j93
            @Override // java.lang.Runnable
            public final void run() {
                this.f14991a.m8084j(view);
            }
        });
        ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(300L);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = animate().alpha(1.0f).setDuration(300L).withEndAction(new Runnable() { // from class: l.k93
            @Override // java.lang.Runnable
            public final void run() {
                this.f15482a.m8085k(animatorSet);
            }
        });
        duration.start();
        viewPropertyAnimatorWithEndAction.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8080f(this);
        this.f5823a.setBackgroundResource(b3c0.f);
        this.f5823a.setImageResource(b3c0.f6);
    }

    public BoostRemainingCountViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostRemainingCountViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
