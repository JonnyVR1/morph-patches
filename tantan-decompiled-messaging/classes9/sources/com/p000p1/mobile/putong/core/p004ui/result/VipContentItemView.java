package com.p000p1.mobile.putong.core.p004ui.result;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.fy80;
import l.hmb;
import l.mkd0;
import l.ngl0;
import l.nu0;
import l.t100;
import l.xdl0;
import p006l.ura;
import p006l.wx80;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipContentItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f5462a;

    /* JADX INFO: renamed from: b */
    public VText f5463b;

    /* JADX INFO: renamed from: c */
    public ImageView f5464c;

    /* JADX INFO: renamed from: d */
    public VText f5465d;

    /* JADX INFO: renamed from: e */
    public ImageView f5466e;

    /* JADX INFO: renamed from: f */
    public boolean f5467f;

    /* JADX INFO: renamed from: g */
    public RoamedLocationData f5468g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentItemView$a */
    public interface InterfaceC0274a {
        /* JADX INFO: renamed from: a */
        void mo8251a(Privilege privilege);
    }

    public VipContentItemView(@NonNull Context context) {
        super(context);
        this.f5467f = false;
        this.f5468g = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: e */
    public final void m8242e(View view) {
        ngl0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m8243f(@DrawableRes int i) {
        return nu0.b(getContext(), i);
    }

    /* JADX INFO: renamed from: g */
    public final void m8244g() {
        if (xdl0.w0() <= 1280) {
            getLayoutParams().height = t100.d(hmb.m1() * 80.0f);
            this.f5462a.getLayoutParams().height = t100.d(hmb.m1() * 50.0f);
            this.f5462a.getLayoutParams().width = t100.d(hmb.m1() * 50.0f);
            this.f5464c.getLayoutParams().width = t100.d(hmb.m1() * 34.0f);
            this.f5464c.getLayoutParams().height = t100.d(hmb.m1() * 16.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m8245h(RoamedLocationData roamedLocationData) {
        this.f5468g = roamedLocationData;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m8246i(Act act, View view) {
        CoreModule.m1854P().m11706a().m5330Q8(act, this.f5468g);
    }

    /* JADX INFO: renamed from: j */
    public void m8247j(final Privilege privilege, final InterfaceC0274a interfaceC0274a, final Act act) {
        wx80 wx80VarL = fy80.l(privilege);
        if (NullChecker.a(wx80VarL)) {
            if (wx80VarL.m26839j() != 0) {
                if (Privilege.see_who_likes_me == privilege || Privilege.see_not_match_guide == privilege) {
                    this.f5462a.setImageDrawable(nu0.b(getContext(), d3c0.Jc));
                } else if (Privilege.vip_greet == privilege || Privilege.svip_greet == privilege) {
                    this.f5462a.setImageDrawable(nu0.b(getContext(), d3c0.S9));
                } else if (Privilege.leave_message == privilege) {
                    this.f5462a.setImageDrawable(nu0.b(getContext(), d3c0.u0));
                } else if (Privilege.message_read_state == privilege) {
                    this.f5462a.setImageDrawable(nu0.b(getContext(), d3c0.v0));
                } else if (Privilege.greet == privilege) {
                    this.f5462a.setImageDrawable(nu0.b(getContext(), d3c0.t0));
                } else {
                    Privilege privilege2 = Privilege.recover_unmatches;
                    ImageView imageView = this.f5462a;
                    if (privilege2 == privilege) {
                        imageView.setImageDrawable(nu0.b(getContext(), d3c0.w0));
                    } else {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                        layoutParams.width = t100.d(36.0f);
                        layoutParams.height = t100.d(36.0f);
                        this.f5462a.setLayoutParams(layoutParams);
                        Privilege privilege3 = Privilege.intl_no_ad;
                        ImageView imageView2 = this.f5462a;
                        if (privilege3 == privilege) {
                            imageView2.setImageDrawable(nu0.b(getContext(), d3c0.o));
                        } else {
                            imageView2.setImageDrawable(m8243f(wx80VarL.m26839j()));
                        }
                    }
                }
            }
            m8249l(privilege, wx80VarL);
            m8248k(privilege, wx80VarL);
            if (CoreModule.f1534c.f3628e0.m21490p9().isVIP()) {
                if (wx80VarL.m26847r() <= 0 || wx80VarL.m26841l() != Privilege.vip_location || this.f5467f) {
                    this.f5465d.setTextColor(getResources().getColor(b1c0.f0));
                } else {
                    this.f5465d.setTextColor(getResources().getColor(wx80VarL.m26847r()));
                }
                act.duringCreated(CoreModule.f1534c.f3646k0.f4077R.k()).take(1).subscribe(mkd0.G(new e30() { // from class: l.jgl0
                    public final void call(Object obj) {
                        this.f15147a.m8245h((RoamedLocationData) obj);
                    }
                }));
                if (privilege == Privilege.vip_location && !this.f5467f) {
                    this.f5465d.setOnClickListener(new View.OnClickListener() { // from class: l.kgl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f15815a.m8246i(act, view);
                        }
                    });
                } else if (!NullChecker.a(interfaceC0274a) || this.f5467f) {
                    this.f5465d.setOnClickListener(null);
                } else {
                    this.f5465d.setOnClickListener(new View.OnClickListener() { // from class: l.lgl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            interfaceC0274a.mo8251a(privilege);
                        }
                    });
                }
            }
        }
        if (privilege == Privilege.vip_badge) {
            this.f5464c.setVisibility(0);
            this.f5464c.setImageResource(CoreModule.m1854P().m11709e().m6916cc());
        } else {
            Privilege privilege4 = Privilege.svip_badge;
            ImageView imageView3 = this.f5464c;
            if (privilege == privilege4) {
                imageView3.setVisibility(0);
                this.f5464c.setImageResource(d3c0.Ya);
            } else {
                imageView3.setVisibility(8);
            }
        }
        if (this.f5467f) {
            setOnClickListener(null);
        } else if (NullChecker.a(interfaceC0274a)) {
            setOnClickListener(new View.OnClickListener() { // from class: l.mgl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC0274a.mo8251a(privilege);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8248k(Privilege privilege, wx80 wx80Var) {
        this.f5465d.setText(wx80Var.m26846q());
    }

    /* JADX INFO: renamed from: l */
    public final void m8249l(Privilege privilege, wx80 wx80Var) {
        if (privilege != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) {
            this.f5463b.setText(wx80Var.m26849t());
        } else {
            this.f5463b.setText(getContext().getString(R.string.b9, 5));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8250m() {
        getLayoutParams().height = t100.d(hmb.m1() * 65.0f);
        this.f5462a.getLayoutParams().height = t100.d(hmb.m1() * 42.0f);
        this.f5462a.getLayoutParams().width = t100.d(hmb.m1() * 42.0f);
        xdl0.M(this.f5466e, false);
        this.f5467f = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8242e(this);
        m8244g();
    }

    public VipContentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5467f = false;
        this.f5468g = RoamedLocationData.new_();
    }

    public VipContentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5467f = false;
        this.f5468g = RoamedLocationData.new_();
    }
}
