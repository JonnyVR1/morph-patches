package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.OfficialAccountAction;
import com.p051p1.mobile.putong.data.OfficialAccountActionType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.edc0;
import p153l.ovb0;
import p153l.p9r;
import p153l.qec0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemQuestion extends LinearLayout implements InterfaceC8682a, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public ItemText f32284a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f32285b;

    /* JADX INFO: renamed from: c */
    public ItemMessageBase f32286c;

    /* JADX INFO: renamed from: d */
    public Message f32287d;

    public ItemQuestion(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32287d = message;
        Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(message.question);
        this.f32284a.m49910D(questionM151465o3 == null ? "" : questionM151465o3.text, message);
        if (!NullChecker.m82486a(questionM151465o3) || !NullChecker.m82486a(questionM151465o3.answers) || questionM151465o3.answers.size() <= 0) {
            this.f32285b.setVisibility(8);
            if (message.isOtherUser()) {
                ((ItemMessageLeft) this.f32286c).f32025M.setTranslationY(0.0f);
                return;
            }
            return;
        }
        this.f32285b.setVisibility(0);
        if (CoreModule.m30933P().m143412i().mo180325G1() && !User.isTeamAccount(message.owner)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32285b.getLayoutParams();
            layoutParams.width = -1;
            this.f32285b.setLayoutParams(layoutParams);
        }
        for (int i = 0; i < questionM151465o3.answers.size(); i++) {
            TextView textView = (TextView) this.f32285b.getChildAt(i);
            textView.getPaint().setFakeBoldText(true);
            Answer answer = questionM151465o3.answers.get(i);
            String strValueOf = String.valueOf(textView.getText());
            textView.setText(answer.value);
            if (answer.f39569id == null) {
                answer.f39569id = "";
            }
            textView.setTag(answer);
            if (!answer.value.equals(strValueOf)) {
                textView.requestLayout();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public MessagesAct m49802a() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m49803b(OfficialAccountActionType officialAccountActionType, String str) {
        String string = officialAccountActionType.toString();
        string.getClass();
        if (string.equals("schema")) {
            if (!str.startsWith("tel:")) {
                CoreModule.m30933P().m143412i().mo180426Y(m49802a(), Uri.parse(str));
            } else {
                m49802a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f32286c = itemMessageBase;
        for (int i2 = 0; i2 < i; i2++) {
            this.f32285b.addView(p9r.m171370a(getContext()).inflate(qec0.f156949T4, (ViewGroup) this.f32285b, false));
            this.f32285b.getChildAt(i2).setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Answer answer = (Answer) view.getTag();
        if (!NullChecker.m82486a(answer.action)) {
            m49802a().mo50158l().m110884L6(((TextView) view).getText().toString(), this.f32287d.f56859id, answer.f39569id);
        } else {
            OfficialAccountAction officialAccountAction = answer.action;
            m49803b(officialAccountAction.type, officialAccountAction.data);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32284a = (ItemText) findViewById(edc0.f93168A4);
        this.f32285b = (LinearLayout) findViewById(edc0.f93371h);
        this.f32284a.setBackground(null);
        this.f32285b.setBackground(null);
        this.f32284a.getPaint().setFakeBoldText(true);
        this.f32284a.setTextSize(15.0f);
    }

    public ItemQuestion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemQuestion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
