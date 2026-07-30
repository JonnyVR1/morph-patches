package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.k6q;
import l.knb0;
import l.ura;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMarry extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemMarry f1013a;

    /* JADX INFO: renamed from: b */
    public ItemText f1014b;

    /* JADX INFO: renamed from: c */
    public ItemText f1015c;

    public ItemMarry(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m1387c(View view) {
        getContext().startActivity(CoreModule.P().i().f5(getContext()));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        boolean zIsEmpty = TextUtils.isEmpty(message.value);
        AppCompatTextView appCompatTextView = this.f1014b;
        if (zIsEmpty) {
            appCompatTextView.setText("");
        } else {
            appCompatTextView.setText(message.value);
        }
        if (!message.isMe() || !CoreModule.P().a().dj()) {
            xdl0.M(this.f1015c, false);
        } else {
            xdl0.M(this.f1015c, true);
            xdl0.E0(this.f1015c, new View.OnClickListener() { // from class: l.j6q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4578a.m1387c(view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1388b(View view) {
        k6q.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
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
        m1388b(this);
        if (ura.e().d().I4()) {
            this.f1014b.setTextColor(getResources().getColor(a1c0.g));
            this.f1015c.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(c3c0.j2), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public ItemMarry(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMarry(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
