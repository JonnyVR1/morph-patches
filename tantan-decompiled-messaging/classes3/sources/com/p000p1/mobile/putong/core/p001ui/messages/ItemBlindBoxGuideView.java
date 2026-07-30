package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.GrowthConversationBlindBox;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.h1q;
import l.j2e0;
import l.knb0;
import l.qib0;
import l.ura;
import l.xdl0;
import l.zvf0;
import p003l.qsz;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemBlindBoxGuideView extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemBlindBoxGuideView f719a;

    /* JADX INFO: renamed from: b */
    public VText f720b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f721c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f722d;

    /* JADX INFO: renamed from: e */
    public VText f723e;

    /* JADX INFO: renamed from: f */
    public VText f724f;

    /* JADX INFO: renamed from: g */
    public VText f725g;

    public ItemBlindBoxGuideView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m1117b(View view) {
        h1q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m1118c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1119d(GrowthConversationBlindBox growthConversationBlindBox, View view) {
        String strD3 = CoreModule.P().g().Wa() ? CoreModule.c.g2.d3(growthConversationBlindBox.view.h5URL) : growthConversationBlindBox.view.h5URL;
        if (TextUtils.isEmpty(strD3)) {
            return;
        }
        j2e0.m(m1118c(), Uri.parse("tantan://webview?url=" + strD3));
        zvf0.r("e_chat_blindbox_receiver_h5", "p_chat_view");
    }

    /* JADX INFO: renamed from: e */
    public void m1120e(Conversation conversation, User user, qsz qszVar) {
        final GrowthConversationBlindBox growthConversationBlindBox;
        if (conversation == null || (growthConversationBlindBox = conversation.additional.blindbox) == null || qszVar == null) {
            return;
        }
        boolean z = growthConversationBlindBox.isActor;
        RelativeLayout relativeLayout = this.f721c;
        if (z) {
            xdl0.M(relativeLayout, false);
        } else {
            xdl0.M(relativeLayout, true);
            this.f723e.setText(growthConversationBlindBox.view.title);
            this.f723e.setTypeface((Typeface) null, 1);
            this.f724f.setText(growthConversationBlindBox.view.subTitle);
            this.f725g.setTypeface((Typeface) null, 1);
            this.f725g.setText(growthConversationBlindBox.view.buttonTxt);
            if (TextUtils.isEmpty(growthConversationBlindBox.view.icon)) {
                this.f722d.setImageResource(ura.e().d().I4() ? c3c0.P1 : c3c0.O1);
            } else {
                qib0.G.L0(this.f722d, growthConversationBlindBox.view.icon);
            }
        }
        this.f720b.setText(growthConversationBlindBox.tip);
        xdl0.E0(this.f725g, new View.OnClickListener() { // from class: l.g1q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3788a.m1119d(growthConversationBlindBox, view);
            }
        });
        if (qszVar.m7030a("GROWTH_BLINDBOX_GUIDE_MV_KEY")) {
            return;
        }
        qszVar.m7031b("GROWTH_BLINDBOX_GUIDE_MV_KEY");
        if (growthConversationBlindBox.isActor) {
            zvf0.x("e_chat_blindbox_initiator_tips", "p_chat_view");
        } else {
            zvf0.x("e_chat_blindbox_receiver_tips", "p_chat_view");
            zvf0.x("e_chat_blindbox_receiver_h5", "p_chat_view");
        }
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
        m1117b(this);
        if (ura.e().d().I4()) {
            this.f722d.setImageResource(c3c0.P1);
            this.f720b.setTextColor(getResources().getColor(a1c0.i));
            this.f723e.setTextColor(getResources().getColor(a1c0.g));
            this.f724f.setTextColor(getResources().getColor(a1c0.i));
            this.f725g.setBackgroundResource(c3c0.U4);
        }
    }

    public ItemBlindBoxGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemBlindBoxGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
