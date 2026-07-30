package com.p046p1.mobile.putong.live.livingroom.view;

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
import com.p046p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlFlyMicEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.agv;
import p149l.bt0;
import p149l.dt0;
import p149l.e30;
import p149l.fks;
import p149l.h1c0;
import p149l.hxs;
import p149l.i7n;
import p149l.kvc0;
import p149l.mqv;
import p149l.rfd0;
import p149l.t100;
import p149l.w9j;
import p149l.wrj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveGiftTrayView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public boolean f51942A;

    /* JADX INFO: renamed from: B */
    public e30<C12836e.b> f51943B;

    /* JADX INFO: renamed from: C */
    public Animator f51944C;

    /* JADX INFO: renamed from: D */
    public Animator f51945D;

    /* JADX INFO: renamed from: E */
    public e30<BLiveIntlFlyMicEffectConfig> f51946E;

    /* JADX INFO: renamed from: d */
    public LiveGiftTrayView f51947d;

    /* JADX INFO: renamed from: e */
    public TrayBackground f51948e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f51949f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f51950g;

    /* JADX INFO: renamed from: h */
    public LiveGradientTextView f51951h;

    /* JADX INFO: renamed from: i */
    public VText f51952i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f51953j;

    /* JADX INFO: renamed from: k */
    public VImage f51954k;

    /* JADX INFO: renamed from: l */
    public VText f51955l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f51956m;

    /* JADX INFO: renamed from: n */
    public VText f51957n;

    /* JADX INFO: renamed from: o */
    public VText f51958o;

    /* JADX INFO: renamed from: p */
    public AnimEffectPlayer f51959p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f51960q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f51961r;

    /* JADX INFO: renamed from: s */
    public GiftTrayData f51962s;

    /* JADX INFO: renamed from: t */
    public Integer f51963t;

    /* JADX INFO: renamed from: u */
    public TrayStatus f51964u;

    /* JADX INFO: renamed from: v */
    public ObjectAnimator f51965v;

    /* JADX INFO: renamed from: w */
    public AnimatorSet f51966w;

    /* JADX INFO: renamed from: x */
    public ObjectAnimator f51967x;

    /* JADX INFO: renamed from: y */
    public ValueAnimator f51968y;

    /* JADX INFO: renamed from: z */
    public e30<GiftTrayData> f51969z;

    public enum TrayStatus {
        empty,
        show,
        combo,
        pending,
        dismissing
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$a */
    public class C12924a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ObjectAnimator f51970a;

        public C12924a(ObjectAnimator objectAnimator) {
            this.f51970a = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f51970a.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView.this.m76470E0();
            LiveGiftTrayView.this.f51942A = false;
            if (LiveGiftTrayView.this.f51969z != null) {
                LiveGiftTrayView.this.f51969z.call(LiveGiftTrayView.this.f51962s);
                LiveGiftTrayView.this.f51969z = null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveGiftTrayView.this.m76471G0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$b */
    public class C12925b extends AnimatorListenerAdapter {
        public C12925b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView.this.m76470E0();
            LiveGiftTrayView.this.f51942A = false;
            if (LiveGiftTrayView.this.f51969z != null) {
                LiveGiftTrayView.this.f51969z.call(LiveGiftTrayView.this.f51962s);
                LiveGiftTrayView.this.f51969z = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveGiftTrayView.this.m76471G0();
            wrj.m205196C(LiveGiftTrayView.this.f51962s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$c */
    public class C12926c extends AnimatorListenerAdapter {
        public C12926c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView.this.m76478S0();
            wrj.m205195B(LiveGiftTrayView.this.f51962s, LiveGiftTrayView.this.f51963t.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$d */
    public class C12927d implements Animator.AnimatorListener {
        public C12927d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LiveGiftTrayView.this.f51965v.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveGiftTrayView liveGiftTrayView = LiveGiftTrayView.this;
            liveGiftTrayView.m76514g1(liveGiftTrayView.f51962s);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (LiveGiftTrayView.this.f51962s.f50088R == null || TextUtils.isEmpty(LiveGiftTrayView.this.f51962s.f50088R.svg)) {
                boolean zM76656u = TrayBackground.m76656u(LiveGiftTrayView.this.f51962s.f50098d);
                LiveGiftTrayView liveGiftTrayView = LiveGiftTrayView.this;
                if (zM76656u) {
                    liveGiftTrayView.f51948e.m76660w();
                    xdl0.m208345M0(LiveGiftTrayView.this.f51959p, true);
                    if (LiveGiftTrayView.this.f51962s.f50098d == 300 && !i7n.m134916b()) {
                        LiveGiftTrayView.this.f51959p.m68500j("https://auto.tancdn.com/v1/raw/e9fdcb78-6e0b-4ab8-b94c-05227d3b49fd10.so", 1);
                    }
                } else {
                    xdl0.m208344M(liveGiftTrayView.f51948e.f52097c, false);
                }
            } else {
                LiveGiftTrayView liveGiftTrayView2 = LiveGiftTrayView.this;
                liveGiftTrayView2.f51948e.m76661z(liveGiftTrayView2.f51962s.f50088R.svg);
            }
            if (LiveGiftTrayView.this.f51968y != null) {
                LiveGiftTrayView.this.f51968y.start();
            }
            LiveGiftTrayView.this.m76477R0(true, 400);
            wrj.m205197D(LiveGiftTrayView.this.f51962s);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.LiveGiftTrayView$e */
    public class C12928e extends AnimatorListenerAdapter {
        public C12928e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (LiveGiftTrayView.this.f51946E == null || LiveGiftTrayView.this.f51962s == null) {
                return;
            }
            LiveGiftTrayView liveGiftTrayView = LiveGiftTrayView.this;
            if (liveGiftTrayView.f51953j == null || TextUtils.isEmpty(liveGiftTrayView.f51962s.f50073C)) {
                return;
            }
            int[] iArr = new int[2];
            LiveGiftTrayView.this.f51953j.getLocationOnScreen(iArr);
            iArr[0] = iArr[0] + (LiveGiftTrayView.this.f51953j.getWidth() / 2);
            iArr[1] = iArr[1] + (LiveGiftTrayView.this.f51953j.getHeight() / 2);
            BLiveIntlFlyMicEffectConfig bLiveIntlFlyMicEffectConfigNew_ = LiveGiftTrayView.this.f51962s.m74161e().flyMicInfo;
            if (bLiveIntlFlyMicEffectConfigNew_ == null) {
                bLiveIntlFlyMicEffectConfigNew_ = BLiveIntlFlyMicEffectConfig.new_();
            }
            bLiveIntlFlyMicEffectConfigNew_.f44390id = LiveGiftTrayView.this.f51962s.f50099e;
            bLiveIntlFlyMicEffectConfigNew_.startPosition = iArr;
            if (TextUtils.isEmpty(bLiveIntlFlyMicEffectConfigNew_.receiveUserId)) {
                bLiveIntlFlyMicEffectConfigNew_.receiveUserId = LiveGiftTrayView.this.f51962s.f50073C;
            }
            LiveGiftTrayView.this.f51946E.call(bLiveIntlFlyMicEffectConfigNew_);
        }
    }

    public LiveGiftTrayView(Context context) {
        super(context);
        this.f51964u = TrayStatus.empty;
        this.f51942A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public void m76470E0() {
        xdl0.m208345M0(this.f51947d, false);
        this.f51964u = TrayStatus.empty;
        ValueAnimator valueAnimator = this.f51968y;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public void m76471G0() {
        this.f51964u = TrayStatus.dismissing;
        if (TrayBackground.m76656u(this.f51962s.f50098d)) {
            this.f51948e.m76657B();
        }
        m76513f1();
    }

    /* JADX INFO: renamed from: H0 */
    private void m76472H0(e30 e30Var) {
        this.f51969z = e30Var;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -getWidth(), t100.m186890d(36.0f), 0.0f);
        this.f51965v = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(600L).setInterpolator(new OvershootInterpolator());
        this.f51965v.removeAllListeners();
        this.f51965v.addListener(new C12927d());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -t100.m186890d(3.0f), 0.0f, t100.m186890d(3.0f), 0.0f);
        this.f51968y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1400L).setRepeatCount(-1);
        this.f51968y.setInterpolator(new LinearInterpolator());
        this.f51968y.setStartDelay(300L);
        this.f51968y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bks
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f76137a.m76473L0(valueAnimator);
            }
        });
        bt0.m103750w(this.f51968y, new Runnable() { // from class: l.cks
            @Override // java.lang.Runnable
            public final void run() {
                this.f81349a.m76474N0();
            }
        }, new Runnable() { // from class: l.dks
            @Override // java.lang.Runnable
            public final void run() {
                this.f86702a.m76475O0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m76473L0(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.f51953j.setTranslationY(f.floatValue());
        if (this.f51962s.m74161e().isNamed) {
            this.f51954k.setTranslationY(f.floatValue());
            this.f51955l.setTranslationY(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m76474N0() {
        this.f51953j.setTranslationY(0.0f);
        if (this.f51962s.m74161e().isNamed) {
            this.f51954k.setTranslationY(0.0f);
            this.f51955l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public /* synthetic */ void m76475O0() {
        this.f51953j.setTranslationY(0.0f);
        if (this.f51962s.m74161e().isNamed) {
            this.f51954k.setTranslationY(0.0f);
            this.f51955l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    private void m76476Q0(boolean z) {
        m76477R0(z, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public void m76477R0(boolean z, int i) {
        this.f51964u = TrayStatus.combo;
        if (!z) {
            this.f51963t = this.f51962s.m74157C();
        }
        this.f51958o.setText(this.f51963t + "  ");
        AnimatorSet animatorSet = this.f51966w;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (this.f51966w == null) {
            this.f51966w = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51956m, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            this.f51966w.play(bt0.m103739l(this.f51956m, bt0.f77162i, 0L, 140L, new LinearInterpolator(), 3.0f, 0.7f)).with(bt0.m103739l(this.f51956m, bt0.f77162i, 140L, 160L, new LinearInterpolator(), 0.7f, 1.0f)).with(objectAnimatorOfFloat);
            if (this.f51946E != null) {
                setIntlFlyMicListener(objectAnimatorOfFloat);
            }
        }
        this.f51966w.addListener(new C12926c());
        this.f51966w.setStartDelay(i);
        this.f51966w.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m76478S0() {
        if (this.f51942A) {
            m76480V0();
        } else if (m76510Z0() && this.f51964u != TrayStatus.dismissing) {
            m76476Q0(false);
        } else {
            this.f51964u = TrayStatus.pending;
            m76479T0();
        }
    }

    /* JADX INFO: renamed from: T0 */
    private void m76479T0() {
        dt0.m113501A(this.f51967x);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LiveGiftTrayView, Float>) View.TRANSLATION_X, 0.0f, -getWidth());
        this.f51967x = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        this.f51967x.setStartDelay(this.f51962s.f50103i);
        this.f51967x.addListener(new C12925b());
        this.f51967x.start();
    }

    /* JADX INFO: renamed from: V0 */
    private void m76480V0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, -getWidth());
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new C12924a(objectAnimatorOfFloat));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: d1 */
    private void m76481d1() {
        final mqv mqvVarM156003e;
        GiftTrayData giftTrayData = this.f51962s;
        if (giftTrayData.f50079I) {
            mqv mqvVarM155998f = mqv.m155998f(giftTrayData);
            GiftTrayData giftTrayData2 = this.f51962s;
            mqvVarM156003e = mqvVarM155998f.m156001c(giftTrayData2.f50072B, giftTrayData2.f50080J, true);
        } else {
            mqvVarM156003e = mqv.m155998f(giftTrayData).m156003e(this.f51962s.f50080J);
        }
        agv.m96345c(this.f51949f, t100.f167226A, mqvVarM156003e, new w9j() { // from class: l.eks
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((GiftTrayData) mqvVarM156003e.f135304a).f50120z;
            }
        }, 1);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    private void m76492r() {
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray;
        m76481d1();
        LiveGradientTextView liveGradientTextView = this.f51951h;
        String str = this.f51962s.f50071A;
        int iM147352a = kvc0.m147352a(h1c0.f105362e1);
        BLiveUserMask bLiveUserMask = this.f51962s.f50080J;
        rfd0.m179126b(liveGradientTextView, str, iM147352a, bLiveUserMask != null ? bLiveUserMask.userNameGradientColors : null);
        this.f51952i.setText(this.f51962s.f50116v);
        VDraweeView vDraweeView = this.f51953j;
        String str2 = this.f51962s.f50117w;
        int i = t100.f167227B;
        hxs.m133407t("context_livingAct", vDraweeView, str2, i);
        this.f51958o.setText(this.f51963t + "  ");
        GiftTrayData giftTrayData = this.f51962s;
        int i2 = giftTrayData.f50098d;
        if (i2 == 1) {
            this.f51948e.m76659v(TrayBackground.Type.first, giftTrayData.f50078H);
        } else if (i2 == 100) {
            this.f51948e.m76659v(TrayBackground.Type.second, giftTrayData.f50078H);
        } else if (i2 == 200) {
            this.f51948e.m76659v(TrayBackground.Type.third, giftTrayData.f50078H);
        } else if (i2 == 300) {
            this.f51948e.m76659v(TrayBackground.Type.fourth, giftTrayData.f50078H);
        }
        GiftTrayData giftTrayData2 = this.f51962s;
        if (giftTrayData2 == null || (bLiveGivenGiftBriefTray = giftTrayData2.f50088R) == null || TextUtils.isEmpty(bLiveGivenGiftBriefTray.background)) {
            xdl0.m208344M(this.f51948e.f52096b, false);
            xdl0.m208344M(this.f51948e.f52095a, true);
        } else {
            this.f51948e.setBackgroundImg(this.f51962s.f50088R.background);
        }
        xdl0.m208344M(this.f51954k, this.f51962s.m74161e().isNamed);
        xdl0.m208344M(this.f51955l, this.f51962s.m74161e().isNamed);
        if (xdl0.m208349O0(this.f51955l)) {
            this.f51955l.getPaint().setFakeBoldText(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f51962s.f50091U);
        VDraweeView vDraweeView2 = this.f51950g;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            hxs.m133408u("context_livingAct", this.f51950g, this.f51962s.f50091U, i, t100.f167261j);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f51962s.f50092V);
        VDraweeView vDraweeView3 = this.f51961r;
        if (zIsEmpty2) {
            xdl0.m208344M(vDraweeView3, false);
        } else {
            xdl0.m208344M(vDraweeView3, true);
            hxs.m133406s("context_livingAct", this.f51961r, this.f51962s.f50092V);
        }
    }

    private void setIntlFlyMicListener(ObjectAnimator objectAnimator) {
        objectAnimator.removeAllListeners();
        objectAnimator.addListener(new C12928e());
    }

    /* JADX INFO: renamed from: B0 */
    public final void m76501B0(View view) {
        fks.m121888a(this, view);
    }

    /* JADX INFO: renamed from: D0 */
    public void m76502D0(GiftTrayData giftTrayData) {
        if (this.f51942A || this.f51964u != TrayStatus.pending) {
            this.f51962s.m74159c(Integer.valueOf(giftTrayData.f50105k));
            return;
        }
        this.f51964u = TrayStatus.combo;
        dt0.m113501A(this.f51967x);
        this.f51962s.m74159c(Integer.valueOf(giftTrayData.f50105k));
        m76476Q0(false);
    }

    /* JADX INFO: renamed from: I0 */
    public void m76503I0() {
        this.f51942A = true;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m76504J0(@NonNull String str) {
        if (!m76505K0()) {
            return false;
        }
        GiftTrayData giftTrayData = this.f51962s;
        return giftTrayData.f50111q && str.equals(giftTrayData.f50119y);
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m76505K0() {
        return this.f51964u != TrayStatus.empty;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m76506P0(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (this.f51943B == null || TextUtils.isEmpty(intlLuckyGiftTray.getDiamond())) {
            return;
        }
        int[] iArr = new int[2];
        this.f51947d.getLocationOnScreen(iArr);
        this.f51943B.call(new C12836e.b(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray.getDiamond(), iArr[1], true));
    }

    /* JADX INFO: renamed from: U0 */
    public void m76507U0() {
        ObjectAnimator objectAnimator = this.f51967x;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f51967x.cancel();
        }
        m76480V0();
    }

    /* JADX INFO: renamed from: X0 */
    public void m76508X0(final LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        hxs.m133406s("context_livingAct", this.f51960q, intlLuckyGiftTray.getReward());
        xdl0.m208344M(this.f51960q, true);
        dt0.m113503C(this.f51944C);
        dt0.m113503C(this.f51945D);
        Property property = View.ALPHA;
        Animator animatorM103753z = bt0.m103753z(bt0.m103741n(this.f51960q, property, 0.0f, 1.0f).setDuration(200L), bt0.m103741n(this.f51960q, bt0.f77162i, 0.0f, 1.0f).setDuration(500L));
        this.f51944C = animatorM103753z;
        animatorM103753z.setInterpolator(bt0.f77158e);
        bt0.m103733f(this.f51944C, new Runnable() { // from class: l.aks
            @Override // java.lang.Runnable
            public final void run() {
                this.f70316a.m76506P0(intlLuckyGiftTray);
            }
        });
        Animator animatorM103753z2 = bt0.m103753z(bt0.m103741n(this.f51960q, property, 1.0f, 0.0f).setDuration(200L));
        this.f51945D = animatorM103753z2;
        animatorM103753z2.setStartDelay(2000L);
        this.f51945D.start();
        this.f51944C.start();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m76509Y0() {
        wrj.m205245m0(this.f51962s);
        this.f51964u = TrayStatus.show;
        xdl0.m208345M0(this.f51947d, this.f51962s.f50110p);
        this.f51965v.start();
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m76510Z0() {
        return !this.f51962s.m74167t();
    }

    /* JADX INFO: renamed from: a1 */
    public void m76511a1(GiftTrayData giftTrayData, e30<GiftTrayData> e30Var) {
        this.f51962s = giftTrayData;
        this.f51963t = giftTrayData.m74157C();
        m76492r();
        m76472H0(e30Var);
    }

    /* JADX INFO: renamed from: e1 */
    public void m76512e1() {
        GiftTrayData giftTrayData = this.f51962s;
        if (giftTrayData != null) {
            giftTrayData.m74160d();
        }
        m76470E0();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m76513f1() {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray;
        xdl0.m208345M0(this.f51960q, false);
        dt0.m113503C(this.f51945D);
        dt0.m113503C(this.f51944C);
        GiftTrayData giftTrayData = this.f51962s;
        if (giftTrayData == null || (intlLuckyGiftTray = giftTrayData.f50094X) == null || this.f51943B == null || TextUtils.isEmpty(intlLuckyGiftTray.getDiamond())) {
            return;
        }
        this.f51943B.call(new C12836e.b(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray.getDiamond(), 0.0f, false));
    }

    /* JADX INFO: renamed from: g1 */
    public final void m76514g1(GiftTrayData giftTrayData) {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray;
        if (giftTrayData == null || (intlLuckyGiftTray = giftTrayData.f50094X) == null || TextUtils.isEmpty(intlLuckyGiftTray.getReward())) {
            return;
        }
        m76508X0(intlLuckyGiftTray);
    }

    public String getPlayingComboId() {
        GiftTrayData giftTrayData = this.f51962s;
        if (giftTrayData == null || this.f51964u == TrayStatus.empty) {
            return null;
        }
        return giftTrayData.f50108n;
    }

    public GiftTrayData.GiftPriority getPlayingGiftPriority() {
        GiftTrayData giftTrayData = this.f51962s;
        if (giftTrayData == null) {
            return null;
        }
        return giftTrayData.m74162i();
    }

    public String getUserId() {
        return this.f51962s.f50072B;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76501B0(this);
        VText vText = this.f51957n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f51958o.setTypeface(typeface);
    }

    public void setComboPlayCallBack(e30<BLiveIntlFlyMicEffectConfig> e30Var) {
        this.f51946E = e30Var;
    }

    public void setRewardPlayAction(e30<C12836e.b> e30Var) {
        this.f51943B = e30Var;
    }

    public LiveGiftTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51964u = TrayStatus.empty;
        this.f51942A = false;
    }

    public LiveGiftTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51964u = TrayStatus.empty;
        this.f51942A = false;
    }
}
