package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.knb0;
import l.seq;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.qsz;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemTagGuide extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemTagGuide f1392a;

    /* JADX INFO: renamed from: b */
    public VImage f1393b;

    /* JADX INFO: renamed from: c */
    public VText f1394c;

    /* JADX INFO: renamed from: d */
    public VText f1395d;

    /* JADX INFO: renamed from: e */
    public VText f1396e;

    /* JADX INFO: renamed from: f */
    public boolean f1397f;

    public ItemTagGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m1778d(User user, View view) {
        if (this.f1397f) {
            return;
        }
        CoreModule.P().i().H5(m1780c(), ((DbObject) user).id, "from_message_tag_guide", TabName.Msg.name());
        zvf0.r("e_add_tag_guide", "p_chat_view");
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
    public final void m1779b(View view) {
        seq.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m1780c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m1781e(Message message, final User user, qsz qszVar) {
        int i;
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(message) && NullChecker.a(user) && NullChecker.a(userP9)) {
            List list = userP9.profile.extensions.interest.tags;
            boolean z = !vwb.J(list) && list.size() >= 4;
            this.f1397f = z;
            this.f1396e.setText(z ? "完成" : "添加");
            AppCompatTextView appCompatTextView = this.f1396e;
            PutongAct putongActM1780c = m1780c();
            if (this.f1397f) {
                i = c3c0.S4;
            } else {
                i = ura.e().d().I4() ? c3c0.t : c3c0.T4;
            }
            appCompatTextView.setBackground(putongActM1780c.getDrawable(i));
            xdl0.E0(this.f1396e, new View.OnClickListener() { // from class: l.req
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6895a.m1778d(user, view);
                }
            });
            if (qszVar.m7030a("TAG_GUIDE_MV_KEY")) {
                return;
            }
            qszVar.m7031b("TAG_GUIDE_MV_KEY");
            zvf0.A("e_add_tag_guide", "p_chat_view", new j760[]{vwb.Y("tag_click_status", Integer.valueOf(this.f1397f ? 1 : 0))});
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
        m1779b(this);
        if (ura.e().d().I4()) {
            this.f1394c.setTextColor(getResources().getColor(a1c0.g));
            this.f1395d.setTextColor(getResources().getColor(a1c0.i));
            this.f1396e.setBackgroundResource(c3c0.t);
        }
    }

    public ItemTagGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTagGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
