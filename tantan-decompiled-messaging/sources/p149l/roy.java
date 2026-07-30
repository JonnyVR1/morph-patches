package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class roy implements u4z<User, bpz> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f160434a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f160435b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f160436c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f160437d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f160438e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f160439f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f160440g;

    /* JADX INFO: renamed from: h */
    public VText f160441h;

    /* JADX INFO: renamed from: i */
    public VText f160442i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f160443j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f160444k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f160445l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f160446m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f160447n;

    /* JADX INFO: renamed from: o */
    public VText f160448o;

    /* JADX INFO: renamed from: p */
    public VText f160449p;

    /* JADX INFO: renamed from: q */
    public View f160450q;

    /* JADX INFO: renamed from: r */
    public fcz<User, bpz> f160451r;

    /* JADX INFO: renamed from: s */
    public MessagesAct f160452s;

    /* JADX INFO: renamed from: t */
    public utl f160453t;

    /* JADX INFO: renamed from: u */
    public User f160454u;

    /* JADX INFO: renamed from: l.roy$a */
    public class C19745a implements C8524b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fcz f160455a;

        public C19745a(fcz fczVar) {
            this.f160455a = fczVar;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: a */
        public String mo48422a() {
            return this.f160455a.mo120828r3();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: b */
        public String mo48423b() {
            return this.f160455a.mo120828r3();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.C8524b.c
        /* JADX INFO: renamed from: c */
        public boolean mo48424c() {
            return CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(this.f160455a.mo120828r3());
        }
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: b */
    public void mo129344b(MessagesAct messagesAct, utl utlVar, fcz<User, bpz> fczVar) {
        this.f160451r = fczVar;
        this.f160452s = messagesAct;
        this.f160453t = utlVar;
        this.f160450q = m180270o(o7r.m163037a(messagesAct), utlVar.getRealView());
        this.f160445l.setOnClickListener(new View.OnClickListener() { // from class: l.ooy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144929a.m180272q(view);
            }
        });
        if (CoreModule.m29935P().m94658i().mo158216D() && !User.isTeamAccount(fczVar.mo120828r3())) {
            C8524b.m49066r(this.f160444k, new C19745a(fczVar), new View.OnClickListener() { // from class: l.poy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150570a.m180273r(view);
                }
            });
        }
        xdl0.m208329E0(this.f160444k, new View.OnClickListener() { // from class: l.qoy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155647a.m180274s(view);
            }
        });
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: g */
    public View mo129345g() {
        return this.f160450q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0096  */
    @Override // p149l.u4z
    /* JADX INFO: renamed from: k */
    public void mo129346k() {
        this.f160454u = this.f160451r.m120823q3();
        this.f160440g.setVisibility(0);
        this.f160441h.setTypeface(eqh0.m117752c(2));
        this.f160441h.setTextColor(Color.parseColor("#999999"));
        this.f160442i.setTextColor(Color.parseColor("#999999"));
        this.f160440g.setBackground(this.f160452s.getDrawable(c3c0.f78616Q4));
        if (((bpz) this.f160451r.m156455e0().mo48974l().m120842t7()).f76692M1) {
            this.f160440g.setBackground(this.f160452s.getDrawable(c3c0.f78625R4));
            this.f160441h.setTextColor(Color.parseColor("#222222"));
            this.f160442i.setTextColor(Color.parseColor("#222222"));
        }
        VText vText = this.f160448o;
        vText.setTypeface(vText.getTypeface(), 1);
        if (NullChecker.m81303a(this.f160454u)) {
            User user = this.f160454u;
            if (user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                qib0.f154691G.m102354Y0(this.f160447n, c3c0.f78784k1);
                qib0.f154691G.m102354Y0(this.f160444k, c3c0.f78784k1);
                m180275t(this.f160454u);
                this.f160451r.m156455e0().mo48959E().mo137249x0(this.f160454u);
            }
        } else {
            qib0.f154691G.m102354Y0(this.f160447n, c3c0.f78784k1);
            qib0.f154691G.m102354Y0(this.f160444k, c3c0.f78784k1);
            m180275t(this.f160454u);
            this.f160451r.m156455e0().mo48959E().mo137249x0(this.f160454u);
        }
        Conversation conversationM120788j3 = this.f160451r.m120788j3();
        boolean zM81303a = NullChecker.m81303a(conversationM120788j3);
        VText vText2 = this.f160441h;
        if (zM81303a) {
            vText2.setText(mqi0.m155932G(conversationM120788j3.createdTime));
        } else {
            vText2.setText(mqi0.m155932G(qib0.f154693H.guessedCurrentServerTime()));
        }
        if (NullChecker.m81303a(conversationM120788j3) && CoreModule.m29935P().m94658i().mo158465x() && TEnum.equals(conversationM120788j3.status, "dismissed") && NullChecker.m81303a(this.f160454u)) {
            this.f160449p.setVisibility(0);
            this.f160449p.setText(this.f160454u.isFemale() ? R$string.f21087t2 : R$string.f21079s2);
        }
    }

    /* JADX INFO: renamed from: o */
    public View m180270o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return soy.m185310b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public final void m180271p() {
        if (NullChecker.m81303a(this.f160454u)) {
            User user = this.f160454u;
            if (!user.inactivated) {
                if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    lsi0.m151580j("对方账号异常");
                    return;
                }
                return;
            }
        }
        lsi0.m151580j("对方已注销");
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m180272q(View view) {
        m180271p();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m180273r(View view) {
        m180271p();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m180274s(View view) {
        m180271p();
    }

    /* JADX INFO: renamed from: t */
    public final void m180275t(User user) {
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            this.f160448o.setText(strM169561y7);
            return;
        }
        if (!NullChecker.m81303a(user) || user.inactivated) {
            this.f160448o.setText("已注销");
        } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
            this.f160448o.setText("昵称已重置");
        }
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: e */
    public void mo180267e() {
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: j */
    public void mo180269j() {
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: h */
    public void mo180268h(q860<Message> q860Var) {
    }
}
