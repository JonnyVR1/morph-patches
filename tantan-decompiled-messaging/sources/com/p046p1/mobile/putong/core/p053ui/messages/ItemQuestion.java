package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.OfficialAccountAction;
import com.p046p1.mobile.putong.data.OfficialAccountActionType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.knb0;
import p149l.l6c0;
import p149l.o7r;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemQuestion extends LinearLayout implements InterfaceC8519a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemText f31436a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f31437b;

    /* JADX INFO: renamed from: c */
    public ItemMessageBase f31438c;

    /* JADX INFO: renamed from: d */
    public Message f31439d;

    public ItemQuestion(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31439d = message;
        Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(message.question);
        this.f31436a.m48727D(questionM215900o3 == null ? "" : questionM215900o3.text, message);
        if (!NullChecker.m81303a(questionM215900o3) || !NullChecker.m81303a(questionM215900o3.answers) || questionM215900o3.answers.size() <= 0) {
            this.f31437b.setVisibility(8);
            if (message.isOtherUser()) {
                ((ItemMessageLeft) this.f31438c).f31177M.setTranslationY(0.0f);
                return;
            }
            return;
        }
        this.f31437b.setVisibility(0);
        if (CoreModule.m29935P().m94658i().mo158233G1() && !User.isTeamAccount(message.owner)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31437b.getLayoutParams();
            layoutParams.width = -1;
            this.f31437b.setLayoutParams(layoutParams);
        }
        for (int i = 0; i < questionM215900o3.answers.size(); i++) {
            TextView textView = (TextView) this.f31437b.getChildAt(i);
            textView.getPaint().setFakeBoldText(true);
            Answer answer = questionM215900o3.answers.get(i);
            String strValueOf = String.valueOf(textView.getText());
            textView.setText(answer.value);
            if (answer.f38721id == null) {
                answer.f38721id = "";
            }
            textView.setTag(answer);
            if (!answer.value.equals(strValueOf)) {
                textView.requestLayout();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m48619a() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m48620b(OfficialAccountActionType officialAccountActionType, String str) {
        String string = officialAccountActionType.toString();
        string.getClass();
        if (string.equals("schema")) {
            if (!str.startsWith("tel:")) {
                CoreModule.m29935P().m94658i().mo158334Y(m48619a(), Uri.parse(str));
            } else {
                m48619a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31438c = itemMessageBase;
        for (int i2 = 0; i2 < i; i2++) {
            this.f31437b.addView(o7r.m163037a(getContext()).inflate(l6c0.f126393T4, (ViewGroup) this.f31437b, false));
            this.f31437b.getChildAt(i2).setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Answer answer = (Answer) view.getTag();
        if (!NullChecker.m81303a(answer.action)) {
            m48619a().mo48974l().m120678L6(((TextView) view).getText().toString(), this.f31439d.f56011id, answer.f38721id);
        } else {
            OfficialAccountAction officialAccountAction = answer.action;
            m48620b(officialAccountAction.type, officialAccountAction.data);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31436a = (ItemText) findViewById(y4c0.f195933A4);
        this.f31437b = (LinearLayout) findViewById(y4c0.f196136h);
        this.f31436a.setBackground(null);
        this.f31437b.setBackground(null);
        this.f31436a.getPaint().setFakeBoldText(true);
        this.f31436a.setTextSize(15.0f);
    }

    public ItemQuestion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemQuestion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
