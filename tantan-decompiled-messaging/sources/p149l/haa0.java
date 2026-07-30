package p149l;

import android.graphics.Color;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class haa0 extends p3l {

    /* JADX INFO: renamed from: f */
    public RoundFrameLayout f106717f;

    /* JADX INFO: renamed from: g */
    public VImage f106718g;

    /* JADX INFO: renamed from: h */
    public VText f106719h;

    /* JADX INFO: renamed from: i */
    public VImage f106720i;

    /* JADX INFO: renamed from: j */
    public VText f106721j;

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        if (user.isMe()) {
            m130096a0(user);
        } else {
            m130095Z(user);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m130083N(View view) {
        iaa0.m135139a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m130084O(String str) {
        if (xma.m210081j4()) {
            CoreModule.m29935P().m94651a().mo33574r6(m167252w(), str, Privilege.ultra_premium_badge, null, null);
        } else {
            m167252w().startActivity(VipAct.m56237b2(m167252w(), khl0.m145975a(SummarizedPrivilegesId.ultraPremium)));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m130085P(User user, final String str, View view) {
        m130094Y(user, new d30() { // from class: l.faa0
            @Override // p149l.d30
            public final void call() {
                this.f96583a.m130084O(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m130086Q(String str) {
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33401Rm(m167252w(), str);
        } else {
            m167252w().startActivity(VipAct.m56237b2(m167252w(), khl0.m145975a("svip")));
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m130087R(User user, final String str, View view) {
        m130094Y(user, new d30() { // from class: l.caa0
            @Override // p149l.d30
            public final void call() {
                this.f80018a.m130086Q(str);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m130088S(User user, String str) {
        if (user.isVIP()) {
            m167252w().startActivity(VipAct.m56236a2(m167252w()));
        } else {
            C8764c.m53400I1(m167252w(), str);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m130089T(User user, final User user2, final String str, View view) {
        m130094Y(user, new d30() { // from class: l.eaa0
            @Override // p149l.d30
            public final void call() {
                this.f90183a.m130088S(user2, str);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m130090U() {
        m167252w().startActivity(VipAct.m56236a2(m167252w()));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m130091V(User user, View view) {
        m130094Y(user, new d30() { // from class: l.gaa0
            @Override // p149l.d30
            public final void call() {
                this.f101658a.m130090U();
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m130092W(String str) {
        C8764c.m53400I1(m167252w(), str);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m130093X(User user, final String str, View view) {
        m130094Y(user, new d30() { // from class: l.daa0
            @Override // p149l.d30
            public final void call() {
                this.f85210a.m130092W(str);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m130094Y(User user, d30 d30Var) {
        o6j0.m162859c("e_vip_banner", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("is_myself", String.valueOf(user.isMe())), o6j0.C18854a.m162878h("banner_privilege_type", ""));
        d30Var.call();
    }

    /* JADX INFO: renamed from: Z */
    public final void m130095Z(final User user) {
        final User userMe_ = CoreModule.m29932K().me_();
        xdl0.m208344M(this.f106720i, true);
        xdl0.m208344M(this.f106721j, false);
        this.f106719h.setText(user.isFemale() ? R$string.f18208Vb : R$string.f18238Wb);
        final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
        if (u59.m191812U() && user.isUltraPremium()) {
            this.f106720i.setImageResource(x2c0.f189188B2);
            this.f106718g.setImageResource(x2c0.f190413o2);
            this.f106717f.setBackgroundColor(Color.parseColor("#F7E6FF"));
            this.f106717f.setOnClickListener(new View.OnClickListener() { // from class: l.z9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202280a.m130085P(user, str, view);
                }
            });
            return;
        }
        if (u59.m191810S() && user.isSVIP()) {
            this.f106720i.setImageResource(x2c0.f190445p2);
            this.f106718g.setImageResource(x2c0.f190477q2);
            this.f106717f.setBackgroundColor(Color.parseColor("#FFE8B1"));
            this.f106717f.setOnClickListener(new View.OnClickListener() { // from class: l.aaa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68284a.m130087R(user, str, view);
                }
            });
            return;
        }
        if (user.isVIP()) {
            this.f106720i.setImageResource(x2c0.f190509r2);
            this.f106718g.setImageResource(x2c0.f190541s2);
            this.f106717f.setBackgroundColor(Color.parseColor("#FFEDA3"));
            this.f106717f.setOnClickListener(new View.OnClickListener() { // from class: l.baa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74664a.m130089T(user, userMe_, str, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m130096a0(final User user) {
        User userMe_ = CoreModule.m29932K().me_();
        xdl0.m208344M(this.f106720i, false);
        xdl0.m208344M(this.f106721j, true);
        this.f106718g.setImageResource(x2c0.f190541s2);
        this.f106717f.setBackgroundColor(Color.parseColor("#FFEDA3"));
        boolean zIsVIP = user.isVIP();
        VText vText = this.f106719h;
        if (zIsVIP) {
            vText.setText(R$string.f17745Fs);
            this.f106717f.setOnClickListener(new View.OnClickListener() { // from class: l.x9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191585a.m130091V(user, view);
                }
            });
        } else {
            vText.setText(userMe_.isVIPExpired() ? R$string.f17775Gs : R$string.f17715Es);
            final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
            this.f106717f.setOnClickListener(new View.OnClickListener() { // from class: l.y9a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196943a.m130093X(user, str, view);
                }
            });
        }
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m130083N(view);
    }
}
