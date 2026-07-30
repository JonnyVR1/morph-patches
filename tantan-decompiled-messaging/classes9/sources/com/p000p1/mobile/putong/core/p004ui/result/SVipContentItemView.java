package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.ah60;
import l.b1c0;
import l.d3c0;
import l.dac0;
import l.e30;
import l.fy80;
import l.hmb;
import l.i0g0;
import l.mkd0;
import l.n3b0;
import l.nu0;
import l.t100;
import l.vwb;
import l.w9j;
import l.wnd0;
import l.xdl0;
import l.zz6;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import p006l.xma;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SVipContentItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5389a;

    /* JADX INFO: renamed from: b */
    public ImageView f5390b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5391c;

    /* JADX INFO: renamed from: d */
    public VImage f5392d;

    /* JADX INFO: renamed from: e */
    public TextView f5393e;

    /* JADX INFO: renamed from: f */
    public VText f5394f;

    /* JADX INFO: renamed from: g */
    public ImageView f5395g;

    /* JADX INFO: renamed from: h */
    public VText f5396h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5397i;

    /* JADX INFO: renamed from: j */
    public ImageView f5398j;

    /* JADX INFO: renamed from: k */
    public VText f5399k;

    /* JADX INFO: renamed from: l */
    public View f5400l;

    /* JADX INFO: renamed from: m */
    public Act f5401m;

    /* JADX INFO: renamed from: n */
    public boolean f5402n;

    /* JADX INFO: renamed from: o */
    public RoamedLocationData f5403o;

    /* JADX INFO: renamed from: p */
    public PurchaseType f5404p;

    public SVipContentItemView(Context context) {
        super(context);
        this.f5402n = false;
        this.f5403o = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: j */
    public final void m8106j(View view) {
        wnd0.a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m8107k(@DrawableRes int i) {
        return nu0.b(getContext(), i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m8108l(RoamedLocationData roamedLocationData) {
        this.f5403o = roamedLocationData;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8109m(View view) {
        CoreModule.m1854P().m11706a().m5330Q8(this.f5401m, this.f5403o);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m8110n(CoreLikers.C0145a c0145a) {
        int i = c0145a.f3259b;
        User user = (User) vwb.l0(c0145a.f3265h);
        if (CoreModule.m1854P().m11706a().m19710B()) {
            user = (User) vwb.l0(c0145a.f3262e);
        }
        xdl0.M(this.f5398j, i == 0);
        xdl0.M(this.f5399k, i > 0);
        if (!n3b0.q()) {
            xdl0.M(this.f5393e, false);
            int i2 = t100.e;
            if (i == 0 || user == null) {
                this.f5391c.setBackgroundResource(0);
                this.f5391c.setPadding(0, 0, 0, 0);
                qib0.f19782G.m12767Y0(this.f5391c, d3c0.Wa);
                this.f5392d.setVisibility(4);
                this.f5394f.setText(R.string.M6);
                this.f5396h.setText(R.string.L6);
            } else {
                this.f5391c.setBackgroundResource(d3c0.K);
                this.f5391c.setPadding(i2, i2, i2, i2);
                qib0.f19782G.m12754Q0(this.f5391c, user.fp().profileSmall());
                this.f5392d.setVisibility(0);
                this.f5394f.setText(this.f5401m.getString(R.string.J6, i0g0.G(i)));
                this.f5396h.setText(R.string.K6);
            }
            this.f5394f.requestLayout();
            return;
        }
        if (CoreModule.m1854P().m11706a().m19710B()) {
            xdl0.M(this.f5393e, false);
            xdl0.M(this.f5392d, true);
            qib0.f19782G.m12767Y0(this.f5391c, zz6.u0() ? d3c0.H3 : d3c0.G3);
            if (i > 0) {
                this.f5394f.setText(this.f5401m.getString(R.string.J6, i0g0.G(i)));
            }
            this.f5396h.setText(R.string.b2);
            return;
        }
        if (!NullChecker.a(user)) {
            xdl0.M(this.f5393e, false);
            xdl0.M(this.f5392d, true);
            qib0.f19782G.m12767Y0(this.f5391c, zz6.u0() ? d3c0.H3 : d3c0.G3);
            this.f5394f.setText(R.string.N6);
            this.f5396h.setText(R.string.k7);
            return;
        }
        qib0.f19782G.m12749O(this.f5391c, user.fp().profileSmall().formatted(), 2, 8);
        xdl0.M(this.f5392d, false);
        xdl0.M(this.f5393e, true);
        this.f5393e.setText(i0g0.G(i));
        if (i > 0) {
            this.f5394f.setText(CoreModule.f1543l.m11706a().m5353Td(i));
            this.f5396h.setText(CoreModule.f1543l.m11706a().m5238Cs(CoreModule.f1534c.f3628e0.m21490p9(), user));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m8111o(dac0<Privilege> dac0Var, final Privilege privilege, final VipContentItemView.InterfaceC0274a interfaceC0274a, boolean z, PurchaseType purchaseType) {
        this.f5404p = purchaseType;
        xdl0.M(this.f5400l, z);
        wx80 wx80VarL = fy80.l(privilege);
        if (NullChecker.a(wx80VarL)) {
            if (wx80VarL.m26839j() != 0 && Privilege.see_who_likes_me != privilege && Privilege.see_not_match_guide != privilege) {
                if (Privilege.vip_greet == privilege) {
                    this.f5390b.setImageDrawable(m8107k(d3c0.S9));
                } else if (Privilege.leave_message == privilege) {
                    this.f5390b.setImageDrawable(m8107k(d3c0.u0));
                } else if (Privilege.message_read_state == privilege) {
                    this.f5390b.setImageDrawable(m8107k(d3c0.v0));
                } else if (Privilege.greet == privilege) {
                    this.f5390b.setImageDrawable(m8107k(d3c0.t0));
                } else {
                    Privilege privilege2 = Privilege.recover_unmatches;
                    ImageView imageView = this.f5390b;
                    if (privilege2 == privilege) {
                        imageView.setImageDrawable(m8107k(d3c0.w0));
                    } else {
                        imageView.setImageDrawable(m8107k(wx80VarL.m26839j()));
                    }
                }
                xdl0.M(this.f5391c, false);
                xdl0.M(this.f5399k, false);
                xdl0.M(this.f5398j, true);
                xdl0.M(this.f5393e, false);
                xdl0.M(this.f5390b, true);
                xdl0.M(this.f5392d, false);
            } else if (Privilege.see_who_likes_me == privilege) {
                m8114r(dac0Var);
            }
            m8113q(privilege, wx80VarL);
            m8112p(privilege, wx80VarL);
            if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || !xma.m27379e4()) {
                if (wx80VarL.m26847r() <= 0 || wx80VarL.m26841l() != Privilege.vip_location || this.f5402n) {
                    this.f5396h.setTextColor(getResources().getColor(b1c0.f0));
                } else {
                    this.f5396h.setTextColor(getResources().getColor(wx80VarL.m26847r()));
                }
                this.f5401m.duringCreated(CoreModule.f1534c.f3646k0.f4077R.k()).take(1).subscribe(mkd0.G(new e30() { // from class: l.nnd0
                    public final void call(Object obj) {
                        this.f17754a.m8108l((RoamedLocationData) obj);
                    }
                }));
                if (privilege == Privilege.vip_location && !this.f5402n) {
                    this.f5396h.setOnClickListener(new View.OnClickListener() { // from class: l.ond0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f18293a.m8109m(view);
                        }
                    });
                } else if (!NullChecker.a(interfaceC0274a) || this.f5402n) {
                    this.f5396h.setOnClickListener(null);
                } else {
                    this.f5396h.setOnClickListener(new View.OnClickListener() { // from class: l.pnd0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            interfaceC0274a.mo8251a(privilege);
                        }
                    });
                }
            }
        }
        if (privilege == Privilege.vip_badge) {
            this.f5395g.setVisibility(0);
            this.f5395g.setImageResource(CoreModule.m1854P().m11709e().m6916cc());
        } else {
            Privilege privilege3 = Privilege.svip_badge;
            ImageView imageView2 = this.f5395g;
            if (privilege == privilege3) {
                imageView2.setVisibility(0);
                this.f5395g.setImageResource(d3c0.Ya);
            } else {
                imageView2.setVisibility(8);
            }
        }
        if (this.f5402n) {
            setOnClickListener(null);
        } else if (NullChecker.a(interfaceC0274a)) {
            setOnClickListener(new View.OnClickListener() { // from class: l.qnd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC0274a.mo8251a(privilege);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8106j(this);
        this.f5401m = xdl0.E(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m8112p(Privilege privilege, wx80 wx80Var) {
        if (privilege == Privilege.see_who_likes_me) {
            return;
        }
        this.f5396h.setText(wx80Var.m26846q());
    }

    /* JADX INFO: renamed from: q */
    public final void m8113q(Privilege privilege, wx80 wx80Var) {
        if (privilege == Privilege.see_who_likes_me) {
            return;
        }
        if (privilege != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) {
            this.f5394f.setText(wx80Var.m26849t());
        } else {
            this.f5394f.setText(getContext().getString(R.string.b9, 5));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8114r(dac0<Privilege> dac0Var) {
        xdl0.M(this.f5391c, true);
        xdl0.M(this.f5390b, false);
        xdl0.M(this.f5398j, true);
        xdl0.M(this.f5399k, false);
        xdl0.M(this.f5393e, false);
        xdl0.M(this.f5392d, true);
        qib0.f19782G.m12767Y0(this.f5391c, zz6.u0() ? d3c0.H3 : d3c0.G3);
        this.f5394f.setText(R.string.N6);
        this.f5396h.setText(R.string.K6);
        dac0Var.c(this.f5401m, CoreModule.f1534c.f3676u0.m2333O6().mergeWith(ah60.E().filter(new w9j() { // from class: l.rnd0
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new w9j() { // from class: l.snd0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3544C0.m27422x3().distinctUntilChanged().skip(1).take(1);
            }
        }).map(new w9j() { // from class: l.tnd0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3676u0.m2399r5();
            }
        }))).filter(new w9j() { // from class: l.und0
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreLikers.C0145a) obj).f3258a == CoreLikers.LikersTriggerBy.my_privilege_liker);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vnd0
            public final void call(Object obj) {
                this.f24390a.m8110n((CoreLikers.C0145a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m8115s() {
        getLayoutParams().height = t100.d(hmb.m1() * 65.0f);
        this.f5389a.getLayoutParams().height = t100.d(hmb.m1() * 42.0f);
        this.f5389a.getLayoutParams().width = t100.d(hmb.m1() * 42.0f);
        xdl0.M(this.f5397i, false);
        this.f5402n = true;
    }

    public SVipContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5402n = false;
        this.f5403o = RoamedLocationData.new_();
    }
}
