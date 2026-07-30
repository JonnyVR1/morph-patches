package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import p002l.qtj0;
import p002l.ysj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public UpgradeGiftEquipContainerView f6298a;

    /* JADX INFO: renamed from: b */
    public UpgradeGiftPagerView f6299b;

    public UpgradeGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7939a(View view) {
        qtj0.m21555a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7940b() {
        this.f6298a.m7898f();
        this.f6299b.onDestroy();
    }

    /* JADX INFO: renamed from: c */
    public void m7941c(ysj0 ysj0Var) {
        this.f6298a.m7901i(ysj0Var);
        this.f6299b.m7932t0(ysj0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m7942d(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        this.f6298a.m7902j(bLiveUpgradeGiftInfoItem);
        this.f6299b.m7935w0(bLiveUpgradeGiftInfoItem);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7939a(this);
    }

    public UpgradeGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
