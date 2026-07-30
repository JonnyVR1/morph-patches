package com.p051p1.mobile.putong.core.p058ui.mypets.view.item;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ChallengeMsg;
import com.p051p1.mobile.putong.core.data.ChallengeMsgList;
import com.p051p1.mobile.putong.core.data.Message;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.jyb;
import p153l.lyh0;
import p153l.tde0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ScriptMessageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f33418a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.mypets.view.item.ScriptMessageItem$a */
    public class C8764a extends ClickableSpan {
        public C8764a() {
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
    public final void m51290a(View view) {
        tde0.m190622a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m51291b(Act act, Message message, String str) {
        ChallengeMsg challengeMsg;
        ChallengeMsgList challengeMsgList = ChallengeMsgList.parse(message.msgData);
        bnl0.m105524M(this, false);
        if (challengeMsgList == null || jyb.m147479J(challengeMsgList.msgData) || (challengeMsg = challengeMsgList.msgData.get(0)) == null || TextUtils.isEmpty(challengeMsg.subTitle)) {
            return;
        }
        bnl0.m105524M(this, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(challengeMsg.subTitle);
        int iIndexOf = challengeMsg.subTitle.indexOf(challengeMsg.buttonText);
        int length = challengeMsg.buttonText.length() + iIndexOf;
        C8764a c8764a = new C8764a();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102834x));
        if (iIndexOf > 0 && iIndexOf < challengeMsg.subTitle.length() && length > 0 && length < challengeMsg.subTitle.length()) {
            spannableStringBuilder.setSpan(c8764a, iIndexOf, length, 33);
            spannableStringBuilder.setSpan(customTypefaceSpan, iIndexOf, length, 33);
        }
        this.f33418a.setText(spannableStringBuilder);
        this.f33418a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51290a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f33418a.setTextColor(getResources().getColor(g9c0.f102819i));
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
