package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import l.y4c0;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FeedbackAnswerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f600c;

    public FeedbackAnswerView(Context context) {
        super(context);
    }

    public TextPaint getPaint() {
        return this.f600c.getPaint();
    }

    public String getText() {
        return (String) this.f600c.getText();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f600c = (VText) findViewById(y4c0.A4);
    }

    public void setText(String str) {
        this.f600c.setText(str);
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
    public void setTextColor(int i) {
        this.f600c.setTextColor(i);
    }

    public FeedbackAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedbackAnswerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
