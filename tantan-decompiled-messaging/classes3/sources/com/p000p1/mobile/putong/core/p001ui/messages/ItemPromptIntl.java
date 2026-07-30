package com.p000p1.mobile.putong.core.p001ui.messages;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemPromptIntl;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.DialogAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.adq;
import l.e51;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.qib0;
import l.roj0;
import l.xdl0;
import l.yij0;
import p003l.e30;
import p003l.m250;
import p003l.x9j;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPromptIntl extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1315a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f1316b;

    /* JADX INFO: renamed from: c */
    public VText f1317c;

    /* JADX INFO: renamed from: d */
    public VText f1318d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f1319e;

    /* JADX INFO: renamed from: f */
    public VText f1320f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f1321g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f1322h;

    /* JADX INFO: renamed from: i */
    public VText f1323i;

    /* JADX INFO: renamed from: j */
    public VText f1324j;

    /* JADX INFO: renamed from: k */
    public VLinear f1325k;

    /* JADX INFO: renamed from: l */
    public long f1326l;

    public ItemPromptIntl(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1688a(Message message, View view) {
        CoreModule.c.f0.uq(message.cid, -message.createdTime, 1);
        o6j0.c("e_chat_view_spammer_alert_report", "p_chat_view", new o6j0.a[]{o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1"), o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_send_values", "nothing")});
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ roj0 m1689b(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1691d(Act act, final User user, roj0 roj0Var) {
        act.progressDismiss();
        act.finish();
        e51.H(CoreModule.b, new Runnable() { // from class: l.zcq
            @Override // java.lang.Runnable
            public final void run() {
                ItemPromptIntl.m1693f(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1693f(User user) {
        Application application = CoreModule.b;
        application.startActivity(DialogAct.O0(application, 2, user));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m1694g(Message message, View view) {
        CoreModule.c.f0.uq(message.cid, -message.createdTime, 7);
        o6j0.c("e_chat_view_spammer_alert_twice_report", "p_chat_view", new o6j0.a[]{o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1"), o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_send_values", "nothing")});
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1695h(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: i */
    public final void m1696i(View view) {
        adq.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public MessagesAct m1697j() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m1698k(Message message, View view) {
        CoreModule.c.f0.uq(message.cid, message.createdTime, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        this.f1321g.startAnimation(scaleAnimation);
        o6j0.c("e_chat_view_spammer_alert_report", "p_chat_view", new o6j0.a[]{o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1"), o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_send_values", "report")});
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m1699l(Message message, View view) {
        CoreModule.c.f0.uq(message.cid, message.createdTime, 15);
        o6j0.c("e_chat_view_spammer_alert_twice_report", "p_chat_view", new o6j0.a[]{o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1"), o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_send_values", "report")});
        m1702o(m1697j(), message.cid, ((DbObject) message).id);
    }

    /* JADX INFO: renamed from: m */
    public void m1700m(final Message message, Conversation conversation) {
        m1701n(conversation.localBotherStatus);
        xdl0.E0(this.f1317c, new View.OnClickListener() { // from class: l.scq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7215a.m1698k(message, view);
            }
        });
        xdl0.E0(this.f1318d, new View.OnClickListener() { // from class: l.tcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPromptIntl.m1688a(message, view);
            }
        });
        xdl0.E0(this.f1323i, new View.OnClickListener() { // from class: l.ucq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7965a.m1699l(message, view);
            }
        });
        xdl0.E0(this.f1324j, new View.OnClickListener() { // from class: l.vcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPromptIntl.m1694g(message, view);
            }
        });
        if (mqi0.o() - this.f1326l >= 1000) {
            this.f1326l = mqi0.o();
            if (!m1697j().m8104K(((DbObject) message).id + "e_chat_view_spammer_alert_report_show")) {
                m1697j().m8103I(((DbObject) message).id + "e_chat_view_spammer_alert_report_show");
                o6j0.h("e_chat_view_spammer_alert_report_show", "p_chat_view", new o6j0.a[]{o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1")});
            }
            if ((conversation.localBotherStatus & 3) == 3) {
                if (m1697j().m8104K(((DbObject) message).id + "e_chat_view_spammer_alert_report_twice_show")) {
                    return;
                }
                m1697j().m8103I(((DbObject) message).id + "e_chat_view_spammer_alert_report_twice_show");
                o6j0.h("e_chat_view_spammer_alert_report_twice_show", "p_chat_view", new o6j0.a[]{o6j0.a.h("received_user_id", CoreModule.H().userId()), o6j0.a.h("sensitiveword", qib0.Z.L(message.value)), o6j0.a.h("sensitive_text", message.value), o6j0.a.h("message_id", ((DbObject) message).id), o6j0.a.h("message_send_status", "1")});
            }
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
    /* JADX INFO: renamed from: n */
    public final void m1701n(int i) {
        if ((i & 1) != 1) {
            xdl0.M(this.f1321g, false);
            xdl0.M0(this.f1316b, true);
            xdl0.M0(this.f1319e, false);
            return;
        }
        xdl0.M0(this.f1316b, false);
        xdl0.M0(this.f1319e, true);
        if ((i & 2) != 2) {
            xdl0.M(this.f1321g, false);
            this.f1320f.setText(R.string.q);
            return;
        }
        this.f1320f.setText(R.string.r);
        xdl0.M(this.f1321g, true);
        if ((i & 4) != 4 || (i & 8) == 8) {
            xdl0.M0(this.f1322h, true);
            xdl0.M0(this.f1325k, false);
        } else {
            xdl0.M0(this.f1322h, false);
            xdl0.M0(this.f1325k, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1702o(final Act act, String str, String str2) {
        final User userById = CoreModule.K().getUserById(str);
        if (NullChecker.a(userById) && NullChecker.a(act)) {
            Report report = new Report();
            report.category = Report.CATEGORY_DEFAULT;
            report.value = act.getString(R.string.P5);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            report.chatMessages = arrayList;
            new Relationship().state = RelationshipStatus.get("blocked");
            act.progress(R.string.I2, true);
            mkd0.r(CoreModule.c.e0.ha(((DbObject) userById).id, report), CoreModule.c.f0.qe(((DbObject) userById).id, act), new x9j() { // from class: l.wcq
                @Override // p003l.x9j
                public final Object call(Object obj, Object obj2) {
                    return ItemPromptIntl.m1689b((roj0) obj, (roj0) obj2);
                }
            }).subscribe((m250) mkd0.H(new e30() { // from class: l.xcq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemPromptIntl.m1691d(act, userById, (roj0) obj);
                }
            }, new e30() { // from class: l.ycq
                @Override // p003l.e30
                public final void call(Object obj) {
                    ItemPromptIntl.m1695h(act, (Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1696i(this);
    }

    public ItemPromptIntl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPromptIntl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
