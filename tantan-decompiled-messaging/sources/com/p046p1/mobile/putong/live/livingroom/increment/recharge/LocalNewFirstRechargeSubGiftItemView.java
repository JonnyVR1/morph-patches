package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.hxs;
import p149l.muv;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LocalNewFirstRechargeSubGiftItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f50901c;

    /* JADX INFO: renamed from: d */
    public VText f50902d;

    public LocalNewFirstRechargeSubGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m75146P(View view) {
        muv.m156450a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m75147Q(BLiveBonus bLiveBonus) {
        if (bLiveBonus == null) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        hxs.m133406s("context_livingAct", this.f50901c, bLiveBonus.icon);
        this.f50902d.setText(bLiveBonus.title);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m75146P(this);
        super.onFinishInflate();
    }

    public LocalNewFirstRechargeSubGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalNewFirstRechargeSubGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
