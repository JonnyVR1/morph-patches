package com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import l.hxs;
import l.t100;
import l.xdl0;
import l.ydt;
import p002l.fdj0;
import p002l.i3c0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TurboCardBoostReceivedView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TurboCardBoostReceivedView f6232d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6233e;

    /* JADX INFO: renamed from: f */
    public VImage f6234f;

    /* JADX INFO: renamed from: g */
    public VText f6235g;

    /* JADX INFO: renamed from: h */
    public VText f6236h;

    /* JADX INFO: renamed from: i */
    public VImage f6237i;

    /* JADX INFO: renamed from: j */
    public VText f6238j;

    public TurboCardBoostReceivedView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7880h0(View view) {
        fdj0.m13132a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m7881i0(LongLinkMedalMessage.CardTypeEnum cardTypeEnum, View.OnClickListener onClickListener) {
        xdl0.E0(this.f6237i, onClickListener);
        if (LongLinkMedalMessage.CardTypeEnum.SUPER.equals(cardTypeEnum)) {
            this.f6235g.setText(getContext().getString(R$string.f3302ge));
            this.f6232d.setBackground(getResources().getDrawable(i3c0.f12562L7));
            hxs.u("context_livingAct", this.f6233e, ydt.F, t100.d(283.0f), t100.d(219.0f));
            this.f6234f.setBackground(getResources().getDrawable(i3c0.f13007x8));
            this.f6237i.setBackground(getResources().getDrawable(i3c0.f13031z8));
            return;
        }
        if (LongLinkMedalMessage.CardTypeEnum.SENIOR.equals(cardTypeEnum)) {
            this.f6235g.setText(getContext().getString(R$string.f3630vd));
            this.f6232d.setBackground(getResources().getDrawable(i3c0.f12550K7));
            hxs.u("context_livingAct", this.f6233e, ydt.E, t100.d(283.0f), t100.d(219.0f));
            this.f6234f.setBackground(getResources().getDrawable(i3c0.f12995w8));
            this.f6237i.setBackground(getResources().getDrawable(i3c0.f13019y8));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7880h0(this);
    }

    public TurboCardBoostReceivedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
