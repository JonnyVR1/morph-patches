package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c2q;
import l.qib0;
import l.rw6;
import l.ura;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChatUnlockLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public NewTalkProgressView f772a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f773b;

    /* JADX INFO: renamed from: c */
    public TextView f774c;

    /* JADX INFO: renamed from: d */
    public VText f775d;

    public ItemChatUnlockLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1168a(View view) {
        c2q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MessagesAct m1169b() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m1170c(User user, Message message) {
        int i = 0;
        if (NullChecker.a(m1169b().f1531f.f3551k) && m1169b().f1531f.f3551k.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
            qib0.G.Q0(this.f773b, rw6.b(user).profileSmall());
        } else {
            CoreModule.P().i().y2(this.f773b, rw6.a(user).profileSmall(), 0);
        }
        if (CoreModule.P().i().e1(message.cid, ((DbObject) message).id)) {
            i = 25;
        } else if (CoreModule.P().i().r3(message.cid, ((DbObject) message).id)) {
            i = 50;
        } else if (CoreModule.P().i().l4(message.cid, ((DbObject) message).id)) {
            i = 75;
        }
        this.f774c.setText(String.format("已解锁%s%%", i + ""));
        this.f772a.setProgress(i);
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
        m1168a(this);
        if (ura.e().d().I4()) {
            this.f774c.setTextColor(getResources().getColor(a1c0.g));
            this.f775d.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemChatUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemChatUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
