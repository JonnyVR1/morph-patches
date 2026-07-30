package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBonus;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mwv;
import p153l.n3d0;
import p153l.obc0;

/* JADX INFO: loaded from: classes4.dex */
public class LocalNewFirstRechargeGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51746d;

    /* JADX INFO: renamed from: e */
    public VText f51747e;

    /* JADX INFO: renamed from: f */
    public VText f51748f;

    public LocalNewFirstRechargeGiftItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76327h0(View view) {
        mwv.m160599a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m76328i0(BLiveBonus bLiveBonus, boolean z, boolean z2) {
        if (bLiveBonus == null) {
            bnl0.m105524M(this, false);
            return;
        }
        izs.m142868s("context_livingAct", this.f51746d, bLiveBonus.icon);
        this.f51747e.setText(bLiveBonus.title);
        this.f51748f.setText(bLiveBonus.bonusDescription);
        bnl0.m105524M(this.f51748f, z);
        setBackground(z2 ? n3d0.m161278b(obc0.f146561y7) : null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76327h0(this);
    }

    public LocalNewFirstRechargeGiftItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocalNewFirstRechargeGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
