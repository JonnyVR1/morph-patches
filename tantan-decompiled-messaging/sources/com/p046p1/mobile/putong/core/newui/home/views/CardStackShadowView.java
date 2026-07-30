package com.p046p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.bt0;

/* JADX INFO: loaded from: classes11.dex */
public class CardStackShadowView extends View {

    /* JADX INFO: renamed from: a */
    public Animator f23775a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardStackShadowView$a */
    public class C8057a implements Animator.AnimatorListener {
        public C8057a() {
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
    public final void m39111b(boolean z) {
        Property property = View.ALPHA;
        if (z) {
            if (getAlpha() != 1.0f) {
                Animator animator = this.f23775a;
                if (animator != null && animator.isRunning()) {
                    this.f23775a.cancel();
                }
                bt0.m103741n(this, property, getAlpha(), 1.0f).setDuration(120L).start();
            }
            super.setVisibility(0);
            return;
        }
        Animator animator2 = this.f23775a;
        if (animator2 != null && animator2.isRunning()) {
            this.f23775a.cancel();
        }
        if (getAlpha() == 0.0f) {
            super.setVisibility(8);
            return;
        }
        Animator duration = bt0.m103741n(this, property, getAlpha(), 0.0f).setDuration(120L);
        this.f23775a = duration;
        duration.addListener(new C8057a());
        this.f23775a.start();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            m39111b(i == 0);
        }
    }

    public CardStackShadowView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardStackShadowView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
