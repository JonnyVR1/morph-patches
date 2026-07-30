package com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VMarqueeText;
import p151v.VRelative;
import p153l.bnl0;
import p153l.h2v;
import p153l.i9n;
import p153l.j0v;
import p153l.jyn0;
import p153l.q0v;
import p153l.qa00;
import p153l.r0v;
import p153l.s0v;
import p153l.v0v;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesEntryOriginStyleTwo extends VRelative implements h2v {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f47319d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f47320e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f47321f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo$a */
    public class C12762a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f47323b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f47324c;

        public C12762a(boolean z, int i, int i2) {
            this.f47322a = z;
            this.f47323b = i;
            this.f47324c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleTwo.this.m72244V(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryOriginStyleTwo liveVoiceActivitiesEntryOriginStyleTwo = LiveVoiceActivitiesEntryOriginStyleTwo.this;
            liveVoiceActivitiesEntryOriginStyleTwo.m72242S(liveVoiceActivitiesEntryOriginStyleTwo.mo72223K(this.f47322a), LiveVoiceActivitiesEntryOriginStyleTwo.this.mo72229u(this.f47322a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleTwo.this.m72244V(-this.f47323b, -this.f47324c, 0.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryOriginStyleTwo.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleTwo$b */
    public class C12763b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47326a;

        public C12763b(boolean z) {
            this.f47326a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleTwo.this.m72244V(0.0f, 0.0f, 1.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryOriginStyleTwo.this, false);
            LiveVoiceActivitiesEntryOriginStyleTwo liveVoiceActivitiesEntryOriginStyleTwo = LiveVoiceActivitiesEntryOriginStyleTwo.this;
            liveVoiceActivitiesEntryOriginStyleTwo.m72242S(liveVoiceActivitiesEntryOriginStyleTwo.mo72223K(this.f47326a), LiveVoiceActivitiesEntryOriginStyleTwo.this.mo72229u(this.f47326a));
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
        this.f47320e.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        bnl0.m105524M(this.f47320e, z);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: C */
    public Animator mo72220C(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t0v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f171565a.m72240Q(z, h2vVar, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12763b(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: E */
    public Animator mo72221E(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.u0v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f176939a.m72239P(h2vVar, z, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12762a(z, iMo72223K, iMo72229u));
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: F */
    public void mo72222F() {
        m133409w(getWidth(), qa00.m175859d(70.0f), new q0v(this), new r0v(this), new s0v(this));
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: K */
    public int mo72223K(boolean z) {
        return qa00.m175859d(z ? 70.0f : 167.0f);
    }

    /* JADX INFO: renamed from: M */
    public final void m72237M(View view) {
        v0v.m198943a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public void m72238O(boolean z) {
        this.f47320e.setTextColor(jyn0.m147605b(z).mo187681k());
        this.f47321f.setTextColor(jyn0.m147605b(z).mo187684n());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m72239P(h2v h2vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m72242S((int) (h2vVar.mo72223K(z) + ((mo72223K(z) - h2vVar.mo72223K(z)) * animatedFraction)), (int) (h2vVar.mo72229u(z) + ((mo72229u(z) - h2vVar.mo72229u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m72244V((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m72240Q(boolean z, h2v h2vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        m72242S((int) (mo72223K(z) + ((h2vVar.mo72223K(z) - mo72223K(z)) * animatedFraction)), (int) (mo72229u(z) + ((h2vVar.mo72229u(z) - mo72229u(z)) * animatedFraction)));
        m72244V((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - fMin);
    }

    /* JADX INFO: renamed from: R */
    public void m72241R(j0v j0vVar) {
        if (!this.f47319d.isAnimating()) {
            boolean zM139127b = i9n.m139127b();
            AnimEffectPlayer animEffectPlayer = this.f47319d;
            if (zM139127b) {
                animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", 1);
            } else {
                animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", -1);
            }
        }
        this.f47320e.setText(j0vVar.m143028b());
        this.f47321f.setText(j0vVar.m143033g());
    }

    /* JADX INFO: renamed from: S */
    public final void m72242S(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: T */
    public final void m72243T(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: V */
    public final void m72244V(float f, float f2, float f3) {
        this.f47319d.setTranslationX(f);
        this.f47319d.setTranslationY(f2);
        this.f47319d.setAlpha(f3);
        this.f47320e.setTranslationX(f);
        this.f47320e.setTranslationY(f2);
        this.f47320e.setAlpha(f3);
        this.f47321f.setTranslationX(f);
        this.f47321f.setTranslationY(f2);
        this.f47321f.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: renamed from: W */
    public void m72245W() {
        AnimEffectPlayer animEffectPlayer = this.f47319d;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f47319d.m69688o();
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: j */
    public void mo72228j() {
        m133408l(qa00.m175859d(167.0f), getWidth(), new q0v(this), new r0v(this), new s0v(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72245W();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72237M(this);
        m72238O(false);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: u */
    public int mo72229u(boolean z) {
        return qa00.m175859d(70.0f);
    }
}
