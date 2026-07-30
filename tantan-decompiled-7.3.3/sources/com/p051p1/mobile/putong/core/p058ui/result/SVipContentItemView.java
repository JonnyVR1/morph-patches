package com.p051p1.mobile.putong.core.p058ui.result;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.c17;
import p153l.fp60;
import p153l.gta;
import p153l.h9c0;
import p153l.j690;
import p153l.jbc0;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.rbb0;
import p153l.tu0;
import p153l.uqb0;
import p153l.vnb;
import p153l.y20;
import p153l.yvd0;

/* JADX INFO: loaded from: classes12.dex */
public class SVipContentItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f36456a;

    /* JADX INFO: renamed from: b */
    public ImageView f36457b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f36458c;

    /* JADX INFO: renamed from: d */
    public VImage f36459d;

    /* JADX INFO: renamed from: e */
    public TextView f36460e;

    /* JADX INFO: renamed from: f */
    public VText f36461f;

    /* JADX INFO: renamed from: g */
    public ImageView f36462g;

    /* JADX INFO: renamed from: h */
    public VText f36463h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f36464i;

    /* JADX INFO: renamed from: j */
    public ImageView f36465j;

    /* JADX INFO: renamed from: k */
    public VText f36466k;

    /* JADX INFO: renamed from: l */
    public View f36467l;

    /* JADX INFO: renamed from: m */
    public Act f36468m;

    /* JADX INFO: renamed from: n */
    public boolean f36469n;

    /* JADX INFO: renamed from: o */
    public RoamedLocationData f36470o;

    /* JADX INFO: renamed from: p */
    public PurchaseType f36471p;

    public SVipContentItemView(Context context) {
        super(context);
        this.f36469n = false;
        this.f36470o = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: j */
    public final void m55931j(View view) {
        yvd0.m217488a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m55932k(@DrawableRes int i) {
        return tu0.m192702b(getContext(), i);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m55933l(RoamedLocationData roamedLocationData) {
        this.f36470o = roamedLocationData;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m55934m(View view) {
        CoreModule.m30933P().m143405a().mo34396Q8(this.f36468m, this.f36470o);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m55935n(CoreLikers.C4870a c4870a) {
        int i = c4870a.f20012b;
        User user = (User) jyb.m147519l0(c4870a.f20018h);
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            user = (User) jyb.m147519l0(c4870a.f20015e);
        }
        bnl0.m105524M(this.f36465j, i == 0);
        bnl0.m105524M(this.f36466k, i > 0);
        if (!rbb0.m180744q()) {
            bnl0.m105524M(this.f36460e, false);
            int i2 = qa00.f156318e;
            if (i == 0 || user == null) {
                this.f36458c.setBackgroundResource(0);
                this.f36458c.setPadding(0, 0, 0, 0);
                uqb0.f180374G.m127138Y0(this.f36458c, jbc0.f119455Wa);
                this.f36459d.setVisibility(4);
                this.f36461f.setText(R$string.f28077M6);
                this.f36463h.setText(R$string.f28066L6);
            } else {
                this.f36458c.setBackgroundResource(jbc0.f119282K);
                this.f36458c.setPadding(i2, i2, i2, i2);
                uqb0.f180374G.m127125Q0(this.f36458c, user.m61308fp().profileSmall());
                this.f36459d.setVisibility(0);
                this.f36461f.setText(this.f36468m.getString(R$string.f28044J6, q8g0.m175775G(i)));
                this.f36463h.setText(R$string.f28055K6);
            }
            this.f36461f.requestLayout();
            return;
        }
        if (CoreModule.m30933P().m143405a().mo180296B()) {
            bnl0.m105524M(this.f36460e, false);
            bnl0.m105524M(this.f36459d, true);
            uqb0.f180374G.m127138Y0(this.f36458c, c17.m107528u0() ? jbc0.f119244H3 : jbc0.f119230G3);
            if (i > 0) {
                this.f36461f.setText(this.f36468m.getString(R$string.f28044J6, q8g0.m175775G(i)));
            }
            this.f36463h.setText(R$string.f28239b2);
            return;
        }
        if (!NullChecker.m82486a(user)) {
            bnl0.m105524M(this.f36460e, false);
            bnl0.m105524M(this.f36459d, true);
            uqb0.f180374G.m127138Y0(this.f36458c, c17.m107528u0() ? jbc0.f119244H3 : jbc0.f119230G3);
            this.f36461f.setText(R$string.f28088N6);
            this.f36463h.setText(R$string.f28352k7);
            return;
        }
        uqb0.f180374G.m127120O(this.f36458c, user.m61308fp().profileSmall().formatted(), 2, 8);
        bnl0.m105524M(this.f36459d, false);
        bnl0.m105524M(this.f36460e, true);
        this.f36460e.setText(q8g0.m175775G(i));
        if (i > 0) {
            this.f36461f.setText(CoreModule.f18273l.m143405a().mo34419Td(i));
            this.f36463h.setText(CoreModule.f18273l.m143405a().mo34304Cs(CoreModule.f18264c.f20381e0.m116600p9(), user));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m55936o(jic0<Privilege> jic0Var, final Privilege privilege, final VipContentItemView.InterfaceC9001a interfaceC9001a, boolean z, PurchaseType purchaseType) {
        this.f36471p = purchaseType;
        bnl0.m105524M(this.f36467l, z);
        a690 a690VarM143620l = j690.m143620l(privilege);
        if (NullChecker.m82486a(a690VarM143620l)) {
            if (a690VarM143620l.m96304j() != 0 && Privilege.see_who_likes_me != privilege && Privilege.see_not_match_guide != privilege) {
                if (Privilege.vip_greet == privilege) {
                    this.f36457b.setImageDrawable(m55932k(jbc0.f119402S9));
                } else if (Privilege.leave_message == privilege) {
                    this.f36457b.setImageDrawable(m55932k(jbc0.f119777u0));
                } else if (Privilege.message_read_state == privilege) {
                    this.f36457b.setImageDrawable(m55932k(jbc0.f119791v0));
                } else if (Privilege.greet == privilege) {
                    this.f36457b.setImageDrawable(m55932k(jbc0.f119763t0));
                } else {
                    Privilege privilege2 = Privilege.recover_unmatches;
                    ImageView imageView = this.f36457b;
                    if (privilege2 == privilege) {
                        imageView.setImageDrawable(m55932k(jbc0.f119805w0));
                    } else {
                        imageView.setImageDrawable(m55932k(a690VarM143620l.m96304j()));
                    }
                }
                bnl0.m105524M(this.f36458c, false);
                bnl0.m105524M(this.f36466k, false);
                bnl0.m105524M(this.f36465j, true);
                bnl0.m105524M(this.f36460e, false);
                bnl0.m105524M(this.f36457b, true);
                bnl0.m105524M(this.f36459d, false);
            } else if (Privilege.see_who_likes_me == privilege) {
                m55939r(jic0Var);
            }
            m55938q(privilege, a690VarM143620l);
            m55937p(privilege, a690VarM143620l);
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || !joa.m146386f4()) {
                if (a690VarM143620l.m96312r() <= 0 || a690VarM143620l.m96306l() != Privilege.vip_location || this.f36469n) {
                    this.f36463h.setTextColor(getResources().getColor(h9c0.f108368f0));
                } else {
                    this.f36463h.setTextColor(getResources().getColor(a690VarM143620l.m96312r()));
                }
                this.f36468m.duringCreated(CoreModule.f18264c.f20399k0.f20830R.m159274k()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.pvd0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f154285a.m55933l((RoamedLocationData) obj);
                    }
                }));
                if (privilege == Privilege.vip_location && !this.f36469n) {
                    this.f36463h.setOnClickListener(new View.OnClickListener() { // from class: l.qvd0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f159740a.m55934m(view);
                        }
                    });
                } else if (!NullChecker.m82486a(interfaceC9001a) || this.f36469n) {
                    this.f36463h.setOnClickListener(null);
                } else {
                    this.f36463h.setOnClickListener(new View.OnClickListener() { // from class: l.rvd0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            interfaceC9001a.mo56073a(privilege);
                        }
                    });
                }
            }
        }
        if (privilege == Privilege.vip_badge) {
            this.f36462g.setVisibility(0);
            this.f36462g.setImageResource(CoreModule.m30933P().m143408e().mo35982cc());
        } else {
            Privilege privilege3 = Privilege.svip_badge;
            ImageView imageView2 = this.f36462g;
            if (privilege == privilege3) {
                imageView2.setVisibility(0);
                this.f36462g.setImageResource(jbc0.f119481Ya);
            } else {
                imageView2.setVisibility(8);
            }
        }
        if (this.f36469n) {
            setOnClickListener(null);
        } else if (NullChecker.m82486a(interfaceC9001a)) {
            setOnClickListener(new View.OnClickListener() { // from class: l.svd0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC9001a.mo56073a(privilege);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55931j(this);
        this.f36468m = (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m55937p(Privilege privilege, a690 a690Var) {
        if (privilege == Privilege.see_who_likes_me) {
            return;
        }
        this.f36463h.setText(a690Var.m96311q());
    }

    /* JADX INFO: renamed from: q */
    public final void m55938q(Privilege privilege, a690 a690Var) {
        if (privilege == Privilege.see_who_likes_me) {
            return;
        }
        if (privilege != Privilege.vip_super_like || gta.m132210e().m132214d().mo34737Oi()) {
            this.f36461f.setText(a690Var.m96314t());
        } else {
            this.f36461f.setText(getContext().getString(R$string.f28246b9, 5));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m55939r(jic0<Privilege> jic0Var) {
        bnl0.m105524M(this.f36458c, true);
        bnl0.m105524M(this.f36457b, false);
        bnl0.m105524M(this.f36465j, true);
        bnl0.m105524M(this.f36466k, false);
        bnl0.m105524M(this.f36460e, false);
        bnl0.m105524M(this.f36459d, true);
        uqb0.f180374G.m127138Y0(this.f36458c, c17.m107528u0() ? jbc0.f119244H3 : jbc0.f119230G3);
        this.f36461f.setText(R$string.f28088N6);
        this.f36463h.setText(R$string.f28055K6);
        jic0Var.mo68557c(this.f36468m, CoreModule.f18264c.f20429u0.m31415S6().mergeWith(fp60.m126543E().filter(new qcj() { // from class: l.tvd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((PaymentResultWrapper) obj).purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            }
        }).switchMap(new qcj() { // from class: l.uvd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1);
            }
        }).map(new qcj() { // from class: l.vvd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20429u0.m31479t5();
            }
        }))).filter(new qcj() { // from class: l.wvd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreLikers.C4870a) obj).f20011a == CoreLikers.LikersTriggerBy.my_privilege_liker);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.xvd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196383a.m55935n((CoreLikers.C4870a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m55940s() {
        getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 65.0f);
        this.f36456a.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 42.0f);
        this.f36456a.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 42.0f);
        bnl0.m105524M(this.f36464i, false);
        this.f36469n = true;
    }

    public SVipContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36469n = false;
        this.f36470o = RoamedLocationData.new_();
    }
}
