package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import l.a1c0;
import l.qib0;
import l.ura;
import l.zdq;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemSendMsgTips extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemSendMsgTips f1362a;

    /* JADX INFO: renamed from: b */
    public VText f1363b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemSendMsgTips$a */
    public class C0092a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f1364a;

        public C0092a(Act act) {
            this.f1364a = act;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intent intentW5 = CoreModule.P().a().w5(this.f1364a, qib0.b0.a.userId(), "", false, true);
            intentW5.putExtra("preview_type", 0);
            this.f1364a.startActivity(intentW5);
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
    public final void m1744a(View view) {
        zdq.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m1745b(Act act, String str) {
        CharSequence charSequenceM1746c;
        if (TextUtils.equals(str, "tag")) {
            charSequenceM1746c = m1746c(act, "已保存到我的标签，点击进入资料编辑页修改", "资料编辑页");
        } else {
            charSequenceM1746c = TextUtils.equals(str, "artwork") ? m1746c(act, "已保存到我的书影剧，点击进入资料编辑页修改", "资料编辑页") : null;
        }
        if (TextUtils.isEmpty(charSequenceM1746c)) {
            return;
        }
        this.f1363b.setMovementMethod(LinkMovementMethod.getInstance());
        this.f1363b.setText(charSequenceM1746c);
    }

    /* JADX INFO: renamed from: c */
    public final SpannableString m1746c(Act act, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(new ForegroundColorSpan(act.getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.o)), iIndexOf, str2.length() + iIndexOf, 33);
        spannableString.setSpan(new C0092a(act), iIndexOf, str2.length() + iIndexOf, 33);
        return spannableString;
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
        m1744a(this);
        if (ura.e().d().I4()) {
            this.f1363b.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemSendMsgTips(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSendMsgTips(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
