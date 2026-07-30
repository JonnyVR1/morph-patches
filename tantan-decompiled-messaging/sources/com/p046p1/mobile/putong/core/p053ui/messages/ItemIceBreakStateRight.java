package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageExtData;
import com.p046p1.mobile.putong.core.data.StateData;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import java.io.IOException;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.eqh0;
import p149l.knb0;
import p149l.q4q;
import p149l.qib0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIceBreakStateRight extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemIceBreakStateRight f31027c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31028d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f31029e;

    public ItemIceBreakStateRight(Context context) {
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
        qib0.f154691G.m102331L0(this.f31028d, stateData.emotionUrl);
        this.f31029e.setText("我的状态 · " + stateData.emotionText);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m48206P(View view) {
        q4q.m172951a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48206P(this);
        this.f31029e.setTypeface(eqh0.m117752c(3), 0);
    }

    public ItemIceBreakStateRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakStateRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
