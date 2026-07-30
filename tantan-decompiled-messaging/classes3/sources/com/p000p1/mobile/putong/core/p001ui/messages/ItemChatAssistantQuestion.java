package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p1.mobile.putong.core.data.ChatAssistantQuestionPostBody;
import com.p1.mobile.putong.core.data.ChatAssistantQuestionSelected;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.et4;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.roj0;
import l.u1q;
import l.ura;
import l.vwb;
import l.xdl0;
import p003l.dml;
import p003l.e30;
import p003l.eqh0;
import p003l.m250;
import p003l.qsz;
import p028v.VImage;
import p028v.VLinear;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChatAssistantQuestion extends VRelative {

    /* JADX INFO: renamed from: d */
    public VImage f742d;

    /* JADX INFO: renamed from: e */
    public VText f743e;

    /* JADX INFO: renamed from: f */
    public VLinear f744f;

    /* JADX INFO: renamed from: g */
    public VText f745g;

    /* JADX INFO: renamed from: h */
    public VImage f746h;

    /* JADX INFO: renamed from: i */
    public VLinear f747i;

    /* JADX INFO: renamed from: j */
    public VText f748j;

    /* JADX INFO: renamed from: k */
    public VImage f749k;

    /* JADX INFO: renamed from: l */
    public Act f750l;

    /* JADX INFO: renamed from: m */
    public Message f751m;

    public ItemChatAssistantQuestion(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m1134L(Message message, View view) {
        m1141O((ChatAssistantQuestion) message.additionalData.chatAssistantQuestions.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m1135M(Message message, View view) {
        m1141O((ChatAssistantQuestion) message.additionalData.chatAssistantQuestions.get(1));
    }

    /* JADX INFO: renamed from: H */
    public final void m1139H(View view) {
        u1q.a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m1140I(roj0 roj0Var) {
        CoreModule.c.f0.Cf(this.f751m.cid);
    }

    /* JADX INFO: renamed from: O */
    public final void m1141O(ChatAssistantQuestion chatAssistantQuestion) {
        m1143Q(chatAssistantQuestion);
        ChatAssistantQuestionPostBody chatAssistantQuestionPostBodyNew_ = ChatAssistantQuestionPostBody.new_();
        ChatAssistantQuestionSelected chatAssistantQuestionSelectedNew_ = ChatAssistantQuestionSelected.new_();
        chatAssistantQuestionSelectedNew_.questionId = chatAssistantQuestion.questionId;
        chatAssistantQuestionSelectedNew_.send = true;
        chatAssistantQuestionSelectedNew_.otherUserId = this.f751m.cid;
        chatAssistantQuestionSelectedNew_.category = "inner";
        chatAssistantQuestionPostBodyNew_.chatAssistantQuestions.add(chatAssistantQuestionSelectedNew_);
        CoreModule.c.U1.g3(chatAssistantQuestionPostBodyNew_).subscribe((m250) mkd0.H(new e30() { // from class: l.r1q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6768a.m1140I((roj0) obj);
            }
        }, new e30() { // from class: l.s1q
            @Override // p003l.e30
            public final void call(Object obj) {
                osi0.g("发送失败，请重试");
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public void m1142P(Act act, dml dmlVar, final Message message, qsz qszVar) {
        this.f750l = act;
        this.f751m = message;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || vwb.J(messageAdditionalData.chatAssistantQuestions) || message.additionalData.chatAssistantQuestions.size() < 2) {
            return;
        }
        if (!qszVar.m7030a(((DbObject) message).id)) {
            qszVar.m7031b(((DbObject) message).id);
            m1144R(message.additionalData.chatAssistantQuestions);
        }
        this.f745g.setText(((ChatAssistantQuestion) message.additionalData.chatAssistantQuestions.get(0)).question);
        this.f748j.setText(((ChatAssistantQuestion) message.additionalData.chatAssistantQuestions.get(1)).question);
        xdl0.E0(this.f744f, new View.OnClickListener() { // from class: l.p1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6301a.m1134L(message, view);
            }
        });
        xdl0.E0(this.f747i, new View.OnClickListener() { // from class: l.q1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6577a.m1135M(message, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public void m1143Q(ChatAssistantQuestion chatAssistantQuestion) {
        o6j0.c("e_send_chat_question_guidance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_question_content", chatAssistantQuestion.question), o6j0.a.h("chat_question_type", chatAssistantQuestion.type)});
    }

    /* JADX INFO: renamed from: R */
    public void m1144R(List<ChatAssistantQuestion> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 2; i++) {
            arrayList.add(list.get(i).question);
            arrayList2.add(list.get(i).type);
        }
        o6j0.h("e_send_chat_question_guidance", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_question_content", et4.a(",", arrayList)), o6j0.a.h("chat_question_type", et4.a(",", arrayList2))});
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1139H(this);
        this.f743e.setTypeface(eqh0.m3924c(3), 1);
        this.f745g.setTypeface(eqh0.m3924c(3), 1);
        this.f748j.setTypeface(eqh0.m3924c(3), 1);
        if (ura.e().d().I4()) {
            xdl0.N(this.f742d, c3c0.X1);
            xdl0.N(this.f746h, c3c0.Q1);
            xdl0.N(this.f749k, c3c0.Q1);
            this.f743e.setTextColor(getResources().getColor(a1c0.i));
            this.f745g.setTextColor(getResources().getColor(a1c0.g));
            this.f748j.setTextColor(getResources().getColor(a1c0.g));
        }
    }

    public ItemChatAssistantQuestion(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatAssistantQuestion(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
