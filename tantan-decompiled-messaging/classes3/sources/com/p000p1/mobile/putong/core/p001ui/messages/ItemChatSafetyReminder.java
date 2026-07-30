package com.p000p1.mobile.putong.core.p001ui.messages;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.data.DbObject;
import l.a1c0;
import l.b2q;
import l.c3c0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.ura;
import p003l.bpz;
import p003l.e30;
import p003l.eqh0;
import p003l.m250;
import p003l.w9j;
import p028v.VText;
import p028v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChatSafetyReminder extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f768a;

    /* JADX INFO: renamed from: b */
    public String f769b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatSafetyReminder$a */
    public class C0067a extends ClickableSpan {
        public C0067a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            o6j0.c("e_alert_cheat_prevention__dangerous_user_tips", "p_chat_view", new o6j0.a[0]);
            ItemChatSafetyReminder.this.getContext().startActivity(WebViewAct.a2(ItemChatSafetyReminder.this.getContext(), "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChatSafetyReminder$b */
    public class C0068b extends ClickableSpan {
        public C0068b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            o6j0.c("e_alert_cheat_prevention__sensitive_words_tips", "p_chat_view", new o6j0.a[0]);
            ItemChatSafetyReminder.this.getContext().startActivity(WebViewAct.a2(ItemChatSafetyReminder.this.getContext(), "", "https://live-web.tantanapp.com/anti_fraud_reminder/test", true));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public ItemChatSafetyReminder(@NonNull Context context) {
        super(context);
        this.f769b = "";
    }

    /* JADX INFO: renamed from: c */
    public final void m1164c(View view) {
        b2q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m1165d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1166e(c cVar) {
        m1165d().m8105e0(this.f769b + "e_alert_cheat_prevention__dangerous_user_tips");
        m1165d().m8105e0(this.f769b + "e_alert_cheat_prevention__sensitive_words_tips");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public void m1167f(Message message) {
        if ((getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz)) {
            boolean z = ((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1;
            AppCompatTextView appCompatTextView = this.f768a;
            if (z) {
                appCompatTextView.setBackground(getResources().getDrawable(c3c0.R4));
                this.f768a.setTextColor(getContext().getResources().getColor(a1c0.a0));
            } else {
                appCompatTextView.setTextColor(getContext().getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.k));
                this.f768a.setBackgroundColor(0);
            }
        }
        this.f769b = ((DbObject) message).id;
        if (message.localSafetyReminder) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("与陌生人交友过程中，请加强自我防范意识，注意隐私和财产安全！戳一戳");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "了解更多防骗技巧");
            spannableStringBuilder.setSpan(new C0067a(), length, length + 8, 33);
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m3924c(3), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.F)), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u200b");
            this.f768a.setText(spannableStringBuilder);
            this.f768a.setMovementMethod(LinkMovementMethod.getInstance());
            if (m1165d().m8104K(this.f769b + "e_alert_cheat_prevention__dangerous_user_tips")) {
                return;
            }
            m1165d().m8103I(this.f769b + "e_alert_cheat_prevention__dangerous_user_tips");
            o6j0.h("e_alert_cheat_prevention__dangerous_user_tips", "p_chat_view", new o6j0.a[0]);
            return;
        }
        if (message.localSensitiveWordReminder) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("对于急于交换微信、QQ等联系方式的用户，请提高警惕，避免与陌生人发生资金往来，点击");
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) "安全交友测试");
            spannableStringBuilder2.setSpan(new C0068b(), length2, length2 + 6, 33);
            spannableStringBuilder2.setSpan(new CustomTypefaceSpan("sans-serif", eqh0.m3924c(3), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.F)), length2, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) "，看看你的安全意识够不够");
            this.f768a.setText(spannableStringBuilder2);
            this.f768a.setMovementMethod(LinkMovementMethod.getInstance());
            if (m1165d().m8104K(this.f769b + "e_alert_cheat_prevention__sensitive_words_tips")) {
                return;
            }
            m1165d().m8103I(this.f769b + "e_alert_cheat_prevention__sensitive_words_tips");
            o6j0.h("e_alert_cheat_prevention__sensitive_words_tips", "p_chat_view", new o6j0.a[0]);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1164c(this);
        if (ura.e().d().I4()) {
            this.f768a.setTextColor(getResources().getColor(a1c0.i));
        }
        if (getContext() instanceof mcr) {
            getContext().lifecycle().filter(new w9j() { // from class: l.z1q
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).skip(1).subscribe((m250) mkd0.G(new e30() { // from class: l.a2q
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2073a.m1166e((c) obj);
                }
            }));
        }
    }

    public ItemChatSafetyReminder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f769b = "";
    }

    public ItemChatSafetyReminder(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f769b = "";
    }
}
