package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPrompt;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bfq;
import p153l.bnl0;
import p153l.clz;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPrompt extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32260a;

    /* JADX INFO: renamed from: b */
    public VImage f32261b;

    /* JADX INFO: renamed from: c */
    public VText f32262c;

    /* JADX INFO: renamed from: d */
    public VText f32263d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f32264e;

    /* JADX INFO: renamed from: f */
    public VLinear f32265f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f32266g;

    /* JADX INFO: renamed from: h */
    public VText f32267h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f32268i;

    /* JADX INFO: renamed from: j */
    public VText f32269j;

    /* JADX INFO: renamed from: k */
    public VText f32270k;

    /* JADX INFO: renamed from: l */
    public long f32271l;

    public ItemPrompt(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49774b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22421c m49777e(String str, Message message, String str2, String str3, Conversation conversation) {
        return TextUtils.equals(str, "normal") ? CoreModule.f18264c.f20384f0.m34198yh(message.f56859id, str2, str3, message.value) : C22421c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m49778f(String str) {
        if (str.equals("wx")) {
            return;
        }
        str.equals("code");
    }

    /* JADX INFO: renamed from: g */
    public final void m49779g(View view) {
        bfq.m103977a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public MessagesAct m49780h() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: i */
    public boolean m49781i() {
        clz clzVar = m49780h().f32488f;
        return NullChecker.m82486a(clzVar) && clzVar.m110940Y3();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49782j(String str, Message message, Conversation conversation, Boolean bool) {
        boolean z = false;
        if (TextUtils.equals(str, "normal") && !bool.booleanValue()) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        m49786n(message, str);
        if ((conversation.localBotheringTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && str.equals("normal")) || ((conversation.localBotherCodeTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && str.equals("code")) || (conversation.localBotherWxTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && str.equals("wx")))) {
            z = true;
        }
        bnl0.m105525M0(this.f32265f, !z);
        bnl0.m105525M0(this.f32270k, z);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m49783k(String str, Message message, View view) {
        if (str.equals("wx")) {
            CoreModule.f18264c.f20384f0.m34131sq(message.cid, -message.createdTime);
        } else if (str.equals("code")) {
            CoreModule.f18264c.f20384f0.m34118rq(message.cid, -message.createdTime);
        } else {
            CoreModule.f18264c.f20384f0.m34144tq(message.cid, -message.createdTime);
            sfj0.m185596c("e_chat_view_spammer_alert_report", m49780h().pageId(), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h("message_send_values", "nothing"));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49784l(Message message, final String str, View view) {
        CoreModule.m30933P().m143412i().mo180559x1(m49780h(), CoreModule.f18264c.f20381e0.m116503Pa(message.owner), message.f56859id, new x20() { // from class: l.req
            @Override // p153l.x20
            public final void call() {
                ItemPrompt.m49778f(str);
            }
        }, m49781i());
        if (str == "normal") {
            sfj0.m185596c("e_chat_view_spammer_alert_report", m49780h().pageId(), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h("message_send_values", "report"));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m49785m(final Message message, final Conversation conversation, final String str, final String str2, final String str3) {
        m49780h().duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33740Ne(message.cid).flatMap(new qcj() { // from class: l.meq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ItemPrompt.m49777e(str, message, str2, str3, (Conversation) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.neq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141674a.m49782j(str, message, conversation, (Boolean) obj);
            }
        }, new y20() { // from class: l.oeq
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemPrompt.m49774b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m49786n(final Message message, final String str) {
        if (str.equals("wx")) {
            this.f32262c.setText("对方是否有不良行为？");
            this.f32263d.setText(m49780h().getString(R$string.f21752k3) + "\n\n活动期间，举报成功会获得奖励哦");
        } else {
            boolean zEquals = str.equals("code");
            VText vText = this.f32262c;
            if (zEquals) {
                vText.setText("请谨慎提供验证码信息");
                this.f32263d.setText(m49780h().getString(R$string.f21761l3) + "\n\n活动期间，举报成功会获得奖励哦");
            } else {
                vText.setText(R$string.f21871y4);
                this.f32263d.setText(R$string.f21855w4);
            }
        }
        VText vText2 = this.f32262c;
        vText2.setText(vText2.getText().toString());
        if (str == "normal" && pzi0.m174454o() - this.f32271l >= 1000) {
            if (!m49780h().m195420L(message.f56859id + "e_chat_view_spammer_alert_report_show")) {
                m49780h().m195419J(message.f56859id + "e_chat_view_spammer_alert_report_show");
                this.f32271l = pzi0.m174454o();
                sfj0.m185601h("e_chat_view_spammer_alert_report_show", m49780h().pageId(), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"));
            }
        }
        this.f32266g.setOnClickListener(new View.OnClickListener() { // from class: l.peq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152115a.m49783k(str, message, view);
            }
        });
        this.f32268i.setOnClickListener(new View.OnClickListener() { // from class: l.qeq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157199a.m49784l(message, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49779g(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32261b.setImageResource(ibc0.f113901R5);
            this.f32262c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32263d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32267h.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32269j.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32270k.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrompt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
