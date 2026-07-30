package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d4b0 extends bo90 {

    /* JADX INFO: renamed from: A */
    public VImage f85019A;

    /* JADX INFO: renamed from: B */
    public VText f85020B;

    /* JADX INFO: renamed from: C */
    public VText f85021C;

    /* JADX INFO: renamed from: v */
    public VLinear f85022v;

    /* JADX INFO: renamed from: w */
    public VImage f85023w;

    /* JADX INFO: renamed from: x */
    public VText f85024x;

    /* JADX INFO: renamed from: y */
    public VImage f85025y;

    /* JADX INFO: renamed from: z */
    public VLinear f85026z;

    public d4b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: A0 */
    private Act m114113A0() {
        return mo53983O().act();
    }

    /* JADX INFO: renamed from: B0 */
    public final int m114142B0(User user) {
        if (user == null) {
            return 0;
        }
        if (user.isUltraPremium()) {
            return 3;
        }
        if (user.isSVIP()) {
            return 2;
        }
        return user.isVIP() ? 1 : 0;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m114143C0() {
        mo53983O().act().startActivity(VipAct.m57420c2(mo53983O().act(), oql0.m168817a("svip")));
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m114144D0(View view) {
        m114171e1(new x20() { // from class: l.j3b0
            @Override // p153l.x20
            public final void call() {
                this.f118173a.m114143C0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m114145E0() {
        mo53983O().act().startActivity(VipAct.m57420c2(mo53983O().act(), oql0.m168817a("vip")));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m114146F0(View view) {
        m114171e1(new x20() { // from class: l.p3b0
            @Override // p153l.x20
            public final void call() {
                this.f150398a.m114145E0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m114147G0(String str) {
        CoreModule.m30933P().m143405a().mo34577r6(m114113A0(), str, Privilege.ultra_premium_badge, null, null);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m114148H0(final String str, View view) {
        m114171e1(new x20() { // from class: l.u3b0
            @Override // p153l.x20
            public final void call() {
                this.f177328a.m114147G0(str);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m114149I0(String str) {
        CoreModule.m30933P().m143405a().mo34404Rm(m114113A0(), str);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m114150J0(final String str, View view) {
        m114171e1(new x20() { // from class: l.h3b0
            @Override // p153l.x20
            public final void call() {
                this.f107634a.m114149I0(str);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m114151K0(String str) {
        C8927c.m54583I1(m114113A0(), str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m114152L0(final String str, View view) {
        m114171e1(new x20() { // from class: l.s3b0
            @Override // p153l.x20
            public final void call() {
                this.f165989a.m114151K0(str);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m114153M0(String str) {
        C8927c.m54583I1(m114113A0(), str);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m114154N0(final String str, View view) {
        m114171e1(new x20() { // from class: l.o3b0
            @Override // p153l.x20
            public final void call() {
                this.f144828a.m114153M0(str);
            }
        });
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m114155O0(String str) {
        if (joa.m146396k4()) {
            CoreModule.m30933P().m143405a().mo34577r6(m114113A0(), str, Privilege.ultra_premium_badge, null, null);
        } else {
            mo53983O().act().startActivity(VipAct.m57420c2(mo53983O().act(), oql0.m168817a(SummarizedPrivilegesId.ultraPremium)));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m114156P0(final String str, View view) {
        m114171e1(new x20() { // from class: l.l3b0
            @Override // p153l.x20
            public final void call() {
                this.f129856a.m114155O0(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m114157Q0(String str) {
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34404Rm(m114113A0(), str);
        } else {
            m114113A0().startActivity(VipAct.m57420c2(m114113A0(), oql0.m168817a("svip")));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m114158R0(final String str, View view) {
        m114171e1(new x20() { // from class: l.n3b0
            @Override // p153l.x20
            public final void call() {
                this.f139959a.m114157Q0(str);
            }
        });
    }

    @Override // p153l.bo90
    /* JADX INFO: renamed from: S */
    public boolean mo105673S() {
        User userMo52252K2 = mo53983O().mo52252K2();
        User userMo53478me = mo53983O().mo53478me();
        boolean zMo52258P1 = mo53983O().mo52258P1();
        if (CoreModule.f18264c.f20303E0.m141059A3(userMo52252K2)) {
            return false;
        }
        if (!zMo52258P1 && userMo53478me != null && userMo52252K2 != null && m114142B0(userMo53478me) > m114142B0(userMo52252K2)) {
            return false;
        }
        if (!pgj.m172246c() && !nmp.m163836e()) {
            return false;
        }
        if (!zMo52258P1 || mo53983O().mo52302m0()) {
            return !zMo52258P1 && userMo52252K2.isVIP() && !userMo52252K2.gpHideVip() && userMo52252K2.isVIP();
        }
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m114159S0(User user, String str) {
        if (user.isVIP()) {
            m114113A0().startActivity(VipAct.m57419b2(m114113A0()));
        } else {
            C8927c.m54583I1(m114113A0(), str);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m114160T0(final User user, final String str, View view) {
        m114171e1(new x20() { // from class: l.t3b0
            @Override // p153l.x20
            public final void call() {
                this.f171911a.m114159S0(user, str);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m114161U0() {
        mo53983O().act().startActivity(VipAct.m57420c2(mo53983O().act(), oql0.m168817a(SummarizedPrivilegesId.ultraPremium)));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m114162V0(View view) {
        m114171e1(new x20() { // from class: l.r3b0
            @Override // p153l.x20
            public final void call() {
                this.f161026a.m114161U0();
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m114163W0() {
        mo53983O().startActivity(VipAct.m57419b2(m114113A0()));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m114164X0(View view) {
        m114171e1(new x20() { // from class: l.k3b0
            @Override // p153l.x20
            public final void call() {
                this.f123706a.m114163W0();
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m114165Y0(String str) {
        C8927c.m54583I1(m114113A0(), str);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m114166Z0(final String str, View view) {
        m114171e1(new x20() { // from class: l.g3b0
            @Override // p153l.x20
            public final void call() {
                this.f101975a.m114165Y0(str);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m114167a1() {
        C8927c.m54583I1(m114113A0(), "p_suggest_user_profile_info_view,e_banner_button,click");
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m114168b1(View view) {
        m114171e1(new x20() { // from class: l.q3b0
            @Override // p153l.x20
            public final void call() {
                this.f155435a.m114167a1();
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m114169c1() {
        m114113A0().startActivity(VipAct.m57419b2(m114113A0()));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m114170d1(View view) {
        m114171e1(new x20() { // from class: l.i3b0
            @Override // p153l.x20
            public final void call() {
                this.f112713a.m114169c1();
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public final void m114171e1(x20 x20Var) {
        m114172f1(x20Var, "");
    }

    /* JADX INFO: renamed from: f1 */
    public final void m114172f1(x20 x20Var, String str) {
        sfj0.m185596c("e_vip_banner", OMSDialogPositon.p_suggest_user_profile_info_view, sfj0.C20032a.m185615h("is_myself", String.valueOf(mo53983O().mo52258P1())), sfj0.C20032a.m185615h("banner_privilege_type", str));
        x20Var.call();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m114173g1(User user) {
        boolean zMo52258P1 = mo53983O().mo52258P1();
        boolean zMo52302m0 = mo53983O().mo52302m0();
        final User userMo53478me = mo53983O().mo53478me();
        final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
        if (!zMo52258P1 || zMo52302m0) {
            if (zMo52258P1) {
                return;
            }
            this.f85024x.setText(user.isFemale() ? R$string.f19396kc : R$string.f19427lc);
            if (d79.m114663V() && user.isUltraPremium()) {
                this.f85025y.setImageResource(dbc0.f87225mn);
                this.f85023w.setImageResource(dbc0.f87258nn);
                this.f85022v.setBackgroundResource(dbc0.f86970eu);
                this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.d3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f84883a.m114156P0(str, view);
                    }
                });
                return;
            }
            if (d79.m114661T() && user.isSVIP()) {
                this.f85025y.setImageResource(dbc0.f87159kn);
                this.f85023w.setImageResource(dbc0.f87192ln);
                this.f85022v.setBackgroundResource(dbc0.f86937du);
                this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.e3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f91946a.m114158R0(str, view);
                    }
                });
                return;
            }
            if (user.isVIP()) {
                this.f85025y.setImageResource(dbc0.f87291on);
                this.f85023w.setImageResource(dbc0.f87324pn);
                this.f85022v.setBackgroundResource(dbc0.f87003fu);
                this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.f3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f96979a.m114160T0(userMo53478me, str, view);
                    }
                });
                return;
            }
            return;
        }
        this.f85024x.setText(R$string.f19229et);
        if (d79.m114663V() && !joa.m146396k4()) {
            this.f85025y.setImageResource(dbc0.f87225mn);
            this.f85023w.setImageResource(dbc0.f87258nn);
            this.f85022v.setBackgroundResource(dbc0.f86970eu);
            this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.x3b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192243a.m114162V0(view);
                }
            });
            return;
        }
        if (d79.m114661T() && !joa.m146386f4()) {
            this.f85025y.setImageResource(dbc0.f87159kn);
            this.f85023w.setImageResource(dbc0.f87192ln);
            this.f85022v.setBackgroundResource(dbc0.f86937du);
            this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.y3b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197339a.m114144D0(view);
                }
            });
            return;
        }
        if (user.isVIP()) {
            this.f85025y.setImageResource(dbc0.f87291on);
            this.f85023w.setImageResource(dbc0.f87324pn);
            this.f85022v.setBackgroundResource(dbc0.f87003fu);
            this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.z3b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202816a.m114146F0(view);
                }
            });
            return;
        }
        if (d79.m114663V() && joa.m146398l4()) {
            this.f85025y.setImageResource(dbc0.f87225mn);
            this.f85023w.setImageResource(dbc0.f87258nn);
            this.f85022v.setBackgroundResource(dbc0.f86970eu);
            this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.a4b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68370a.m114148H0(str, view);
                }
            });
            return;
        }
        if (d79.m114661T() && joa.m146388g4()) {
            this.f85025y.setImageResource(dbc0.f87159kn);
            this.f85023w.setImageResource(dbc0.f87192ln);
            this.f85022v.setBackgroundResource(dbc0.f86937du);
            this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.b4b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74890a.m114150J0(str, view);
                }
            });
            return;
        }
        boolean zIsVIPUsed = user.isVIPUsed();
        VImage vImage = this.f85025y;
        if (zIsVIPUsed) {
            vImage.setImageResource(dbc0.f87291on);
            this.f85023w.setImageResource(dbc0.f87324pn);
            this.f85022v.setBackgroundResource(dbc0.f87003fu);
            this.f85022v.setOnClickListener(new View.OnClickListener() { // from class: l.c3b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79589a.m114154N0(str, view);
                }
            });
            return;
        }
        vImage.setImageResource(dbc0.f87291on);
        this.f85023w.setImageResource(dbc0.f87324pn);
        this.f85022v.setBackgroundResource(dbc0.f87003fu);
        this.f85026z.setOnClickListener(new View.OnClickListener() { // from class: l.c4b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79686a.m114152L0(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public final void m114174h1(User user) {
        boolean zMo52258P1 = mo53983O().mo52258P1();
        boolean zMo52302m0 = mo53983O().mo52302m0();
        User userMo53478me = mo53983O().mo53478me();
        if (zMo52258P1 && !zMo52302m0) {
            this.f85021C.setText(R$string.f19229et);
            boolean zIsVIP = user.isVIP();
            VText vText = this.f85020B;
            if (zIsVIP) {
                vText.setText(R$string.f19137bt);
                this.f85026z.setOnClickListener(new View.OnClickListener() { // from class: l.b3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f74721a.m114164X0(view);
                    }
                });
                return;
            } else {
                vText.setText(userMo53478me.isVIPExpired() ? R$string.f19168ct : R$string.f19106at);
                final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
                this.f85026z.setOnClickListener(new View.OnClickListener() { // from class: l.m3b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f134657a.m114166Z0(str, view);
                    }
                });
                return;
            }
        }
        if (zMo52258P1 || !user.isVIP() || user.gpHideVip()) {
            return;
        }
        if (!userMo53478me.isVIP() && user.isVIP()) {
            this.f85020B.setText(R$string.f19137bt);
            this.f85026z.setOnClickListener(new View.OnClickListener() { // from class: l.v3b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182176a.m114168b1(view);
                }
            });
        } else if (userMo53478me.isVIP() && user.isVIP()) {
            this.f85020B.setText(R$string.f19137bt);
            this.f85026z.setOnClickListener(new View.OnClickListener() { // from class: l.w3b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187126a.m114170d1(view);
                }
            });
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52236D2() || !NullChecker.m82486a(this.f85019A)) {
            return;
        }
        this.f85019A.setImageDrawable(m114113A0().drawable(dbc0.f86295Ju));
        if (mo53983O().mo52236D2() || !(this.f85020B.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        if (vq8.m202358b() || CoreModule.m30934Q().mo68438a().mo134409a()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f85020B.getLayoutParams();
            marginLayoutParams.leftMargin = qa00.m175859d(10.0f);
            this.f85020B.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return !mo53983O().mo52258P1() ? m114175y0(mo53983O().mo146493H2(), viewGroup) : m114176z0(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (mo53983O().mo52258P1()) {
            m114174h1(mo53983O().mo52252K2());
        } else {
            m114173g1(mo53983O().mo52252K2());
        }
    }

    /* JADX INFO: renamed from: y0 */
    public View m114175y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e4b0.m119393b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z0 */
    public View m114176z0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f4b0.m123975b(this, layoutInflater, viewGroup);
    }
}
