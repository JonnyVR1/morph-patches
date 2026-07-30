package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.dg7;
import l.i0g0;
import l.mkd0;
import l.oa8;
import l.vwb;
import l.xaj0;
import l.xdl0;
import l.y4c0;
import l.yd;
import p003l.bpz;
import p003l.e30;
import p003l.eqh0;
import p003l.j000;
import p003l.m250;
import p003l.w9j;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemTickle extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f1414a;

    /* JADX INFO: renamed from: b */
    public VText f1415b;

    /* JADX INFO: renamed from: c */
    public View f1416c;

    public ItemTickle(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public MessagesAct m1825f() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1826g(xaj0 xaj0Var, xaj0 xaj0Var2) {
        this.f1414a.setText(C0107b.m2153g((User) xaj0Var2.a, (ChatGroupMember) xaj0Var2.b, (ChatGroupMember) xaj0Var2.c, (String) xaj0Var.c));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1827h(User user, View view) {
        if (CoreModule.P().i().G1()) {
            if (NullChecker.a(user) && user.isAccountCancellation()) {
                return;
            }
            m1825f().startActivity(MessageProfileSettingAct.m2006Y1(m1825f(), m1825f().f1531f.m4261k4(m1825f().f1531f.m4295r3()), m1825f().f1531f.m4295r3()));
            return;
        }
        Toolbar toolbar = m1825f().toolbar();
        if (toolbar == null) {
            return;
        }
        toolbar.showOverflowMenu();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1828i(Boolean bool) {
        if (bool.booleanValue()) {
            xdl0.M(this.f1415b, false);
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
    /* JADX INFO: renamed from: j */
    public void m1829j(j000 j000Var, Message message, final User user) {
        xdl0.M(this.f1416c, true);
        this.f1415b.setTextColor(getResources().getColor(a1c0.H));
        this.f1414a.setTextColor(getResources().getColor(a1c0.G));
        this.f1415b.setBackgroundColor(0);
        this.f1414a.setBackgroundColor(0);
        if ((((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1) {
            this.f1415b.setBackground(getResources().getDrawable(c3c0.R4));
            this.f1415b.setTextColor(getResources().getColor(a1c0.a0));
            this.f1414a.setBackground(getResources().getDrawable(c3c0.R4));
            this.f1414a.setTextColor(getResources().getColor(a1c0.a0));
        }
        if (TEnum.equals(message.messageType, "tickle")) {
            if (message.isLocal()) {
                xdl0.M(this.f1416c, false);
                return;
            }
            if (TEnum.equals(message.channel, "group")) {
                final xaj0<String, String, String> xaj0VarM2161o = C0107b.m2161o(message);
                if (NullChecker.a(xaj0VarM2161o)) {
                    j000Var.c(m1825f(), CoreModule.c.f0.Ne(message.cid).filter(new oa8()).take(1).map(new w9j() { // from class: l.dhq
                        @Override // p003l.w9j
                        public final Object call(Object obj) {
                            return ((Conversation) obj).otherUser;
                        }
                    }).flatMap(new w9j() { // from class: l.ehq
                        @Override // p003l.w9j
                        public final Object call(Object obj) {
                            xaj0 xaj0Var = xaj0VarM2161o;
                            String str = (String) obj;
                            return mkd0.s(CoreModule.c.e0.Ma((String) xaj0Var.a).filter(new yd()), CoreModule.c.g0.T6(str, (String) xaj0Var.a).filter(new dg7()), CoreModule.c.g0.T6(str, (String) xaj0Var.b).filter(new dg7()), new ihq());
                        }
                    })).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.fhq
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            this.f3622a.m1826g(xaj0VarM2161o, (xaj0) obj);
                        }
                    }));
                } else {
                    this.f1414a.setText("");
                }
            } else {
                this.f1414a.setText(C0107b.m2154h(message));
            }
            boolean zM1830k = m1830k(message);
            xdl0.M(this.f1415b, zM1830k);
            if (zM1830k) {
                CoreModule.c.e0.e1.put(Boolean.TRUE);
                CoreModule.c.e0.f1.put(((DbObject) message).id);
                String string = getContext().getString(R.string.R0);
                String string2 = getContext().getString(R.string.S0);
                this.f1415b.setText(i0g0.b0(string + " " + string2, vwb.M(string2), CoreModule.P().i().G1() ? getResources().getColor(a1c0.D) : Color.parseColor("#006DF7"), eqh0.m3924c(3)));
                xdl0.E0(this.f1415b, new View.OnClickListener() { // from class: l.ghq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f3883a.m1827h(user, view);
                    }
                });
            }
        } else if (TEnum.equals(message.messageType, "local_tickle_tip")) {
            User userPa = CoreModule.c.e0.Pa(message.cid);
            if (userPa != null) {
                this.f1414a.setText(userPa.isFemale() ? R.string.P0 : R.string.Q0);
            }
            xdl0.M(this.f1415b, false);
        } else if (TEnum.equals(message.messageType, "local_create_chat_group")) {
            this.f1414a.setText(R.string.Q2);
            xdl0.M(this.f1415b, false);
        }
        if (xdl0.O0(this.f1415b)) {
            j000Var.c(m1825f(), CoreModule.c.e0.d1.obs().distinctUntilChanged()).subscribe((m250) mkd0.G(new e30() { // from class: l.hhq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4194a.m1828i((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1830k(Message message) {
        if (!CoreModule.P().i().D()) {
            return false;
        }
        if ((CoreModule.P().i().E() && message.isGroupMessage()) || !NullChecker.a(CoreModule.c.e0.p9()) || message.isLocal() || ((DbObject) message).id.startsWith("fake_id_") || ((Boolean) CoreModule.c.e0.d1.get()).booleanValue() || ((Boolean) CoreModule.c.b1.R.get()).booleanValue()) {
            return false;
        }
        return !((Boolean) CoreModule.c.e0.e1.get()).booleanValue() || TextUtils.equals(((DbObject) message).id, (CharSequence) CoreModule.c.e0.f1.get());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1414a = (VText) findViewById(y4c0.E4);
        this.f1415b = (VText) findViewById(y4c0.D4);
        this.f1416c = findViewById(y4c0.C4);
    }

    public ItemTickle(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTickle(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
