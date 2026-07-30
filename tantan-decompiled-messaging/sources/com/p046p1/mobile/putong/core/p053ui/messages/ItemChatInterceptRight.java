package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChatInterceptRight;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VText;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.i0g0;
import p149l.j000;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.y1q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatInterceptRight extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemChatInterceptRight f30872a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f30873b;

    /* JADX INFO: renamed from: c */
    public VText f30874c;

    /* JADX INFO: renamed from: d */
    public j000 f30875d;

    /* JADX INFO: renamed from: e */
    public Message f30876e;

    public ItemChatInterceptRight(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48076c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m48077d(View view) {
        y1q.m212260a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public MessagesAct m48078e() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48079f(Message message) {
        CoreModule.f17545c.f19642f0.f19922b0.onNext(this.f30876e);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48080g(View view) {
        m48078e().mo48974l().mo120858x6();
        String str = this.f30876e.value;
        String strMo120828r3 = m48078e().mo48974l().mo120828r3();
        String strM119126L = qib0.f154711Z.m119126L(str);
        MessageType messageType = this.f30876e.messageType;
        if (messageType == null || TEnum.equals(messageType, "default") || TEnum.equals(this.f30876e.messageType, "unknown_")) {
            Message message = this.f30876e;
            message.messageType = message.messageType();
        }
        CoreModule.f17545c.f19642f0.m32748Np(false);
        j000 j000Var = this.f30875d;
        MessagesAct messagesActM48078e = m48078e();
        C4740g c4740g = CoreModule.f17545c.f19642f0;
        Message message2 = this.f30876e;
        j000Var.mo67374c(messagesActM48078e, c4740g.m32623Dn(message2.cid, message2, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.w1q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184035a.m48079f((Message) obj);
            }
        }, new e30() { // from class: l.x1q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemChatInterceptRight.m48076c((Throwable) obj);
            }
        }));
        if (this.f30876e.localFailType == 4) {
            o6j0.m162859c("e_wechat_notice", m48078e().pageId(), new o6j0.C18854a[0]);
        } else {
            o6j0.m162859c("e_chat_view_sensitive_words_send_tips", m48078e().pageId(), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), o6j0.C18854a.m162878h("message_send_status", ""), o6j0.C18854a.m162878h("message_receiver", strMo120828r3), o6j0.C18854a.m162878h("sensitiveword", strM119126L), o6j0.C18854a.m162878h("sensitive_text", str), o6j0.C18854a.m162878h("message_send_values", "send"));
            xdl0.m208344M(this.f30873b, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m48081h(j000 j000Var, Message message, User user) {
        String string;
        String string2;
        this.f30875d = j000Var;
        this.f30876e = message;
        xdl0.m208344M(this.f30873b, true);
        this.f30874c.setTextColor(getResources().getColor(a1c0.f67126H));
        this.f30874c.setBackgroundColor(0);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30874c.setTextColor(getResources().getColor(a1c0.f67155i));
        }
        if ((((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1) {
            this.f30874c.setBackground(getResources().getDrawable(c3c0.f78625R4));
            this.f30874c.setTextColor(getResources().getColor(a1c0.f67146a0));
        }
        if (message.localFailType == 4) {
            string = "根据探探君的经验，贸然要微信很容易被冷落，多聊聊被答应的概率会大幅提升哦";
            string2 = " 坚持发送";
        } else {
            string = m48078e().getString(R$string.f20882V5);
            string2 = m48078e().getString(R$string.f20890W5);
        }
        this.f30874c.setText(i0g0.m133861b0(string + string2, vwb.m200299M(string2), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67122D), eqh0.m117752c(3)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48077d(this);
        xdl0.m208329E0(this.f30874c, new View.OnClickListener() { // from class: l.v1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179269a.m48080g(view);
            }
        });
    }

    public ItemChatInterceptRight(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatInterceptRight(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
