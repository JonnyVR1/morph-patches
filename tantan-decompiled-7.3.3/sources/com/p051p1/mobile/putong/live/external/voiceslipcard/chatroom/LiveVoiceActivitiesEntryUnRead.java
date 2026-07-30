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
import p151v.VFrame;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VRelative;
import p153l.bnl0;
import p153l.dhw;
import p153l.e1v;
import p153l.f1v;
import p153l.fo0;
import p153l.g1v;
import p153l.gt0;
import p153l.h2v;
import p153l.izs;
import p153l.j0v;
import p153l.jyb;
import p153l.jyn0;
import p153l.kcg0;
import p153l.l1v;
import p153l.psd0;
import p153l.qa00;
import p153l.ty6;
import p153l.v5v;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceActivitiesEntryUnRead extends VRelative implements h2v {

    /* JADX INFO: renamed from: d */
    public VDraweeView f47342d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f47343e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f47344f;

    /* JADX INFO: renamed from: g */
    public VFrame f47345g;

    /* JADX INFO: renamed from: h */
    public VImage f47346h;

    /* JADX INFO: renamed from: i */
    public final List<String> f47347i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Animator f47348j;

    /* JADX INFO: renamed from: k */
    public kcg0 f47349k;

    /* JADX INFO: renamed from: l */
    public int f47350l;

    /* JADX INFO: renamed from: m */
    public boolean f47351m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead$a */
    public class C12767a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47352a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f47353b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f47354c;

        public C12767a(boolean z, int i, int i2) {
            this.f47352a = z;
            this.f47353b = i;
            this.f47354c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.m72280c0(0.0f, 0.0f, 1.0f);
            LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead = LiveVoiceActivitiesEntryUnRead.this;
            liveVoiceActivitiesEntryUnRead.m72277Z(liveVoiceActivitiesEntryUnRead.mo72223K(this.f47352a), LiveVoiceActivitiesEntryUnRead.this.mo72229u(this.f47352a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.m72280c0(-this.f47353b, -this.f47354c, 0.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryUnRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead$b */
    public class C12768b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47356a;

        public C12768b(boolean z) {
            this.f47356a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.m72280c0(0.0f, 0.0f, 1.0f);
            bnl0.m105524M(LiveVoiceActivitiesEntryUnRead.this, false);
            LiveVoiceActivitiesEntryUnRead liveVoiceActivitiesEntryUnRead = LiveVoiceActivitiesEntryUnRead.this;
            liveVoiceActivitiesEntryUnRead.m72277Z(liveVoiceActivitiesEntryUnRead.mo72223K(this.f47356a), LiveVoiceActivitiesEntryUnRead.this.mo72229u(this.f47356a));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voiceslipcard.chatroom.LiveVoiceActivitiesEntryUnRead$c */
    public class C12769c extends AnimatorListenerAdapter {
        public C12769c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveVoiceActivitiesEntryUnRead.this.f47342d.setAlpha(1.0f);
        }
    }

    public LiveVoiceActivitiesEntryUnRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47347i = new ArrayList();
        this.f47350l = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m72274S(h2v h2vVar, boolean z, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m72277Z((int) (h2vVar.mo72223K(z) + ((mo72223K(z) - h2vVar.mo72223K(z)) * animatedFraction)), (int) (h2vVar.mo72229u(z) + ((mo72229u(z) - h2vVar.mo72229u(z)) * animatedFraction)));
        float f = 1.0f - animatedFraction;
        m72280c0((-i) * f, (-i2) * f, animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m72275T(boolean z, h2v h2vVar, int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        m72277Z((int) (mo72223K(z) + ((h2vVar.mo72223K(z) - mo72223K(z)) * animatedFraction)), (int) (mo72229u(z) + ((h2vVar.mo72229u(z) - mo72229u(z)) * animatedFraction)));
        m72280c0((-i) * animatedFraction, (-i2) * animatedFraction, 1.0f - animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m72276W() {
        if (jyb.m147479J(this.f47347i)) {
            return;
        }
        int size = (this.f47350l + 1) % this.f47347i.size();
        this.f47350l = size;
        izs.m142868s("context_square", this.f47342d, this.f47347i.get(size));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public void m72277Z(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m72278a0(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: b0 */
    private void m72279b0(j0v j0vVar, Act act) {
        if (j0vVar == null) {
            return;
        }
        this.f47347i.addAll(j0vVar.m143029c());
        if (this.f47347i.size() >= 2) {
            m72288X(act);
        } else {
            if (this.f47347i.isEmpty()) {
                return;
            }
            izs.m142868s("context_square", this.f47342d, this.f47347i.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m72280c0(float f, float f2, float f3) {
        this.f47342d.setTranslationX(f);
        this.f47342d.setTranslationY(f2);
        this.f47342d.setAlpha(f3);
        this.f47343e.setTranslationX(f);
        this.f47343e.setTranslationY(f2);
        this.f47343e.setAlpha(f3);
        this.f47344f.setTranslationX(f);
        this.f47344f.setTranslationY(f2);
        this.f47344f.setAlpha(f3);
        this.f47345g.setTranslationX(f);
        this.f47345g.setTranslationY(f2);
        this.f47345g.setAlpha(f3);
        setAlpha(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsAlpha(float f) {
        this.f47343e.setAlpha(f);
        this.f47344f.setAlpha(f);
        this.f47345g.setAlpha(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewsVisibility(boolean z) {
        bnl0.m105524M(this.f47343e, z);
        bnl0.m105524M(this.f47344f, z);
        bnl0.m105524M(this.f47345g, z && !this.f47351m);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: C */
    public Animator mo72220C(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.i1v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f112554a.m72275T(z, h2vVar, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12768b(z));
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: E */
    public Animator mo72221E(final h2v h2vVar, final boolean z) {
        final int iMo72223K = h2vVar.mo72223K(z) - mo72223K(z);
        final int iMo72229u = h2vVar.mo72229u(z) - mo72229u(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h1v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f107484a.m72274S(h2vVar, z, iMo72223K, iMo72229u, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addListener(new C12767a(z, iMo72223K, iMo72229u));
        return valueAnimatorOfFloat;
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: F */
    public void mo72222F() {
        m133409w(getWidth(), qa00.m175859d(70.0f), new e1v(this), new f1v(this), new g1v(this));
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: K */
    public int mo72223K(boolean z) {
        if (z) {
            return qa00.m175859d(70.0f);
        }
        return !this.f47351m ? qa00.m175859d(173.0f) : qa00.m175859d(197.0f);
    }

    /* JADX INFO: renamed from: P */
    public final void m72284P(View view) {
        l1v.m152513a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m72285Q() {
        psd0.m173633z(this.f47349k);
        Animator animator = this.f47348j;
        if (animator != null) {
            animator.cancel();
        }
        this.f47350l = 0;
        this.f47347i.clear();
    }

    /* JADX INFO: renamed from: R */
    public void m72286R(boolean z) {
        this.f47343e.setTextColor(jyn0.m147605b(z).mo187681k());
        this.f47344f.setTextColor(jyn0.m147605b(z).mo187684n());
        this.f47346h.setImageResource(jyn0.m147605b(z).mo187679i());
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m72287V(Long l2) {
        Animator animator = this.f47348j;
        if (animator != null) {
            animator.cancel();
            this.f47348j.start();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m72288X(Act act) {
        if (act == null) {
            return;
        }
        izs.m142868s("context_square", this.f47342d, this.f47347i.get(0));
        if (this.f47348j == null) {
            Animator animatorM132173s = gt0.m132173s(gt0.m132160f(gt0.m132170p(this.f47342d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.j1v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117996a.m72276W();
                }
            }), gt0.m132170p(this.f47342d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132164j(2000));
            this.f47348j = animatorM132173s;
            animatorM132173s.addListener(new C12769c());
        }
        psd0.m173633z(this.f47349k);
        this.f47349k = act.duringCreated(C22421c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.k1v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123543a.m72287V((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m72289Y(j0v j0vVar, v5v v5vVar, boolean z) {
        boolean zM143034h = j0vVar.m143034h();
        this.f47351m = zM143034h;
        bnl0.m105524M(this.f47345g, zM143034h);
        m72278a0(mo72223K(z));
        this.f47343e.setText(j0vVar.m143028b());
        this.f47344f.setText(j0vVar.m143033g());
        if (jyb.m147518l(this.f47347i, j0vVar.m143029c(), new ty6())) {
            return;
        }
        m72285Q();
        m72279b0(j0vVar, v5vVar.act());
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: j */
    public void mo72228j() {
        m133408l(qa00.m175859d(this.f47351m ? 197.0f : 173.0f), getWidth(), new e1v(this), new f1v(this), new g1v(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72285Q();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72284P(this);
        m72286R(false);
    }

    public void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f47345g, onClickListener);
    }

    @Override // p153l.h2v
    /* JADX INFO: renamed from: u */
    public int mo72229u(boolean z) {
        return qa00.m175859d(70.0f);
    }
}
