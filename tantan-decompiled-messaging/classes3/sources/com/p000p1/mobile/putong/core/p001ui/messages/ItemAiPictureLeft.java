package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.knb0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.vwb;
import l.x0q;
import l.xdl0;
import l.zvf0;
import p003l.dml;
import p003l.e30;
import p003l.eqh0;
import p003l.m250;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAiPictureLeft extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemAiPictureLeft f667a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f668b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f669c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f670d;

    /* JADX INFO: renamed from: e */
    public VText f671e;

    /* JADX INFO: renamed from: f */
    public VText f672f;

    /* JADX INFO: renamed from: g */
    public VText f673g;

    /* JADX INFO: renamed from: h */
    public Message f674h;

    /* JADX INFO: renamed from: i */
    public boolean f675i;

    public ItemAiPictureLeft(Context context) {
        super(context);
        this.f675i = false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        Message message = this.f674h;
        return (message == null || vwb.J(message.media)) ? new ArrayList() : CoreModule.P().i().M5(getContext(), (Media) this.f674h.media.get(0), this.f674h);
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
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(final dml dmlVar, final Message message, InterfaceC0102a.a aVar) {
        if (message == null) {
            return;
        }
        this.f671e.setTypeface(eqh0.m3924c(3), 0);
        this.f673g.setTypeface(eqh0.m3924c(3), 0);
        this.f672f.setTypeface(eqh0.m3924c(3), 0);
        this.f674h = message;
        if (vwb.J(message.media)) {
            return;
        }
        final Media media = (Media) message.media.get(0);
        if (TEnum.equals(media.status, "raw")) {
            qib0.G.o(this.f669c);
        } else {
            qib0.G.L0(this.f669c, ((Media) media.cover()).url);
        }
        this.f674h = message;
        String str = "0";
        if (NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.aiPicture)) {
            String str2 = message.additionalData.aiPicture.likeStatus;
            if (TextUtils.equals(str2, "like")) {
                this.f673g.setTextColor(Color.parseColor("#33000000"));
                xdl0.H0(this.f673g, "已喜欢");
                xdl0.M(this.f673g, true);
                xdl0.M(this.f672f, false);
                str = "yes";
            } else if (TextUtils.equals(str2, "dislike")) {
                this.f672f.setTextColor(Color.parseColor("#33000000"));
                xdl0.M(this.f673g, false);
                xdl0.M(this.f672f, true);
                str = "no";
            } else {
                this.f673g.setTextColor(Color.parseColor("#CC000000"));
                this.f672f.setTextColor(Color.parseColor("#CC000000"));
                xdl0.H0(this.f673g, "喜欢");
                xdl0.M(this.f673g, true);
                xdl0.M(this.f672f, true);
            }
        } else {
            this.f673g.setTextColor(Color.parseColor("#CC000000"));
            this.f672f.setTextColor(Color.parseColor("#CC000000"));
            xdl0.H0(this.f673g, "喜欢");
            xdl0.M(this.f673g, true);
            xdl0.M(this.f672f, true);
        }
        xdl0.E0(this.f669c, new View.OnClickListener() { // from class: l.p0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6297a.m1080l(message, media, view);
            }
        });
        xdl0.E0(this.f673g, new View.OnClickListener() { // from class: l.q0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6566a.m1082o(message, dmlVar, view);
            }
        });
        xdl0.E0(this.f672f, new View.OnClickListener() { // from class: l.r0q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6755a.m1084q(message, dmlVar, view);
            }
        });
        this.f669c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.s0q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f7123a.m1085r(view);
            }
        });
        if (this.f675i) {
            return;
        }
        this.f675i = true;
        zvf0.A("e_paip_ai_picture_feedback", "p_chat_view", new j760[]{vwb.Y("other_uid", message.cid), vwb.Y("paip_ai_picture_feedback", str)});
    }

    /* JADX INFO: renamed from: i */
    public final void m1077i(View view) {
        x0q.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1078j() {
        User userPa;
        Message message = this.f674h;
        if (message == null || (userPa = CoreModule.c.e0.Pa(message.cid)) == null) {
            return true;
        }
        Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) userPa).id);
        if (conversationZp != null && !TEnum.equals(conversationZp.status, "dismissed")) {
            return false;
        }
        osi0.g("已解除配对，无法查看");
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m1079k() {
        this.f670d.setIndeterminate(false);
        xdl0.M(this.f670d, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m1080l(Message message, Media media, View view) {
        CoreModule.P().a().J4(getContext(), message, media);
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
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1081n(roj0 roj0Var) {
        this.f673g.setTextColor(Color.parseColor("#33000000"));
        xdl0.M(this.f673g, true);
        xdl0.M(this.f672f, false);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m1082o(Message message, dml dmlVar, View view) {
        if ((NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.aiPicture) && TextUtils.equals(message.additionalData.aiPicture.likeStatus, "like")) || m1078j()) {
            return;
        }
        dmlVar.mo3522c(getContext(), CoreModule.c.f0.to(message, "like")).subscribe((m250) mkd0.H(new e30() { // from class: l.v0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8148a.m1081n((roj0) obj);
            }
        }, new e30() { // from class: l.w0q
            @Override // p003l.e30
            public final void call(Object obj) {
                osi0.g("网络异常！");
            }
        }));
        zvf0.r("e_paip_ai_picture_feedback", "p_chat_view");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1077i(this);
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
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1083p(roj0 roj0Var) {
        this.f672f.setTextColor(Color.parseColor("#33000000"));
        xdl0.M(this.f673g, false);
        xdl0.M(this.f672f, true);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1084q(Message message, dml dmlVar, View view) {
        if ((NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.aiPicture) && TextUtils.equals(message.additionalData.aiPicture.likeStatus, "dislike")) || m1078j()) {
            return;
        }
        dmlVar.mo3522c(getContext(), CoreModule.c.f0.to(message, "dislike")).subscribe((m250) mkd0.H(new e30() { // from class: l.t0q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7391a.m1083p((roj0) obj);
            }
        }, new e30() { // from class: l.u0q
            @Override // p003l.e30
            public final void call(Object obj) {
                osi0.g("网络异常！");
            }
        }));
        zvf0.r("e_paip_ai_picture_feedback", "p_chat_view");
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ boolean m1085r(View view) {
        ItemMessageBase.m1395R(this).onLongClick(this.f669c);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m1086s() {
        this.f670d.setIndeterminate(true);
        xdl0.M(this.f670d, true);
    }

    public ItemAiPictureLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f675i = false;
    }

    public ItemAiPictureLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f675i = false;
    }
}
