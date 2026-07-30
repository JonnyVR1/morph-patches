package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import l.a1c0;
import l.j760;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.n3q;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.e30;
import p003l.fcz;
import p003l.m250;
import p003l.n000;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemFeedback extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemFeedback f844a;

    /* JADX INFO: renamed from: b */
    public ItemText f845b;

    /* JADX INFO: renamed from: c */
    public ItemText f846c;

    /* JADX INFO: renamed from: d */
    public VText f847d;

    /* JADX INFO: renamed from: e */
    public VText f848e;

    /* JADX INFO: renamed from: f */
    public Message f849f;

    /* JADX INFO: renamed from: g */
    public MessageFeedbackStatus f850g;

    /* JADX INFO: renamed from: h */
    public boolean f851h;

    /* JADX INFO: renamed from: i */
    public String f852i;

    /* JADX INFO: renamed from: j */
    public String f853j;

    public ItemFeedback(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f849f = message;
        try {
            this.f850g = (MessageFeedbackStatus) MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException unused) {
        }
        if (NullChecker.a(this.f850g)) {
            this.f851h = !TextUtils.isEmpty(this.f850g.question.answer);
            if (TextUtils.equals(this.f850g.feedback_category, "solved")) {
                this.f852i = "e_assistant_service_feedback_solved";
                this.f853j = "if_solved";
            } else {
                this.f852i = "e_assistant_service_feedback_content";
                this.f853j = "if_content";
            }
            m1245n();
            m1244l();
            if (n000.m6519d(((DbObject) message).id)) {
                return;
            }
            n000.m6516a(((DbObject) message).id);
            zvf0.A(this.f852i, "p_chat_view", new j760[]{vwb.Y(this.f853j, "")});
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1237e(View view) {
        n3q.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public MessagesAct m1238f() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1239g(View view, Boolean bool) {
        if (bool.booleanValue()) {
            this.f851h = true;
            ((TextView) view).setTextColor(getResources().getColor(a1c0.y));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1240h(int i, final View view) {
        fcz<? extends DbObject, ?> fczVarMo2066l = m1238f().mo2066l();
        String str = ((DbObject) this.f849f).id;
        MessageFeedbackStatus messageFeedbackStatus = this.f850g;
        fczVarMo2066l.m4235f3(str, messageFeedbackStatus.feedback_id, messageFeedbackStatus.feedback_category, ((MessageFeedbackAnswers) messageFeedbackStatus.question.answers.get(i)).id, this.f849f).subscribe((m250<? super Boolean>) mkd0.H(new e30() { // from class: l.h3q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4104a.m1239g(view, (Boolean) obj);
            }
        }, new e30() { // from class: l.i3q
            @Override // p003l.e30
            public final void call(Object obj) {
                lsi0.y("网络错误");
            }
        }));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m1241i(final View view, final int i) {
        if (this.f851h) {
            return;
        }
        m1238f().mo2066l().m4309t7().m7966y1(new Runnable() { // from class: l.g3q
            @Override // java.lang.Runnable
            public final void run() {
                this.f3795a.m1240h(i, view);
            }
        });
        zvf0.u(this.f852i, "p_chat_view", new j760[]{vwb.Y(this.f853j, i == 0 ? "yes" : "no")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m1243k(VText vText, final int i, String str) {
        if (i + 1 > this.f850g.question.answers.size()) {
            return;
        }
        MessageFeedbackAnswers messageFeedbackAnswers = (MessageFeedbackAnswers) this.f850g.question.answers.get(i);
        vText.getPaint().setFakeBoldText(true);
        vText.setTextColor(TextUtils.equals(messageFeedbackAnswers.id, str) ? getResources().getColor(a1c0.y) : getResources().getColor(a1c0.M));
        xdl0.H0(vText, messageFeedbackAnswers.value);
        xdl0.E0(vText, new View.OnClickListener() { // from class: l.f3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3451a.m1241i(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m1244l() {
        m1243k(this.f847d, 0, this.f850g.question.answer);
        m1243k(this.f848e, 1, this.f850g.question.answer);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m1245n() {
        this.f845b.m1811D(this.f850g.question.text, this.f849f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1237e(this);
        this.f845b.setBackground(null);
    }

    public ItemFeedback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
