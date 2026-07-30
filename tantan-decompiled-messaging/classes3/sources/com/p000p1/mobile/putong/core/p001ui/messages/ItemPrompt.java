package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPrompt;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.bdq;
import l.c3c0;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.qib0;
import l.ura;
import l.xdl0;
import p003l.d30;
import p003l.e30;
import p003l.fcz;
import p003l.m250;
import p003l.w9j;
import p014rx.C1099c;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPrompt extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1303a;

    /* JADX INFO: renamed from: b */
    public VImage f1304b;

    /* JADX INFO: renamed from: c */
    public VText f1305c;

    /* JADX INFO: renamed from: d */
    public VText f1306d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f1307e;

    /* JADX INFO: renamed from: f */
    public VLinear f1308f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f1309g;

    /* JADX INFO: renamed from: h */
    public VText f1310h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f1311i;

    /* JADX INFO: renamed from: j */
    public VText f1312j;

    /* JADX INFO: renamed from: k */
    public VText f1313k;

    /* JADX INFO: renamed from: l */
    public long f1314l;

    public ItemPrompt(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1675b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C1099c m1678e(String str, Message message, String str2, String str3, Conversation conversation) {
        return TextUtils.equals(str, "normal") ? CoreModule.c.f0.yh(((DbObject) message).id, str2, str3, message.value) : C1099c.just(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1679f(String str) {
        if (str.equals("wx")) {
            return;
        }
        str.equals("code");
    }

    /* JADX INFO: renamed from: g */
    public final void m1680g(View view) {
        bdq.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public MessagesAct m1681h() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: i */
    public boolean m1682i() {
        fcz fczVar = m1681h().f1531f;
        return NullChecker.a(fczVar) && fczVar.m4199Y3();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1683j(String str, Message message, Conversation conversation, Boolean bool) {
        boolean z = false;
        if (TextUtils.equals(str, "normal") && !bool.booleanValue()) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        m1687n(message, str);
        if ((conversation.localBotheringTime < 0.0d && str.equals("normal")) || ((conversation.localBotherCodeTime < 0.0d && str.equals("code")) || (conversation.localBotherWxTime < 0.0d && str.equals("wx")))) {
            z = true;
        }
        xdl0.M0(this.f1308f, !z);
        xdl0.M0(this.f1313k, z);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1684k(String str, Message message, View view) {
        if (str.equals("wx")) {
            CoreModule.c.f0.sq(message.cid, -message.createdTime);
        } else if (str.equals("code")) {
            CoreModule.c.f0.rq(message.cid, -message.createdTime);
        } else {
            CoreModule.c.f0.tq(message.cid, -message.createdTime);
            o6j0.c("e_chat_view_spammer_alert_report", m1681h().pageId(), new o6j0.a[]{o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1"), o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_send_values", "nothing")});
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m1685l(Message message, final String str, View view) {
        CoreModule.P().i().x1(m1681h(), CoreModule.c.e0.Pa(message.owner), ((DbObject) message).id, new d30() { // from class: l.rcq
            @Override // p003l.d30
            public final void call() {
                ItemPrompt.m1679f(str);
            }
        }, m1682i());
        if (str == "normal") {
            o6j0.c("e_chat_view_spammer_alert_report", m1681h().pageId(), new o6j0.a[]{o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1"), o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_send_values", "report")});
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1686m(final Message message, final Conversation conversation, final String str, final String str2, final String str3) {
        m1681h().duringCreated(CoreModule.c.f0.Ne(message.cid).flatMap(new w9j() { // from class: l.mcq
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ItemPrompt.m1678e(str, message, str2, str3, (Conversation) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.ncq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5872a.m1683j(str, message, conversation, (Boolean) obj);
            }
        }, new e30() { // from class: l.ocq
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemPrompt.m1675b((Throwable) obj);
            }
        }));
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
    /* JADX INFO: renamed from: n */
    public final void m1687n(final Message message, final String str) {
        if (str.equals("wx")) {
            this.f1305c.setText("对方是否有不良行为？");
            this.f1306d.setText(m1681h().getString(R.string.k3) + "\n\n活动期间，举报成功会获得奖励哦");
        } else {
            boolean zEquals = str.equals("code");
            AppCompatTextView appCompatTextView = this.f1305c;
            if (zEquals) {
                appCompatTextView.setText("请谨慎提供验证码信息");
                this.f1306d.setText(m1681h().getString(R.string.l3) + "\n\n活动期间，举报成功会获得奖励哦");
            } else {
                appCompatTextView.setText(R.string.y4);
                this.f1306d.setText(R.string.w4);
            }
        }
        AppCompatTextView appCompatTextView2 = this.f1305c;
        appCompatTextView2.setText(appCompatTextView2.getText().toString());
        if (str == "normal" && mqi0.o() - this.f1314l >= 1000) {
            if (!m1681h().m8104K(((DbObject) message).id + "e_chat_view_spammer_alert_report_show")) {
                m1681h().m8103I(((DbObject) message).id + "e_chat_view_spammer_alert_report_show");
                this.f1314l = mqi0.o();
                o6j0.h("e_chat_view_spammer_alert_report_show", m1681h().pageId(), new o6j0.a[]{o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1")});
            }
        }
        this.f1309g.setOnClickListener(new View.OnClickListener() { // from class: l.pcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6365a.m1684k(str, message, view);
            }
        });
        this.f1311i.setOnClickListener(new View.OnClickListener() { // from class: l.qcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6624a.m1685l(message, str, view);
            }
        });
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
        m1680g(this);
        if (ura.e().d().I4()) {
            this.f1304b.setImageResource(c3c0.R5);
            this.f1305c.setTextColor(getResources().getColor(a1c0.g));
            this.f1306d.setTextColor(getResources().getColor(a1c0.i));
            this.f1310h.setTextColor(getResources().getColor(a1c0.g));
            this.f1312j.setTextColor(getResources().getColor(a1c0.g));
            this.f1313k.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPrompt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
