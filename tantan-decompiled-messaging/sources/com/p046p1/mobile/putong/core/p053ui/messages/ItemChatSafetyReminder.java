package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.a1c0;
import p149l.b2q;
import p149l.bpz;
import p149l.c3c0;
import p149l.e30;
import p149l.eqh0;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.ura;
import p149l.w9j;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatSafetyReminder extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f30877a;

    /* JADX INFO: renamed from: b */
    public String f30878b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatSafetyReminder$a */
    public class C8484a extends ClickableSpan {
        public C8484a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            o6j0.m162859c("e_alert_cheat_prevention__dangerous_user_tips", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
            ItemChatSafetyReminder.this.getContext().startActivity(WebViewAct.m80165a2(ItemChatSafetyReminder.this.getContext(), "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatSafetyReminder$b */
    public class C8485b extends ClickableSpan {
        public C8485b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            o6j0.m162859c("e_alert_cheat_prevention__sensitive_words_tips", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
            ItemChatSafetyReminder.this.getContext().startActivity(WebViewAct.m80165a2(ItemChatSafetyReminder.this.getContext(), "", "https://live-web.tantanapp.com/anti_fraud_reminder/test", true));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ItemChatSafetyReminder(@NonNull Context context) {
        super(context);
        this.f30878b = "";
    }

    /* JADX INFO: renamed from: c */
    public final void m48084c(View view) {
        b2q.m99973a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m48085d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48086e(C4319c c4319c) {
        m48085d().m192795e0(this.f30878b + "e_alert_cheat_prevention__dangerous_user_tips");
        m48085d().m192795e0(this.f30878b + "e_alert_cheat_prevention__sensitive_words_tips");
    }

    /* JADX INFO: renamed from: f */
    public void m48087f(Message message) {
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz)) {
            boolean z = ((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1;
            VText vText = this.f30877a;
            if (z) {
                vText.setBackground(getResources().getDrawable(c3c0.f78625R4));
                this.f30877a.setTextColor(getContext().getResources().getColor(a1c0.f67146a0));
            } else {
                vText.setTextColor(getContext().getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67157k));
                this.f30877a.setBackgroundColor(0);
            }
        }
        this.f30878b = message.f56011id;
        if (message.localSafetyReminder) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("与陌生人交友过程中，请加强自我防范意识，注意隐私和财产安全！戳一戳");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "了解更多防骗技巧");
            spannableStringBuilder.setSpan(new C8484a(), length, length + 8, 33);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67124F)), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u200b");
            this.f30877a.setText(spannableStringBuilder);
            this.f30877a.setMovementMethod(LinkMovementMethod.getInstance());
            if (m48085d().m192794K(this.f30878b + "e_alert_cheat_prevention__dangerous_user_tips")) {
                return;
            }
            m48085d().m192793I(this.f30878b + "e_alert_cheat_prevention__dangerous_user_tips");
            o6j0.m162864h("e_alert_cheat_prevention__dangerous_user_tips", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
            return;
        }
        if (message.localSensitiveWordReminder) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("对于急于交换微信、QQ等联系方式的用户，请提高警惕，避免与陌生人发生资金往来，点击");
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) "安全交友测试");
            spannableStringBuilder2.setSpan(new C8485b(), length2, length2 + 6, 33);
            spannableStringBuilder2.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m117752c(3), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67124F)), length2, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) "，看看你的安全意识够不够");
            this.f30877a.setText(spannableStringBuilder2);
            this.f30877a.setMovementMethod(LinkMovementMethod.getInstance());
            if (m48085d().m192794K(this.f30878b + "e_alert_cheat_prevention__sensitive_words_tips")) {
                return;
            }
            m48085d().m192793I(this.f30878b + "e_alert_cheat_prevention__sensitive_words_tips");
            o6j0.m162864h("e_alert_cheat_prevention__sensitive_words_tips", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48084c(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30877a.setTextColor(getResources().getColor(a1c0.f67155i));
        }
        if (getContext() instanceof mcr) {
            ((mcr) getContext()).lifecycle().filter(new w9j() { // from class: l.z1q
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.a2q
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67277a.m48086e((C4319c) obj);
                }
            }));
        }
    }

    public ItemChatSafetyReminder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30878b = "";
    }

    public ItemChatSafetyReminder(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30878b = "";
    }
}
