package com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jmj0;
import p153l.obc0;
import p153l.qa00;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class TurboCardBoostReceivedView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TurboCardBoostReceivedView f51038d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51039e;

    /* JADX INFO: renamed from: f */
    public VImage f51040f;

    /* JADX INFO: renamed from: g */
    public VText f51041g;

    /* JADX INFO: renamed from: h */
    public VText f51042h;

    /* JADX INFO: renamed from: i */
    public VImage f51043i;

    /* JADX INFO: renamed from: j */
    public VText f51044j;

    public TurboCardBoostReceivedView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75482h0(View view) {
        jmj0.m146165a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75483i0(LongLinkMedalMessage.CardTypeEnum cardTypeEnum, View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f51043i, onClickListener);
        if (LongLinkMedalMessage.CardTypeEnum.SUPER.equals(cardTypeEnum)) {
            this.f51041g.setText(getContext().getString(R$string.f48108ge));
            this.f51038d.setBackground(getResources().getDrawable(obc0.f146105L7));
            izs.m142870u("context_livingAct", this.f51039e, zft.f204198F, qa00.m175859d(283.0f), qa00.m175859d(219.0f));
            this.f51040f.setBackground(getResources().getDrawable(obc0.f146550x8));
            this.f51043i.setBackground(getResources().getDrawable(obc0.f146574z8));
            return;
        }
        if (LongLinkMedalMessage.CardTypeEnum.SENIOR.equals(cardTypeEnum)) {
            this.f51041g.setText(getContext().getString(R$string.f48436vd));
            this.f51038d.setBackground(getResources().getDrawable(obc0.f146093K7));
            izs.m142870u("context_livingAct", this.f51039e, zft.f204197E, qa00.m175859d(283.0f), qa00.m175859d(219.0f));
            this.f51040f.setBackground(getResources().getDrawable(obc0.f146538w8));
            this.f51043i.setBackground(getResources().getDrawable(obc0.f146562y8));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75482h0(this);
    }

    public TurboCardBoostReceivedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
