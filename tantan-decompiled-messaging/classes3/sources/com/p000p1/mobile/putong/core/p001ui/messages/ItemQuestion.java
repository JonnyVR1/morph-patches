package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.OfficialAccountAction;
import com.p1.mobile.putong.data.OfficialAccountActionType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.knb0;
import l.l6c0;
import l.o7r;
import l.y4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemQuestion extends LinearLayout implements InterfaceC0102a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemText f1327a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f1328b;

    /* JADX INFO: renamed from: c */
    public ItemMessageBase f1329c;

    /* JADX INFO: renamed from: d */
    public Message f1330d;

    public ItemQuestion(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1330d = message;
        Question questionO3 = CoreModule.c.d0.o3(message.question);
        this.f1327a.m1811D(questionO3 == null ? "" : questionO3.text, message);
        if (!NullChecker.a(questionO3) || !NullChecker.a(questionO3.answers) || questionO3.answers.size() <= 0) {
            this.f1328b.setVisibility(8);
            if (message.isOtherUser()) {
                ((ItemMessageLeft) this.f1329c).f1068M.setTranslationY(0.0f);
                return;
            }
            return;
        }
        this.f1328b.setVisibility(0);
        if (CoreModule.P().i().G1() && !User.isTeamAccount(message.owner)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1328b.getLayoutParams();
            layoutParams.width = -1;
            this.f1328b.setLayoutParams(layoutParams);
        }
        for (int i = 0; i < questionO3.answers.size(); i++) {
            TextView textView = (TextView) this.f1328b.getChildAt(i);
            textView.getPaint().setFakeBoldText(true);
            Answer answer = (Answer) questionO3.answers.get(i);
            String strValueOf = String.valueOf(textView.getText());
            textView.setText(answer.value);
            if (answer.id == null) {
                answer.id = "";
            }
            textView.setTag(answer);
            if (!answer.value.equals(strValueOf)) {
                textView.requestLayout();
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m1703a() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m1704b(OfficialAccountActionType officialAccountActionType, String str) {
        String string = officialAccountActionType.toString();
        string.getClass();
        if (string.equals("schema")) {
            if (!str.startsWith("tel:")) {
                CoreModule.P().i().Y(m1703a(), Uri.parse(str));
            } else {
                m1703a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f1329c = itemMessageBase;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1328b.addView(o7r.a(getContext()).inflate(l6c0.T4, (ViewGroup) this.f1328b, false));
            this.f1328b.getChildAt(i2).setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Answer answer = (Answer) view.getTag();
        if (!NullChecker.a(answer.action)) {
            m1703a().mo2066l().m4143L6(((TextView) view).getText().toString(), ((DbObject) this.f1330d).id, answer.id);
        } else {
            OfficialAccountAction officialAccountAction = answer.action;
            m1704b(officialAccountAction.type, officialAccountAction.data);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1327a = (ItemText) findViewById(y4c0.A4);
        this.f1328b = (LinearLayout) findViewById(y4c0.h);
        this.f1327a.setBackground(null);
        this.f1328b.setBackground(null);
        this.f1327a.getPaint().setFakeBoldText(true);
        this.f1327a.setTextSize(15.0f);
    }

    public ItemQuestion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemQuestion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
