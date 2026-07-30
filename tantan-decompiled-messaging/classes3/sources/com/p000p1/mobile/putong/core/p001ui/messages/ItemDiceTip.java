package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.a1c0;
import l.t2q;
import l.ura;
import l.xdl0;
import l.zvf0;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemDiceTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemDiceTip f817a;

    /* JADX INFO: renamed from: b */
    public VText f818b;

    /* JADX INFO: renamed from: c */
    public VText f819c;

    public ItemDiceTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1206a(View view) {
        t2q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m1207b(Message message, User user) {
        if ((!User.isMatched(user) || user.unilateralBlock()) && !user.onlineMatchLocked()) {
            xdl0.M(this, false);
            return;
        }
        Conversation conversationXe = CoreModule.c.f0.Xe(message.cid);
        if (conversationXe == null || TEnum.equals(conversationXe.status, "dismissed")) {
            xdl0.M(this, false);
            return;
        }
        if (message.localCallStatus == 290) {
            this.f818b.setText("好久没联系？从一局游戏开始叙叙旧吧~");
        }
        zvf0.x("e_chat_start_dice_tip", "p_chat_view");
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
        m1206a(this);
        if (ura.e().d().I4()) {
            this.f818b.setTextColor(getResources().getColor(a1c0.i));
            this.f819c.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemDiceTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemDiceTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
