package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p051p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p151v.VLinear;
import p153l.clz;
import p153l.g9c0;
import p153l.i4g0;
import p153l.jyb;
import p153l.m5q;
import p153l.ovb0;
import p153l.p9r;
import p153l.psd0;
import p153l.qec0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFeedbackReason extends LinearLayout implements InterfaceC8682a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemFeedbackReason f31811a;

    /* JADX INFO: renamed from: b */
    public ItemText f31812b;

    /* JADX INFO: renamed from: c */
    public ItemText f31813c;

    /* JADX INFO: renamed from: d */
    public VLinear f31814d;

    /* JADX INFO: renamed from: e */
    public ItemMessageBase f31815e;

    /* JADX INFO: renamed from: f */
    public Message f31816f;

    /* JADX INFO: renamed from: g */
    public MessageFeedbackStatus f31817g;

    /* JADX INFO: renamed from: h */
    public boolean f31818h;

    public ItemFeedbackReason(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        int i;
        this.f31816f = message;
        try {
            this.f31817g = MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException unused) {
        }
        if (NullChecker.m82486a(this.f31817g)) {
            this.f31818h = !TextUtils.isEmpty(this.f31817g.question.answer);
            this.f31812b.m49910D(this.f31817g.question.text, message);
            int size = this.f31817g.question.answers.size();
            VLinear vLinear = this.f31814d;
            if (size > 0) {
                int i2 = 0;
                vLinear.setVisibility(0);
                if (CoreModule.m30933P().m143412i().mo180325G1() && !User.isTeamAccount(message.owner)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31814d.getLayoutParams();
                    layoutParams.width = -1;
                    this.f31814d.setLayoutParams(layoutParams);
                }
                while (i2 < this.f31817g.question.answers.size() && (i = i2 + 1) <= this.f31814d.getChildCount()) {
                    FeedbackAnswerView feedbackAnswerView = (FeedbackAnswerView) this.f31814d.getChildAt(i2);
                    feedbackAnswerView.getPaint().setFakeBoldText(true);
                    MessageFeedbackAnswers messageFeedbackAnswers = this.f31817g.question.answers.get(i2);
                    String strValueOf = String.valueOf(feedbackAnswerView.getText());
                    feedbackAnswerView.setText(messageFeedbackAnswers.value);
                    feedbackAnswerView.setTextColor(TextUtils.equals(this.f31817g.question.answer, messageFeedbackAnswers.f21186id) ? getResources().getColor(g9c0.f102835y) : getResources().getColor(g9c0.f102795M));
                    feedbackAnswerView.setTag(messageFeedbackAnswers);
                    if (!messageFeedbackAnswers.value.equals(strValueOf)) {
                        feedbackAnswerView.requestLayout();
                    }
                    i2 = i;
                }
            } else {
                vLinear.setVisibility(8);
                if (message.isOtherUser()) {
                    ((ItemMessageLeft) this.f31815e).f32025M.setTranslationY(0.0f);
                }
            }
            i4g0.m138492A("e_assistant_service_feedback_reason", OMSDialogPositon.p_chat_view, jyb.m147494Y("donot_content_reason", ""));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m49352d(View view) {
        m5q.m157114a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public MessagesAct m49353e() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49354f(View view, Boolean bool) {
        if (bool.booleanValue()) {
            this.f31818h = true;
            ((FeedbackAnswerView) view).setTextColor(getResources().getColor(g9c0.f102835y));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49355g(MessageFeedbackAnswers messageFeedbackAnswers, final View view) {
        clz<? extends DbObject, ?> clzVarMo50158l = m49353e().mo50158l();
        Message message = this.f31816f;
        String str = message.f56859id;
        MessageFeedbackStatus messageFeedbackStatus = this.f31817g;
        clzVarMo50158l.m110974f3(str, messageFeedbackStatus.feedback_id, messageFeedbackStatus.feedback_category, messageFeedbackAnswers.f21186id, message).subscribe(psd0.m173597H(new y20() { // from class: l.k5q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124110a.m49354f(view, (Boolean) obj);
            }
        }, new y20() { // from class: l.l5q
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("网络错误");
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31815e = itemMessageBase;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31814d.addView(p9r.m171370a(getContext()).inflate(qec0.f156984Z2, (ViewGroup) this.f31814d, false));
            this.f31814d.getChildAt(i2).setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View view) {
        if (this.f31818h) {
            return;
        }
        final MessageFeedbackAnswers messageFeedbackAnswers = (MessageFeedbackAnswers) view.getTag();
        if (NullChecker.m82486a(messageFeedbackAnswers)) {
            m49353e().mo50158l().m111048t7().m178985y1(new Runnable() { // from class: l.j5q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118488a.m49355g(messageFeedbackAnswers, view);
                }
            });
            i4g0.m138523u("e_assistant_service_feedback_reason", OMSDialogPositon.p_chat_view, jyb.m147494Y("donot_content_reason", messageFeedbackAnswers.value));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49352d(this);
        this.f31812b.setBackground(null);
        this.f31814d.setBackground(null);
        this.f31812b.getPaint().setFakeBoldText(true);
    }

    public ItemFeedbackReason(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedbackReason(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
