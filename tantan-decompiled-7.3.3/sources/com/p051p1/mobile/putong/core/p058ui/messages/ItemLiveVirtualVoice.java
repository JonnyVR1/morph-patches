package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.LiveSchema;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLiveVirtualVoice;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tencent.open.SocialConstants;
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
import p153l.jyb;
import p153l.l51;
import p153l.nae0;
import p153l.o1j0;
import p153l.ovb0;
import p153l.pf60;
import p153l.psd0;
import p153l.q7q;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLiveVirtualVoice extends RelativeLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemLiveVirtualVoice f31922a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31923b;

    /* JADX INFO: renamed from: c */
    public VText f31924c;

    /* JADX INFO: renamed from: d */
    public VText f31925d;

    /* JADX INFO: renamed from: e */
    public String f31926e;

    /* JADX INFO: renamed from: f */
    public String f31927f;

    /* JADX INFO: renamed from: g */
    public String f31928g;

    /* JADX INFO: renamed from: h */
    public String f31929h;

    /* JADX INFO: renamed from: i */
    public boolean f31930i;

    public ItemLiveVirtualVoice(Context context) {
        super(context);
        this.f31930i = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49434b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                o1j0.m165636j(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165634h(R$string.f21469C2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49435c(Act act) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f21517I2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49436d(Runnable runnable, Act act) {
        l51.m152890J(runnable);
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        String str = message.msgData;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m49440h(new JSONObject(str), message);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m49439g(View view) {
        q7q.m175706a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m49440h(JSONObject jSONObject, Message message) {
        final String strOptString = jSONObject.optString("schemaSearch");
        boolean zContains = !TextUtils.isEmpty(strOptString) ? strOptString.contains("chat-share-voice-live") : false;
        if (zContains) {
            uqb0.f180374G.m127138Y0(this.f31923b, ibc0.f113906S2);
        } else {
            uqb0.f180374G.m127138Y0(this.f31923b, ibc0.f113914T2);
        }
        String strOptString2 = jSONObject.optString("title");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f31924c.setText(strOptString2);
        }
        String strOptString3 = jSONObject.optString(SocialConstants.PARAM_APP_DESC);
        if (!TextUtils.isEmpty(strOptString3)) {
            this.f31925d.setText(strOptString3);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            bnl0.m105509E0(this.f31922a, new View.OnClickListener() { // from class: l.k7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124282a.m49441i(strOptString, view);
                }
            });
        }
        this.f31926e = jSONObject.optString("anchorId");
        this.f31928g = jSONObject.optString("liveID");
        this.f31927f = jSONObject.optString("topicId");
        this.f31929h = jSONObject.optString("topicName");
        if (this.f31930i || TextUtils.isEmpty(strOptString) || !zContains) {
            return;
        }
        this.f31930i = true;
        i4g0.m138492A("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, pf60.m172085a("anchorId", this.f31926e), pf60.m172085a("liveId", this.f31928g), pf60.m172085a("topic_id", this.f31927f), pf60.m172085a("audio_room_label", this.f31929h), pf60.m172085a("audio_card_type", "user_invite"));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49441i(String str, View view) {
        m49443k(str);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49442j(Act act, Envelope envelope) {
        Meta meta = envelope.meta;
        if (!TextUtils.isEmpty(meta.message) && !"OK".equals(meta.message)) {
            o1j0.m165651y(meta.message);
            return;
        }
        if (((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas == null || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas)) {
            return;
        }
        LiveSchema liveSchema = ((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(liveSchema.schema);
        String str = liveSchema.tip;
        if (zIsEmpty) {
            if (TextUtils.isEmpty(str)) {
                o1j0.m165634h(R$string.f21469C2);
                return;
            } else {
                o1j0.m165636j(liveSchema.tip);
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            o1j0.m165651y(liveSchema.tip);
        }
        nae0.m162083m(act, Uri.parse(liveSchema.schema));
        if (TextUtils.isEmpty(liveSchema.schema) || !liveSchema.schema.contains(SchemeKey.enterVoiceRoom)) {
            return;
        }
        i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, pf60.m172085a("anchorId", this.f31926e), pf60.m172085a("liveId", this.f31928g), pf60.m172085a("topic_id", this.f31927f), pf60.m172085a("audio_room_label", this.f31929h), pf60.m172085a("audio_card_type", "user_invite"));
    }

    /* JADX INFO: renamed from: k */
    public final void m49443k(String str) {
        final Act act = (Act) bnl0.m105508E(this.f31922a);
        final Runnable runnable = new Runnable() { // from class: l.l7q
            @Override // java.lang.Runnable
            public final void run() {
                ItemLiveVirtualVoice.m49435c(act);
            }
        };
        act.duringCreated(CoreModule.f18264c.f20384f0.m34181wp(str, false)).doOnSubscribe(new x20() { // from class: l.m7q
            @Override // p153l.x20
            public final void call() {
                l51.m152888H(act, runnable, 1000L);
            }
        }).doOnUnsubscribe(new x20() { // from class: l.n7q
            @Override // p153l.x20
            public final void call() {
                ItemLiveVirtualVoice.m49436d(runnable, act);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.o7q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145290a.m49442j(act, (Envelope) obj);
            }
        }, new y20() { // from class: l.p7q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemLiveVirtualVoice.m49434b((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49439g(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31924c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31925d.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemLiveVirtualVoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31930i = false;
    }

    public ItemLiveVirtualVoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31930i = false;
    }
}
