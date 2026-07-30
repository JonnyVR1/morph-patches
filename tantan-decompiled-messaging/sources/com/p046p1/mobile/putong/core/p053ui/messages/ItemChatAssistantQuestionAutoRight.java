package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p147v.VRelative;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dml;
import p149l.eqh0;
import p149l.o6j0;
import p149l.qsz;
import p149l.ura;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatAssistantQuestionAutoRight extends VRelative {

    /* JADX INFO: renamed from: d */
    public View f30861d;

    /* JADX INFO: renamed from: e */
    public TextView f30862e;

    /* JADX INFO: renamed from: f */
    public TextView f30863f;

    /* JADX INFO: renamed from: g */
    public ImageView f30864g;

    /* JADX INFO: renamed from: h */
    public ImageView f30865h;

    /* JADX INFO: renamed from: i */
    public ChatAssistantQuestion f30866i;

    public ItemChatAssistantQuestionAutoRight(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m48066B() {
        o6j0.m162859c("e_chat_question_auto_send", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: H */
    public void m48067H(Message message) {
        String str = message.msgData;
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f30866i = ChatAssistantQuestion.JSON_ADAPTER.parse(message.msgData);
            }
            if (NullChecker.m81303a(this.f30866i)) {
                str = this.f30866i.type;
            }
        } catch (IOException unused) {
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.cid);
        if (NullChecker.m81303a(userM169430Pa)) {
            this.f30862e.setText(String.format("向%s提了一个你感兴趣的问题", userM169430Pa.isFemale() ? "她" : "他"));
        }
        o6j0.m162864h("e_chat_question_auto_send", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("chat_question_content", TextUtils.isEmpty(message.value) ? "" : message.value.replaceFirst("你好呀，问个问题～\n", "")), o6j0.C18854a.m162878h("chat_question_send_side", "from"), o6j0.C18854a.m162878h("chat_question_type", str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30865h = (ImageView) findViewById(y4c0.f196159k1);
        this.f30862e = (TextView) findViewById(y4c0.f195932A3);
        this.f30861d = findViewById(y4c0.f196266z3);
        this.f30863f = (TextView) findViewById(y4c0.f196259y3);
        this.f30864g = (ImageView) findViewById(y4c0.f195956E0);
        this.f30862e.setTypeface(eqh0.m117752c(3), 1);
        this.f30863f.setTypeface(eqh0.m117752c(3), 1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f30865h, c3c0.f78670X1);
            xdl0.m208346N(this.f30864g, c3c0.f78662W1);
            this.f30862e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30863f.setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m48068q(Act act, String str, View view) {
        m48066B();
        CoreModule.m29935P().m94658i().mo33282A9(act, str);
    }

    /* JADX INFO: renamed from: z */
    public void m48069z(final Act act, dml dmlVar, Message message, qsz qszVar) {
        if (!qszVar.m176377a(message.f56011id)) {
            qszVar.m176378b(message.f56011id);
            m48067H(message);
        }
        this.f30863f.setText(message.value);
        xdl0.m208344M(this.f30864g, CoreModule.m29935P().m94658i().mo158458v5());
        final String strValueOf = NullChecker.m81303a(this.f30866i) ? String.valueOf(this.f30866i.questionId) : "";
        boolean zMo158458v5 = CoreModule.m29935P().m94658i().mo158458v5();
        View view = this.f30861d;
        if (zMo158458v5) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.t1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f167363a.m48068q(act, strValueOf, view2);
                }
            });
        } else {
            xdl0.m208329E0(view, null);
        }
    }

    public ItemChatAssistantQuestionAutoRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatAssistantQuestionAutoRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
