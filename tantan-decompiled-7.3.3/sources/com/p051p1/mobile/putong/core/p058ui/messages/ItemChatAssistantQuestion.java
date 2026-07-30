package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestionPostBody;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestionSelected;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.du4;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.n100;
import p153l.pol;
import p153l.psd0;
import p153l.sfj0;
import p153l.u3q;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatAssistantQuestion extends VRelative {

    /* JADX INFO: renamed from: d */
    public VImage f31699d;

    /* JADX INFO: renamed from: e */
    public VText f31700e;

    /* JADX INFO: renamed from: f */
    public VLinear f31701f;

    /* JADX INFO: renamed from: g */
    public VText f31702g;

    /* JADX INFO: renamed from: h */
    public VImage f31703h;

    /* JADX INFO: renamed from: i */
    public VLinear f31704i;

    /* JADX INFO: renamed from: j */
    public VText f31705j;

    /* JADX INFO: renamed from: k */
    public VImage f31706k;

    /* JADX INFO: renamed from: l */
    public Act f31707l;

    /* JADX INFO: renamed from: m */
    public Message f31708m;

    public ItemChatAssistantQuestion(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m49237L(Message message, View view) {
        m49244O(message.additionalData.chatAssistantQuestions.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m49238M(Message message, View view) {
        m49244O(message.additionalData.chatAssistantQuestions.get(1));
    }

    /* JADX INFO: renamed from: H */
    public final void m49242H(View view) {
        u3q.m194386a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m49243I(uxj0 uxj0Var) {
        CoreModule.f18264c.f20384f0.m33605Cf(this.f31708m.cid);
    }

    /* JADX INFO: renamed from: O */
    public final void m49244O(ChatAssistantQuestion chatAssistantQuestion) {
        m49246Q(chatAssistantQuestion);
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBodyNew_ = ChatAssistantQuestionPostBody.new_();
        ChatAssistantQuestionSelected chatAssistantQuestionSelectedNew_ = ChatAssistantQuestionSelected.new_();
        chatAssistantQuestionSelectedNew_.questionId = chatAssistantQuestion.questionId;
        chatAssistantQuestionSelectedNew_.send = true;
        chatAssistantQuestionSelectedNew_.otherUserId = this.f31708m.cid;
        chatAssistantQuestionSelectedNew_.category = "inner";
        chatAssistantQuestionPostBodyNew_.chatAssistantQuestions.add(chatAssistantQuestionSelectedNew_);
        CoreModule.f18264c.f20353U1.m125488g3(chatAssistantQuestionPostBodyNew_).subscribe(psd0.m173597H(new y20() { // from class: l.r3q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161075a.m49243I((uxj0) obj);
            }
        }, new y20() { // from class: l.s3q
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("发送失败，请重试");
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m49245P(Act act, pol polVar, final Message message, n100 n100Var) {
        this.f31707l = act;
        this.f31708m = message;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || jyb.m147479J(messageAdditionalData.chatAssistantQuestions) || message.additionalData.chatAssistantQuestions.size() < 2) {
            return;
        }
        if (!n100Var.m161054a(message.f56859id)) {
            n100Var.m161055b(message.f56859id);
            m49247R(message.additionalData.chatAssistantQuestions);
        }
        this.f31702g.setText(message.additionalData.chatAssistantQuestions.get(0).question);
        this.f31705j.setText(message.additionalData.chatAssistantQuestions.get(1).question);
        bnl0.m105509E0(this.f31701f, new View.OnClickListener() { // from class: l.p3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150458a.m49237L(message, view);
            }
        });
        bnl0.m105509E0(this.f31704i, new View.OnClickListener() { // from class: l.q3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155476a.m49238M(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m49246Q(ChatAssistantQuestion chatAssistantQuestion) {
        sfj0.m185596c("e_send_chat_question_guidance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_question_content", chatAssistantQuestion.question), sfj0.C20032a.m185615h("chat_question_type", chatAssistantQuestion.type));
    }

    /* JADX INFO: renamed from: R */
    public void m49247R(List<ChatAssistantQuestion> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 2; i++) {
            arrayList.add(list.get(i).question);
            arrayList2.add(list.get(i).type);
        }
        sfj0.m185601h("e_send_chat_question_guidance", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_question_content", du4.m118067a(Constants.SEPARATOR_COMMA, arrayList)), sfj0.C20032a.m185615h("chat_question_type", du4.m118067a(Constants.SEPARATOR_COMMA, arrayList2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49242H(this);
        this.f31700e.setTypeface(lyh0.m156283c(3), 1);
        this.f31702g.setTypeface(lyh0.m156283c(3), 1);
        this.f31705j.setTypeface(lyh0.m156283c(3), 1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31699d, ibc0.f113945X1);
            bnl0.m105526N(this.f31703h, ibc0.f113888Q1);
            bnl0.m105526N(this.f31706k, ibc0.f113888Q1);
            this.f31700e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31702g.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31705j.setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    public ItemChatAssistantQuestion(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatAssistantQuestion(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
