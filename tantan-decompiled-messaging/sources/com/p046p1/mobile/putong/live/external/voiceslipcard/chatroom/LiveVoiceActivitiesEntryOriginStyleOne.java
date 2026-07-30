package com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VLinear;
import p147v.VMarqueeText;
import p149l.fpn0;
import p149l.g0v;
import p149l.i7n;
import p149l.iyu;
import p149l.jyu;
import p149l.kyu;
import p149l.lyu;
import p149l.oyu;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesEntryOriginStyleOne extends VLinear implements g0v {

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f46463c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f46464d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne$a */
    public class C12597a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46465a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46466b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f46467c;

        public C12597a(boolean z, int i, int i2) {
            this.f46465a = z;
            this.f46466b = i;
            this.f46467c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleOne.this.m71036e0(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryOriginStyleOne liveVoiceActivitiesEntryOriginStyleOne = LiveVoiceActivitiesEntryOriginStyleOne.this;
            liveVoiceActivitiesEntryOriginStyleOne.m71034c0(liveVoiceActivitiesEntryOriginStyleOne.mo71040K(this.f46465a), LiveVoiceActivitiesEntryOriginStyleOne.this.mo71046u(this.f46465a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleOne.this.m71036e0(-this.f46466b, -this.f46467c, 0.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryOriginStyleOne.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne$b */
    public class C12598b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46469a;

        public C12598b(boolean z) {
            this.f46469a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleOne.this.m71036e0(0.0f, 0.0f, 1.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryOriginStyleOne.this, false);
            LiveVoiceActivitiesEntryOriginStyleOne liveVoiceActivitiesEntryOriginStyleOne = LiveVoiceActivitiesEntryOriginStyleOne.this;
            liveVoiceActivitiesEntryOriginStyleOne.m71034c0(liveVoiceActivitiesEntryOriginStyleOne.mo71040K(this.f46469a), LiveVoiceActivitiesEntryOriginStyleOne.this.mo71046u(this.f46469a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public LiveVoiceActivitiesEntryOriginStyleOne(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m71032Z(g0v g0vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m71034c0((int) (g0vVar.mo71040K(z) + ((mo71040K(z) - g0vVar.mo71040K(z)) * animatedFraction)), (int) (g0vVar.mo71046u(z) + ((mo71046u(z) - g0vVar.mo71046u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m71036e0((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m71033a0(boolean z, g0v g0vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        m71034c0((int) (mo71040K(z) + ((g0vVar.mo71040K(z) - mo71040K(z)) * animatedFraction)), (int) (mo71046u(z) + ((g0vVar.mo71046u(z) - mo71046u(z)) * animatedFraction)));
        m71036e0((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - fMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m71034c0(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m71035d0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m71036e0(float f, float f2, float f3) {
        this.f46463c.setTranslationX(f);
        this.f46463c.setTranslationY(f2);
        this.f46463c.setAlpha(f3);
        this.f46464d.setTranslationX(f);
        this.f46464d.setTranslationY(f2);
        this.f46464d.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f46464d.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        xdl0.m208344M(this.f46464d, z);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: C */
    public Animator mo71037C(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.myu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f136328a.m71033a0(z, g0vVar, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12598b(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: E */
    public Animator mo71038E(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.nyu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f141157a.m71032Z(g0vVar, z, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12597a(z, iMo71040K, iMo71046u));
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: F */
    public void mo71039F() {
        m124010w(getWidth(), t100.m186890d(52.0f), new jyu(this), new kyu(this), new lyu(this));
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: K */
    public int mo71040K(boolean z) {
        return t100.m186890d(z ? 52.0f : 137.0f);
    }

    /* JADX INFO: renamed from: X */
    public final void m71041X(View view) {
        oyu.m166699a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public void m71042Y(boolean z) {
        this.f46464d.setTextColor(fpn0.m122612b(z).mo108471k());
    }

    /* JADX INFO: renamed from: b0 */
    public void m71043b0(iyu iyuVar) {
        if (!this.f46463c.isAnimating()) {
            boolean zM134916b = i7n.m134916b();
            AnimEffectPlayer animEffectPlayer = this.f46463c;
            if (zM134916b) {
                animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", 1);
            } else {
                animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", -1);
            }
        }
        this.f46464d.setText(iyuVar.m139013b());
    }

    /* JADX INFO: renamed from: f0 */
    public void m71044f0() {
        AnimEffectPlayer animEffectPlayer = this.f46463c;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f46463c.m68505o();
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: j */
    public void mo71045j() {
        m124009l(t100.m186890d(137.0f), getWidth(), new jyu(this), new kyu(this), new lyu(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71044f0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71041X(this);
        m71042Y(false);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: u */
    public int mo71046u(boolean z) {
        return t100.m186890d(52.0f);
    }
}
