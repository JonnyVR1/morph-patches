package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oxy implements rdz<User, yxz> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f149700a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f149701b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f149702c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f149703d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f149704e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f149705f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f149706g;

    /* JADX INFO: renamed from: h */
    public VText f149707h;

    /* JADX INFO: renamed from: i */
    public VText f149708i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f149709j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f149710k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f149711l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f149712m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f149713n;

    /* JADX INFO: renamed from: o */
    public VText f149714o;

    /* JADX INFO: renamed from: p */
    public VText f149715p;

    /* JADX INFO: renamed from: q */
    public View f149716q;

    /* JADX INFO: renamed from: r */
    public clz<User, yxz> f149717r;

    /* JADX INFO: renamed from: s */
    public MessagesAct f149718s;

    /* JADX INFO: renamed from: t */
    public iwl f149719t;

    /* JADX INFO: renamed from: u */
    public User f149720u;

    /* JADX INFO: renamed from: l.oxy$a */
    public class C19241a implements C8687b.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ clz f149721a;

        public C19241a(clz clzVar) {
            this.f149721a = clzVar;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: a */
        public String mo49605a() {
            return this.f149721a.mo111034r3();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: b */
        public String mo49606b() {
            return this.f149721a.mo111034r3();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.C8687b.c
        /* JADX INFO: renamed from: c */
        public boolean mo49607c() {
            return CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(this.f149721a.mo111034r3());
        }
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: b */
    public void mo120537b(MessagesAct messagesAct, iwl iwlVar, clz<User, yxz> clzVar) {
        this.f149717r = clzVar;
        this.f149718s = messagesAct;
        this.f149719t = iwlVar;
        this.f149716q = m169753o(p9r.m171370a(messagesAct), iwlVar.getRealView());
        this.f149711l.setOnClickListener(new View.OnClickListener() { // from class: l.lxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134019a.m169755q(view);
            }
        });
        if (CoreModule.m30933P().m143412i().mo180308D() && !User.isTeamAccount(clzVar.mo111034r3())) {
            C8687b.m50249r(this.f149710k, new C19241a(clzVar), new View.OnClickListener() { // from class: l.mxy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139302a.m169756r(view);
                }
            });
        }
        bnl0.m105509E0(this.f149710k, new View.OnClickListener() { // from class: l.nxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144278a.m169757s(view);
            }
        });
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: g */
    public View mo120538g() {
        return this.f149716q;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0096  */
    @Override // p153l.rdz
    /* JADX INFO: renamed from: k */
    public void mo120539k() {
        this.f149720u = this.f149717r.m111029q3();
        this.f149706g.setVisibility(0);
        this.f149707h.setTypeface(lyh0.m156283c(2));
        this.f149707h.setTextColor(Color.parseColor("#999999"));
        this.f149708i.setTextColor(Color.parseColor("#999999"));
        this.f149706g.setBackground(this.f149718s.getDrawable(ibc0.f113891Q4));
        if (((yxz) this.f149717r.m143372e0().mo50158l().m111048t7()).f202025M1) {
            this.f149706g.setBackground(this.f149718s.getDrawable(ibc0.f113900R4));
            this.f149707h.setTextColor(Color.parseColor("#222222"));
            this.f149708i.setTextColor(Color.parseColor("#222222"));
        }
        VText vText = this.f149714o;
        vText.setTypeface(vText.getTypeface(), 1);
        if (NullChecker.m82486a(this.f149720u)) {
            User user = this.f149720u;
            if (user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                uqb0.f180374G.m127138Y0(this.f149713n, ibc0.f114059k1);
                uqb0.f180374G.m127138Y0(this.f149710k, ibc0.f114059k1);
                m169758t(this.f149720u);
                this.f149717r.m143372e0().mo50143F().mo127924x0(this.f149720u);
            }
        } else {
            uqb0.f180374G.m127138Y0(this.f149713n, ibc0.f114059k1);
            uqb0.f180374G.m127138Y0(this.f149710k, ibc0.f114059k1);
            m169758t(this.f149720u);
            this.f149717r.m143372e0().mo50143F().mo127924x0(this.f149720u);
        }
        Conversation conversationM110994j3 = this.f149717r.m110994j3();
        boolean zM82486a = NullChecker.m82486a(conversationM110994j3);
        VText vText2 = this.f149707h;
        if (zM82486a) {
            vText2.setText(pzi0.m174442G(conversationM110994j3.createdTime));
        } else {
            vText2.setText(pzi0.m174442G(uqb0.f180376H.guessedCurrentServerTime()));
        }
        if (NullChecker.m82486a(conversationM110994j3) && CoreModule.m30933P().m143412i().mo180557x() && TEnum.equals(conversationM110994j3.status, "dismissed") && NullChecker.m82486a(this.f149720u)) {
            this.f149715p.setVisibility(0);
            this.f149715p.setText(this.f149720u.isFemale() ? R$string.f21829t2 : R$string.f21821s2);
        }
    }

    /* JADX INFO: renamed from: o */
    public View m169753o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pxy.m174256b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public final void m169754p() {
        if (NullChecker.m82486a(this.f149720u)) {
            User user = this.f149720u;
            if (!user.inactivated) {
                if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    o1j0.m165636j("对方账号异常");
                    return;
                }
                return;
            }
        }
        o1j0.m165636j("对方已注销");
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m169755q(View view) {
        m169754p();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m169756r(View view) {
        m169754p();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m169757s(View view) {
        m169754p();
    }

    /* JADX INFO: renamed from: t */
    public final void m169758t(User user) {
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            this.f149714o.setText(strM116634y7);
            return;
        }
        if (!NullChecker.m82486a(user) || user.inactivated) {
            this.f149714o.setText("已注销");
        } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
            this.f149714o.setText("昵称已重置");
        }
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: e */
    public void mo169750e() {
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: j */
    public void mo169752j() {
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: h */
    public void mo169751h(vg60<Message> vg60Var) {
    }
}
