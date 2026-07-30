package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

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
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftNameStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.dpj;
import p153l.f3e;
import p153l.gt0;
import p153l.gyj;
import p153l.hjs;
import p153l.huj;
import p153l.izs;
import p153l.jjs;
import p153l.juj;
import p153l.lre;
import p153l.n0k;
import p153l.n3d0;
import p153l.n9c0;
import p153l.omu;
import p153l.ozj;
import p153l.qa00;
import p153l.qxj;
import p153l.rjs;
import p153l.rre;
import p153l.vlu;
import p153l.xau;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public ozj f46026A;

    /* JADX INFO: renamed from: B */
    public rjs f46027B;

    /* JADX INFO: renamed from: C */
    public huj f46028C;

    /* JADX INFO: renamed from: D */
    public vlu<?> f46029D;

    /* JADX INFO: renamed from: E */
    public int f46030E;

    /* JADX INFO: renamed from: F */
    public qxj f46031F;

    /* JADX INFO: renamed from: G */
    public hjs f46032G;

    /* JADX INFO: renamed from: H */
    public jjs f46033H;

    /* JADX INFO: renamed from: I */
    public boolean f46034I;

    /* JADX INFO: renamed from: J */
    public boolean f46035J;

    /* JADX INFO: renamed from: K */
    public int f46036K;

    /* JADX INFO: renamed from: d */
    public VDraweeView f46037d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f46038e;

    /* JADX INFO: renamed from: f */
    public VImage f46039f;

    /* JADX INFO: renamed from: g */
    public VText f46040g;

    /* JADX INFO: renamed from: h */
    public VText f46041h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f46042i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f46043j;

    /* JADX INFO: renamed from: k */
    public View f46044k;

    /* JADX INFO: renamed from: l */
    public TextView f46045l;

    /* JADX INFO: renamed from: m */
    public View f46046m;

    /* JADX INFO: renamed from: n */
    public ProgressBar f46047n;

    /* JADX INFO: renamed from: o */
    public Group f46048o;

    /* JADX INFO: renamed from: p */
    public VText f46049p;

    /* JADX INFO: renamed from: q */
    public VText f46050q;

    /* JADX INFO: renamed from: r */
    public View f46051r;

    /* JADX INFO: renamed from: s */
    public View f46052s;

    /* JADX INFO: renamed from: t */
    public VText f46053t;

    /* JADX INFO: renamed from: u */
    public VText f46054u;

    /* JADX INFO: renamed from: v */
    public View f46055v;

    /* JADX INFO: renamed from: w */
    public VText f46056w;

    /* JADX INFO: renamed from: x */
    public VText f46057x;

    /* JADX INFO: renamed from: y */
    public Animator f46058y;

    /* JADX INFO: renamed from: z */
    public AnimatorSet f46059z;

    public LiveVChatGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46034I = false;
        this.f46035J = false;
        this.f46036K = 1;
    }

    private void setGiftDialogAnchorId(jjs jjsVar) {
        vlu<?> vluVar = this.f46029D;
        if (vluVar != null) {
            vluVar.m201701X3(String.valueOf(jjsVar.m145122h().f45225id));
        }
    }

    private void setGiftPrice(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hidePrice) {
            bnl0.m105524M(this.f46049p, false);
            return;
        }
        if (!bnl0.m105529O0(this.f46050q)) {
            bnl0.m105524M(this.f46049p, true);
        }
        this.f46049p.setText(String.format(zrv.f205803e.getString(R$string.f48239me), a9g0.m96569d(bLiveGiftItem.getPrice())));
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m70603B0() {
        return this.f46028C.m137240l();
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m70604D0() {
        return !zrv.m221193k().m203597c7();
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m70605E0(jjs jjsVar) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (bLiveGiftItemM145122h == null) {
            return false;
        }
        return lre.m155614a(bLiveGiftItemM145122h, !m70604D0());
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m70606G0(BLiveGiftItem bLiveGiftItem) {
        return (TextUtils.isEmpty(bLiveGiftItem.localRightTag.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m70607H0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localTag;
        if (langModel != null) {
            return (TextUtils.isEmpty(langModel.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m70608I0(boolean z, long j, Integer num) {
        if (this.f46033H == null) {
            return;
        }
        int iIntValue = num.intValue();
        this.f46036K = iIntValue;
        if (iIntValue == 4) {
            this.f46033H.m145114A(true);
            m70618T0();
            if (this.f46034I) {
                m70615Q0();
            }
        }
        if (z) {
            rre.m182727G(this.f46033H.m145122h().liveResourceId, false, this.f46036K != 4, System.currentTimeMillis() - j);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m70609J0() {
        AnimatorSet animatorSet = this.f46059z;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m70610K0() {
        bnl0.m105524M(this.f46050q, true);
    }

    /* JADX INFO: renamed from: L0 */
    public void m70611L0() {
        rjs rjsVar = this.f46027B;
        if (rjsVar != null) {
            rjsVar.m181754l();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m70612N0() {
        this.f46034I = false;
        m70641q0();
        m70643r0();
        m70645s0();
        m70639p0();
        hjs hjsVar = this.f46032G;
        if (hjsVar != null) {
            hjsVar.m135521s();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m70613O0(jjs jjsVar) {
        this.f46034I = true;
        m70637o0(jjsVar);
        setGiftDialogAnchorId(jjsVar);
        if (jjsVar.m145128n()) {
            m70631k1();
            m70642q1(jjsVar);
            m70634m0(jjsVar, null);
            jjsVar.m145136v(false);
        }
        if (jjsVar.m145130p() || !m70604D0()) {
            if (!this.f46035J) {
                m70618T0();
            }
            m70615Q0();
        } else {
            m70635n0(this.f46036K, false);
        }
        juj.m146988b(jjsVar, this.f46030E, "p_live_user_video_quickchat_room");
    }

    /* JADX INFO: renamed from: P0 */
    public void m70614P0(BLiveGiftItem bLiveGiftItem) {
        if (this.f46026A == null) {
            this.f46026A = new ozj(this.f46053t);
        }
        this.f46026A.m169983j(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m70615Q0() {
        m70628g1(this.f46033H);
        m70627f1(this.f46033H.m145122h());
        m70614P0(this.f46033H.m145122h());
        m70626e1(this.f46033H.m145122h());
    }

    /* JADX INFO: renamed from: R0 */
    public void m70616R0(jjs jjsVar, vlu<?> vluVar, int i) {
        m70623Z0();
        this.f46033H = jjsVar;
        this.f46029D = vluVar;
        this.f46030E = i;
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        m70617S0(bLiveGiftItemM145122h);
        m70634m0(jjsVar, null);
        m70621X0(bLiveGiftItemM145122h);
        m70620V0(bLiveGiftItemM145122h);
        m70637o0(jjsVar);
        m70649w0();
        if (jjsVar.m145130p()) {
            m70618T0();
            m70619U0(bLiveGiftItemM145122h);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m70617S0(BLiveGiftItem bLiveGiftItem) {
        if (TextUtils.isEmpty(bLiveGiftItem.url) && TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) {
            return;
        }
        String str = (!zrv.m221193k().m203509R6() || TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) ? bLiveGiftItem.url : bLiveGiftItem.dynamicUrl;
        bnl0.m105524M(this.f46038e, xau.m209916z(str));
        bnl0.m105525M0(this.f46037d, !xau.m209916z(str));
        if (xau.m209916z(str)) {
            this.f46038e.mo69685l(str, -1, null);
            return;
        }
        VDraweeView vDraweeView = this.f46037d;
        int i = qa00.f156293F;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m70618T0() {
        boolean z = false;
        bnl0.m105524M(this.f46048o, false);
        this.f46035J = true;
        BLiveGiftItem bLiveGiftItemM145122h = this.f46033H.m145122h();
        bnl0.m105524M(this.f46042i, bLiveGiftItemM145122h.isCountTimeGift());
        if (bLiveGiftItemM145122h.isJumpGift()) {
            bnl0.m105524M(this.f46056w, false);
            this.f46041h.setText(bLiveGiftItemM145122h.getJumpGiftName());
            this.f46041h.setTextColor(-1);
            this.f46049p.setText(bLiveGiftItemM145122h.getLocalSubtitle());
            this.f46049p.setTextColor(n3d0.m161277a(n9c0.f140766E0));
            bnl0.m105524M(this.f46049p, true);
            this.f46050q.setText(bLiveGiftItemM145122h.expiredTimeText);
            this.f46050q.setTextColor(n3d0.m161277a(n9c0.f140861r0));
            bnl0.m105524M(this.f46050q, false);
            return;
        }
        this.f46041h.setText(bLiveGiftItemM145122h.getLocalName());
        this.f46041h.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        this.f46049p.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        setAlpha(1.0f);
        if (bLiveGiftItemM145122h.isPaidGift()) {
            bnl0.m105524M(this.f46056w, false);
            bnl0.m105524M(this.f46050q, false);
            setGiftPrice(bLiveGiftItemM145122h);
            return;
        }
        if (!bLiveGiftItemM145122h.isPacketGift()) {
            if (bLiveGiftItemM145122h.isScrapGift()) {
                bnl0.m105524M(this.f46056w, true);
                m70636n1(bLiveGiftItemM145122h.remain, bLiveGiftItemM145122h.expiredTimeText);
                return;
            }
            return;
        }
        bnl0.m105524M(this.f46056w, true);
        this.f46050q.setTextColor(n3d0.m161277a(n9c0.f140861r0));
        if (!this.f46033H.m145129o() && !TextUtils.isEmpty(bLiveGiftItemM145122h.expiredTimeText)) {
            z = true;
        }
        bnl0.m105524M(this.f46050q, z);
        bnl0.m105524M(this.f46049p, !z);
        setGiftPrice(bLiveGiftItemM145122h);
        m70638o1(bLiveGiftItemM145122h.remain, bLiveGiftItemM145122h.expiredTimeText, z);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m70619U0(BLiveGiftItem bLiveGiftItem) {
        BLiveGiftNameStatus bLiveGiftNameStatus = bLiveGiftItem.nameStatus;
        if (bLiveGiftNameStatus == null || !bLiveGiftNameStatus.status) {
            bnl0.m105524M(this.f46039f, false);
            bnl0.m105524M(this.f46040g, false);
        } else {
            bnl0.m105524M(this.f46039f, true);
            bnl0.m105524M(this.f46040g, true);
            this.f46040g.setText(bLiveGiftItem.nameStatus.userName);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m70620V0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM161004a = n0k.m161004a(bLiveGiftItem);
        if (gradientDrawableM161004a != null) {
            this.f46054u.setBackground(gradientDrawableM161004a);
        }
        if (!m70606G0(bLiveGiftItem)) {
            m70647u0();
        } else {
            this.f46054u.setText(bLiveGiftItem.getLocalRightTagName());
            m70624a1();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m70621X0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM161006c = n0k.m161006c(bLiveGiftItem);
        if (gradientDrawableM161006c != null) {
            this.f46053t.setBackground(gradientDrawableM161006c);
        }
        if (!m70607H0(bLiveGiftItem)) {
            m70648v0();
            return;
        }
        this.f46053t.setText(bLiveGiftItem.getLocalTagName());
        this.f46053t.setTextColor(n3d0.m161283g(bLiveGiftItem.tagTextColor));
        m70625d1();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m70622Y0() {
        this.f46036K = 1;
        m70635n0(1, true);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m70623Z0() {
        this.f46037d.setController(null);
        this.f46041h.setText("");
        this.f46049p.setText("");
        this.f46050q.setText("");
        this.f46049p.setTranslationY(0.0f);
        this.f46050q.setTranslationY(0.0f);
        this.f46041h.setTextColor(-1);
        this.f46049p.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        this.f46043j.clearAnimation();
        bnl0.m105524M(this.f46053t, false);
        bnl0.m105524M(this.f46054u, false);
        bnl0.m105524M(this.f46042i, false);
        bnl0.m105524M(this.f46048o, false);
        bnl0.m105524M(this.f46056w, false);
        bnl0.m105524M(this.f46057x, false);
        bnl0.m105524M(this.f46039f, false);
        bnl0.m105524M(this.f46040g, false);
        bnl0.m105524M(this.f46041h, true);
        bnl0.m105524M(this.f46049p, true);
        setOnClickListener(null);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        this.f46058y = null;
        this.f46059z = null;
        this.f46026A = null;
        this.f46027B = null;
        this.f46028C = null;
        this.f46029D = null;
        this.f46030E = 0;
        this.f46031F = null;
        this.f46032G = null;
        this.f46033H = null;
        this.f46034I = false;
        this.f46035J = false;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m70624a1() {
        bnl0.m105524M(this.f46054u, true);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m70625d1() {
        bnl0.m105524M(this.f46053t, true);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m70626e1(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hasRotationAnim()) {
            if (this.f46027B == null) {
                this.f46027B = new rjs(this, this.f46029D.m201713p3(bLiveGiftItem.showAnimRules.showAction.frequency));
            }
            this.f46027B.m181759q(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m70627f1(BLiveGiftItem bLiveGiftItem) {
        if (this.f46033H.m145122h().hidePrice) {
            if (TextUtils.isEmpty(this.f46033H.m145122h().expiredTimeText)) {
                return;
            }
            bnl0.m105524M(this.f46050q, true);
            bnl0.m105524M(this.f46049p, false);
            return;
        }
        if (!bLiveGiftItem.isJumpGift() || TextUtils.isEmpty(bLiveGiftItem.expiredTimeText)) {
            return;
        }
        m70641q0();
        int iM175859d = qa00.m175859d(13.0f);
        float f = iM175859d;
        this.f46050q.setTranslationY(f);
        bnl0.m105524M(this.f46050q, true);
        if (this.f46059z == null) {
            float f2 = -iM175859d;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132166l(this.f46049p, property, 3000L, 300L, null, 0.0f, f2);
            ObjectAnimator objectAnimator2 = (ObjectAnimator) gt0.m132166l(this.f46050q, property, 3000L, 300L, null, f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimator, objectAnimator2);
            Animator animatorM132164j = gt0.m132164j(3000);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) gt0.m132166l(this.f46049p, property, 3000L, 300L, null, f, 0.0f);
            ObjectAnimator objectAnimator4 = (ObjectAnimator) gt0.m132166l(this.f46050q, property, 3000L, 300L, null, 0.0f, f2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimator3, objectAnimator4);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f46059z = animatorSet3;
            animatorSet3.playSequentially(animatorSet, animatorM132164j, animatorSet2);
        }
        gt0.m132160f(this.f46059z, new Runnable() { // from class: l.lmu
            @Override // java.lang.Runnable
            public final void run() {
                this.f132718a.m70609J0();
            }
        });
        this.f46059z.start();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m70628g1(final jjs jjsVar) {
        if (jjsVar.m145122h().hidePrice) {
            if (TextUtils.isEmpty(jjsVar.m145122h().expiredTimeText)) {
                return;
            }
            bnl0.m105524M(this.f46050q, true);
            return;
        }
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (!bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.remain <= 0) {
            m70643r0();
            return;
        }
        if (!jjsVar.m145129o() || TextUtils.isEmpty(bLiveGiftItemM145122h.expiredTimeText)) {
            if (TextUtils.isEmpty(bLiveGiftItemM145122h.expiredTimeText)) {
                setGiftPrice(bLiveGiftItemM145122h);
                return;
            } else {
                bnl0.m105524M(this.f46050q, true);
                return;
            }
        }
        m70643r0();
        setGiftPrice(bLiveGiftItemM145122h);
        int iM175859d = qa00.m175859d(16.0f);
        float f = iM175859d;
        this.f46050q.setTranslationY(f);
        Property property = View.TRANSLATION_Y;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(this.f46049p, property, 3000L, 300L, null, 0.0f, -iM175859d), gt0.m132166l(this.f46050q, property, 3000L, 300L, null, f, 0.0f));
        this.f46058y = animatorM132180z;
        gt0.m132177w(animatorM132180z, new Runnable() { // from class: l.mmu
            @Override // java.lang.Runnable
            public final void run() {
                this.f137637a.m70610K0();
            }
        }, new Runnable() { // from class: l.nmu
            @Override // java.lang.Runnable
            public final void run() {
                jjsVar.m145138x(false);
            }
        });
        this.f46058y.start();
    }

    /* JADX INFO: renamed from: h1 */
    public void m70629h1(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.isScrapGift()) {
            int i = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM145122h.remain = i;
            bLiveGiftItemM145122h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
            String str = bLiveGivenGiftBrief.expiredTimeText;
            bLiveGiftItemM145122h.expiredTimeText = str;
            m70636n1(i, str);
        }
        bLiveGiftItemM145122h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        f3e.m123726f(bLiveGiftItemM145122h, bLiveGivenGiftBrief);
        m70644r1(bLiveGivenGiftBrief, bLiveGiftItemM145122h);
        m70642q1(jjsVar);
        m70634m0(jjsVar, bLiveGivenGiftBrief);
        setGiftPrice(bLiveGiftItemM145122h);
    }

    public boolean isShowing() {
        return this.f46034I;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m70630j1() {
        this.f46036K = gyj.m132970a(this.f46033H);
    }

    /* JADX INFO: renamed from: k1 */
    public void m70631k1() {
        jjs jjsVar = this.f46033H;
        if (jjsVar == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.isScrapGift()) {
            m70636n1(bLiveGiftItemM145122h.remain, bLiveGiftItemM145122h.expiredTimeText);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m70632l0(View view) {
        omu.m168281a(this, view);
    }

    /* JADX INFO: renamed from: l1 */
    public void m70633l1(int i) {
        m70636n1(i, "");
    }

    /* JADX INFO: renamed from: m0 */
    public final void m70634m0(jjs jjsVar, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f46028C == null) {
            this.f46028C = new huj(this.f46029D);
        }
        this.f46028C.m137245q(jjsVar, this, this.f46030E, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m70635n0(int i, final boolean z) {
        if (this.f46032G != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f46032G.m135508f(i, z, new y20() { // from class: l.kmu
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127535a.m70608I0(z, jCurrentTimeMillis, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m70636n1(int i, String str) {
        m70640p1(i);
        VText vText = this.f46050q;
        if (i > 0) {
            vText.setText(dpj.m117399s(str));
        } else {
            vText.setText(zrv.f205803e.getString(R$string.f48097g3));
        }
        Animator animator = this.f46058y;
        if (animator == null || !animator.isRunning()) {
            bnl0.m105524M(this.f46050q, true);
            bnl0.m105524M(this.f46049p, false);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m70637o0(jjs jjsVar) {
        jjsVar.m145114A(m70605E0(jjsVar) || jjsVar.m145122h().isCountTimeGift());
        m70642q1(jjsVar);
        m70630j1();
    }

    /* JADX INFO: renamed from: o1 */
    public final void m70638o1(int i, String str, boolean z) {
        m70640p1(i);
        VText vText = this.f46050q;
        if (i > 0) {
            vText.setText(dpj.m117399s(str));
        } else {
            vText.setText(zrv.f205803e.getString(R$string.f48097g3));
        }
        Animator animator = this.f46058y;
        if (animator == null || !animator.isRunning()) {
            if (!z) {
                bnl0.m105524M(this.f46049p, true);
            } else {
                bnl0.m105524M(this.f46050q, true);
                bnl0.m105524M(this.f46049p, false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bnl0.m105524M(this.f46038e, false);
        this.f46038e.m69688o();
        m70643r0();
        m70641q0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70632l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m70639p0() {
        rjs rjsVar = this.f46027B;
        if (rjsVar != null) {
            rjsVar.m181754l();
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m70640p1(int i) {
        this.f46056w.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m70641q0() {
        AnimatorSet animatorSet = this.f46059z;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f46059z.cancel();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m70642q1(jjs jjsVar) {
        setAlpha((jjsVar.m145122h().interactStatus.equals("SetToGray") || !jjsVar.m145130p()) ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70643r0() {
        Animator animator = this.f46058y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f46058y.cancel();
        }
        this.f46050q.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m70644r1(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        bLiveGiftItem.updateTagColorFromBrief(bLiveGivenGiftBrief);
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tag)) {
            String str = bLiveGivenGiftBrief.tag;
            bLiveGiftItem.tag = str;
            try {
                bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(str);
            } catch (IOException unused) {
            }
        }
        m70621X0(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m70645s0() {
        ozj ozjVar = this.f46026A;
        if (ozjVar != null) {
            ozjVar.m169978e();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m70646t0() {
        hjs hjsVar = this.f46032G;
        if (hjsVar != null) {
            hjsVar.m135509g();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m70647u0() {
        bnl0.m105524M(this.f46054u, false);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70648v0() {
        bnl0.m105524M(this.f46053t, false);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m70649w0() {
        if (m70604D0() && this.f46032G == null && !this.f46033H.m145130p()) {
            this.f46032G = new hjs(this.f46033H, this, this.f46030E, this.f46029D);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m70650y0() {
        return this.f46032G != null && this.f46036K == 3;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m70651z0() {
        return this.f46032G != null && this.f46036K == 1;
    }

    public LiveVChatGiftItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveVChatGiftItemView(Context context) {
        this(context, null);
    }
}
