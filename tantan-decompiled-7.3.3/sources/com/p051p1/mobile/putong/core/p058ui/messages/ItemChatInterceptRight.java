package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChatInterceptRight;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VText;
import p153l.bnl0;
import p153l.g900;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.psd0;
import p153l.q8g0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;
import p153l.y3q;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatInterceptRight extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemChatInterceptRight f31720a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f31721b;

    /* JADX INFO: renamed from: c */
    public VText f31722c;

    /* JADX INFO: renamed from: d */
    public g900 f31723d;

    /* JADX INFO: renamed from: e */
    public Message f31724e;

    public ItemChatInterceptRight(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49259c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m49260d(View view) {
        y3q.m214170a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public MessagesAct m49261e() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49262f(Message message) {
        CoreModule.f18264c.f20384f0.f20664b0.onNext(this.f31724e);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49263g(View view) {
        m49261e().mo50158l().mo111064x6();
        String str = this.f31724e.value;
        String strMo111034r3 = m49261e().mo50158l().mo111034r3();
        String strM95955L = uqb0.f180394Z.m95955L(str);
        MessageType messageType = this.f31724e.messageType;
        if (messageType == null || TEnum.equals(messageType, "default") || TEnum.equals(this.f31724e.messageType, "unknown_")) {
            Message message = this.f31724e;
            message.messageType = message.messageType();
        }
        CoreModule.f18264c.f20384f0.m33751Np(false);
        g900 g900Var = this.f31723d;
        MessagesAct messagesActM49261e = m49261e();
        C4891g c4891g = CoreModule.f18264c.f20384f0;
        Message message2 = this.f31724e;
        g900Var.mo68557c(messagesActM49261e, c4891g.m33626Dn(message2.cid, message2, null)).subscribe(psd0.m173597H(new y20() { // from class: l.w3q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187162a.m49262f((Message) obj);
            }
        }, new y20() { // from class: l.x3q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemChatInterceptRight.m49259c((Throwable) obj);
            }
        }));
        if (this.f31724e.localFailType == 4) {
            sfj0.m185596c("e_wechat_notice", m49261e().pageId(), new sfj0.C20032a[0]);
        } else {
            sfj0.m185596c("e_chat_view_sensitive_words_send_tips", m49261e().pageId(), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), sfj0.C20032a.m185615h("message_send_status", ""), sfj0.C20032a.m185615h("message_receiver", strMo111034r3), sfj0.C20032a.m185615h("sensitiveword", strM95955L), sfj0.C20032a.m185615h("sensitive_text", str), sfj0.C20032a.m185615h("message_send_values", "send"));
            bnl0.m105524M(this.f31721b, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m49264h(g900 g900Var, Message message, User user) {
        String string;
        String string2;
        this.f31723d = g900Var;
        this.f31724e = message;
        bnl0.m105524M(this.f31721b, true);
        this.f31722c.setTextColor(getResources().getColor(g9c0.f102790H));
        this.f31722c.setBackgroundColor(0);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31722c.setTextColor(getResources().getColor(g9c0.f102819i));
        }
        if ((((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz) && ((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1) {
            this.f31722c.setBackground(getResources().getDrawable(ibc0.f113900R4));
            this.f31722c.setTextColor(getResources().getColor(g9c0.f102810a0));
        }
        if (message.localFailType == 4) {
            string = "根据探探君的经验，贸然要微信很容易被冷落，多聊聊被答应的概率会大幅提升哦";
            string2 = " 坚持发送";
        } else {
            string = m49261e().getString(R$string.f21624V5);
            string2 = m49261e().getString(R$string.f21632W5);
        }
        this.f31722c.setText(q8g0.m175796b0(string + string2, jyb.m147482M(string2), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102786D), lyh0.m156283c(3)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49260d(this);
        bnl0.m105509E0(this.f31722c, new View.OnClickListener() { // from class: l.v3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182227a.m49263g(view);
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
