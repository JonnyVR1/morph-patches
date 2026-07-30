package com.p051p1.mobile.putong.live.livingroom.increment.operation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationEntryBindings;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.TurboCardBoostEndView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard.TurboCardBoostReceivedView;
import p153l.aiv;
import p153l.c060;
import p153l.jgc0;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class OperationEntryView extends LiveOperationEntryBindings<c060> {
    public OperationEntryView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveOperationEntryBindings, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m76213j0(Dialog dialog, LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent, View view) {
        dialog.dismiss();
        ((c060) this.f48895d).m107369h4(turboCardReceiveEvent.getUrl());
    }

    /* JADX INFO: renamed from: k0 */
    public void m76214k0(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        Dialog dialogM21566z = getAct().dialog().m21516M(yec0.f199088g6).m21515L(jgc0.f120696c).m21497C(qa00.m175859d(10.0f), 0, qa00.m175859d(10.0f), 0).m21566z();
        ((TurboCardBoostEndView) dialogM21566z.m21457P()).m75481i0(turboCardResultNotice);
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: l0 */
    public void m76215l0(final LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        aiv.m98138t1();
        final Dialog dialogM21566z = getAct().dialog().m21516M(yec0.f199101h6).m21515L(jgc0.f120696c).m21497C(qa00.m175859d(15.0f), 0, qa00.m175859d(15.0f), 0).m21566z();
        ((TurboCardBoostReceivedView) dialogM21566z.m21457P()).m75483i0(turboCardReceiveEvent.getType(), new View.OnClickListener() { // from class: l.d060
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84528a.m76213j0(dialogM21566z, turboCardReceiveEvent, view);
            }
        });
        dialogM21566z.show();
    }

    public OperationEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OperationEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
