package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemLiveVirtualVoice;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.LiveSchema;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Meta;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e51;
import l.j2e0;
import l.j760;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.q5q;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;
import p003l.d30;
import p003l.e30;
import p003l.m250;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLiveVirtualVoice extends RelativeLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemLiveVirtualVoice f965a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f966b;

    /* JADX INFO: renamed from: c */
    public VText f967c;

    /* JADX INFO: renamed from: d */
    public VText f968d;

    /* JADX INFO: renamed from: e */
    public String f969e;

    /* JADX INFO: renamed from: f */
    public String f970f;

    /* JADX INFO: renamed from: g */
    public String f971g;

    /* JADX INFO: renamed from: h */
    public String f972h;

    /* JADX INFO: renamed from: i */
    public boolean f973i;

    public ItemLiveVirtualVoice(Context context) {
        super(context);
        this.f973i = false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1334b(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.j(coreService.metaMessage);
                return;
            }
        }
        lsi0.h(R.string.C2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1335c(Act act) {
        if (act.isFinishing()) {
            return;
        }
        act.progress(R.string.I2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1336d(Runnable runnable, Act act) {
        e51.J(runnable);
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        String str = message.msgData;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m1340h(new JSONObject(str), message);
        } catch (JSONException unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m1339g(View view) {
        q5q.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m1340h(JSONObject jSONObject, Message message) {
        final String strOptString = jSONObject.optString("schemaSearch");
        boolean zContains = !TextUtils.isEmpty(strOptString) ? strOptString.contains("chat-share-voice-live") : false;
        if (zContains) {
            qib0.G.Y0(this.f966b, c3c0.S2);
        } else {
            qib0.G.Y0(this.f966b, c3c0.T2);
        }
        CharSequence charSequenceOptString = jSONObject.optString(MessageBundle.TITLE_ENTRY);
        if (!TextUtils.isEmpty(charSequenceOptString)) {
            this.f967c.setText(charSequenceOptString);
        }
        CharSequence charSequenceOptString2 = jSONObject.optString("desc");
        if (!TextUtils.isEmpty(charSequenceOptString2)) {
            this.f968d.setText(charSequenceOptString2);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            xdl0.E0(this.f965a, new View.OnClickListener() { // from class: l.k5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4806a.m1341i(strOptString, view);
                }
            });
        }
        this.f969e = jSONObject.optString("anchorId");
        this.f971g = jSONObject.optString("liveID");
        this.f970f = jSONObject.optString("topicId");
        this.f972h = jSONObject.optString("topicName");
        if (this.f973i || TextUtils.isEmpty(strOptString) || !zContains) {
            return;
        }
        this.f973i = true;
        zvf0.A("e_live_audio_room_enter", "p_chat_view", new j760[]{j760.a("anchorId", this.f969e), j760.a("liveId", this.f971g), j760.a("topic_id", this.f970f), j760.a("audio_room_label", this.f972h), j760.a("audio_card_type", "user_invite")});
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1341i(String str, View view) {
        m1343k(str);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1342j(Act act, Envelope envelope) {
        Meta meta = envelope.meta;
        if (!TextUtils.isEmpty(meta.message) && !"OK".equals(meta.message)) {
            lsi0.y(meta.message);
            return;
        }
        if (envelope.getModuleData(CoreData.class).liveSchemas == null || vwb.J(envelope.getModuleData(CoreData.class).liveSchemas)) {
            return;
        }
        LiveSchema liveSchema = (LiveSchema) envelope.getModuleData(CoreData.class).liveSchemas.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(liveSchema.schema);
        String str = liveSchema.tip;
        if (zIsEmpty) {
            if (TextUtils.isEmpty(str)) {
                lsi0.h(R.string.C2);
                return;
            } else {
                lsi0.j(liveSchema.tip);
                return;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            lsi0.y(liveSchema.tip);
        }
        j2e0.m(act, Uri.parse(liveSchema.schema));
        if (TextUtils.isEmpty(liveSchema.schema) || !liveSchema.schema.contains("enterVoiceRoom")) {
            return;
        }
        zvf0.u("e_live_audio_room_enter", "p_chat_view", new j760[]{j760.a("anchorId", this.f969e), j760.a("liveId", this.f971g), j760.a("topic_id", this.f970f), j760.a("audio_room_label", this.f972h), j760.a("audio_card_type", "user_invite")});
    }

    /* JADX INFO: renamed from: k */
    public final void m1343k(String str) {
        final Act actE = xdl0.E(this.f965a);
        final Runnable runnable = new Runnable() { // from class: l.l5q
            @Override // java.lang.Runnable
            public final void run() {
                ItemLiveVirtualVoice.m1335c(actE);
            }
        };
        actE.duringCreated(CoreModule.c.f0.wp(str, false)).doOnSubscribe(new d30() { // from class: l.m5q
            @Override // p003l.d30
            public final void call() {
                e51.H(actE, runnable, 1000L);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.n5q
            @Override // p003l.d30
            public final void call() {
                ItemLiveVirtualVoice.m1336d(runnable, actE);
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.o5q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6044a.m1342j(actE, (Envelope) obj);
            }
        }, new e30() { // from class: l.p5q
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemLiveVirtualVoice.m1334b((Throwable) obj);
            }
        }));
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
        m1339g(this);
        if (ura.e().d().I4()) {
            this.f967c.setTextColor(getResources().getColor(a1c0.g));
            this.f968d.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemLiveVirtualVoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f973i = false;
    }

    public ItemLiveVirtualVoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f973i = false;
    }
}
