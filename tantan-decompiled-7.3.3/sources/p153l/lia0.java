package p153l;

import android.graphics.Color;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class lia0 extends f6l {

    /* JADX INFO: renamed from: f */
    public RoundFrameLayout f132198f;

    /* JADX INFO: renamed from: g */
    public VImage f132199g;

    /* JADX INFO: renamed from: h */
    public VText f132200h;

    /* JADX INFO: renamed from: i */
    public VImage f132201i;

    /* JADX INFO: renamed from: j */
    public VText f132202j;

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (user.isMe()) {
            m154330a0(user);
        } else {
            m154329Z(user);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m154317N(View view) {
        mia0.m158471a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m154318O(String str) {
        if (joa.m146396k4()) {
            CoreModule.m30933P().m143405a().mo34577r6(m124283w(), str, Privilege.ultra_premium_badge, null, null);
        } else {
            m124283w().startActivity(VipAct.m57420c2(m124283w(), oql0.m168817a(SummarizedPrivilegesId.ultraPremium)));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m154319P(User user, final String str, View view) {
        m154328Y(user, new x20() { // from class: l.jia0
            @Override // p153l.x20
            public final void call() {
                this.f121056a.m154318O(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m154320Q(String str) {
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34404Rm(m124283w(), str);
        } else {
            m124283w().startActivity(VipAct.m57420c2(m124283w(), oql0.m168817a("svip")));
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m154321R(User user, final String str, View view) {
        m154328Y(user, new x20() { // from class: l.gia0
            @Override // p153l.x20
            public final void call() {
                this.f104212a.m154320Q(str);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m154322S(User user, String str) {
        if (user.isVIP()) {
            m124283w().startActivity(VipAct.m57419b2(m124283w()));
        } else {
            C8927c.m54583I1(m124283w(), str);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m154323T(User user, final User user2, final String str, View view) {
        m154328Y(user, new x20() { // from class: l.iia0
            @Override // p153l.x20
            public final void call() {
                this.f115066a.m154322S(user2, str);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m154324U() {
        m124283w().startActivity(VipAct.m57419b2(m124283w()));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m154325V(User user, View view) {
        m154328Y(user, new x20() { // from class: l.kia0
            @Override // p153l.x20
            public final void call() {
                this.f126976a.m154324U();
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m154326W(String str) {
        C8927c.m54583I1(m124283w(), str);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m154327X(User user, final String str, View view) {
        m154328Y(user, new x20() { // from class: l.hia0
            @Override // p153l.x20
            public final void call() {
                this.f110001a.m154326W(str);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m154328Y(User user, x20 x20Var) {
        sfj0.m185596c("e_vip_banner", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("is_myself", String.valueOf(user.isMe())), sfj0.C20032a.m185615h("banner_privilege_type", ""));
        x20Var.call();
    }

    /* JADX INFO: renamed from: Z */
    public final void m154329Z(final User user) {
        final User userMe_ = CoreModule.m30930K().me_();
        bnl0.m105524M(this.f132201i, true);
        bnl0.m105524M(this.f132202j, false);
        this.f132200h.setText(user.isFemale() ? R$string.f19396kc : R$string.f19427lc);
        final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
        if (d79.m114663V() && user.isUltraPremium()) {
            this.f132201i.setImageResource(dbc0.f86043C2);
            this.f132199g.setImageResource(dbc0.f87303p2);
            this.f132198f.setBackgroundColor(Color.parseColor("#F7E6FF"));
            this.f132198f.setOnClickListener(new View.OnClickListener() { // from class: l.dia0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88598a.m154319P(user, str, view);
                }
            });
            return;
        }
        if (d79.m114661T() && user.isSVIP()) {
            this.f132201i.setImageResource(dbc0.f87336q2);
            this.f132199g.setImageResource(dbc0.f87369r2);
            this.f132198f.setBackgroundColor(Color.parseColor("#FFE8B1"));
            this.f132198f.setOnClickListener(new View.OnClickListener() { // from class: l.eia0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94118a.m154321R(user, str, view);
                }
            });
            return;
        }
        if (user.isVIP()) {
            this.f132201i.setImageResource(dbc0.f87402s2);
            this.f132199g.setImageResource(dbc0.f87435t2);
            this.f132198f.setBackgroundColor(Color.parseColor("#FFEDA3"));
            this.f132198f.setOnClickListener(new View.OnClickListener() { // from class: l.fia0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99169a.m154323T(user, userMe_, str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m154330a0(final User user) {
        User userMe_ = CoreModule.m30930K().me_();
        bnl0.m105524M(this.f132201i, false);
        bnl0.m105524M(this.f132202j, true);
        this.f132199g.setImageResource(dbc0.f87435t2);
        this.f132198f.setBackgroundColor(Color.parseColor("#FFEDA3"));
        boolean zIsVIP = user.isVIP();
        VText vText = this.f132200h;
        if (zIsVIP) {
            vText.setText(R$string.f19137bt);
            this.f132198f.setOnClickListener(new View.OnClickListener() { // from class: l.bia0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76849a.m154325V(user, view);
                }
            });
        } else {
            vText.setText(userMe_.isVIPExpired() ? R$string.f19168ct : R$string.f19106at);
            final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
            this.f132198f.setOnClickListener(new View.OnClickListener() { // from class: l.cia0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81917a.m154327X(user, str, view);
                }
            });
        }
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m154317N(view);
    }
}
