package com.p051p1.mobile.putong.core.p058ui.wallet;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinItem2;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p151v.VText;
import p153l.a30;
import p153l.a5i0;
import p153l.bnl0;
import p153l.gta;
import p153l.h9c0;
import p153l.i4g0;
import p153l.jbc0;
import p153l.joa;
import p153l.nxm;
import p153l.o1j0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qj90;
import p153l.qnp0;
import p153l.s5i0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class TanTanCoinItem2 extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TanTanCoinItem2 f39085d;

    /* JADX INFO: renamed from: e */
    public View f39086e;

    /* JADX INFO: renamed from: f */
    public ImageView f39087f;

    /* JADX INFO: renamed from: g */
    public VText f39088g;

    /* JADX INFO: renamed from: h */
    public VText f39089h;

    /* JADX INFO: renamed from: i */
    public PutongFrag f39090i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinItem2$a */
    public static /* synthetic */ class C9217a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39091a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f39091a = iArr;
            try {
                iArr[Privilege.immediately_match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39091a[Privilege.boost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39091a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39091a[Privilege.letter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39091a[Privilege.online_match_tickets_extra.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39091a[Privilege.compliment.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39091a[Privilege.intl_message_read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public TanTanCoinItem2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m59287l0(PutongFrag putongFrag, View view) {
        if (joa.m146355E3() || a5i0.m96096G()) {
            o1j0.m165649w(R$string.f27983E0);
        } else {
            a5i0.m96169s1(putongFrag.act(), "p_wallet,e_wallet_function_button,click_letter");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m59291p0(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m59292B0(View view) {
        sfj0.m185596c("e_wallet_instantmatch_btn", OMSDialogPositon.p_wallet, new sfj0.C20032a[0]);
        if (joa.m146354D3() || CoreModule.f18276o.m132214d().mo34770Ve()) {
            new nxm.C18984e(this.f39090i.act()).m165204b("p_wallet,e_wallet_instantmatch_btn,click").m165205c(new a30() { // from class: l.q5i0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    TanTanCoinItem2.m59291p0((PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m165206d();
            return;
        }
        if (joa.m146366R3() > 0) {
            sfj0.m185601h("e_instantmatch_intercept_toast", OMSDialogPositon.p_wallet, sfj0.C20032a.m185615h("toast_type", "renew"));
            o1j0.m165649w(R$string.f28231a6);
        } else {
            sfj0.m185601h("e_instantmatch_intercept_toast", OMSDialogPositon.p_wallet, sfj0.C20032a.m185615h("toast_type", "get"));
            o1j0.m165649w(R$string.f28219Z5);
        }
        C8927c.m54591L0(this.f39090i.act(), "p_wallet,e_wallet_instantmatch_btn,click", new y20() { // from class: l.r5i0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20297C0.m146425v4();
            }
        }, null, null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m59293D0(View view) {
        sfj0.m185596c("e_wallet_read_receipt", this.f39090i.act().pageId(), new sfj0.C20032a[0]);
        a5i0.m96185z(this.f39090i.act(), "p_wallet,vas");
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m59294E0(View view) {
        boolean z = true;
        if (CoreModule.m30933P().m143405a().mo34464ad()) {
            o1j0.m165649w(R$string.f28283ea);
        } else if ((CoreModule.m30933P().m143405a().mo34640zg() && CoreModule.m30933P().m143405a().mo34471b3() >= 1) || (a5i0.m96168s0() >= 1 && !CoreModule.f18264c.f20381e0.m116593na().isFemale())) {
            CoreModule.m30933P().m143405a().mo34481cm(this.f39090i.act(), true);
        } else if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            gta.m132210e().m132214d().mo34795Zc(this.f39090i.act(), "use_up");
        } else {
            C8927c.m54662o1(this.f39090i.act(), null, CoreModule.m30933P().m143405a().mo34437Vl(), "p_messages_view,e_quickchat_button,click");
        }
        if (!CoreModule.m30933P().m143405a().mo34464ad() && a5i0.m96168s0() <= 0) {
            z = false;
        }
        a5i0.m96114O1(3, z);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m59295G0(View view) {
        if (CoreModule.m30933P().m143405a().mo34371Mf()) {
            if (joa.m146357G3()) {
                o1j0.m165649w(R$string.f28295fa);
            } else if (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
                CoreModule.m30933P().m143405a().mo34564pg(this.f39090i.act(), null, 0, "p_wallet,vas");
            } else if (a5i0.m96181x0() > 0) {
                o1j0.m165649w(R$string.f28295fa);
            } else {
                CoreModule.m30933P().m143405a().mo34524i6(this.f39090i.act(), "p_wallet,vas", Privilege.vip_super_like);
            }
        } else if (a5i0.m96181x0() > 0) {
            o1j0.m165649w(R$string.f28295fa);
        } else if (qj90.m176830b(PurchaseType.TYPE_SUPERLIKE_PKG) || gta.m132210e().m132214d().mo34745Qi()) {
            CoreModule.m30933P().m143405a().mo34432Uh(this.f39090i.act(), "p_wallet,vas");
        } else {
            CoreModule.m30933P().m143405a().mo34524i6(this.f39090i.act(), "p_wallet,vas", Privilege.vip_super_like);
        }
        a5i0.m96114O1(2, a5i0.m96181x0() > 0);
    }

    /* JADX INFO: renamed from: H0 */
    public void m59296H0(final PutongFrag putongFrag, Privilege privilege) {
        String strM21603x4;
        this.f39090i = putongFrag;
        Privilege privilege2 = Privilege.immediately_match;
        ImageView imageView = this.f39087f;
        boolean zMo34443X6 = false;
        if (privilege == privilege2) {
            bnl0.m105505C0(imageView, qa00.m175859d(80.0f));
            bnl0.m105507D0(qa00.m175859d(80.0f), this.f39087f);
        } else {
            bnl0.m105505C0(imageView, qa00.m175859d(64.0f));
            bnl0.m105507D0(qa00.m175859d(64.0f), this.f39087f);
        }
        switch (C9217a.f39091a[privilege.ordinal()]) {
            case 1:
                this.f39088g.setText(R$string.f28032I5);
                this.f39089h.setText(R$string.f28076M5);
                this.f39087f.setImageResource(jbc0.f119662lb);
                this.f39086e.setBackgroundColor(Color.parseColor("#F6DBFF"));
                m59300t0();
                break;
            case 2:
                zMo34443X6 = CoreModule.f18273l.m143405a().mo34443X6();
                String str = putongFrag.m21603x4(R$string.f28271da) + "...";
                String strM21603x5 = putongFrag.m21603x4(R$string.f28392o);
                if (!zMo34443X6) {
                    str = strM21603x5;
                }
                String string = getContext().getString(R$string.f28160U1);
                this.f39088g.setText(str);
                this.f39089h.setText(string);
                this.f39087f.setImageResource(jbc0.f119620ib);
                this.f39086e.setBackgroundColor(Color.parseColor("#ffeff4"));
                m59298r0();
                break;
            case 3:
                this.f39088g.setText(R$string.f28260d);
                this.f39089h.setText(R$string.f28034I7);
                this.f39087f.setImageResource(jbc0.f119774tb);
                this.f39086e.setBackgroundColor(Color.parseColor("#e9f9ff"));
                m59303w0();
                break;
            case 4:
                this.f39088g.setText(R$string.f28082N0);
                this.f39089h.setText(R$string.f27972D0);
                this.f39087f.setImageResource(jbc0.f119676mb);
                this.f39086e.setBackgroundColor(Color.parseColor("#e9f9ff"));
                bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.j5i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TanTanCoinItem2.m59287l0(putongFrag, view);
                    }
                });
                break;
            case 5:
                zMo34443X6 = CoreModule.m30933P().m143405a().mo34464ad();
                VText vText = this.f39088g;
                if (zMo34443X6) {
                    strM21603x4 = putongFrag.m21603x4(R$string.f28316h7) + "...";
                } else {
                    strM21603x4 = putongFrag.m21603x4(R$string.f28232a7);
                }
                vText.setText(strM21603x4);
                this.f39089h.setText(R$string.f28280e7);
                this.f39087f.setImageResource(jbc0.f119732qb);
                this.f39086e.setBackgroundColor(Color.parseColor("#ffeee5"));
                m59302v0();
                break;
            case 6:
                this.f39088g.setText(putongFrag.m21603x4(R$string.f28430r2));
                this.f39089h.setText(R$string.f28441s2);
                this.f39087f.setImageResource(jbc0.f119634jb);
                this.f39086e.setBackgroundColor(Color.parseColor("#FFF0C8"));
                m59299s0();
                i4g0.m138526x("e_intl_wallet_compliment_iap_click", OMSDialogPositon.p_wallet);
                break;
            case 7:
                this.f39088g.setText(R$string.f27991E8);
                joa joaVar = CoreModule.f18264c.f20297C0;
                long jM146411x3 = joa.m146411x3(SummarizedPrivilegesId.get("intlReadMessage"));
                String string2 = putongFrag.act().getString(R$string.f27969C8);
                if (jM146411x3 != 0 && jM146411x3 > pzi0.m174454o()) {
                    string2 = putongFrag.act().getString(R$string.f28116Q1, pzi0.f154857d.format(Long.valueOf(jM146411x3)));
                }
                this.f39089h.setText(string2);
                this.f39087f.setImageResource(jbc0.f119802vb);
                this.f39086e.setBackgroundColor(Color.parseColor("#ffeff4"));
                m59301u0();
                break;
        }
        ImageView imageView2 = this.f39087f;
        if (zMo34443X6) {
            imageView2.setAlpha(0.5f);
            this.f39088g.setTextColor(getResources().getColor(h9c0.f108375j));
            this.f39089h.setTextColor(getResources().getColor(h9c0.f108375j));
        } else {
            imageView2.setAlpha(1.0f);
            this.f39088g.setTextColor(getResources().getColor(h9c0.f108364d0));
            this.f39089h.setTextColor(getResources().getColor(h9c0.f108362c0));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59297q0(this);
        qnp0.m177261d1(this, qa00.f156323j);
        this.f39088g.setMaxLines(2);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m59297q0(View view) {
        s5i0.m184674a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m59298r0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.p5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150656a.m59304y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final void m59299s0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.o5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145087a.m59305z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public final void m59300t0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.l5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130122a.m59292B0(view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m59301u0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.n5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140367a.m59293D0(view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m59302v0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.k5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124070a.m59294E0(view);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final void m59303w0() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.m5i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134901a.m59295G0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m59304y0(View view) {
        if (CoreModule.m30933P().m143405a().mo34443X6()) {
            o1j0.m165651y(this.f39090i.m21603x4(R$string.f28271da));
        } else if (a5i0.m96122W() <= 0) {
            C8927c.m54628c1(this.f39090i.act(), "p_wallet,vas");
        } else if (!a5i0.m96174v()) {
            CoreModule.m30933P().m143408e().mo35983dt(this.f39090i.act(), PurchaseType.TYPE_GET_BOOST, Privilege.boost, null);
        } else if (a5i0.m96160p0().m96214c1()) {
            CoreModule.m30933P().m143405a().mo34330Go(this.f39090i.act(), null, PurchaseType.TYPE_GET_BOOST, false, true);
        } else {
            CoreModule.m30933P().m143405a().mo34622wi(this.f39090i.act(), false);
        }
        if (!CoreModule.m30933P().m143405a().mo34443X6()) {
            uqb0.m197269e1("boost_purchase_shown", new Object[0]);
        }
        a5i0.m96114O1(1, CoreModule.m30933P().m143405a().mo34443X6() || a5i0.m96122W() > 0);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m59305z0(View view) {
        i4g0.m138520r("e_intl_wallet_compliment_iap_click", OMSDialogPositon.p_wallet);
        C8927c.m54639g1(this.f39090i.act(), "p_wallet,vas");
    }

    public TanTanCoinItem2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinItem2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
