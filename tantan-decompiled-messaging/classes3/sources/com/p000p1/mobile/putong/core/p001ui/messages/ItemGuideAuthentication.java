package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.a1c0;
import l.c3c0;
import l.j760;
import l.k4q;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.roj0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.e30;
import p003l.j000;
import p003l.m250;
import p003l.qsz;
import p028v.VImage;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemGuideAuthentication extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ItemGuideAuthentication f871a;

    /* JADX INFO: renamed from: b */
    public VLinear f872b;

    /* JADX INFO: renamed from: c */
    public VImage f873c;

    /* JADX INFO: renamed from: d */
    public VText f874d;

    /* JADX INFO: renamed from: e */
    public VText f875e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f876f;

    /* JADX INFO: renamed from: g */
    public VText f877g;

    /* JADX INFO: renamed from: h */
    public boolean f878h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a */
    public class ViewOnClickListenerC0072a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f880b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f881c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ j000 f882d;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a$a */
        public class a implements e30<roj0> {
            public a() {
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
            @Override // p003l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(roj0 roj0Var) {
                ConversationCounterTypeSp.InviationForAuthenticationTime.setLong(((DbObject) ViewOnClickListenerC0072a.this.f879a).id, mqi0.o());
                ItemGuideAuthentication.this.f877g.setTextColor(Color.parseColor("#33000000"));
                ItemGuideAuthentication.this.f877g.setText("邀请已发送");
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemGuideAuthentication$a$b */
        public class b implements e30<Throwable> {
            public b() {
            }

            @Override // p003l.e30
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Throwable th) {
            }
        }

        public ViewOnClickListenerC0072a(User user, User user2, String str, j000 j000Var) {
            this.f879a = user;
            this.f880b = user2;
            this.f881c = str;
            this.f882d = j000Var;
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
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CoreModule.c.e0.Aa(this.f879a)) {
                osi0.g("对方已与你解除配对");
                return;
            }
            zvf0.u("e_ask_to_invite_other_verify", "p_chat_view", new j760[]{vwb.Y("userid", ((DbObject) this.f880b).id), vwb.Y("moments_user_id", ((DbObject) this.f879a).id), vwb.Y("invite_to_verify_button_status", this.f881c)});
            long j = ConversationCounterTypeSp.InviationForAuthenticationTime.getLong(((DbObject) this.f879a).id);
            if (j <= 0 || mqi0.o() - j >= 259200000) {
                this.f882d.c(ItemGuideAuthentication.this.m1269b(), CoreModule.c.f0.th(((DbObject) this.f879a).id)).subscribe((m250) mkd0.H(new a(), new b()));
            } else {
                ItemGuideAuthentication.this.f877g.setTextColor(Color.parseColor("#33000000"));
                ItemGuideAuthentication.this.f877g.setText("邀请已发送");
            }
        }
    }

    public ItemGuideAuthentication(Context context) {
        super(context);
        this.f878h = false;
    }

    /* JADX INFO: renamed from: d */
    public static void m1267d(qsz qszVar, User user, User user2, String str) {
        if (qszVar.m7030a("ITEM_GUIDE_AUTHENTICATION" + ((DbObject) user2).id + ((DbObject) user).id + str)) {
            return;
        }
        qszVar.m7031b("ITEM_GUIDE_AUTHENTICATION" + ((DbObject) user2).id + ((DbObject) user).id + str);
        zvf0.A("e_ask_to_invite_other_verify", "p_chat_view", new j760[]{vwb.Y("userid", ((DbObject) user2).id), vwb.Y("moments_user_id", ((DbObject) user).id), vwb.Y("invite_to_verify_button_status", str)});
    }

    /* JADX INFO: renamed from: a */
    public final void m1268a(View view) {
        k4q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public MessagesAct m1269b() {
        return (MessagesAct) getContext();
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
    /* JADX INFO: renamed from: c */
    public void m1270c(User user, Message message, j000 j000Var, qsz qszVar) {
        User user2;
        String str;
        if (user == null || qszVar == null || !TEnum.equals(message.messageType, "local_invitation_for_authentication")) {
            return;
        }
        User userP9 = CoreModule.c.e0.p9();
        this.f874d.setText("让相处更安心");
        this.f875e.setText(String.format("对方暂未完成认证，可以邀请%s完成真人认证，让聊天更安心", user.getPronoun()));
        if (!user.isPicVerificationVerified()) {
            long j = ConversationCounterTypeSp.InviationForAuthenticationTime.getLong(((DbObject) user).id);
            if (j <= 0 || mqi0.o() - j >= 259200000) {
                this.f877g.setTextColor(Color.parseColor("#FE7E1D"));
                this.f877g.setText(String.format("邀请%s去认证", user.getPronoun()));
                user2 = user;
                xdl0.E0(this.f877g, new ViewOnClickListenerC0072a(user2, userP9, "able_to_invite", j000Var));
                str = "able_to_invite";
            } else {
                this.f877g.setTextColor(Color.parseColor("#33000000"));
                this.f877g.setText("邀请已发送");
                str = "sent_invitation";
            }
            m1267d(qszVar, user2, userP9, str);
        }
        this.f877g.setTextColor(Color.parseColor("#33000000"));
        this.f877g.setText(String.format("%s已完成认证", user.getPronoun()));
        str = "done_verification";
        user2 = user;
        m1267d(qszVar, user2, userP9, str);
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
        m1268a(this);
        if (ura.e().d().I4()) {
            xdl0.N(this.f873c, c3c0.p2);
            this.f874d.setTextColor(getResources().getColor(a1c0.g));
            this.f875e.setTextColor(getResources().getColor(a1c0.i));
            this.f877g.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemGuideAuthentication(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f878h = false;
    }

    public ItemGuideAuthentication(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f878h = false;
    }
}
