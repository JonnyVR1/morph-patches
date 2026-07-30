package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.knb0;
import l.nvc0;
import l.qib0;
import l.s2q;
import l.t100;
import l.ura;
import l.xdl0;
import l.ym2;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemDiceInvite extends RelativeLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemDiceInvite f811a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f812b;

    /* JADX INFO: renamed from: c */
    public VText f813c;

    /* JADX INFO: renamed from: d */
    public VText f814d;

    /* JADX INFO: renamed from: e */
    public VText f815e;

    /* JADX INFO: renamed from: f */
    public boolean f816f;

    public ItemDiceInvite(Context context) {
        super(context);
        this.f816f = false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        String str = message.msgData;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("gameId");
            m1204d(jSONObject, strOptString, message);
            m1203c(strOptString, jSONObject, message);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1202b(View view) {
        s2q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m1203c(String str, JSONObject jSONObject, Message message) {
        final String strOptString = jSONObject.optString("gameUrl");
        final String strOptString2 = jSONObject.optString("eventlog");
        if (!this.f816f && !TextUtils.isEmpty(strOptString2)) {
            this.f816f = true;
            zvf0.x(strOptString2, "p_chat_view");
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.r2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6771a.m1205e(strOptString2, strOptString, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m1204d(JSONObject jSONObject, String str, Message message) {
        String strOptString = jSONObject.optString("iconUrl");
        int i = t100.i;
        this.f812b.getHierarchy().H(RoundingParams.b(i, i, i, i));
        if (TextUtils.equals(str, "dice")) {
            qib0.G.Y0(this.f812b, c3c0.S);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            qib0.G.O0(this.f812b, strOptString, true, false, (nvc0) null, (ym2) null);
        }
        CharSequence charSequenceOptString = jSONObject.optString(message.isMe() ? "senderTitle" : "receiverTitle");
        if (!TextUtils.isEmpty(charSequenceOptString)) {
            this.f813c.setText(charSequenceOptString);
        }
        CharSequence charSequenceOptString2 = jSONObject.optString(message.isMe() ? "senderSubtitle" : "receiverSubtitle");
        if (!TextUtils.isEmpty(charSequenceOptString2)) {
            this.f814d.setText(charSequenceOptString2);
        }
        CharSequence charSequenceOptString3 = jSONObject.optString("buttonText");
        if (TextUtils.isEmpty(charSequenceOptString3)) {
            return;
        }
        this.f815e.setText(charSequenceOptString3);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1205e(String str, String str2, View view) {
        if (!TextUtils.isEmpty(str)) {
            zvf0.r(str, "p_chat_view");
        }
        if (str2.startsWith("http")) {
            getContext().startActivity(MkWebViewAct.b2(getContext(), "", str2, true));
        } else if (str2.startsWith("tantan")) {
            CoreModule.P().i().Y(xdl0.D(getContext()), Uri.parse(str2));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1202b(this);
        this.f813c.getPaint().setFakeBoldText(true);
        this.f815e.getPaint().setFakeBoldText(true);
        if (ura.e().d().I4()) {
            this.f813c.setTextColor(getResources().getColor(a1c0.g));
            this.f814d.setTextColor(getResources().getColor(a1c0.i));
            this.f815e.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemDiceInvite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f816f = false;
    }

    public ItemDiceInvite(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f816f = false;
    }
}
