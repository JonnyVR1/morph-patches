package com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VMarqueeText;
import p147v.VRelative;
import p149l.fpn0;
import p149l.g0v;
import p149l.i7n;
import p149l.iyu;
import p149l.pyu;
import p149l.qyu;
import p149l.ryu;
import p149l.t100;
import p149l.uyu;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceActivitiesEntryOriginStyleTwo extends VRelative implements g0v {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f46471d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f46472e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f46473f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo$a */
    public class C12599a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46474a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46475b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f46476c;

        public C12599a(boolean z, int i, int i2) {
            this.f46474a = z;
            this.f46475b = i;
            this.f46476c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleTwo.this.m71061V(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryOriginStyleTwo liveVoiceActivitiesEntryOriginStyleTwo = LiveVoiceActivitiesEntryOriginStyleTwo.this;
            liveVoiceActivitiesEntryOriginStyleTwo.m71059S(liveVoiceActivitiesEntryOriginStyleTwo.mo71040K(this.f46474a), LiveVoiceActivitiesEntryOriginStyleTwo.this.mo71046u(this.f46474a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleTwo.this.m71061V(-this.f46475b, -this.f46476c, 0.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryOriginStyleTwo.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo$b */
    public class C12600b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f46478a;

        public C12600b(boolean z) {
            this.f46478a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleTwo.this.m71061V(0.0f, 0.0f, 1.0f);
            xdl0.m208344M(LiveVoiceActivitiesEntryOriginStyleTwo.this, false);
            LiveVoiceActivitiesEntryOriginStyleTwo liveVoiceActivitiesEntryOriginStyleTwo = LiveVoiceActivitiesEntryOriginStyleTwo.this;
            liveVoiceActivitiesEntryOriginStyleTwo.m71059S(liveVoiceActivitiesEntryOriginStyleTwo.mo71040K(this.f46478a), LiveVoiceActivitiesEntryOriginStyleTwo.this.mo71046u(this.f46478a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public LiveVoiceActivitiesEntryOriginStyleTwo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f46472e.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        xdl0.m208344M(this.f46472e, z);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: C */
    public Animator mo71037C(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.syu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f166990a.m71057Q(z, g0vVar, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12600b(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: E */
    public Animator mo71038E(final g0v g0vVar, final boolean z) {
        final int iMo71040K = g0vVar.mo71040K(z) - mo71040K(z);
        final int iMo71046u = g0vVar.mo71046u(z) - mo71046u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tyu
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f172630a.m71056P(g0vVar, z, iMo71040K, iMo71046u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12599a(z, iMo71040K, iMo71046u));
        return valueAnimatorOfFloat;
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: F */
    public void mo71039F() {
        m124010w(getWidth(), t100.m186890d(70.0f), new pyu(this), new qyu(this), new ryu(this));
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: K */
    public int mo71040K(boolean z) {
        return t100.m186890d(z ? 70.0f : 167.0f);
    }

    /* JADX INFO: renamed from: M */
    public final void m71054M(View view) {
        uyu.m196373a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public void m71055O(boolean z) {
        this.f46472e.setTextColor(fpn0.m122612b(z).mo108471k());
        this.f46473f.setTextColor(fpn0.m122612b(z).mo108474n());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m71056P(g0v g0vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m71059S((int) (g0vVar.mo71040K(z) + ((mo71040K(z) - g0vVar.mo71040K(z)) * animatedFraction)), (int) (g0vVar.mo71046u(z) + ((mo71046u(z) - g0vVar.mo71046u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m71061V((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m71057Q(boolean z, g0v g0vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        m71059S((int) (mo71040K(z) + ((g0vVar.mo71040K(z) - mo71040K(z)) * animatedFraction)), (int) (mo71046u(z) + ((g0vVar.mo71046u(z) - mo71046u(z)) * animatedFraction)));
        m71061V((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - fMin);
    }

    /* JADX INFO: renamed from: R */
    public void m71058R(iyu iyuVar) {
        if (!this.f46471d.isAnimating()) {
            boolean zM134916b = i7n.m134916b();
            AnimEffectPlayer animEffectPlayer = this.f46471d;
            if (zM134916b) {
                animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", 1);
            } else {
                animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", -1);
            }
        }
        this.f46472e.setText(iyuVar.m139013b());
        this.f46473f.setText(iyuVar.m139018g());
    }

    /* JADX INFO: renamed from: S */
    public final void m71059S(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: T */
    public final void m71060T(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: V */
    public final void m71061V(float f, float f2, float f3) {
        this.f46471d.setTranslationX(f);
        this.f46471d.setTranslationY(f2);
        this.f46471d.setAlpha(f3);
        this.f46472e.setTranslationX(f);
        this.f46472e.setTranslationY(f2);
        this.f46472e.setAlpha(f3);
        this.f46473f.setTranslationX(f);
        this.f46473f.setTranslationY(f2);
        this.f46473f.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: renamed from: W */
    public void m71062W() {
        AnimEffectPlayer animEffectPlayer = this.f46471d;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f46471d.m68505o();
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: j */
    public void mo71045j() {
        m124009l(t100.m186890d(167.0f), getWidth(), new pyu(this), new qyu(this), new ryu(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71062W();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71054M(this);
        m71055O(false);
    }

    @Override // p149l.g0v
    /* JADX INFO: renamed from: u */
    public int mo71046u(boolean z) {
        return t100.m186890d(70.0f);
    }
}
