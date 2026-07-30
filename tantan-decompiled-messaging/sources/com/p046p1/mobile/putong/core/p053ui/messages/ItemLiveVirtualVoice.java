package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.LiveSchema;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLiveVirtualVoice;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tencent.open.SocialConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.j2e0;
import p149l.j760;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.q5q;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLiveVirtualVoice extends RelativeLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemLiveVirtualVoice f31074a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31075b;

    /* JADX INFO: renamed from: c */
    public VText f31076c;

    /* JADX INFO: renamed from: d */
    public VText f31077d;

    /* JADX INFO: renamed from: e */
    public String f31078e;

    /* JADX INFO: renamed from: f */
    public String f31079f;

    /* JADX INFO: renamed from: g */
    public String f31080g;

    /* JADX INFO: renamed from: h */
    public String f31081h;

    /* JADX INFO: renamed from: i */
    public boolean f31082i;

    public ItemLiveVirtualVoice(Context context) {
        super(context);
        this.f31082i = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48251b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.m151580j(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151578h(R$string.f20727C2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48252c(Act act) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R$string.f20775I2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m48253d(Runnable runnable, Act act) {
        e51.m114745J(runnable);
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        String str = message.msgData;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m48257h(new JSONObject(str), message);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m48256g(View view) {
        q5q.m173098a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m48257h(JSONObject jSONObject, Message message) {
        final String strOptString = jSONObject.optString("schemaSearch");
        boolean zContains = !TextUtils.isEmpty(strOptString) ? strOptString.contains("chat-share-voice-live") : false;
        if (zContains) {
            qib0.f154691G.m102354Y0(this.f31075b, c3c0.f78631S2);
        } else {
            qib0.f154691G.m102354Y0(this.f31075b, c3c0.f78639T2);
        }
        String strOptString2 = jSONObject.optString("title");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f31076c.setText(strOptString2);
        }
        String strOptString3 = jSONObject.optString(SocialConstants.PARAM_APP_DESC);
        if (!TextUtils.isEmpty(strOptString3)) {
            this.f31077d.setText(strOptString3);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            xdl0.m208329E0(this.f31074a, new View.OnClickListener() { // from class: l.k5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121218a.m48258i(strOptString, view);
                }
            });
        }
        this.f31078e = jSONObject.optString("anchorId");
        this.f31080g = jSONObject.optString("liveID");
        this.f31079f = jSONObject.optString("topicId");
        this.f31081h = jSONObject.optString("topicName");
        if (this.f31082i || TextUtils.isEmpty(strOptString) || !zContains) {
            return;
        }
        this.f31082i = true;
        zvf0.m220368A("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, j760.m140076a("anchorId", this.f31078e), j760.m140076a("liveId", this.f31080g), j760.m140076a("topic_id", this.f31079f), j760.m140076a("audio_room_label", this.f31081h), j760.m140076a("audio_card_type", "user_invite"));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48258i(String str, View view) {
        m48260k(str);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48259j(Act act, Envelope envelope) {
        Meta meta = envelope.meta;
        if (!TextUtils.isEmpty(meta.message) && !"OK".equals(meta.message)) {
            lsi0.m151595y(meta.message);
            return;
        }
        if (((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas == null || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas)) {
            return;
        }
        LiveSchema liveSchema = ((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(liveSchema.schema);
        String str = liveSchema.tip;
        if (zIsEmpty) {
            if (TextUtils.isEmpty(str)) {
                lsi0.m151578h(R$string.f20727C2);
                return;
            } else {
                lsi0.m151580j(liveSchema.tip);
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            lsi0.m151595y(liveSchema.tip);
        }
        j2e0.m139446m(act, Uri.parse(liveSchema.schema));
        if (TextUtils.isEmpty(liveSchema.schema) || !liveSchema.schema.contains(SchemeKey.enterVoiceRoom)) {
            return;
        }
        zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, j760.m140076a("anchorId", this.f31078e), j760.m140076a("liveId", this.f31080g), j760.m140076a("topic_id", this.f31079f), j760.m140076a("audio_room_label", this.f31081h), j760.m140076a("audio_card_type", "user_invite"));
    }

    /* JADX INFO: renamed from: k */
    public final void m48260k(String str) {
        final Act act = (Act) xdl0.m208328E(this.f31074a);
        final Runnable runnable = new Runnable() { // from class: l.l5q
            @Override // java.lang.Runnable
            public final void run() {
                ItemLiveVirtualVoice.m48252c(act);
            }
        };
        act.duringCreated(CoreModule.f17545c.f19642f0.m33178wp(str, false)).doOnSubscribe(new d30() { // from class: l.m5q
            @Override // p149l.d30
            public final void call() {
                e51.m114743H(act, runnable, 1000L);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.n5q
            @Override // p149l.d30
            public final void call() {
                ItemLiveVirtualVoice.m48253d(runnable, act);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.o5q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141922a.m48259j(act, (Envelope) obj);
            }
        }, new e30() { // from class: l.p5q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemLiveVirtualVoice.m48251b((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48256g(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31076c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31077d.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemLiveVirtualVoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31082i = false;
    }

    public ItemLiveVirtualVoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31082i = false;
    }
}
