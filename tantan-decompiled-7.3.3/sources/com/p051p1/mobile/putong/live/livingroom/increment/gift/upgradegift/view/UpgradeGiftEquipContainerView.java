package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import p153l.b2k0;
import p153l.bnl0;
import p153l.n1k0;
import p153l.u1k0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftEquipContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public UpgradeGiftEquipView f51058a;

    /* JADX INFO: renamed from: b */
    public UpgradeGiftEquipView f51059b;

    /* JADX INFO: renamed from: c */
    public UpgradeGiftEquipView f51060c;

    /* JADX INFO: renamed from: d */
    public UpgradeGiftEquipView f51061d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f51062e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipContainerView$a */
    public class C13001a extends AnimatorListenerAdapter {
        public C13001a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            UpgradeGiftEquipView upgradeGiftEquipView = UpgradeGiftEquipContainerView.this.f51060c;
            UpgradeGiftEquipContainerView upgradeGiftEquipContainerView = UpgradeGiftEquipContainerView.this;
            upgradeGiftEquipContainerView.f51060c = upgradeGiftEquipContainerView.f51061d;
            UpgradeGiftEquipContainerView.this.f51061d = upgradeGiftEquipView;
            UpgradeGiftEquipContainerView.this.f51061d.onDestroy();
            bnl0.m105524M(UpgradeGiftEquipContainerView.this.f51061d, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            bnl0.m105524M(UpgradeGiftEquipContainerView.this.f51060c, true);
            bnl0.m105524M(UpgradeGiftEquipContainerView.this.f51061d, true);
        }
    }

    public UpgradeGiftEquipContainerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m75499e(View view) {
        u1k0.m193984a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m75500f() {
        AnimatorSet animatorSet = this.f51062e;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f51062e.end();
            if (this.f51062e.isRunning()) {
                this.f51062e.end();
            }
        }
        this.f51059b.onDestroy();
        this.f51058a.onDestroy();
    }

    /* JADX INFO: renamed from: g */
    public final void m75501g(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        bnl0.m105524M(this.f51061d, true);
        this.f51061d.m75509l0(bLiveUpgradeGiftInfoItem);
    }

    /* JADX INFO: renamed from: h */
    public final void m75502h(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        bnl0.m105524M(this.f51060c, true);
        this.f51060c.m75509l0(bLiveUpgradeGiftInfoItem);
    }

    /* JADX INFO: renamed from: i */
    public void m75503i(b2k0 b2k0Var) {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM161122g = n1k0.m161122g(b2k0Var);
        if (bLiveUpgradeGiftInfoItemM161122g == null) {
            return;
        }
        m75502h(bLiveUpgradeGiftInfoItemM161122g);
    }

    /* JADX INFO: renamed from: j */
    public void m75504j(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        m75501g(bLiveUpgradeGiftInfoItem);
        UpgradeGiftEquipView upgradeGiftEquipView = this.f51060c;
        float[] fArr = {0.0f, -bnl0.m105592y0()};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(upgradeGiftEquipView, (Property<UpgradeGiftEquipView, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f51061d, (Property<UpgradeGiftEquipView, Float>) property, bnl0.m105592y0(), 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        if (this.f51062e == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f51062e = animatorSet;
            animatorSet.setDuration(300L);
        }
        this.f51062e.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f51062e.removeAllListeners();
        this.f51062e.end();
        this.f51062e.start();
        this.f51062e.addListener(new C13001a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75499e(this);
        this.f51060c = this.f51059b;
        this.f51061d = this.f51058a;
    }

    public UpgradeGiftEquipContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
