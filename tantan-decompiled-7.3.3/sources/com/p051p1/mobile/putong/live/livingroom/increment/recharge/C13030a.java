package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.base.data.BLiveBonus;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.C13030a;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bkg;
import p153l.bnl0;
import p153l.efv;
import p153l.gpc0;
import p153l.gt0;
import p153l.il2;
import p153l.izs;
import p153l.jyb;
import p153l.l51;
import p153l.ls40;
import p153l.mvv;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.ps40;
import p153l.qa00;
import p153l.tuv;
import p153l.uuv;
import p153l.xau;
import p153l.y20;
import p153l.zft;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.a */
/* JADX INFO: loaded from: classes4.dex */
public class C13030a extends il2 {

    /* JADX INFO: renamed from: E0 */
    public VText f51769E0;

    /* JADX INFO: renamed from: F0 */
    public mvv f51770F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f51771G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f51772H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f51773I0;

    /* JADX INFO: renamed from: J0 */
    public AnimatorSet f51774J0;

    /* JADX INFO: renamed from: K0 */
    public View f51775K0;

    /* JADX INFO: renamed from: L */
    public VText f51776L;

    /* JADX INFO: renamed from: L0 */
    public Bitmap f51777L0;

    /* JADX INFO: renamed from: M */
    public VImage f51778M;

    /* JADX INFO: renamed from: M0 */
    public DownloadTask f51779M0;

    /* JADX INFO: renamed from: N */
    public VText f51780N;

    /* JADX INFO: renamed from: O */
    public VText f51781O;

    /* JADX INFO: renamed from: P */
    public LocalFirstRechargeGiftItemView f51782P;

    /* JADX INFO: renamed from: Q */
    public LocalFirstRechargeGiftItemView f51783Q;

    /* JADX INFO: renamed from: R */
    public LocalFirstRechargeGiftItemView f51784R;

    /* JADX INFO: renamed from: S */
    public PayItemView f51785S;

    /* JADX INFO: renamed from: T */
    public PayItemView f51786T;

    /* JADX INFO: renamed from: U */
    public VText f51787U;

    /* JADX INFO: renamed from: V */
    public Group f51788V;

    /* JADX INFO: renamed from: W */
    public ConstraintLayout f51789W;

    /* JADX INFO: renamed from: X */
    public VLinear f51790X;

    /* JADX INFO: renamed from: Y */
    public LocalNewFirstRechargeGiftItemView f51791Y;

    /* JADX INFO: renamed from: Z */
    public LocalNewFirstRechargeGiftItemView f51792Z;

    /* JADX INFO: renamed from: k0 */
    public LocalNewFirstRechargeGiftItemView f51793k0;

    /* JADX INFO: renamed from: p0 */
    public VText f51794p0;

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m76346m0(LiveFastRechargeItem liveFastRechargeItem, Drawable drawable, Drawable drawable2, int i, int i2, int i3, int i4, LiveFastRechargeItem liveFastRechargeItem2) {
        if (liveFastRechargeItem2 != liveFastRechargeItem) {
            liveFastRechargeItem2.m76310l0(false, drawable, drawable2);
            liveFastRechargeItem2.m76312n0(false, i, i2, i3, i4);
        }
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: A */
    public VText mo76349A() {
        return this.f51794p0;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m76350A0(File file) {
        ls40.m155673a(this.f115511u, file);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m76351B0(File file) {
        this.f115511u.setBackgroundResource(0);
        this.f51777L0 = ls40.m155673a(this.f115511u, file);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m76352D0(final File file) {
        l51.m152887G(new Runnable() { // from class: l.juv
            @Override // java.lang.Runnable
            public final void run() {
                this.f122744a.m76351B0(file);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m76353E0(View view) {
        this.f51770F0.m160351b5(efv.f93862s);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: F */
    public void mo76354F() {
        this.f51770F0 = (mvv) this.f115516z;
        View viewM76371q0 = m76371q0(getAct().inflater(), null);
        this.f51794p0.setTextColor(n3d0.m161277a(n9c0.f140806Y0));
        this.f51794p0.setEnabled(true);
        this.f51785S.m76337k0(zrv.f205799a.m207672i());
        this.f51785S.setOnClickListener(new View.OnClickListener() { // from class: l.kuv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128925a.m76356H0(view);
            }
        });
        this.f51786T.m76337k0(zrv.f205799a.m207676k());
        this.f51786T.setOnClickListener(new View.OnClickListener() { // from class: l.kuv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128925a.m76356H0(view);
            }
        });
        if (zrv.f205799a.m207679l0()) {
            mo76380y(false);
            bnl0.m105509E0(this.f51787U, new View.OnClickListener() { // from class: l.luv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133659a.m76377v0(view);
                }
            });
        } else {
            mo76380y(true);
        }
        m76362N0();
        this.f115510t.addView(viewM76371q0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m76355G0() {
        m76372r0();
        int iM175859d = qa00.m175859d(27.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorM132164j = gt0.m132164j(3000);
        float f = iM175859d;
        this.f115499i.setTranslationY(f);
        if (this.f51774J0 == null) {
            this.f51774J0 = new AnimatorSet();
            VText vText = this.f115498h;
            Property property = View.TRANSLATION_Y;
            float f2 = -iM175859d;
            animatorSet.playTogether((ObjectAnimator) gt0.m132166l(vText, property, 3000L, 300L, null, 0.0f, f2), (ObjectAnimator) gt0.m132166l(this.f115499i, property, 3000L, 300L, null, f, 0.0f));
            animatorSet2.playTogether((ObjectAnimator) gt0.m132166l(this.f115498h, property, 3000L, 300L, null, f, 0.0f), (ObjectAnimator) gt0.m132166l(this.f115499i, property, 3000L, 300L, null, 0.0f, f2));
            this.f51774J0.playSequentially(animatorSet, animatorM132164j, animatorSet2);
        }
        gt0.m132160f(this.f51774J0, new Runnable() { // from class: l.ruv
            @Override // java.lang.Runnable
            public final void run() {
                this.f164944a.m76378w0();
            }
        });
        this.f51774J0.start();
    }

    /* JADX INFO: renamed from: H0 */
    public void m76356H0(View view) {
        if (view == this.f51785S) {
            this.f115488I = zrv.f205799a.m207672i();
            m76363O0(this.f51785S);
        } else if (view == this.f51786T) {
            this.f115488I = zrv.f205799a.m207676k();
            m76363O0(this.f51786T);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m76357I0(boolean z, final BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        bnl0.m105537U(this.f115495e, z ? qa00.m175859d(59.0f) : qa00.m175859d(0.0f));
        bnl0.m105524M(this.f115515y, z);
        if (z) {
            izs.m142868s("context_livingAct", this.f115515y, zft.f204214i);
        }
        bnl0.m105524M(this.f115500j, z);
        this.f115496f.setBackground(n3d0.m161278b(z ? obc0.f146354h4 : obc0.f146363i1));
        bnl0.m105509E0(this.f115500j, new View.OnClickListener() { // from class: l.nuv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143745a.m76379x0(view);
            }
        });
        bnl0.m105538V(this.f51794p0, this.f51772H0 ? qa00.m175859d(47.0f) : qa00.m175859d(0.0f));
        bnl0.m105539W(this.f51794p0, this.f51772H0 ? qa00.m175859d(47.0f) : qa00.m175859d(0.0f));
        bnl0.m105524M(this.f51791Y, this.f51772H0);
        bnl0.m105524M(this.f51792Z, this.f51772H0);
        bnl0.m105524M(this.f51793k0, this.f51772H0);
        bnl0.m105524M(this.f51790X, this.f51772H0);
        bnl0.m105524M(this.f51769E0, this.f51772H0);
        if (z && this.f51772H0 && bLiveFirstRechargeDetail != null) {
            this.f51791Y.m76328i0(bLiveFirstRechargeDetail.bonus.get(0), false, false);
            this.f51792Z.m76328i0(bLiveFirstRechargeDetail.bonus.get(1), false, false);
            this.f51793k0.m76328i0(bLiveFirstRechargeDetail.bonus.get(2), false, false);
        }
        bnl0.m105524M(this.f115497g, z && this.f51773I0);
        bnl0.m105524M(this.f115498h, z && this.f51773I0);
        if (bLiveFirstRechargeDetail != null && !TextUtils.isEmpty(bLiveFirstRechargeDetail.guideNotice)) {
            this.f115498h.setText(bLiveFirstRechargeDetail.guideNotice);
        }
        bnl0.m105524M(this.f115499i, z && bLiveFirstRechargeDetail != null && bLiveFirstRechargeDetail.showGuideNotice);
        this.f115504n.m76314p0(bLiveFirstRechargeDetail != null && bLiveFirstRechargeDetail.decorateCheckout);
        if (bLiveFirstRechargeDetail != null) {
            this.f115504n.m76315q0(bLiveFirstRechargeDetail.checkoutBanner);
        }
        if (z && this.f51773I0 && !this.f51772H0) {
            m76355G0();
            m76361M0(bLiveFirstRechargeDetail);
            this.f115497g.setOnClickListener(new View.OnClickListener() { // from class: l.ouv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149213a.m76381y0(bLiveFirstRechargeDetail, view);
                }
            });
            this.f115496f.setDispatchListener(new CustomClickConstraintLayout.InterfaceC13028a() { // from class: l.puv
                @Override // com.p051p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout.InterfaceC13028a
                /* JADX INFO: renamed from: a */
                public final void mo76302a() {
                    this.f154248a.m76382z0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m76358J0() {
        final File fileM173583d = ps40.m173583d(this.f115516z.m113230C0(), "https://auto.tancdn.com/v1/images/eyJpZCI6IllWVTZIWk9JMkxHRlFMNEdTT0pITlpKSElTRFhLRTE0IiwidyI6NDk1LCJoIjo1OTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEwNjk1NjAxNzYyMjgyMjU5fQ.png");
        if (fileM173583d.exists()) {
            l51.m152887G(new Runnable() { // from class: l.suv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170766a.m76350A0(fileM173583d);
                }
            });
        } else {
            this.f51779M0 = ps40.m173585f("https://auto.tancdn.com/v1/images/eyJpZCI6IllWVTZIWk9JMkxHRlFMNEdTT0pITlpKSElTRFhLRTE0IiwidyI6NDk1LCJoIjo1OTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEwNjk1NjAxNzYyMjgyMjU5fQ.png", fileM173583d, new y20() { // from class: l.iuv
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f116985a.m76352D0((File) obj);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m76359K0(boolean z, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        if (!z || bLiveFirstRechargeDetail == null) {
            bnl0.m105524M(this.f115501k, false);
            return;
        }
        this.f115501k.setBackgroundResource(obc0.f146033F7);
        bnl0.m105524M(this.f115501k, true);
        if (this.f51775K0 != null) {
            return;
        }
        this.f51775K0 = m76370p0(getAct().inflater(), null);
        this.f51776L.setText(this.f51770F0.m211477d4() ? xau.m209910t(R$string.f48202l) : xau.m209910t(R$string.f48246n));
        bnl0.m105524M(this.f51778M, true);
        bnl0.m105509E0(this.f51778M, new View.OnClickListener() { // from class: l.quv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159650a.m76353E0(view);
            }
        });
        List<BLiveBonus> list = bLiveFirstRechargeDetail.bonus;
        if (!jyb.m147479J(list) && list.size() >= 3) {
            this.f51782P.m76324l0(this.f115516z, list.get(0), false, null);
            this.f51783Q.m76324l0(this.f115516z, list.get(1), false, null);
            this.f51784R.m76324l0(this.f115516z, list.get(2), false, null);
        }
        bnl0.m105524M(this.f51780N, true);
        this.f115501k.addView(this.f51775K0);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m76360L0(boolean z, boolean z2) {
        this.f115503m.setTextColor(n3d0.m161277a(z ? n9c0.f140856p1 : n9c0.f140783N));
        this.f51785S.setTextColor(n3d0.m161277a(z ? n9c0.f140877w1 : n9c0.f140783N));
        this.f51785S.setCheckBoxStyle(n3d0.m161278b(z ? obc0.f146162Q6 : obc0.f146206U6));
        this.f51786T.setTextColor(n3d0.m161277a(z ? n9c0.f140877w1 : n9c0.f140783N));
        this.f51786T.setCheckBoxStyle(n3d0.m161278b(z ? obc0.f146162Q6 : obc0.f146206U6));
        Drawable drawableM161278b = n3d0.m161278b(z ? obc0.f146256Z1 : obc0.f146478r8);
        drawableM161278b.setBounds(0, 0, drawableM161278b.getMinimumWidth(), drawableM161278b.getMinimumHeight());
        this.f51787U.setCompoundDrawables(null, null, drawableM161278b, null);
        this.f51787U.setTextColor(n3d0.m161277a(z ? n9c0.f140877w1 : n9c0.f140783N));
        this.f51794p0.setTextColor(n3d0.m161277a(z ? n9c0.f140873v0 : n9c0.f140823e1));
        this.f51794p0.setBackground(zrv.f205803e.getResources().getDrawable(z ? obc0.f146333f7 : obc0.f146195T6));
        m140566Y(n3d0.m161277a(z ? n9c0.f140873v0 : n9c0.f140809a), n3d0.m161277a(z ? n9c0.f140876w0 : n9c0.f140783N));
        bnl0.m105554f0(this.f115496f, ((this.f51773I0 && z) || z2) ? qa00.m175859d(0.0f) : qa00.m175859d(14.0f));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m76361M0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        if (bLiveFirstRechargeDetail == null || bLiveFirstRechargeDetail.bonus.size() < 3) {
            return;
        }
        m76358J0();
        bnl0.m105524M(this.f115511u, true);
        ((mvv) this.f115516z).m160354e5();
        this.f115512v.m76330Q(bLiveFirstRechargeDetail.bonus.get(0));
        this.f115513w.m76330Q(bLiveFirstRechargeDetail.bonus.get(1));
        this.f115514x.m76330Q(bLiveFirstRechargeDetail.bonus.get(2));
    }

    /* JADX INFO: renamed from: N0 */
    public void m76362N0() {
        if (zrv.f205799a.m207639J()) {
            return;
        }
        this.f51785S.performClick();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m76363O0(@Nullable final PayItemView payItemView) {
        this.f51794p0.setTextColor(zrv.f205803e.getResources().getColor(this.f51771G0 ? n9c0.f140873v0 : n9c0.f140823e1));
        jyb.m147537z(jyb.m147507f0(this.f51785S, this.f51786T), new y20() { // from class: l.muv
            @Override // p153l.y20
            public final void call(Object obj) {
                PayItemView payItemView2 = (PayItemView) obj;
                payItemView2.setSelected(payItemView2 == payItemView);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public void m76364P0(String str) {
        if (!this.f51771G0) {
            this.f51780N.setText(xau.m209911u(R$string.f48224m, str));
            return;
        }
        if (this.f51772H0) {
            this.f51769E0.setText(xau.m209911u(R$string.f48224m, str));
        } else if (this.f51773I0) {
            this.f115499i.setText(xau.m209911u(R$string.f48224m, str));
        } else {
            this.f51794p0.setText(xau.m209911u(R$string.f47782R9, str));
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m76365Q0(boolean z) {
        if (z) {
            m76358J0();
        }
        bnl0.m105524M(this.f115511u, z);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: U */
    public void mo76366U() {
        super.mo76366U();
        m76362N0();
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: Z */
    public void mo76367Z(double d, bkg bkgVar) {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetailM160340Q4 = this.f51770F0.m160340Q4();
        if (bLiveFirstRechargeDetailM160340Q4 != null) {
            this.f51772H0 = bLiveFirstRechargeDetailM160340Q4.emphasizeCheckout;
            this.f51773I0 = bLiveFirstRechargeDetailM160340Q4.showGuideNotice;
        }
        if (bLiveFirstRechargeDetailM160340Q4 != null && bLiveFirstRechargeDetailM160340Q4.isActive && bLiveFirstRechargeDetailM160340Q4.showDialogBonus) {
            this.f51771G0 = false;
            m76375u0(bLiveFirstRechargeDetailM160340Q4);
            this.f51770F0.m160353d5(((int) (bLiveFirstRechargeDetailM160340Q4.bonusEndTime - bLiveFirstRechargeDetailM160340Q4.currentTime)) / 1000);
        } else if (bLiveFirstRechargeDetailM160340Q4 == null || !bLiveFirstRechargeDetailM160340Q4.isActive) {
            this.f51771G0 = false;
            m76374t0(bLiveFirstRechargeDetailM160340Q4);
        } else {
            this.f51771G0 = true;
            m76373s0(bLiveFirstRechargeDetailM160340Q4);
            this.f51770F0.m160353d5(((int) (bLiveFirstRechargeDetailM160340Q4.bonusEndTime - bLiveFirstRechargeDetailM160340Q4.currentTime)) / 1000);
        }
        mo76368a0();
        super.mo76367Z(d, bkgVar);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: a0 */
    public void mo76368a0() {
        boolean z = this.f51771G0;
        if (z && this.f51772H0) {
            this.f51794p0.setText(xau.m209910t(R$string.f47719O9));
        } else if (!z || this.f51773I0) {
            this.f51794p0.setText(xau.m209910t(R$string.f48323qa));
        } else {
            this.f51794p0.setText(xau.m209910t(R$string.f47803S9));
        }
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: c0 */
    public void mo76369c0(final LiveFastRechargeItem liveFastRechargeItem) {
        final Drawable drawableM161278b = this.f51771G0 ? n3d0.m161278b(obc0.f146465q7) : n3d0.m161278b(obc0.f146417m7);
        final Drawable drawableM161278b2 = this.f51771G0 ? n3d0.m161278b(obc0.f146074J0) : n3d0.m161278b(obc0.f146429n7);
        final int iM161277a = this.f51771G0 ? n3d0.m161277a(n9c0.f140873v0) : n3d0.m161277a(n9c0.f140809a);
        final int iM161277a2 = this.f51771G0 ? n3d0.m161277a(n9c0.f140873v0) : n3d0.m161277a(n9c0.f140809a);
        final int iM161277a3 = this.f51771G0 ? n3d0.m161277a(n9c0.f140876w0) : n3d0.m161277a(n9c0.f140783N);
        final int iM161277a4 = this.f51771G0 ? n3d0.m161277a(n9c0.f140876w0) : n3d0.m161277a(n9c0.f140783N);
        liveFastRechargeItem.m76310l0(true, drawableM161278b, drawableM161278b2);
        liveFastRechargeItem.m76312n0(true, iM161277a, iM161277a2, iM161277a3, iM161277a4);
        jyb.m147537z(this.f115481B, new y20() { // from class: l.huv
            @Override // p153l.y20
            public final void call(Object obj) {
                C13030a.m76346m0(liveFastRechargeItem, drawableM161278b, drawableM161278b2, iM161277a, iM161277a2, iM161277a3, iM161277a4, (LiveFastRechargeItem) obj);
            }
        });
    }

    @Override // p153l.il2, p153l.iam
    public void destroy() {
        super.destroy();
        m76372r0();
        ps40.m173584e(this.f51777L0, this.f51779M0);
    }

    /* JADX INFO: renamed from: p0 */
    public View m76370p0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tuv.m192761b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public View m76371q0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uuv.m198216b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m76372r0() {
        AnimatorSet animatorSet = this.f51774J0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f51774J0.cancel();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m76373s0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        bnl0.m105524M(this.f115502l, false);
        m76360L0(true, false);
        m76359K0(false, null);
        m76357I0(true, bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m76374t0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        bnl0.m105524M(this.f115502l, true);
        m76360L0(false, false);
        m76359K0(false, null);
        m76357I0(false, bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m76375u0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        bnl0.m105524M(this.f115502l, false);
        m76360L0(false, true);
        m76357I0(false, bLiveFirstRechargeDetail);
        m76359K0(true, bLiveFirstRechargeDetail);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: v */
    public void mo76376v() {
        super.mo76376v();
        this.f51770F0.m160357h5();
        m76372r0();
        this.f115496f.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m76377v0(View view) {
        mo76380y(true);
        gpc0.m131248h();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m76378w0() {
        this.f51774J0.start();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m76379x0(View view) {
        this.f51770F0.m160351b5(efv.f93863t);
    }

    @Override // p153l.il2
    /* JADX INFO: renamed from: y */
    public void mo76380y(boolean z) {
        if (m140552J()) {
            return;
        }
        if (!z) {
            this.f51787U.setVisibility(0);
            this.f51788V.setVisibility(8);
        } else {
            this.f115516z.m211488t4(false);
            this.f51787U.setVisibility(8);
            this.f51788V.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m76381y0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, View view) {
        m76361M0(bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m76382z0() {
        bnl0.m105524M(this.f115511u, false);
    }
}
