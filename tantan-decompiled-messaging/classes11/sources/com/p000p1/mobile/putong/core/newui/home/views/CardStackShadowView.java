package com.p000p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.bt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardStackShadowView extends View {

    /* JADX INFO: renamed from: a */
    public Animator f2553a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardStackShadowView$a */
    public class C0221a implements Animator.AnimatorListener {
        public C0221a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator) {
            CardStackShadowView.super.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NonNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator) {
        }
    }

    public CardStackShadowView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m3126b(boolean z) {
        Property property = View.ALPHA;
        if (z) {
            if (getAlpha() != 1.0f) {
                Animator animator = this.f2553a;
                if (animator != null && animator.isRunning()) {
                    this.f2553a.cancel();
                }
                bt0.n(this, property, new float[]{getAlpha(), 1.0f}).setDuration(120L).start();
            }
            super.setVisibility(0);
            return;
        }
        Animator animator2 = this.f2553a;
        if (animator2 != null && animator2.isRunning()) {
            this.f2553a.cancel();
        }
        if (getAlpha() == 0.0f) {
            super.setVisibility(8);
            return;
        }
        Animator duration = bt0.n(this, property, new float[]{getAlpha(), 0.0f}).setDuration(120L);
        this.f2553a = duration;
        duration.addListener(new C0221a());
        this.f2553a.start();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            m3126b(i == 0);
        }
    }

    public CardStackShadowView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardStackShadowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
