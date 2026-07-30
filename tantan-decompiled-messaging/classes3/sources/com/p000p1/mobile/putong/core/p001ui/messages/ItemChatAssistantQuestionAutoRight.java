package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.a1c0;
import l.c3c0;
import l.o6j0;
import l.ura;
import l.xdl0;
import l.y4c0;
import p003l.dml;
import p003l.eqh0;
import p003l.qsz;
import p028v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChatAssistantQuestionAutoRight extends VRelative {

    /* JADX INFO: renamed from: d */
    public View f752d;

    /* JADX INFO: renamed from: e */
    public TextView f753e;

    /* JADX INFO: renamed from: f */
    public TextView f754f;

    /* JADX INFO: renamed from: g */
    public ImageView f755g;

    /* JADX INFO: renamed from: h */
    public ImageView f756h;

    /* JADX INFO: renamed from: i */
    public ChatAssistantQuestion f757i;

    public ItemChatAssistantQuestionAutoRight(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m1146B() {
        o6j0.c("e_chat_question_auto_send", "p_chat_view", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: H */
    public void m1147H(Message message) {
        String str = message.msgData;
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f757i = (ChatAssistantQuestion) ChatAssistantQuestion.JSON_ADAPTER.parse(message.msgData);
            }
            if (NullChecker.a(this.f757i)) {
                str = this.f757i.type;
            }
        } catch (IOException unused) {
        }
        User userPa = CoreModule.c.e0.Pa(message.cid);
        if (NullChecker.a(userPa)) {
            this.f753e.setText(String.format("向%s提了一个你感兴趣的问题", userPa.isFemale() ? "她" : "他"));
        }
        o6j0.h("e_chat_question_auto_send", "p_chat_view", new o6j0.a[]{o6j0.a.h("chat_question_content", TextUtils.isEmpty(message.value) ? "" : message.value.replaceFirst("你好呀，问个问题～\n", "")), o6j0.a.h("chat_question_send_side", "from"), o6j0.a.h("chat_question_type", str)});
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f756h = (ImageView) findViewById(y4c0.k1);
        this.f753e = (TextView) findViewById(y4c0.A3);
        this.f752d = findViewById(y4c0.z3);
        this.f754f = (TextView) findViewById(y4c0.y3);
        this.f755g = (ImageView) findViewById(y4c0.E0);
        this.f753e.setTypeface(eqh0.m3924c(3), 1);
        this.f754f.setTypeface(eqh0.m3924c(3), 1);
        if (ura.e().d().I4()) {
            xdl0.N(this.f756h, c3c0.X1);
            xdl0.N(this.f755g, c3c0.W1);
            this.f753e.setTextColor(getResources().getColor(a1c0.i));
            this.f754f.setTextColor(getResources().getColor(a1c0.g));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1148q(Act act, String str, View view) {
        m1146B();
        CoreModule.P().i().A9(act, str);
    }

    /* JADX INFO: renamed from: z */
    public void m1149z(final Act act, dml dmlVar, Message message, qsz qszVar) {
        if (!qszVar.m7030a(((DbObject) message).id)) {
            qszVar.m7031b(((DbObject) message).id);
            m1147H(message);
        }
        this.f754f.setText(message.value);
        xdl0.M(this.f755g, CoreModule.P().i().v5());
        final String strValueOf = NullChecker.a(this.f757i) ? String.valueOf(this.f757i.questionId) : "";
        boolean zV5 = CoreModule.P().i().v5();
        View view = this.f752d;
        if (zV5) {
            xdl0.E0(view, new View.OnClickListener() { // from class: l.t1q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7392a.m1148q(act, strValueOf, view2);
                }
            });
        } else {
            xdl0.E0(view, (View.OnClickListener) null);
        }
    }

    public ItemChatAssistantQuestionAutoRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatAssistantQuestionAutoRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
