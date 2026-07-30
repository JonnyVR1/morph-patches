package com.p051p1.mobile.putong.live.livingroom.increment.gift;

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
import p153l.bjs;
import p153l.bnl0;
import p153l.cpj;
import p153l.f3e;
import p153l.gjs;
import p153l.gt0;
import p153l.guj;
import p153l.gyj;
import p153l.izs;
import p153l.jjs;
import p153l.juj;
import p153l.lre;
import p153l.n0k;
import p153l.n3d0;
import p153l.n9c0;
import p153l.ozj;
import p153l.qa00;
import p153l.qjs;
import p153l.qxj;
import p153l.rre;
import p153l.u8n;
import p153l.xau;
import p153l.xjs;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public ozj f50351A;

    /* JADX INFO: renamed from: B */
    public qjs f50352B;

    /* JADX INFO: renamed from: C */
    public guj f50353C;

    /* JADX INFO: renamed from: D */
    public bjs<?> f50354D;

    /* JADX INFO: renamed from: E */
    public int f50355E;

    /* JADX INFO: renamed from: F */
    public qxj f50356F;

    /* JADX INFO: renamed from: G */
    public gjs f50357G;

    /* JADX INFO: renamed from: H */
    public jjs f50358H;

    /* JADX INFO: renamed from: I */
    public boolean f50359I;

    /* JADX INFO: renamed from: J */
    public boolean f50360J;

    /* JADX INFO: renamed from: K */
    public int f50361K;

    /* JADX INFO: renamed from: d */
    public VDraweeView f50362d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f50363e;

    /* JADX INFO: renamed from: f */
    public VImage f50364f;

    /* JADX INFO: renamed from: g */
    public VText f50365g;

    /* JADX INFO: renamed from: h */
    public VText f50366h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f50367i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f50368j;

    /* JADX INFO: renamed from: k */
    public View f50369k;

    /* JADX INFO: renamed from: l */
    public TextView f50370l;

    /* JADX INFO: renamed from: m */
    public View f50371m;

    /* JADX INFO: renamed from: n */
    public ProgressBar f50372n;

    /* JADX INFO: renamed from: o */
    public Group f50373o;

    /* JADX INFO: renamed from: p */
    public VText f50374p;

    /* JADX INFO: renamed from: q */
    public VText f50375q;

    /* JADX INFO: renamed from: r */
    public View f50376r;

    /* JADX INFO: renamed from: s */
    public View f50377s;

    /* JADX INFO: renamed from: t */
    public VText f50378t;

    /* JADX INFO: renamed from: u */
    public VText f50379u;

    /* JADX INFO: renamed from: v */
    public View f50380v;

    /* JADX INFO: renamed from: w */
    public VText f50381w;

    /* JADX INFO: renamed from: x */
    public VText f50382x;

    /* JADX INFO: renamed from: y */
    public Animator f50383y;

    /* JADX INFO: renamed from: z */
    public AnimatorSet f50384z;

    public LiveGiftItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50359I = false;
        this.f50360J = false;
        this.f50361K = 1;
    }

    /* JADX INFO: renamed from: H0 */
    private boolean m74618H0(jjs jjsVar) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (bLiveGiftItemM145122h == null) {
            return false;
        }
        return lre.m155614a(bLiveGiftItemM145122h, !m74658G0());
    }

    /* JADX INFO: renamed from: I0 */
    private boolean m74619I0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localRightTag;
        return ((langModel == null || TextUtils.isEmpty(langModel.getLocalName())) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m74620J0(BLiveGiftItem bLiveGiftItem) {
        LangModel langModel = bLiveGiftItem.localTag;
        if (langModel != null) {
            return (TextUtils.isEmpty(langModel.getLocalName()) && TextUtils.isEmpty(bLiveGiftItem.longPressText)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m74621K0(boolean z, long j, Integer num) {
        if (this.f50358H == null) {
            return;
        }
        int iIntValue = num.intValue();
        this.f50361K = iIntValue;
        if (iIntValue == 4) {
            this.f50358H.m145114A(true);
            m74626X0();
            if (this.f50359I) {
                m74624T0();
            }
        }
        if (z) {
            rre.m182727G(this.f50358H.m145122h().liveResourceId, false, this.f50361K != 4, System.currentTimeMillis() - j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m74622N0() {
        AnimatorSet animatorSet = this.f50384z;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m74623O0() {
        bnl0.m105524M(this.f50375q, true);
    }

    /* JADX INFO: renamed from: T0 */
    private void m74624T0() {
        m74638k1(this.f50358H);
        m74636j1(this.f50358H.m145122h());
        m74663S0(this.f50358H.m145122h());
        m74633h1(this.f50358H.m145122h());
    }

    /* JADX INFO: renamed from: V0 */
    private void m74625V0(BLiveGiftItem bLiveGiftItem) {
        if (TextUtils.isEmpty(bLiveGiftItem.url) && TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) {
            return;
        }
        String str = (!zrv.m221193k().m203509R6() || TextUtils.isEmpty(bLiveGiftItem.dynamicUrl)) ? bLiveGiftItem.url : bLiveGiftItem.dynamicUrl;
        bnl0.m105524M(this.f50363e, xau.m209916z(str));
        bnl0.m105525M0(this.f50362d, !xau.m209916z(str));
        if (xau.m209916z(str)) {
            this.f50363e.mo69685l(str, -1, null);
            return;
        }
        VDraweeView vDraweeView = this.f50362d;
        int i = qa00.f156293F;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m74626X0() {
        boolean z = false;
        bnl0.m105524M(this.f50373o, false);
        this.f50360J = true;
        BLiveGiftItem bLiveGiftItemM145122h = this.f50358H.m145122h();
        bnl0.m105524M(this.f50367i, bLiveGiftItemM145122h.isCountTimeGift());
        if (bLiveGiftItemM145122h.isJumpGift()) {
            bnl0.m105524M(this.f50381w, false);
            this.f50366h.setText(bLiveGiftItemM145122h.getJumpGiftName());
            this.f50366h.setTextColor(-1);
            this.f50374p.setText(bLiveGiftItemM145122h.getLocalSubtitle());
            this.f50374p.setTextColor(n3d0.m161277a(n9c0.f140766E0));
            bnl0.m105524M(this.f50374p, true);
            this.f50375q.setText(bLiveGiftItemM145122h.expiredTimeText);
            this.f50375q.setTextColor(n3d0.m161277a(n9c0.f140861r0));
            bnl0.m105524M(this.f50375q, false);
            return;
        }
        this.f50366h.setText(bLiveGiftItemM145122h.getLocalName());
        this.f50366h.setTextColor(n3d0.m161277a(n9c0.f140877w1));
        this.f50374p.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        setAlpha(1.0f);
        if (bLiveGiftItemM145122h.isPaidGift()) {
            bnl0.m105524M(this.f50381w, false);
            bnl0.m105524M(this.f50375q, false);
            setGiftPrice(bLiveGiftItemM145122h);
            return;
        }
        if (!bLiveGiftItemM145122h.isPacketGift()) {
            if (bLiveGiftItemM145122h.isScrapGift()) {
                bnl0.m105524M(this.f50381w, true);
                m74671q1(bLiveGiftItemM145122h.remain, bLiveGiftItemM145122h.expiredTimeText);
                return;
            }
            return;
        }
        bnl0.m105524M(this.f50381w, true);
        this.f50375q.setTextColor(n3d0.m161277a(n9c0.f140861r0));
        if (!this.f50358H.m145129o() && !TextUtils.isEmpty(bLiveGiftItemM145122h.expiredTimeText)) {
            z = true;
        }
        bnl0.m105524M(this.f50375q, z);
        bnl0.m105524M(this.f50374p, !z);
        setGiftPrice(bLiveGiftItemM145122h);
        m74646r1(bLiveGiftItemM145122h.remain, bLiveGiftItemM145122h.expiredTimeText, z);
    }

    /* JADX INFO: renamed from: Y0 */
    private void m74627Y0(BLiveGiftItem bLiveGiftItem) {
        BLiveGiftNameStatus bLiveGiftNameStatus = bLiveGiftItem.nameStatus;
        if (bLiveGiftNameStatus == null || !bLiveGiftNameStatus.status) {
            bnl0.m105524M(this.f50364f, false);
            bnl0.m105524M(this.f50365g, false);
        } else {
            bnl0.m105524M(this.f50364f, true);
            bnl0.m105524M(this.f50365g, true);
            this.f50365g.setText(bLiveGiftItem.nameStatus.userName);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private void m74628Z0(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM161004a = n0k.m161004a(bLiveGiftItem);
        if (gradientDrawableM161004a != null) {
            this.f50379u.setBackground(gradientDrawableM161004a);
        }
        if (!m74619I0(bLiveGiftItem)) {
            m74652v0();
        } else {
            this.f50379u.setText(bLiveGiftItem.getLocalRightTagName());
            m74630f1();
        }
    }

    /* JADX INFO: renamed from: a1 */
    private void m74629a1(BLiveGiftItem bLiveGiftItem) {
        GradientDrawable gradientDrawableM161006c = n0k.m161006c(bLiveGiftItem);
        if (gradientDrawableM161006c != null) {
            this.f50378t.setBackground(gradientDrawableM161006c);
        }
        if (!m74620J0(bLiveGiftItem)) {
            m74653w0();
            return;
        }
        this.f50378t.setText(bLiveGiftItem.getLocalTagName());
        this.f50378t.setTextColor(n3d0.m161283g(bLiveGiftItem.tagTextColor));
        m74631g1();
    }

    /* JADX INFO: renamed from: f1 */
    private void m74630f1() {
        bnl0.m105524M(this.f50379u, true);
    }

    /* JADX INFO: renamed from: g1 */
    private void m74631g1() {
        bnl0.m105524M(this.f50378t, true);
    }

    /* JADX INFO: renamed from: h1 */
    private void m74633h1(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hasRotationAnim()) {
            if (this.f50352B == null) {
                this.f50352B = new qjs(this, this.f50354D.m104719O4(bLiveGiftItem.showAnimRules.showAction.frequency));
            }
            this.f50352B.m176876q(bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: j1 */
    private void m74636j1(BLiveGiftItem bLiveGiftItem) {
        if (this.f50358H.m145122h().hidePrice) {
            if (TextUtils.isEmpty(this.f50358H.m145122h().expiredTimeText)) {
                return;
            }
            bnl0.m105524M(this.f50375q, true);
            bnl0.m105524M(this.f50374p, false);
            return;
        }
        if (!bLiveGiftItem.isJumpGift() || TextUtils.isEmpty(bLiveGiftItem.expiredTimeText)) {
            return;
        }
        m74645r0();
        int iM175859d = qa00.m175859d(13.0f);
        float f = iM175859d;
        this.f50375q.setTranslationY(f);
        bnl0.m105524M(this.f50375q, true);
        if (this.f50384z == null) {
            float f2 = -iM175859d;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimator = (ObjectAnimator) gt0.m132166l(this.f50374p, property, 3000L, 300L, null, 0.0f, f2);
            ObjectAnimator objectAnimator2 = (ObjectAnimator) gt0.m132166l(this.f50375q, property, 3000L, 300L, null, f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimator, objectAnimator2);
            Animator animatorM132164j = gt0.m132164j(3000);
            ObjectAnimator objectAnimator3 = (ObjectAnimator) gt0.m132166l(this.f50374p, property, 3000L, 300L, null, f, 0.0f);
            ObjectAnimator objectAnimator4 = (ObjectAnimator) gt0.m132166l(this.f50375q, property, 3000L, 300L, null, 0.0f, f2);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimator3, objectAnimator4);
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.f50384z = animatorSet3;
            animatorSet3.playSequentially(animatorSet, animatorM132164j, animatorSet2);
        }
        gt0.m132160f(this.f50384z, new Runnable() { // from class: l.tjs
            @Override // java.lang.Runnable
            public final void run() {
                this.f174611a.m74622N0();
            }
        });
        this.f50384z.start();
    }

    /* JADX INFO: renamed from: k1 */
    private void m74638k1(final jjs jjsVar) {
        if (jjsVar.m145122h().hidePrice) {
            if (TextUtils.isEmpty(jjsVar.m145122h().expiredTimeText)) {
                return;
            }
            bnl0.m105524M(this.f50375q, true);
            return;
        }
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (!bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.remain <= 0) {
            m74647s0();
            return;
        }
        if (!jjsVar.m145129o() || TextUtils.isEmpty(bLiveGiftItemM145122h.expiredTimeText)) {
            if (TextUtils.isEmpty(bLiveGiftItemM145122h.expiredTimeText)) {
                setGiftPrice(bLiveGiftItemM145122h);
                return;
            } else {
                bnl0.m105524M(this.f50375q, true);
                return;
            }
        }
        m74647s0();
        setGiftPrice(bLiveGiftItemM145122h);
        int iM175859d = qa00.m175859d(16.0f);
        float f = iM175859d;
        this.f50375q.setTranslationY(f);
        Property property = View.TRANSLATION_Y;
        Animator animatorM132180z = gt0.m132180z(gt0.m132166l(this.f50374p, property, 3000L, 300L, null, 0.0f, -iM175859d), gt0.m132166l(this.f50375q, property, 3000L, 300L, null, f, 0.0f));
        this.f50383y = animatorM132180z;
        gt0.m132177w(animatorM132180z, new Runnable() { // from class: l.vjs
            @Override // java.lang.Runnable
            public final void run() {
                this.f184437a.m74623O0();
            }
        }, new Runnable() { // from class: l.wjs
            @Override // java.lang.Runnable
            public final void run() {
                jjsVar.m145138x(false);
            }
        });
        this.f50383y.start();
    }

    /* JADX INFO: renamed from: n0 */
    private void m74640n0(jjs jjsVar, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (this.f50353C == null) {
            this.f50353C = new guj(this.f50354D);
        }
        this.f50353C.m132315u(jjsVar, this, this.f50355E, bLiveGivenGiftBrief);
    }

    /* JADX INFO: renamed from: n1 */
    private void m74641n1() {
        this.f50361K = gyj.m132970a(this.f50358H);
    }

    /* JADX INFO: renamed from: o0 */
    private void m74642o0(int i, final boolean z) {
        if (this.f50357G != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.f50357G.m130529f(i, z, new y20() { // from class: l.ujs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f179329a.m74621K0(z, jCurrentTimeMillis, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p0 */
    private void m74643p0(jjs jjsVar) {
        jjsVar.m145114A(m74618H0(jjsVar) || jjsVar.m145122h().isCountTimeGift());
        m74650t1(jjsVar);
        m74641n1();
    }

    /* JADX INFO: renamed from: q0 */
    private void m74644q0() {
        qjs qjsVar = this.f50352B;
        if (qjsVar != null) {
            qjsVar.m176871l();
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m74645r0() {
        AnimatorSet animatorSet = this.f50384z;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f50384z.cancel();
        }
    }

    /* JADX INFO: renamed from: r1 */
    private void m74646r1(int i, String str, boolean z) {
        m74648s1(i);
        VText vText = this.f50375q;
        if (i > 0) {
            vText.setText(cpj.m111768D(str));
        } else {
            vText.setText(zrv.f205803e.getString(R$string.f48097g3));
        }
        Animator animator = this.f50383y;
        if (animator == null || !animator.isRunning()) {
            if (!z) {
                bnl0.m105524M(this.f50374p, true);
            } else {
                bnl0.m105524M(this.f50375q, true);
                bnl0.m105524M(this.f50374p, false);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m74647s0() {
        Animator animator = this.f50383y;
        if (animator != null) {
            animator.removeAllListeners();
            this.f50383y.cancel();
        }
        this.f50375q.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: s1 */
    private void m74648s1(int i) {
        this.f50381w.setText(String.valueOf(i));
    }

    private void setGiftDialogAnchorId(jjs jjsVar) {
        bjs<?> bjsVar = this.f50354D;
        if (bjsVar != null) {
            bjsVar.m104736Y5(String.valueOf(jjsVar.m145122h().f45225id));
        }
    }

    private void setGiftPrice(BLiveGiftItem bLiveGiftItem) {
        if (bLiveGiftItem.hidePrice) {
            bnl0.m105524M(this.f50374p, false);
            return;
        }
        if (!bnl0.m105529O0(this.f50375q)) {
            bnl0.m105524M(this.f50374p, true);
        }
        this.f50374p.setText(String.format(zrv.f205803e.getString(u8n.m195065a() ? R$string.f48349re : R$string.f48239me), a9g0.m96569d(bLiveGiftItem.getPrice())));
    }

    /* JADX INFO: renamed from: t0 */
    private void m74649t0() {
        ozj ozjVar = this.f50351A;
        if (ozjVar != null) {
            ozjVar.m169978e();
        }
    }

    /* JADX INFO: renamed from: t1 */
    private void m74650t1(jjs jjsVar) {
        setAlpha(jjsVar.m145122h().interactStatus.equals("SetToGray") ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: u1 */
    private void m74651u1(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem) {
        bLiveGiftItem.updateTagColorFromBrief(bLiveGivenGiftBrief);
        if (!TextUtils.isEmpty(bLiveGivenGiftBrief.tag)) {
            String str = bLiveGivenGiftBrief.tag;
            bLiveGiftItem.tag = str;
            try {
                bLiveGiftItem.localTag = LangModel.JSON_ADAPTER.parse(str);
            } catch (IOException unused) {
            }
        }
        m74629a1(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: v0 */
    private void m74652v0() {
        bnl0.m105524M(this.f50379u, false);
    }

    /* JADX INFO: renamed from: w0 */
    private void m74653w0() {
        bnl0.m105524M(this.f50378t, false);
    }

    /* JADX INFO: renamed from: y0 */
    private void m74654y0() {
        if (m74658G0() && this.f50357G == null && !this.f50358H.m145130p()) {
            this.f50357G = new gjs(this.f50358H, this, this.f50355E, this.f50354D);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m74655B0() {
        return this.f50361K == 4;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m74656D0() {
        return this.f50357G != null && this.f50361K == 1;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m74657E0() {
        return this.f50353C.m132308n();
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m74658G0() {
        return !zrv.m221193k().m203597c7();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m74659L0(BLiveGiftItem bLiveGiftItem) {
        this.f50358H.m145134t(bLiveGiftItem);
        m74664U0(this.f50358H, this.f50354D, this.f50355E);
    }

    /* JADX INFO: renamed from: P0 */
    public void m74660P0() {
        qjs qjsVar = this.f50352B;
        if (qjsVar != null) {
            qjsVar.m176871l();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m74661Q0() {
        this.f50359I = false;
        m74645r0();
        m74647s0();
        m74649t0();
        m74644q0();
        gjs gjsVar = this.f50357G;
        if (gjsVar != null) {
            gjsVar.m130542s();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m74662R0(jjs jjsVar) {
        this.f50359I = true;
        m74643p0(jjsVar);
        setGiftDialogAnchorId(jjsVar);
        if (jjsVar.m145128n()) {
            m74669o1();
            m74650t1(jjsVar);
            m74640n0(jjsVar, null);
            jjsVar.m145136v(false);
        }
        if (jjsVar.m145130p() || !m74658G0()) {
            if (!this.f50360J) {
                m74626X0();
            }
            m74624T0();
        } else {
            m74642o0(this.f50361K, false);
        }
        juj.m146988b(jjsVar, this.f50355E, this.f50354D.mo78457R2());
    }

    /* JADX INFO: renamed from: S0 */
    public void m74663S0(BLiveGiftItem bLiveGiftItem) {
        if (this.f50351A == null) {
            this.f50351A = new ozj(this.f50378t);
        }
        this.f50351A.m169983j(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: U0 */
    public void m74664U0(jjs jjsVar, bjs<?> bjsVar, int i) {
        m74666e1();
        this.f50358H = jjsVar;
        this.f50354D = bjsVar;
        this.f50355E = i;
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        m74625V0(bLiveGiftItemM145122h);
        m74640n0(jjsVar, null);
        m74629a1(bLiveGiftItemM145122h);
        m74628Z0(bLiveGiftItemM145122h);
        m74643p0(jjsVar);
        m74654y0();
        if (jjsVar.m145130p()) {
            m74626X0();
            m74627Y0(bLiveGiftItemM145122h);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m74665d1() {
        this.f50361K = 1;
        m74642o0(1, true);
    }

    /* JADX INFO: renamed from: e1 */
    public void m74666e1() {
        this.f50362d.setController(null);
        this.f50366h.setText("");
        this.f50374p.setText("");
        this.f50375q.setText("");
        this.f50374p.setTranslationY(0.0f);
        this.f50375q.setTranslationY(0.0f);
        this.f50366h.setTextColor(-1);
        this.f50374p.setTextColor(n3d0.m161277a(n9c0.f140850n1));
        this.f50368j.clearAnimation();
        bnl0.m105524M(this.f50378t, false);
        bnl0.m105524M(this.f50379u, false);
        bnl0.m105524M(this.f50367i, false);
        bnl0.m105524M(this.f50373o, false);
        bnl0.m105524M(this.f50381w, false);
        bnl0.m105524M(this.f50382x, false);
        bnl0.m105524M(this.f50364f, false);
        bnl0.m105524M(this.f50365g, false);
        bnl0.m105524M(this.f50366h, true);
        bnl0.m105524M(this.f50374p, true);
        setOnClickListener(null);
        setOnLongClickListener(null);
        setOnTouchListener(null);
        this.f50383y = null;
        this.f50384z = null;
        this.f50351A = null;
        this.f50352B = null;
        this.f50353C = null;
        this.f50354D = null;
        this.f50355E = 0;
        this.f50356F = null;
        this.f50357G = null;
        this.f50358H = null;
        this.f50359I = false;
        this.f50360J = false;
    }

    public qxj getReplaceListener() {
        if (this.f50356F == null) {
            this.f50356F = new qxj() { // from class: l.sjs
                @Override // p153l.qxj
                /* JADX INFO: renamed from: a */
                public final void mo178603a(BLiveGiftItem bLiveGiftItem) {
                    this.f169172a.m74659L0(bLiveGiftItem);
                }
            };
        }
        return this.f50356F;
    }

    public boolean isShowing() {
        return this.f50359I;
    }

    /* JADX INFO: renamed from: l1 */
    public void m74667l1(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.isScrapGift()) {
            int i = bLiveGivenGiftBrief.remain;
            bLiveGiftItemM145122h.remain = i;
            bLiveGiftItemM145122h.expiredTime = bLiveGivenGiftBrief.expiredTime;
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
            String str = bLiveGivenGiftBrief.expiredTimeText;
            bLiveGiftItemM145122h.expiredTimeText = str;
            m74671q1(i, str);
        }
        bLiveGiftItemM145122h.interactStatus = bLiveGivenGiftBrief.interactStatus;
        f3e.m123726f(bLiveGiftItemM145122h, bLiveGivenGiftBrief);
        m74651u1(bLiveGivenGiftBrief, bLiveGiftItemM145122h);
        m74650t1(jjsVar);
        m74640n0(jjsVar, bLiveGivenGiftBrief);
        setGiftPrice(bLiveGiftItemM145122h);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74668m0(View view) {
        xjs.m211263a(this, view);
    }

    /* JADX INFO: renamed from: o1 */
    public void m74669o1() {
        jjs jjsVar = this.f50358H;
        if (jjsVar == null) {
            return;
        }
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (bLiveGiftItemM145122h.isPacketGift() || bLiveGiftItemM145122h.isScrapGift()) {
            m74671q1(bLiveGiftItemM145122h.remain, bLiveGiftItemM145122h.expiredTimeText);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bnl0.m105524M(this.f50363e, false);
        this.f50363e.m69688o();
        m74647s0();
        m74645r0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74668m0(this);
    }

    /* JADX INFO: renamed from: p1 */
    public void m74670p1(int i) {
        m74671q1(i, "");
    }

    /* JADX INFO: renamed from: q1 */
    public void m74671q1(int i, String str) {
        m74648s1(i);
        VText vText = this.f50375q;
        if (i > 0) {
            vText.setText(cpj.m111768D(str));
        } else {
            vText.setText(zrv.f205803e.getString(R$string.f48097g3));
        }
        Animator animator = this.f50383y;
        if (animator == null || !animator.isRunning()) {
            bnl0.m105524M(this.f50375q, true);
            bnl0.m105524M(this.f50374p, false);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m74672u0() {
        gjs gjsVar = this.f50357G;
        if (gjsVar != null) {
            gjsVar.m130530g();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m74673z0() {
        return this.f50357G != null && this.f50361K == 3;
    }

    public LiveGiftItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveGiftItemView(Context context) {
        this(context, null);
    }
}
