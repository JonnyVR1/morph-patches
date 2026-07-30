package com.p046p1.mobile.putong.core.p053ui.mypets.view.item;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.Message;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.a1c0;
import p149l.eqh0;
import p149l.o5e0;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ScriptMessageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f32570a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mypets.view.item.ScriptMessageItem$a */
    public class C8601a extends ClickableSpan {
        public C8601a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ScriptMessageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50107a(View view) {
        o5e0.m162780a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m50108b(Act act, Message message, String str) {
        ChallengeMsg challengeMsg;
        ChallengeMsgList challengeMsgList = ChallengeMsgList.parse(message.msgData);
        xdl0.m208344M(this, false);
        if (challengeMsgList == null || vwb.m200296J(challengeMsgList.msgData) || (challengeMsg = challengeMsgList.msgData.get(0)) == null || TextUtils.isEmpty(challengeMsg.subTitle)) {
            return;
        }
        xdl0.m208344M(this, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(challengeMsg.subTitle);
        int iIndexOf = challengeMsg.subTitle.indexOf(challengeMsg.buttonText);
        int length = challengeMsg.buttonText.length() + iIndexOf;
        C8601a c8601a = new C8601a();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67170x));
        if (iIndexOf > 0 && iIndexOf < challengeMsg.subTitle.length() && length > 0 && length < challengeMsg.subTitle.length()) {
            spannableStringBuilder.setSpan(c8601a, iIndexOf, length, 33);
            spannableStringBuilder.setSpan(customTypefaceSpan, iIndexOf, length, 33);
        }
        this.f32570a.setText(spannableStringBuilder);
        this.f32570a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50107a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f32570a.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ScriptMessageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScriptMessageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ScriptMessageItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
