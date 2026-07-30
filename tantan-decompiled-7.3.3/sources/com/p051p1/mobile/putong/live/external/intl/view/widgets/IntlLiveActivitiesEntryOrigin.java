package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.ftn;
import p153l.i9n;
import p153l.oun;
import p153l.qa00;
import p153l.tbs;
import p153l.utn;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesEntryOrigin extends VLinear implements ftn {

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f46584c;

    /* JADX INFO: renamed from: d */
    public VText f46585d;

    /* JADX INFO: renamed from: e */
    public Drawable f46586e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryOrigin$a */
    public class C12715a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f46587a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46588b;

        public C12715a(int i, int i2) {
            this.f46587a = i;
            this.f46588b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.f46584c.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin intlLiveActivitiesEntryOrigin = IntlLiveActivitiesEntryOrigin.this;
            intlLiveActivitiesEntryOrigin.setBackground(intlLiveActivitiesEntryOrigin.f46586e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.setBackground(null);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setTranslationX(-this.f46587a);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setTranslationY(-this.f46588b);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setAlpha(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setTranslationX(-this.f46587a);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setTranslationY(-this.f46588b);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setAlpha(0.0f);
            bnl0.m105524M(IntlLiveActivitiesEntryOrigin.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryOrigin$b */
    public class C12716b extends AnimatorListenerAdapter {
        public C12716b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.f46584c.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46584c.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f46585d.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin intlLiveActivitiesEntryOrigin = IntlLiveActivitiesEntryOrigin.this;
            intlLiveActivitiesEntryOrigin.setBackground(intlLiveActivitiesEntryOrigin.f46586e);
            bnl0.m105524M(IntlLiveActivitiesEntryOrigin.this, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.setBackground(null);
        }
    }

    public IntlLiveActivitiesEntryOrigin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: V */
    private void m71445V() {
        if (this.f46586e != null || getBackground() == null) {
            return;
        }
        this.f46586e = getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m71446W(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = (-i) * f;
        this.f46584c.setTranslationX(f2);
        float f3 = (-i2) * f;
        this.f46584c.setTranslationY(f3);
        this.f46585d.setTranslationX(f2);
        this.f46585d.setTranslationY(f3);
        this.f46585d.setAlpha(animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m71447X(ValueAnimator valueAnimator) {
        this.f46584c.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m71448Y(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        float f = (-i) * animatedFraction;
        this.f46584c.setTranslationX(f);
        float f2 = (-i2) * animatedFraction;
        this.f46584c.setTranslationY(f2);
        float f3 = 1.0f - fMin;
        this.f46584c.setAlpha(f3);
        this.f46585d.setTranslationX(f);
        this.f46585d.setTranslationY(f2);
        this.f46585d.setAlpha(f3);
    }

    /* JADX INFO: renamed from: T */
    public final void m71449T(View view) {
        utn.m198066a(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public void m71450Z(boolean z, oun ounVar) {
        if (!z || TextUtils.isEmpty(tbs.f172989b.m203715r3())) {
            this.f46585d.setText(tbs.f172988a.getString(R$string.f45030l));
        } else {
            this.f46585d.setText(tbs.f172989b.m203715r3());
        }
        boolean zM139127b = i9n.m139127b();
        AnimEffectPlayer animEffectPlayer = this.f46584c;
        if (zM139127b) {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/b416fad0-e6ba-491c-8051-182413da4aa511.so", 1);
        } else {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/b416fad0-e6ba-491c-8051-182413da4aa511.so", -1);
        }
        ounVar.m169348D3(BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), z ? 1 : 0);
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: a */
    public int mo71451a() {
        return -90880;
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: d */
    public int mo71452d() {
        return -370374;
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: e */
    public int mo71453e() {
        return getWidth();
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: f */
    public int mo71454f() {
        return getHeight();
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: i */
    public int mo71455i() {
        return qa00.f156323j;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71449T(this);
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: s */
    public Animator mo71456s(ftn ftnVar) {
        m71445V();
        final int iMo71453e = ftnVar.mo71453e() - mo71453e();
        final int iMo71454f = ftnVar.mo71454f() - mo71454f();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.stn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f170592a.m71446W(iMo71453e, iMo71454f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ttn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f176085a.m71447X(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.setDuration(600L);
        valueAnimatorOfFloat2.setStartDelay(200L);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        valueAnimatorOfFloat.addListener(new C12715a(iMo71453e, iMo71454f));
        return animatorSet;
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: v */
    public Animator mo71457v(ftn ftnVar) {
        m71445V();
        final int iMo71453e = ftnVar.mo71453e() - mo71453e();
        final int iMo71454f = ftnVar.mo71454f() - mo71454f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rtn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f164837a.m71448Y(iMo71453e, iMo71454f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12716b());
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }
}
