package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zva0 extends xf90 {

    /* JADX INFO: renamed from: A */
    public VImage f204982A;

    /* JADX INFO: renamed from: B */
    public VText f204983B;

    /* JADX INFO: renamed from: C */
    public VText f204984C;

    /* JADX INFO: renamed from: v */
    public VLinear f204985v;

    /* JADX INFO: renamed from: w */
    public VImage f204986w;

    /* JADX INFO: renamed from: x */
    public VText f204987x;

    /* JADX INFO: renamed from: y */
    public VImage f204988y;

    /* JADX INFO: renamed from: z */
    public VLinear f204989z;

    public zva0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: A0 */
    private Act m220299A0() {
        return mo52800O().act();
    }

    /* JADX INFO: renamed from: B0 */
    public final int m220328B0(User user) {
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
    public final /* synthetic */ void m220329C0() {
        mo52800O().act().startActivity(VipAct.m56237b2(mo52800O().act(), khl0.m145975a("svip")));
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m220330D0(View view) {
        m220357e1(new d30() { // from class: l.fva0
            @Override // p149l.d30
            public final void call() {
                this.f99414a.m220329C0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m220331E0() {
        mo52800O().act().startActivity(VipAct.m56237b2(mo52800O().act(), khl0.m145975a("vip")));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m220332F0(View view) {
        m220357e1(new d30() { // from class: l.lva0
            @Override // p149l.d30
            public final void call() {
                this.f130149a.m220331E0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m220333G0(String str) {
        CoreModule.m29935P().m94651a().mo33574r6(m220299A0(), str, Privilege.ultra_premium_badge, null, null);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m220334H0(final String str, View view) {
        m220357e1(new d30() { // from class: l.qva0
            @Override // p149l.d30
            public final void call() {
                this.f156595a.m220333G0(str);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m220335I0(String str) {
        CoreModule.m29935P().m94651a().mo33401Rm(m220299A0(), str);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m220336J0(final String str, View view) {
        m220357e1(new d30() { // from class: l.dva0
            @Override // p149l.d30
            public final void call() {
                this.f88050a.m220335I0(str);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m220337K0(String str) {
        C8764c.m53400I1(m220299A0(), str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m220338L0(final String str, View view) {
        m220357e1(new d30() { // from class: l.ova0
            @Override // p149l.d30
            public final void call() {
                this.f145792a.m220337K0(str);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m220339M0(String str) {
        C8764c.m53400I1(m220299A0(), str);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m220340N0(final String str, View view) {
        m220357e1(new d30() { // from class: l.kva0
            @Override // p149l.d30
            public final void call() {
                this.f124760a.m220339M0(str);
            }
        });
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m220341O0(String str) {
        if (xma.m210081j4()) {
            CoreModule.m29935P().m94651a().mo33574r6(m220299A0(), str, Privilege.ultra_premium_badge, null, null);
        } else {
            mo52800O().act().startActivity(VipAct.m56237b2(mo52800O().act(), khl0.m145975a(SummarizedPrivilegesId.ultraPremium)));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m220342P0(final String str, View view) {
        m220357e1(new d30() { // from class: l.hva0
            @Override // p149l.d30
            public final void call() {
                this.f109634a.m220341O0(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m220343Q0(String str) {
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33401Rm(m220299A0(), str);
        } else {
            m220299A0().startActivity(VipAct.m56237b2(m220299A0(), khl0.m145975a("svip")));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m220344R0(final String str, View view) {
        m220357e1(new d30() { // from class: l.jva0
            @Override // p149l.d30
            public final void call() {
                this.f119925a.m220343Q0(str);
            }
        });
    }

    @Override // p149l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo102271S() {
        User userMo51069K2 = mo52800O().mo51069K2();
        User userMo52295me = mo52800O().mo52295me();
        boolean zMo51075P1 = mo52800O().mo51075P1();
        if (CoreModule.f17545c.f19561E0.m203771A3(userMo51069K2)) {
            return false;
        }
        if (!zMo51075P1 && userMo52295me != null && userMo51069K2 != null && m220328B0(userMo52295me) > m220328B0(userMo51069K2)) {
            return false;
        }
        if (!vdj.m198001c() && !nkp.m159986e()) {
            return false;
        }
        if (!zMo51075P1 || mo52800O().mo51119m0()) {
            return !zMo51075P1 && userMo51069K2.isVIP() && !userMo51069K2.gpHideVip() && userMo51069K2.isVIP();
        }
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m220345S0(User user, String str) {
        if (user.isVIP()) {
            m220299A0().startActivity(VipAct.m56236a2(m220299A0()));
        } else {
            C8764c.m53400I1(m220299A0(), str);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m220346T0(final User user, final String str, View view) {
        m220357e1(new d30() { // from class: l.pva0
            @Override // p149l.d30
            public final void call() {
                this.f151434a.m220345S0(user, str);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m220347U0() {
        mo52800O().act().startActivity(VipAct.m56237b2(mo52800O().act(), khl0.m145975a(SummarizedPrivilegesId.ultraPremium)));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m220348V0(View view) {
        m220357e1(new d30() { // from class: l.nva0
            @Override // p149l.d30
            public final void call() {
                this.f140698a.m220347U0();
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m220349W0() {
        mo52800O().startActivity(VipAct.m56236a2(m220299A0()));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m220350X0(View view) {
        m220357e1(new d30() { // from class: l.gva0
            @Override // p149l.d30
            public final void call() {
                this.f104549a.m220349W0();
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m220351Y0(String str) {
        C8764c.m53400I1(m220299A0(), str);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m220352Z0(final String str, View view) {
        m220357e1(new d30() { // from class: l.cva0
            @Override // p149l.d30
            public final void call() {
                this.f82652a.m220351Y0(str);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m220353a1() {
        C8764c.m53400I1(m220299A0(), "p_suggest_user_profile_info_view,e_banner_button,click");
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m220354b1(View view) {
        m220357e1(new d30() { // from class: l.mva0
            @Override // p149l.d30
            public final void call() {
                this.f135892a.m220353a1();
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m220355c1() {
        m220299A0().startActivity(VipAct.m56236a2(m220299A0()));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m220356d1(View view) {
        m220357e1(new d30() { // from class: l.eva0
            @Override // p149l.d30
            public final void call() {
                this.f93326a.m220355c1();
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public final void m220357e1(d30 d30Var) {
        m220358f1(d30Var, "");
    }

    /* JADX INFO: renamed from: f1 */
    public final void m220358f1(d30 d30Var, String str) {
        o6j0.m162859c("e_vip_banner", OMSDialogPositon.p_suggest_user_profile_info_view, o6j0.C18854a.m162878h("is_myself", String.valueOf(mo52800O().mo51075P1())), o6j0.C18854a.m162878h("banner_privilege_type", str));
        d30Var.call();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m220359g1(User user) {
        boolean zMo51075P1 = mo52800O().mo51075P1();
        boolean zMo51119m0 = mo52800O().mo51119m0();
        final User userMo52295me = mo52800O().mo52295me();
        final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
        if (!zMo51075P1 || zMo51119m0) {
            if (zMo51075P1) {
                return;
            }
            this.f204987x.setText(user.isFemale() ? R$string.f18208Vb : R$string.f18238Wb);
            if (u59.m191812U() && user.isUltraPremium()) {
                this.f204988y.setImageResource(x2c0.f190753ym);
                this.f204986w.setImageResource(x2c0.f190785zm);
                this.f204985v.setBackgroundResource(x2c0.f190504qt);
                this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.zua0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f204833a.m220342P0(str, view);
                    }
                });
                return;
            }
            if (u59.m191810S() && user.isSVIP()) {
                this.f204988y.setImageResource(x2c0.f190689wm);
                this.f204986w.setImageResource(x2c0.f190721xm);
                this.f204985v.setBackgroundResource(x2c0.f190472pt);
                this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.ava0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f71924a.m220344R0(str, view);
                    }
                });
                return;
            }
            if (user.isVIP()) {
                this.f204988y.setImageResource(x2c0.f189176Am);
                this.f204986w.setImageResource(x2c0.f189208Bm);
                this.f204985v.setBackgroundResource(x2c0.f190536rt);
                this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.bva0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f77415a.m220346T0(userMo52295me, str, view);
                    }
                });
                return;
            }
            return;
        }
        this.f204987x.setText(R$string.f17835Is);
        if (u59.m191812U() && !xma.m210081j4()) {
            this.f204988y.setImageResource(x2c0.f190753ym);
            this.f204986w.setImageResource(x2c0.f190785zm);
            this.f204985v.setBackgroundResource(x2c0.f190504qt);
            this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.tva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172274a.m220348V0(view);
                }
            });
            return;
        }
        if (u59.m191810S() && !xma.m210071e4()) {
            this.f204988y.setImageResource(x2c0.f190689wm);
            this.f204986w.setImageResource(x2c0.f190721xm);
            this.f204985v.setBackgroundResource(x2c0.f190472pt);
            this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.uva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178520a.m220330D0(view);
                }
            });
            return;
        }
        if (user.isVIP()) {
            this.f204988y.setImageResource(x2c0.f189176Am);
            this.f204986w.setImageResource(x2c0.f189208Bm);
            this.f204985v.setBackgroundResource(x2c0.f190536rt);
            this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.vva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183204a.m220332F0(view);
                }
            });
            return;
        }
        if (u59.m191812U() && xma.m210083k4()) {
            this.f204988y.setImageResource(x2c0.f190753ym);
            this.f204986w.setImageResource(x2c0.f190785zm);
            this.f204985v.setBackgroundResource(x2c0.f190504qt);
            this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.wva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188227a.m220334H0(str, view);
                }
            });
            return;
        }
        if (u59.m191810S() && xma.m210073f4()) {
            this.f204988y.setImageResource(x2c0.f190689wm);
            this.f204986w.setImageResource(x2c0.f190721xm);
            this.f204985v.setBackgroundResource(x2c0.f190472pt);
            this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.xva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194589a.m220336J0(str, view);
                }
            });
            return;
        }
        boolean zIsVIPUsed = user.isVIPUsed();
        VImage vImage = this.f204988y;
        if (zIsVIPUsed) {
            vImage.setImageResource(x2c0.f189176Am);
            this.f204986w.setImageResource(x2c0.f189208Bm);
            this.f204985v.setBackgroundResource(x2c0.f190536rt);
            this.f204985v.setOnClickListener(new View.OnClickListener() { // from class: l.yua0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200058a.m220340N0(str, view);
                }
            });
            return;
        }
        vImage.setImageResource(x2c0.f189176Am);
        this.f204986w.setImageResource(x2c0.f189208Bm);
        this.f204985v.setBackgroundResource(x2c0.f190536rt);
        this.f204989z.setOnClickListener(new View.OnClickListener() { // from class: l.yva0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200242a.m220338L0(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public final void m220360h1(User user) {
        boolean zMo51075P1 = mo52800O().mo51075P1();
        boolean zMo51119m0 = mo52800O().mo51119m0();
        User userMo52295me = mo52800O().mo52295me();
        if (zMo51075P1 && !zMo51119m0) {
            this.f204984C.setText(R$string.f17835Is);
            boolean zIsVIP = user.isVIP();
            VText vText = this.f204983B;
            if (zIsVIP) {
                vText.setText(R$string.f17745Fs);
                this.f204989z.setOnClickListener(new View.OnClickListener() { // from class: l.xua0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f194485a.m220350X0(view);
                    }
                });
                return;
            } else {
                vText.setText(userMo52295me.isVIPExpired() ? R$string.f17775Gs : R$string.f17715Es);
                final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
                this.f204989z.setOnClickListener(new View.OnClickListener() { // from class: l.iva0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f115107a.m220352Z0(str, view);
                    }
                });
                return;
            }
        }
        if (zMo51075P1 || !user.isVIP() || user.gpHideVip()) {
            return;
        }
        if (!userMo52295me.isVIP() && user.isVIP()) {
            this.f204983B.setText(R$string.f17745Fs);
            this.f204989z.setOnClickListener(new View.OnClickListener() { // from class: l.rva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161184a.m220354b1(view);
                }
            });
        } else if (userMo52295me.isVIP() && user.isVIP()) {
            this.f204983B.setText(R$string.f17745Fs);
            this.f204989z.setOnClickListener(new View.OnClickListener() { // from class: l.sva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166549a.m220356d1(view);
                }
            });
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51053D2() || !NullChecker.m81303a(this.f204982A)) {
            return;
        }
        this.f204982A.setImageDrawable(m220299A0().drawable(x2c0.f189840Vt));
        if (mo52800O().mo51053D2() || !(this.f204983B.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        if (qp8.m175817b() || CoreModule.m29936Q().mo67255a().mo124834a()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f204983B.getLayoutParams();
            marginLayoutParams.leftMargin = t100.m186890d(10.0f);
            this.f204983B.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return !mo52800O().mo51075P1() ? m220361y0(mo52800O().mo94568H2(), viewGroup) : m220362z0(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (mo52800O().mo51075P1()) {
            m220360h1(mo52800O().mo51069K2());
        } else {
            m220359g1(mo52800O().mo51069K2());
        }
    }

    /* JADX INFO: renamed from: y0 */
    public View m220361y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return awa0.m99261b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z0 */
    public View m220362z0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bwa0.m104133b(this, layoutInflater, viewGroup);
    }
}
