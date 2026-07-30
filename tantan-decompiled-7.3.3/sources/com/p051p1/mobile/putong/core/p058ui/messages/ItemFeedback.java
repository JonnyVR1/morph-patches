package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p051p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.clz;
import p153l.g9c0;
import p153l.i4g0;
import p153l.jyb;
import p153l.k900;
import p153l.n5q;
import p153l.ovb0;
import p153l.psd0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFeedback extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemFeedback f31801a;

    /* JADX INFO: renamed from: b */
    public ItemText f31802b;

    /* JADX INFO: renamed from: c */
    public ItemText f31803c;

    /* JADX INFO: renamed from: d */
    public VText f31804d;

    /* JADX INFO: renamed from: e */
    public VText f31805e;

    /* JADX INFO: renamed from: f */
    public Message f31806f;

    /* JADX INFO: renamed from: g */
    public MessageFeedbackStatus f31807g;

    /* JADX INFO: renamed from: h */
    public boolean f31808h;

    /* JADX INFO: renamed from: i */
    public String f31809i;

    /* JADX INFO: renamed from: j */
    public String f31810j;

    public ItemFeedback(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f31806f = message;
        try {
            this.f31807g = MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException unused) {
        }
        if (NullChecker.m82486a(this.f31807g)) {
            this.f31808h = !TextUtils.isEmpty(this.f31807g.question.answer);
            if (TextUtils.equals(this.f31807g.feedback_category, "solved")) {
                this.f31809i = "e_assistant_service_feedback_solved";
                this.f31810j = "if_solved";
            } else {
                this.f31809i = "e_assistant_service_feedback_content";
                this.f31810j = "if_content";
            }
            m49348n();
            m49347l();
            if (k900.m148792d(message.f56859id)) {
                return;
            }
            k900.m148789a(message.f56859id);
            i4g0.m138492A(this.f31809i, OMSDialogPositon.p_chat_view, jyb.m147494Y(this.f31810j, ""));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m49340e(View view) {
        n5q.m161731a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public MessagesAct m49341f() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49342g(View view, Boolean bool) {
        if (bool.booleanValue()) {
            this.f31808h = true;
            ((TextView) view).setTextColor(getResources().getColor(g9c0.f102835y));
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49343h(int i, final View view) {
        clz<? extends DbObject, ?> clzVarMo50158l = m49341f().mo50158l();
        String str = this.f31806f.f56859id;
        MessageFeedbackStatus messageFeedbackStatus = this.f31807g;
        clzVarMo50158l.m110974f3(str, messageFeedbackStatus.feedback_id, messageFeedbackStatus.feedback_category, messageFeedbackStatus.question.answers.get(i).f21186id, this.f31806f).subscribe(psd0.m173597H(new y20() { // from class: l.h5q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107964a.m49342g(view, (Boolean) obj);
            }
        }, new y20() { // from class: l.i5q
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("网络错误");
            }
        }));
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m49344i(final View view, final int i) {
        if (this.f31808h) {
            return;
        }
        m49341f().mo50158l().m111048t7().m178985y1(new Runnable() { // from class: l.g5q
            @Override // java.lang.Runnable
            public final void run() {
                this.f102344a.m49343h(i, view);
            }
        });
        i4g0.m138523u(this.f31809i, OMSDialogPositon.p_chat_view, jyb.m147494Y(this.f31810j, i == 0 ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: k */
    public final void m49346k(VText vText, final int i, String str) {
        if (i + 1 > this.f31807g.question.answers.size()) {
            return;
        }
        MessageFeedbackAnswers messageFeedbackAnswers = this.f31807g.question.answers.get(i);
        vText.getPaint().setFakeBoldText(true);
        vText.setTextColor(TextUtils.equals(messageFeedbackAnswers.f21186id, str) ? getResources().getColor(g9c0.f102835y) : getResources().getColor(g9c0.f102795M));
        bnl0.m105515H0(vText, messageFeedbackAnswers.value);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.f5q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97274a.m49344i(i, view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m49347l() {
        m49346k(this.f31804d, 0, this.f31807g.question.answer);
        m49346k(this.f31805e, 1, this.f31807g.question.answer);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m49348n() {
        this.f31802b.m49910D(this.f31807g.question.text, this.f31806f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49340e(this);
        this.f31802b.setBackground(null);
    }

    public ItemFeedback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
