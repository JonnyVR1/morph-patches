package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.StateData;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import java.io.IOException;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.lyh0;
import p153l.ovb0;
import p153l.q6q;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIceBreakStateRight extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemIceBreakStateRight f31875c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31876d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f31877e;

    public ItemIceBreakStateRight(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
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
        uqb0.f180374G.m127115L0(this.f31876d, stateData.emotionUrl);
        this.f31877e.setText("我的状态 · " + stateData.emotionText);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m49389P(View view) {
        q6q.m175600a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49389P(this);
        this.f31877e.setTypeface(lyh0.m156283c(3), 0);
    }

    public ItemIceBreakStateRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakStateRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
