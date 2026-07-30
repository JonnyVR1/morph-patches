package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.a1c0;
import l.o4q;
import l.ura;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemHeartbeatSuccessNewUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f912a;

    /* JADX INFO: renamed from: b */
    public VText f913b;

    public ItemHeartbeatSuccessNewUi(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1286a(View view) {
        o4q.a(this, view);
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
        m1286a(this);
        this.f913b.getPaint().setFakeBoldText(true);
        if (ura.e().d().I4()) {
            this.f913b.setTextColor(getResources().getColor(a1c0.g));
        }
    }

    public ItemHeartbeatSuccessNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHeartbeatSuccessNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
