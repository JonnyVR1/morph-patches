package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.Date;
import l.a1c0;
import l.j760;
import l.mqi0;
import l.ura;
import l.v5q;
import l.zvf0;
import p003l.qsz;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLongTimeNoSeeTip extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLongTimeNoSeeTip f990a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f991b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f992c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f993d;

    /* JADX INFO: renamed from: e */
    public VText f994e;

    /* JADX INFO: renamed from: f */
    public VText f995f;

    /* JADX INFO: renamed from: g */
    public VText f996g;

    public ItemLongTimeNoSeeTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1368a(View view) {
        v5q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m1369b(qsz qszVar, Message message, User user, Conversation conversation) {
        if (!qszVar.m7030a(((DbObject) message).id)) {
            qszVar.m7031b(((DbObject) message).id);
            zvf0.A("e_longtimenosee_notice", "p_chat_view", new j760[]{j760.a("pairing_type", conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice")});
        }
        if (conversation.additional.reSwipe == null) {
            this.f994e.setVisibility(8);
            return;
        }
        boolean zM1111d = ItemBase.m1111d(new Date((long) conversation.additional.reSwipe.swipedTime));
        AppCompatTextView appCompatTextView = this.f994e;
        if (zM1111d) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setVisibility(0);
            this.f994e.setText(ItemBase.m1109b(conversation.additional.reSwipe.swipedTime));
        }
        this.f995f.setVisibility(0);
        this.f995f.setText(mqi0.h.format(Double.valueOf(conversation.additional.reSwipe.swipedTime)));
        this.f993d.setVisibility(0);
        this.f992c.setVisibility(0);
        this.f996g.setText(String.format("再相遇，别让缘分溜走，和%s聊聊吧", user.isFemale() ? "她" : "他"));
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
        m1368a(this);
        if (ura.e().d().I4()) {
            this.f996g.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemLongTimeNoSeeTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLongTimeNoSeeTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
