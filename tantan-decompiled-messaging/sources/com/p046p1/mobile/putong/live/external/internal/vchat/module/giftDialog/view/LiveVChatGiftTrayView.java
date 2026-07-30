package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBriefTray;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.view.TrayBackground;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.agv;
import p149l.bt0;
import p149l.dt0;
import p149l.e30;
import p149l.glu;
import p149l.hxs;
import p149l.i7n;
import p149l.mqv;
import p149l.t100;
import p149l.w9j;
import p149l.wrj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftTrayView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveVChatGiftTrayView f45233d;

    /* JADX INFO: renamed from: e */
    public LiveVChatTrayBackground f45234e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f45235f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f45236g;

    /* JADX INFO: renamed from: h */
    public VText f45237h;

    /* JADX INFO: renamed from: i */
    public VText f45238i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f45239j;

    /* JADX INFO: renamed from: k */
    public VImage f45240k;

    /* JADX INFO: renamed from: l */
    public VText f45241l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f45242m;

    /* JADX INFO: renamed from: n */
    public VText f45243n;

    /* JADX INFO: renamed from: o */
    public VText f45244o;

    /* JADX INFO: renamed from: p */
    public AnimEffectPlayer f45245p;

    /* JADX INFO: renamed from: q */
    public GiftTrayData f45246q;

    /* JADX INFO: renamed from: r */
    public Integer f45247r;

    /* JADX INFO: renamed from: s */
    public TrayStatus f45248s;

    /* JADX INFO: renamed from: t */
    public ObjectAnimator f45249t;

    /* JADX INFO: renamed from: u */
    public AnimatorSet f45250u;

    /* JADX INFO: renamed from: v */
    public ObjectAnimator f45251v;

    /* JADX INFO: renamed from: w */
    public ValueAnimator f45252w;

    /* JADX INFO: renamed from: x */
    public e30<GiftTrayData> f45253x;

    /* JADX INFO: renamed from: y */
    public boolean f45254y;

    public enum TrayStatus {
        empty,
        show,
        combo,
        pending,
        dismissing
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$a */
    public class C12518a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ObjectAnimator f45255a;

        public C12518a(ObjectAnimator objectAnimator) {
            this.f45255a = objectAnimator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f45255a.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVChatGiftTrayView.this.m69555z0();
            LiveVChatGiftTrayView.this.f45254y = false;
            if (LiveVChatGiftTrayView.this.f45253x != null) {
                LiveVChatGiftTrayView.this.f45253x.call(LiveVChatGiftTrayView.this.f45246q);
                LiveVChatGiftTrayView.this.f45253x = null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVChatGiftTrayView.this.m69535B0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$b */
    public class C12519b extends AnimatorListenerAdapter {
        public C12519b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVChatGiftTrayView.this.m69555z0();
            LiveVChatGiftTrayView.this.f45254y = false;
            if (LiveVChatGiftTrayView.this.f45253x != null) {
                LiveVChatGiftTrayView.this.f45253x.call(LiveVChatGiftTrayView.this.f45246q);
                LiveVChatGiftTrayView.this.f45253x = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVChatGiftTrayView.this.m69535B0();
            wrj.m205196C(LiveVChatGiftTrayView.this.f45246q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$c */
    public class C12520c extends AnimatorListenerAdapter {
        public C12520c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVChatGiftTrayView.this.m69545O0();
            wrj.m205195B(LiveVChatGiftTrayView.this.f45246q, LiveVChatGiftTrayView.this.f45247r.intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftTrayView$d */
    public class C12521d implements Animator.AnimatorListener {
        public C12521d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LiveVChatGiftTrayView.this.f45249t.removeAllListeners();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (LiveVChatGiftTrayView.this.f45246q.f50088R == null || TextUtils.isEmpty(LiveVChatGiftTrayView.this.f45246q.f50088R.svg)) {
                boolean zM76656u = TrayBackground.m76656u(LiveVChatGiftTrayView.this.f45246q.f50098d);
                LiveVChatGiftTrayView liveVChatGiftTrayView = LiveVChatGiftTrayView.this;
                if (zM76656u) {
                    liveVChatGiftTrayView.f45234e.m69559v();
                    xdl0.m208345M0(LiveVChatGiftTrayView.this.f45245p, true);
                    if (LiveVChatGiftTrayView.this.f45246q.f50098d == 300 && !i7n.m134916b()) {
                        LiveVChatGiftTrayView.this.f45245p.m68500j("https://auto.tancdn.com/v1/raw/e9fdcb78-6e0b-4ab8-b94c-05227d3b49fd10.so", 1);
                    }
                } else {
                    xdl0.m208344M(liveVChatGiftTrayView.f45234e.f45262c, false);
                }
            } else {
                LiveVChatGiftTrayView liveVChatGiftTrayView2 = LiveVChatGiftTrayView.this;
                liveVChatGiftTrayView2.f45234e.m69560w(liveVChatGiftTrayView2.f45246q.f50088R.svg);
            }
            if (LiveVChatGiftTrayView.this.f45252w != null) {
                LiveVChatGiftTrayView.this.f45252w.start();
            }
            LiveVChatGiftTrayView.this.m69544N0(true, 400);
            wrj.m205197D(LiveVChatGiftTrayView.this.f45246q);
        }
    }

    public LiveVChatGiftTrayView(Context context) {
        super(context);
        this.f45248s = TrayStatus.empty;
        this.f45254y = false;
    }

    /* JADX INFO: renamed from: V0 */
    private void m69518V0() {
        final mqv mqvVarM156003e;
        GiftTrayData giftTrayData = this.f45246q;
        if (giftTrayData.f50079I) {
            mqv mqvVarM155998f = mqv.m155998f(giftTrayData);
            GiftTrayData giftTrayData2 = this.f45246q;
            mqvVarM156003e = mqvVarM155998f.m156001c(giftTrayData2.f50072B, giftTrayData2.f50080J, true);
        } else {
            mqvVarM156003e = mqv.m155998f(giftTrayData).m156003e(this.f45246q.f50080J);
        }
        agv.m96345c(this.f45235f, t100.f167226A, mqvVarM156003e, new w9j() { // from class: l.flu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((GiftTrayData) mqvVarM156003e.f135304a).f50120z;
            }
        }, 1);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: r */
    private void m69529r() {
        BLiveGivenGiftBriefTray bLiveGivenGiftBriefTray;
        m69518V0();
        this.f45237h.setText(this.f45246q.f50071A);
        this.f45238i.setText(this.f45246q.f50116v);
        VDraweeView vDraweeView = this.f45239j;
        String str = this.f45246q.f50117w;
        int i = t100.f167227B;
        hxs.m133407t("context_livingAct", vDraweeView, str, i);
        this.f45244o.setText(this.f45247r + "  ");
        GiftTrayData giftTrayData = this.f45246q;
        int i2 = giftTrayData.f50098d;
        if (i2 == 1) {
            this.f45234e.m69558u(LiveVChatTrayBackground.Type.first, giftTrayData.f50078H);
        } else if (i2 == 100) {
            this.f45234e.m69558u(LiveVChatTrayBackground.Type.second, giftTrayData.f50078H);
        } else if (i2 == 200) {
            this.f45234e.m69558u(LiveVChatTrayBackground.Type.third, giftTrayData.f50078H);
        } else if (i2 == 300) {
            this.f45234e.m69558u(LiveVChatTrayBackground.Type.fourth, giftTrayData.f50078H);
        }
        GiftTrayData giftTrayData2 = this.f45246q;
        if (giftTrayData2 == null || (bLiveGivenGiftBriefTray = giftTrayData2.f50088R) == null || TextUtils.isEmpty(bLiveGivenGiftBriefTray.background)) {
            xdl0.m208344M(this.f45234e.f45261b, false);
            xdl0.m208344M(this.f45234e.f45260a, true);
        } else {
            this.f45234e.setBackgroundImg(this.f45246q.f50088R.background);
        }
        xdl0.m208344M(this.f45240k, this.f45246q.f50114t);
        xdl0.m208344M(this.f45241l, this.f45246q.f50114t);
        if (xdl0.m208349O0(this.f45241l)) {
            this.f45241l.getPaint().setFakeBoldText(true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f45246q.f50091U);
        VDraweeView vDraweeView2 = this.f45236g;
        if (zIsEmpty) {
            xdl0.m208344M(vDraweeView2, false);
        } else {
            xdl0.m208344M(vDraweeView2, true);
            hxs.m133408u("context_livingAct", this.f45236g, this.f45246q.f50091U, i, t100.f167261j);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m69535B0() {
        this.f45248s = TrayStatus.dismissing;
        if (TrayBackground.m76656u(this.f45246q.f50098d)) {
            this.f45234e.m69561z();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m69536D0(e30 e30Var) {
        this.f45253x = e30Var;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", -getWidth(), t100.m186890d(36.0f), 0.0f);
        this.f45249t = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(600L).setInterpolator(new OvershootInterpolator());
        this.f45249t.removeAllListeners();
        this.f45249t.addListener(new C12521d());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -t100.m186890d(3.0f), 0.0f, t100.m186890d(3.0f), 0.0f);
        this.f45252w = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1400L).setRepeatCount(-1);
        this.f45252w.setInterpolator(new LinearInterpolator());
        this.f45252w.setStartDelay(300L);
        this.f45252w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.clu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f81468a.m69540I0(valueAnimator);
            }
        });
        bt0.m103750w(this.f45252w, new Runnable() { // from class: l.dlu
            @Override // java.lang.Runnable
            public final void run() {
                this.f86878a.m69541J0();
            }
        }, new Runnable() { // from class: l.elu
            @Override // java.lang.Runnable
            public final void run() {
                this.f92143a.m69542K0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m69537E0() {
        this.f45254y = true;
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m69538G0(@NonNull String str) {
        if (!m69539H0()) {
            return false;
        }
        GiftTrayData giftTrayData = this.f45246q;
        return giftTrayData.f50111q && str.equals(giftTrayData.f50119y);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m69539H0() {
        return this.f45248s != TrayStatus.empty;
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m69540I0(ValueAnimator valueAnimator) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        this.f45239j.setTranslationY(f.floatValue());
        if (this.f45246q.f50114t) {
            this.f45240k.setTranslationY(f.floatValue());
            this.f45241l.setTranslationY(f.floatValue());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m69541J0() {
        this.f45239j.setTranslationY(0.0f);
        if (this.f45246q.f50114t) {
            this.f45240k.setTranslationY(0.0f);
            this.f45241l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m69542K0() {
        this.f45239j.setTranslationY(0.0f);
        if (this.f45246q.f50114t) {
            this.f45240k.setTranslationY(0.0f);
            this.f45241l.setTranslationY(0.0f);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m69543L0(boolean z) {
        m69544N0(z, 0);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m69544N0(boolean z, int i) {
        this.f45248s = TrayStatus.combo;
        if (!z) {
            this.f45247r = this.f45246q.m74157C();
        }
        this.f45244o.setText(this.f45247r + "  ");
        AnimatorSet animatorSet = this.f45250u;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        if (this.f45250u == null) {
            this.f45250u = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f45242m, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(200L);
            this.f45250u.play(bt0.m103739l(this.f45242m, bt0.f77162i, 0L, 140L, new LinearInterpolator(), 3.0f, 0.7f)).with(bt0.m103739l(this.f45242m, bt0.f77162i, 140L, 160L, new LinearInterpolator(), 0.7f, 1.0f)).with(objectAnimatorOfFloat);
        }
        this.f45250u.addListener(new C12520c());
        this.f45250u.setStartDelay(i);
        this.f45250u.start();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m69545O0() {
        if (this.f45254y) {
            m69548R0();
        } else if (m69550T0() && this.f45248s != TrayStatus.dismissing) {
            m69543L0(false);
        } else {
            this.f45248s = TrayStatus.pending;
            m69546P0();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m69546P0() {
        dt0.m113501A(this.f45251v);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<LiveVChatGiftTrayView, Float>) View.TRANSLATION_X, 0.0f, -getWidth());
        this.f45251v = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        this.f45251v.setStartDelay(this.f45246q.f50103i);
        this.f45251v.addListener(new C12519b());
        this.f45251v.start();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m69547Q0() {
        ObjectAnimator objectAnimator = this.f45251v;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f45251v.cancel();
        }
        m69548R0();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m69548R0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", 0.0f, -getWidth());
        objectAnimatorOfFloat.setDuration(150L).setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new C12518a(objectAnimatorOfFloat));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: S0 */
    public void m69549S0() {
        wrj.m205245m0(this.f45246q);
        this.f45248s = TrayStatus.show;
        xdl0.m208345M0(this.f45233d, this.f45246q.f50110p);
        this.f45249t.start();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m69550T0() {
        return !this.f45246q.m74167t();
    }

    /* JADX INFO: renamed from: U0 */
    public void m69551U0(GiftTrayData giftTrayData, e30<GiftTrayData> e30Var) {
        this.f45246q = giftTrayData;
        this.f45247r = giftTrayData.m74157C();
        m69529r();
        m69536D0(e30Var);
    }

    /* JADX INFO: renamed from: X0 */
    public void m69552X0() {
        GiftTrayData giftTrayData = this.f45246q;
        if (giftTrayData != null) {
            giftTrayData.m74160d();
        }
        m69555z0();
    }

    public String getPlayingComboId() {
        GiftTrayData giftTrayData = this.f45246q;
        if (giftTrayData == null || this.f45248s == TrayStatus.empty) {
            return null;
        }
        return giftTrayData.f50108n;
    }

    public GiftTrayData.GiftPriority getPlayingGiftPriority() {
        GiftTrayData giftTrayData = this.f45246q;
        if (giftTrayData == null) {
            return null;
        }
        return giftTrayData.m74162i();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69553w0(this);
        VText vText = this.f45243n;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f45244o.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m69553w0(View view) {
        glu.m126916a(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public void m69554y0(GiftTrayData giftTrayData) {
        if (this.f45254y || this.f45248s != TrayStatus.pending) {
            this.f45246q.m74159c(Integer.valueOf(giftTrayData.f50105k));
            return;
        }
        this.f45248s = TrayStatus.combo;
        dt0.m113501A(this.f45251v);
        this.f45246q.m74159c(Integer.valueOf(giftTrayData.f50105k));
        m69543L0(false);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m69555z0() {
        xdl0.m208345M0(this.f45233d, false);
        this.f45248s = TrayStatus.empty;
        ValueAnimator valueAnimator = this.f45252w;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    public LiveVChatGiftTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45248s = TrayStatus.empty;
        this.f45254y = false;
    }

    public LiveVChatGiftTrayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45248s = TrayStatus.empty;
        this.f45254y = false;
    }
}
