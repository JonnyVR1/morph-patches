package com.p046p1.mobile.putong.core.p053ui.messages;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemPromptIntl;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VLinear;
import p147v.VText;
import p149l.adq;
import p149l.e30;
import p149l.e51;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.roj0;
import p149l.x9j;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPromptIntl extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f31424a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f31425b;

    /* JADX INFO: renamed from: c */
    public VText f31426c;

    /* JADX INFO: renamed from: d */
    public VText f31427d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f31428e;

    /* JADX INFO: renamed from: f */
    public VText f31429f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f31430g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f31431h;

    /* JADX INFO: renamed from: i */
    public VText f31432i;

    /* JADX INFO: renamed from: j */
    public VText f31433j;

    /* JADX INFO: renamed from: k */
    public VLinear f31434k;

    /* JADX INFO: renamed from: l */
    public long f31435l;

    public ItemPromptIntl(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48604a(Message message, View view) {
        CoreModule.f17545c.f19642f0.m33154uq(message.cid, -message.createdTime, 1);
        o6j0.m162859c("e_chat_view_spammer_alert_report", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h("message_send_values", "nothing"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ roj0 m48605b(roj0 roj0Var, roj0 roj0Var2) {
        return roj0Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m48607d(Act act, final User user, roj0 roj0Var) {
        act.progressDismiss();
        act.m66873d2();
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.zcq
            @Override // java.lang.Runnable
            public final void run() {
                ItemPromptIntl.m48609f(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m48609f(User user) {
        Application application = CoreModule.f17544b;
        application.startActivity(DialogAct.m79377O0(application, 2, user));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m48610g(Message message, View view) {
        CoreModule.f17545c.f19642f0.m33154uq(message.cid, -message.createdTime, 7);
        o6j0.m162859c("e_chat_view_spammer_alert_twice_report", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h("message_send_values", "nothing"));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m48611h(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: i */
    public final void m48612i(View view) {
        adq.m95910a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public MessagesAct m48613j() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m48614k(Message message, View view) {
        CoreModule.f17545c.f19642f0.m33154uq(message.cid, message.createdTime, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        this.f31430g.startAnimation(scaleAnimation);
        o6j0.m162859c("e_chat_view_spammer_alert_report", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h("message_send_values", "report"));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m48615l(Message message, View view) {
        CoreModule.f17545c.f19642f0.m33154uq(message.cid, message.createdTime, 15);
        o6j0.m162859c("e_chat_view_spammer_alert_twice_report", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"), o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h("message_send_values", "report"));
        m48618o(m48613j(), message.cid, message.f56011id);
    }

    /* JADX INFO: renamed from: m */
    public void m48616m(final Message message, Conversation conversation) {
        m48617n(conversation.localBotherStatus);
        xdl0.m208329E0(this.f31426c, new View.OnClickListener() { // from class: l.scq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163761a.m48614k(message, view);
            }
        });
        xdl0.m208329E0(this.f31427d, new View.OnClickListener() { // from class: l.tcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPromptIntl.m48604a(message, view);
            }
        });
        xdl0.m208329E0(this.f31432i, new View.OnClickListener() { // from class: l.ucq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175842a.m48615l(message, view);
            }
        });
        xdl0.m208329E0(this.f31433j, new View.OnClickListener() { // from class: l.vcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPromptIntl.m48610g(message, view);
            }
        });
        if (mqi0.m155944o() - this.f31435l >= 1000) {
            this.f31435l = mqi0.m155944o();
            if (!m48613j().m192794K(message.f56011id + "e_chat_view_spammer_alert_report_show")) {
                m48613j().m192793I(message.f56011id + "e_chat_view_spammer_alert_report_show");
                o6j0.m162864h("e_chat_view_spammer_alert_report_show", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"));
            }
            if ((conversation.localBotherStatus & 3) == 3) {
                if (m48613j().m192794K(message.f56011id + "e_chat_view_spammer_alert_report_twice_show")) {
                    return;
                }
                m48613j().m192793I(message.f56011id + "e_chat_view_spammer_alert_report_twice_show");
                o6j0.m162864h("e_chat_view_spammer_alert_report_twice_show", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("received_user_id", CoreModule.m29931H().userId()), o6j0.C18854a.m162878h("sensitiveword", qib0.f154711Z.m119126L(message.value)), o6j0.C18854a.m162878h("sensitive_text", message.value), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), o6j0.C18854a.m162878h("message_send_status", "1"));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m48617n(int i) {
        if ((i & 1) != 1) {
            xdl0.m208344M(this.f31430g, false);
            xdl0.m208345M0(this.f31425b, true);
            xdl0.m208345M0(this.f31428e, false);
            return;
        }
        xdl0.m208345M0(this.f31425b, false);
        xdl0.m208345M0(this.f31428e, true);
        if ((i & 2) != 2) {
            xdl0.m208344M(this.f31430g, false);
            this.f31429f.setText(R$string.f21060q);
            return;
        }
        this.f31429f.setText(R$string.f21068r);
        xdl0.m208344M(this.f31430g, true);
        if ((i & 4) != 4 || (i & 8) == 8) {
            xdl0.m208345M0(this.f31431h, true);
            xdl0.m208345M0(this.f31434k, false);
        } else {
            xdl0.m208345M0(this.f31431h, false);
            xdl0.m208345M0(this.f31434k, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m48618o(final Act act, String str, String str2) {
        final User userById = CoreModule.m29932K().getUserById(str);
        if (NullChecker.m81303a(userById) && NullChecker.m81303a(act)) {
            Report report = new Report();
            report.category = Report.CATEGORY_DEFAULT;
            report.value = act.getString(R$string.f20834P5);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            report.chatMessages = arrayList;
            new Relationship().state = RelationshipStatus.get("blocked");
            act.progress(R$string.f20775I2, true);
            mkd0.m154984r(CoreModule.f17545c.f19639e0.m169496ha(userById.f56011id, report), CoreModule.f17545c.f19642f0.m33090qe(userById.f56011id, act), new x9j() { // from class: l.wcq
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return ItemPromptIntl.m48605b((roj0) obj, (roj0) obj2);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.xcq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemPromptIntl.m48607d(act, userById, (roj0) obj);
                }
            }, new e30() { // from class: l.ycq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemPromptIntl.m48611h(act, (Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48612i(this);
    }

    public ItemPromptIntl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPromptIntl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
