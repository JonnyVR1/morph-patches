package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

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
import p149l.avj;
import p149l.bt0;
import p149l.e30;
import p149l.ghs;
import p149l.h1c0;
import p149l.hqe;
import p149l.hxs;
import p149l.ihs;
import p149l.kvc0;
import p149l.nku;
import p149l.nmj;
import p149l.nqe;
import p149l.qhs;
import p149l.qvj;
import p149l.r1e;
import p149l.rrj;
import p149l.t0g0;
import p149l.t100;
import p149l.trj;
import p149l.uju;
import p149l.w8u;
import p149l.xdl0;
import p149l.xxj;
import p149l.ypv;
import p149l.ywj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public ywj f45178A;

    /* JADX INFO: renamed from: B */
    public qhs f45179B;

    /* JADX INFO: renamed from: C */
    public rrj f45180C;

    /* JADX INFO: renamed from: D */
    public uju<?> f45181D;

    /* JADX INFO: renamed from: E */
    public int f45182E;

    /* JADX INFO: renamed from: F */
    public avj f45183F;

    /* JADX INFO: renamed from: G */
    public ghs f45184G;

    /* JADX INFO: renamed from: H */
    public ihs f45185H;

    /* JADX INFO: renamed from: I */
    public boolean f45186I;

    /* JADX INFO: renamed from: J */
    public boolean f45187J;

    /* JADX INFO: renamed from: K */
    public int f45188K;

    /* JADX INFO: renamed from: d */
    public VDraweeView f45189d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f45190e;

    /* JADX INFO: renamed from: f */
    public VImage f45191f;

    /* JADX INFO: renamed from: g */
    public VText f45192g;

    /* JADX INFO: renamed from: h */
    public VText f45193h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f45194i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f45195j;

    /* JADX INFO: renamed from: k */
    public View f45196k;

    /* JADX INFO: renamed from: l */
    public TextView f45197l;

    /* JADX INFO: renamed from: m */
    public View f45198m;

    /* JADX INFO: renamed from: n */
    public ProgressBar f45199n;

    /* JADX INFO: renamed from: o */
    public Group f45200o;

    /* JADX INFO: renamed from: p */
    public VText f45201p;

    /* JADX INFO: renamed from: q */
    public VText f45202q;

    /* JADX INFO: renamed from: r */
    public View f45203r;

    /* JADX INFO: renamed from: s */
    public View f45204s;

    /* JADX INFO: renamed from: t */
    public VText f45205t;

    /* JADX INFO: renamed from: u */
    public VText f45206u;

    /* JADX INFO: renamed from: v */
    public View f45207v;

    /* JADX INFO: renamed from: w */
    public VText f45208w;

    /* JADX INFO: renamed from: x */
    public VText f45209x;

    /* JADX INFO: renamed from: y */
    public Animator f45210y;

    /* JADX INFO: renamed from: z */
    public AnimatorSet f45211z;

    public LiveVChatGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45186I = false;
        this.f45187J = false;
        this.f45188K = 1;
    }

    private void setGiftDialogAnchorId(ihs ihsVar) {
        uju<?> ujuVar = this.f45181D;
        if (ujuVar != null) {
            ujuVar.m194071X3(String.valueOf(ihsVar.m136283h().f44377id));
        }
    }

    private void setGiftPrice(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hidePrice) {
            xdl0.m208344M(this.f45201p, false);
            return;
        }
        if (!xdl0.m208349O0(this.f45202q)) {
            xdl0.m208344M(this.f45201p, true);
        }
        this.f45201p.setText(String.format(ypv.f199497e.getString(R$string.f47391me), t0g0.m186863d(bLiveGiftItem.getPrice())));
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m69420B0() {
        return this.f45180C.m180558l();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m69421D0() {
        return !ypv.m215672k().m195810c7();
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m69422E0(ihs ihsVar) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (bLiveGiftItemM136283h == null) {
            return false;
        }
        return hqe.m132447a(bLiveGiftItemM136283h, !m69421D0());
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m69423G0(BLiveGiftItem bLiveGiftItem) {
        return (TextUtils.isEmpty(bLiveGiftItem.localRightTag.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m69424H0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localTag;
        if (langModel != null) {
            return (TextUtils.isEmpty(langModel.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m69425I0(boolean z, long j, Integer num) {
        if (this.f45185H == null) {
            return;
        }
        int iIntValue = num.intValue();
        this.f45188K = iIntValue;
        if (iIntValue == 4) {
            this.f45185H.m136275A(true);
            m69435T0();
            if (this.f45186I) {
                m69432Q0();
            }
        }
        if (z) {
            nqe.m160593G(this.f45185H.m136283h().liveResourceId, false, this.f45188K != 4, System.currentTimeMillis() - j);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m69426J0() {
        AnimatorSet animatorSet = this.f45211z;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m69427K0() {
        xdl0.m208344M(this.f45202q, true);
    }

    /* JADX INFO: renamed from: L0 */
    public void m69428L0() {
        qhs qhsVar = this.f45179B;
        if (qhsVar != null) {
            qhsVar.m174592l();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m69429N0() {
        this.f45186I = false;
        m69458q0();
        m69460r0();
        m69462s0();
        m69456p0();
        ghs ghsVar = this.f45184G;
        if (ghsVar != null) {
            ghsVar.m126206s();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m69430O0(ihs ihsVar) {
        this.f45186I = true;
        m69454o0(ihsVar);
        setGiftDialogAnchorId(ihsVar);
        if (ihsVar.m136289n()) {
            m69448k1();
            m69459q1(ihsVar);
            m69451m0(ihsVar, null);
            ihsVar.m136297v(false);
        }
        if (ihsVar.m136291p() || !m69421D0()) {
            if (!this.f45187J) {
                m69435T0();
            }
            m69432Q0();
        } else {
            m69452n0(this.f45188K, false);
        }
        trj.m190421b(ihsVar, this.f45182E, "p_live_user_video_quickchat_room");
    }

    /* JADX INFO: renamed from: P0 */
    public void m69431P0(BLiveGiftItem bLiveGiftItem) {
        if (this.f45178A == null) {
            this.f45178A = new ywj(this.f45205t);
        }
        this.f45178A.m216406j(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m69432Q0() {
        m69445g1(this.f45185H);
        m69444f1(this.f45185H.m136283h());
        m69431P0(this.f45185H.m136283h());
        m69443e1(this.f45185H.m136283h());
    }

    /* JADX INFO: renamed from: R0 */
    public void m69433R0(ihs ihsVar, uju<?> ujuVar, int i) {
        m69440Z0();
        this.f45185H = ihsVar;
        this.f45181D = ujuVar;
        this.f45182E = i;
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        m69434S0(bLiveGiftItemM136283h);
        m69451m0(ihsVar, null);
        m69438X0(bLiveGiftItemM136283h);
        m69437V0(bLiveGiftItemM136283h);
        m69454o0(ihsVar);
        m69466w0();
        if (ihsVar.m136291p()) {
            m69435T0();
            m69436U0(bLiveGiftItemM136283h);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m69434S0(BLiveGiftItem bLiveGiftItem) {
        if (TextUtils.isEmpty(bLiveGiftItem.url) && TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) {
            return;
        }
        String str = (!ypv.m215672k().m195722R6() || TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) ? bLiveGiftItem.url : bLiveGiftItem.dynamicUrl;
        xdl0.m208344M(this.f45190e, w8u.m202223z(str));
        xdl0.m208345M0(this.f45189d, !w8u.m202223z(str));
        if (w8u.m202223z(str)) {
            this.f45190e.mo68502l(str, -1, null);
            return;
        }
        VDraweeView vDraweeView = this.f45189d;
        int i = t100.f167231F;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m69435T0() {
        boolean z = false;
        xdl0.m208344M(this.f45200o, false);
        this.f45187J = true;
        BLiveGiftItem bLiveGiftItemM136283h = this.f45185H.m136283h();
        xdl0.m208344M(this.f45194i, bLiveGiftItemM136283h.isCountTimeGift());
        if (bLiveGiftItemM136283h.isJumpGift()) {
            xdl0.m208344M(this.f45208w, false);
            this.f45193h.setText(bLiveGiftItemM136283h.getJumpGiftName());
            this.f45193h.setTextColor(-1);
            this.f45201p.setText(bLiveGiftItemM136283h.getLocalSubtitle());
            this.f45201p.setTextColor(kvc0.m147352a(h1c0.f105305E0));
            xdl0.m208344M(this.f45201p, true);
            this.f45202q.setText(bLiveGiftItemM136283h.expiredTimeText);
            this.f45202q.setTextColor(kvc0.m147352a(h1c0.f105400r0));
            xdl0.m208344M(this.f45202q, false);
            return;
        }
        this.f45193h.setText(bLiveGiftItemM136283h.getLocalName());
        this.f45193h.setTextColor(kvc0.m147352a(h1c0.f105416w1));
        this.f45201p.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        setAlpha(1.0f);
        if (bLiveGiftItemM136283h.isPaidGift()) {
            xdl0.m208344M(this.f45208w, false);
            xdl0.m208344M(this.f45202q, false);
            setGiftPrice(bLiveGiftItemM136283h);
            return;
        }
        if (!bLiveGiftItemM136283h.isPacketGift()) {
            if (bLiveGiftItemM136283h.isScrapGift()) {
                xdl0.m208344M(this.f45208w, true);
                m69453n1(bLiveGiftItemM136283h.remain, bLiveGiftItemM136283h.expiredTimeText);
                return;
            }
            return;
        }
        xdl0.m208344M(this.f45208w, true);
        this.f45202q.setTextColor(kvc0.m147352a(h1c0.f105400r0));
        if (!this.f45185H.m136290o() && !TextUtils.isEmpty(bLiveGiftItemM136283h.expiredTimeText)) {
            z = true;
        }
        xdl0.m208344M(this.f45202q, z);
        xdl0.m208344M(this.f45201p, !z);
        setGiftPrice(bLiveGiftItemM136283h);
        m69455o1(bLiveGiftItemM136283h.remain, bLiveGiftItemM136283h.expiredTimeText, z);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m69436U0(BLiveGiftItem bLiveGiftItem) {
        BLiveGiftNameStatus bLiveGiftNameStatus = bLiveGiftItem.nameStatus;
        if (bLiveGiftNameStatus == null || !bLiveGiftNameStatus.status) {
            xdl0.m208344M(this.f45191f, false);
            xdl0.m208344M(this.f45192g, false);
        } else {
            xdl0.m208344M(this.f45191f, true);
            xdl0.m208344M(this.f45192g, true);
            this.f45192g.setText(bLiveGiftItem.nameStatus.userName);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m69437V0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM211500a = xxj.m211500a(bLiveGiftItem);
        if (gradientDrawableM211500a != null) {
            this.f45206u.setBackground(gradientDrawableM211500a);
        }
        if (!m69423G0(bLiveGiftItem)) {
            m69464u0();
        } else {
            this.f45206u.setText(bLiveGiftItem.getLocalRightTagName());
            m69441a1();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m69438X0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM211502c = xxj.m211502c(bLiveGiftItem);
        if (gradientDrawableM211502c != null) {
            this.f45205t.setBackground(gradientDrawableM211502c);
        }
        if (!m69424H0(bLiveGiftItem)) {
            m69465v0();
            return;
        }
        this.f45205t.setText(bLiveGiftItem.getLocalTagName());
        this.f45205t.setTextColor(kvc0.m147358g(bLiveGiftItem.tagTextColor));
        m69442d1();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m69439Y0() {
        this.f45188K = 1;
        m69452n0(1, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m69440Z0() {
        this.f45189d.setController(null);
        this.f45193h.setText("");
        this.f45201p.setText("");
        this.f45202q.setText("");
        this.f45201p.setTranslationY(0.0f);
        this.f45202q.setTranslationY(0.0f);
        this.f45193h.setTextColor(-1);
        this.f45201p.setTextColor(kvc0.m147352a(h1c0.f105389n1));
        this.f45195j.clearAnimation();
        xdl0.m208344M(this.f45205t, false);
        xdl0.m208344M(this.f45206u, false);
        xdl0.m208344M(this.f45194i, false);
        xdl0.m208344M(this.f45200o, false);
        xdl0.m208344M(this.f45208w, false);
        xdl0.m208344M(this.f45209x, false);
        xdl0.m208344M(this.f45191f, false);
        xdl0.m208344M(this.f45192g, false);
        xdl0.m208344M(this.f45193h, true);
        xdl0.m208344M(this.f45201p, true);
        setOnClickListener(null);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        this.f45210y = null;
        this.f45211z = null;
        this.f45178A = null;
        this.f45179B = null;
        this.f45180C = null;
        this.f45181D = null;
        this.f45182E = 0;
        this.f45183F = null;
        this.f45184G = null;
        this.f45185H = null;
        this.f45186I = false;
        this.f45187J = false;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m69441a1() {
        xdl0.m208344M(this.f45206u, true);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m69442d1() {
        xdl0.m208344M(this.f45205t, true);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m69443e1(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hasRotationAnim()) {
            if (this.f45179B == null) {
                this.f45179B = new qhs(this, this.f45181D.m194083p3(bLiveGiftItem.showAnimRules.showAction.frequency));
            }
            this.f45179B.m174597q(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m69444f1(BLiveGiftItem bLiveGiftItem) {
        if (this.f45185H.m136283h().hidePrice) {
            if (TextUtils.isEmpty(this.f45185H.m136283h().expiredTimeText)) {
                return;
            }
            xdl0.m208344M(this.f45202q, true);
            xdl0.m208344M(this.f45201p, false);
            return;
        }
        if (!bLiveGiftItem.isJumpGift() || TextUtils.isEmpty(bLiveGiftItem.expiredTimeText)) {
            return;
        }
        m69458q0();
        int iM186890d = t100.m186890d(13.0f);
        float f = iM186890d;
        this.f45202q.setTranslationY(f);
        xdl0.m208344M(this.f45202q, true);
        if (this.f45211z == null) {
            float f2 = -iM186890d;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) bt0.m103739l(this.f45201p, property, 3000L, 300L, null, 0.0f, f2);
            ObjectAnimator objectAnimator2 = (ObjectAnimator) bt0.m103739l(this.f45202q, property, 3000L, 300L, null, f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimator, objectAnimator2);
            Animator animatorM103737j = bt0.m103737j(3000);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) bt0.m103739l(this.f45201p, property, 3000L, 300L, null, f, 0.0f);
            ObjectAnimator objectAnimator4 = (ObjectAnimator) bt0.m103739l(this.f45202q, property, 3000L, 300L, null, 0.0f, f2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimator3, objectAnimator4);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f45211z = animatorSet3;
            animatorSet3.playSequentially(animatorSet, animatorM103737j, animatorSet2);
        }
        bt0.m103733f(this.f45211z, new Runnable() { // from class: l.kku
            @Override // java.lang.Runnable
            public final void run() {
                this.f123601a.m69426J0();
            }
        });
        this.f45211z.start();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m69445g1(final ihs ihsVar) {
        if (ihsVar.m136283h().hidePrice) {
            if (TextUtils.isEmpty(ihsVar.m136283h().expiredTimeText)) {
                return;
            }
            xdl0.m208344M(this.f45202q, true);
            return;
        }
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (!bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.remain <= 0) {
            m69460r0();
            return;
        }
        if (!ihsVar.m136290o() || TextUtils.isEmpty(bLiveGiftItemM136283h.expiredTimeText)) {
            if (TextUtils.isEmpty(bLiveGiftItemM136283h.expiredTimeText)) {
                setGiftPrice(bLiveGiftItemM136283h);
                return;
            } else {
                xdl0.m208344M(this.f45202q, true);
                return;
            }
        }
        m69460r0();
        setGiftPrice(bLiveGiftItemM136283h);
        int iM186890d = t100.m186890d(16.0f);
        float f = iM186890d;
        this.f45202q.setTranslationY(f);
        Property property = View.TRANSLATION_Y;
        Animator animatorM103753z = bt0.m103753z(bt0.m103739l(this.f45201p, property, 3000L, 300L, null, 0.0f, -iM186890d), bt0.m103739l(this.f45202q, property, 3000L, 300L, null, f, 0.0f));
        this.f45210y = animatorM103753z;
        bt0.m103750w(animatorM103753z, new Runnable() { // from class: l.lku
            @Override // java.lang.Runnable
            public final void run() {
                this.f128603a.m69427K0();
            }
        }, new Runnable() { // from class: l.mku
            @Override // java.lang.Runnable
            public final void run() {
                ihsVar.m136299x(false);
            }
        });
        this.f45210y.start();
    }

    /* JADX INFO: renamed from: h1 */
    public void m69446h1(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.isScrapGift()) {
            int i = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM136283h.remain = i;
            bLiveGiftItemM136283h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
            String str = bLiveGivenGiftBrief.expiredTimeText;
            bLiveGiftItemM136283h.expiredTimeText = str;
            m69453n1(i, str);
        }
        bLiveGiftItemM136283h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        r1e.m177456f(bLiveGiftItemM136283h, bLiveGivenGiftBrief);
        m69461r1(bLiveGivenGiftBrief, bLiveGiftItemM136283h);
        m69459q1(ihsVar);
        m69451m0(ihsVar, bLiveGivenGiftBrief);
        setGiftPrice(bLiveGiftItemM136283h);
    }

    public boolean isShowing() {
        return this.f45186I;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m69447j1() {
        this.f45188K = qvj.m176703a(this.f45185H);
    }

    /* JADX INFO: renamed from: k1 */
    public void m69448k1() {
        ihs ihsVar = this.f45185H;
        if (ihsVar == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (bLiveGiftItemM136283h.isPacketGift() || bLiveGiftItemM136283h.isScrapGift()) {
            m69453n1(bLiveGiftItemM136283h.remain, bLiveGiftItemM136283h.expiredTimeText);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m69449l0(View view) {
        nku.m160005a(this, view);
    }

    /* JADX INFO: renamed from: l1 */
    public void m69450l1(int i) {
        m69453n1(i, "");
    }

    /* JADX INFO: renamed from: m0 */
    public final void m69451m0(ihs ihsVar, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f45180C == null) {
            this.f45180C = new rrj(this.f45181D);
        }
        this.f45180C.m180563q(ihsVar, this, this.f45182E, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m69452n0(int i, final boolean z) {
        if (this.f45184G != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f45184G.m126193f(i, z, new e30() { // from class: l.jku
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118413a.m69425I0(z, jCurrentTimeMillis, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m69453n1(int i, String str) {
        m69457p1(i);
        VText vText = this.f45202q;
        if (i > 0) {
            vText.setText(nmj.m160107s(str));
        } else {
            vText.setText(ypv.f199497e.getString(R$string.f47249g3));
        }
        Animator animator = this.f45210y;
        if (animator == null || !animator.isRunning()) {
            xdl0.m208344M(this.f45202q, true);
            xdl0.m208344M(this.f45201p, false);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m69454o0(ihs ihsVar) {
        ihsVar.m136275A(m69422E0(ihsVar) || ihsVar.m136283h().isCountTimeGift());
        m69459q1(ihsVar);
        m69447j1();
    }

    /* JADX INFO: renamed from: o1 */
    public final void m69455o1(int i, String str, boolean z) {
        m69457p1(i);
        VText vText = this.f45202q;
        if (i > 0) {
            vText.setText(nmj.m160107s(str));
        } else {
            vText.setText(ypv.f199497e.getString(R$string.f47249g3));
        }
        Animator animator = this.f45210y;
        if (animator == null || !animator.isRunning()) {
            if (!z) {
                xdl0.m208344M(this.f45201p, true);
            } else {
                xdl0.m208344M(this.f45202q, true);
                xdl0.m208344M(this.f45201p, false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xdl0.m208344M(this.f45190e, false);
        this.f45190e.m68505o();
        m69460r0();
        m69458q0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69449l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m69456p0() {
        qhs qhsVar = this.f45179B;
        if (qhsVar != null) {
            qhsVar.m174592l();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m69457p1(int i) {
        this.f45208w.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m69458q0() {
        AnimatorSet animatorSet = this.f45211z;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f45211z.cancel();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m69459q1(ihs ihsVar) {
        setAlpha((ihsVar.m136283h().interactStatus.equals("SetToGray") || !ihsVar.m136291p()) ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m69460r0() {
        Animator animator = this.f45210y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f45210y.cancel();
        }
        this.f45202q.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m69461r1(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        bLiveGiftItem.updateTagColorFromBrief(bLiveGivenGiftBrief);
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tag)) {
            String str = bLiveGivenGiftBrief.tag;
            bLiveGiftItem.tag = str;
            try {
                bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(str);
            } catch (IOException unused) {
            }
        }
        m69438X0(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m69462s0() {
        ywj ywjVar = this.f45178A;
        if (ywjVar != null) {
            ywjVar.m216401e();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m69463t0() {
        ghs ghsVar = this.f45184G;
        if (ghsVar != null) {
            ghsVar.m126194g();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m69464u0() {
        xdl0.m208344M(this.f45206u, false);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m69465v0() {
        xdl0.m208344M(this.f45205t, false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m69466w0() {
        if (m69421D0() && this.f45184G == null && !this.f45185H.m136291p()) {
            this.f45184G = new ghs(this.f45185H, this, this.f45182E, this.f45181D);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m69467y0() {
        return this.f45184G != null && this.f45188K == 3;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m69468z0() {
        return this.f45184G != null && this.f45188K == 1;
    }

    public LiveVChatGiftItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveVChatGiftItemView(Context context) {
        this(context, null);
    }
}
