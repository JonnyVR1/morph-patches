package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.awa0;
import l.bwa0;
import l.d30;
import l.e30;
import l.khl0;
import l.mcr;
import l.nkp;
import l.o6j0;
import l.qp8;
import l.t100;
import l.u59;
import l.vdj;
import l.x2c0;
import l.xma;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zva0 extends xf90 {

    /* JADX INFO: renamed from: A */
    public VImage f23602A;

    /* JADX INFO: renamed from: B */
    public VText f23603B;

    /* JADX INFO: renamed from: C */
    public VText f23604C;

    /* JADX INFO: renamed from: v */
    public VLinear f23605v;

    /* JADX INFO: renamed from: w */
    public VImage f23606w;

    /* JADX INFO: renamed from: x */
    public VText f23607x;

    /* JADX INFO: renamed from: y */
    public VImage f23608y;

    /* JADX INFO: renamed from: z */
    public VLinear f23609z;

    public zva0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: A0 */
    private Act m27542A0() {
        return mo3351O().act();
    }

    /* JADX INFO: renamed from: B0 */
    public final int m27571B0(User user) {
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
    public final /* synthetic */ void m27572C0() {
        mo3351O().act().startActivity(VipAct.b2(mo3351O().act(), khl0.a("svip")));
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m27573D0(View view) {
        m27600e1(new d30() { // from class: l.fva0
            public final void call() {
                this.f10642a.m27572C0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m27574E0() {
        mo3351O().act().startActivity(VipAct.b2(mo3351O().act(), khl0.a("vip")));
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m27575F0(View view) {
        m27600e1(new d30() { // from class: l.lva0
            public final void call() {
                this.f15085a.m27574E0();
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m27576G0(String str) {
        CoreModule.P().a().r6(m27542A0(), str, Privilege.ultra_premium_badge, (e30) null, (d30) null);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m27577H0(final String str, View view) {
        m27600e1(new d30() { // from class: l.qva0
            public final void call() {
                this.f18245a.m27576G0(str);
            }
        });
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m27578I0(String str) {
        CoreModule.P().a().Rm(m27542A0(), str);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m27579J0(final String str, View view) {
        m27600e1(new d30() { // from class: l.dva0
            public final void call() {
                this.f9438a.m27578I0(str);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m27580K0(String str) {
        C0189c.m3966I1(m27542A0(), str);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m27581L0(final String str, View view) {
        m27600e1(new d30() { // from class: l.ova0
            public final void call() {
                this.f16802a.m27580K0(str);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m27582M0(String str) {
        C0189c.m3966I1(m27542A0(), str);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m27583N0(final String str, View view) {
        m27600e1(new d30() { // from class: l.kva0
            public final void call() {
                this.f14551a.m27582M0(str);
            }
        });
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m27584O0(String str) {
        if (xma.j4()) {
            CoreModule.P().a().r6(m27542A0(), str, Privilege.ultra_premium_badge, (e30) null, (d30) null);
        } else {
            mo3351O().act().startActivity(VipAct.b2(mo3351O().act(), khl0.a("ultraPremium")));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m27585P0(final String str, View view) {
        m27600e1(new d30() { // from class: l.hva0
            public final void call() {
                this.f12276a.m27584O0(str);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m27586Q0(String str) {
        if (xma.e4()) {
            CoreModule.P().a().Rm(m27542A0(), str);
        } else {
            m27542A0().startActivity(VipAct.b2(m27542A0(), khl0.a("svip")));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m27587R0(final String str, View view) {
        m27600e1(new d30() { // from class: l.jva0
            public final void call() {
                this.f14049a.m27586Q0(str);
            }
        });
    }

    @Override // p002l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo10392S() {
        User userMo1517K2 = mo3351O().mo1517K2();
        User userMo2827me = mo3351O().mo2827me();
        boolean zMo1523P1 = mo3351O().mo1523P1();
        if (CoreModule.c.E0.A3(userMo1517K2)) {
            return false;
        }
        if (!zMo1523P1 && userMo2827me != null && userMo1517K2 != null && m27571B0(userMo2827me) > m27571B0(userMo1517K2)) {
            return false;
        }
        if (!vdj.c() && !nkp.e()) {
            return false;
        }
        if (!zMo1523P1 || mo3351O().mo1570m0()) {
            return !zMo1523P1 && userMo1517K2.isVIP() && !userMo1517K2.gpHideVip() && userMo1517K2.isVIP();
        }
        return true;
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m27588S0(User user, String str) {
        if (user.isVIP()) {
            m27542A0().startActivity(VipAct.a2(m27542A0()));
        } else {
            C0189c.m3966I1(m27542A0(), str);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m27589T0(final User user, final String str, View view) {
        m27600e1(new d30() { // from class: l.pva0
            public final void call() {
                this.f17664a.m27588S0(user, str);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m27590U0() {
        mo3351O().act().startActivity(VipAct.b2(mo3351O().act(), khl0.a("ultraPremium")));
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m27591V0(View view) {
        m27600e1(new d30() { // from class: l.nva0
            public final void call() {
                this.f16221a.m27590U0();
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m27592W0() {
        mo3351O().startActivity(VipAct.a2(m27542A0()));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m27593X0(View view) {
        m27600e1(new d30() { // from class: l.gva0
            public final void call() {
                this.f11637a.m27592W0();
            }
        });
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m27594Y0(String str) {
        C0189c.m3966I1(m27542A0(), str);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m27595Z0(final String str, View view) {
        m27600e1(new d30() { // from class: l.cva0
            public final void call() {
                this.f8949a.m27594Y0(str);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m27596a1() {
        C0189c.m3966I1(m27542A0(), "p_suggest_user_profile_info_view,e_banner_button,click");
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m27597b1(View view) {
        m27600e1(new d30() { // from class: l.mva0
            public final void call() {
                this.f15669a.m27596a1();
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m27598c1() {
        m27542A0().startActivity(VipAct.a2(m27542A0()));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m27599d1(View view) {
        m27600e1(new d30() { // from class: l.eva0
            public final void call() {
                this.f9975a.m27598c1();
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public final void m27600e1(d30 d30Var) {
        m27601f1(d30Var, "");
    }

    /* JADX INFO: renamed from: f1 */
    public final void m27601f1(d30 d30Var, String str) {
        o6j0.c("e_vip_banner", "p_suggest_user_profile_info_view", new o6j0.a[]{o6j0.a.h("is_myself", String.valueOf(mo3351O().mo1523P1())), o6j0.a.h("banner_privilege_type", str)});
        d30Var.call();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m27602g1(User user) {
        boolean zMo1523P1 = mo3351O().mo1523P1();
        boolean zMo1570m0 = mo3351O().mo1570m0();
        final User userMo2827me = mo3351O().mo2827me();
        final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
        if (!zMo1523P1 || zMo1570m0) {
            if (zMo1523P1) {
                return;
            }
            this.f23607x.setText(user.isFemale() ? R.string.Vb : R.string.Wb);
            if (u59.U() && user.isUltraPremium()) {
                this.f23608y.setImageResource(x2c0.ym);
                this.f23606w.setImageResource(x2c0.zm);
                this.f23605v.setBackgroundResource(x2c0.qt);
                this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.zua0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f23591a.m27585P0(str, view);
                    }
                });
                return;
            }
            if (u59.S() && user.isSVIP()) {
                this.f23608y.setImageResource(x2c0.wm);
                this.f23606w.setImageResource(x2c0.xm);
                this.f23605v.setBackgroundResource(x2c0.pt);
                this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.ava0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7894a.m27587R0(str, view);
                    }
                });
                return;
            }
            if (user.isVIP()) {
                this.f23608y.setImageResource(x2c0.Am);
                this.f23606w.setImageResource(x2c0.Bm);
                this.f23605v.setBackgroundResource(x2c0.rt);
                this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.bva0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8371a.m27589T0(userMo2827me, str, view);
                    }
                });
                return;
            }
            return;
        }
        this.f23607x.setText(R.string.Is);
        if (u59.U() && !xma.j4()) {
            this.f23608y.setImageResource(x2c0.ym);
            this.f23606w.setImageResource(x2c0.zm);
            this.f23605v.setBackgroundResource(x2c0.qt);
            this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.tva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20397a.m27591V0(view);
                }
            });
            return;
        }
        if (u59.S() && !xma.e4()) {
            this.f23608y.setImageResource(x2c0.wm);
            this.f23606w.setImageResource(x2c0.xm);
            this.f23605v.setBackgroundResource(x2c0.pt);
            this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.uva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20845a.m27573D0(view);
                }
            });
            return;
        }
        if (user.isVIP()) {
            this.f23608y.setImageResource(x2c0.Am);
            this.f23606w.setImageResource(x2c0.Bm);
            this.f23605v.setBackgroundResource(x2c0.rt);
            this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.vva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21341a.m27575F0(view);
                }
            });
            return;
        }
        if (u59.U() && xma.k4()) {
            this.f23608y.setImageResource(x2c0.ym);
            this.f23606w.setImageResource(x2c0.zm);
            this.f23605v.setBackgroundResource(x2c0.qt);
            this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.wva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21999a.m27577H0(str, view);
                }
            });
            return;
        }
        if (u59.S() && xma.f4()) {
            this.f23608y.setImageResource(x2c0.wm);
            this.f23606w.setImageResource(x2c0.xm);
            this.f23605v.setBackgroundResource(x2c0.pt);
            this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.xva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22480a.m27579J0(str, view);
                }
            });
            return;
        }
        boolean zIsVIPUsed = user.isVIPUsed();
        VImage vImage = this.f23608y;
        if (zIsVIPUsed) {
            vImage.setImageResource(x2c0.Am);
            this.f23606w.setImageResource(x2c0.Bm);
            this.f23605v.setBackgroundResource(x2c0.rt);
            this.f23605v.setOnClickListener(new View.OnClickListener() { // from class: l.yua0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23104a.m27583N0(str, view);
                }
            });
            return;
        }
        vImage.setImageResource(x2c0.Am);
        this.f23606w.setImageResource(x2c0.Bm);
        this.f23605v.setBackgroundResource(x2c0.rt);
        this.f23609z.setOnClickListener(new View.OnClickListener() { // from class: l.yva0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23117a.m27581L0(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public final void m27603h1(User user) {
        boolean zMo1523P1 = mo3351O().mo1523P1();
        boolean zMo1570m0 = mo3351O().mo1570m0();
        User userMo2827me = mo3351O().mo2827me();
        if (zMo1523P1 && !zMo1570m0) {
            this.f23604C.setText(R.string.Is);
            boolean zIsVIP = user.isVIP();
            VText vText = this.f23603B;
            if (zIsVIP) {
                vText.setText(R.string.Fs);
                this.f23609z.setOnClickListener(new View.OnClickListener() { // from class: l.xua0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22470a.m27593X0(view);
                    }
                });
                return;
            } else {
                vText.setText(userMo2827me.isVIPExpired() ? R.string.Gs : R.string.Es);
                final String str = "p_suggest_user_profile_info_view,e_banner_button,click";
                this.f23609z.setOnClickListener(new View.OnClickListener() { // from class: l.iva0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13432a.m27595Z0(str, view);
                    }
                });
                return;
            }
        }
        if (zMo1523P1 || !user.isVIP() || user.gpHideVip()) {
            return;
        }
        if (!userMo2827me.isVIP() && user.isVIP()) {
            this.f23603B.setText(R.string.Fs);
            this.f23609z.setOnClickListener(new View.OnClickListener() { // from class: l.rva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18691a.m27597b1(view);
                }
            });
        } else if (userMo2827me.isVIP() && user.isVIP()) {
            this.f23603B.setText(R.string.Fs);
            this.f23609z.setOnClickListener(new View.OnClickListener() { // from class: l.sva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19300a.m27599d1(view);
                }
            });
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1501D2() || !NullChecker.a(this.f23602A)) {
            return;
        }
        this.f23602A.setImageDrawable(m27542A0().drawable(x2c0.Vt));
        if (mo3351O().mo1501D2() || !(this.f23603B.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        if (qp8.b() || CoreModule.Q().a().a()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23603B.getLayoutParams();
            marginLayoutParams.leftMargin = t100.d(10.0f);
            this.f23603B.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return !mo3351O().mo1523P1() ? m27604y0(mo3351O().mo9267H2(), viewGroup) : m27605z0(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (mo3351O().mo1523P1()) {
            m27603h1(mo3351O().mo1517K2());
        } else {
            m27602g1(mo3351O().mo1517K2());
        }
    }

    /* JADX INFO: renamed from: y0 */
    public View m27604y0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return awa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z0 */
    public View m27605z0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bwa0.b(this, layoutInflater, viewGroup);
    }
}
