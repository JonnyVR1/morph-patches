package com.p051p1.mobile.putong.core.newui.view.boost.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VText_AutoFit;
import p153l.a9g0;
import p153l.ba3;
import p153l.gbc0;
import p153l.gt0;

/* JADX INFO: loaded from: classes11.dex */
public class BoostRemainingCountViewOpt extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f27893a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f27894b;

    public BoostRemainingCountViewOpt(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m45002f(View view) {
        ba3.m103148a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m45003g(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        setRotationY(iIntValue);
        ImageView imageView = this.f27893a;
        if (iIntValue >= 90) {
            imageView.setVisibility(8);
            this.f27894b.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            this.f27894b.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m45004h(View view) {
        view.setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m45005i(final View view) {
        CoreModule.m30933P().m143405a().mo34456Yo(false);
        view.animate().alpha(1.0f).setDuration(300L).start();
        animate().alpha(0.0f).setDuration(300L).withEndAction(new Runnable() { // from class: l.aa3
            @Override // java.lang.Runnable
            public final void run() {
                this.f69095a.m45004h(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m45006j(View view) {
        CoreModule.m30933P().m143405a().mo34456Yo(false);
        view.setAlpha(1.0f);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m45007k(AnimatorSet animatorSet) {
        gt0.m132156b(this, animatorSet);
    }

    /* JADX INFO: renamed from: l */
    public void m45008l(final View view, int i) {
        this.f27894b.setText(a9g0.m96566a(i, 99L));
        CoreModule.m30933P().m143405a().mo34456Yo(true);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 180);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(180, 0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: l.w93
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f187973a.m45003g(valueAnimator);
            }
        };
        valueAnimatorOfInt.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfInt2.addUpdateListener(animatorUpdateListener);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.setStartDelay(2000L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2, gt0.m132164j(200));
        gt0.m132161g(animatorSet, new Runnable() { // from class: l.x93
            @Override // java.lang.Runnable
            public final void run() {
                this.f192896a.m45005i(view);
            }
        }, new Runnable() { // from class: l.y93
            @Override // java.lang.Runnable
            public final void run() {
                this.f198060a.m45006j(view);
            }
        });
        ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(300L);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = animate().alpha(1.0f).setDuration(300L).withEndAction(new Runnable() { // from class: l.z93
            @Override // java.lang.Runnable
            public final void run() {
                this.f203441a.m45007k(animatorSet);
            }
        });
        duration.start();
        viewPropertyAnimatorWithEndAction.start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45002f(this);
        this.f27893a.setBackgroundResource(gbc0.f103293f);
        this.f27893a.setImageResource(gbc0.f103300f6);
    }

    public BoostRemainingCountViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostRemainingCountViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
