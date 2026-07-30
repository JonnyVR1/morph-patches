package com.p046p1.mobile.putong.live.livingroom.increment.recharge;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBonus;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.C12867a;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LiveFastRechargeItem;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.PayItemView;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import java.io.File;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.al2;
import p149l.bk40;
import p149l.bt0;
import p149l.ddv;
import p149l.e30;
import p149l.e51;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.ltv;
import p149l.nig;
import p149l.ssv;
import p149l.t100;
import p149l.tsv;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.xj40;
import p149l.ydt;
import p149l.ypv;
import p149l.zgc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.recharge.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12867a extends al2 {

    /* JADX INFO: renamed from: E0 */
    public VText f50921E0;

    /* JADX INFO: renamed from: F0 */
    public ltv f50922F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f50923G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f50924H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f50925I0;

    /* JADX INFO: renamed from: J0 */
    public AnimatorSet f50926J0;

    /* JADX INFO: renamed from: K0 */
    public View f50927K0;

    /* JADX INFO: renamed from: L */
    public VText f50928L;

    /* JADX INFO: renamed from: L0 */
    public Bitmap f50929L0;

    /* JADX INFO: renamed from: M */
    public VImage f50930M;

    /* JADX INFO: renamed from: M0 */
    public DownloadTask f50931M0;

    /* JADX INFO: renamed from: N */
    public VText f50932N;

    /* JADX INFO: renamed from: O */
    public VText f50933O;

    /* JADX INFO: renamed from: P */
    public LocalFirstRechargeGiftItemView f50934P;

    /* JADX INFO: renamed from: Q */
    public LocalFirstRechargeGiftItemView f50935Q;

    /* JADX INFO: renamed from: R */
    public LocalFirstRechargeGiftItemView f50936R;

    /* JADX INFO: renamed from: S */
    public PayItemView f50937S;

    /* JADX INFO: renamed from: T */
    public PayItemView f50938T;

    /* JADX INFO: renamed from: U */
    public VText f50939U;

    /* JADX INFO: renamed from: V */
    public Group f50940V;

    /* JADX INFO: renamed from: W */
    public ConstraintLayout f50941W;

    /* JADX INFO: renamed from: X */
    public VLinear f50942X;

    /* JADX INFO: renamed from: Y */
    public LocalNewFirstRechargeGiftItemView f50943Y;

    /* JADX INFO: renamed from: Z */
    public LocalNewFirstRechargeGiftItemView f50944Z;

    /* JADX INFO: renamed from: k0 */
    public LocalNewFirstRechargeGiftItemView f50945k0;

    /* JADX INFO: renamed from: p0 */
    public VText f50946p0;

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m75163m0(LiveFastRechargeItem liveFastRechargeItem, Drawable drawable, Drawable drawable2, int i, int i2, int i3, int i4, LiveFastRechargeItem liveFastRechargeItem2) {
        if (liveFastRechargeItem2 != liveFastRechargeItem) {
            liveFastRechargeItem2.m75127l0(false, drawable, drawable2);
            liveFastRechargeItem2.m75129n0(false, i, i2, i3, i4);
        }
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: A */
    public VText mo75166A() {
        return this.f50946p0;
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m75167A0(File file) {
        xj40.m209684a(this.f70393u, file);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m75168B0(File file) {
        this.f70393u.setBackgroundResource(0);
        this.f50929L0 = xj40.m209684a(this.f70393u, file);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m75169D0(final File file) {
        e51.m114742G(new Runnable() { // from class: l.isv
            @Override // java.lang.Runnable
            public final void run() {
                this.f114805a.m75168B0(file);
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m75170E0(View view) {
        this.f50922F0.m151749b5(ddv.f85669s);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: F */
    public void mo75171F() {
        this.f50922F0 = (ltv) this.f70398z;
        View viewM75188q0 = m75188q0(getAct().inflater(), null);
        this.f50946p0.setTextColor(kvc0.m147352a(h1c0.f105345Y0));
        this.f50946p0.setEnabled(true);
        this.f50937S.m75154k0(ypv.f199493a.m199350i());
        this.f50937S.setOnClickListener(new View.OnClickListener() { // from class: l.jsv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119544a.m75173H0(view);
            }
        });
        this.f50938T.m75154k0(ypv.f199493a.m199354k());
        this.f50938T.setOnClickListener(new View.OnClickListener() { // from class: l.jsv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119544a.m75173H0(view);
            }
        });
        if (ypv.f199493a.m199357l0()) {
            mo75197y(false);
            xdl0.m208329E0(this.f50939U, new View.OnClickListener() { // from class: l.ksv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124508a.m75194v0(view);
                }
            });
        } else {
            mo75197y(true);
        }
        m75179N0();
        this.f70392t.addView(viewM75188q0);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m75172G0() {
        m75189r0();
        int iM186890d = t100.m186890d(27.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorM103737j = bt0.m103737j(3000);
        float f = iM186890d;
        this.f70381i.setTranslationY(f);
        if (this.f50926J0 == null) {
            this.f50926J0 = new AnimatorSet();
            VText vText = this.f70380h;
            Property property = View.TRANSLATION_Y;
            float f2 = -iM186890d;
            animatorSet.playTogether((ObjectAnimator) bt0.m103739l(vText, property, 3000L, 300L, null, 0.0f, f2), (ObjectAnimator) bt0.m103739l(this.f70381i, property, 3000L, 300L, null, f, 0.0f));
            animatorSet2.playTogether((ObjectAnimator) bt0.m103739l(this.f70380h, property, 3000L, 300L, null, f, 0.0f), (ObjectAnimator) bt0.m103739l(this.f70381i, property, 3000L, 300L, null, 0.0f, f2));
            this.f50926J0.playSequentially(animatorSet, animatorM103737j, animatorSet2);
        }
        bt0.m103733f(this.f50926J0, new Runnable() { // from class: l.qsv
            @Override // java.lang.Runnable
            public final void run() {
                this.f156276a.m75195w0();
            }
        });
        this.f50926J0.start();
    }

    /* JADX INFO: renamed from: H0 */
    public void m75173H0(View view) {
        if (view == this.f50937S) {
            this.f70370I = ypv.f199493a.m199350i();
            m75180O0(this.f50937S);
        } else if (view == this.f50938T) {
            this.f70370I = ypv.f199493a.m199354k();
            m75180O0(this.f50938T);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m75174I0(boolean z, final BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.m208357U(this.f70377e, z ? t100.m186890d(59.0f) : t100.m186890d(0.0f));
        xdl0.m208344M(this.f70397y, z);
        if (z) {
            hxs.m133406s("context_livingAct", this.f70397y, ydt.f197619i);
        }
        xdl0.m208344M(this.f70382j, z);
        this.f70378f.setBackground(kvc0.m147353b(z ? i3c0.f111026h4 : i3c0.f111035i1));
        xdl0.m208329E0(this.f70382j, new View.OnClickListener() { // from class: l.msv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135536a.m75196x0(view);
            }
        });
        xdl0.m208358V(this.f50946p0, this.f50924H0 ? t100.m186890d(47.0f) : t100.m186890d(0.0f));
        xdl0.m208359W(this.f50946p0, this.f50924H0 ? t100.m186890d(47.0f) : t100.m186890d(0.0f));
        xdl0.m208344M(this.f50943Y, this.f50924H0);
        xdl0.m208344M(this.f50944Z, this.f50924H0);
        xdl0.m208344M(this.f50945k0, this.f50924H0);
        xdl0.m208344M(this.f50942X, this.f50924H0);
        xdl0.m208344M(this.f50921E0, this.f50924H0);
        if (z && this.f50924H0 && bLiveFirstRechargeDetail != null) {
            this.f50943Y.m75145i0(bLiveFirstRechargeDetail.bonus.get(0), false, false);
            this.f50944Z.m75145i0(bLiveFirstRechargeDetail.bonus.get(1), false, false);
            this.f50945k0.m75145i0(bLiveFirstRechargeDetail.bonus.get(2), false, false);
        }
        xdl0.m208344M(this.f70379g, z && this.f50925I0);
        xdl0.m208344M(this.f70380h, z && this.f50925I0);
        if (bLiveFirstRechargeDetail != null && !TextUtils.isEmpty(bLiveFirstRechargeDetail.guideNotice)) {
            this.f70380h.setText(bLiveFirstRechargeDetail.guideNotice);
        }
        xdl0.m208344M(this.f70381i, z && bLiveFirstRechargeDetail != null && bLiveFirstRechargeDetail.showGuideNotice);
        this.f70386n.m75131p0(bLiveFirstRechargeDetail != null && bLiveFirstRechargeDetail.decorateCheckout);
        if (bLiveFirstRechargeDetail != null) {
            this.f70386n.m75132q0(bLiveFirstRechargeDetail.checkoutBanner);
        }
        if (z && this.f50925I0 && !this.f50924H0) {
            m75172G0();
            m75178M0(bLiveFirstRechargeDetail);
            this.f70379g.setOnClickListener(new View.OnClickListener() { // from class: l.nsv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140298a.m75198y0(bLiveFirstRechargeDetail, view);
                }
            });
            this.f70378f.setDispatchListener(new CustomClickConstraintLayout.InterfaceC12865a() { // from class: l.osv
                @Override // com.p046p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout.InterfaceC12865a
                /* JADX INFO: renamed from: a */
                public final void mo75119a() {
                    this.f145514a.m75199z0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m75175J0() {
        final File fileM102264d = bk40.m102264d(this.f70398z.m104249C0(), "https://auto.tancdn.com/v1/images/eyJpZCI6IllWVTZIWk9JMkxHRlFMNEdTT0pITlpKSElTRFhLRTE0IiwidyI6NDk1LCJoIjo1OTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEwNjk1NjAxNzYyMjgyMjU5fQ.png");
        if (fileM102264d.exists()) {
            e51.m114742G(new Runnable() { // from class: l.rsv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160900a.m75167A0(fileM102264d);
                }
            });
        } else {
            this.f50931M0 = bk40.m102266f("https://auto.tancdn.com/v1/images/eyJpZCI6IllWVTZIWk9JMkxHRlFMNEdTT0pITlpKSElTRFhLRTE0IiwidyI6NDk1LCJoIjo1OTQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTEwNjk1NjAxNzYyMjgyMjU5fQ.png", fileM102264d, new e30() { // from class: l.hsv
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109349a.m75169D0((File) obj);
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m75176K0(boolean z, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        if (!z || bLiveFirstRechargeDetail == null) {
            xdl0.m208344M(this.f70383k, false);
            return;
        }
        this.f70383k.setBackgroundResource(i3c0.f110705F7);
        xdl0.m208344M(this.f70383k, true);
        if (this.f50927K0 != null) {
            return;
        }
        this.f50927K0 = m75187p0(getAct().inflater(), null);
        this.f50928L.setText(this.f50922F0.m170097d4() ? w8u.m202217t(R$string.f47354l) : w8u.m202217t(R$string.f47398n));
        xdl0.m208344M(this.f50930M, true);
        xdl0.m208329E0(this.f50930M, new View.OnClickListener() { // from class: l.psv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151065a.m75170E0(view);
            }
        });
        List<BLiveBonus> list = bLiveFirstRechargeDetail.bonus;
        if (!vwb.m200296J(list) && list.size() >= 3) {
            this.f50934P.m75141l0(this.f70398z, list.get(0), false, null);
            this.f50935Q.m75141l0(this.f70398z, list.get(1), false, null);
            this.f50936R.m75141l0(this.f70398z, list.get(2), false, null);
        }
        xdl0.m208344M(this.f50932N, true);
        this.f70383k.addView(this.f50927K0);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m75177L0(boolean z, boolean z2) {
        this.f70385m.setTextColor(kvc0.m147352a(z ? h1c0.f105395p1 : h1c0.f105322N));
        this.f50937S.setTextColor(kvc0.m147352a(z ? h1c0.f105416w1 : h1c0.f105322N));
        this.f50937S.setCheckBoxStyle(kvc0.m147353b(z ? i3c0.f110834Q6 : i3c0.f110878U6));
        this.f50938T.setTextColor(kvc0.m147352a(z ? h1c0.f105416w1 : h1c0.f105322N));
        this.f50938T.setCheckBoxStyle(kvc0.m147353b(z ? i3c0.f110834Q6 : i3c0.f110878U6));
        Drawable drawableM147353b = kvc0.m147353b(z ? i3c0.f110928Z1 : i3c0.f111150r8);
        drawableM147353b.setBounds(0, 0, drawableM147353b.getMinimumWidth(), drawableM147353b.getMinimumHeight());
        this.f50939U.setCompoundDrawables(null, null, drawableM147353b, null);
        this.f50939U.setTextColor(kvc0.m147352a(z ? h1c0.f105416w1 : h1c0.f105322N));
        this.f50946p0.setTextColor(kvc0.m147352a(z ? h1c0.f105412v0 : h1c0.f105362e1));
        this.f50946p0.setBackground(ypv.f199497e.getResources().getDrawable(z ? i3c0.f111005f7 : i3c0.f110867T6));
        m97255Y(kvc0.m147352a(z ? h1c0.f105412v0 : h1c0.f105348a), kvc0.m147352a(z ? h1c0.f105415w0 : h1c0.f105322N));
        xdl0.m208374f0(this.f70378f, ((this.f50925I0 && z) || z2) ? t100.m186890d(0.0f) : t100.m186890d(14.0f));
    }

    /* JADX INFO: renamed from: M0 */
    public final void m75178M0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        if (bLiveFirstRechargeDetail == null || bLiveFirstRechargeDetail.bonus.size() < 3) {
            return;
        }
        m75175J0();
        xdl0.m208344M(this.f70393u, true);
        ((ltv) this.f70398z).m151752e5();
        this.f70394v.m75147Q(bLiveFirstRechargeDetail.bonus.get(0));
        this.f70395w.m75147Q(bLiveFirstRechargeDetail.bonus.get(1));
        this.f70396x.m75147Q(bLiveFirstRechargeDetail.bonus.get(2));
    }

    /* JADX INFO: renamed from: N0 */
    public void m75179N0() {
        if (ypv.f199493a.m199317J()) {
            return;
        }
        this.f50937S.performClick();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m75180O0(@Nullable final PayItemView payItemView) {
        this.f50946p0.setTextColor(ypv.f199497e.getResources().getColor(this.f50923G0 ? h1c0.f105412v0 : h1c0.f105362e1));
        vwb.m200354z(vwb.m200324f0(this.f50937S, this.f50938T), new e30() { // from class: l.lsv
            @Override // p149l.e30
            public final void call(Object obj) {
                PayItemView payItemView2 = (PayItemView) obj;
                payItemView2.setSelected(payItemView2 == payItemView);
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public void m75181P0(String str) {
        if (!this.f50923G0) {
            this.f50932N.setText(w8u.m202218u(R$string.f47376m, str));
            return;
        }
        if (this.f50924H0) {
            this.f50921E0.setText(w8u.m202218u(R$string.f47376m, str));
        } else if (this.f50925I0) {
            this.f70381i.setText(w8u.m202218u(R$string.f47376m, str));
        } else {
            this.f50946p0.setText(w8u.m202218u(R$string.f46934R9, str));
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m75182Q0(boolean z) {
        if (z) {
            m75175J0();
        }
        xdl0.m208344M(this.f70393u, z);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: U */
    public void mo75183U() {
        super.mo75183U();
        m75179N0();
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: Z */
    public void mo75184Z(double d, nig nigVar) {
        BLiveFirstRechargeDetail bLiveFirstRechargeDetailM151738Q4 = this.f50922F0.m151738Q4();
        if (bLiveFirstRechargeDetailM151738Q4 != null) {
            this.f50924H0 = bLiveFirstRechargeDetailM151738Q4.emphasizeCheckout;
            this.f50925I0 = bLiveFirstRechargeDetailM151738Q4.showGuideNotice;
        }
        if (bLiveFirstRechargeDetailM151738Q4 != null && bLiveFirstRechargeDetailM151738Q4.isActive && bLiveFirstRechargeDetailM151738Q4.showDialogBonus) {
            this.f50923G0 = false;
            m75192u0(bLiveFirstRechargeDetailM151738Q4);
            this.f50922F0.m151751d5(((int) (bLiveFirstRechargeDetailM151738Q4.bonusEndTime - bLiveFirstRechargeDetailM151738Q4.currentTime)) / 1000);
        } else if (bLiveFirstRechargeDetailM151738Q4 == null || !bLiveFirstRechargeDetailM151738Q4.isActive) {
            this.f50923G0 = false;
            m75191t0(bLiveFirstRechargeDetailM151738Q4);
        } else {
            this.f50923G0 = true;
            m75190s0(bLiveFirstRechargeDetailM151738Q4);
            this.f50922F0.m151751d5(((int) (bLiveFirstRechargeDetailM151738Q4.bonusEndTime - bLiveFirstRechargeDetailM151738Q4.currentTime)) / 1000);
        }
        mo75185a0();
        super.mo75184Z(d, nigVar);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: a0 */
    public void mo75185a0() {
        boolean z = this.f50923G0;
        if (z && this.f50924H0) {
            this.f50946p0.setText(w8u.m202217t(R$string.f46871O9));
        } else if (!z || this.f50925I0) {
            this.f50946p0.setText(w8u.m202217t(R$string.f47475qa));
        } else {
            this.f50946p0.setText(w8u.m202217t(R$string.f46955S9));
        }
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: c0 */
    public void mo75186c0(final LiveFastRechargeItem liveFastRechargeItem) {
        final Drawable drawableM147353b = this.f50923G0 ? kvc0.m147353b(i3c0.f111137q7) : kvc0.m147353b(i3c0.f111089m7);
        final Drawable drawableM147353b2 = this.f50923G0 ? kvc0.m147353b(i3c0.f110746J0) : kvc0.m147353b(i3c0.f111101n7);
        final int iM147352a = this.f50923G0 ? kvc0.m147352a(h1c0.f105412v0) : kvc0.m147352a(h1c0.f105348a);
        final int iM147352a2 = this.f50923G0 ? kvc0.m147352a(h1c0.f105412v0) : kvc0.m147352a(h1c0.f105348a);
        final int iM147352a3 = this.f50923G0 ? kvc0.m147352a(h1c0.f105415w0) : kvc0.m147352a(h1c0.f105322N);
        final int iM147352a4 = this.f50923G0 ? kvc0.m147352a(h1c0.f105415w0) : kvc0.m147352a(h1c0.f105322N);
        liveFastRechargeItem.m75127l0(true, drawableM147353b, drawableM147353b2);
        liveFastRechargeItem.m75129n0(true, iM147352a, iM147352a2, iM147352a3, iM147352a4);
        vwb.m200354z(this.f70363B, new e30() { // from class: l.gsv
            @Override // p149l.e30
            public final void call(Object obj) {
                C12867a.m75163m0(liveFastRechargeItem, drawableM147353b, drawableM147353b2, iM147352a, iM147352a2, iM147352a3, iM147352a4, (LiveFastRechargeItem) obj);
            }
        });
    }

    @Override // p149l.al2, p149l.s7m
    public void destroy() {
        super.destroy();
        m75189r0();
        bk40.m102265e(this.f50929L0, this.f50931M0);
    }

    /* JADX INFO: renamed from: p0 */
    public View m75187p0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ssv.m185775b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q0 */
    public View m75188q0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tsv.m190574b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m75189r0() {
        AnimatorSet animatorSet = this.f50926J0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f50926J0.cancel();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m75190s0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.m208344M(this.f70384l, false);
        m75177L0(true, false);
        m75176K0(false, null);
        m75174I0(true, bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75191t0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.m208344M(this.f70384l, true);
        m75177L0(false, false);
        m75176K0(false, null);
        m75174I0(false, bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75192u0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        xdl0.m208344M(this.f70384l, false);
        m75177L0(false, true);
        m75174I0(false, bLiveFirstRechargeDetail);
        m75176K0(true, bLiveFirstRechargeDetail);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: v */
    public void mo75193v() {
        super.mo75193v();
        this.f50922F0.m151755h5();
        m75189r0();
        this.f70378f.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m75194v0(View view) {
        mo75197y(true);
        zgc0.m218636h();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m75195w0() {
        this.f50926J0.start();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m75196x0(View view) {
        this.f50922F0.m151749b5(ddv.f85670t);
    }

    @Override // p149l.al2
    /* JADX INFO: renamed from: y */
    public void mo75197y(boolean z) {
        if (m97241J()) {
            return;
        }
        if (!z) {
            this.f50939U.setVisibility(0);
            this.f50940V.setVisibility(8);
        } else {
            this.f70398z.m170108t4(false);
            this.f50939U.setVisibility(8);
            this.f50940V.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m75198y0(BLiveFirstRechargeDetail bLiveFirstRechargeDetail, View view) {
        m75178M0(bLiveFirstRechargeDetail);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m75199z0() {
        xdl0.m208344M(this.f70393u, false);
    }
}
