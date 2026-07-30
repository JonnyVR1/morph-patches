package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p046p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p147v.VLinear;
import p149l.a1c0;
import p149l.e30;
import p149l.fcz;
import p149l.knb0;
import p149l.l6c0;
import p149l.m3q;
import p149l.mkd0;
import p149l.o7r;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFeedbackReason extends LinearLayout implements InterfaceC8519a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemFeedbackReason f30963a;

    /* JADX INFO: renamed from: b */
    public ItemText f30964b;

    /* JADX INFO: renamed from: c */
    public ItemText f30965c;

    /* JADX INFO: renamed from: d */
    public VLinear f30966d;

    /* JADX INFO: renamed from: e */
    public ItemMessageBase f30967e;

    /* JADX INFO: renamed from: f */
    public Message f30968f;

    /* JADX INFO: renamed from: g */
    public MessageFeedbackStatus f30969g;

    /* JADX INFO: renamed from: h */
    public boolean f30970h;

    public ItemFeedbackReason(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        int i;
        this.f30968f = message;
        try {
            this.f30969g = MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException unused) {
        }
        if (NullChecker.m81303a(this.f30969g)) {
            this.f30970h = !TextUtils.isEmpty(this.f30969g.question.answer);
            this.f30964b.m48727D(this.f30969g.question.text, message);
            int size = this.f30969g.question.answers.size();
            VLinear vLinear = this.f30966d;
            if (size > 0) {
                int i2 = 0;
                vLinear.setVisibility(0);
                if (CoreModule.m29935P().m94658i().mo158233G1() && !User.isTeamAccount(message.owner)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f30966d.getLayoutParams();
                    layoutParams.width = -1;
                    this.f30966d.setLayoutParams(layoutParams);
                }
                while (i2 < this.f30969g.question.answers.size() && (i = i2 + 1) <= this.f30966d.getChildCount()) {
                    FeedbackAnswerView feedbackAnswerView = (FeedbackAnswerView) this.f30966d.getChildAt(i2);
                    feedbackAnswerView.getPaint().setFakeBoldText(true);
                    MessageFeedbackAnswers messageFeedbackAnswers = this.f30969g.question.answers.get(i2);
                    String strValueOf = String.valueOf(feedbackAnswerView.getText());
                    feedbackAnswerView.setText(messageFeedbackAnswers.value);
                    feedbackAnswerView.setTextColor(TextUtils.equals(this.f30969g.question.answer, messageFeedbackAnswers.f20444id) ? getResources().getColor(a1c0.f67171y) : getResources().getColor(a1c0.f67131M));
                    feedbackAnswerView.setTag(messageFeedbackAnswers);
                    if (!messageFeedbackAnswers.value.equals(strValueOf)) {
                        feedbackAnswerView.requestLayout();
                    }
                    i2 = i;
                }
            } else {
                vLinear.setVisibility(8);
                if (message.isOtherUser()) {
                    ((ItemMessageLeft) this.f30967e).f31177M.setTranslationY(0.0f);
                }
            }
            zvf0.m220368A("e_assistant_service_feedback_reason", OMSDialogPositon.p_chat_view, vwb.m200311Y("donot_content_reason", ""));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m48169d(View view) {
        m3q.m152950a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public MessagesAct m48170e() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48171f(View view, Boolean bool) {
        if (bool.booleanValue()) {
            this.f30970h = true;
            ((FeedbackAnswerView) view).setTextColor(getResources().getColor(a1c0.f67171y));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48172g(MessageFeedbackAnswers messageFeedbackAnswers, final View view) {
        fcz<? extends DbObject, ?> fczVarMo48974l = m48170e().mo48974l();
        Message message = this.f30968f;
        String str = message.f56011id;
        MessageFeedbackStatus messageFeedbackStatus = this.f30969g;
        fczVarMo48974l.m120768f3(str, messageFeedbackStatus.feedback_id, messageFeedbackStatus.feedback_category, messageFeedbackAnswers.f20444id, message).subscribe(mkd0.m154956H(new e30() { // from class: l.k3q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120857a.m48171f(view, (Boolean) obj);
            }
        }, new e30() { // from class: l.l3q
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("网络错误");
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f30967e = itemMessageBase;
        for (int i2 = 0; i2 < i; i2++) {
            this.f30966d.addView(o7r.m163037a(getContext()).inflate(l6c0.f126428Z2, (ViewGroup) this.f30966d, false));
            this.f30966d.getChildAt(i2).setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View view) {
        if (this.f30970h) {
            return;
        }
        final MessageFeedbackAnswers messageFeedbackAnswers = (MessageFeedbackAnswers) view.getTag();
        if (NullChecker.m81303a(messageFeedbackAnswers)) {
            m48170e().mo48974l().m120842t7().m190340y1(new Runnable() { // from class: l.j3q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116103a.m48172g(messageFeedbackAnswers, view);
                }
            });
            zvf0.m220399u("e_assistant_service_feedback_reason", OMSDialogPositon.p_chat_view, vwb.m200311Y("donot_content_reason", messageFeedbackAnswers.value));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48169d(this);
        this.f30964b.setBackground(null);
        this.f30966d.setBackground(null);
        this.f30964b.getPaint().setFakeBoldText(true);
    }

    public ItemFeedbackReason(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedbackReason(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
