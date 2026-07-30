package p003l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.C0107b;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.lsi0;
import l.mqi0;
import l.o7r;
import l.q860;
import l.qib0;
import l.soy;
import l.utl;
import l.xdl0;
import p028v.VDraweeView;
import p028v.VProgressBar;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class roy implements u4z<User, bpz> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7006a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f7007b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f7008c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f7009d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f7010e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f7011f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7012g;

    /* JADX INFO: renamed from: h */
    public VText f7013h;

    /* JADX INFO: renamed from: i */
    public VText f7014i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f7015j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f7016k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f7017l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f7018m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f7019n;

    /* JADX INFO: renamed from: o */
    public VText f7020o;

    /* JADX INFO: renamed from: p */
    public VText f7021p;

    /* JADX INFO: renamed from: q */
    public View f7022q;

    /* JADX INFO: renamed from: r */
    public fcz<User, bpz> f7023r;

    /* JADX INFO: renamed from: s */
    public MessagesAct f7024s;

    /* JADX INFO: renamed from: t */
    public utl f7025t;

    /* JADX INFO: renamed from: u */
    public User f7026u;

    /* JADX INFO: renamed from: l.roy$a */
    public class C0511a implements C0107b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f7027a;

        public C0511a(fcz fczVar) {
            this.f7027a = fczVar;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: a */
        public String mo1506a() {
            return this.f7027a.m4295r3();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: b */
        public String mo1507b() {
            return this.f7027a.m4295r3();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.C0107b.c
        /* JADX INFO: renamed from: c */
        public boolean mo1508c() {
            return CoreModule.P().i().D() && !User.isTeamAccount(this.f7027a.m4295r3());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.u4z
    /* JADX INFO: renamed from: b */
    public void mo4918b(MessagesAct messagesAct, utl utlVar, fcz<User, bpz> fczVar) {
        this.f7023r = fczVar;
        this.f7024s = messagesAct;
        this.f7025t = utlVar;
        this.f7022q = m7355o(o7r.a(messagesAct), utlVar.getRealView());
        this.f7017l.setOnClickListener(new View.OnClickListener() { // from class: l.ooy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6189a.m7357q(view);
            }
        });
        if (CoreModule.P().i().D() && !User.isTeamAccount(fczVar.m4295r3())) {
            C0107b.m2164r(this.f7016k, new C0511a(fczVar), new View.OnClickListener() { // from class: l.poy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6472a.m7358r(view);
                }
            });
        }
        xdl0.E0(this.f7016k, new View.OnClickListener() { // from class: l.qoy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6660a.m7359s(view);
            }
        });
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: g */
    public View mo4919g() {
        return this.f7022q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0096  */
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
    @Override // p003l.u4z
    /* JADX INFO: renamed from: k */
    public void mo4920k() {
        this.f7026u = this.f7023r.m4290q3();
        this.f7012g.setVisibility(0);
        this.f7013h.setTypeface(eqh0.m3924c(2));
        this.f7013h.setTextColor(Color.parseColor("#999999"));
        this.f7014i.setTextColor(Color.parseColor("#999999"));
        this.f7012g.setBackground(this.f7024s.getDrawable(c3c0.Q4));
        if (((bpz) this.f7023r.m6497e0().mo2066l().m4309t7()).f2427M1) {
            this.f7012g.setBackground(this.f7024s.getDrawable(c3c0.R4));
            this.f7013h.setTextColor(Color.parseColor("#222222"));
            this.f7014i.setTextColor(Color.parseColor("#222222"));
        }
        AppCompatTextView appCompatTextView = this.f7020o;
        appCompatTextView.setTypeface(appCompatTextView.getTypeface(), 1);
        if (NullChecker.a(this.f7026u)) {
            User user = this.f7026u;
            if (user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                qib0.G.Y0(this.f7019n, c3c0.k1);
                qib0.G.Y0(this.f7016k, c3c0.k1);
                m7360t(this.f7026u);
                this.f7023r.m6497e0().mo2051E().x0(this.f7026u);
            }
        } else {
            qib0.G.Y0(this.f7019n, c3c0.k1);
            qib0.G.Y0(this.f7016k, c3c0.k1);
            m7360t(this.f7026u);
            this.f7023r.m6497e0().mo2051E().x0(this.f7026u);
        }
        Conversation conversationM4255j3 = this.f7023r.m4255j3();
        boolean zA = NullChecker.a(conversationM4255j3);
        AppCompatTextView appCompatTextView2 = this.f7013h;
        if (zA) {
            appCompatTextView2.setText(mqi0.G(conversationM4255j3.createdTime));
        } else {
            appCompatTextView2.setText(mqi0.G(qib0.H.guessedCurrentServerTime()));
        }
        if (NullChecker.a(conversationM4255j3) && CoreModule.P().i().x() && TEnum.equals(conversationM4255j3.status, "dismissed") && NullChecker.a(this.f7026u)) {
            this.f7021p.setVisibility(0);
            this.f7021p.setText(this.f7026u.isFemale() ? R.string.t2 : R.string.s2);
        }
    }

    /* JADX INFO: renamed from: o */
    public View m7355o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return soy.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public final void m7356p() {
        if (NullChecker.a(this.f7026u)) {
            User user = this.f7026u;
            if (!user.inactivated) {
                if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                    lsi0.j("对方账号异常");
                    return;
                }
                return;
            }
        }
        lsi0.j("对方已注销");
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m7357q(View view) {
        m7356p();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m7358r(View view) {
        m7356p();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m7359s(View view) {
        m7356p();
    }

    /* JADX INFO: renamed from: t */
    public final void m7360t(User user) {
        CharSequence charSequenceY7 = CoreModule.c.e0.y7(((DbObject) user).id);
        if (!TextUtils.isEmpty(charSequenceY7)) {
            this.f7020o.setText(charSequenceY7);
            return;
        }
        if (!NullChecker.a(user) || user.inactivated) {
            this.f7020o.setText("已注销");
        } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
            this.f7020o.setText("昵称已重置");
        }
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: e */
    public void mo7352e() {
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: j */
    public void mo7354j() {
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: h */
    public void mo7353h(q860<Message> q860Var) {
    }
}
