package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageExtData;
import com.p1.mobile.putong.core.data.StateData;
import com.p1.mobile.putong.core.ui.VText_Bold;
import java.io.IOException;
import java.util.List;
import l.knb0;
import l.q4q;
import l.qib0;
import p003l.eqh0;
import p028v.VDraweeView;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemIceBreakStateRight extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemIceBreakStateRight f918c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f919d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f920e;

    public ItemIceBreakStateRight(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        MessageExtData messageExtData;
        StateData stateData;
        if (message == null || (messageExtData = message.extData) == null || TextUtils.isEmpty(messageExtData.extra)) {
            return;
        }
        try {
            stateData = (StateData) StateData.JSON_ADAPTER.parse(message.extData.extra);
        } catch (IOException unused) {
            stateData = null;
        }
        if (stateData == null) {
            return;
        }
        qib0.G.L0(this.f919d, stateData.emotionUrl);
        this.f920e.setText("我的状态 · " + stateData.emotionText);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m1288P(View view) {
        q4q.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1288P(this);
        this.f920e.setTypeface(eqh0.m3924c(3), 0);
    }

    public ItemIceBreakStateRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakStateRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
