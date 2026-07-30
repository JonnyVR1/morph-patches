package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import l.xdl0;
import p002l.ksj0;
import p002l.rsj0;
import p002l.ysj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftEquipContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public UpgradeGiftEquipView f6252a;

    /* JADX INFO: renamed from: b */
    public UpgradeGiftEquipView f6253b;

    /* JADX INFO: renamed from: c */
    public UpgradeGiftEquipView f6254c;

    /* JADX INFO: renamed from: d */
    public UpgradeGiftEquipView f6255d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f6256e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipContainerView$a */
    public class C0427a extends AnimatorListenerAdapter {
        public C0427a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            UpgradeGiftEquipView upgradeGiftEquipView = UpgradeGiftEquipContainerView.this.f6254c;
            UpgradeGiftEquipContainerView upgradeGiftEquipContainerView = UpgradeGiftEquipContainerView.this;
            upgradeGiftEquipContainerView.f6254c = upgradeGiftEquipContainerView.f6255d;
            UpgradeGiftEquipContainerView.this.f6255d = upgradeGiftEquipView;
            UpgradeGiftEquipContainerView.this.f6255d.onDestroy();
            xdl0.M(UpgradeGiftEquipContainerView.this.f6255d, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.M(UpgradeGiftEquipContainerView.this.f6254c, true);
            xdl0.M(UpgradeGiftEquipContainerView.this.f6255d, true);
        }
    }

    public UpgradeGiftEquipContainerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m7897e(View view) {
        rsj0.m22120a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m7898f() {
        AnimatorSet animatorSet = this.f6256e;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f6256e.end();
            if (this.f6256e.isRunning()) {
                this.f6256e.end();
            }
        }
        this.f6253b.onDestroy();
        this.f6252a.onDestroy();
    }

    /* JADX INFO: renamed from: g */
    public final void m7899g(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        xdl0.M(this.f6255d, true);
        this.f6255d.m7907l0(bLiveUpgradeGiftInfoItem);
    }

    /* JADX INFO: renamed from: h */
    public final void m7900h(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        xdl0.M(this.f6254c, true);
        this.f6254c.m7907l0(bLiveUpgradeGiftInfoItem);
    }

    /* JADX INFO: renamed from: i */
    public void m7901i(ysj0 ysj0Var) {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM16780g = ksj0.m16780g(ysj0Var);
        if (bLiveUpgradeGiftInfoItemM16780g == null) {
            return;
        }
        m7900h(bLiveUpgradeGiftInfoItemM16780g);
    }

    /* JADX INFO: renamed from: j */
    public void m7902j(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        m7899g(bLiveUpgradeGiftInfoItem);
        UpgradeGiftEquipView upgradeGiftEquipView = this.f6254c;
        float[] fArr = {0.0f, -xdl0.y0()};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(upgradeGiftEquipView, (Property<UpgradeGiftEquipView, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6255d, (Property<UpgradeGiftEquipView, Float>) property, xdl0.y0(), 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        if (this.f6256e == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6256e = animatorSet;
            animatorSet.setDuration(300L);
        }
        this.f6256e.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f6256e.removeAllListeners();
        this.f6256e.end();
        this.f6256e.start();
        this.f6256e.addListener(new C0427a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7897e(this);
        this.f6254c = this.f6253b;
        this.f6255d = this.f6252a;
    }

    public UpgradeGiftEquipContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
