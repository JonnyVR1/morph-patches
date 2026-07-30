package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveBonus;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import java.util.List;
import l.d30;
import l.hxs;
import l.vwb;
import l.xdl0;
import l.ydt;
import p002l.boi;
import p002l.h4t;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FirstRechargePaySuccessDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f6908d;

    /* JADX INFO: renamed from: e */
    public VImage f6909e;

    /* JADX INFO: renamed from: f */
    public VText f6910f;

    /* JADX INFO: renamed from: g */
    public LocalFirstRechargeGiftItemView f6911g;

    /* JADX INFO: renamed from: h */
    public LocalFirstRechargeGiftItemView f6912h;

    /* JADX INFO: renamed from: i */
    public LocalFirstRechargeGiftItemView f6913i;

    public FirstRechargePaySuccessDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8737i0(View view) {
        boi.m10537a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m8738j0(h4t h4tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail, final d30 d30Var, d30 d30Var2) {
        ViewGroup.LayoutParams layoutParams = this.f6908d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) ((layoutParams.width * 600.0f) / 930.0f);
            this.f6908d.setLayoutParams(layoutParams);
        }
        hxs.s("context_livingAct", this.f6908d, ydt.u);
        List list = bLiveFirstRechargeDetail.bonus;
        xdl0.E0(this.f6909e, new View.OnClickListener() { // from class: l.aoi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (vwb.J(list) || list.size() < 3) {
            return;
        }
        this.f6911g.m8757l0(h4tVar, (BLiveBonus) list.get(0), true, d30Var2);
        this.f6912h.m8757l0(h4tVar, (BLiveBonus) list.get(1), true, d30Var2);
        this.f6913i.m8757l0(h4tVar, (BLiveBonus) list.get(2), true, d30Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8737i0(this);
    }

    public FirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
