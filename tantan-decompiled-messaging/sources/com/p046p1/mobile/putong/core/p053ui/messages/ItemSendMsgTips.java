package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VText;
import p149l.a1c0;
import p149l.qib0;
import p149l.ura;
import p149l.zdq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSendMsgTips extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemSendMsgTips f31471a;

    /* JADX INFO: renamed from: b */
    public VText f31472b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemSendMsgTips$a */
    public class C8509a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f31473a;

        public C8509a(Act act) {
            this.f31473a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intentMo158464w5 = CoreModule.m29935P().m94651a().mo158464w5(this.f31473a, qib0.f154713b0.f139230a.userId(), "", false, true);
            intentMo158464w5.putExtra("preview_type", 0);
            this.f31473a.startActivity(intentMo158464w5);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ItemSendMsgTips(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48660a(View view) {
        zdq.m218192a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m48661b(Act act, String str) {
        SpannableString spannableStringM48662c;
        if (TextUtils.equals(str, "tag")) {
            spannableStringM48662c = m48662c(act, "已保存到我的标签，点击进入资料编辑页修改", "资料编辑页");
        } else {
            spannableStringM48662c = TextUtils.equals(str, "artwork") ? m48662c(act, "已保存到我的书影剧，点击进入资料编辑页修改", "资料编辑页") : null;
        }
        if (TextUtils.isEmpty(spannableStringM48662c)) {
            return;
        }
        this.f31472b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f31472b.setText(spannableStringM48662c);
    }

    /* JADX INFO: renamed from: c */
    public final SpannableString m48662c(Act act, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new ForegroundColorSpan(act.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67161o)), iIndexOf, str2.length() + iIndexOf, 33);
        spannableString.setSpan(new C8509a(act), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableString;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48660a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31472b.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemSendMsgTips(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSendMsgTips(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
