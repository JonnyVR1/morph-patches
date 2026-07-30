package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageFeedbackAnswers;
import com.p1.mobile.putong.core.data.MessageFeedbackStatus;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import l.a1c0;
import l.j760;
import l.knb0;
import l.l6c0;
import l.lsi0;
import l.m3q;
import l.mkd0;
import l.o7r;
import l.vwb;
import l.zvf0;
import p003l.e30;
import p003l.fcz;
import p003l.m250;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemFeedbackReason extends LinearLayout implements InterfaceC0102a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemFeedbackReason f854a;

    /* JADX INFO: renamed from: b */
    public ItemText f855b;

    /* JADX INFO: renamed from: c */
    public ItemText f856c;

    /* JADX INFO: renamed from: d */
    public VLinear f857d;

    /* JADX INFO: renamed from: e */
    public ItemMessageBase f858e;

    /* JADX INFO: renamed from: f */
    public Message f859f;

    /* JADX INFO: renamed from: g */
    public MessageFeedbackStatus f860g;

    /* JADX INFO: renamed from: h */
    public boolean f861h;

    public ItemFeedbackReason(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        int i;
        this.f859f = message;
        try {
            this.f860g = (MessageFeedbackStatus) MessageFeedbackStatus.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException unused) {
        }
        if (NullChecker.a(this.f860g)) {
            this.f861h = !TextUtils.isEmpty(this.f860g.question.answer);
            this.f855b.m1811D(this.f860g.question.text, message);
            int size = this.f860g.question.answers.size();
            VLinear vLinear = this.f857d;
            if (size > 0) {
                int i2 = 0;
                vLinear.setVisibility(0);
                if (CoreModule.P().i().G1() && !User.isTeamAccount(message.owner)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f857d.getLayoutParams();
                    layoutParams.width = -1;
                    this.f857d.setLayoutParams(layoutParams);
                }
                while (i2 < this.f860g.question.answers.size() && (i = i2 + 1) <= this.f857d.getChildCount()) {
                    FeedbackAnswerView feedbackAnswerView = (FeedbackAnswerView) this.f857d.getChildAt(i2);
                    feedbackAnswerView.getPaint().setFakeBoldText(true);
                    MessageFeedbackAnswers messageFeedbackAnswers = (MessageFeedbackAnswers) this.f860g.question.answers.get(i2);
                    String strValueOf = String.valueOf(feedbackAnswerView.getText());
                    feedbackAnswerView.setText(messageFeedbackAnswers.value);
                    feedbackAnswerView.setTextColor(TextUtils.equals(this.f860g.question.answer, messageFeedbackAnswers.id) ? getResources().getColor(a1c0.y) : getResources().getColor(a1c0.M));
                    feedbackAnswerView.setTag(messageFeedbackAnswers);
                    if (!messageFeedbackAnswers.value.equals(strValueOf)) {
                        feedbackAnswerView.requestLayout();
                    }
                    i2 = i;
                }
            } else {
                vLinear.setVisibility(8);
                if (message.isOtherUser()) {
                    ((ItemMessageLeft) this.f858e).f1068M.setTranslationY(0.0f);
                }
            }
            zvf0.A("e_assistant_service_feedback_reason", "p_chat_view", new j760[]{vwb.Y("donot_content_reason", "")});
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m1249d(View view) {
        m3q.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public MessagesAct m1250e() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1251f(View view, Boolean bool) {
        if (bool.booleanValue()) {
            this.f861h = true;
            ((FeedbackAnswerView) view).setTextColor(getResources().getColor(a1c0.y));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1252g(MessageFeedbackAnswers messageFeedbackAnswers, final View view) {
        fcz<? extends DbObject, ?> fczVarMo2066l = m1250e().mo2066l();
        Message message = this.f859f;
        String str = ((DbObject) message).id;
        MessageFeedbackStatus messageFeedbackStatus = this.f860g;
        fczVarMo2066l.m4235f3(str, messageFeedbackStatus.feedback_id, messageFeedbackStatus.feedback_category, messageFeedbackAnswers.id, message).subscribe((m250<? super Boolean>) mkd0.H(new e30() { // from class: l.k3q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4801a.m1251f(view, (Boolean) obj);
            }
        }, new e30() { // from class: l.l3q
            @Override // p003l.e30
            public final void call(Object obj) {
                lsi0.y("网络错误");
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f858e = itemMessageBase;
        for (int i2 = 0; i2 < i; i2++) {
            this.f857d.addView(o7r.a(getContext()).inflate(l6c0.Z2, (ViewGroup) this.f857d, false));
            this.f857d.getChildAt(i2).setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(final View view) {
        if (this.f861h) {
            return;
        }
        final MessageFeedbackAnswers messageFeedbackAnswers = (MessageFeedbackAnswers) view.getTag();
        if (NullChecker.a(messageFeedbackAnswers)) {
            m1250e().mo2066l().m4309t7().m7966y1(new Runnable() { // from class: l.j3q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4564a.m1252g(messageFeedbackAnswers, view);
                }
            });
            zvf0.u("e_assistant_service_feedback_reason", "p_chat_view", new j760[]{vwb.Y("donot_content_reason", messageFeedbackAnswers.value)});
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1249d(this);
        this.f855b.setBackground(null);
        this.f857d.setBackground(null);
        this.f855b.getPaint().setFakeBoldText(true);
    }

    public ItemFeedbackReason(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedbackReason(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
