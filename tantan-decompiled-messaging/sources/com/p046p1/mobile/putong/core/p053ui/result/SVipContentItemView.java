package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ah60;
import p149l.b1c0;
import p149l.d3c0;
import p149l.dac0;
import p149l.e30;
import p149l.fy80;
import p149l.hmb;
import p149l.i0g0;
import p149l.mkd0;
import p149l.n3b0;
import p149l.nu0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.wnd0;
import p149l.wx80;
import p149l.xdl0;
import p149l.xma;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class SVipContentItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35608a;

    /* JADX INFO: renamed from: b */
    public ImageView f35609b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35610c;

    /* JADX INFO: renamed from: d */
    public VImage f35611d;

    /* JADX INFO: renamed from: e */
    public TextView f35612e;

    /* JADX INFO: renamed from: f */
    public VText f35613f;

    /* JADX INFO: renamed from: g */
    public ImageView f35614g;

    /* JADX INFO: renamed from: h */
    public VText f35615h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f35616i;

    /* JADX INFO: renamed from: j */
    public ImageView f35617j;

    /* JADX INFO: renamed from: k */
    public VText f35618k;

    /* JADX INFO: renamed from: l */
    public View f35619l;

    /* JADX INFO: renamed from: m */
    public Act f35620m;

    /* JADX INFO: renamed from: n */
    public boolean f35621n;

    /* JADX INFO: renamed from: o */
    public RoamedLocationData f35622o;

    /* JADX INFO: renamed from: p */
    public PurchaseType f35623p;

    public SVipContentItemView(Context context) {
        super(context);
        this.f35621n = false;
        this.f35622o = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: j */
    public final void m54748j(View view) {
        wnd0.m204677a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m54749k(@DrawableRes int i) {
        return nu0.m161424b(getContext(), i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m54750l(RoamedLocationData roamedLocationData) {
        this.f35622o = roamedLocationData;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m54751m(View view) {
        CoreModule.m29935P().m94651a().mo33393Q8(this.f35620m, this.f35622o);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m54752n(CoreLikers.C4719a c4719a) {
        int i = c4719a.f19270b;
        User user = (User) vwb.m200336l0(c4719a.f19276h);
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            user = (User) vwb.m200336l0(c4719a.f19273e);
        }
        xdl0.m208344M(this.f35617j, i == 0);
        xdl0.m208344M(this.f35618k, i > 0);
        if (!n3b0.m157742q()) {
            xdl0.m208344M(this.f35612e, false);
            int i2 = t100.f167256e;
            if (i == 0 || user == null) {
                this.f35610c.setBackgroundResource(0);
                this.f35610c.setPadding(0, 0, 0, 0);
                qib0.f154691G.m102354Y0(this.f35610c, d3c0.f83800Wa);
                this.f35611d.setVisibility(4);
                this.f35613f.setText(R$string.f27229M6);
                this.f35615h.setText(R$string.f27218L6);
            } else {
                this.f35610c.setBackgroundResource(d3c0.f83627K);
                this.f35610c.setPadding(i2, i2, i2, i2);
                qib0.f154691G.m102341Q0(this.f35610c, user.m60124fp().profileSmall());
                this.f35611d.setVisibility(0);
                this.f35613f.setText(this.f35620m.getString(R$string.f27196J6, i0g0.m133840G(i)));
                this.f35615h.setText(R$string.f27207K6);
            }
            this.f35613f.requestLayout();
            return;
        }
        if (CoreModule.m29935P().m94651a().mo158204B()) {
            xdl0.m208344M(this.f35612e, false);
            xdl0.m208344M(this.f35611d, true);
            qib0.f154691G.m102354Y0(this.f35610c, zz6.m221004u0() ? d3c0.f83589H3 : d3c0.f83575G3);
            if (i > 0) {
                this.f35613f.setText(this.f35620m.getString(R$string.f27196J6, i0g0.m133840G(i)));
            }
            this.f35615h.setText(R$string.f27391b2);
            return;
        }
        if (!NullChecker.m81303a(user)) {
            xdl0.m208344M(this.f35612e, false);
            xdl0.m208344M(this.f35611d, true);
            qib0.f154691G.m102354Y0(this.f35610c, zz6.m221004u0() ? d3c0.f83589H3 : d3c0.f83575G3);
            this.f35613f.setText(R$string.f27240N6);
            this.f35615h.setText(R$string.f27504k7);
            return;
        }
        qib0.f154691G.m102336O(this.f35610c, user.m60124fp().profileSmall().formatted(), 2, 8);
        xdl0.m208344M(this.f35611d, false);
        xdl0.m208344M(this.f35612e, true);
        this.f35612e.setText(i0g0.m133840G(i));
        if (i > 0) {
            this.f35613f.setText(CoreModule.f17554l.m94651a().mo33416Td(i));
            this.f35615h.setText(CoreModule.f17554l.m94651a().mo33301Cs(CoreModule.f17545c.f19639e0.m169527p9(), user));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m54753o(dac0<Privilege> dac0Var, final Privilege privilege, final VipContentItemView.InterfaceC8838a interfaceC8838a, boolean z, PurchaseType purchaseType) {
        this.f35623p = purchaseType;
        xdl0.m208344M(this.f35619l, z);
        wx80 wx80VarM123716l = fy80.m123716l(privilege);
        if (NullChecker.m81303a(wx80VarM123716l)) {
            if (wx80VarM123716l.m205958j() != 0 && Privilege.see_who_likes_me != privilege && Privilege.see_not_match_guide != privilege) {
                if (Privilege.vip_greet == privilege) {
                    this.f35609b.setImageDrawable(m54749k(d3c0.f83747S9));
                } else if (Privilege.leave_message == privilege) {
                    this.f35609b.setImageDrawable(m54749k(d3c0.f84122u0));
                } else if (Privilege.message_read_state == privilege) {
                    this.f35609b.setImageDrawable(m54749k(d3c0.f84136v0));
                } else if (Privilege.greet == privilege) {
                    this.f35609b.setImageDrawable(m54749k(d3c0.f84108t0));
                } else {
                    Privilege privilege2 = Privilege.recover_unmatches;
                    ImageView imageView = this.f35609b;
                    if (privilege2 == privilege) {
                        imageView.setImageDrawable(m54749k(d3c0.f84150w0));
                    } else {
                        imageView.setImageDrawable(m54749k(wx80VarM123716l.m205958j()));
                    }
                }
                xdl0.m208344M(this.f35610c, false);
                xdl0.m208344M(this.f35618k, false);
                xdl0.m208344M(this.f35617j, true);
                xdl0.m208344M(this.f35612e, false);
                xdl0.m208344M(this.f35609b, true);
                xdl0.m208344M(this.f35611d, false);
            } else if (Privilege.see_who_likes_me == privilege) {
                m54756r(dac0Var);
            }
            m54755q(privilege, wx80VarM123716l);
            m54754p(privilege, wx80VarM123716l);
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || !xma.m210071e4()) {
                if (wx80VarM123716l.m205966r() <= 0 || wx80VarM123716l.m205960l() != Privilege.vip_location || this.f35621n) {
                    this.f35615h.setTextColor(getResources().getColor(b1c0.f72548f0));
                } else {
                    this.f35615h.setTextColor(getResources().getColor(wx80VarM123716l.m205966r()));
                }
                this.f35620m.duringCreated(CoreModule.f17545c.f19657k0.f20088R.m121230k()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.nnd0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f139708a.m54750l((RoamedLocationData) obj);
                    }
                }));
                if (privilege == Privilege.vip_location && !this.f35621n) {
                    this.f35615h.setOnClickListener(new View.OnClickListener() { // from class: l.ond0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f144777a.m54751m(view);
                        }
                    });
                } else if (!NullChecker.m81303a(interfaceC8838a) || this.f35621n) {
                    this.f35615h.setOnClickListener(null);
                } else {
                    this.f35615h.setOnClickListener(new View.OnClickListener() { // from class: l.pnd0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            interfaceC8838a.mo54890a(privilege);
                        }
                    });
                }
            }
        }
        if (privilege == Privilege.vip_badge) {
            this.f35614g.setVisibility(0);
            this.f35614g.setImageResource(CoreModule.m29935P().m94654e().mo34979cc());
        } else {
            Privilege privilege3 = Privilege.svip_badge;
            ImageView imageView2 = this.f35614g;
            if (privilege == privilege3) {
                imageView2.setVisibility(0);
                this.f35614g.setImageResource(d3c0.f83826Ya);
            } else {
                imageView2.setVisibility(8);
            }
        }
        if (this.f35621n) {
            setOnClickListener(null);
        } else if (NullChecker.m81303a(interfaceC8838a)) {
            setOnClickListener(new View.OnClickListener() { // from class: l.qnd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC8838a.mo54890a(privilege);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54748j(this);
        this.f35620m = (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m54754p(Privilege privilege, wx80 wx80Var) {
        if (privilege == Privilege.see_who_likes_me) {
            return;
        }
        this.f35615h.setText(wx80Var.m205965q());
    }

    /* JADX INFO: renamed from: q */
    public final void m54755q(Privilege privilege, wx80 wx80Var) {
        if (privilege == Privilege.see_who_likes_me) {
            return;
        }
        if (privilege != Privilege.vip_super_like || ura.m195053e().m195057d().mo33734Oi()) {
            this.f35613f.setText(wx80Var.m205968t());
        } else {
            this.f35613f.setText(getContext().getString(R$string.f27398b9, 5));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m54756r(dac0<Privilege> dac0Var) {
        xdl0.m208344M(this.f35610c, true);
        xdl0.m208344M(this.f35609b, false);
        xdl0.m208344M(this.f35617j, true);
        xdl0.m208344M(this.f35618k, false);
        xdl0.m208344M(this.f35612e, false);
        xdl0.m208344M(this.f35611d, true);
        qib0.f154691G.m102354Y0(this.f35610c, zz6.m221004u0() ? d3c0.f83589H3 : d3c0.f83575G3);
        this.f35613f.setText(R$string.f27240N6);
        this.f35615h.setText(R$string.f27207K6);
        dac0Var.mo67374c(this.f35620m, CoreModule.f17545c.f19687u0.m30405O6().mergeWith(ah60.m96370E().filter(new w9j() { // from class: l.rnd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new w9j() { // from class: l.snd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1);
            }
        }).map(new w9j() { // from class: l.tnd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19687u0.m30471r5();
            }
        }))).filter(new w9j() { // from class: l.und0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreLikers.C4719a) obj).f19269a == CoreLikers.LikersTriggerBy.my_privilege_liker);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vnd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182227a.m54752n((CoreLikers.C4719a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m54757s() {
        getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 65.0f);
        this.f35608a.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 42.0f);
        this.f35608a.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 42.0f);
        xdl0.m208344M(this.f35616i, false);
        this.f35621n = true;
    }

    public SVipContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35621n = false;
        this.f35622o = RoamedLocationData.new_();
    }
}
