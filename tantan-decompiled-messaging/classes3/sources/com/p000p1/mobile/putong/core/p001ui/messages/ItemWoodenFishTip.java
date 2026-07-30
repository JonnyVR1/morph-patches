package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.data.Message;
import l.a1c0;
import l.y4c0;
import p003l.gz00;
import p028v.VFrame;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemWoodenFishTip extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f1444a;

    public ItemWoodenFishTip(Context context) {
        super(context);
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
    /* JADX INFO: renamed from: A */
    public void m1868A(Message message) {
        this.f1444a.setTextColor(getResources().getColor(a1c0.G));
        this.f1444a.setText(gz00.m4902a(message));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1444a = (VText) findViewById(y4c0.Z);
    }

    public ItemWoodenFishTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemWoodenFishTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
