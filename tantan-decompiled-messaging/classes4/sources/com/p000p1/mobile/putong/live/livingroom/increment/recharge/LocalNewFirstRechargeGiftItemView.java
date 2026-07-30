package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveBonus;
import l.hxs;
import l.kvc0;
import l.xdl0;
import p002l.i3c0;
import p002l.luv;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LocalNewFirstRechargeGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f6940d;

    /* JADX INFO: renamed from: e */
    public VText f6941e;

    /* JADX INFO: renamed from: f */
    public VText f6942f;

    public LocalNewFirstRechargeGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8760h0(View view) {
        luv.m17472a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m8761i0(BLiveBonus bLiveBonus, boolean z, boolean z2) {
        if (bLiveBonus == null) {
            xdl0.M(this, false);
            return;
        }
        hxs.s("context_livingAct", this.f6940d, bLiveBonus.icon);
        this.f6941e.setText(bLiveBonus.title);
        this.f6942f.setText(bLiveBonus.bonusDescription);
        xdl0.M(this.f6942f, z);
        setBackground(z2 ? kvc0.b(i3c0.f13018y7) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8760h0(this);
    }

    public LocalNewFirstRechargeGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalNewFirstRechargeGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
