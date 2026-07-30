package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.result.TanTanCoinItem;
import com.p046p1.mobile.putong.core.pay.R$string;
import p147v.VText;
import p149l.b1c0;
import p149l.d3c0;
import p149l.fd5;
import p149l.j17;
import p149l.lsi0;
import p149l.lxh0;
import p149l.mb90;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.swh0;
import p149l.ura;
import p149l.xdl0;
import p149l.xma;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TanTanCoinItem f35634a;

    /* JADX INFO: renamed from: b */
    public VText f35635b;

    /* JADX INFO: renamed from: c */
    public VText f35636c;

    /* JADX INFO: renamed from: d */
    public ImageView f35637d;

    /* JADX INFO: renamed from: e */
    public PutongFrag f35638e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.TanTanCoinItem$a */
    public static /* synthetic */ class C8834a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35639a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35639a = iArr;
            try {
                iArr[Privilege.boost.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35639a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35639a[Privilege.letter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35639a[Privilege.vip_letter_gp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35639a[Privilege.see_letter_gp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35639a[Privilege.online_match_tickets_extra.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35639a[Privilege.see_greet_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35639a[Privilege.intl_message_read.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public TanTanCoinItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m54774g(PutongFrag putongFrag, View view) {
        if (xma.m210041D3() || swh0.m186191G()) {
            lsi0.m151593w(R$string.f27135E0);
        } else {
            swh0.m186264s1(putongFrag.act(), "p_wallet,e_wallet_function_button,click_letter");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m54776i(View view) {
        lxh0.m152064a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m54777j() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.wwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188373a.m54784q(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m54778k() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.xwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194733a.m54785r(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m54779l() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ywh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200504a.m54786s(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m54780m() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.vwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183341a.m54787t(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m54781n() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.zwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205178a.m54788u(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m54782o() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.uwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178648a.m54789v(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54776i(this);
        this.f35635b.setMaxLines(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m54783p() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.axh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72185a.m54790w(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m54784q(View view) {
        if (j17.m139232I3()) {
            lsi0.m151595y(this.f35638e.m20604x4(R$string.f27423da));
        } else if (CoreModule.m29935P().m94651a().mo33507h5() && swh0.m186269v() && !xma.m210047L3()) {
            CoreModule.m29935P().m94651a().mo33572qm(this.f35638e.act(), "p_wallet,vas", Privilege.boost, null);
        } else if (swh0.m186217W() <= 0) {
            C8764c.m53445c1(this.f35638e.act(), "p_wallet,vas");
        } else if (!swh0.m186269v()) {
            CoreModule.m29935P().m94654e().mo34980dt(this.f35638e.act(), PurchaseType.TYPE_GET_BOOST, Privilege.boost, null);
        } else if (swh0.m186255p0().m186309c1()) {
            CoreModule.m29935P().m94651a().mo33327Go(this.f35638e.act(), null, PurchaseType.TYPE_GET_BOOST, false, true);
        } else {
            CoreModule.m29935P().m94651a().mo33619wi(this.f35638e.act(), false);
        }
        if (!j17.m139232I3()) {
            qib0.m174815e1("boost_purchase_shown", new Object[0]);
        }
        swh0.m186209O1(1, j17.m139232I3() || swh0.m186217W() > 0);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m54785r(View view) {
        if (swh0.m186183D()) {
            lsi0.m151593w(R$string.f27505k8);
        } else {
            new fd5.C16808e(this.f35638e.act()).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120951c(7).m120952d("p_wallet,e_wallet_function_button,click_greet").m120960l();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m54786s(View view) {
        if (CoreModule.m29935P().m94651a().mo33501fm()) {
            lsi0.m151593w(R$string.f27236N2);
        } else {
            swh0.m186264s1(this.f35638e.act(), "intl_letter_wallet");
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m54787t(View view) {
        if (CoreModule.m29935P().m94651a().mo33501fm()) {
            lsi0.m151593w(R$string.f27236N2);
        } else {
            swh0.m186264s1(this.f35638e.act(), "intl_letter_wallet");
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m54788u(View view) {
        o6j0.m162859c("e_wallet_read_receipt", this.f35638e.act().pageId(), new o6j0.C18854a[0]);
        swh0.m186280z(this.f35638e.act(), "p_wallet,vas");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m54789v(View view) {
        if (CoreModule.m29935P().m94651a().mo33340If() && CoreModule.m29935P().m94651a().mo33461ad() && CoreModule.m29935P().m94651a().mo33431Up()) {
            return;
        }
        boolean z = true;
        if (CoreModule.m29935P().m94651a().mo33461ad()) {
            lsi0.m151593w(R$string.f27435ea);
        } else if ((CoreModule.m29935P().m94651a().mo33637zg() && CoreModule.m29935P().m94651a().mo33468b3() >= 1) || (swh0.m186263s0() >= 1 && !CoreModule.f17545c.f19639e0.m169520na().isFemale())) {
            CoreModule.m29935P().m94651a().mo33478cm(this.f35638e.act(), true);
        } else if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            CoreModule.m29935P().m94651a().mo33309Eb(this.f35638e.act());
        } else {
            C8764c.m53479o1(this.f35638e.act(), null, CoreModule.m29935P().m94651a().mo33434Vl(), "p_messages_view,e_quickchat_button,click");
        }
        if (!CoreModule.m29935P().m94651a().mo33461ad() && swh0.m186263s0() <= 0) {
            z = false;
        }
        swh0.m186209O1(3, z);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m54790w(View view) {
        if (CoreModule.m29935P().m94651a().mo33368Mf()) {
            if (xma.m210043F3()) {
                lsi0.m151593w(R$string.f27447fa);
            } else if (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
                CoreModule.m29935P().m94651a().mo33561pg(this.f35638e.act(), null, 0, "p_wallet,vas");
            } else if (swh0.m186276x0() > 0) {
                lsi0.m151593w(R$string.f27447fa);
            } else {
                C8764c.m53403J1(this.f35638e.act(), "p_wallet,vas", Privilege.vip_super_like);
            }
        } else if (swh0.m186276x0() > 0) {
            lsi0.m151593w(R$string.f27447fa);
        } else if (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) || ura.m195053e().m195057d().mo33742Qi()) {
            C8764c.m53391F1(this.f35638e.act(), "p_wallet,vas");
        } else {
            C8764c.m53403J1(this.f35638e.act(), "p_wallet,vas", Privilege.vip_super_like);
        }
        swh0.m186209O1(2, swh0.m186276x0() > 0);
    }

    /* JADX INFO: renamed from: x */
    public void m54791x(final PutongFrag putongFrag, Privilege privilege) {
        String strM20604x4;
        this.f35638e = putongFrag;
        boolean zM139232I3 = false;
        switch (C8834a.f35639a[privilege.ordinal()]) {
            case 1:
                zM139232I3 = j17.m139232I3();
                String str = putongFrag.m20604x4(R$string.f27423da) + "...";
                String strM20604x5 = putongFrag.m20604x4(R$string.f27544o);
                if (!zM139232I3) {
                    str = strM20604x5;
                }
                String string = CoreModule.m29935P().m94651a().mo158345a2() ? "全程不间断优先推荐，让10倍的人优先滑到你" : getContext().getString(R$string.f27312U1);
                this.f35635b.setText(str);
                this.f35636c.setText(string);
                this.f35637d.setImageResource(d3c0.f83994kc);
                this.f35634a.setBackgroundResource(d3c0.f83907e9);
                m54777j();
                break;
            case 2:
                this.f35635b.setText(R$string.f27412d);
                this.f35636c.setText(R$string.f27186I7);
                this.f35637d.setImageResource(d3c0.f84019m9);
                this.f35634a.setBackgroundResource(d3c0.f84005l9);
                m54783p();
                break;
            case 3:
                this.f35635b.setText(R$string.f27234N0);
                this.f35636c.setText(R$string.f27124D0);
                this.f35637d.setImageResource(d3c0.f84035nb);
                this.f35634a.setBackgroundResource(d3c0.f84005l9);
                xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.twh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TanTanCoinItem.m54774g(putongFrag, view);
                    }
                });
                break;
            case 4:
                this.f35635b.setText(R$string.f27223M0);
                this.f35636c.setText(zz6.m221004u0() ? R$string.f27358Y3 : R$string.f27347X3);
                this.f35634a.setBackgroundResource(d3c0.f84005l9);
                this.f35637d.setImageResource(CoreModule.m29935P().m94651a().mo33445Xq());
                m54779l();
                break;
            case 5:
                this.f35635b.setText(R$string.f27223M0);
                this.f35636c.setText(zz6.m221004u0() ? R$string.f27358Y3 : R$string.f27347X3);
                this.f35634a.setBackgroundResource(d3c0.f83991k9);
                this.f35637d.setImageResource(d3c0.f83934g8);
                m54780m();
                break;
            case 6:
                zM139232I3 = (CoreModule.m29935P().m94651a().mo33340If() && CoreModule.m29935P().m94651a().mo33461ad() && CoreModule.m29935P().m94651a().mo33431Up()) ? false : CoreModule.m29935P().m94651a().mo33461ad();
                VText vText = this.f35635b;
                if (zM139232I3) {
                    strM20604x4 = putongFrag.m20604x4(R$string.f27468h7) + "...";
                } else {
                    strM20604x4 = putongFrag.m20604x4(R$string.f27384a7);
                }
                vText.setText(strM20604x4);
                this.f35636c.setText(R$string.f27432e7);
                this.f35637d.setImageResource(d3c0.f83977j9);
                this.f35634a.setBackgroundResource(d3c0.f83963i9);
                m54782o();
                break;
            case 7:
                this.f35635b.setText(R$string.f27517l8);
                this.f35636c.setText(R$string.f27643w8);
                this.f35637d.setImageResource(d3c0.f84008lc);
                this.f35634a.setBackgroundResource(d3c0.f83921f9);
                m54778k();
                break;
            case 8:
                this.f35635b.setText(R$string.f27143E8);
                xma xmaVar = CoreModule.f17545c.f19555C0;
                long jM210096w3 = xma.m210096w3(SummarizedPrivilegesId.get("intlReadMessage"));
                String string2 = putongFrag.act().getString(R$string.f27121C8);
                if (jM210096w3 != 0 && jM210096w3 > mqi0.m155944o()) {
                    string2 = putongFrag.act().getString(R$string.f27268Q1, mqi0.f135252d.format(Long.valueOf(jM210096w3)));
                }
                this.f35636c.setText(string2);
                this.f35637d.setImageResource(d3c0.f83949h9);
                this.f35634a.setBackgroundResource(d3c0.f83935g9);
                m54781n();
                break;
        }
        ImageView imageView = this.f35637d;
        if (zM139232I3) {
            imageView.setAlpha(0.5f);
            this.f35635b.setTextColor(getResources().getColor(b1c0.f72555j));
            this.f35636c.setTextColor(getResources().getColor(b1c0.f72555j));
        } else {
            imageView.setAlpha(1.0f);
            this.f35635b.setTextColor(getResources().getColor(b1c0.f72544d0));
            this.f35636c.setTextColor(getResources().getColor(b1c0.f72542c0));
        }
    }

    public TanTanCoinItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
