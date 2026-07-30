package com.p046p1.mobile.putong.live.livingroom.increment.gift;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftNameStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ahs;
import p149l.avj;
import p149l.bt0;
import p149l.e30;
import p149l.fhs;
import p149l.h1c0;
import p149l.hqe;
import p149l.hxs;
import p149l.ihs;
import p149l.kvc0;
import p149l.mmj;
import p149l.nqe;
import p149l.phs;
import p149l.qrj;
import p149l.qvj;
import p149l.r1e;
import p149l.t0g0;
import p149l.t100;
import p149l.trj;
import p149l.u6n;
import p149l.w8u;
import p149l.whs;
import p149l.xdl0;
import p149l.xxj;
import p149l.ypv;
import p149l.ywj;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public ywj f49503A;

    /* JADX INFO: renamed from: B */
    public phs f49504B;

    /* JADX INFO: renamed from: C */
    public qrj f49505C;

    /* JADX INFO: renamed from: D */
    public ahs<?> f49506D;

    /* JADX INFO: renamed from: E */
    public int f49507E;

    /* JADX INFO: renamed from: F */
    public avj f49508F;

    /* JADX INFO: renamed from: G */
    public fhs f49509G;

    /* JADX INFO: renamed from: H */
    public ihs f49510H;

    /* JADX INFO: renamed from: I */
    public boolean f49511I;

    /* JADX INFO: renamed from: J */
    public boolean f49512J;

    /* JADX INFO: renamed from: K */
    public int f49513K;

    /* JADX INFO: renamed from: d */
    public VDraweeView f49514d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f49515e;

    /* JADX INFO: renamed from: f */
    public VImage f49516f;

    /* JADX INFO: renamed from: g */
    public VText f49517g;

    /* JADX INFO: renamed from: h */
    public VText f49518h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f49519i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f49520j;

    /* JADX INFO: renamed from: k */
    public View f49521k;

    /* JADX INFO: renamed from: l */
    public TextView f49522l;

    /* JADX INFO: renamed from: m */
    public View f49523m;

    /* JADX INFO: renamed from: n */
    public ProgressBar f49524n;

    /* JADX INFO: renamed from: o */
    public Group f49525o;

    /* JADX INFO: renamed from: p */
    public VText f49526p;

    /* JADX INFO: renamed from: q */
    public VText f49527q;

    /* JADX INFO: renamed from: r */
    public View f49528r;

    /* JADX INFO: renamed from: s */
    public View f49529s;

    /* JADX INFO: renamed from: t */
    public VText f49530t;

    /* JADX INFO: renamed from: u */
    public VText f49531u;

    /* JADX INFO: renamed from: v */
    public View f49532v;

    /* JADX INFO: renamed from: w */
    public VText f49533w;

    /* JADX INFO: renamed from: x */
    public VText f49534x;

    /* JADX INFO: renamed from: y */
    public Animator f49535y;

    /* JADX INFO: renamed from: z */
    public AnimatorSet f49536z;

    public LiveGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49511I = false;
        this.f49512J = false;
        this.f49513K = 1;
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m73435H0(ihs ihsVar) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (bLiveGiftItemM136283h == null) {
            return false;
        }
        return hqe.m132447a(bLiveGiftItemM136283h, !m73475G0());
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m73436I0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localRightTag;
        return ((langModel == null || TextUtils.isEmpty(langModel.getLocalName())) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m73437J0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localTag;
        if (langModel != null) {
            return (TextUtils.isEmpty(langModel.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m73438K0(boolean z, long j, Integer num) {
        if (this.f49510H == null) {
            return;
        }
        int iIntValue = num.intValue();
        this.f49513K = iIntValue;
        if (iIntValue == 4) {
            this.f49510H.m136275A(true);
            m73443X0();
            if (this.f49511I) {
                m73441T0();
            }
        }
        if (z) {
            nqe.m160593G(this.f49510H.m136283h().liveResourceId, false, this.f49513K != 4, System.currentTimeMillis() - j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m73439N0() {
        AnimatorSet animatorSet = this.f49536z;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m73440O0() {
        xdl0.m208344M(this.f49527q, true);
    }

    /* JADX INFO: renamed from: T0 */
    private void m73441T0() {
        m73455k1(this.f49510H);
        m73453j1(this.f49510H.m136283h());
        m73480S0(this.f49510H.m136283h());
        m73450h1(this.f49510H.m136283h());
    }

    /* JADX INFO: renamed from: V0 */
    private void m73442V0(BLiveGiftItem bLiveGiftItem) {
        if (TextUtils.isEmpty(bLiveGiftItem.url) && TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) {
            return;
        }
        String str = (!ypv.m215672k().m195722R6() || TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) ? bLiveGiftItem.url : bLiveGiftItem.dynamicUrl;
        xdl0.m208344M(this.f49515e, w8u.m202223z(str));
        xdl0.m208345M0(this.f49514d, !w8u.m202223z(str));
        if (w8u.m202223z(str)) {
            this.f49515e.mo68502l(str, -1, null);
            return;
        }
        VDraweeView vDraweeView = this.f49514d;
        int i = t100.f167231F;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m73443X0() {
        boolean z = false;
        xdl0.m208344M(this.f49525o, false);
        this.f49512J = true;
        BLiveGiftItem bLiveGiftItemM136283h = this.f49510H.m136283h();
        xdl0.m208344M(this.f49519i, bLiveGiftItemM136283h.isCountTimeGift());
        if (bLiveGiftItemM136283h.isJumpGift()) {
            xdl0.m208344M(this.f49533w, false);
            this.f49518h.setText(bLiveGiftItemM136283h.getJumpGiftName());
            this.f49518h.setTextColor(-1);
            this.f49526p.setText(bLiveGiftItemM136283h.getLocalSubtitle());
            this.f49526p.setTextColor(kvc0.m147352a(h1c0.f105305E0));
            xdl0.m208344M(this.f49526p, true);
            this.f49527q.setText(bLiveGiftItemM136283h.expiredTimeText);
            this.f49527q.setTextColor(kvc0.m147352a(h1c0.f105400r0));
            xdl0.m208344M(this.f49527q, false);
            return;
        }
        this.f49518h.setText(bLiveGiftItemM136283h.getLocalName());
        this.f49518h.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        this.f49526p.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        setAlpha(1.0f);
        if (bLiveGiftItemM136283h.isPaidGift()) {
            xdl0.m208344M(this.f49533w, false);
            xdl0.m208344M(this.f49527q, false);
            setGiftPrice(bLiveGiftItemM136283h);
            return;
        }
        if (!bLiveGiftItemM136283h.isPacketGift()) {
            if (bLiveGiftItemM136283h.isScrapGift()) {
                xdl0.m208344M(this.f49533w, true);
                m73488q1(bLiveGiftItemM136283h.remain, bLiveGiftItemM136283h.expiredTimeText);
                return;
            }
            return;
        }
        xdl0.m208344M(this.f49533w, true);
        this.f49527q.setTextColor(kvc0.m147352a(h1c0.f105400r0));
        if (!this.f49510H.m136290o() && !TextUtils.isEmpty(bLiveGiftItemM136283h.expiredTimeText)) {
            z = true;
        }
        xdl0.m208344M(this.f49527q, z);
        xdl0.m208344M(this.f49526p, !z);
        setGiftPrice(bLiveGiftItemM136283h);
        m73463r1(bLiveGiftItemM136283h.remain, bLiveGiftItemM136283h.expiredTimeText, z);
    }

    /* JADX INFO: renamed from: Y0 */
    private void m73444Y0(BLiveGiftItem bLiveGiftItem) {
        BLiveGiftNameStatus bLiveGiftNameStatus = bLiveGiftItem.nameStatus;
        if (bLiveGiftNameStatus == null || !bLiveGiftNameStatus.status) {
            xdl0.m208344M(this.f49516f, false);
            xdl0.m208344M(this.f49517g, false);
        } else {
            xdl0.m208344M(this.f49516f, true);
            xdl0.m208344M(this.f49517g, true);
            this.f49517g.setText(bLiveGiftItem.nameStatus.userName);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private void m73445Z0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM211500a = xxj.m211500a(bLiveGiftItem);
        if (gradientDrawableM211500a != null) {
            this.f49531u.setBackground(gradientDrawableM211500a);
        }
        if (!m73436I0(bLiveGiftItem)) {
            m73469v0();
        } else {
            this.f49531u.setText(bLiveGiftItem.getLocalRightTagName());
            m73447f1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    private void m73446a1(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM211502c = xxj.m211502c(bLiveGiftItem);
        if (gradientDrawableM211502c != null) {
            this.f49530t.setBackground(gradientDrawableM211502c);
        }
        if (!m73437J0(bLiveGiftItem)) {
            m73470w0();
            return;
        }
        this.f49530t.setText(bLiveGiftItem.getLocalTagName());
        this.f49530t.setTextColor(kvc0.m147358g(bLiveGiftItem.tagTextColor));
        m73448g1();
    }

    /* JADX INFO: renamed from: f1 */
    private void m73447f1() {
        xdl0.m208344M(this.f49531u, true);
    }

    /* JADX INFO: renamed from: g1 */
    private void m73448g1() {
        xdl0.m208344M(this.f49530t, true);
    }

    /* JADX INFO: renamed from: h1 */
    private void m73450h1(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hasRotationAnim()) {
            if (this.f49504B == null) {
                this.f49504B = new phs(this, this.f49506D.m96632O4(bLiveGiftItem.showAnimRules.showAction.frequency));
            }
            this.f49504B.m169143q(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private void m73453j1(BLiveGiftItem bLiveGiftItem) {
        if (this.f49510H.m136283h().hidePrice) {
            if (TextUtils.isEmpty(this.f49510H.m136283h().expiredTimeText)) {
                return;
            }
            xdl0.m208344M(this.f49527q, true);
            xdl0.m208344M(this.f49526p, false);
            return;
        }
        if (!bLiveGiftItem.isJumpGift() || TextUtils.isEmpty(bLiveGiftItem.expiredTimeText)) {
            return;
        }
        m73462r0();
        int iM186890d = t100.m186890d(13.0f);
        float f = iM186890d;
        this.f49527q.setTranslationY(f);
        xdl0.m208344M(this.f49527q, true);
        if (this.f49536z == null) {
            float f2 = -iM186890d;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103739l(this.f49526p, property, 3000L, 300L, null, 0.0f, f2);
            ObjectAnimator objectAnimator2 = (ObjectAnimator) bt0.m103739l(this.f49527q, property, 3000L, 300L, null, f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimator, objectAnimator2);
            Animator animatorM103737j = bt0.m103737j(3000);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) bt0.m103739l(this.f49526p, property, 3000L, 300L, null, f, 0.0f);
            ObjectAnimator objectAnimator4 = (ObjectAnimator) bt0.m103739l(this.f49527q, property, 3000L, 300L, null, 0.0f, f2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimator3, objectAnimator4);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f49536z = animatorSet3;
            animatorSet3.playSequentially(animatorSet, animatorM103737j, animatorSet2);
        }
        bt0.m103733f(this.f49536z, new Runnable() { // from class: l.shs
            @Override // java.lang.Runnable
            public final void run() {
                this.f164626a.m73439N0();
            }
        });
        this.f49536z.start();
    }

    /* JADX INFO: renamed from: k1 */
    private void m73455k1(final ihs ihsVar) {
        if (ihsVar.m136283h().hidePrice) {
            if (TextUtils.isEmpty(ihsVar.m136283h().expiredTimeText)) {
                return;
            }
            xdl0.m208344M(this.f49527q, true);
            return;
        }
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (!bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.remain <= 0) {
            m73464s0();
            return;
        }
        if (!ihsVar.m136290o() || TextUtils.isEmpty(bLiveGiftItemM136283h.expiredTimeText)) {
            if (TextUtils.isEmpty(bLiveGiftItemM136283h.expiredTimeText)) {
                setGiftPrice(bLiveGiftItemM136283h);
                return;
            } else {
                xdl0.m208344M(this.f49527q, true);
                return;
            }
        }
        m73464s0();
        setGiftPrice(bLiveGiftItemM136283h);
        int iM186890d = t100.m186890d(16.0f);
        float f = iM186890d;
        this.f49527q.setTranslationY(f);
        Property property = View.TRANSLATION_Y;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(this.f49526p, property, 3000L, 300L, null, 0.0f, -iM186890d), bt0.m103739l(this.f49527q, property, 3000L, 300L, null, f, 0.0f));
        this.f49535y = animatorM103753z;
        bt0.m103750w(animatorM103753z, new Runnable() { // from class: l.uhs
            @Override // java.lang.Runnable
            public final void run() {
                this.f176590a.m73440O0();
            }
        }, new Runnable() { // from class: l.vhs
            @Override // java.lang.Runnable
            public final void run() {
                ihsVar.m136299x(false);
            }
        });
        this.f49535y.start();
    }

    /* JADX INFO: renamed from: n0 */
    private void m73457n0(ihs ihsVar, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f49505C == null) {
            this.f49505C = new qrj(this.f49506D);
        }
        this.f49505C.m176033u(ihsVar, this, this.f49507E, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: n1 */
    private void m73458n1() {
        this.f49513K = qvj.m176703a(this.f49510H);
    }

    /* JADX INFO: renamed from: o0 */
    private void m73459o0(int i, final boolean z) {
        if (this.f49509G != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f49509G.m121429f(i, z, new e30() { // from class: l.ths
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170280a.m73438K0(z, jCurrentTimeMillis, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m73460p0(ihs ihsVar) {
        ihsVar.m136275A(m73435H0(ihsVar) || ihsVar.m136283h().isCountTimeGift());
        m73467t1(ihsVar);
        m73458n1();
    }

    /* JADX INFO: renamed from: q0 */
    private void m73461q0() {
        phs phsVar = this.f49504B;
        if (phsVar != null) {
            phsVar.m169138l();
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m73462r0() {
        AnimatorSet animatorSet = this.f49536z;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f49536z.cancel();
        }
    }

    /* JADX INFO: renamed from: r1 */
    private void m73463r1(int i, String str, boolean z) {
        m73465s1(i);
        VText vText = this.f49527q;
        if (i > 0) {
            vText.setText(mmj.m155401D(str));
        } else {
            vText.setText(ypv.f199497e.getString(R$string.f47249g3));
        }
        Animator animator = this.f49535y;
        if (animator == null || !animator.isRunning()) {
            if (!z) {
                xdl0.m208344M(this.f49526p, true);
            } else {
                xdl0.m208344M(this.f49527q, true);
                xdl0.m208344M(this.f49526p, false);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m73464s0() {
        Animator animator = this.f49535y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f49535y.cancel();
        }
        this.f49527q.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: s1 */
    private void m73465s1(int i) {
        this.f49533w.setText(String.valueOf(i));
    }

    private void setGiftDialogAnchorId(ihs ihsVar) {
        ahs<?> ahsVar = this.f49506D;
        if (ahsVar != null) {
            ahsVar.m96649Y5(String.valueOf(ihsVar.m136283h().f44377id));
        }
    }

    private void setGiftPrice(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hidePrice) {
            xdl0.m208344M(this.f49526p, false);
            return;
        }
        if (!xdl0.m208349O0(this.f49527q)) {
            xdl0.m208344M(this.f49526p, true);
        }
        this.f49526p.setText(String.format(ypv.f199497e.getString(u6n.m192015a() ? R$string.f47501re : R$string.f47391me), t0g0.m186863d(bLiveGiftItem.getPrice())));
    }

    /* JADX INFO: renamed from: t0 */
    private void m73466t0() {
        ywj ywjVar = this.f49503A;
        if (ywjVar != null) {
            ywjVar.m216401e();
        }
    }

    /* JADX INFO: renamed from: t1 */
    private void m73467t1(ihs ihsVar) {
        setAlpha(ihsVar.m136283h().interactStatus.equals("SetToGray") ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: u1 */
    private void m73468u1(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        bLiveGiftItem.updateTagColorFromBrief(bLiveGivenGiftBrief);
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tag)) {
            String str = bLiveGivenGiftBrief.tag;
            bLiveGiftItem.tag = str;
            try {
                bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(str);
            } catch (IOException unused) {
            }
        }
        m73446a1(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: v0 */
    private void m73469v0() {
        xdl0.m208344M(this.f49531u, false);
    }

    /* JADX INFO: renamed from: w0 */
    private void m73470w0() {
        xdl0.m208344M(this.f49530t, false);
    }

    /* JADX INFO: renamed from: y0 */
    private void m73471y0() {
        if (m73475G0() && this.f49509G == null && !this.f49510H.m136291p()) {
            this.f49509G = new fhs(this.f49510H, this, this.f49507E, this.f49506D);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m73472B0() {
        return this.f49513K == 4;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m73473D0() {
        return this.f49509G != null && this.f49513K == 1;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m73474E0() {
        return this.f49505C.m176026n();
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m73475G0() {
        return !ypv.m215672k().m195810c7();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m73476L0(BLiveGiftItem bLiveGiftItem) {
        this.f49510H.m136295t(bLiveGiftItem);
        m73481U0(this.f49510H, this.f49506D, this.f49507E);
    }

    /* JADX INFO: renamed from: P0 */
    public void m73477P0() {
        phs phsVar = this.f49504B;
        if (phsVar != null) {
            phsVar.m169138l();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m73478Q0() {
        this.f49511I = false;
        m73462r0();
        m73464s0();
        m73466t0();
        m73461q0();
        fhs fhsVar = this.f49509G;
        if (fhsVar != null) {
            fhsVar.m121442s();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m73479R0(ihs ihsVar) {
        this.f49511I = true;
        m73460p0(ihsVar);
        setGiftDialogAnchorId(ihsVar);
        if (ihsVar.m136289n()) {
            m73486o1();
            m73467t1(ihsVar);
            m73457n0(ihsVar, null);
            ihsVar.m136297v(false);
        }
        if (ihsVar.m136291p() || !m73475G0()) {
            if (!this.f49512J) {
                m73443X0();
            }
            m73441T0();
        } else {
            m73459o0(this.f49513K, false);
        }
        trj.m190421b(ihsVar, this.f49507E, this.f49506D.mo77274R2());
    }

    /* JADX INFO: renamed from: S0 */
    public void m73480S0(BLiveGiftItem bLiveGiftItem) {
        if (this.f49503A == null) {
            this.f49503A = new ywj(this.f49530t);
        }
        this.f49503A.m216406j(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: U0 */
    public void m73481U0(ihs ihsVar, ahs<?> ahsVar, int i) {
        m73483e1();
        this.f49510H = ihsVar;
        this.f49506D = ahsVar;
        this.f49507E = i;
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        m73442V0(bLiveGiftItemM136283h);
        m73457n0(ihsVar, null);
        m73446a1(bLiveGiftItemM136283h);
        m73445Z0(bLiveGiftItemM136283h);
        m73460p0(ihsVar);
        m73471y0();
        if (ihsVar.m136291p()) {
            m73443X0();
            m73444Y0(bLiveGiftItemM136283h);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m73482d1() {
        this.f49513K = 1;
        m73459o0(1, true);
    }

    /* JADX INFO: renamed from: e1 */
    public void m73483e1() {
        this.f49514d.setController(null);
        this.f49518h.setText("");
        this.f49526p.setText("");
        this.f49527q.setText("");
        this.f49526p.setTranslationY(0.0f);
        this.f49527q.setTranslationY(0.0f);
        this.f49518h.setTextColor(-1);
        this.f49526p.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        this.f49520j.clearAnimation();
        xdl0.m208344M(this.f49530t, false);
        xdl0.m208344M(this.f49531u, false);
        xdl0.m208344M(this.f49519i, false);
        xdl0.m208344M(this.f49525o, false);
        xdl0.m208344M(this.f49533w, false);
        xdl0.m208344M(this.f49534x, false);
        xdl0.m208344M(this.f49516f, false);
        xdl0.m208344M(this.f49517g, false);
        xdl0.m208344M(this.f49518h, true);
        xdl0.m208344M(this.f49526p, true);
        setOnClickListener(null);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        this.f49535y = null;
        this.f49536z = null;
        this.f49503A = null;
        this.f49504B = null;
        this.f49505C = null;
        this.f49506D = null;
        this.f49507E = 0;
        this.f49508F = null;
        this.f49509G = null;
        this.f49510H = null;
        this.f49511I = false;
        this.f49512J = false;
    }

    public avj getReplaceListener() {
        if (this.f49508F == null) {
            this.f49508F = new avj() { // from class: l.rhs
                @Override // p149l.avj
                /* JADX INFO: renamed from: a */
                public final void mo99192a(BLiveGiftItem bLiveGiftItem) {
                    this.f159477a.m73476L0(bLiveGiftItem);
                }
            };
        }
        return this.f49508F;
    }

    public boolean isShowing() {
        return this.f49511I;
    }

    /* JADX INFO: renamed from: l1 */
    public void m73484l1(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.isScrapGift()) {
            int i = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM136283h.remain = i;
            bLiveGiftItemM136283h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
            String str = bLiveGivenGiftBrief.expiredTimeText;
            bLiveGiftItemM136283h.expiredTimeText = str;
            m73488q1(i, str);
        }
        bLiveGiftItemM136283h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        r1e.m177456f(bLiveGiftItemM136283h, bLiveGivenGiftBrief);
        m73468u1(bLiveGivenGiftBrief, bLiveGiftItemM136283h);
        m73467t1(ihsVar);
        m73457n0(ihsVar, bLiveGivenGiftBrief);
        setGiftPrice(bLiveGiftItemM136283h);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m73485m0(View view) {
        whs.m203242a(this, view);
    }

    /* JADX INFO: renamed from: o1 */
    public void m73486o1() {
        ihs ihsVar = this.f49510H;
        if (ihsVar == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.isScrapGift()) {
            m73488q1(bLiveGiftItemM136283h.remain, bLiveGiftItemM136283h.expiredTimeText);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xdl0.m208344M(this.f49515e, false);
        this.f49515e.m68505o();
        m73464s0();
        m73462r0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73485m0(this);
    }

    /* JADX INFO: renamed from: p1 */
    public void m73487p1(int i) {
        m73488q1(i, "");
    }

    /* JADX INFO: renamed from: q1 */
    public void m73488q1(int i, String str) {
        m73465s1(i);
        VText vText = this.f49527q;
        if (i > 0) {
            vText.setText(mmj.m155401D(str));
        } else {
            vText.setText(ypv.f199497e.getString(R$string.f47249g3));
        }
        Animator animator = this.f49535y;
        if (animator == null || !animator.isRunning()) {
            xdl0.m208344M(this.f49527q, true);
            xdl0.m208344M(this.f49526p, false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m73489u0() {
        fhs fhsVar = this.f49509G;
        if (fhsVar != null) {
            fhsVar.m121430g();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m73490z0() {
        return this.f49509G != null && this.f49513K == 3;
    }

    public LiveGiftItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftItemView(Context context) {
        this(context, null);
    }
}
