package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.luv;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LocalNewFirstRechargeGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50898d;

    /* JADX INFO: renamed from: e */
    public VText f50899e;

    /* JADX INFO: renamed from: f */
    public VText f50900f;

    public LocalNewFirstRechargeGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75144h0(View view) {
        luv.m151822a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75145i0(BLiveBonus bLiveBonus, boolean z, boolean z2) {
        if (bLiveBonus == null) {
            xdl0.m208344M(this, false);
            return;
        }
        hxs.m133406s("context_livingAct", this.f50898d, bLiveBonus.icon);
        this.f50899e.setText(bLiveBonus.title);
        this.f50900f.setText(bLiveBonus.bonusDescription);
        xdl0.m208344M(this.f50900f, z);
        setBackground(z2 ? kvc0.m147353b(i3c0.f111233y7) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75144h0(this);
    }

    public LocalNewFirstRechargeGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalNewFirstRechargeGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
