package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import p153l.b2k0;
import p153l.t2k0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public UpgradeGiftEquipContainerView f51104a;

    /* JADX INFO: renamed from: b */
    public UpgradeGiftPagerView f51105b;

    public UpgradeGiftView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75541a(View view) {
        t2k0.m188968a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m75542b() {
        this.f51104a.m75500f();
        this.f51105b.onDestroy();
    }

    /* JADX INFO: renamed from: c */
    public void m75543c(b2k0 b2k0Var) {
        this.f51104a.m75503i(b2k0Var);
        this.f51105b.m75534t0(b2k0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m75544d(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        this.f51104a.m75504j(bLiveUpgradeGiftInfoItem);
        this.f51105b.m75537w0(bLiveUpgradeGiftInfoItem);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75541a(this);
    }

    public UpgradeGiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
