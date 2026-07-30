package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveBonus;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jyb;
import p153l.oz20;
import p153l.x20;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class NewFirstRechargePaySuccessDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f51751d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f51752e;

    /* JADX INFO: renamed from: f */
    public VText f51753f;

    /* JADX INFO: renamed from: g */
    public VLinear f51754g;

    /* JADX INFO: renamed from: h */
    public LocalNewFirstRechargeGiftItemView f51755h;

    /* JADX INFO: renamed from: i */
    public LocalNewFirstRechargeGiftItemView f51756i;

    /* JADX INFO: renamed from: j */
    public LocalNewFirstRechargeGiftItemView f51757j;

    /* JADX INFO: renamed from: k */
    public VLinear f51758k;

    /* JADX INFO: renamed from: l */
    public VText f51759l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f51760m;

    /* JADX INFO: renamed from: n */
    public VLinear f51761n;

    /* JADX INFO: renamed from: o */
    public VText f51762o;

    /* JADX INFO: renamed from: p */
    public VText f51763p;

    public NewFirstRechargePaySuccessDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76332i0(View view) {
        oz20.m169913a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m76333j0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, BLiveGiftItem bLiveGiftItem, boolean z, final x20 x20Var) {
        List<BLiveBonus> list = bLiveFirstRechargeDetail.bonus;
        if (!jyb.m147479J(list)) {
            this.f51755h.m76328i0(list.get(0), true, true);
            this.f51756i.m76328i0(list.get(1), true, true);
            this.f51757j.m76328i0(list.get(2), true, true);
        }
        bnl0.m105524M(this.f51758k, bLiveGiftItem != null);
        if (bLiveGiftItem != null) {
            izs.m142868s("context_single_room", this.f51760m, bLiveGiftItem.url);
            this.f51759l.setText(z ? xau.m209911u(R$string.f47677M9, bLiveGiftItem.localName.getLocalName()) : xau.m209910t(R$string.f47698N9));
            this.f51762o.setText(z ? xau.m209910t(R$string.f47656L9) : xau.m209911u(R$string.f47761Q9, bLiveGiftItem.localName.getLocalName()));
            this.f51763p.setText(xau.m209911u(R$string.f47740P9, Long.valueOf(bLiveGiftItem.purchasePrice)));
            this.f51759l.getPaint().setFakeBoldText(true);
            this.f51762o.getPaint().setFakeBoldText(true);
            this.f51763p.getPaint().setFakeBoldText(true);
            bnl0.m105509E0(this.f51761n, new View.OnClickListener() { // from class: l.nz20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var.call();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76332i0(this);
    }

    public NewFirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
