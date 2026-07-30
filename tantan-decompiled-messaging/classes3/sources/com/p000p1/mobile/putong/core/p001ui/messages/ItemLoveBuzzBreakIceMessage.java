package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.data.BreakIce;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import l.a1c0;
import l.hvc0;
import l.ura;
import l.vwb;
import l.y5q;
import l.zvf0;
import p003l.dml;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLoveBuzzBreakIceMessage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLoveBuzzBreakIceMessage f997a;

    /* JADX INFO: renamed from: b */
    public VText f998b;

    /* JADX INFO: renamed from: c */
    public VText f999c;

    /* JADX INFO: renamed from: d */
    public VText f1000d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f1001e;

    public ItemLoveBuzzBreakIceMessage(Context context) {
        super(context);
        this.f1001e = new HashSet<>();
    }

    /* JADX INFO: renamed from: c */
    public final void m1372c(View view) {
        y5q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m1373d() {
        zvf0.r("e_intl_buzz_message_guide", "p_chat_view");
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1374e(MessagesAct messagesAct, View view) {
        m1373d();
        messagesAct.f1531f.m4173S6(this.f999c.getText().toString());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1375f(MessagesAct messagesAct, View view) {
        m1373d();
        messagesAct.f1531f.m4173S6(this.f1000d.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public void m1376g(final MessagesAct messagesAct, dml dmlVar, Message message) {
        if (NullChecker.a(message) && NullChecker.a(message.additionalData) && !vwb.J(message.additionalData.localBreakIce)) {
            List list = message.additionalData.localBreakIce;
            this.f998b.setText(hvc0.c(R.string.z3));
            this.f999c.setText(((BreakIce) list.get(0)).content);
            this.f1000d.setText(((BreakIce) list.get(1)).content);
            this.f999c.setOnClickListener(new View.OnClickListener() { // from class: l.w5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8489a.m1374e(messagesAct, view);
                }
            });
            this.f1000d.setOnClickListener(new View.OnClickListener() { // from class: l.x5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8733a.m1375f(messagesAct, view);
                }
            });
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
        m1372c(this);
        AppCompatTextView appCompatTextView = this.f999c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        appCompatTextView.setTypeface(typeface);
        this.f1000d.setTypeface(typeface);
        zvf0.x("e_intl_buzz_message_guide", "p_chat_view");
        if (ura.e().d().I4()) {
            this.f998b.setTextColor(getResources().getColor(a1c0.i));
            this.f999c.setTextColor(getResources().getColor(a1c0.g));
            this.f1000d.setTextColor(getResources().getColor(a1c0.g));
        }
    }

    public ItemLoveBuzzBreakIceMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1001e = new HashSet<>();
    }

    public ItemLoveBuzzBreakIceMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1001e = new HashSet<>();
    }
}
