package com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VLinear;
import p151v.VMarqueeText;
import p153l.bnl0;
import p153l.h2v;
import p153l.i9n;
import p153l.j0v;
import p153l.jyn0;
import p153l.k0v;
import p153l.l0v;
import p153l.m0v;
import p153l.p0v;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesEntryOriginStyleOne extends VLinear implements h2v {

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f47311c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f47312d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne$a */
    public class C12760a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f47314b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f47315c;

        public C12760a(boolean z, int i, int i2) {
            this.f47313a = z;
            this.f47314b = i;
            this.f47315c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleOne.this.m72219e0(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryOriginStyleOne liveVoiceActivitiesEntryOriginStyleOne = LiveVoiceActivitiesEntryOriginStyleOne.this;
            liveVoiceActivitiesEntryOriginStyleOne.m72217c0(liveVoiceActivitiesEntryOriginStyleOne.mo72223K(this.f47313a), LiveVoiceActivitiesEntryOriginStyleOne.this.mo72229u(this.f47313a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleOne.this.m72219e0(-this.f47314b, -this.f47315c, 0.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryOriginStyleOne.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryOriginStyleOne$b */
    public class C12761b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47317a;

        public C12761b(boolean z) {
            this.f47317a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryOriginStyleOne.this.m72219e0(0.0f, 0.0f, 1.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryOriginStyleOne.this, false);
            LiveVoiceActivitiesEntryOriginStyleOne liveVoiceActivitiesEntryOriginStyleOne = LiveVoiceActivitiesEntryOriginStyleOne.this;
            liveVoiceActivitiesEntryOriginStyleOne.m72217c0(liveVoiceActivitiesEntryOriginStyleOne.mo72223K(this.f47317a), LiveVoiceActivitiesEntryOriginStyleOne.this.mo72229u(this.f47317a));
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
    public /* synthetic */ void m72215Z(h2v h2vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m72217c0((int) (h2vVar.mo72223K(z) + ((mo72223K(z) - h2vVar.mo72223K(z)) * animatedFraction)), (int) (h2vVar.mo72229u(z) + ((mo72229u(z) - h2vVar.mo72229u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m72219e0((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m72216a0(boolean z, h2v h2vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        m72217c0((int) (mo72223K(z) + ((h2vVar.mo72223K(z) - mo72223K(z)) * animatedFraction)), (int) (mo72229u(z) + ((h2vVar.mo72229u(z) - mo72229u(z)) * animatedFraction)));
        m72219e0((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - fMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m72217c0(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m72218d0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m72219e0(float f, float f2, float f3) {
        this.f47311c.setTranslationX(f);
        this.f47311c.setTranslationY(f2);
        this.f47311c.setAlpha(f3);
        this.f47312d.setTranslationX(f);
        this.f47312d.setTranslationY(f2);
        this.f47312d.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f47312d.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        bnl0.m105524M(this.f47312d, z);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: C */
    public Animator mo72220C(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.n0v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f139672a.m72216a0(z, h2vVar, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12761b(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: E */
    public Animator mo72221E(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.o0v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f144578a.m72215Z(h2vVar, z, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12760a(z, iMo72223K, iMo72229u));
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: F */
    public void mo72222F() {
        m133409w(getWidth(), qa00.m175859d(52.0f), new k0v(this), new l0v(this), new m0v(this));
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: K */
    public int mo72223K(boolean z) {
        return qa00.m175859d(z ? 52.0f : 137.0f);
    }

    /* JADX INFO: renamed from: X */
    public final void m72224X(View view) {
        p0v.m170183a(this, view);
    }

    /* JADX INFO: renamed from: Y */
    public void m72225Y(boolean z) {
        this.f47312d.setTextColor(jyn0.m147605b(z).mo187681k());
    }

    /* JADX INFO: renamed from: b0 */
    public void m72226b0(j0v j0vVar) {
        if (!this.f47311c.isAnimating()) {
            boolean zM139127b = i9n.m139127b();
            AnimEffectPlayer animEffectPlayer = this.f47311c;
            if (zM139127b) {
                animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", 1);
            } else {
                animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/55d751d5-dfab-4d68-aaaa-ca5328e4b2c411.pdf", -1);
            }
        }
        this.f47312d.setText(j0vVar.m143028b());
    }

    /* JADX INFO: renamed from: f0 */
    public void m72227f0() {
        AnimEffectPlayer animEffectPlayer = this.f47311c;
        if (animEffectPlayer == null || !animEffectPlayer.isAnimating()) {
            return;
        }
        this.f47311c.m69688o();
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: j */
    public void mo72228j() {
        m133408l(qa00.m175859d(137.0f), getWidth(), new k0v(this), new l0v(this), new m0v(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72227f0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72224X(this);
        m72225Y(false);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: u */
    public int mo72229u(boolean z) {
        return qa00.m175859d(52.0f);
    }
}
