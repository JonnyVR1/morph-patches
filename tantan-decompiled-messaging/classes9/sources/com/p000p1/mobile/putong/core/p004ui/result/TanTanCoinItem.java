package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.result.TanTanCoinItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.fd5;
import l.lsi0;
import l.lxh0;
import l.mb90;
import l.mqi0;
import l.o6j0;
import l.xdl0;
import l.zz6;
import p006l.j17;
import p006l.qib0;
import p006l.swh0;
import p006l.ura;
import p006l.xma;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TanTanCoinItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TanTanCoinItem f5415a;

    /* JADX INFO: renamed from: b */
    public VText f5416b;

    /* JADX INFO: renamed from: c */
    public VText f5417c;

    /* JADX INFO: renamed from: d */
    public ImageView f5418d;

    /* JADX INFO: renamed from: e */
    public PutongFrag f5419e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.TanTanCoinItem$a */
    public static /* synthetic */ class C0270a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5420a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f5420a = iArr;
            try {
                iArr[Privilege.boost.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5420a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5420a[Privilege.letter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5420a[Privilege.vip_letter_gp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5420a[Privilege.see_letter_gp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5420a[Privilege.online_match_tickets_extra.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5420a[Privilege.see_greet_gp.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5420a[Privilege.intl_message_read.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public TanTanCoinItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8132g(PutongFrag putongFrag, View view) {
        if (xma.m27349D3() || swh0.m24242G()) {
            lsi0.w(R.string.E0);
        } else {
            swh0.m24315s1(putongFrag.act(), "p_wallet,e_wallet_function_button,click_letter");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8134i(View view) {
        lxh0.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m8135j() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.wwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25443a.m8142q(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m8136k() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.xwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27762a.m8143r(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m8137l() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.ywh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28452a.m8144s(view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m8138m() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.vwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24506a.m8145t(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m8139n() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.zwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29008a.m8146u(view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m8140o() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.uwh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23782a.m8147v(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8134i(this);
        this.f5416b.setMaxLines(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m8141p() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.axh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8587a.m8148w(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8142q(View view) {
        if (j17.m17182I3()) {
            lsi0.y(this.f5419e.x4(R.string.da));
        } else if (CoreModule.m1854P().m11706a().m5444h5() && swh0.m24320v() && !xma.m27355L3()) {
            CoreModule.m1854P().m11706a().m5509qm(this.f5419e.act(), "p_wallet,vas", Privilege.boost, null);
        } else if (swh0.m24268W() <= 0) {
            c.c1(this.f5419e.act(), "p_wallet,vas");
        } else if (!swh0.m24320v()) {
            CoreModule.m1854P().m11709e().m6917dt(this.f5419e.act(), PurchaseType.TYPE_GET_BOOST, Privilege.boost, null);
        } else if (swh0.m24306p0().m24360c1()) {
            CoreModule.m1854P().m11706a().m5264Go(this.f5419e.act(), null, PurchaseType.TYPE_GET_BOOST, false, true);
        } else {
            CoreModule.m1854P().m11706a().m5556wi(this.f5419e.act(), false);
        }
        if (!j17.m17182I3()) {
            qib0.m22159e1("boost_purchase_shown", new Object[0]);
        }
        swh0.m24260O1(1, j17.m17182I3() || swh0.m24268W() > 0);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m8143r(View view) {
        if (swh0.m24234D()) {
            lsi0.w(R.string.k8);
        } else {
            new fd5.e(this.f5419e.act()).j(PurchaseType.TYPE_INTL_TTT_COIN).c(7).d("p_wallet,e_wallet_function_button,click_greet").l();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8144s(View view) {
        if (CoreModule.m1854P().m11706a().m5438fm()) {
            lsi0.w(R.string.N2);
        } else {
            swh0.m24315s1(this.f5419e.act(), "intl_letter_wallet");
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m8145t(View view) {
        if (CoreModule.m1854P().m11706a().m5438fm()) {
            lsi0.w(R.string.N2);
        } else {
            swh0.m24315s1(this.f5419e.act(), "intl_letter_wallet");
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m8146u(View view) {
        o6j0.c("e_wallet_read_receipt", this.f5419e.act().pageId(), new o6j0.a[0]);
        swh0.m24331z(this.f5419e.act(), "p_wallet,vas");
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m8147v(View view) {
        if (CoreModule.m1854P().m11706a().m5277If() && CoreModule.m1854P().m11706a().m5398ad() && CoreModule.m1854P().m11706a().m5368Up()) {
            return;
        }
        boolean z = true;
        if (CoreModule.m1854P().m11706a().m5398ad()) {
            lsi0.w(R.string.ea);
        } else if ((CoreModule.m1854P().m11706a().m5574zg() && CoreModule.m1854P().m11706a().m5405b3() >= 1) || (swh0.m24314s0() >= 1 && !CoreModule.f1534c.f3628e0.m21483na().isFemale())) {
            CoreModule.m1854P().m11706a().m5415cm(this.f5419e.act(), true);
        } else if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            CoreModule.m1854P().m11706a().m5246Eb(this.f5419e.act());
        } else {
            c.o1(this.f5419e.act(), (e30) null, CoreModule.m1854P().m11706a().m5371Vl(), "p_messages_view,e_quickchat_button,click");
        }
        if (!CoreModule.m1854P().m11706a().m5398ad() && swh0.m24314s0() <= 0) {
            z = false;
        }
        swh0.m24260O1(3, z);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8148w(View view) {
        if (CoreModule.m1854P().m11706a().m5305Mf()) {
            if (xma.m27351F3()) {
                lsi0.w(R.string.fa);
            } else if (mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG)) {
                CoreModule.m1854P().m11706a().m5498pg(this.f5419e.act(), null, 0, "p_wallet,vas");
            } else if (swh0.m24327x0() > 0) {
                lsi0.w(R.string.fa);
            } else {
                c.J1(this.f5419e.act(), "p_wallet,vas", Privilege.vip_super_like);
            }
        } else if (swh0.m24327x0() > 0) {
            lsi0.w(R.string.fa);
        } else if (mb90.b(PurchaseType.TYPE_SUPERLIKE_PKG) || ura.m25555e().m25559d().m5679Qi()) {
            c.F1(this.f5419e.act(), "p_wallet,vas");
        } else {
            c.J1(this.f5419e.act(), "p_wallet,vas", Privilege.vip_super_like);
        }
        swh0.m24260O1(2, swh0.m24327x0() > 0);
    }

    /* JADX INFO: renamed from: x */
    public void m8149x(final PutongFrag putongFrag, Privilege privilege) {
        String strX4;
        this.f5419e = putongFrag;
        boolean zM17182I3 = false;
        switch (C0270a.f5420a[privilege.ordinal()]) {
            case 1:
                zM17182I3 = j17.m17182I3();
                String str = putongFrag.x4(R.string.da) + "...";
                String strX5 = putongFrag.x4(R.string.o);
                if (!zM17182I3) {
                    str = strX5;
                }
                String string = CoreModule.m1854P().m11706a().m19853a2() ? "全程不间断优先推荐，让10倍的人优先滑到你" : getContext().getString(R.string.U1);
                this.f5416b.setText(str);
                this.f5417c.setText(string);
                this.f5418d.setImageResource(d3c0.kc);
                this.f5415a.setBackgroundResource(d3c0.e9);
                m8135j();
                break;
            case 2:
                this.f5416b.setText(R.string.d);
                this.f5417c.setText(R.string.I7);
                this.f5418d.setImageResource(d3c0.m9);
                this.f5415a.setBackgroundResource(d3c0.l9);
                m8141p();
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                this.f5416b.setText(R.string.N0);
                this.f5417c.setText(R.string.D0);
                this.f5418d.setImageResource(d3c0.nb);
                this.f5415a.setBackgroundResource(d3c0.l9);
                xdl0.E0(this, new View.OnClickListener() { // from class: l.twh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TanTanCoinItem.m8132g(putongFrag, view);
                    }
                });
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                this.f5416b.setText(R.string.M0);
                this.f5417c.setText(zz6.u0() ? R.string.Y3 : R.string.X3);
                this.f5415a.setBackgroundResource(d3c0.l9);
                this.f5418d.setImageResource(CoreModule.m1854P().m11706a().m5382Xq());
                m8137l();
                break;
            case 5:
                this.f5416b.setText(R.string.M0);
                this.f5417c.setText(zz6.u0() ? R.string.Y3 : R.string.X3);
                this.f5415a.setBackgroundResource(d3c0.k9);
                this.f5418d.setImageResource(d3c0.g8);
                m8138m();
                break;
            case 6:
                zM17182I3 = (CoreModule.m1854P().m11706a().m5277If() && CoreModule.m1854P().m11706a().m5398ad() && CoreModule.m1854P().m11706a().m5368Up()) ? false : CoreModule.m1854P().m11706a().m5398ad();
                VText vText = this.f5416b;
                if (zM17182I3) {
                    strX4 = putongFrag.x4(R.string.h7) + "...";
                } else {
                    strX4 = putongFrag.x4(R.string.a7);
                }
                vText.setText(strX4);
                this.f5417c.setText(R.string.e7);
                this.f5418d.setImageResource(d3c0.j9);
                this.f5415a.setBackgroundResource(d3c0.i9);
                m8140o();
                break;
            case 7:
                this.f5416b.setText(R.string.l8);
                this.f5417c.setText(R.string.w8);
                this.f5418d.setImageResource(d3c0.lc);
                this.f5415a.setBackgroundResource(d3c0.f9);
                m8136k();
                break;
            case 8:
                this.f5416b.setText(R.string.E8);
                xma xmaVar = CoreModule.f1534c.f3544C0;
                long jM27404w3 = xma.m27404w3(SummarizedPrivilegesId.get("intlReadMessage"));
                String string2 = putongFrag.act().getString(R.string.C8);
                if (jM27404w3 != 0 && jM27404w3 > mqi0.o()) {
                    string2 = putongFrag.act().getString(R.string.Q1, mqi0.d.format(Long.valueOf(jM27404w3)));
                }
                this.f5417c.setText(string2);
                this.f5418d.setImageResource(d3c0.h9);
                this.f5415a.setBackgroundResource(d3c0.g9);
                m8139n();
                break;
        }
        ImageView imageView = this.f5418d;
        if (zM17182I3) {
            imageView.setAlpha(0.5f);
            this.f5416b.setTextColor(getResources().getColor(b1c0.j));
            this.f5417c.setTextColor(getResources().getColor(b1c0.j));
        } else {
            imageView.setAlpha(1.0f);
            this.f5416b.setTextColor(getResources().getColor(b1c0.d0));
            this.f5417c.setTextColor(getResources().getColor(b1c0.c0));
        }
    }

    public TanTanCoinItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
