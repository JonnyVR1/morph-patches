package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.ovb0;
import p153l.qa00;
import p153l.s4q;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemDiceInvite extends RelativeLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemDiceInvite f31768a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31769b;

    /* JADX INFO: renamed from: c */
    public VText f31770c;

    /* JADX INFO: renamed from: d */
    public VText f31771d;

    /* JADX INFO: renamed from: e */
    public VText f31772e;

    /* JADX INFO: renamed from: f */
    public boolean f31773f;

    public ItemDiceInvite(Context context) {
        super(context);
        this.f31773f = false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        String str = message.msgData;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gameId");
            m49307d(jSONObject, strOptString, message);
            m49306c(strOptString, jSONObject, message);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49305b(View view) {
        s4q.m184571a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m49306c(String str, JSONObject jSONObject, Message message) {
        final String strOptString = jSONObject.optString("gameUrl");
        final String strOptString2 = jSONObject.optString("eventlog");
        if (!this.f31773f && !TextUtils.isEmpty(strOptString2)) {
            this.f31773f = true;
            i4g0.m138526x(strOptString2, OMSDialogPositon.p_chat_view);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.r4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161221a.m49308e(strOptString2, strOptString, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m49307d(JSONObject jSONObject, String str, Message message) {
        String strOptString = jSONObject.optString("iconUrl");
        int i = qa00.f156322i;
        this.f31769b.getHierarchy().m207045H(RoundingParams.m8302b(i, i, i, i));
        if (TextUtils.equals(str, BLiveButtonType.dice)) {
            uqb0.f180374G.m127138Y0(this.f31769b, ibc0.f113903S);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            uqb0.f180374G.m127121O0(this.f31769b, strOptString, true, false, null, null);
        }
        String strOptString2 = jSONObject.optString(message.isMe() ? "senderTitle" : "receiverTitle");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f31770c.setText(strOptString2);
        }
        String strOptString3 = jSONObject.optString(message.isMe() ? "senderSubtitle" : "receiverSubtitle");
        if (!TextUtils.isEmpty(strOptString3)) {
            this.f31771d.setText(strOptString3);
        }
        String strOptString4 = jSONObject.optString("buttonText");
        if (TextUtils.isEmpty(strOptString4)) {
            return;
        }
        this.f31772e.setText(strOptString4);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49308e(String str, String str2, View view) {
        if (!TextUtils.isEmpty(str)) {
            i4g0.m138520r(str, OMSDialogPositon.p_chat_view);
        }
        if (str2.startsWith("http")) {
            getContext().startActivity(MkWebViewAct.m81420c2(getContext(), "", str2, true));
        } else if (str2.startsWith("tantan")) {
            CoreModule.m30933P().m143412i().mo180426Y(bnl0.m105506D(getContext()), Uri.parse(str2));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49305b(this);
        this.f31770c.getPaint().setFakeBoldText(true);
        this.f31772e.getPaint().setFakeBoldText(true);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31770c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31771d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31772e.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemDiceInvite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31773f = false;
    }

    public ItemDiceInvite(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31773f = false;
    }
}
