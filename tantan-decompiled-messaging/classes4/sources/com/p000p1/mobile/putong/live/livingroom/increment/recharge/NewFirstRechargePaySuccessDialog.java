package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveBonus;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import java.util.List;
import l.d30;
import l.hxs;
import l.vwb;
import l.w8u;
import l.xdl0;
import p002l.er20;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class NewFirstRechargePaySuccessDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f6945d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f6946e;

    /* JADX INFO: renamed from: f */
    public VText f6947f;

    /* JADX INFO: renamed from: g */
    public VLinear f6948g;

    /* JADX INFO: renamed from: h */
    public LocalNewFirstRechargeGiftItemView f6949h;

    /* JADX INFO: renamed from: i */
    public LocalNewFirstRechargeGiftItemView f6950i;

    /* JADX INFO: renamed from: j */
    public LocalNewFirstRechargeGiftItemView f6951j;

    /* JADX INFO: renamed from: k */
    public VLinear f6952k;

    /* JADX INFO: renamed from: l */
    public VText f6953l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f6954m;

    /* JADX INFO: renamed from: n */
    public VLinear f6955n;

    /* JADX INFO: renamed from: o */
    public VText f6956o;

    /* JADX INFO: renamed from: p */
    public VText f6957p;

    public NewFirstRechargePaySuccessDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8765i0(View view) {
        er20.m12669a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m8766j0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, BLiveGiftItem bLiveGiftItem, boolean z, final d30 d30Var) {
        List list = bLiveFirstRechargeDetail.bonus;
        if (!vwb.J(list)) {
            this.f6949h.m8761i0((BLiveBonus) list.get(0), true, true);
            this.f6950i.m8761i0((BLiveBonus) list.get(1), true, true);
            this.f6951j.m8761i0((BLiveBonus) list.get(2), true, true);
        }
        xdl0.M(this.f6952k, bLiveGiftItem != null);
        if (bLiveGiftItem != null) {
            hxs.s("context_single_room", this.f6954m, bLiveGiftItem.url);
            this.f6953l.setText(z ? w8u.u(R$string.f2871M9, bLiveGiftItem.localName.getLocalName()) : w8u.t(R$string.f2892N9));
            this.f6956o.setText(z ? w8u.t(R$string.f2850L9) : w8u.u(R$string.f2955Q9, bLiveGiftItem.localName.getLocalName()));
            this.f6957p.setText(w8u.u(R$string.f2934P9, Long.valueOf(bLiveGiftItem.purchasePrice)));
            this.f6953l.getPaint().setFakeBoldText(true);
            this.f6956o.getPaint().setFakeBoldText(true);
            this.f6957p.getPaint().setFakeBoldText(true);
            xdl0.E0(this.f6955n, new View.OnClickListener() { // from class: l.dr20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var.call();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8765i0(this);
    }

    public NewFirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
