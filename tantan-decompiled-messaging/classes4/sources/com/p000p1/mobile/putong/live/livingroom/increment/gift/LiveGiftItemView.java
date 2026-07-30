package com.p000p1.mobile.putong.live.livingroom.increment.gift;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftNameStatus;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.io.IOException;
import l.ap0;
import l.bt0;
import l.e30;
import l.hce;
import l.hxs;
import l.kvc0;
import l.t0g0;
import l.t100;
import l.u6n;
import l.w8u;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.Nullable;
import p002l.ahs;
import p002l.avj;
import p002l.fhs;
import p002l.h1c0;
import p002l.hqe;
import p002l.ihs;
import p002l.mmj;
import p002l.nqe;
import p002l.phs;
import p002l.qrj;
import p002l.qvj;
import p002l.r1e;
import p002l.trj;
import p002l.whs;
import p002l.xxj;
import p002l.ywj;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public ywj f5545A;

    /* JADX INFO: renamed from: B */
    public phs f5546B;

    /* JADX INFO: renamed from: C */
    public qrj f5547C;

    /* JADX INFO: renamed from: D */
    public ahs<?> f5548D;

    /* JADX INFO: renamed from: E */
    public int f5549E;

    /* JADX INFO: renamed from: F */
    public avj f5550F;

    /* JADX INFO: renamed from: G */
    public fhs f5551G;

    /* JADX INFO: renamed from: H */
    public ihs f5552H;

    /* JADX INFO: renamed from: I */
    public boolean f5553I;

    /* JADX INFO: renamed from: J */
    public boolean f5554J;

    /* JADX INFO: renamed from: K */
    public int f5555K;

    /* JADX INFO: renamed from: d */
    public VDraweeView f5556d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f5557e;

    /* JADX INFO: renamed from: f */
    public VImage f5558f;

    /* JADX INFO: renamed from: g */
    public VText f5559g;

    /* JADX INFO: renamed from: h */
    public VText f5560h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5561i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f5562j;

    /* JADX INFO: renamed from: k */
    public View f5563k;

    /* JADX INFO: renamed from: l */
    public TextView f5564l;

    /* JADX INFO: renamed from: m */
    public View f5565m;

    /* JADX INFO: renamed from: n */
    public ProgressBar f5566n;

    /* JADX INFO: renamed from: o */
    public Group f5567o;

    /* JADX INFO: renamed from: p */
    public VText f5568p;

    /* JADX INFO: renamed from: q */
    public VText f5569q;

    /* JADX INFO: renamed from: r */
    public View f5570r;

    /* JADX INFO: renamed from: s */
    public View f5571s;

    /* JADX INFO: renamed from: t */
    public VText f5572t;

    /* JADX INFO: renamed from: u */
    public VText f5573u;

    /* JADX INFO: renamed from: v */
    public View f5574v;

    /* JADX INFO: renamed from: w */
    public VText f5575w;

    /* JADX INFO: renamed from: x */
    public VText f5576x;

    /* JADX INFO: renamed from: y */
    public Animator f5577y;

    /* JADX INFO: renamed from: z */
    public AnimatorSet f5578z;

    public LiveGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5553I = false;
        this.f5554J = false;
        this.f5555K = 1;
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m6977H0(ihs ihsVar) {
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        if (bLiveGiftItemM15160h == null) {
            return false;
        }
        return hqe.m14673a(bLiveGiftItemM15160h, !m7017G0());
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m6978I0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localRightTag;
        return ((langModel == null || TextUtils.isEmpty(langModel.getLocalName())) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m6979J0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localTag;
        if (langModel != null) {
            return (TextUtils.isEmpty(langModel.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m6980K0(boolean z, long j, Integer num) {
        if (this.f5552H == null) {
            return;
        }
        int iIntValue = num.intValue();
        this.f5555K = iIntValue;
        if (iIntValue == 4) {
            this.f5552H.m15152A(true);
            m6985X0();
            if (this.f5553I) {
                m6983T0();
            }
        }
        if (z) {
            nqe.m18944G(this.f5552H.m15160h().liveResourceId, false, this.f5555K != 4, System.currentTimeMillis() - j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m6981N0() {
        AnimatorSet animatorSet = this.f5578z;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m6982O0() {
        xdl0.M(this.f5569q, true);
    }

    /* JADX INFO: renamed from: T0 */
    private void m6983T0() {
        m6997k1(this.f5552H);
        m6995j1(this.f5552H.m15160h());
        m7022S0(this.f5552H.m15160h());
        m6992h1(this.f5552H.m15160h());
    }

    /* JADX INFO: renamed from: V0 */
    private void m6984V0(BLiveGiftItem bLiveGiftItem) {
        if (TextUtils.isEmpty(bLiveGiftItem.url) && TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) {
            return;
        }
        String str = (!ypv.k().R6() || TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) ? bLiveGiftItem.url : bLiveGiftItem.dynamicUrl;
        xdl0.M(this.f5557e, w8u.z(str));
        xdl0.M0(this.f5556d, !w8u.z(str));
        if (w8u.z(str)) {
            this.f5557e.l(str, -1, (ap0) null);
            return;
        }
        VDraweeView vDraweeView = this.f5556d;
        int i = t100.F;
        hxs.u("context_livingAct", vDraweeView, str, i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    private void m6985X0() {
        boolean z = false;
        xdl0.M(this.f5567o, false);
        this.f5554J = true;
        BLiveGiftItem bLiveGiftItemM15160h = this.f5552H.m15160h();
        xdl0.M(this.f5561i, bLiveGiftItemM15160h.isCountTimeGift());
        if (bLiveGiftItemM15160h.isJumpGift()) {
            xdl0.M(this.f5575w, false);
            this.f5560h.setText(bLiveGiftItemM15160h.getJumpGiftName());
            this.f5560h.setTextColor(-1);
            this.f5568p.setText(bLiveGiftItemM15160h.getLocalSubtitle());
            this.f5568p.setTextColor(kvc0.a(h1c0.f11725E0));
            xdl0.M(this.f5568p, true);
            this.f5569q.setText(bLiveGiftItemM15160h.expiredTimeText);
            this.f5569q.setTextColor(kvc0.a(h1c0.f11820r0));
            xdl0.M(this.f5569q, false);
            return;
        }
        this.f5560h.setText(bLiveGiftItemM15160h.getLocalName());
        this.f5560h.setTextColor(kvc0.a(h1c0.f11836w1));
        this.f5568p.setTextColor(kvc0.a(h1c0.f11809n1));
        setAlpha(1.0f);
        if (bLiveGiftItemM15160h.isPaidGift()) {
            xdl0.M(this.f5575w, false);
            xdl0.M(this.f5569q, false);
            setGiftPrice(bLiveGiftItemM15160h);
            return;
        }
        if (!bLiveGiftItemM15160h.isPacketGift()) {
            if (bLiveGiftItemM15160h.isScrapGift()) {
                xdl0.M(this.f5575w, true);
                m7030q1(bLiveGiftItemM15160h.remain, bLiveGiftItemM15160h.expiredTimeText);
                return;
            }
            return;
        }
        xdl0.M(this.f5575w, true);
        this.f5569q.setTextColor(kvc0.a(h1c0.f11820r0));
        if (!this.f5552H.m15167o() && !TextUtils.isEmpty(bLiveGiftItemM15160h.expiredTimeText)) {
            z = true;
        }
        xdl0.M(this.f5569q, z);
        xdl0.M(this.f5568p, !z);
        setGiftPrice(bLiveGiftItemM15160h);
        m7005r1(bLiveGiftItemM15160h.remain, bLiveGiftItemM15160h.expiredTimeText, z);
    }

    /* JADX INFO: renamed from: Y0 */
    private void m6986Y0(BLiveGiftItem bLiveGiftItem) {
        BLiveGiftNameStatus bLiveGiftNameStatus = bLiveGiftItem.nameStatus;
        if (bLiveGiftNameStatus == null || !bLiveGiftNameStatus.status) {
            xdl0.M(this.f5558f, false);
            xdl0.M(this.f5559g, false);
        } else {
            xdl0.M(this.f5558f, true);
            xdl0.M(this.f5559g, true);
            this.f5559g.setText(bLiveGiftItem.nameStatus.userName);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private void m6987Z0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM26164a = xxj.m26164a(bLiveGiftItem);
        if (gradientDrawableM26164a != null) {
            this.f5573u.setBackground(gradientDrawableM26164a);
        }
        if (!m6978I0(bLiveGiftItem)) {
            m7011v0();
        } else {
            this.f5573u.setText(bLiveGiftItem.getLocalRightTagName());
            m6989f1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    private void m6988a1(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM26166c = xxj.m26166c(bLiveGiftItem);
        if (gradientDrawableM26166c != null) {
            this.f5572t.setBackground(gradientDrawableM26166c);
        }
        if (!m6979J0(bLiveGiftItem)) {
            m7012w0();
            return;
        }
        this.f5572t.setText(bLiveGiftItem.getLocalTagName());
        this.f5572t.setTextColor(kvc0.g(bLiveGiftItem.tagTextColor));
        m6990g1();
    }

    /* JADX INFO: renamed from: f1 */
    private void m6989f1() {
        xdl0.M(this.f5573u, true);
    }

    /* JADX INFO: renamed from: g1 */
    private void m6990g1() {
        xdl0.M(this.f5572t, true);
    }

    /* JADX INFO: renamed from: h1 */
    private void m6992h1(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hasRotationAnim()) {
            if (this.f5546B == null) {
                this.f5546B = new phs(this, this.f5548D.m9728O4(bLiveGiftItem.showAnimRules.showAction.frequency));
            }
            this.f5546B.m20330q(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private void m6995j1(BLiveGiftItem bLiveGiftItem) {
        if (this.f5552H.m15160h().hidePrice) {
            if (TextUtils.isEmpty(this.f5552H.m15160h().expiredTimeText)) {
                return;
            }
            xdl0.M(this.f5569q, true);
            xdl0.M(this.f5568p, false);
            return;
        }
        if (!bLiveGiftItem.isJumpGift() || TextUtils.isEmpty(bLiveGiftItem.expiredTimeText)) {
            return;
        }
        m7004r0();
        int iD = t100.d(13.0f);
        float f = iD;
        this.f5569q.setTranslationY(f);
        xdl0.M(this.f5569q, true);
        if (this.f5578z == null) {
            float f2 = -iD;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.l(this.f5568p, property, 3000L, 300L, (Interpolator) null, new float[]{0.0f, f2});
            ObjectAnimator objectAnimator2 = (ObjectAnimator) bt0.l(this.f5569q, property, 3000L, 300L, (Interpolator) null, new float[]{f, 0.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimator, objectAnimator2);
            Animator animatorJ = bt0.j(3000);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) bt0.l(this.f5568p, property, 3000L, 300L, (Interpolator) null, new float[]{f, 0.0f});
            ObjectAnimator objectAnimator4 = (ObjectAnimator) bt0.l(this.f5569q, property, 3000L, 300L, (Interpolator) null, new float[]{0.0f, f2});
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimator3, objectAnimator4);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f5578z = animatorSet3;
            animatorSet3.playSequentially(animatorSet, animatorJ, animatorSet2);
        }
        bt0.f(this.f5578z, new Runnable() { // from class: l.shs
            @Override // java.lang.Runnable
            public final void run() {
                this.f19035a.m6981N0();
            }
        });
        this.f5578z.start();
    }

    /* JADX INFO: renamed from: k1 */
    private void m6997k1(final ihs ihsVar) {
        if (ihsVar.m15160h().hidePrice) {
            if (TextUtils.isEmpty(ihsVar.m15160h().expiredTimeText)) {
                return;
            }
            xdl0.M(this.f5569q, true);
            return;
        }
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        if (!bLiveGiftItemM15160h.isPacketGift() || bLiveGiftItemM15160h.remain <= 0) {
            m7006s0();
            return;
        }
        if (!ihsVar.m15167o() || TextUtils.isEmpty(bLiveGiftItemM15160h.expiredTimeText)) {
            if (TextUtils.isEmpty(bLiveGiftItemM15160h.expiredTimeText)) {
                setGiftPrice(bLiveGiftItemM15160h);
                return;
            } else {
                xdl0.M(this.f5569q, true);
                return;
            }
        }
        m7006s0();
        setGiftPrice(bLiveGiftItemM15160h);
        int iD = t100.d(16.0f);
        float f = iD;
        this.f5569q.setTranslationY(f);
        Property property = View.TRANSLATION_Y;
        Animator animatorZ = bt0.z(new Animator[]{bt0.l(this.f5568p, property, 3000L, 300L, (Interpolator) null, new float[]{0.0f, -iD}), bt0.l(this.f5569q, property, 3000L, 300L, (Interpolator) null, new float[]{f, 0.0f})});
        this.f5577y = animatorZ;
        bt0.w(animatorZ, new Runnable() { // from class: l.uhs
            @Override // java.lang.Runnable
            public final void run() {
                this.f20658a.m6982O0();
            }
        }, new Runnable() { // from class: l.vhs
            @Override // java.lang.Runnable
            public final void run() {
                ihsVar.m15176x(false);
            }
        });
        this.f5577y.start();
    }

    /* JADX INFO: renamed from: n0 */
    private void m6999n0(ihs ihsVar, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f5547C == null) {
            this.f5547C = new qrj(this.f5548D);
        }
        this.f5547C.m21529u(ihsVar, this, this.f5549E, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: n1 */
    private void m7000n1() {
        this.f5555K = qvj.m21584a(this.f5552H);
    }

    /* JADX INFO: renamed from: o0 */
    private void m7001o0(int i, final boolean z) {
        if (this.f5551G != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f5551G.m13218f(i, z, new e30() { // from class: l.ths
                public final void call(Object obj) {
                    this.f20237a.m6980K0(z, jCurrentTimeMillis, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m7002p0(ihs ihsVar) {
        ihsVar.m15152A(m6977H0(ihsVar) || ihsVar.m15160h().isCountTimeGift());
        m7009t1(ihsVar);
        m7000n1();
    }

    /* JADX INFO: renamed from: q0 */
    private void m7003q0() {
        phs phsVar = this.f5546B;
        if (phsVar != null) {
            phsVar.m20325l();
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m7004r0() {
        AnimatorSet animatorSet = this.f5578z;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f5578z.cancel();
        }
    }

    /* JADX INFO: renamed from: r1 */
    private void m7005r1(int i, String str, boolean z) {
        m7007s1(i);
        VText vText = this.f5569q;
        if (i > 0) {
            vText.setText(mmj.m18043D(str));
        } else {
            vText.setText(ypv.e.getString(R$string.f3291g3));
        }
        Animator animator = this.f5577y;
        if (animator == null || !animator.isRunning()) {
            if (!z) {
                xdl0.M(this.f5568p, true);
            } else {
                xdl0.M(this.f5569q, true);
                xdl0.M(this.f5568p, false);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m7006s0() {
        Animator animator = this.f5577y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f5577y.cancel();
        }
        this.f5569q.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: s1 */
    private void m7007s1(int i) {
        this.f5575w.setText(String.valueOf(i));
    }

    private void setGiftDialogAnchorId(ihs ihsVar) {
        ahs<?> ahsVar = this.f5548D;
        if (ahsVar != null) {
            ahsVar.m9746Y5(String.valueOf(ihsVar.m15160h().id));
        }
    }

    private void setGiftPrice(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hidePrice) {
            xdl0.M(this.f5568p, false);
            return;
        }
        if (!xdl0.O0(this.f5569q)) {
            xdl0.M(this.f5568p, true);
        }
        this.f5568p.setText(String.format(ypv.e.getString(u6n.a() ? R$string.f3543re : R$string.f3433me), t0g0.d(bLiveGiftItem.getPrice())));
    }

    /* JADX INFO: renamed from: t0 */
    private void m7008t0() {
        ywj ywjVar = this.f5545A;
        if (ywjVar != null) {
            ywjVar.m26963e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    private void m7009t1(ihs ihsVar) {
        setAlpha(ihsVar.m15160h().interactStatus.equals("SetToGray") ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: u1 */
    private void m7010u1(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        bLiveGiftItem.updateTagColorFromBrief(bLiveGivenGiftBrief);
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tag)) {
            String str = bLiveGivenGiftBrief.tag;
            bLiveGiftItem.tag = str;
            try {
                bLiveGiftItem.localTag = (LangModel) LangModel.JSON_ADAPTER.parse(str);
            } catch (IOException unused) {
            }
        }
        m6988a1(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: v0 */
    private void m7011v0() {
        xdl0.M(this.f5573u, false);
    }

    /* JADX INFO: renamed from: w0 */
    private void m7012w0() {
        xdl0.M(this.f5572t, false);
    }

    /* JADX INFO: renamed from: y0 */
    private void m7013y0() {
        if (m7017G0() && this.f5551G == null && !this.f5552H.m15168p()) {
            this.f5551G = new fhs(this.f5552H, this, this.f5549E, this.f5548D);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m7014B0() {
        return this.f5555K == 4;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m7015D0() {
        return this.f5551G != null && this.f5555K == 1;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m7016E0() {
        return this.f5547C.m21522n();
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m7017G0() {
        return !ypv.k().c7();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m7018L0(BLiveGiftItem bLiveGiftItem) {
        this.f5552H.m15172t(bLiveGiftItem);
        m7023U0(this.f5552H, this.f5548D, this.f5549E);
    }

    /* JADX INFO: renamed from: P0 */
    public void m7019P0() {
        phs phsVar = this.f5546B;
        if (phsVar != null) {
            phsVar.m20325l();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m7020Q0() {
        this.f5553I = false;
        m7004r0();
        m7006s0();
        m7008t0();
        m7003q0();
        fhs fhsVar = this.f5551G;
        if (fhsVar != null) {
            fhsVar.m13231s();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m7021R0(ihs ihsVar) {
        this.f5553I = true;
        m7002p0(ihsVar);
        setGiftDialogAnchorId(ihsVar);
        if (ihsVar.m15166n()) {
            m7028o1();
            m7009t1(ihsVar);
            m6999n0(ihsVar, null);
            ihsVar.m15174v(false);
        }
        if (ihsVar.m15168p() || !m7017G0()) {
            if (!this.f5554J) {
                m6985X0();
            }
            m6983T0();
        } else {
            m7001o0(this.f5555K, false);
        }
        trj.m23152b(ihsVar, this.f5549E, this.f5548D.mo21430R2());
    }

    /* JADX INFO: renamed from: S0 */
    public void m7022S0(BLiveGiftItem bLiveGiftItem) {
        if (this.f5545A == null) {
            this.f5545A = new ywj(this.f5572t);
        }
        this.f5545A.m26968j(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: U0 */
    public void m7023U0(ihs ihsVar, ahs<?> ahsVar, int i) {
        m7025e1();
        this.f5552H = ihsVar;
        this.f5548D = ahsVar;
        this.f5549E = i;
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        m6984V0(bLiveGiftItemM15160h);
        m6999n0(ihsVar, null);
        m6988a1(bLiveGiftItemM15160h);
        m6987Z0(bLiveGiftItemM15160h);
        m7002p0(ihsVar);
        m7013y0();
        if (ihsVar.m15168p()) {
            m6985X0();
            m6986Y0(bLiveGiftItemM15160h);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m7024d1() {
        this.f5555K = 1;
        m7001o0(1, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public void m7025e1() {
        this.f5556d.setController((hce) null);
        this.f5560h.setText("");
        this.f5568p.setText("");
        this.f5569q.setText("");
        this.f5568p.setTranslationY(0.0f);
        this.f5569q.setTranslationY(0.0f);
        this.f5560h.setTextColor(-1);
        this.f5568p.setTextColor(kvc0.a(h1c0.f11809n1));
        this.f5562j.clearAnimation();
        xdl0.M(this.f5572t, false);
        xdl0.M(this.f5573u, false);
        xdl0.M(this.f5561i, false);
        xdl0.M(this.f5567o, false);
        xdl0.M(this.f5575w, false);
        xdl0.M(this.f5576x, false);
        xdl0.M(this.f5558f, false);
        xdl0.M(this.f5559g, false);
        xdl0.M(this.f5560h, true);
        xdl0.M(this.f5568p, true);
        setOnClickListener(null);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        this.f5577y = null;
        this.f5578z = null;
        this.f5545A = null;
        this.f5546B = null;
        this.f5547C = null;
        this.f5548D = null;
        this.f5549E = 0;
        this.f5550F = null;
        this.f5551G = null;
        this.f5552H = null;
        this.f5553I = false;
        this.f5554J = false;
    }

    public avj getReplaceListener() {
        if (this.f5550F == null) {
            this.f5550F = new avj() { // from class: l.rhs
                @Override // p002l.avj
                /* JADX INFO: renamed from: a */
                public final void mo10076a(BLiveGiftItem bLiveGiftItem) {
                    this.f18524a.m7018L0(bLiveGiftItem);
                }
            };
        }
        return this.f5550F;
    }

    public boolean isShowing() {
        return this.f5553I;
    }

    /* JADX INFO: renamed from: l1 */
    public void m7026l1(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        if (bLiveGiftItemM15160h.isPacketGift() || bLiveGiftItemM15160h.isScrapGift()) {
            int i = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM15160h.remain = i;
            bLiveGiftItemM15160h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM15160h.interactRules = bLiveGivenGiftBrief.interactRules;
            String str = bLiveGivenGiftBrief.expiredTimeText;
            bLiveGiftItemM15160h.expiredTimeText = str;
            m7030q1(i, str);
        }
        bLiveGiftItemM15160h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        r1e.m21718f(bLiveGiftItemM15160h, bLiveGivenGiftBrief);
        m7010u1(bLiveGivenGiftBrief, bLiveGiftItemM15160h);
        m7009t1(ihsVar);
        m6999n0(ihsVar, bLiveGivenGiftBrief);
        setGiftPrice(bLiveGiftItemM15160h);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7027m0(View view) {
        whs.m24664a(this, view);
    }

    /* JADX INFO: renamed from: o1 */
    public void m7028o1() {
        ihs ihsVar = this.f5552H;
        if (ihsVar == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        if (bLiveGiftItemM15160h.isPacketGift() || bLiveGiftItemM15160h.isScrapGift()) {
            m7030q1(bLiveGiftItemM15160h.remain, bLiveGiftItemM15160h.expiredTimeText);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        xdl0.M(this.f5557e, false);
        this.f5557e.o();
        m7006s0();
        m7004r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7027m0(this);
    }

    /* JADX INFO: renamed from: p1 */
    public void m7029p1(int i) {
        m7030q1(i, "");
    }

    /* JADX INFO: renamed from: q1 */
    public void m7030q1(int i, String str) {
        m7007s1(i);
        VText vText = this.f5569q;
        if (i > 0) {
            vText.setText(mmj.m18043D(str));
        } else {
            vText.setText(ypv.e.getString(R$string.f3291g3));
        }
        Animator animator = this.f5577y;
        if (animator == null || !animator.isRunning()) {
            xdl0.M(this.f5569q, true);
            xdl0.M(this.f5568p, false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m7031u0() {
        fhs fhsVar = this.f5551G;
        if (fhsVar != null) {
            fhsVar.m13219g();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m7032z0() {
        return this.f5551G != null && this.f5555K == 3;
    }

    public LiveGiftItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftItemView(Context context) {
        this(context, null);
    }
}
