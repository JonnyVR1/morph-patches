package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.knb0;
import p149l.qib0;
import p149l.s2q;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemDiceInvite extends RelativeLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemDiceInvite f30920a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30921b;

    /* JADX INFO: renamed from: c */
    public VText f30922c;

    /* JADX INFO: renamed from: d */
    public VText f30923d;

    /* JADX INFO: renamed from: e */
    public VText f30924e;

    /* JADX INFO: renamed from: f */
    public boolean f30925f;

    public ItemDiceInvite(Context context) {
        super(context);
        this.f30925f = false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        String str = message.msgData;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gameId");
            m48124d(jSONObject, strOptString, message);
            m48123c(strOptString, jSONObject, message);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48122b(View view) {
        s2q.m182068a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m48123c(String str, JSONObject jSONObject, Message message) {
        final String strOptString = jSONObject.optString("gameUrl");
        final String strOptString2 = jSONObject.optString("eventlog");
        if (!this.f30925f && !TextUtils.isEmpty(strOptString2)) {
            this.f30925f = true;
            zvf0.m220402x(strOptString2, OMSDialogPositon.p_chat_view);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.r2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157429a.m48125e(strOptString2, strOptString, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m48124d(JSONObject jSONObject, String str, Message message) {
        String strOptString = jSONObject.optString("iconUrl");
        int i = t100.f167260i;
        this.f30921b.getHierarchy().m112053H(RoundingParams.m8248b(i, i, i, i));
        if (TextUtils.equals(str, BLiveButtonType.dice)) {
            qib0.f154691G.m102354Y0(this.f30921b, c3c0.f78628S);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            qib0.f154691G.m102337O0(this.f30921b, strOptString, true, false, null, null);
        }
        String strOptString2 = jSONObject.optString(message.isMe() ? "senderTitle" : "receiverTitle");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f30922c.setText(strOptString2);
        }
        String strOptString3 = jSONObject.optString(message.isMe() ? "senderSubtitle" : "receiverSubtitle");
        if (!TextUtils.isEmpty(strOptString3)) {
            this.f30923d.setText(strOptString3);
        }
        String strOptString4 = jSONObject.optString("buttonText");
        if (TextUtils.isEmpty(strOptString4)) {
            return;
        }
        this.f30924e.setText(strOptString4);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48125e(String str, String str2, View view) {
        if (!TextUtils.isEmpty(str)) {
            zvf0.m220396r(str, OMSDialogPositon.p_chat_view);
        }
        if (str2.startsWith("http")) {
            getContext().startActivity(MkWebViewAct.m80237b2(getContext(), "", str2, true));
        } else if (str2.startsWith("tantan")) {
            CoreModule.m29935P().m94658i().mo158334Y(xdl0.m208326D(getContext()), Uri.parse(str2));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48122b(this);
        this.f30922c.getPaint().setFakeBoldText(true);
        this.f30924e.getPaint().setFakeBoldText(true);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30922c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30923d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30924e.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemDiceInvite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30925f = false;
    }

    public ItemDiceInvite(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30925f = false;
    }
}
