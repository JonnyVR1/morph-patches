package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.b1c0;
import p149l.d3c0;
import p149l.e30;
import p149l.fy80;
import p149l.hmb;
import p149l.mkd0;
import p149l.ngl0;
import p149l.nu0;
import p149l.t100;
import p149l.ura;
import p149l.wx80;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class VipContentItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35681a;

    /* JADX INFO: renamed from: b */
    public VText f35682b;

    /* JADX INFO: renamed from: c */
    public ImageView f35683c;

    /* JADX INFO: renamed from: d */
    public VText f35684d;

    /* JADX INFO: renamed from: e */
    public ImageView f35685e;

    /* JADX INFO: renamed from: f */
    public boolean f35686f;

    /* JADX INFO: renamed from: g */
    public RoamedLocationData f35687g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentItemView$a */
    public interface InterfaceC8838a {
        /* JADX INFO: renamed from: a */
        void mo54890a(Privilege privilege);
    }

    public VipContentItemView(@NonNull Context context) {
        super(context);
        this.f35686f = false;
        this.f35687g = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: e */
    public final void m54881e(View view) {
        ngl0.m159337a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m54882f(@DrawableRes int i) {
        return nu0.m161424b(getContext(), i);
    }

    /* JADX INFO: renamed from: g */
    public final void m54883g() {
        if (xdl0.m208408w0() <= 1280) {
            getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 80.0f);
            this.f35681a.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 50.0f);
            this.f35681a.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 50.0f);
            this.f35683c.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 34.0f);
            this.f35683c.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 16.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m54884h(RoamedLocationData roamedLocationData) {
        this.f35687g = roamedLocationData;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m54885i(Act act, View view) {
        CoreModule.m29935P().m94651a().mo33393Q8(act, this.f35687g);
    }

    /* JADX INFO: renamed from: j */
    public void m54886j(final Privilege privilege, final InterfaceC8838a interfaceC8838a, final Act act) {
        wx80 wx80VarM123716l = fy80.m123716l(privilege);
        if (NullChecker.m81303a(wx80VarM123716l)) {
            if (wx80VarM123716l.m205958j() != 0) {
                if (Privilege.see_who_likes_me == privilege || Privilege.see_not_match_guide == privilege) {
                    this.f35681a.setImageDrawable(nu0.m161424b(getContext(), d3c0.f83626Jc));
                } else if (Privilege.vip_greet == privilege || Privilege.svip_greet == privilege) {
                    this.f35681a.setImageDrawable(nu0.m161424b(getContext(), d3c0.f83747S9));
                } else if (Privilege.leave_message == privilege) {
                    this.f35681a.setImageDrawable(nu0.m161424b(getContext(), d3c0.f84122u0));
                } else if (Privilege.message_read_state == privilege) {
                    this.f35681a.setImageDrawable(nu0.m161424b(getContext(), d3c0.f84136v0));
                } else if (Privilege.greet == privilege) {
                    this.f35681a.setImageDrawable(nu0.m161424b(getContext(), d3c0.f84108t0));
                } else {
                    Privilege privilege2 = Privilege.recover_unmatches;
                    ImageView imageView = this.f35681a;
                    if (privilege2 == privilege) {
                        imageView.setImageDrawable(nu0.m161424b(getContext(), d3c0.f84150w0));
                    } else {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                        layoutParams.width = t100.m186890d(36.0f);
                        layoutParams.height = t100.m186890d(36.0f);
                        this.f35681a.setLayoutParams(layoutParams);
                        Privilege privilege3 = Privilege.intl_no_ad;
                        ImageView imageView2 = this.f35681a;
                        if (privilege3 == privilege) {
                            imageView2.setImageDrawable(nu0.m161424b(getContext(), d3c0.f84037o));
                        } else {
                            imageView2.setImageDrawable(m54882f(wx80VarM123716l.m205958j()));
                        }
                    }
                }
            }
            m54888l(privilege, wx80VarM123716l);
            m54887k(privilege, wx80VarM123716l);
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                if (wx80VarM123716l.m205966r() <= 0 || wx80VarM123716l.m205960l() != Privilege.vip_location || this.f35686f) {
                    this.f35684d.setTextColor(getResources().getColor(b1c0.f72548f0));
                } else {
                    this.f35684d.setTextColor(getResources().getColor(wx80VarM123716l.m205966r()));
                }
                act.duringCreated(CoreModule.f17545c.f19657k0.f20088R.m121230k()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.jgl0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f117802a.m54884h((RoamedLocationData) obj);
                    }
                }));
                if (privilege == Privilege.vip_location && !this.f35686f) {
                    this.f35684d.setOnClickListener(new View.OnClickListener() { // from class: l.kgl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f123041a.m54885i(act, view);
                        }
                    });
                } else if (!NullChecker.m81303a(interfaceC8838a) || this.f35686f) {
                    this.f35684d.setOnClickListener(null);
                } else {
                    this.f35684d.setOnClickListener(new View.OnClickListener() { // from class: l.lgl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            interfaceC8838a.mo54890a(privilege);
                        }
                    });
                }
            }
        }
        if (privilege == Privilege.vip_badge) {
            this.f35683c.setVisibility(0);
            this.f35683c.setImageResource(CoreModule.m29935P().m94654e().mo34979cc());
        } else {
            Privilege privilege4 = Privilege.svip_badge;
            ImageView imageView3 = this.f35683c;
            if (privilege == privilege4) {
                imageView3.setVisibility(0);
                this.f35683c.setImageResource(d3c0.f83826Ya);
            } else {
                imageView3.setVisibility(8);
            }
        }
        if (this.f35686f) {
            setOnClickListener(null);
        } else if (NullChecker.m81303a(interfaceC8838a)) {
            setOnClickListener(new View.OnClickListener() { // from class: l.mgl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC8838a.mo54890a(privilege);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m54887k(Privilege privilege, wx80 wx80Var) {
        this.f35684d.setText(wx80Var.m205965q());
    }

    /* JADX INFO: renamed from: l */
    public final void m54888l(Privilege privilege, wx80 wx80Var) {
        if (privilege != Privilege.vip_super_like || ura.m195053e().m195057d().mo33734Oi()) {
            this.f35682b.setText(wx80Var.m205968t());
        } else {
            this.f35682b.setText(getContext().getString(R$string.f27398b9, 5));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m54889m() {
        getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 65.0f);
        this.f35681a.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 42.0f);
        this.f35681a.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 42.0f);
        xdl0.m208344M(this.f35685e, false);
        this.f35686f = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54881e(this);
        m54883g();
    }

    public VipContentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35686f = false;
        this.f35687g = RoamedLocationData.new_();
    }

    public VipContentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35686f = false;
        this.f35687g = RoamedLocationData.new_();
    }
}
