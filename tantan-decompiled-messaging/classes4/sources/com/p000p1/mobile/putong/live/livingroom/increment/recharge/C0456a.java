package com.p000p1.mobile.putong.live.livingroom.increment.recharge;

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
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.C0456a;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import com.p1.mobile.putong.live.base.data.BLiveBonus;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p1.mobile.putong.ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import l.bk40;
import l.bt0;
import l.d30;
import l.ddv;
import l.e30;
import l.e51;
import l.hxs;
import l.kvc0;
import l.t100;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.xj40;
import l.ydt;
import l.ypv;
import p002l.al2;
import p002l.h1c0;
import p002l.i3c0;
import p002l.ltv;
import p002l.nig;
import p002l.ssv;
import p002l.tsv;
import p002l.zgc0;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0456a extends al2 {

    /* JADX INFO: renamed from: E0 */
    public VText f6963E0;

    /* JADX INFO: renamed from: F0 */
    public ltv f6964F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f6965G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f6966H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f6967I0;

    /* JADX INFO: renamed from: J0 */
    public AnimatorSet f6968J0;

    /* JADX INFO: renamed from: K0 */
    public View f6969K0;

    /* JADX INFO: renamed from: L */
    public VText f6970L;

    /* JADX INFO: renamed from: L0 */
    public Bitmap f6971L0;

    /* JADX INFO: renamed from: M */
    public VImage f6972M;

    /* JADX INFO: renamed from: M0 */
    public DownloadTask f6973M0;

    /* JADX INFO: renamed from: N */
    public VText f6974N;

    /* JADX INFO: renamed from: O */
    public VText f6975O;

    /* JADX INFO: renamed from: P */
    public LocalFirstRechargeGiftItemView f6976P;

    /* JADX INFO: renamed from: Q */
    public LocalFirstRechargeGiftItemView f6977Q;

    /* JADX INFO: renamed from: R */
    public LocalFirstRechargeGiftItemView f6978R;

    /* JADX INFO: renamed from: S */
    public PayItemView f6979S;

    /* JADX INFO: renamed from: T */
    public PayItemView f6980T;

    /* JADX INFO: renamed from: U */
    public VText f6981U;

    /* JADX INFO: renamed from: V */
    public Group f6982V;

    /* JADX INFO: renamed from: W */
    public ConstraintLayout f6983W;

    /* JADX INFO: renamed from: X */
    public VLinear f6984X;

    /* JADX INFO: renamed from: Y */
    public LocalNewFirstRechargeGiftItemView f6985Y;

    /* JADX INFO: renamed from: Z */
    public LocalNewFirstRechargeGiftItemView f6986Z;

    /* JADX INFO: renamed from: k0 */
    public LocalNewFirstRechargeGiftItemView f6987k0;

    /* JADX INFO: renamed from: p0 */
    public VText f6988p0;

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m8779m0(LiveFastRechargeItem liveFastRechargeItem, Drawable drawable, Drawable drawable2, int i, int i2, int i3, int i4, LiveFastRechargeItem liveFastRechargeItem2) {
        if (liveFastRechargeItem2 != liveFastRechargeItem) {
            liveFastRechargeItem2.m8743l0(false, drawable, drawable2);
            liveFastRechargeItem2.m8745n0(false, i, i2, i3, i4);
        }
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: A */
    public VText mo8782A() {
        return this.f6988p0;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8783A0(File file) {
        xj40.a(this.f7705u, file);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8784B0(File file) {
        this.f7705u.setBackgroundResource(0);
        this.f6971L0 = xj40.a(this.f7705u, file);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8785D0(final File file) {
        e51.G(new Runnable() { // from class: l.isv
            @Override // java.lang.Runnable
            public final void run() {
                this.f13400a.m8784B0(file);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m8786E0(View view) {
        this.f6964F0.m17453b5(ddv.s);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: F */
    public void mo8787F() {
        this.f6964F0 = (ltv) this.f7710z;
        View viewM8804q0 = m8804q0(act().inflater(), null);
        this.f6988p0.setTextColor(kvc0.a(h1c0.f11765Y0));
        this.f6988p0.setEnabled(true);
        this.f6979S.m8770k0(ypv.a.i());
        this.f6979S.setOnClickListener(new View.OnClickListener() { // from class: l.jsv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14008a.m8789H0(view);
            }
        });
        this.f6980T.m8770k0(ypv.a.k());
        this.f6980T.setOnClickListener(new View.OnClickListener() { // from class: l.jsv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14008a.m8789H0(view);
            }
        });
        if (ypv.a.l0()) {
            mo8813y(false);
            xdl0.E0(this.f6981U, new View.OnClickListener() { // from class: l.ksv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14503a.m8810v0(view);
                }
            });
        } else {
            mo8813y(true);
        }
        m8795N0();
        this.f7704t.addView(viewM8804q0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m8788G0() {
        m8805r0();
        int iD = t100.d(27.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorJ = bt0.j(3000);
        float f = iD;
        this.f7693i.setTranslationY(f);
        if (this.f6968J0 == null) {
            this.f6968J0 = new AnimatorSet();
            VText vText = this.f7692h;
            Property property = View.TRANSLATION_Y;
            float f2 = -iD;
            animatorSet.playTogether((ObjectAnimator) bt0.l(vText, property, 3000L, 300L, (Interpolator) null, new float[]{0.0f, f2}), (ObjectAnimator) bt0.l(this.f7693i, property, 3000L, 300L, (Interpolator) null, new float[]{f, 0.0f}));
            animatorSet2.playTogether((ObjectAnimator) bt0.l(this.f7692h, property, 3000L, 300L, (Interpolator) null, new float[]{f, 0.0f}), (ObjectAnimator) bt0.l(this.f7693i, property, 3000L, 300L, (Interpolator) null, new float[]{0.0f, f2}));
            this.f6968J0.playSequentially(animatorSet, animatorJ, animatorSet2);
        }
        bt0.f(this.f6968J0, new Runnable() { // from class: l.qsv
            @Override // java.lang.Runnable
            public final void run() {
                this.f18207a.m8811w0();
            }
        });
        this.f6968J0.start();
    }

    /* JADX INFO: renamed from: H0 */
    public void m8789H0(View view) {
        if (view == this.f6979S) {
            this.f7682I = ypv.a.i();
            m8796O0(this.f6979S);
        } else if (view == this.f6980T) {
            this.f7682I = ypv.a.k();
            m8796O0(this.f6980T);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m8790I0(boolean z, final BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.U(this.f7689e, z ? t100.d(59.0f) : t100.d(0.0f));
        xdl0.M(this.f7709y, z);
        if (z) {
            hxs.s("context_livingAct", this.f7709y, ydt.i);
        }
        xdl0.M(this.f7694j, z);
        this.f7690f.setBackground(kvc0.b(z ? i3c0.f12811h4 : i3c0.f12820i1));
        xdl0.E0(this.f7694j, new View.OnClickListener() { // from class: l.msv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15619a.m8812x0(view);
            }
        });
        xdl0.V(this.f6988p0, this.f6966H0 ? t100.d(47.0f) : t100.d(0.0f));
        xdl0.W(this.f6988p0, this.f6966H0 ? t100.d(47.0f) : t100.d(0.0f));
        xdl0.M(this.f6985Y, this.f6966H0);
        xdl0.M(this.f6986Z, this.f6966H0);
        xdl0.M(this.f6987k0, this.f6966H0);
        xdl0.M(this.f6984X, this.f6966H0);
        xdl0.M(this.f6963E0, this.f6966H0);
        if (z && this.f6966H0 && bLiveFirstRechargeDetail != null) {
            this.f6985Y.m8761i0((BLiveBonus) bLiveFirstRechargeDetail.bonus.get(0), false, false);
            this.f6986Z.m8761i0((BLiveBonus) bLiveFirstRechargeDetail.bonus.get(1), false, false);
            this.f6987k0.m8761i0((BLiveBonus) bLiveFirstRechargeDetail.bonus.get(2), false, false);
        }
        xdl0.M(this.f7691g, z && this.f6967I0);
        xdl0.M(this.f7692h, z && this.f6967I0);
        if (bLiveFirstRechargeDetail != null && !TextUtils.isEmpty(bLiveFirstRechargeDetail.guideNotice)) {
            this.f7692h.setText(bLiveFirstRechargeDetail.guideNotice);
        }
        xdl0.M(this.f7693i, z && bLiveFirstRechargeDetail != null && bLiveFirstRechargeDetail.showGuideNotice);
        this.f7698n.m8747p0(bLiveFirstRechargeDetail != null && bLiveFirstRechargeDetail.decorateCheckout);
        if (bLiveFirstRechargeDetail != null) {
            this.f7698n.m8748q0(bLiveFirstRechargeDetail.checkoutBanner);
        }
        if (z && this.f6967I0 && !this.f6966H0) {
            m8788G0();
            m8794M0(bLiveFirstRechargeDetail);
            this.f7691g.setOnClickListener(new View.OnClickListener() { // from class: l.nsv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16181a.m8814y0(bLiveFirstRechargeDetail, view);
                }
            });
            this.f7690f.setDispatchListener(new CustomClickConstraintLayout.InterfaceC0454a() { // from class: l.osv
                @Override // com.p000p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout.InterfaceC0454a
                /* JADX INFO: renamed from: a */
                public final void mo8735a() {
                    this.f16775a.m8815z0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m8791J0() {
        final File fileD = bk40.d(this.f7710z.C0(), "https://auto.tancdn.com/v1/images/eyJpZCI6IllWVTZIWk9JMkxHRlFMNEdTT0pITlpKSElTRFhLRTE0IiwidyI6NDk1LCJoIjo1OTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEwNjk1NjAxNzYyMjgyMjU5fQ.png");
        if (fileD.exists()) {
            e51.G(new Runnable() { // from class: l.rsv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18670a.m8783A0(fileD);
                }
            });
        } else {
            this.f6973M0 = bk40.f("https://auto.tancdn.com/v1/images/eyJpZCI6IllWVTZIWk9JMkxHRlFMNEdTT0pITlpKSElTRFhLRTE0IiwidyI6NDk1LCJoIjo1OTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEwNjk1NjAxNzYyMjgyMjU5fQ.png", fileD, new e30() { // from class: l.hsv
                public final void call(Object obj) {
                    this.f12264a.m8785D0((File) obj);
                }
            }, (d30) null);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m8792K0(boolean z, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        if (!z || bLiveFirstRechargeDetail == null) {
            xdl0.M(this.f7695k, false);
            return;
        }
        this.f7695k.setBackgroundResource(i3c0.f12490F7);
        xdl0.M(this.f7695k, true);
        if (this.f6969K0 != null) {
            return;
        }
        this.f6969K0 = m8803p0(act().inflater(), null);
        this.f6970L.setText(this.f6964F0.m20401d4() ? w8u.t(R$string.f3396l) : w8u.t(R$string.f3440n));
        xdl0.M(this.f6972M, true);
        xdl0.E0(this.f6972M, new View.OnClickListener() { // from class: l.psv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17637a.m8786E0(view);
            }
        });
        List list = bLiveFirstRechargeDetail.bonus;
        if (!vwb.J(list) && list.size() >= 3) {
            this.f6976P.m8757l0(this.f7710z, (BLiveBonus) list.get(0), false, null);
            this.f6977Q.m8757l0(this.f7710z, (BLiveBonus) list.get(1), false, null);
            this.f6978R.m8757l0(this.f7710z, (BLiveBonus) list.get(2), false, null);
        }
        xdl0.M(this.f6974N, true);
        this.f7695k.addView(this.f6969K0);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m8793L0(boolean z, boolean z2) {
        this.f7697m.setTextColor(kvc0.a(z ? h1c0.f11815p1 : h1c0.f11742N));
        this.f6979S.setTextColor(kvc0.a(z ? h1c0.f11836w1 : h1c0.f11742N));
        this.f6979S.setCheckBoxStyle(kvc0.b(z ? i3c0.f12619Q6 : i3c0.f12663U6));
        this.f6980T.setTextColor(kvc0.a(z ? h1c0.f11836w1 : h1c0.f11742N));
        this.f6980T.setCheckBoxStyle(kvc0.b(z ? i3c0.f12619Q6 : i3c0.f12663U6));
        Drawable drawableB = kvc0.b(z ? i3c0.f12713Z1 : i3c0.f12935r8);
        drawableB.setBounds(0, 0, drawableB.getMinimumWidth(), drawableB.getMinimumHeight());
        this.f6981U.setCompoundDrawables((Drawable) null, (Drawable) null, drawableB, (Drawable) null);
        this.f6981U.setTextColor(kvc0.a(z ? h1c0.f11836w1 : h1c0.f11742N));
        this.f6988p0.setTextColor(kvc0.a(z ? h1c0.f11832v0 : h1c0.f11782e1));
        this.f6988p0.setBackground(ypv.e.getResources().getDrawable(z ? i3c0.f12790f7 : i3c0.f12652T6));
        m9866Y(kvc0.a(z ? h1c0.f11832v0 : h1c0.f11768a), kvc0.a(z ? h1c0.f11835w0 : h1c0.f11742N));
        xdl0.f0(this.f7690f, ((this.f6967I0 && z) || z2) ? t100.d(0.0f) : t100.d(14.0f));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m8794M0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        if (bLiveFirstRechargeDetail == null || bLiveFirstRechargeDetail.bonus.size() < 3) {
            return;
        }
        m8791J0();
        xdl0.M(this.f7705u, true);
        ((ltv) this.f7710z).m17456e5();
        this.f7706v.m8763Q((BLiveBonus) bLiveFirstRechargeDetail.bonus.get(0));
        this.f7707w.m8763Q((BLiveBonus) bLiveFirstRechargeDetail.bonus.get(1));
        this.f7708x.m8763Q((BLiveBonus) bLiveFirstRechargeDetail.bonus.get(2));
    }

    /* JADX INFO: renamed from: N0 */
    public void m8795N0() {
        if (ypv.a.J()) {
            return;
        }
        this.f6979S.performClick();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m8796O0(@Nullable final PayItemView payItemView) {
        this.f6988p0.setTextColor(ypv.e.getResources().getColor(this.f6965G0 ? h1c0.f11832v0 : h1c0.f11782e1));
        vwb.z(vwb.f0(new PayItemView[]{this.f6979S, this.f6980T}), new e30() { // from class: l.lsv
            public final void call(Object obj) {
                PayItemView payItemView2 = (PayItemView) obj;
                payItemView2.setSelected(payItemView2 == payItemView);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public void m8797P0(String str) {
        if (!this.f6965G0) {
            this.f6974N.setText(w8u.u(R$string.f3418m, str));
            return;
        }
        if (this.f6966H0) {
            this.f6963E0.setText(w8u.u(R$string.f3418m, str));
        } else if (this.f6967I0) {
            this.f7693i.setText(w8u.u(R$string.f3418m, str));
        } else {
            this.f6988p0.setText(w8u.u(R$string.f2976R9, str));
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m8798Q0(boolean z) {
        if (z) {
            m8791J0();
        }
        xdl0.M(this.f7705u, z);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: U */
    public void mo8799U() {
        super.mo8799U();
        m8795N0();
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: Z */
    public void mo8800Z(double d, nig nigVar) {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetailM17442Q4 = this.f6964F0.m17442Q4();
        if (bLiveFirstRechargeDetailM17442Q4 != null) {
            this.f6966H0 = bLiveFirstRechargeDetailM17442Q4.emphasizeCheckout;
            this.f6967I0 = bLiveFirstRechargeDetailM17442Q4.showGuideNotice;
        }
        if (bLiveFirstRechargeDetailM17442Q4 != null && bLiveFirstRechargeDetailM17442Q4.isActive && bLiveFirstRechargeDetailM17442Q4.showDialogBonus) {
            this.f6965G0 = false;
            m8808u0(bLiveFirstRechargeDetailM17442Q4);
            this.f6964F0.m17455d5(((int) (bLiveFirstRechargeDetailM17442Q4.bonusEndTime - bLiveFirstRechargeDetailM17442Q4.currentTime)) / 1000);
        } else if (bLiveFirstRechargeDetailM17442Q4 == null || !bLiveFirstRechargeDetailM17442Q4.isActive) {
            this.f6965G0 = false;
            m8807t0(bLiveFirstRechargeDetailM17442Q4);
        } else {
            this.f6965G0 = true;
            m8806s0(bLiveFirstRechargeDetailM17442Q4);
            this.f6964F0.m17455d5(((int) (bLiveFirstRechargeDetailM17442Q4.bonusEndTime - bLiveFirstRechargeDetailM17442Q4.currentTime)) / 1000);
        }
        mo8801a0();
        super.mo8800Z(d, nigVar);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: a0 */
    public void mo8801a0() {
        boolean z = this.f6965G0;
        if (z && this.f6966H0) {
            this.f6988p0.setText(w8u.t(R$string.f2913O9));
        } else if (!z || this.f6967I0) {
            this.f6988p0.setText(w8u.t(R$string.f3517qa));
        } else {
            this.f6988p0.setText(w8u.t(R$string.f2997S9));
        }
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: c0 */
    public void mo8802c0(final LiveFastRechargeItem liveFastRechargeItem) {
        final Drawable drawableB = this.f6965G0 ? kvc0.b(i3c0.f12922q7) : kvc0.b(i3c0.f12874m7);
        final Drawable drawableB2 = this.f6965G0 ? kvc0.b(i3c0.f12531J0) : kvc0.b(i3c0.f12886n7);
        final int iA = this.f6965G0 ? kvc0.a(h1c0.f11832v0) : kvc0.a(h1c0.f11768a);
        final int iA2 = this.f6965G0 ? kvc0.a(h1c0.f11832v0) : kvc0.a(h1c0.f11768a);
        final int iA3 = this.f6965G0 ? kvc0.a(h1c0.f11835w0) : kvc0.a(h1c0.f11742N);
        final int iA4 = this.f6965G0 ? kvc0.a(h1c0.f11835w0) : kvc0.a(h1c0.f11742N);
        liveFastRechargeItem.m8743l0(true, drawableB, drawableB2);
        liveFastRechargeItem.m8745n0(true, iA, iA2, iA3, iA4);
        vwb.z(this.f7675B, new e30() { // from class: l.gsv
            public final void call(Object obj) {
                C0456a.m8779m0(liveFastRechargeItem, drawableB, drawableB2, iA, iA2, iA3, iA4, (LiveFastRechargeItem) obj);
            }
        });
    }

    @Override // p002l.al2
    public void destroy() {
        super.destroy();
        m8805r0();
        bk40.e(this.f6971L0, this.f6973M0);
    }

    /* JADX INFO: renamed from: p0 */
    public View m8803p0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ssv.m22637b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public View m8804q0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tsv.m23163b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8805r0() {
        AnimatorSet animatorSet = this.f6968J0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f6968J0.cancel();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m8806s0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.M(this.f7696l, false);
        m8793L0(true, false);
        m8792K0(false, null);
        m8790I0(true, bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8807t0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.M(this.f7696l, true);
        m8793L0(false, false);
        m8792K0(false, null);
        m8790I0(false, bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m8808u0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.M(this.f7696l, false);
        m8793L0(false, true);
        m8790I0(false, bLiveFirstRechargeDetail);
        m8792K0(true, bLiveFirstRechargeDetail);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: v */
    public void mo8809v() {
        super.mo8809v();
        this.f6964F0.m17459h5();
        m8805r0();
        this.f7690f.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8810v0(View view) {
        mo8813y(true);
        zgc0.m27333h();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8811w0() {
        this.f6968J0.start();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m8812x0(View view) {
        this.f6964F0.m17453b5(ddv.t);
    }

    @Override // p002l.al2
    /* JADX INFO: renamed from: y */
    public void mo8813y(boolean z) {
        if (m9852J()) {
            return;
        }
        if (!z) {
            this.f6981U.setVisibility(0);
            this.f6982V.setVisibility(8);
        } else {
            this.f7710z.m20412t4(false);
            this.f6981U.setVisibility(8);
            this.f6982V.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m8814y0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, View view) {
        m8794M0(bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8815z0() {
        xdl0.M(this.f7705u, false);
    }
}
