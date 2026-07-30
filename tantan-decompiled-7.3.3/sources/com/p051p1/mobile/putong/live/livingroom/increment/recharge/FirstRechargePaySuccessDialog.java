package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBonus;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.i6t;
import p153l.izs;
import p153l.jyb;
import p153l.x20;
import p153l.xqi;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class FirstRechargePaySuccessDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51714d;

    /* JADX INFO: renamed from: e */
    public VImage f51715e;

    /* JADX INFO: renamed from: f */
    public VText f51716f;

    /* JADX INFO: renamed from: g */
    public LocalFirstRechargeGiftItemView f51717g;

    /* JADX INFO: renamed from: h */
    public LocalFirstRechargeGiftItemView f51718h;

    /* JADX INFO: renamed from: i */
    public LocalFirstRechargeGiftItemView f51719i;

    public FirstRechargePaySuccessDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76304i0(View view) {
        xqi.m212735a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m76305j0(i6t i6tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail, final x20 x20Var, x20 x20Var2) {
        ViewGroup.LayoutParams layoutParams = this.f51714d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (int) ((layoutParams.width * 600.0f) / 930.0f);
            this.f51714d.setLayoutParams(layoutParams);
        }
        izs.m142868s("context_livingAct", this.f51714d, zft.f204226u);
        List<BLiveBonus> list = bLiveFirstRechargeDetail.bonus;
        bnl0.m105509E0(this.f51715e, new View.OnClickListener() { // from class: l.wqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        if (jyb.m147479J(list) || list.size() < 3) {
            return;
        }
        this.f51717g.m76324l0(i6tVar, list.get(0), true, x20Var2);
        this.f51718h.m76324l0(i6tVar, list.get(1), true, x20Var2);
        this.f51719i.m76324l0(i6tVar, list.get(2), true, x20Var2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76304i0(this);
    }

    public FirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
