package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChatInterceptRight;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.a1c0;
import l.c3c0;
import l.i0g0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y1q;
import org.eclipse.jetty.servlet.ServletHandler;
import p003l.bpz;
import p003l.e30;
import p003l.eqh0;
import p003l.j000;
import p003l.m250;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChatInterceptRight extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemChatInterceptRight f763a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f764b;

    /* JADX INFO: renamed from: c */
    public VText f765c;

    /* JADX INFO: renamed from: d */
    public j000 f766d;

    /* JADX INFO: renamed from: e */
    public Message f767e;

    public ItemChatInterceptRight(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1156c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m1157d(View view) {
        y1q.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public MessagesAct m1158e() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1159f(Message message) {
        CoreModule.c.f0.b0.onNext(this.f767e);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1160g(View view) {
        m1158e().mo2066l().m4325x6();
        String str = this.f767e.value;
        String strM4295r3 = m1158e().mo2066l().m4295r3();
        String strL = qib0.Z.L(str);
        MessageType messageType = this.f767e.messageType;
        if (messageType == null || TEnum.equals(messageType, ServletHandler.__DEFAULT_SERVLET) || TEnum.equals(this.f767e.messageType, "unknown_")) {
            Message message = this.f767e;
            message.messageType = message.messageType();
        }
        CoreModule.c.f0.Np(false);
        j000 j000Var = this.f766d;
        MessagesAct messagesActM1158e = m1158e();
        g gVar = CoreModule.c.f0;
        Message message2 = this.f767e;
        j000Var.c(messagesActM1158e, gVar.Dn(message2.cid, message2, (Sticker) null)).subscribe((m250) mkd0.H(new e30() { // from class: l.w1q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8478a.m1159f((Message) obj);
            }
        }, new e30() { // from class: l.x1q
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemChatInterceptRight.m1156c((Throwable) obj);
            }
        }));
        if (this.f767e.localFailType == 4) {
            o6j0.c("e_wechat_notice", m1158e().pageId(), new o6j0.a[0]);
        } else {
            o6j0.c("e_chat_view_sensitive_words_send_tips", m1158e().pageId(), new o6j0.a[]{o6j0.a.h("message_id", ""), o6j0.a.h("message_send_status", ""), o6j0.a.h("message_receiver", strM4295r3), o6j0.a.h("sensitiveword", strL), o6j0.a.h("sensitive_text", str), o6j0.a.h("message_send_values", "send")});
            xdl0.M(this.f764b, false);
        }
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
    /* JADX INFO: renamed from: h */
    public void m1161h(j000 j000Var, Message message, User user) {
        String string;
        String string2;
        this.f766d = j000Var;
        this.f767e = message;
        xdl0.M(this.f764b, true);
        this.f765c.setTextColor(getResources().getColor(a1c0.H));
        this.f765c.setBackgroundColor(0);
        if (ura.e().d().I4()) {
            this.f765c.setTextColor(getResources().getColor(a1c0.i));
        }
        if ((((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1) {
            this.f765c.setBackground(getResources().getDrawable(c3c0.R4));
            this.f765c.setTextColor(getResources().getColor(a1c0.a0));
        }
        if (message.localFailType == 4) {
            string = "根据探探君的经验，贸然要微信很容易被冷落，多聊聊被答应的概率会大幅提升哦";
            string2 = " 坚持发送";
        } else {
            string = m1158e().getString(R.string.V5);
            string2 = m1158e().getString(R.string.W5);
        }
        this.f765c.setText(i0g0.b0(string + string2, vwb.M(string2), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.D), eqh0.m3924c(3)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1157d(this);
        xdl0.E0(this.f765c, new View.OnClickListener() { // from class: l.v1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8166a.m1160g(view);
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
