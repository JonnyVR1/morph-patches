package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VLinear;
import p147v.VText;
import p149l.frn;
import p149l.i7n;
import p149l.osn;
import p149l.s9s;
import p149l.t100;
import p149l.urn;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesEntryOrigin extends VLinear implements frn {

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f45736c;

    /* JADX INFO: renamed from: d */
    public VText f45737d;

    /* JADX INFO: renamed from: e */
    public Drawable f45738e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryOrigin$a */
    public class C12552a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f45739a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f45740b;

        public C12552a(int i, int i2) {
            this.f45739a = i;
            this.f45740b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.f45736c.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin intlLiveActivitiesEntryOrigin = IntlLiveActivitiesEntryOrigin.this;
            intlLiveActivitiesEntryOrigin.setBackground(intlLiveActivitiesEntryOrigin.f45738e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.setBackground(null);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setTranslationX(-this.f45739a);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setTranslationY(-this.f45740b);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setAlpha(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setTranslationX(-this.f45739a);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setTranslationY(-this.f45740b);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setAlpha(0.0f);
            xdl0.m208344M(IntlLiveActivitiesEntryOrigin.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryOrigin$b */
    public class C12553b extends AnimatorListenerAdapter {
        public C12553b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryOrigin.this.f45736c.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45736c.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryOrigin.this.f45737d.setAlpha(1.0f);
            IntlLiveActivitiesEntryOrigin intlLiveActivitiesEntryOrigin = IntlLiveActivitiesEntryOrigin.this;
            intlLiveActivitiesEntryOrigin.setBackground(intlLiveActivitiesEntryOrigin.f45738e);
            xdl0.m208344M(IntlLiveActivitiesEntryOrigin.this, false);
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
    private void m70262V() {
        if (this.f45738e != null || getBackground() == null) {
            return;
        }
        this.f45738e = getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m70263W(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = (-i) * f;
        this.f45736c.setTranslationX(f2);
        float f3 = (-i2) * f;
        this.f45736c.setTranslationY(f3);
        this.f45737d.setTranslationX(f2);
        this.f45737d.setTranslationY(f3);
        this.f45737d.setAlpha(animatedFraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m70264X(ValueAnimator valueAnimator) {
        this.f45736c.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m70265Y(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        float f = (-i) * animatedFraction;
        this.f45736c.setTranslationX(f);
        float f2 = (-i2) * animatedFraction;
        this.f45736c.setTranslationY(f2);
        float f3 = 1.0f - fMin;
        this.f45736c.setAlpha(f3);
        this.f45737d.setTranslationX(f);
        this.f45737d.setTranslationY(f2);
        this.f45737d.setAlpha(f3);
    }

    /* JADX INFO: renamed from: T */
    public final void m70266T(View view) {
        urn.m195090a(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public void m70267Z(boolean z, osn osnVar) {
        if (!z || TextUtils.isEmpty(s9s.f163228b.m195928r3())) {
            this.f45737d.setText(s9s.f163227a.getString(R$string.f44182l));
        } else {
            this.f45737d.setText(s9s.f163228b.m195928r3());
        }
        boolean zM134916b = i7n.m134916b();
        AnimEffectPlayer animEffectPlayer = this.f45736c;
        if (zM134916b) {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/b416fad0-e6ba-491c-8051-182413da4aa511.so", 1);
        } else {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/b416fad0-e6ba-491c-8051-182413da4aa511.so", -1);
        }
        osnVar.m165854D3(BLiveUnreadTypeEnum.get(BLiveUnreadTypeEnum.redDot), z ? 1 : 0);
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: a */
    public int mo70268a() {
        return -90880;
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: d */
    public int mo70269d() {
        return -370374;
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: e */
    public int mo70270e() {
        return getWidth();
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: f */
    public int mo70271f() {
        return getHeight();
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: i */
    public int mo70272i() {
        return t100.f167261j;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70266T(this);
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: s */
    public Animator mo70273s(frn frnVar) {
        m70262V();
        final int iMo70270e = frnVar.mo70270e() - mo70270e();
        final int iMo70271f = frnVar.mo70271f() - mo70271f();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.srn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f166113a.m70263W(iMo70270e, iMo70271f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.trn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f171826a.m70264X(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.setDuration(600L);
        valueAnimatorOfFloat2.setStartDelay(200L);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        valueAnimatorOfFloat.addListener(new C12552a(iMo70270e, iMo70271f));
        return animatorSet;
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: v */
    public Animator mo70274v(frn frnVar) {
        m70262V();
        final int iMo70270e = frnVar.mo70270e() - mo70270e();
        final int iMo70271f = frnVar.mo70271f() - mo70271f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rrn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f160759a.m70265Y(iMo70270e, iMo70271f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12553b());
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }
}
