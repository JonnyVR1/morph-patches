package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestionPostBody;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestionSelected;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dml;
import p149l.e30;
import p149l.eqh0;
import p149l.et4;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qsz;
import p149l.roj0;
import p149l.u1q;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatAssistantQuestion extends VRelative {

    /* JADX INFO: renamed from: d */
    public VImage f30851d;

    /* JADX INFO: renamed from: e */
    public VText f30852e;

    /* JADX INFO: renamed from: f */
    public VLinear f30853f;

    /* JADX INFO: renamed from: g */
    public VText f30854g;

    /* JADX INFO: renamed from: h */
    public VImage f30855h;

    /* JADX INFO: renamed from: i */
    public VLinear f30856i;

    /* JADX INFO: renamed from: j */
    public VText f30857j;

    /* JADX INFO: renamed from: k */
    public VImage f30858k;

    /* JADX INFO: renamed from: l */
    public Act f30859l;

    /* JADX INFO: renamed from: m */
    public Message f30860m;

    public ItemChatAssistantQuestion(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m48054L(Message message, View view) {
        m48061O(message.additionalData.chatAssistantQuestions.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m48055M(Message message, View view) {
        m48061O(message.additionalData.chatAssistantQuestions.get(1));
    }

    /* JADX INFO: renamed from: H */
    public final void m48059H(View view) {
        u1q.m191429a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m48060I(roj0 roj0Var) {
        CoreModule.f17545c.f19642f0.m32602Cf(this.f30860m.cid);
    }

    /* JADX INFO: renamed from: O */
    public final void m48061O(ChatAssistantQuestion chatAssistantQuestion) {
        m48063Q(chatAssistantQuestion);
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBodyNew_ = ChatAssistantQuestionPostBody.new_();
        ChatAssistantQuestionSelected chatAssistantQuestionSelectedNew_ = ChatAssistantQuestionSelected.new_();
        chatAssistantQuestionSelectedNew_.questionId = chatAssistantQuestion.questionId;
        chatAssistantQuestionSelectedNew_.send = true;
        chatAssistantQuestionSelectedNew_.otherUserId = this.f30860m.cid;
        chatAssistantQuestionSelectedNew_.category = "inner";
        chatAssistantQuestionPostBodyNew_.chatAssistantQuestions.add(chatAssistantQuestionSelectedNew_);
        CoreModule.f17545c.f19611U1.m101521g3(chatAssistantQuestionPostBodyNew_).subscribe(mkd0.m154956H(new e30() { // from class: l.r1q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157320a.m48060I((roj0) obj);
            }
        }, new e30() { // from class: l.s1q
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("发送失败，请重试");
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m48062P(Act act, dml dmlVar, final Message message, qsz qszVar) {
        this.f30859l = act;
        this.f30860m = message;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || vwb.m200296J(messageAdditionalData.chatAssistantQuestions) || message.additionalData.chatAssistantQuestions.size() < 2) {
            return;
        }
        if (!qszVar.m176377a(message.f56011id)) {
            qszVar.m176378b(message.f56011id);
            m48064R(message.additionalData.chatAssistantQuestions);
        }
        this.f30854g.setText(message.additionalData.chatAssistantQuestions.get(0).question);
        this.f30857j.setText(message.additionalData.chatAssistantQuestions.get(1).question);
        xdl0.m208329E0(this.f30853f, new View.OnClickListener() { // from class: l.p1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146755a.m48054L(message, view);
            }
        });
        xdl0.m208329E0(this.f30856i, new View.OnClickListener() { // from class: l.q1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152156a.m48055M(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m48063Q(ChatAssistantQuestion chatAssistantQuestion) {
        o6j0.m162859c("e_send_chat_question_guidance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_question_content", chatAssistantQuestion.question), o6j0.C18854a.m162878h("chat_question_type", chatAssistantQuestion.type));
    }

    /* JADX INFO: renamed from: R */
    public void m48064R(List<ChatAssistantQuestion> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 2; i++) {
            arrayList.add(list.get(i).question);
            arrayList2.add(list.get(i).type);
        }
        o6j0.m162864h("e_send_chat_question_guidance", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_question_content", et4.m117971a(Constants.SEPARATOR_COMMA, arrayList)), o6j0.C18854a.m162878h("chat_question_type", et4.m117971a(Constants.SEPARATOR_COMMA, arrayList2)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48059H(this);
        this.f30852e.setTypeface(eqh0.m117752c(3), 1);
        this.f30854g.setTypeface(eqh0.m117752c(3), 1);
        this.f30857j.setTypeface(eqh0.m117752c(3), 1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f30851d, c3c0.f78670X1);
            xdl0.m208346N(this.f30855h, c3c0.f78613Q1);
            xdl0.m208346N(this.f30858k, c3c0.f78613Q1);
            this.f30852e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30854g.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30857j.setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    public ItemChatAssistantQuestion(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatAssistantQuestion(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
