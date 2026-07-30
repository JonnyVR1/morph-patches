package com.p046p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationEntryBindings;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.TurboCardBoostEndView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard.TurboCardBoostReceivedView;
import p149l.d8c0;
import p149l.t100;
import p149l.t6c0;
import p149l.wr50;
import p149l.zfv;

/* JADX INFO: loaded from: classes4.dex */
public class OperationEntryView extends LiveOperationEntryBindings<wr50> {
    public OperationEntryView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveOperationEntryBindings, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m75030j0(Dialog dialog, LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent, View view) {
        dialog.dismiss();
        ((wr50) this.f48047d).m205143h4(turboCardReceiveEvent.getUrl());
    }

    /* JADX INFO: renamed from: k0 */
    public void m75031k0(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        Dialog dialogM20567z = getAct().dialog().m20517M(t6c0.f168356g6).m20516L(d8c0.f84848c).m20498C(t100.m186890d(10.0f), 0, t100.m186890d(10.0f), 0).m20567z();
        ((TurboCardBoostEndView) dialogM20567z.m20458P()).m74298i0(turboCardResultNotice);
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: l0 */
    public void m75032l0(final LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        zfv.m218604t1();
        final Dialog dialogM20567z = getAct().dialog().m20517M(t6c0.f168369h6).m20516L(d8c0.f84848c).m20498C(t100.m186890d(15.0f), 0, t100.m186890d(15.0f), 0).m20567z();
        ((TurboCardBoostReceivedView) dialogM20567z.m20458P()).m74300i0(turboCardReceiveEvent.getType(), new View.OnClickListener() { // from class: l.xr50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194088a.m75030j0(dialogM20567z, turboCardReceiveEvent, view);
            }
        });
        dialogM20567z.show();
    }

    public OperationEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
