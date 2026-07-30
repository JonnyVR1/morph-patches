package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import p149l.qtj0;
import p149l.ysj0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public UpgradeGiftEquipContainerView f50256a;

    /* JADX INFO: renamed from: b */
    public UpgradeGiftPagerView f50257b;

    public UpgradeGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74358a(View view) {
        qtj0.m176463a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m74359b() {
        this.f50256a.m74317f();
        this.f50257b.onDestroy();
    }

    /* JADX INFO: renamed from: c */
    public void m74360c(ysj0 ysj0Var) {
        this.f50256a.m74320i(ysj0Var);
        this.f50257b.m74351t0(ysj0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m74361d(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        this.f50256a.m74321j(bLiveUpgradeGiftInfoItem);
        this.f50257b.m74354w0(bLiveUpgradeGiftInfoItem);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74358a(this);
    }

    public UpgradeGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
