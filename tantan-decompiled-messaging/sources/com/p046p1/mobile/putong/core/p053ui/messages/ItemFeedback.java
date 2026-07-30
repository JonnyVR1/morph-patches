package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p046p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p147v.VText;
import p149l.a1c0;
import p149l.e30;
import p149l.fcz;
import p149l.knb0;
import p149l.mkd0;
import p149l.n000;
import p149l.n3q;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFeedback extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemFeedback f30953a;

    /* JADX INFO: renamed from: b */
    public ItemText f30954b;

    /* JADX INFO: renamed from: c */
    public ItemText f30955c;

    /* JADX INFO: renamed from: d */
    public VText f30956d;

    /* JADX INFO: renamed from: e */
    public VText f30957e;

    /* JADX INFO: renamed from: f */
    public Message f30958f;

    /* JADX INFO: renamed from: g */
    public MessageFeedbackStatus f30959g;

    /* JADX INFO: renamed from: h */
    public boolean f30960h;

    /* JADX INFO: renamed from: i */
    public String f30961i;

    /* JADX INFO: renamed from: j */
    public String f30962j;

    public ItemFeedback(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f30958f = message;
        try {
            this.f30959g = MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException unused) {
        }
        if (NullChecker.m81303a(this.f30959g)) {
            this.f30960h = !TextUtils.isEmpty(this.f30959g.question.answer);
            if (TextUtils.equals(this.f30959g.feedback_category, "solved")) {
                this.f30961i = "e_assistant_service_feedback_solved";
                this.f30962j = "if_solved";
            } else {
                this.f30961i = "e_assistant_service_feedback_content";
                this.f30962j = "if_content";
            }
            m48165n();
            m48164l();
            if (n000.m157185d(message.f56011id)) {
                return;
            }
            n000.m157182a(message.f56011id);
            zvf0.m220368A(this.f30961i, OMSDialogPositon.p_chat_view, vwb.m200311Y(this.f30962j, ""));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m48157e(View view) {
        n3q.m157771a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public MessagesAct m48158f() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48159g(View view, Boolean bool) {
        if (bool.booleanValue()) {
            this.f30960h = true;
            ((TextView) view).setTextColor(getResources().getColor(a1c0.f67171y));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48160h(int i, final View view) {
        fcz<? extends DbObject, ?> fczVarMo48974l = m48158f().mo48974l();
        String str = this.f30958f.f56011id;
        MessageFeedbackStatus messageFeedbackStatus = this.f30959g;
        fczVarMo48974l.m120768f3(str, messageFeedbackStatus.feedback_id, messageFeedbackStatus.feedback_category, messageFeedbackStatus.question.answers.get(i).f20444id, this.f30958f).subscribe(mkd0.m154956H(new e30() { // from class: l.h3q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105753a.m48159g(view, (Boolean) obj);
            }
        }, new e30() { // from class: l.i3q
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("网络错误");
            }
        }));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m48161i(final View view, final int i) {
        if (this.f30960h) {
            return;
        }
        m48158f().mo48974l().m120842t7().m190340y1(new Runnable() { // from class: l.g3q
            @Override // java.lang.Runnable
            public final void run() {
                this.f100498a.m48160h(i, view);
            }
        });
        zvf0.m220399u(this.f30961i, OMSDialogPositon.p_chat_view, vwb.m200311Y(this.f30962j, i == 0 ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: k */
    public final void m48163k(VText vText, final int i, String str) {
        if (i + 1 > this.f30959g.question.answers.size()) {
            return;
        }
        MessageFeedbackAnswers messageFeedbackAnswers = this.f30959g.question.answers.get(i);
        vText.getPaint().setFakeBoldText(true);
        vText.setTextColor(TextUtils.equals(messageFeedbackAnswers.f20444id, str) ? getResources().getColor(a1c0.f67171y) : getResources().getColor(a1c0.f67131M));
        xdl0.m208335H0(vText, messageFeedbackAnswers.value);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.f3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94703a.m48161i(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m48164l() {
        m48163k(this.f30956d, 0, this.f30959g.question.answer);
        m48163k(this.f30957e, 1, this.f30959g.question.answer);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m48165n() {
        this.f30954b.m48727D(this.f30959g.question.text, this.f30958f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48157e(this);
        this.f30954b.setBackground(null);
    }

    public ItemFeedback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
