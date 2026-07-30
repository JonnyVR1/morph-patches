package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveBonus;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.nwv;

/* JADX INFO: loaded from: classes4.dex */
public class LocalNewFirstRechargeSubGiftItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f51749c;

    /* JADX INFO: renamed from: d */
    public VText f51750d;

    public LocalNewFirstRechargeSubGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m76329P(View view) {
        nwv.m165051a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m76330Q(BLiveBonus bLiveBonus) {
        if (bLiveBonus == null) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        izs.m142868s("context_livingAct", this.f51749c, bLiveBonus.icon);
        this.f51750d.setText(bLiveBonus.title);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m76329P(this);
        super.onFinishInflate();
    }

    public LocalNewFirstRechargeSubGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalNewFirstRechargeSubGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
