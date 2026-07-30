package com.p051p1.mobile.putong.core.p058ui.result;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.gta;
import p153l.h9c0;
import p153l.j690;
import p153l.jbc0;
import p153l.psd0;
import p153l.qa00;
import p153l.rpl0;
import p153l.tu0;
import p153l.vnb;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VipContentItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f36529a;

    /* JADX INFO: renamed from: b */
    public VText f36530b;

    /* JADX INFO: renamed from: c */
    public ImageView f36531c;

    /* JADX INFO: renamed from: d */
    public VText f36532d;

    /* JADX INFO: renamed from: e */
    public ImageView f36533e;

    /* JADX INFO: renamed from: f */
    public boolean f36534f;

    /* JADX INFO: renamed from: g */
    public RoamedLocationData f36535g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentItemView$a */
    public interface InterfaceC9001a {
        /* JADX INFO: renamed from: a */
        void mo56073a(Privilege privilege);
    }

    public VipContentItemView(@NonNull Context context) {
        super(context);
        this.f36534f = false;
        this.f36535g = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: e */
    public final void m56064e(View view) {
        rpl0.m182533a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m56065f(@DrawableRes int i) {
        return tu0.m192702b(getContext(), i);
    }

    /* JADX INFO: renamed from: g */
    public final void m56066g() {
        if (bnl0.m105588w0() <= 1280) {
            getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 80.0f);
            this.f36529a.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 50.0f);
            this.f36529a.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 50.0f);
            this.f36531c.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 34.0f);
            this.f36531c.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 16.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m56067h(RoamedLocationData roamedLocationData) {
        this.f36535g = roamedLocationData;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m56068i(Act act, View view) {
        CoreModule.m30933P().m143405a().mo34396Q8(act, this.f36535g);
    }

    /* JADX INFO: renamed from: j */
    public void m56069j(final Privilege privilege, final InterfaceC9001a interfaceC9001a, final Act act) {
        a690 a690VarM143620l = j690.m143620l(privilege);
        if (NullChecker.m82486a(a690VarM143620l)) {
            if (a690VarM143620l.m96304j() != 0) {
                if (Privilege.see_who_likes_me == privilege || Privilege.see_not_match_guide == privilege) {
                    this.f36529a.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119281Jc));
                } else if (Privilege.vip_greet == privilege || Privilege.svip_greet == privilege) {
                    this.f36529a.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119402S9));
                } else if (Privilege.leave_message == privilege) {
                    this.f36529a.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119777u0));
                } else if (Privilege.message_read_state == privilege) {
                    this.f36529a.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119791v0));
                } else if (Privilege.greet == privilege) {
                    this.f36529a.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119763t0));
                } else {
                    Privilege privilege2 = Privilege.recover_unmatches;
                    ImageView imageView = this.f36529a;
                    if (privilege2 == privilege) {
                        imageView.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119805w0));
                    } else {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                        layoutParams.width = qa00.m175859d(36.0f);
                        layoutParams.height = qa00.m175859d(36.0f);
                        this.f36529a.setLayoutParams(layoutParams);
                        Privilege privilege3 = Privilege.intl_no_ad;
                        ImageView imageView2 = this.f36529a;
                        if (privilege3 == privilege) {
                            imageView2.setImageDrawable(tu0.m192702b(getContext(), jbc0.f119692o));
                        } else {
                            imageView2.setImageDrawable(m56065f(a690VarM143620l.m96304j()));
                        }
                    }
                }
            }
            m56071l(privilege, a690VarM143620l);
            m56070k(privilege, a690VarM143620l);
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                if (a690VarM143620l.m96312r() <= 0 || a690VarM143620l.m96306l() != Privilege.vip_location || this.f36534f) {
                    this.f36532d.setTextColor(getResources().getColor(h9c0.f108368f0));
                } else {
                    this.f36532d.setTextColor(getResources().getColor(a690VarM143620l.m96312r()));
                }
                act.duringCreated(CoreModule.f18264c.f20399k0.f20830R.m159274k()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.npl0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f143108a.m56067h((RoamedLocationData) obj);
                    }
                }));
                if (privilege == Privilege.vip_location && !this.f36534f) {
                    this.f36532d.setOnClickListener(new View.OnClickListener() { // from class: l.opl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f148468a.m56068i(act, view);
                        }
                    });
                } else if (!NullChecker.m82486a(interfaceC9001a) || this.f36534f) {
                    this.f36532d.setOnClickListener(null);
                } else {
                    this.f36532d.setOnClickListener(new View.OnClickListener() { // from class: l.ppl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            interfaceC9001a.mo56073a(privilege);
                        }
                    });
                }
            }
        }
        if (privilege == Privilege.vip_badge) {
            this.f36531c.setVisibility(0);
            this.f36531c.setImageResource(CoreModule.m30933P().m143408e().mo35982cc());
        } else {
            Privilege privilege4 = Privilege.svip_badge;
            ImageView imageView3 = this.f36531c;
            if (privilege == privilege4) {
                imageView3.setVisibility(0);
                this.f36531c.setImageResource(jbc0.f119481Ya);
            } else {
                imageView3.setVisibility(8);
            }
        }
        if (this.f36534f) {
            setOnClickListener(null);
        } else if (NullChecker.m82486a(interfaceC9001a)) {
            setOnClickListener(new View.OnClickListener() { // from class: l.qpl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    interfaceC9001a.mo56073a(privilege);
                }
            });
        } else {
            setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m56070k(Privilege privilege, a690 a690Var) {
        this.f36532d.setText(a690Var.m96311q());
    }

    /* JADX INFO: renamed from: l */
    public final void m56071l(Privilege privilege, a690 a690Var) {
        if (privilege != Privilege.vip_super_like || gta.m132210e().m132214d().mo34737Oi()) {
            this.f36530b.setText(a690Var.m96314t());
        } else {
            this.f36530b.setText(getContext().getString(R$string.f28246b9, 5));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m56072m() {
        getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 65.0f);
        this.f36529a.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 42.0f);
        this.f36529a.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 42.0f);
        bnl0.m105524M(this.f36533e, false);
        this.f36534f = true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56064e(this);
        m56066g();
    }

    public VipContentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36534f = false;
        this.f36535g = RoamedLocationData.new_();
    }

    public VipContentItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36534f = false;
        this.f36535g = RoamedLocationData.new_();
    }
}
