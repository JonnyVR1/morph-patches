package com.p000p1.mobile.putong.core.p004ui.wallet;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinItem2;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.b1c0;
import l.d30;
import l.d3c0;
import l.e30;
import l.g30;
import l.kxh0;
import l.lsi0;
import l.mb90;
import l.mep0;
import l.mqi0;
import l.mvm;
import l.o6j0;
import l.t100;
import l.xdl0;
import l.zvf0;
import p006l.qib0;
import p006l.swh0;
import p006l.ura;
import p006l.xma;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinItem2 extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TanTanCoinItem2 f8018d;

    /* JADX INFO: renamed from: e */
    public View f8019e;

    /* JADX INFO: renamed from: f */
    public ImageView f8020f;

    /* JADX INFO: renamed from: g */
    public VText f8021g;

    /* JADX INFO: renamed from: h */
    public VText f8022h;

    /* JADX INFO: renamed from: i */
    public PutongFrag f8023i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.wallet.TanTanCoinItem2$a */
    public static /* synthetic */ class C0490a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8024a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f8024a = iArr;
            try {
                iArr[Privilege.immediately_match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8024a[Privilege.boost.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8024a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8024a[Privilege.letter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8024a[Privilege.online_match_tickets_extra.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8024a[Privilege.compliment.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8024a[Privilege.intl_message_read.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public TanTanCoinItem2(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m11637l0(PutongFrag putongFrag, View view) {
        if (xma.m27349D3() || swh0.m24242G()) {
            lsi0.w(R.string.E0);
        } else {
            swh0.m24315s1(putongFrag.act(), "p_wallet,e_wallet_function_button,click_letter");
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m11641p0(PurchaseType purchaseType, Act act, String str) {
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m11642B0(View view) {
        o6j0.c("e_wallet_instantmatch_btn", "p_wallet", new o6j0.a[0]);
        if (xma.m27348C3() || CoreModule.f1546o.m25559d().m5704Ve()) {
            new mvm.e(this.f8023i.act()).b("p_wallet,e_wallet_instantmatch_btn,click").c(new g30() { // from class: l.ixh0
                /* JADX INFO: renamed from: a */
                public final void m17141a(Object obj, Object obj2, Object obj3) {
                    TanTanCoinItem2.m11641p0((PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).d();
            return;
        }
        if (xma.m27360Q3() > 0) {
            o6j0.h("e_instantmatch_intercept_toast", "p_wallet", new o6j0.a[]{o6j0.a.h("toast_type", "renew")});
            lsi0.w(R.string.a6);
        } else {
            o6j0.h("e_instantmatch_intercept_toast", "p_wallet", new o6j0.a[]{o6j0.a.h("toast_type", "get")});
            lsi0.w(R.string.Z5);
        }
        c.L0(this.f8023i.act(), "p_wallet,e_wallet_instantmatch_btn,click", new e30() { // from class: l.jxh0
            public final void call(Object obj) {
                CoreModule.f1534c.f3544C0.m27420u4();
            }
        }, (d30) null, (d30) null, Privilege.immediately_match);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m11643D0(View view) {
        o6j0.c("e_wallet_read_receipt", this.f8023i.act().pageId(), new o6j0.a[0]);
        swh0.m24331z(this.f8023i.act(), "p_wallet,vas");
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m11644E0(View view) {
        boolean z = true;
        if (CoreModule.m1854P().m11706a().m5398ad()) {
            lsi0.w(R.string.ea);
        } else if ((CoreModule.m1854P().m11706a().m5574zg() && CoreModule.m1854P().m11706a().m5405b3() >= 1) || (swh0.m24314s0() >= 1 && !CoreModule.f1534c.f3628e0.m21483na().isFemale())) {
            CoreModule.m1854P().m11706a().m5415cm(this.f8023i.act(), true);
        } else if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            ura.m25555e().m25559d().m5729Zc(this.f8023i.act(), "use_up");
        } else {
            c.o1(this.f8023i.act(), (e30) null, CoreModule.m1854P().m11706a().m5371Vl(), "p_messages_view,e_quickchat_button,click");
        }
        if (!CoreModule.m1854P().m11706a().m5398ad() && swh0.m24314s0() <= 0) {
            z = false;
        }
        swh0.m24260O1(3, z);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m11645G0(View view) {
        if (CoreModule.m1854P().m11706a().m5305Mf()) {
            if (xma.m27351F3()) {
                lsi0.w(R.string.fa);
            } else if (mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
                CoreModule.m1854P().m11706a().m5498pg(this.f8023i.act(), null, 0, "p_wallet,vas");
            } else if (swh0.m24327x0() > 0) {
                lsi0.w(R.string.fa);
            } else {
                CoreModule.m1854P().m11706a().m5458i6(this.f8023i.act(), "p_wallet,vas", Privilege.vip_super_like);
            }
        } else if (swh0.m24327x0() > 0) {
            lsi0.w(R.string.fa);
        } else if (mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG) || ura.m25555e().m25559d().m5679Qi()) {
            CoreModule.m1854P().m11706a().m5366Uh(this.f8023i.act(), "p_wallet,vas");
        } else {
            CoreModule.m1854P().m11706a().m5458i6(this.f8023i.act(), "p_wallet,vas", Privilege.vip_super_like);
        }
        swh0.m24260O1(2, swh0.m24327x0() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public void m11646H0(final PutongFrag putongFrag, Privilege privilege) {
        String strX4;
        this.f8023i = putongFrag;
        Privilege privilege2 = Privilege.immediately_match;
        ImageView imageView = this.f8020f;
        boolean zM5377X6 = false;
        if (privilege == privilege2) {
            xdl0.C0(imageView, t100.d(80.0f));
            xdl0.D0(t100.d(80.0f), new View[]{this.f8020f});
        } else {
            xdl0.C0(imageView, t100.d(64.0f));
            xdl0.D0(t100.d(64.0f), new View[]{this.f8020f});
        }
        switch (C0490a.f8024a[privilege.ordinal()]) {
            case 1:
                this.f8021g.setText(R.string.I5);
                this.f8022h.setText(R.string.M5);
                this.f8020f.setImageResource(d3c0.lb);
                this.f8019e.setBackgroundColor(Color.parseColor("#F6DBFF"));
                m11650t0();
                break;
            case 2:
                zM5377X6 = CoreModule.f1543l.m11706a().m5377X6();
                String str = putongFrag.x4(R.string.da) + "...";
                String strX5 = putongFrag.x4(R.string.o);
                if (!zM5377X6) {
                    str = strX5;
                }
                String string = getContext().getString(R.string.U1);
                this.f8021g.setText(str);
                this.f8022h.setText(string);
                this.f8020f.setImageResource(d3c0.ib);
                this.f8019e.setBackgroundColor(Color.parseColor("#ffeff4"));
                m11648r0();
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                this.f8021g.setText(R.string.d);
                this.f8022h.setText(R.string.I7);
                this.f8020f.setImageResource(d3c0.tb);
                this.f8019e.setBackgroundColor(Color.parseColor("#e9f9ff"));
                m11653w0();
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                this.f8021g.setText(R.string.N0);
                this.f8022h.setText(R.string.D0);
                this.f8020f.setImageResource(d3c0.mb);
                this.f8019e.setBackgroundColor(Color.parseColor("#e9f9ff"));
                xdl0.E0(this, new View.OnClickListener() { // from class: l.bxh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TanTanCoinItem2.m11637l0(putongFrag, view);
                    }
                });
                break;
            case 5:
                zM5377X6 = CoreModule.m1854P().m11706a().m5398ad();
                VText vText = this.f8021g;
                if (zM5377X6) {
                    strX4 = putongFrag.x4(R.string.h7) + "...";
                } else {
                    strX4 = putongFrag.x4(R.string.a7);
                }
                vText.setText(strX4);
                this.f8022h.setText(R.string.e7);
                this.f8020f.setImageResource(d3c0.qb);
                this.f8019e.setBackgroundColor(Color.parseColor("#ffeee5"));
                m11652v0();
                break;
            case 6:
                this.f8021g.setText(putongFrag.x4(R.string.r2));
                this.f8022h.setText(R.string.s2);
                this.f8020f.setImageResource(d3c0.jb);
                this.f8019e.setBackgroundColor(Color.parseColor("#FFF0C8"));
                m11649s0();
                zvf0.x("e_intl_wallet_compliment_iap_click", "p_wallet");
                break;
            case 7:
                this.f8021g.setText(R.string.E8);
                xma xmaVar = CoreModule.f1534c.f3544C0;
                long jM27404w3 = xma.m27404w3(SummarizedPrivilegesId.get("intlReadMessage"));
                String string2 = putongFrag.act().getString(R.string.C8);
                if (jM27404w3 != 0 && jM27404w3 > mqi0.o()) {
                    string2 = putongFrag.act().getString(R.string.Q1, mqi0.d.format(Long.valueOf(jM27404w3)));
                }
                this.f8022h.setText(string2);
                this.f8020f.setImageResource(d3c0.vb);
                this.f8019e.setBackgroundColor(Color.parseColor("#ffeff4"));
                m11651u0();
                break;
        }
        ImageView imageView2 = this.f8020f;
        if (zM5377X6) {
            imageView2.setAlpha(0.5f);
            this.f8021g.setTextColor(getResources().getColor(b1c0.j));
            this.f8022h.setTextColor(getResources().getColor(b1c0.j));
        } else {
            imageView2.setAlpha(1.0f);
            this.f8021g.setTextColor(getResources().getColor(b1c0.d0));
            this.f8022h.setTextColor(getResources().getColor(b1c0.c0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m11647q0(this);
        mep0.d1(this, t100.j);
        this.f8021g.setMaxLines(2);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m11647q0(View view) {
        kxh0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final void m11648r0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.hxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14118a.m11654y0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final void m11649s0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.gxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13562a.m11655z0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final void m11650t0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10641a.m11642B0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m11651u0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.fxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12962a.m11643D0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final void m11652v0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.cxh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9903a.m11644E0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public final void m11653w0() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.exh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11493a.m11645G0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m11654y0(View view) {
        if (CoreModule.m1854P().m11706a().m5377X6()) {
            lsi0.y(this.f8023i.x4(R.string.da));
        } else if (swh0.m24268W() <= 0) {
            c.c1(this.f8023i.act(), "p_wallet,vas");
        } else if (!swh0.m24320v()) {
            CoreModule.m1854P().m11709e().m6917dt(this.f8023i.act(), PurchaseType.TYPE_GET_BOOST, Privilege.boost, null);
        } else if (swh0.m24306p0().m24360c1()) {
            CoreModule.m1854P().m11706a().m5264Go(this.f8023i.act(), null, PurchaseType.TYPE_GET_BOOST, false, true);
        } else {
            CoreModule.m1854P().m11706a().m5556wi(this.f8023i.act(), false);
        }
        if (!CoreModule.m1854P().m11706a().m5377X6()) {
            qib0.m22159e1("boost_purchase_shown", new Object[0]);
        }
        swh0.m24260O1(1, CoreModule.m1854P().m11706a().m5377X6() || swh0.m24268W() > 0);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m11655z0(View view) {
        zvf0.r("e_intl_wallet_compliment_iap_click", "p_wallet");
        c.g1(this.f8023i.act(), "p_wallet,vas");
    }

    public TanTanCoinItem2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinItem2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
