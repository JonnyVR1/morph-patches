package com.p051p1.mobile.putong.core.p058ui.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.result.TanTanCoinItem;
import com.p051p1.mobile.putong.core.pay.R$string;
import p151v.VText;
import p153l.a5i0;
import p153l.bnl0;
import p153l.c17;
import p153l.fe5;
import p153l.gta;
import p153l.h9c0;
import p153l.jbc0;
import p153l.joa;
import p153l.m27;
import p153l.o1j0;
import p153l.pzi0;
import p153l.qj90;
import p153l.sfj0;
import p153l.t5i0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TanTanCoinItem f36482a;

    /* JADX INFO: renamed from: b */
    public VText f36483b;

    /* JADX INFO: renamed from: c */
    public VText f36484c;

    /* JADX INFO: renamed from: d */
    public ImageView f36485d;

    /* JADX INFO: renamed from: e */
    public PutongFrag f36486e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.TanTanCoinItem$a */
    public static /* synthetic */ class C8997a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36487a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f36487a = iArr;
            try {
                iArr[Privilege.boost.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36487a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36487a[Privilege.letter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36487a[Privilege.vip_letter_gp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36487a[Privilege.see_letter_gp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36487a[Privilege.online_match_tickets_extra.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36487a[Privilege.see_greet_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36487a[Privilege.intl_message_read.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public TanTanCoinItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m55957g(PutongFrag putongFrag, View view) {
        if (joa.m146355E3() || a5i0.m96096G()) {
            o1j0.m165649w(R$string.f27983E0);
        } else {
            a5i0.m96169s1(putongFrag.act(), "p_wallet,e_wallet_function_button,click_letter");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m55959i(View view) {
        t5i0.m189402a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m55960j() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.e5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92218a.m55967q(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m55961k() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.f5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97227a.m55968r(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m55962l() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.g5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102332a.m55969s(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m55963m() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.d5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85157a.m55970t(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m55964n() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.h5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107946a.m55971u(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m55965o() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.c5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79865a.m55972v(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55959i(this);
        this.f36483b.setMaxLines(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m55966p() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.i5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113074a.m55973w(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m55967q(View view) {
        if (m27.m156744I3()) {
            o1j0.m165651y(this.f36486e.m21603x4(R$string.f28271da));
        } else if (CoreModule.m30933P().m143405a().mo34510h5() && a5i0.m96174v() && !joa.m146361M3()) {
            CoreModule.m30933P().m143405a().mo34575qm(this.f36486e.act(), "p_wallet,vas", Privilege.boost, null);
        } else if (a5i0.m96122W() <= 0) {
            C8927c.m54628c1(this.f36486e.act(), "p_wallet,vas");
        } else if (!a5i0.m96174v()) {
            CoreModule.m30933P().m143408e().mo35983dt(this.f36486e.act(), PurchaseType.TYPE_GET_BOOST, Privilege.boost, null);
        } else if (a5i0.m96160p0().m96214c1()) {
            CoreModule.m30933P().m143405a().mo34330Go(this.f36486e.act(), null, PurchaseType.TYPE_GET_BOOST, false, true);
        } else {
            CoreModule.m30933P().m143405a().mo34622wi(this.f36486e.act(), false);
        }
        if (!m27.m156744I3()) {
            uqb0.m197269e1("boost_purchase_shown", new Object[0]);
        }
        a5i0.m96114O1(1, m27.m156744I3() || a5i0.m96122W() > 0);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m55968r(View view) {
        if (a5i0.m96088D()) {
            o1j0.m165649w(R$string.f28353k8);
        } else {
            new fe5.C16962e(this.f36486e.act()).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125274c(7).m125275d("p_wallet,e_wallet_function_button,click_greet").m125283l();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m55969s(View view) {
        if (CoreModule.m30933P().m143405a().mo34504fm()) {
            o1j0.m165649w(R$string.f28084N2);
        } else {
            a5i0.m96169s1(this.f36486e.act(), "intl_letter_wallet");
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m55970t(View view) {
        if (CoreModule.m30933P().m143405a().mo34504fm()) {
            o1j0.m165649w(R$string.f28084N2);
        } else {
            a5i0.m96169s1(this.f36486e.act(), "intl_letter_wallet");
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m55971u(View view) {
        sfj0.m185596c("e_wallet_read_receipt", this.f36486e.act().pageId(), new sfj0.C20032a[0]);
        a5i0.m96185z(this.f36486e.act(), "p_wallet,vas");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m55972v(View view) {
        if (CoreModule.m30933P().m143405a().mo34343If() && CoreModule.m30933P().m143405a().mo34464ad() && CoreModule.m30933P().m143405a().mo34434Up()) {
            return;
        }
        boolean z = true;
        if (CoreModule.m30933P().m143405a().mo34464ad()) {
            o1j0.m165649w(R$string.f28283ea);
        } else if ((CoreModule.m30933P().m143405a().mo34640zg() && CoreModule.m30933P().m143405a().mo34471b3() >= 1) || (a5i0.m96168s0() >= 1 && !CoreModule.f18264c.f20381e0.m116593na().isFemale())) {
            CoreModule.m30933P().m143405a().mo34481cm(this.f36486e.act(), true);
        } else if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            CoreModule.m30933P().m143405a().mo34312Eb(this.f36486e.act());
        } else {
            C8927c.m54662o1(this.f36486e.act(), null, CoreModule.m30933P().m143405a().mo34437Vl(), "p_messages_view,e_quickchat_button,click");
        }
        if (!CoreModule.m30933P().m143405a().mo34464ad() && a5i0.m96168s0() <= 0) {
            z = false;
        }
        a5i0.m96114O1(3, z);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m55973w(View view) {
        if (CoreModule.m30933P().m143405a().mo34371Mf()) {
            if (joa.m146357G3()) {
                o1j0.m165649w(R$string.f28295fa);
            } else if (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
                CoreModule.m30933P().m143405a().mo34564pg(this.f36486e.act(), null, 0, "p_wallet,vas");
            } else if (a5i0.m96181x0() > 0) {
                o1j0.m165649w(R$string.f28295fa);
            } else {
                C8927c.m54586J1(this.f36486e.act(), "p_wallet,vas", Privilege.vip_super_like);
            }
        } else if (a5i0.m96181x0() > 0) {
            o1j0.m165649w(R$string.f28295fa);
        } else if (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) || gta.m132210e().m132214d().mo34745Qi()) {
            C8927c.m54574F1(this.f36486e.act(), "p_wallet,vas");
        } else {
            C8927c.m54586J1(this.f36486e.act(), "p_wallet,vas", Privilege.vip_super_like);
        }
        a5i0.m96114O1(2, a5i0.m96181x0() > 0);
    }

    /* JADX INFO: renamed from: x */
    public void m55974x(final PutongFrag putongFrag, Privilege privilege) {
        String strM21603x4;
        this.f36486e = putongFrag;
        boolean zM156744I3 = false;
        switch (C8997a.f36487a[privilege.ordinal()]) {
            case 1:
                zM156744I3 = m27.m156744I3();
                String str = putongFrag.m21603x4(R$string.f28271da) + "...";
                String strM21603x5 = putongFrag.m21603x4(R$string.f28392o);
                if (!zM156744I3) {
                    str = strM21603x5;
                }
                String string = CoreModule.m30933P().m143405a().mo180437a2() ? "全程不间断优先推荐，让10倍的人优先滑到你" : getContext().getString(R$string.f28160U1);
                this.f36483b.setText(str);
                this.f36484c.setText(string);
                this.f36485d.setImageResource(jbc0.f119649kc);
                this.f36482a.setBackgroundResource(jbc0.f119562e9);
                m55960j();
                break;
            case 2:
                this.f36483b.setText(R$string.f28260d);
                this.f36484c.setText(R$string.f28034I7);
                this.f36485d.setImageResource(jbc0.f119674m9);
                this.f36482a.setBackgroundResource(jbc0.f119660l9);
                m55966p();
                break;
            case 3:
                this.f36483b.setText(R$string.f28082N0);
                this.f36484c.setText(R$string.f27972D0);
                this.f36485d.setImageResource(jbc0.f119690nb);
                this.f36482a.setBackgroundResource(jbc0.f119660l9);
                bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.b5i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TanTanCoinItem.m55957g(putongFrag, view);
                    }
                });
                break;
            case 4:
                this.f36483b.setText(R$string.f28071M0);
                this.f36484c.setText(c17.m107528u0() ? R$string.f28206Y3 : R$string.f28195X3);
                this.f36482a.setBackgroundResource(jbc0.f119660l9);
                this.f36485d.setImageResource(CoreModule.m30933P().m143405a().mo34448Xq());
                m55962l();
                break;
            case 5:
                this.f36483b.setText(R$string.f28071M0);
                this.f36484c.setText(c17.m107528u0() ? R$string.f28206Y3 : R$string.f28195X3);
                this.f36482a.setBackgroundResource(jbc0.f119646k9);
                this.f36485d.setImageResource(jbc0.f119589g8);
                m55963m();
                break;
            case 6:
                zM156744I3 = (CoreModule.m30933P().m143405a().mo34343If() && CoreModule.m30933P().m143405a().mo34464ad() && CoreModule.m30933P().m143405a().mo34434Up()) ? false : CoreModule.m30933P().m143405a().mo34464ad();
                VText vText = this.f36483b;
                if (zM156744I3) {
                    strM21603x4 = putongFrag.m21603x4(R$string.f28316h7) + "...";
                } else {
                    strM21603x4 = putongFrag.m21603x4(R$string.f28232a7);
                }
                vText.setText(strM21603x4);
                this.f36484c.setText(R$string.f28280e7);
                this.f36485d.setImageResource(jbc0.f119632j9);
                this.f36482a.setBackgroundResource(jbc0.f119618i9);
                m55965o();
                break;
            case 7:
                this.f36483b.setText(R$string.f28365l8);
                this.f36484c.setText(R$string.f28491w8);
                this.f36485d.setImageResource(jbc0.f119663lc);
                this.f36482a.setBackgroundResource(jbc0.f119576f9);
                m55961k();
                break;
            case 8:
                this.f36483b.setText(R$string.f27991E8);
                joa joaVar = CoreModule.f18264c.f20297C0;
                long jM146411x3 = joa.m146411x3(SummarizedPrivilegesId.get("intlReadMessage"));
                String string2 = putongFrag.act().getString(R$string.f27969C8);
                if (jM146411x3 != 0 && jM146411x3 > pzi0.m174454o()) {
                    string2 = putongFrag.act().getString(R$string.f28116Q1, pzi0.f154857d.format(Long.valueOf(jM146411x3)));
                }
                this.f36484c.setText(string2);
                this.f36485d.setImageResource(jbc0.f119604h9);
                this.f36482a.setBackgroundResource(jbc0.f119590g9);
                m55964n();
                break;
        }
        ImageView imageView = this.f36485d;
        if (zM156744I3) {
            imageView.setAlpha(0.5f);
            this.f36483b.setTextColor(getResources().getColor(h9c0.f108375j));
            this.f36484c.setTextColor(getResources().getColor(h9c0.f108375j));
        } else {
            imageView.setAlpha(1.0f);
            this.f36483b.setTextColor(getResources().getColor(h9c0.f108364d0));
            this.f36484c.setTextColor(getResources().getColor(h9c0.f108362c0));
        }
    }

    public TanTanCoinItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
