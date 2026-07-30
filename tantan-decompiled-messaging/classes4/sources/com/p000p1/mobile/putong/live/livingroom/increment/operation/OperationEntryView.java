package com.p000p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationEntryBindings;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard.TurboCardBoostEndView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard.TurboCardBoostReceivedView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import l.t100;
import p002l.d8c0;
import p002l.t6c0;
import p002l.wr50;
import p002l.zfv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OperationEntryView extends LiveOperationEntryBindings<wr50> {
    public OperationEntryView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.binding.LiveOperationEntryBindings
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m8640j0(Dialog dialog, LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent, View view) {
        dialog.dismiss();
        this.f4089d.m25363h4(turboCardReceiveEvent.getUrl());
    }

    /* JADX INFO: renamed from: k0 */
    public void m8641k0(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        Dialog dialogZ = act().dialog().M(t6c0.f19852g6).L(d8c0.f9098c).C(t100.d(10.0f), 0, t100.d(10.0f), 0).z();
        ((TurboCardBoostEndView) dialogZ.P()).m7879i0(turboCardResultNotice);
        dialogZ.show();
    }

    /* JADX INFO: renamed from: l0 */
    public void m8642l0(final LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        zfv.m27307t1();
        final Dialog dialogZ = act().dialog().M(t6c0.f19865h6).L(d8c0.f9098c).C(t100.d(15.0f), 0, t100.d(15.0f), 0).z();
        ((TurboCardBoostReceivedView) dialogZ.P()).m7881i0(turboCardReceiveEvent.getType(), new View.OnClickListener() { // from class: l.xr50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22426a.m8640j0(dialogZ, turboCardReceiveEvent, view);
            }
        });
        dialogZ.show();
    }

    public OperationEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
