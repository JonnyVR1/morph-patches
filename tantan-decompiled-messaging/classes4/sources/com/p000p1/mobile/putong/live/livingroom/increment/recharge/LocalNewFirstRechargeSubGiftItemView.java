package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.live.base.data.BLiveBonus;
import l.hxs;
import l.xdl0;
import p002l.muv;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LocalNewFirstRechargeSubGiftItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f6943c;

    /* JADX INFO: renamed from: d */
    public VText f6944d;

    public LocalNewFirstRechargeSubGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m8762P(View view) {
        muv.m18208a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m8763Q(BLiveBonus bLiveBonus) {
        if (bLiveBonus == null) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        hxs.s("context_livingAct", this.f6943c, bLiveBonus.icon);
        this.f6944d.setText(bLiveBonus.title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        m8762P(this);
        super/*android.view.View*/.onFinishInflate();
    }

    public LocalNewFirstRechargeSubGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalNewFirstRechargeSubGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
