package com.p051p1.mobile.putong.core.p058ui.messages;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemPromptIntl;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.DialogAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VLinear;
import p151v.VText;
import p153l.afq;
import p153l.bnl0;
import p153l.bsj0;
import p153l.l51;
import p153l.psd0;
import p153l.pzi0;
import p153l.rcj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPromptIntl extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32272a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f32273b;

    /* JADX INFO: renamed from: c */
    public VText f32274c;

    /* JADX INFO: renamed from: d */
    public VText f32275d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f32276e;

    /* JADX INFO: renamed from: f */
    public VText f32277f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f32278g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f32279h;

    /* JADX INFO: renamed from: i */
    public VText f32280i;

    /* JADX INFO: renamed from: j */
    public VText f32281j;

    /* JADX INFO: renamed from: k */
    public VLinear f32282k;

    /* JADX INFO: renamed from: l */
    public long f32283l;

    public ItemPromptIntl(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49787a(Message message, View view) {
        CoreModule.f18264c.f20384f0.m34157uq(message.cid, -message.createdTime, 1);
        sfj0.m185596c("e_chat_view_spammer_alert_report", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h("message_send_values", "nothing"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ uxj0 m49788b(uxj0 uxj0Var, uxj0 uxj0Var2) {
        return uxj0Var;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49790d(Act act, final User user, uxj0 uxj0Var) {
        act.progressDismiss();
        act.m68056e2();
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.zeq
            @Override // java.lang.Runnable
            public final void run() {
                ItemPromptIntl.m49792f(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m49792f(User user) {
        Application application = CoreModule.f18263b;
        application.startActivity(DialogAct.m80560P0(application, 2, user));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m49793g(Message message, View view) {
        CoreModule.f18264c.f20384f0.m34157uq(message.cid, -message.createdTime, 7);
        sfj0.m185596c("e_chat_view_spammer_alert_twice_report", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h("message_send_values", "nothing"));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m49794h(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: i */
    public final void m49795i(View view) {
        afq.m97547a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public MessagesAct m49796j() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m49797k(Message message, View view) {
        CoreModule.f18264c.f20384f0.m34157uq(message.cid, message.createdTime, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        this.f32278g.startAnimation(scaleAnimation);
        sfj0.m185596c("e_chat_view_spammer_alert_report", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h("message_send_values", "report"));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49798l(Message message, View view) {
        CoreModule.f18264c.f20384f0.m34157uq(message.cid, message.createdTime, 15);
        sfj0.m185596c("e_chat_view_spammer_alert_twice_report", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"), sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h("message_send_values", "report"));
        m49801o(m49796j(), message.cid, message.f56859id);
    }

    /* JADX INFO: renamed from: m */
    public void m49799m(final Message message, Conversation conversation) {
        m49800n(conversation.localBotherStatus);
        bnl0.m105509E0(this.f32274c, new View.OnClickListener() { // from class: l.seq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167636a.m49797k(message, view);
            }
        });
        bnl0.m105509E0(this.f32275d, new View.OnClickListener() { // from class: l.teq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPromptIntl.m49787a(message, view);
            }
        });
        bnl0.m105509E0(this.f32280i, new View.OnClickListener() { // from class: l.ueq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178685a.m49798l(message, view);
            }
        });
        bnl0.m105509E0(this.f32281j, new View.OnClickListener() { // from class: l.veq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemPromptIntl.m49793g(message, view);
            }
        });
        if (pzi0.m174454o() - this.f32283l >= 1000) {
            this.f32283l = pzi0.m174454o();
            if (!m49796j().m195420L(message.f56859id + "e_chat_view_spammer_alert_report_show")) {
                m49796j().m195419J(message.f56859id + "e_chat_view_spammer_alert_report_show");
                sfj0.m185601h("e_chat_view_spammer_alert_report_show", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"));
            }
            if ((conversation.localBotherStatus & 3) == 3) {
                if (m49796j().m195420L(message.f56859id + "e_chat_view_spammer_alert_report_twice_show")) {
                    return;
                }
                m49796j().m195419J(message.f56859id + "e_chat_view_spammer_alert_report_twice_show");
                sfj0.m185601h("e_chat_view_spammer_alert_report_twice_show", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("received_user_id", CoreModule.m30929H().userId()), sfj0.C20032a.m185615h("sensitiveword", uqb0.f180394Z.m95955L(message.value)), sfj0.C20032a.m185615h("sensitive_text", message.value), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), sfj0.C20032a.m185615h("message_send_status", "1"));
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m49800n(int i) {
        if ((i & 1) != 1) {
            bnl0.m105524M(this.f32278g, false);
            bnl0.m105525M0(this.f32273b, true);
            bnl0.m105525M0(this.f32276e, false);
            return;
        }
        bnl0.m105525M0(this.f32273b, false);
        bnl0.m105525M0(this.f32276e, true);
        if ((i & 2) != 2) {
            bnl0.m105524M(this.f32278g, false);
            this.f32277f.setText(R$string.f21802q);
            return;
        }
        this.f32277f.setText(R$string.f21810r);
        bnl0.m105524M(this.f32278g, true);
        if ((i & 4) != 4 || (i & 8) == 8) {
            bnl0.m105525M0(this.f32279h, true);
            bnl0.m105525M0(this.f32282k, false);
        } else {
            bnl0.m105525M0(this.f32279h, false);
            bnl0.m105525M0(this.f32282k, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m49801o(final Act act, String str, String str2) {
        final User userById = CoreModule.m30930K().getUserById(str);
        if (NullChecker.m82486a(userById) && NullChecker.m82486a(act)) {
            Report report = new Report();
            report.category = Report.CATEGORY_DEFAULT;
            report.value = act.getString(R$string.f21576P5);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            report.chatMessages = arrayList;
            new Relationship().state = RelationshipStatus.get("blocked");
            act.progress(R$string.f21517I2, true);
            psd0.m173625r(CoreModule.f18264c.f20381e0.m116569ha(userById.f56859id, report), CoreModule.f18264c.f20384f0.m34093qe(userById.f56859id, act), new rcj() { // from class: l.weq
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return ItemPromptIntl.m49788b((uxj0) obj, (uxj0) obj2);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.xeq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemPromptIntl.m49790d(act, userById, (uxj0) obj);
                }
            }, new y20() { // from class: l.yeq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemPromptIntl.m49794h(act, (Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49795i(this);
    }

    public ItemPromptIntl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPromptIntl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
