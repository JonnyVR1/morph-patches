package com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VRelative;
import p153l.bnl0;
import p153l.d1v;
import p153l.dhw;
import p153l.fo0;
import p153l.gt0;
import p153l.h2v;
import p153l.izs;
import p153l.j0v;
import p153l.jyb;
import p153l.jyn0;
import p153l.kcg0;
import p153l.psd0;
import p153l.qa00;
import p153l.ty6;
import p153l.v5v;
import p153l.w0v;
import p153l.x0v;
import p153l.y0v;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesEntryRead extends VRelative implements h2v {

    /* JADX INFO: renamed from: d */
    public VDraweeView f47328d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f47329e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f47330f;

    /* JADX INFO: renamed from: g */
    public final List<String> f47331g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Animator f47332h;

    /* JADX INFO: renamed from: i */
    public kcg0 f47333i;

    /* JADX INFO: renamed from: j */
    public int f47334j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead$a */
    public class C12764a extends AnimatorListenerAdapter {
        public C12764a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.f47328d.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead$b */
    public class C12765b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47336a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f47337b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f47338c;

        public C12765b(boolean z, int i, int i2) {
            this.f47336a = z;
            this.f47337b = i;
            this.f47338c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.m72256c0(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryRead liveVoiceActivitiesEntryRead = LiveVoiceActivitiesEntryRead.this;
            liveVoiceActivitiesEntryRead.m72254Z(liveVoiceActivitiesEntryRead.mo72223K(this.f47336a), LiveVoiceActivitiesEntryRead.this.mo72229u(this.f47336a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.m72256c0(-this.f47337b, -this.f47338c, 0.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryRead$c */
    public class C12766c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47340a;

        public C12766c(boolean z) {
            this.f47340a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryRead.this.m72256c0(0.0f, 0.0f, 1.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryRead.this, false);
            LiveVoiceActivitiesEntryRead liveVoiceActivitiesEntryRead = LiveVoiceActivitiesEntryRead.this;
            liveVoiceActivitiesEntryRead.m72254Z(liveVoiceActivitiesEntryRead.mo72223K(this.f47340a), LiveVoiceActivitiesEntryRead.this.mo72229u(this.f47340a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public LiveVoiceActivitiesEntryRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47331g = new ArrayList();
        this.f47334j = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m72252V(Long l2) {
        Animator animator = this.f47332h;
        if (animator != null) {
            animator.cancel();
            this.f47332h.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m72253W() {
        if (jyb.m147479J(this.f47331g)) {
            return;
        }
        int size = (this.f47334j + 1) % this.f47331g.size();
        this.f47334j = size;
        izs.m142868s("context_square", this.f47328d, this.f47331g.get(size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m72254Z(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m72255a0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m72256c0(float f, float f2, float f3) {
        this.f47328d.setTranslationX(f);
        this.f47328d.setTranslationY(f2);
        this.f47328d.setAlpha(f3);
        this.f47329e.setTranslationX(f);
        this.f47329e.setTranslationY(f2);
        this.f47329e.setAlpha(f3);
        this.f47330f.setTranslationX(f);
        this.f47330f.setTranslationY(f2);
        this.f47330f.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f47329e.setAlpha(f);
        this.f47330f.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        bnl0.m105524M(this.f47329e, z);
        bnl0.m105524M(this.f47330f, z);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: C */
    public Animator mo72220C(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.a1v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f67867a.m72264T(z, h2vVar, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12766c(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: E */
    public Animator mo72221E(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.z0v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f202405a.m72263S(h2vVar, z, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12765b(z, iMo72223K, iMo72229u));
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: F */
    public void mo72222F() {
        m133409w(getWidth(), qa00.m175859d(70.0f), new w0v(this), new x0v(this), new y0v(this));
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: K */
    public int mo72223K(boolean z) {
        return qa00.m175859d(z ? 70.0f : 167.0f);
    }

    /* JADX INFO: renamed from: P */
    public final void m72260P(View view) {
        d1v.m113633a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m72261Q() {
        psd0.m173633z(this.f47333i);
        Animator animator = this.f47332h;
        if (animator != null) {
            animator.cancel();
        }
        this.f47334j = 0;
        this.f47331g.clear();
    }

    /* JADX INFO: renamed from: R */
    public void m72262R(boolean z) {
        this.f47329e.setTextColor(jyn0.m147605b(z).mo187681k());
        this.f47330f.setTextColor(jyn0.m147605b(z).mo187684n());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m72263S(h2v h2vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m72254Z((int) (h2vVar.mo72223K(z) + ((mo72223K(z) - h2vVar.mo72223K(z)) * animatedFraction)), (int) (h2vVar.mo72229u(z) + ((mo72229u(z) - h2vVar.mo72229u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m72256c0((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m72264T(boolean z, h2v h2vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m72254Z((int) (mo72223K(z) + ((h2vVar.mo72223K(z) - mo72223K(z)) * animatedFraction)), (int) (mo72229u(z) + ((h2vVar.mo72229u(z) - mo72229u(z)) * animatedFraction)));
        m72256c0((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - animatedFraction);
    }

    /* JADX INFO: renamed from: X */
    public void m72265X(Act act) {
        psd0.m173633z(this.f47333i);
        if (act == null) {
            return;
        }
        izs.m142868s("context_square", this.f47328d, this.f47331g.get(0));
        if (this.f47332h == null) {
            Animator animatorM132173s = gt0.m132173s(gt0.m132160f(gt0.m132170p(this.f47328d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.b1v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74397a.m72253W();
                }
            }), gt0.m132170p(this.f47328d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132164j(2000));
            this.f47332h = animatorM132173s;
            animatorM132173s.addListener(new C12764a());
        }
        this.f47333i = act.duringCreated(C22421c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.c1v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79437a.m72252V((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m72266Y(j0v j0vVar, v5v v5vVar) {
        this.f47329e.setText(j0vVar.m143028b());
        this.f47330f.setText(j0vVar.m143033g());
        if (jyb.m147518l(this.f47331g, j0vVar.m143029c(), new ty6())) {
            return;
        }
        m72261Q();
        m72267b0(j0vVar, v5vVar.act());
    }

    /* JADX INFO: renamed from: b0 */
    public void m72267b0(j0v j0vVar, Act act) {
        if (j0vVar == null) {
            return;
        }
        this.f47331g.addAll(j0vVar.m143029c());
        if (this.f47331g.size() >= 2) {
            m72265X(act);
        } else {
            if (this.f47331g.isEmpty()) {
                return;
            }
            izs.m142868s("context_square", this.f47328d, this.f47331g.get(0));
        }
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: j */
    public void mo72228j() {
        m133408l(qa00.m175859d(167.0f), getWidth(), new w0v(this), new x0v(this), new y0v(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72261Q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72260P(this);
        m72262R(false);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: u */
    public int mo72229u(boolean z) {
        return qa00.m175859d(70.0f);
    }
}
