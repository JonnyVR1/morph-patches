package com.p051p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.gt0;

/* JADX INFO: loaded from: classes11.dex */
public class CardStackShadowView extends View {

    /* JADX INFO: renamed from: a */
    public Animator f24517a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardStackShadowView$a */
    public class C8208a implements Animator.AnimatorListener {
        public C8208a() {
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
    public final void m40114b(boolean z) {
        Property property = View.ALPHA;
        if (z) {
            if (getAlpha() != 1.0f) {
                Animator animator = this.f24517a;
                if (animator != null && animator.isRunning()) {
                    this.f24517a.cancel();
                }
                gt0.m132168n(this, property, getAlpha(), 1.0f).setDuration(120L).start();
            }
            super.setVisibility(0);
            return;
        }
        Animator animator2 = this.f24517a;
        if (animator2 != null && animator2.isRunning()) {
            this.f24517a.cancel();
        }
        if (getAlpha() == 0.0f) {
            super.setVisibility(8);
            return;
        }
        Animator duration = gt0.m132168n(this, property, getAlpha(), 0.0f).setDuration(120L);
        this.f24517a = duration;
        duration.addListener(new C8208a());
        this.f24517a.start();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            m40114b(i == 0);
        }
    }

    public CardStackShadowView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardStackShadowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
