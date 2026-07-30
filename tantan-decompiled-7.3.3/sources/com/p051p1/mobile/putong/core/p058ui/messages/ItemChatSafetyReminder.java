package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p151v.VText;
import p151v.text.CustomTypefaceSpan;
import p153l.b4q;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.lyh0;
import p153l.ner;
import p153l.psd0;
import p153l.qcj;
import p153l.sfj0;
import p153l.y20;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChatSafetyReminder extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f31725a;

    /* JADX INFO: renamed from: b */
    public String f31726b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatSafetyReminder$a */
    public class C8647a extends ClickableSpan {
        public C8647a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            sfj0.m185596c("e_alert_cheat_prevention__dangerous_user_tips", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
            ItemChatSafetyReminder.this.getContext().startActivity(WebViewAct.m81348b2(ItemChatSafetyReminder.this.getContext(), "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatSafetyReminder$b */
    public class C8648b extends ClickableSpan {
        public C8648b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            sfj0.m185596c("e_alert_cheat_prevention__sensitive_words_tips", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
            ItemChatSafetyReminder.this.getContext().startActivity(WebViewAct.m81348b2(ItemChatSafetyReminder.this.getContext(), "", "https://live-web.tantanapp.com/anti_fraud_reminder/test", true));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ItemChatSafetyReminder(@NonNull Context context) {
        super(context);
        this.f31726b = "";
    }

    /* JADX INFO: renamed from: c */
    public final void m49267c(View view) {
        b4q.m102508a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m49268d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49269e(C4470c c4470c) {
        m49268d().m195421f0(this.f31726b + "e_alert_cheat_prevention__dangerous_user_tips");
        m49268d().m195421f0(this.f31726b + "e_alert_cheat_prevention__sensitive_words_tips");
    }

    /* JADX INFO: renamed from: f */
    public void m49270f(Message message) {
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz)) {
            boolean z = ((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1;
            VText vText = this.f31725a;
            if (z) {
                vText.setBackground(getResources().getDrawable(ibc0.f113900R4));
                this.f31725a.setTextColor(getContext().getResources().getColor(g9c0.f102810a0));
            } else {
                vText.setTextColor(getContext().getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102821k));
                this.f31725a.setBackgroundColor(0);
            }
        }
        this.f31726b = message.f56859id;
        if (message.localSafetyReminder) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("与陌生人交友过程中，请加强自我防范意识，注意隐私和财产安全！戳一戳");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "了解更多防骗技巧");
            spannableStringBuilder.setSpan(new C8647a(), length, length + 8, 33);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102788F)), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u200b");
            this.f31725a.setText(spannableStringBuilder);
            this.f31725a.setMovementMethod(LinkMovementMethod.getInstance());
            if (m49268d().m195420L(this.f31726b + "e_alert_cheat_prevention__dangerous_user_tips")) {
                return;
            }
            m49268d().m195419J(this.f31726b + "e_alert_cheat_prevention__dangerous_user_tips");
            sfj0.m185601h("e_alert_cheat_prevention__dangerous_user_tips", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
            return;
        }
        if (message.localSensitiveWordReminder) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("对于急于交换微信、QQ等联系方式的用户，请提高警惕，避免与陌生人发生资金往来，点击");
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) "安全交友测试");
            spannableStringBuilder2.setSpan(new C8648b(), length2, length2 + 6, 33);
            spannableStringBuilder2.setSpan(new CustomTypefaceSpan("sans-serif", lyh0.m156283c(3), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102788F)), length2, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) "，看看你的安全意识够不够");
            this.f31725a.setText(spannableStringBuilder2);
            this.f31725a.setMovementMethod(LinkMovementMethod.getInstance());
            if (m49268d().m195420L(this.f31726b + "e_alert_cheat_prevention__sensitive_words_tips")) {
                return;
            }
            m49268d().m195419J(this.f31726b + "e_alert_cheat_prevention__sensitive_words_tips");
            sfj0.m185601h("e_alert_cheat_prevention__sensitive_words_tips", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49267c(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31725a.setTextColor(getResources().getColor(g9c0.f102819i));
        }
        if (getContext() instanceof ner) {
            ((ner) getContext()).lifecycle().filter(new qcj() { // from class: l.z3q
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.a4q
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68438a.m49269e((C4470c) obj);
                }
            }));
        }
    }

    public ItemChatSafetyReminder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31726b = "";
    }

    public ItemChatSafetyReminder(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31726b = "";
    }
}
