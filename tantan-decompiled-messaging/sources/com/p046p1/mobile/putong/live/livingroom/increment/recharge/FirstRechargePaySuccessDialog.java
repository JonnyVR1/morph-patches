package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.boi;
import p149l.d30;
import p149l.h4t;
import p149l.hxs;
import p149l.vwb;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class FirstRechargePaySuccessDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50866d;

    /* JADX INFO: renamed from: e */
    public VImage f50867e;

    /* JADX INFO: renamed from: f */
    public VText f50868f;

    /* JADX INFO: renamed from: g */
    public LocalFirstRechargeGiftItemView f50869g;

    /* JADX INFO: renamed from: h */
    public LocalFirstRechargeGiftItemView f50870h;

    /* JADX INFO: renamed from: i */
    public LocalFirstRechargeGiftItemView f50871i;

    public FirstRechargePaySuccessDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75121i0(View view) {
        boi.m102945a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75122j0(h4t h4tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail, final d30 d30Var, d30 d30Var2) {
        ViewGroup.LayoutParams layoutParams = this.f50866d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) ((layoutParams.width * 600.0f) / 930.0f);
            this.f50866d.setLayoutParams(layoutParams);
        }
        hxs.m133406s("context_livingAct", this.f50866d, ydt.f197631u);
        List<BLiveBonus> list = bLiveFirstRechargeDetail.bonus;
        xdl0.m208329E0(this.f50867e, new View.OnClickListener() { // from class: l.aoi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (vwb.m200296J(list) || list.size() < 3) {
            return;
        }
        this.f50869g.m75141l0(h4tVar, list.get(0), true, d30Var2);
        this.f50870h.m75141l0(h4tVar, list.get(1), true, d30Var2);
        this.f50871i.m75141l0(h4tVar, list.get(2), true, d30Var2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75121i0(this);
    }

    public FirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
