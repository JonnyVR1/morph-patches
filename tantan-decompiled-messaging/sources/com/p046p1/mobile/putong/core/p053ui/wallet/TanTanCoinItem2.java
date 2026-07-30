package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinItem2;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p147v.VText;
import p149l.b1c0;
import p149l.d3c0;
import p149l.e30;
import p149l.g30;
import p149l.kxh0;
import p149l.lsi0;
import p149l.mb90;
import p149l.mep0;
import p149l.mqi0;
import p149l.mvm;
import p149l.o6j0;
import p149l.qib0;
import p149l.swh0;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinItem2 extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TanTanCoinItem2 f38237d;

    /* JADX INFO: renamed from: e */
    public View f38238e;

    /* JADX INFO: renamed from: f */
    public ImageView f38239f;

    /* JADX INFO: renamed from: g */
    public VText f38240g;

    /* JADX INFO: renamed from: h */
    public VText f38241h;

    /* JADX INFO: renamed from: i */
    public PutongFrag f38242i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinItem2$a */
    public static /* synthetic */ class C9054a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38243a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f38243a = iArr;
            try {
                iArr[Privilege.immediately_match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38243a[Privilege.boost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38243a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38243a[Privilege.letter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38243a[Privilege.online_match_tickets_extra.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38243a[Privilege.compliment.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38243a[Privilege.intl_message_read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public TanTanCoinItem2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m58104l0(PutongFrag putongFrag, View view) {
        if (xma.m210041D3() || swh0.m186191G()) {
            lsi0.m151593w(R$string.f27135E0);
        } else {
            swh0.m186264s1(putongFrag.act(), "p_wallet,e_wallet_function_button,click_letter");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m58108p0(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m58109B0(View view) {
        o6j0.m162859c("e_wallet_instantmatch_btn", OMSDialogPositon.p_wallet, new o6j0.C18854a[0]);
        if (xma.m210040C3() || CoreModule.f17557o.m195057d().mo33767Ve()) {
            new mvm.C18569e(this.f38242i.act()).m156569b("p_wallet,e_wallet_instantmatch_btn,click").m156570c(new g30() { // from class: l.ixh0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    TanTanCoinItem2.m58108p0((PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m156571d();
            return;
        }
        if (xma.m210052Q3() > 0) {
            o6j0.m162864h("e_instantmatch_intercept_toast", OMSDialogPositon.p_wallet, o6j0.C18854a.m162878h("toast_type", "renew"));
            lsi0.m151593w(R$string.f27383a6);
        } else {
            o6j0.m162864h("e_instantmatch_intercept_toast", OMSDialogPositon.p_wallet, o6j0.C18854a.m162878h("toast_type", "get"));
            lsi0.m151593w(R$string.f27371Z5);
        }
        C8764c.m53408L0(this.f38242i.act(), "p_wallet,e_wallet_instantmatch_btn,click", new e30() { // from class: l.jxh0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19555C0.m210112u4();
            }
        }, null, null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m58110D0(View view) {
        o6j0.m162859c("e_wallet_read_receipt", this.f38242i.act().pageId(), new o6j0.C18854a[0]);
        swh0.m186280z(this.f38242i.act(), "p_wallet,vas");
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m58111E0(View view) {
        boolean z = true;
        if (CoreModule.m29935P().m94651a().mo33461ad()) {
            lsi0.m151593w(R$string.f27435ea);
        } else if ((CoreModule.m29935P().m94651a().mo33637zg() && CoreModule.m29935P().m94651a().mo33468b3() >= 1) || (swh0.m186263s0() >= 1 && !CoreModule.f17545c.f19639e0.m169520na().isFemale())) {
            CoreModule.m29935P().m94651a().mo33478cm(this.f38242i.act(), true);
        } else if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            ura.m195053e().m195057d().mo33792Zc(this.f38242i.act(), "use_up");
        } else {
            C8764c.m53479o1(this.f38242i.act(), null, CoreModule.m29935P().m94651a().mo33434Vl(), "p_messages_view,e_quickchat_button,click");
        }
        if (!CoreModule.m29935P().m94651a().mo33461ad() && swh0.m186263s0() <= 0) {
            z = false;
        }
        swh0.m186209O1(3, z);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m58112G0(View view) {
        if (CoreModule.m29935P().m94651a().mo33368Mf()) {
            if (xma.m210043F3()) {
                lsi0.m151593w(R$string.f27447fa);
            } else if (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
                CoreModule.m29935P().m94651a().mo33561pg(this.f38242i.act(), null, 0, "p_wallet,vas");
            } else if (swh0.m186276x0() > 0) {
                lsi0.m151593w(R$string.f27447fa);
            } else {
                CoreModule.m29935P().m94651a().mo33521i6(this.f38242i.act(), "p_wallet,vas", Privilege.vip_super_like);
            }
        } else if (swh0.m186276x0() > 0) {
            lsi0.m151593w(R$string.f27447fa);
        } else if (mb90.m153866b(PurchaseType.TYPE_SUPERLIKE_PKG) || ura.m195053e().m195057d().mo33742Qi()) {
            CoreModule.m29935P().m94651a().mo33429Uh(this.f38242i.act(), "p_wallet,vas");
        } else {
            CoreModule.m29935P().m94651a().mo33521i6(this.f38242i.act(), "p_wallet,vas", Privilege.vip_super_like);
        }
        swh0.m186209O1(2, swh0.m186276x0() > 0);
    }

    /* JADX INFO: renamed from: H0 */
    public void m58113H0(final PutongFrag putongFrag, Privilege privilege) {
        String strM20604x4;
        this.f38242i = putongFrag;
        Privilege privilege2 = Privilege.immediately_match;
        ImageView imageView = this.f38239f;
        boolean zMo33440X6 = false;
        if (privilege == privilege2) {
            xdl0.m208325C0(imageView, t100.m186890d(80.0f));
            xdl0.m208327D0(t100.m186890d(80.0f), this.f38239f);
        } else {
            xdl0.m208325C0(imageView, t100.m186890d(64.0f));
            xdl0.m208327D0(t100.m186890d(64.0f), this.f38239f);
        }
        switch (C9054a.f38243a[privilege.ordinal()]) {
            case 1:
                this.f38240g.setText(R$string.f27184I5);
                this.f38241h.setText(R$string.f27228M5);
                this.f38239f.setImageResource(d3c0.f84007lb);
                this.f38238e.setBackgroundColor(Color.parseColor("#F6DBFF"));
                m58117t0();
                break;
            case 2:
                zMo33440X6 = CoreModule.f17554l.m94651a().mo33440X6();
                String str = putongFrag.m20604x4(R$string.f27423da) + "...";
                String strM20604x5 = putongFrag.m20604x4(R$string.f27544o);
                if (!zMo33440X6) {
                    str = strM20604x5;
                }
                String string = getContext().getString(R$string.f27312U1);
                this.f38240g.setText(str);
                this.f38241h.setText(string);
                this.f38239f.setImageResource(d3c0.f83965ib);
                this.f38238e.setBackgroundColor(Color.parseColor("#ffeff4"));
                m58115r0();
                break;
            case 3:
                this.f38240g.setText(R$string.f27412d);
                this.f38241h.setText(R$string.f27186I7);
                this.f38239f.setImageResource(d3c0.f84119tb);
                this.f38238e.setBackgroundColor(Color.parseColor("#e9f9ff"));
                m58120w0();
                break;
            case 4:
                this.f38240g.setText(R$string.f27234N0);
                this.f38241h.setText(R$string.f27124D0);
                this.f38239f.setImageResource(d3c0.f84021mb);
                this.f38238e.setBackgroundColor(Color.parseColor("#e9f9ff"));
                xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.bxh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TanTanCoinItem2.m58104l0(putongFrag, view);
                    }
                });
                break;
            case 5:
                zMo33440X6 = CoreModule.m29935P().m94651a().mo33461ad();
                VText vText = this.f38240g;
                if (zMo33440X6) {
                    strM20604x4 = putongFrag.m20604x4(R$string.f27468h7) + "...";
                } else {
                    strM20604x4 = putongFrag.m20604x4(R$string.f27384a7);
                }
                vText.setText(strM20604x4);
                this.f38241h.setText(R$string.f27432e7);
                this.f38239f.setImageResource(d3c0.f84077qb);
                this.f38238e.setBackgroundColor(Color.parseColor("#ffeee5"));
                m58119v0();
                break;
            case 6:
                this.f38240g.setText(putongFrag.m20604x4(R$string.f27582r2));
                this.f38241h.setText(R$string.f27593s2);
                this.f38239f.setImageResource(d3c0.f83979jb);
                this.f38238e.setBackgroundColor(Color.parseColor("#FFF0C8"));
                m58116s0();
                zvf0.m220402x("e_intl_wallet_compliment_iap_click", OMSDialogPositon.p_wallet);
                break;
            case 7:
                this.f38240g.setText(R$string.f27143E8);
                xma xmaVar = CoreModule.f17545c.f19555C0;
                long jM210096w3 = xma.m210096w3(SummarizedPrivilegesId.get("intlReadMessage"));
                String string2 = putongFrag.act().getString(R$string.f27121C8);
                if (jM210096w3 != 0 && jM210096w3 > mqi0.m155944o()) {
                    string2 = putongFrag.act().getString(R$string.f27268Q1, mqi0.f135252d.format(Long.valueOf(jM210096w3)));
                }
                this.f38241h.setText(string2);
                this.f38239f.setImageResource(d3c0.f84147vb);
                this.f38238e.setBackgroundColor(Color.parseColor("#ffeff4"));
                m58118u0();
                break;
        }
        ImageView imageView2 = this.f38239f;
        if (zMo33440X6) {
            imageView2.setAlpha(0.5f);
            this.f38240g.setTextColor(getResources().getColor(b1c0.f72555j));
            this.f38241h.setTextColor(getResources().getColor(b1c0.f72555j));
        } else {
            imageView2.setAlpha(1.0f);
            this.f38240g.setTextColor(getResources().getColor(b1c0.f72544d0));
            this.f38241h.setTextColor(getResources().getColor(b1c0.f72542c0));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58114q0(this);
        mep0.m154302d1(this, t100.f167261j);
        this.f38240g.setMaxLines(2);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m58114q0(View view) {
        kxh0.m147760a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m58115r0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.hxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109871a.m58121y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m58116s0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.gxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104898a.m58122z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final void m58117t0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88288a.m58109B0(view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m58118u0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.fxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99764a.m58110D0(view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m58119v0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.cxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82876a.m58111E0(view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m58120w0() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.exh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93674a.m58112G0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m58121y0(View view) {
        if (CoreModule.m29935P().m94651a().mo33440X6()) {
            lsi0.m151595y(this.f38242i.m20604x4(R$string.f27423da));
        } else if (swh0.m186217W() <= 0) {
            C8764c.m53445c1(this.f38242i.act(), "p_wallet,vas");
        } else if (!swh0.m186269v()) {
            CoreModule.m29935P().m94654e().mo34980dt(this.f38242i.act(), PurchaseType.TYPE_GET_BOOST, Privilege.boost, null);
        } else if (swh0.m186255p0().m186309c1()) {
            CoreModule.m29935P().m94651a().mo33327Go(this.f38242i.act(), null, PurchaseType.TYPE_GET_BOOST, false, true);
        } else {
            CoreModule.m29935P().m94651a().mo33619wi(this.f38242i.act(), false);
        }
        if (!CoreModule.m29935P().m94651a().mo33440X6()) {
            qib0.m174815e1("boost_purchase_shown", new Object[0]);
        }
        swh0.m186209O1(1, CoreModule.m29935P().m94651a().mo33440X6() || swh0.m186217W() > 0);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m58122z0(View view) {
        zvf0.m220396r("e_intl_wallet_compliment_iap_click", OMSDialogPositon.p_wallet);
        C8764c.m53456g1(this.f38242i.act(), "p_wallet,vas");
    }

    public TanTanCoinItem2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinItem2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
