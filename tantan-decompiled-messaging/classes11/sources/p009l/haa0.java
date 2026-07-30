package p009l;

import android.graphics.Color;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.data.User;
import l.d30;
import l.e30;
import l.iaa0;
import l.khl0;
import l.o6j0;
import l.u59;
import l.x2c0;
import l.xdl0;
import l.xma;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class haa0 extends p3l {

    /* JADX INFO: renamed from: f */
    public RoundFrameLayout f13919f;

    /* JADX INFO: renamed from: g */
    public VImage f13920g;

    /* JADX INFO: renamed from: h */
    public VText f13921h;

    /* JADX INFO: renamed from: i */
    public VImage f13922i;

    /* JADX INFO: renamed from: j */
    public VText f13923j;

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (user.isMe()) {
            m15456a0(user);
        } else {
            m15455Z(user);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m15443N(View view) {
        iaa0.a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m15444O(String str) {
        if (xma.j4()) {
            CoreModule.P().a().r6(m20098w(), str, Privilege.ultra_premium_badge, (e30) null, (d30) null);
        } else {
            m20098w().startActivity(VipAct.b2(m20098w(), khl0.a("ultraPremium")));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m15445P(User user, final String str, View view) {
        m15454Y(user, new d30() { // from class: l.faa0
            public final void call() {
                this.f12886a.m15444O(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m15446Q(String str) {
        if (xma.e4()) {
            CoreModule.P().a().Rm(m20098w(), str);
        } else {
            m20098w().startActivity(VipAct.b2(m20098w(), khl0.a("svip")));
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m15447R(User user, final String str, View view) {
        m15454Y(user, new d30() { // from class: l.caa0
            public final void call() {
                this.f10483a.m15446Q(str);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m15448S(User user, String str) {
        if (user.isVIP()) {
            m20098w().startActivity(VipAct.a2(m20098w()));
        } else {
            c.I1(m20098w(), str);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m15449T(User user, final User user2, final String str, View view) {
        m15454Y(user, new d30() { // from class: l.eaa0
            public final void call() {
                this.f12469a.m15448S(user2, str);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m15450U() {
        m20098w().startActivity(VipAct.a2(m20098w()));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m15451V(User user, View view) {
        m15454Y(user, new d30() { // from class: l.gaa0
            public final void call() {
                this.f13391a.m15450U();
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m15452W(String str) {
        c.I1(m20098w(), str);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m15453X(User user, final String str, View view) {
        m15454Y(user, new d30() { // from class: l.daa0
            public final void call() {
                this.f11699a.m15452W(str);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m15454Y(User user, d30 d30Var) {
        o6j0.c("e_vip_banner", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("is_myself", String.valueOf(user.isMe())), o6j0.a.h("banner_privilege_type", "")});
        d30Var.call();
    }

    /* JADX INFO: renamed from: Z */
    public final void m15455Z(final User user) {
        final User userMe_ = CoreModule.K().me_();
        xdl0.M(this.f13922i, true);
        xdl0.M(this.f13923j, false);
        this.f13921h.setText(user.isFemale() ? R.string.Vb : R.string.Wb);
        final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
        if (u59.U() && user.isUltraPremium()) {
            this.f13922i.setImageResource(x2c0.B2);
            this.f13920g.setImageResource(x2c0.o2);
            this.f13919f.setBackgroundColor(Color.parseColor("#F7E6FF"));
            this.f13919f.setOnClickListener(new View.OnClickListener() { // from class: l.z9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23525a.m15445P(user, str, view);
                }
            });
            return;
        }
        if (u59.S() && user.isSVIP()) {
            this.f13922i.setImageResource(x2c0.p2);
            this.f13920g.setImageResource(x2c0.q2);
            this.f13919f.setBackgroundColor(Color.parseColor("#FFE8B1"));
            this.f13919f.setOnClickListener(new View.OnClickListener() { // from class: l.aaa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9348a.m15447R(user, str, view);
                }
            });
            return;
        }
        if (user.isVIP()) {
            this.f13922i.setImageResource(x2c0.r2);
            this.f13920g.setImageResource(x2c0.s2);
            this.f13919f.setBackgroundColor(Color.parseColor("#FFEDA3"));
            this.f13919f.setOnClickListener(new View.OnClickListener() { // from class: l.baa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9980a.m15449T(user, userMe_, str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15456a0(final User user) {
        User userMe_ = CoreModule.K().me_();
        xdl0.M(this.f13922i, false);
        xdl0.M(this.f13923j, true);
        this.f13920g.setImageResource(x2c0.s2);
        this.f13919f.setBackgroundColor(Color.parseColor("#FFEDA3"));
        boolean zIsVIP = user.isVIP();
        VText vText = this.f13921h;
        if (zIsVIP) {
            vText.setText(R.string.Fs);
            this.f13919f.setOnClickListener(new View.OnClickListener() { // from class: l.x9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22479a.m15451V(user, view);
                }
            });
        } else {
            vText.setText(userMe_.isVIPExpired() ? R.string.Gs : R.string.Es);
            final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
            this.f13919f.setOnClickListener(new View.OnClickListener() { // from class: l.y9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22939a.m15453X(user, str, view);
                }
            });
        }
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m15443N(view);
    }
}
