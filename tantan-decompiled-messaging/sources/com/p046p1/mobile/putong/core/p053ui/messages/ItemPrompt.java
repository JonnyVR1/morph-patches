package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPrompt;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.bdq;
import p149l.c3c0;
import p149l.d30;
import p149l.e30;
import p149l.fcz;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.ura;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPrompt extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f31412a;

    /* JADX INFO: renamed from: b */
    public VImage f31413b;

    /* JADX INFO: renamed from: c */
    public VText f31414c;

    /* JADX INFO: renamed from: d */
    public VText f31415d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f31416e;

    /* JADX INFO: renamed from: f */
    public VLinear f31417f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f31418g;

    /* JADX INFO: renamed from: h */
    public VText f31419h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f31420i;

    /* JADX INFO: renamed from: j */
    public VText f31421j;

    /* JADX INFO: renamed from: k */
    public VText f31422k;

    /* JADX INFO: renamed from: l */
    public long f31423l;

    public ItemPrompt(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48591b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m48594e(String str, Message message, String str2, String str3, Conversation conversation) {
        return TextUtils.equals(str, "normal") ? CoreModule.f17545c.f19642f0.m33195yh(message.f56011id, str2, str3, message.value) : C22306c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m48595f(String str) {
        if (str.equals("wx")) {
            return;
        }
        str.equals("code");
    }

    /* JADX INFO: renamed from: g */
    public final void m48596g(View view) {
        bdq.m101200a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public MessagesAct m48597h() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: i */
    public boolean m48598i() {
        fcz fczVar = m48597h().f31640f;
        return NullChecker.m81303a(fczVar) && fczVar.m120734Y3();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48599j(String str, Message message, Conversation conversation, Boolean bool) {
        boolean z = false;
        if (TextUtils.equals(str, "normal") && !bool.booleanValue()) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        m48603n(message, str);
        if ((conversation.localBotheringTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && str.equals("normal")) || ((conversation.localBotherCodeTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && str.equals("code")) || (conversation.localBotherWxTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && str.equals("wx")))) {
            z = true;
        }
        xdl0.m208345M0(this.f31417f, !z);
        xdl0.m208345M0(this.f31422k, z);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m48600k(String str, Message message, View view) {
        if (str.equals("wx")) {
            CoreModule.f17545c.f19642f0.m33128sq(message.cid, -message.createdTime);
        } else if (str.equals("code")) {
            CoreModule.f17545c.f19642f0.m33115rq(message.cid, -message.createdTime);
        } else {
            CoreModule.f17545c.f19642f0.m33141tq(message.cid, -message.createdTime);
            o6j0.m162859c("e_chat_view_spammer_alert_report", m48597h().pageId(), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h("message_send_values", "nothing"));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m48601l(Message message, final String str, View view) {
        CoreModule.m29935P().m94658i().mo158467x1(m48597h(), CoreModule.f17545c.f19639e0.m169430Pa(message.owner), message.f56011id, new d30() { // from class: l.rcq
            @Override // p149l.d30
            public final void call() {
                ItemPrompt.m48595f(str);
            }
        }, m48598i());
        if (str == "normal") {
            o6j0.m162859c("e_chat_view_spammer_alert_report", m48597h().pageId(), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h("message_send_values", "report"));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m48602m(final Message message, final Conversation conversation, final String str, final String str2, final String str3) {
        m48597h().duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32737Ne(message.cid).flatMap(new w9j() { // from class: l.mcq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ItemPrompt.m48594e(str, message, str2, str3, (Conversation) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ncq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138221a.m48599j(str, message, conversation, (Boolean) obj);
            }
        }, new e30() { // from class: l.ocq
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemPrompt.m48591b((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final void m48603n(final Message message, final String str) {
        if (str.equals("wx")) {
            this.f31414c.setText("对方是否有不良行为？");
            this.f31415d.setText(m48597h().getString(R$string.f21010k3) + "\n\n活动期间，举报成功会获得奖励哦");
        } else {
            boolean zEquals = str.equals("code");
            VText vText = this.f31414c;
            if (zEquals) {
                vText.setText("请谨慎提供验证码信息");
                this.f31415d.setText(m48597h().getString(R$string.f21019l3) + "\n\n活动期间，举报成功会获得奖励哦");
            } else {
                vText.setText(R$string.f21129y4);
                this.f31415d.setText(R$string.f21113w4);
            }
        }
        VText vText2 = this.f31414c;
        vText2.setText(vText2.getText().toString());
        if (str == "normal" && mqi0.m155944o() - this.f31423l >= 1000) {
            if (!m48597h().m192794K(message.f56011id + "e_chat_view_spammer_alert_report_show")) {
                m48597h().m192793I(message.f56011id + "e_chat_view_spammer_alert_report_show");
                this.f31423l = mqi0.m155944o();
                o6j0.m162864h("e_chat_view_spammer_alert_report_show", m48597h().pageId(), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"));
            }
        }
        this.f31418g.setOnClickListener(new View.OnClickListener() { // from class: l.pcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148208a.m48600k(str, message, view);
            }
        });
        this.f31420i.setOnClickListener(new View.OnClickListener() { // from class: l.qcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153784a.m48601l(message, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48596g(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31413b.setImageResource(c3c0.f78626R5);
            this.f31414c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31415d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31419h.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31421j.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31422k.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrompt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
