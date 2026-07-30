package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageExtData;
import com.p051p1.mobile.putong.core.data.StateData;
import java.io.IOException;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.ovb0;
import p153l.p6q;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIceBreakStateLeft extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemIceBreakStateLeft f31871c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31872d;

    /* JADX INFO: renamed from: e */
    public VText f31873e;

    /* JADX INFO: renamed from: f */
    public VText f31874f;

    public ItemIceBreakStateLeft(Context context) {
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
        uqb0.f180374G.m127115L0(this.f31872d, stateData.emotionUrl);
        this.f31873e.setText(stateData.emotionText);
        this.f31874f.setText(stateData.value);
        if (TextUtils.equals(stateData.sourceFlag, "chatPartners")) {
            if (message.isMe()) {
                this.f31871c.setBackground(App.f16088e.getResources().getDrawable(ibc0.f113853M2));
            }
            bnl0.m105507D0(qa00.m175858c().widthPixels - (qa00.m175859d(52.0f) * 2), this);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m49388P(View view) {
        p6q.m170920a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49388P(this);
        this.f31874f.getPaint().setFakeBoldText(true);
        this.f31873e.getPaint().setFakeBoldText(true);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31873e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31873e.setTextSize(15.0f);
            this.f31874f.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31874f.setTextSize(13.0f);
        }
    }

    public ItemIceBreakStateLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIceBreakStateLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
