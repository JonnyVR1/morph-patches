package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.r3q;
import l.ura;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemFriendActiveRemindFemale extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f862a;

    /* JADX INFO: renamed from: b */
    public VText f863b;

    public ItemFriendActiveRemindFemale(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1253a(View view) {
        r3q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m1254b(Message message, User user) {
        this.f862a.getPaint().setFakeBoldText(true);
        if (NullChecker.a(user)) {
            this.f862a.setText((user.isFemale() ? "她" : "他").concat("在等你回复"));
        }
        if (NullChecker.a(message) && NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.femaleUnreplyReminder) && !TextUtils.isEmpty(message.additionalData.femaleUnreplyReminder.remindInfo)) {
            this.f863b.setText(message.additionalData.femaleUnreplyReminder.remindInfo);
        } else {
            this.f863b.setText("");
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
        m1253a(this);
        if (ura.e().d().I4()) {
            this.f862a.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(c3c0.Y6), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f862a.setTextColor(getResources().getColor(a1c0.j));
            this.f863b.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemFriendActiveRemindFemale(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFriendActiveRemindFemale(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
