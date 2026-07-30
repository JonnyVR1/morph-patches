package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.StateData;
import java.io.IOException;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.knb0;
import p149l.p4q;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIceBreakStateLeft extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemIceBreakStateLeft f31023c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31024d;

    /* JADX INFO: renamed from: e */
    public VText f31025e;

    /* JADX INFO: renamed from: f */
    public VText f31026f;

    public ItemIceBreakStateLeft(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        MessageExtData messageExtData;
        StateData stateData;
        if (message == null || (messageExtData = message.extData) == null || TextUtils.isEmpty(messageExtData.extra)) {
            return;
        }
        try {
            stateData = StateData.JSON_ADAPTER.parse(message.extData.extra);
        } catch (IOException unused) {
            stateData = null;
        }
        if (stateData == null) {
            return;
        }
        qib0.f154691G.m102331L0(this.f31024d, stateData.emotionUrl);
        this.f31025e.setText(stateData.emotionText);
        this.f31026f.setText(stateData.value);
        if (TextUtils.equals(stateData.sourceFlag, "chatPartners")) {
            if (message.isMe()) {
                this.f31023c.setBackground(App.f15369e.getResources().getDrawable(c3c0.f78578M2));
            }
            xdl0.m208327D0(t100.m186889c().widthPixels - (t100.m186890d(52.0f) * 2), this);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m48205P(View view) {
        p4q.m167401a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48205P(this);
        this.f31026f.getPaint().setFakeBoldText(true);
        this.f31025e.getPaint().setFakeBoldText(true);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31025e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31025e.setTextSize(15.0f);
            this.f31026f.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31026f.setTextSize(13.0f);
        }
    }

    public ItemIceBreakStateLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakStateLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
