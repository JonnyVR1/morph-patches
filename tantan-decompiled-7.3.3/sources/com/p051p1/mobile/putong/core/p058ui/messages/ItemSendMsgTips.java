package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.uqb0;
import p153l.zfq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSendMsgTips extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemSendMsgTips f32319a;

    /* JADX INFO: renamed from: b */
    public VText f32320b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemSendMsgTips$a */
    public class C8672a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f32321a;

        public C8672a(Act act) {
            this.f32321a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intentMo180556w5 = CoreModule.m30933P().m143405a().mo180556w5(this.f32321a, uqb0.f180396b0.f170324a.userId(), "", false, true);
            intentMo180556w5.putExtra("preview_type", 0);
            this.f32321a.startActivity(intentMo180556w5);
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
    public final void m49843a(View view) {
        zfq.m219575a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49844b(Act act, String str) {
        SpannableString spannableStringM49845c;
        if (TextUtils.equals(str, "tag")) {
            spannableStringM49845c = m49845c(act, "已保存到我的标签，点击进入资料编辑页修改", "资料编辑页");
        } else {
            spannableStringM49845c = TextUtils.equals(str, "artwork") ? m49845c(act, "已保存到我的书影剧，点击进入资料编辑页修改", "资料编辑页") : null;
        }
        if (TextUtils.isEmpty(spannableStringM49845c)) {
            return;
        }
        this.f32320b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f32320b.setText(spannableStringM49845c);
    }

    /* JADX INFO: renamed from: c */
    public final SpannableString m49845c(Act act, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new ForegroundColorSpan(act.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102825o)), iIndexOf, str2.length() + iIndexOf, 33);
        spannableString.setSpan(new C8672a(act), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableString;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49843a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32320b.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemSendMsgTips(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSendMsgTips(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
