package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.ibq;
import l.j760;
import l.knb0;
import l.osi0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.eqh0;
import p003l.qsz;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemPicCertGuide extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemPicCertGuide f1250a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f1251b;

    /* JADX INFO: renamed from: c */
    public VImage f1252c;

    /* JADX INFO: renamed from: d */
    public VText f1253d;

    /* JADX INFO: renamed from: e */
    public VText f1254e;

    /* JADX INFO: renamed from: f */
    public VText f1255f;

    public ItemPicCertGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m1654d(User user, View view) {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified")) {
            osi0.g("已认证");
        } else if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            osi0.g("正在审核中");
        } else {
            ura.e().d().Eg(m1656c());
        }
        zvf0.u("e_chat_view_verification", "p_chat_view", new j760[]{vwb.Y("receiver_user_id", ((DbObject) user).id)});
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
    public final void m1655b(View view) {
        ibq.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m1656c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m1657e(final User user, qsz qszVar) {
        if (user == null || qszVar == null) {
            return;
        }
        this.f1254e.setText(String.format("%s可能更喜欢和真实的人聊天，完成认证表达诚意", user.getPronoun()));
        xdl0.E0(this.f1251b, new View.OnClickListener() { // from class: l.hbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4165a.m1654d(user, view);
            }
        });
        if (qszVar.m7030a("PIC_CERT_GUIDE_MV_KEY")) {
            return;
        }
        qszVar.m7031b("PIC_CERT_GUIDE_MV_KEY");
        zvf0.A("e_chat_view_verification", "p_chat_view", new j760[]{vwb.Y("receiver_user_id", ((DbObject) user).id)});
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
        m1655b(this);
        this.f1253d.setTypeface(eqh0.m3924c(3), 1);
        this.f1255f.setTypeface(eqh0.m3924c(3), 1);
        if (ura.e().d().I4()) {
            this.f1253d.setTextColor(getResources().getColor(a1c0.g));
            this.f1254e.setTextColor(getResources().getColor(a1c0.i));
            this.f1255f.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemPicCertGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPicCertGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
