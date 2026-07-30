package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatAssistantQuestion;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p151v.VRelative;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.lyh0;
import p153l.n100;
import p153l.pol;
import p153l.sfj0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatAssistantQuestionAutoRight extends VRelative {

    /* JADX INFO: renamed from: d */
    public View f31709d;

    /* JADX INFO: renamed from: e */
    public TextView f31710e;

    /* JADX INFO: renamed from: f */
    public TextView f31711f;

    /* JADX INFO: renamed from: g */
    public ImageView f31712g;

    /* JADX INFO: renamed from: h */
    public ImageView f31713h;

    /* JADX INFO: renamed from: i */
    public ChatAssistantQuestion f31714i;

    public ItemChatAssistantQuestionAutoRight(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m49249B() {
        sfj0.m185596c("e_chat_question_auto_send", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: H */
    public void m49250H(Message message) {
        String str = message.msgData;
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f31714i = ChatAssistantQuestion.JSON_ADAPTER.parse(message.msgData);
            }
            if (NullChecker.m82486a(this.f31714i)) {
                str = this.f31714i.type;
            }
        } catch (IOException unused) {
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.cid);
        if (NullChecker.m82486a(userM116503Pa)) {
            this.f31710e.setText(String.format("向%s提了一个你感兴趣的问题", userM116503Pa.isFemale() ? "她" : "他"));
        }
        sfj0.m185601h("e_chat_question_auto_send", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("chat_question_content", TextUtils.isEmpty(message.value) ? "" : message.value.replaceFirst("你好呀，问个问题～\n", "")), sfj0.C20032a.m185615h("chat_question_send_side", "from"), sfj0.C20032a.m185615h("chat_question_type", str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31713h = (ImageView) findViewById(edc0.f93394k1);
        this.f31710e = (TextView) findViewById(edc0.f93167A3);
        this.f31709d = findViewById(edc0.f93501z3);
        this.f31711f = (TextView) findViewById(edc0.f93494y3);
        this.f31712g = (ImageView) findViewById(edc0.f93191E0);
        this.f31710e.setTypeface(lyh0.m156283c(3), 1);
        this.f31711f.setTypeface(lyh0.m156283c(3), 1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31713h, ibc0.f113945X1);
            bnl0.m105526N(this.f31712g, ibc0.f113937W1);
            this.f31710e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31711f.setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m49251q(Act act, String str, View view) {
        m49249B();
        CoreModule.m30933P().m143412i().mo34285A9(act, str);
    }

    /* JADX INFO: renamed from: z */
    public void m49252z(final Act act, pol polVar, Message message, n100 n100Var) {
        if (!n100Var.m161054a(message.f56859id)) {
            n100Var.m161055b(message.f56859id);
            m49250H(message);
        }
        this.f31711f.setText(message.value);
        bnl0.m105524M(this.f31712g, CoreModule.m30933P().m143412i().mo180550v5());
        final String strValueOf = NullChecker.m82486a(this.f31714i) ? String.valueOf(this.f31714i.questionId) : "";
        boolean zMo180550v5 = CoreModule.m30933P().m143412i().mo180550v5();
        View view = this.f31709d;
        if (zMo180550v5) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.t3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f171941a.m49251q(act, strValueOf, view2);
                }
            });
        } else {
            bnl0.m105509E0(view, null);
        }
    }

    public ItemChatAssistantQuestionAutoRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatAssistantQuestionAutoRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
