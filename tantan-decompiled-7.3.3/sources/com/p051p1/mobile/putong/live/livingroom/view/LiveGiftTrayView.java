package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.gms;
import p153l.gt0;
import p153l.i9n;
import p153l.it0;
import p153l.izs;
import p153l.muj;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.und0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class LiveGiftTrayView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public boolean f52790A;

    /* JADX INFO: renamed from: B */
    public y20<C12999e.b> f52791B;

    /* JADX INFO: renamed from: C */
    public Animator f52792C;

    /* JADX INFO: renamed from: D */
    public Animator f52793D;

    /* JADX INFO: renamed from: E */
    public y20<BLiveIntlFlyMicEffectConfig> f52794E;

    /* JADX INFO: renamed from: d */
    public LiveGiftTrayView f52795d;

    /* JADX INFO: renamed from: e */
    public TrayBackground f52796e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f52797f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52798g;

    /* JADX INFO: renamed from: h */
    public LiveGradientTextView f52799h;

    /* JADX INFO: renamed from: i */
    public VText f52800i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f52801j;

    /* JADX INFO: renamed from: k */
    public VImage f52802k;

    /* JADX INFO: renamed from: l */
    public VText f52803l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f52804m;

    /* JADX INFO: renamed from: n */
    public VText f52805n;

    /* JADX INFO: renamed from: o */
    public VText f52806o;

    /* JADX INFO: renamed from: p */
    public AnimEffectPlayer f52807p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f52808q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f52809r;

    /* JADX INFO: renamed from: s */
    public GiftTrayData f52810s;

    /* JADX INFO: renamed from: t */
    public Integer f52811t;

    /* JADX INFO: renamed from: u */
    public TrayStatus f52812u;

    /* JADX INFO: renamed from: v */
    public ObjectAnimator f52813v;

    /* JADX INFO: renamed from: w */
    public AnimatorSet f52814w;

    /* JADX INFO: renamed from: x */
    public ObjectAnimator f52815x;

    /* JADX INFO: renamed from: y */
    public ValueAnimator f52816y;

    /* JADX INFO: renamed from: z */
    public y20<GiftTrayData> f52817z;

    public enum TrayStatus {
        empty,
        show,
        combo,
        pending,
        dismissing
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$a */
    public class C13087a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ObjectAnimator f52818a;

        public C13087a(ObjectAnimator objectAnimator) {
            this.f52818a = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f52818a.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView.this.m77653E0();
            LiveGiftTrayView.this.f52790A = false;
            if (LiveGiftTrayView.this.f52817z != null) {
                LiveGiftTrayView.this.f52817z.call(LiveGiftTrayView.this.f52810s);
                LiveGiftTrayView.this.f52817z = null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveGiftTrayView.this.m77654G0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$b */
    public class C13088b extends AnimatorListenerAdapter {
        public C13088b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView.this.m77653E0();
            LiveGiftTrayView.this.f52790A = false;
            if (LiveGiftTrayView.this.f52817z != null) {
                LiveGiftTrayView.this.f52817z.call(LiveGiftTrayView.this.f52810s);
                LiveGiftTrayView.this.f52817z = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveGiftTrayView.this.m77654G0();
            muj.m160160C(LiveGiftTrayView.this.f52810s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$c */
    public class C13089c extends AnimatorListenerAdapter {
        public C13089c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView.this.m77661S0();
            muj.m160159B(LiveGiftTrayView.this.f52810s, LiveGiftTrayView.this.f52811t.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$d */
    public class C13090d implements Animator.AnimatorListener {
        public C13090d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LiveGiftTrayView.this.f52813v.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView liveGiftTrayView = LiveGiftTrayView.this;
            liveGiftTrayView.m77697g1(liveGiftTrayView.f52810s);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (LiveGiftTrayView.this.f52810s.f50936R == null || TextUtils.isEmpty(LiveGiftTrayView.this.f52810s.f50936R.svg)) {
                boolean zM77839u = TrayBackground.m77839u(LiveGiftTrayView.this.f52810s.f50946d);
                LiveGiftTrayView liveGiftTrayView = LiveGiftTrayView.this;
                if (zM77839u) {
                    liveGiftTrayView.f52796e.m77843w();
                    bnl0.m105525M0(LiveGiftTrayView.this.f52807p, true);
                    if (LiveGiftTrayView.this.f52810s.f50946d == 300 && !i9n.m139127b()) {
                        LiveGiftTrayView.this.f52807p.m69683j("https://auto.tancdn.com/v1/raw/e9fdcb78-6e0b-4ab8-b94c-05227d3b49fd10.so", 1);
                    }
                } else {
                    bnl0.m105524M(liveGiftTrayView.f52796e.f52945c, false);
                }
            } else {
                LiveGiftTrayView liveGiftTrayView2 = LiveGiftTrayView.this;
                liveGiftTrayView2.f52796e.m77844z(liveGiftTrayView2.f52810s.f50936R.svg);
            }
            if (LiveGiftTrayView.this.f52816y != null) {
                LiveGiftTrayView.this.f52816y.start();
            }
            LiveGiftTrayView.this.m77660R0(true, 400);
            muj.m160161D(LiveGiftTrayView.this.f52810s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$e */
    public class C13091e extends AnimatorListenerAdapter {
        public C13091e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (LiveGiftTrayView.this.f52794E == null || LiveGiftTrayView.this.f52810s == null) {
                return;
            }
            LiveGiftTrayView liveGiftTrayView = LiveGiftTrayView.this;
            if (liveGiftTrayView.f52801j == null || TextUtils.isEmpty(liveGiftTrayView.f52810s.f50921C)) {
                return;
            }
            int[] iArr = new int[2];
            LiveGiftTrayView.this.f52801j.getLocationOnScreen(iArr);
            iArr[0] = iArr[0] + (LiveGiftTrayView.this.f52801j.getWidth() / 2);
            iArr[1] = iArr[1] + (LiveGiftTrayView.this.f52801j.getHeight() / 2);
            BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfigNew_ = LiveGiftTrayView.this.f52810s.m75344e().flyMicInfo;
            if (bLiveIntlFlyMicEffectConfigNew_ == null) {
                bLiveIntlFlyMicEffectConfigNew_ = BLiveIntlFlyMicEffectConfig.new_();
            }
            bLiveIntlFlyMicEffectConfigNew_.f45238id = LiveGiftTrayView.this.f52810s.f50947e;
            bLiveIntlFlyMicEffectConfigNew_.startPosition = iArr;
            if (TextUtils.isEmpty(bLiveIntlFlyMicEffectConfigNew_.receiveUserId)) {
                bLiveIntlFlyMicEffectConfigNew_.receiveUserId = LiveGiftTrayView.this.f52810s.f50921C;
            }
            LiveGiftTrayView.this.f52794E.call(bLiveIntlFlyMicEffectConfigNew_);
        }
    }

    public LiveGiftTrayView(Context context) {
        super(context);
        this.f52812u = TrayStatus.empty;
        this.f52790A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public void m77653E0() {
        bnl0.m105525M0(this.f52795d, false);
        this.f52812u = TrayStatus.empty;
        ValueAnimator valueAnimator = this.f52816y;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public void m77654G0() {
        this.f52812u = TrayStatus.dismissing;
        if (TrayBackground.m77839u(this.f52810s.f50946d)) {
            this.f52796e.m77840B();
        }
        m77696f1();
    }

    /* JADX INFO: renamed from: H0 */
    private void m77655H0(y20 y20Var) {
        this.f52817z = y20Var;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -getWidth(), qa00.m175859d(36.0f), 0.0f);
        this.f52813v = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(600L).setInterpolator(new OvershootInterpolator());
        this.f52813v.removeAllListeners();
        this.f52813v.addListener(new C13090d());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -qa00.m175859d(3.0f), 0.0f, qa00.m175859d(3.0f), 0.0f);
        this.f52816y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1400L).setRepeatCount(-1);
        this.f52816y.setInterpolator(new LinearInterpolator());
        this.f52816y.setStartDelay(300L);
        this.f52816y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cms
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f82640a.m77656L0(valueAnimator);
            }
        });
        gt0.m132177w(this.f52816y, new Runnable() { // from class: l.dms
            @Override // java.lang.Runnable
            public final void run() {
                this.f89726a.m77657N0();
            }
        }, new Runnable() { // from class: l.ems
            @Override // java.lang.Runnable
            public final void run() {
                this.f94690a.m77658O0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m77656L0(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.f52801j.setTranslationY(f.floatValue());
        if (this.f52810s.m75344e().isNamed) {
            this.f52802k.setTranslationY(f.floatValue());
            this.f52803l.setTranslationY(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m77657N0() {
        this.f52801j.setTranslationY(0.0f);
        if (this.f52810s.m75344e().isNamed) {
            this.f52802k.setTranslationY(0.0f);
            this.f52803l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m77658O0() {
        this.f52801j.setTranslationY(0.0f);
        if (this.f52810s.m75344e().isNamed) {
            this.f52802k.setTranslationY(0.0f);
            this.f52803l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private void m77659Q0(boolean z) {
        m77660R0(z, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public void m77660R0(boolean z, int i) {
        this.f52812u = TrayStatus.combo;
        if (!z) {
            this.f52811t = this.f52810s.m75340C();
        }
        this.f52806o.setText(this.f52811t + "  ");
        AnimatorSet animatorSet = this.f52814w;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (this.f52814w == null) {
            this.f52814w = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f52804m, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            this.f52814w.play(gt0.m132166l(this.f52804m, gt0.f106354i, 0L, 140L, new LinearInterpolator(), 3.0f, 0.7f)).with(gt0.m132166l(this.f52804m, gt0.f106354i, 140L, 160L, new LinearInterpolator(), 0.7f, 1.0f)).with(objectAnimatorOfFloat);
            if (this.f52794E != null) {
                setIntlFlyMicListener(objectAnimatorOfFloat);
            }
        }
        this.f52814w.addListener(new C13089c());
        this.f52814w.setStartDelay(i);
        this.f52814w.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m77661S0() {
        if (this.f52790A) {
            m77663V0();
        } else if (m77693Z0() && this.f52812u != TrayStatus.dismissing) {
            m77659Q0(false);
        } else {
            this.f52812u = TrayStatus.pending;
            m77662T0();
        }
    }

    /* JADX INFO: renamed from: T0 */
    private void m77662T0() {
        it0.m142007A(this.f52815x);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LiveGiftTrayView, Float>) View.TRANSLATION_X, 0.0f, -getWidth());
        this.f52815x = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        this.f52815x.setStartDelay(this.f52810s.f50951i);
        this.f52815x.addListener(new C13088b());
        this.f52815x.start();
    }

    /* JADX INFO: renamed from: V0 */
    private void m77663V0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, -getWidth());
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new C13087a(objectAnimatorOfFloat));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d1 */
    private void m77664d1() {
        final nsv nsvVarM164641e;
        GiftTrayData giftTrayData = this.f52810s;
        if (giftTrayData.f50927I) {
            nsv nsvVarM164636f = nsv.m164636f(giftTrayData);
            GiftTrayData giftTrayData2 = this.f52810s;
            nsvVarM164641e = nsvVarM164636f.m164639c(giftTrayData2.f50920B, giftTrayData2.f50928J, true);
        } else {
            nsvVarM164641e = nsv.m164636f(giftTrayData).m164641e(this.f52810s.f50928J);
        }
        biv.m104518c(this.f52797f, qa00.f156288A, nsvVarM164641e, new qcj() { // from class: l.fms
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((GiftTrayData) nsvVarM164641e.f143542a).f50968z;
            }
        }, 1);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    private void m77675r() {
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray;
        m77664d1();
        LiveGradientTextView liveGradientTextView = this.f52799h;
        String str = this.f52810s.f50919A;
        int iM161277a = n3d0.m161277a(n9c0.f140823e1);
        BLiveUserMask bLiveUserMask = this.f52810s.f50928J;
        und0.m196834b(liveGradientTextView, str, iM161277a, bLiveUserMask != null ? bLiveUserMask.userNameGradientColors : null);
        this.f52800i.setText(this.f52810s.f50964v);
        VDraweeView vDraweeView = this.f52801j;
        String str2 = this.f52810s.f50965w;
        int i = qa00.f156289B;
        izs.m142869t("context_livingAct", vDraweeView, str2, i);
        this.f52806o.setText(this.f52811t + "  ");
        GiftTrayData giftTrayData = this.f52810s;
        int i2 = giftTrayData.f50946d;
        if (i2 == 1) {
            this.f52796e.m77842v(TrayBackground.Type.first, giftTrayData.f50926H);
        } else if (i2 == 100) {
            this.f52796e.m77842v(TrayBackground.Type.second, giftTrayData.f50926H);
        } else if (i2 == 200) {
            this.f52796e.m77842v(TrayBackground.Type.third, giftTrayData.f50926H);
        } else if (i2 == 300) {
            this.f52796e.m77842v(TrayBackground.Type.fourth, giftTrayData.f50926H);
        }
        GiftTrayData giftTrayData2 = this.f52810s;
        if (giftTrayData2 == null || (bLiveGivenGiftBriefTray = giftTrayData2.f50936R) == null || TextUtils.isEmpty(bLiveGivenGiftBriefTray.background)) {
            bnl0.m105524M(this.f52796e.f52944b, false);
            bnl0.m105524M(this.f52796e.f52943a, true);
        } else {
            this.f52796e.setBackgroundImg(this.f52810s.f50936R.background);
        }
        bnl0.m105524M(this.f52802k, this.f52810s.m75344e().isNamed);
        bnl0.m105524M(this.f52803l, this.f52810s.m75344e().isNamed);
        if (bnl0.m105529O0(this.f52803l)) {
            this.f52803l.getPaint().setFakeBoldText(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f52810s.f50939U);
        VDraweeView vDraweeView2 = this.f52798g;
        if (zIsEmpty) {
            bnl0.m105524M(vDraweeView2, false);
        } else {
            bnl0.m105524M(vDraweeView2, true);
            izs.m142870u("context_livingAct", this.f52798g, this.f52810s.f50939U, i, qa00.f156323j);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f52810s.f50940V);
        VDraweeView vDraweeView3 = this.f52809r;
        if (zIsEmpty2) {
            bnl0.m105524M(vDraweeView3, false);
        } else {
            bnl0.m105524M(vDraweeView3, true);
            izs.m142868s("context_livingAct", this.f52809r, this.f52810s.f50940V);
        }
    }

    private void setIntlFlyMicListener(ObjectAnimator objectAnimator) {
        objectAnimator.removeAllListeners();
        objectAnimator.addListener(new C13091e());
    }

    /* JADX INFO: renamed from: B0 */
    public final void m77684B0(View view) {
        gms.m130829a(this, view);
    }

    /* JADX INFO: renamed from: D0 */
    public void m77685D0(GiftTrayData giftTrayData) {
        if (this.f52790A || this.f52812u != TrayStatus.pending) {
            this.f52810s.m75342c(Integer.valueOf(giftTrayData.f50953k));
            return;
        }
        this.f52812u = TrayStatus.combo;
        it0.m142007A(this.f52815x);
        this.f52810s.m75342c(Integer.valueOf(giftTrayData.f50953k));
        m77659Q0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public void m77686I0() {
        this.f52790A = true;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m77687J0(@NonNull String str) {
        if (!m77688K0()) {
            return false;
        }
        GiftTrayData giftTrayData = this.f52810s;
        return giftTrayData.f50959q && str.equals(giftTrayData.f50967y);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m77688K0() {
        return this.f52812u != TrayStatus.empty;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m77689P0(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (this.f52791B == null || TextUtils.isEmpty(intlLuckyGiftTray.getDiamond())) {
            return;
        }
        int[] iArr = new int[2];
        this.f52795d.getLocationOnScreen(iArr);
        this.f52791B.call(new C12999e.b(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray.getDiamond(), iArr[1], true));
    }

    /* JADX INFO: renamed from: U0 */
    public void m77690U0() {
        ObjectAnimator objectAnimator = this.f52815x;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f52815x.cancel();
        }
        m77663V0();
    }

    /* JADX INFO: renamed from: X0 */
    public void m77691X0(final LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        izs.m142868s("context_livingAct", this.f52808q, intlLuckyGiftTray.getReward());
        bnl0.m105524M(this.f52808q, true);
        it0.m142009C(this.f52792C);
        it0.m142009C(this.f52793D);
        Property property = View.ALPHA;
        Animator animatorM132180z = gt0.m132180z(gt0.m132168n(this.f52808q, property, 0.0f, 1.0f).setDuration(200L), gt0.m132168n(this.f52808q, gt0.f106354i, 0.0f, 1.0f).setDuration(500L));
        this.f52792C = animatorM132180z;
        animatorM132180z.setInterpolator(gt0.f106350e);
        gt0.m132160f(this.f52792C, new Runnable() { // from class: l.bms
            @Override // java.lang.Runnable
            public final void run() {
                this.f77402a.m77689P0(intlLuckyGiftTray);
            }
        });
        Animator animatorM132180z2 = gt0.m132180z(gt0.m132168n(this.f52808q, property, 1.0f, 0.0f).setDuration(200L));
        this.f52793D = animatorM132180z2;
        animatorM132180z2.setStartDelay(2000L);
        this.f52793D.start();
        this.f52792C.start();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m77692Y0() {
        muj.m160209m0(this.f52810s);
        this.f52812u = TrayStatus.show;
        bnl0.m105525M0(this.f52795d, this.f52810s.f50958p);
        this.f52813v.start();
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m77693Z0() {
        return !this.f52810s.m75350t();
    }

    /* JADX INFO: renamed from: a1 */
    public void m77694a1(GiftTrayData giftTrayData, y20<GiftTrayData> y20Var) {
        this.f52810s = giftTrayData;
        this.f52811t = giftTrayData.m75340C();
        m77675r();
        m77655H0(y20Var);
    }

    /* JADX INFO: renamed from: e1 */
    public void m77695e1() {
        GiftTrayData giftTrayData = this.f52810s;
        if (giftTrayData != null) {
            giftTrayData.m75343d();
        }
        m77653E0();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m77696f1() {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray;
        bnl0.m105525M0(this.f52808q, false);
        it0.m142009C(this.f52793D);
        it0.m142009C(this.f52792C);
        GiftTrayData giftTrayData = this.f52810s;
        if (giftTrayData == null || (intlLuckyGiftTray = giftTrayData.f50942X) == null || this.f52791B == null || TextUtils.isEmpty(intlLuckyGiftTray.getDiamond())) {
            return;
        }
        this.f52791B.call(new C12999e.b(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray.getDiamond(), 0.0f, false));
    }

    /* JADX INFO: renamed from: g1 */
    public final void m77697g1(GiftTrayData giftTrayData) {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray;
        if (giftTrayData == null || (intlLuckyGiftTray = giftTrayData.f50942X) == null || TextUtils.isEmpty(intlLuckyGiftTray.getReward())) {
            return;
        }
        m77691X0(intlLuckyGiftTray);
    }

    public String getPlayingComboId() {
        GiftTrayData giftTrayData = this.f52810s;
        if (giftTrayData == null || this.f52812u == TrayStatus.empty) {
            return null;
        }
        return giftTrayData.f50956n;
    }

    public GiftTrayData.GiftPriority getPlayingGiftPriority() {
        GiftTrayData giftTrayData = this.f52810s;
        if (giftTrayData == null) {
            return null;
        }
        return giftTrayData.m75345i();
    }

    public String getUserId() {
        return this.f52810s.f50920B;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77684B0(this);
        VText vText = this.f52805n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f52806o.setTypeface(typeface);
    }

    public void setComboPlayCallBack(y20<BLiveIntlFlyMicEffectConfig> y20Var) {
        this.f52794E = y20Var;
    }

    public void setRewardPlayAction(y20<C12999e.b> y20Var) {
        this.f52791B = y20Var;
    }

    public LiveGiftTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52812u = TrayStatus.empty;
        this.f52790A = false;
    }

    public LiveGiftTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52812u = TrayStatus.empty;
        this.f52790A = false;
    }
}
