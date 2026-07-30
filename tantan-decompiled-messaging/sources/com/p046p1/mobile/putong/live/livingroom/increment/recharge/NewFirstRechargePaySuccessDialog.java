package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.er20;
import p149l.hxs;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class NewFirstRechargePaySuccessDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f50903d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f50904e;

    /* JADX INFO: renamed from: f */
    public VText f50905f;

    /* JADX INFO: renamed from: g */
    public VLinear f50906g;

    /* JADX INFO: renamed from: h */
    public LocalNewFirstRechargeGiftItemView f50907h;

    /* JADX INFO: renamed from: i */
    public LocalNewFirstRechargeGiftItemView f50908i;

    /* JADX INFO: renamed from: j */
    public LocalNewFirstRechargeGiftItemView f50909j;

    /* JADX INFO: renamed from: k */
    public VLinear f50910k;

    /* JADX INFO: renamed from: l */
    public VText f50911l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f50912m;

    /* JADX INFO: renamed from: n */
    public VLinear f50913n;

    /* JADX INFO: renamed from: o */
    public VText f50914o;

    /* JADX INFO: renamed from: p */
    public VText f50915p;

    public NewFirstRechargePaySuccessDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75149i0(View view) {
        er20.m117808a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75150j0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, BLiveGiftItem bLiveGiftItem, boolean z, final d30 d30Var) {
        List<BLiveBonus> list = bLiveFirstRechargeDetail.bonus;
        if (!vwb.m200296J(list)) {
            this.f50907h.m75145i0(list.get(0), true, true);
            this.f50908i.m75145i0(list.get(1), true, true);
            this.f50909j.m75145i0(list.get(2), true, true);
        }
        xdl0.m208344M(this.f50910k, bLiveGiftItem != null);
        if (bLiveGiftItem != null) {
            hxs.m133406s("context_single_room", this.f50912m, bLiveGiftItem.url);
            this.f50911l.setText(z ? w8u.m202218u(R$string.f46829M9, bLiveGiftItem.localName.getLocalName()) : w8u.m202217t(R$string.f46850N9));
            this.f50914o.setText(z ? w8u.m202217t(R$string.f46808L9) : w8u.m202218u(R$string.f46913Q9, bLiveGiftItem.localName.getLocalName()));
            this.f50915p.setText(w8u.m202218u(R$string.f46892P9, Long.valueOf(bLiveGiftItem.purchasePrice)));
            this.f50911l.getPaint().setFakeBoldText(true);
            this.f50914o.getPaint().setFakeBoldText(true);
            this.f50915p.getPaint().setFakeBoldText(true);
            xdl0.m208329E0(this.f50913n, new View.OnClickListener() { // from class: l.dr20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var.call();
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75149i0(this);
    }

    public NewFirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewFirstRechargePaySuccessDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
