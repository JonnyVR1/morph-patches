package com.p000p1.mobile.putong.core.p001ui.mypets.view.item;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChallengeMsg;
import com.p1.mobile.putong.core.data.ChallengeMsgList;
import com.p1.mobile.putong.core.data.Message;
import l.a1c0;
import l.eqh0;
import l.o5e0;
import l.ura;
import l.vwb;
import l.xdl0;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Deprecated
public class ScriptMessageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f392a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mypets.view.item.ScriptMessageItem$a */
    public class C0026a extends ClickableSpan {
        public C0026a() {
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
    public final void m536a(View view) {
        o5e0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m537b(Act act, Message message, String str) {
        ChallengeMsg challengeMsg;
        ChallengeMsgList challengeMsgList = ChallengeMsgList.parse(message.msgData);
        xdl0.M(this, false);
        if (challengeMsgList == null || vwb.J(challengeMsgList.msgData) || (challengeMsg = (ChallengeMsg) challengeMsgList.msgData.get(0)) == null || TextUtils.isEmpty(challengeMsg.subTitle)) {
            return;
        }
        xdl0.M(this, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(challengeMsg.subTitle);
        int iIndexOf = challengeMsg.subTitle.indexOf(challengeMsg.buttonText);
        int length = challengeMsg.buttonText.length() + iIndexOf;
        C0026a c0026a = new C0026a();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", eqh0.c(3), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.x));
        if (iIndexOf > 0 && iIndexOf < challengeMsg.subTitle.length() && length > 0 && length < challengeMsg.subTitle.length()) {
            spannableStringBuilder.setSpan(c0026a, iIndexOf, length, 33);
            spannableStringBuilder.setSpan(customTypefaceSpan, iIndexOf, length, 33);
        }
        this.f392a.setText(spannableStringBuilder);
        this.f392a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m536a(this);
        if (ura.e().d().I4()) {
            this.f392a.setTextColor(getResources().getColor(a1c0.i));
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
