package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import p149l.ksj0;
import p149l.rsj0;
import p149l.xdl0;
import p149l.ysj0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftEquipContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public UpgradeGiftEquipView f50210a;

    /* JADX INFO: renamed from: b */
    public UpgradeGiftEquipView f50211b;

    /* JADX INFO: renamed from: c */
    public UpgradeGiftEquipView f50212c;

    /* JADX INFO: renamed from: d */
    public UpgradeGiftEquipView f50213d;

    /* JADX INFO: renamed from: e */
    public AnimatorSet f50214e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipContainerView$a */
    public class C12838a extends AnimatorListenerAdapter {
        public C12838a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            UpgradeGiftEquipView upgradeGiftEquipView = UpgradeGiftEquipContainerView.this.f50212c;
            UpgradeGiftEquipContainerView upgradeGiftEquipContainerView = UpgradeGiftEquipContainerView.this;
            upgradeGiftEquipContainerView.f50212c = upgradeGiftEquipContainerView.f50213d;
            UpgradeGiftEquipContainerView.this.f50213d = upgradeGiftEquipView;
            UpgradeGiftEquipContainerView.this.f50213d.onDestroy();
            xdl0.m208344M(UpgradeGiftEquipContainerView.this.f50213d, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            xdl0.m208344M(UpgradeGiftEquipContainerView.this.f50212c, true);
            xdl0.m208344M(UpgradeGiftEquipContainerView.this.f50213d, true);
        }
    }

    public UpgradeGiftEquipContainerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m74316e(View view) {
        rsj0.m180685a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m74317f() {
        AnimatorSet animatorSet = this.f50214e;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f50214e.end();
            if (this.f50214e.isRunning()) {
                this.f50214e.end();
            }
        }
        this.f50211b.onDestroy();
        this.f50210a.onDestroy();
    }

    /* JADX INFO: renamed from: g */
    public final void m74318g(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        xdl0.m208344M(this.f50213d, true);
        this.f50213d.m74326l0(bLiveUpgradeGiftInfoItem);
    }

    /* JADX INFO: renamed from: h */
    public final void m74319h(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        xdl0.m208344M(this.f50212c, true);
        this.f50212c.m74326l0(bLiveUpgradeGiftInfoItem);
    }

    /* JADX INFO: renamed from: i */
    public void m74320i(ysj0 ysj0Var) {
        BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItemM147080g = ksj0.m147080g(ysj0Var);
        if (bLiveUpgradeGiftInfoItemM147080g == null) {
            return;
        }
        m74319h(bLiveUpgradeGiftInfoItemM147080g);
    }

    /* JADX INFO: renamed from: j */
    public void m74321j(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        m74318g(bLiveUpgradeGiftInfoItem);
        UpgradeGiftEquipView upgradeGiftEquipView = this.f50212c;
        float[] fArr = {0.0f, -xdl0.m208412y0()};
        Property property = View.TRANSLATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(upgradeGiftEquipView, (Property<UpgradeGiftEquipView, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50213d, (Property<UpgradeGiftEquipView, Float>) property, xdl0.m208412y0(), 0.0f);
        objectAnimatorOfFloat.setDuration(300L);
        if (this.f50214e == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f50214e = animatorSet;
            animatorSet.setDuration(300L);
        }
        this.f50214e.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.f50214e.removeAllListeners();
        this.f50214e.end();
        this.f50214e.start();
        this.f50214e.addListener(new C12838a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74316e(this);
        this.f50212c = this.f50211b;
        this.f50213d = this.f50210a;
    }

    public UpgradeGiftEquipContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
