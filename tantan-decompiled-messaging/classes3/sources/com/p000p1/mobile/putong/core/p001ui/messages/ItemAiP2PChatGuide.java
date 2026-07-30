package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.j2e0;
import l.k0q;
import l.knb0;
import l.osi0;
import l.ura;
import l.xdl0;
import l.zvf0;
import p003l.eqh0;
import p003l.qsz;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAiP2PChatGuide extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemAiP2PChatGuide f655a;

    /* JADX INFO: renamed from: b */
    public VImage f656b;

    /* JADX INFO: renamed from: c */
    public VText f657c;

    /* JADX INFO: renamed from: d */
    public VText f658d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f659e;

    public ItemAiP2PChatGuide(Context context) {
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
    public final void m1058b(View view) {
        k0q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m1059c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1060d(User user, View view) {
        Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) user).id);
        if (conversationZp == null || TEnum.equals(conversationZp.status, "dismissed")) {
            osi0.g("已解除配对，无法查看");
            return;
        }
        j2e0.m(m1059c(), Uri.parse("tantan://create_ai_avatar?uid=" + ((DbObject) user).id + "&from=other"));
        zvf0.r("e_paip_chat_quick", "p_chat_view");
    }

    /* JADX INFO: renamed from: e */
    public void m1061e(final User user, qsz qszVar) {
        if (user == null || qszVar == null) {
            return;
        }
        this.f657c.setTypeface(eqh0.m3924c(3), 1);
        this.f657c.setText(String.format("送%s魔法美照", TEnum.equals(user.gender, "female") ? "她" : "他"));
        this.f658d.setText(String.format("为%s的头像施加魔法", TEnum.equals(user.gender, "female") ? "她" : "他"));
        xdl0.E0(this.f659e, new View.OnClickListener() { // from class: l.j0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4544a.m1060d(user, view);
            }
        });
        if (qszVar.m7030a("AI_P2P_CHAT_GUIDE_MV_KEY")) {
            return;
        }
        qszVar.m7031b("AI_P2P_CHAT_GUIDE_MV_KEY");
        zvf0.x("e_paip_chat_quick", "p_chat_view");
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
        m1058b(this);
        if (ura.e().d().I4()) {
            xdl0.N(this.f656b, c3c0.C1);
            this.f657c.setTextColor(getResources().getColor(a1c0.g));
            this.f658d.setTextColor(getResources().getColor(a1c0.i));
            this.f659e.setBackgroundResource(c3c0.t);
        }
    }

    public ItemAiP2PChatGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemAiP2PChatGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
