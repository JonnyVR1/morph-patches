package com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.fdj0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes4.dex */
public class TurboCardBoostReceivedView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TurboCardBoostReceivedView f50190d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50191e;

    /* JADX INFO: renamed from: f */
    public VImage f50192f;

    /* JADX INFO: renamed from: g */
    public VText f50193g;

    /* JADX INFO: renamed from: h */
    public VText f50194h;

    /* JADX INFO: renamed from: i */
    public VImage f50195i;

    /* JADX INFO: renamed from: j */
    public VText f50196j;

    public TurboCardBoostReceivedView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74299h0(View view) {
        fdj0.m120981a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74300i0(LongLinkMedalMessage.CardTypeEnum cardTypeEnum, View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f50195i, onClickListener);
        if (LongLinkMedalMessage.CardTypeEnum.SUPER.equals(cardTypeEnum)) {
            this.f50193g.setText(getContext().getString(R$string.f47260ge));
            this.f50190d.setBackground(getResources().getDrawable(i3c0.f110777L7));
            hxs.m133408u("context_livingAct", this.f50191e, ydt.f197603F, t100.m186890d(283.0f), t100.m186890d(219.0f));
            this.f50192f.setBackground(getResources().getDrawable(i3c0.f111222x8));
            this.f50195i.setBackground(getResources().getDrawable(i3c0.f111246z8));
            return;
        }
        if (LongLinkMedalMessage.CardTypeEnum.SENIOR.equals(cardTypeEnum)) {
            this.f50193g.setText(getContext().getString(R$string.f47588vd));
            this.f50190d.setBackground(getResources().getDrawable(i3c0.f110765K7));
            hxs.m133408u("context_livingAct", this.f50191e, ydt.f197602E, t100.m186890d(283.0f), t100.m186890d(219.0f));
            this.f50192f.setBackground(getResources().getDrawable(i3c0.f111210w8));
            this.f50195i.setBackground(getResources().getDrawable(i3c0.f111234y8));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74299h0(this);
    }

    public TurboCardBoostReceivedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
