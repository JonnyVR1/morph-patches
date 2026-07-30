package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VRelative;
import p147v.VText;
import p149l.frn;
import p149l.hxs;
import p149l.ppr;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zsn;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesEntryUnRead extends VRelative implements frn {

    /* JADX INFO: renamed from: d */
    public VDraweeView f45759d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f45760e;

    /* JADX INFO: renamed from: f */
    public VText f45761f;

    /* JADX INFO: renamed from: g */
    public VFrame f45762g;

    /* JADX INFO: renamed from: h */
    public Drawable f45763h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead$a */
    public class C12556a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f45764a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f45765b;

        public C12556a(int i, int i2) {
            this.f45764a = i;
            this.f45765b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryUnRead intlLiveActivitiesEntryUnRead = IntlLiveActivitiesEntryUnRead.this;
            intlLiveActivitiesEntryUnRead.setBackground(intlLiveActivitiesEntryUnRead.f45763h);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryUnRead.this.setBackground(null);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setTranslationX(-this.f45764a);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setTranslationY(-this.f45765b);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setAlpha(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setTranslationX(-this.f45764a);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setTranslationY(-this.f45765b);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setAlpha(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setTranslationX(-this.f45764a);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setTranslationY(-this.f45765b);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setAlpha(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setTranslationX(-this.f45764a);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setTranslationY(-this.f45765b);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setAlpha(0.0f);
            xdl0.m208344M(IntlLiveActivitiesEntryUnRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead$b */
    public class C12557b extends AnimatorListenerAdapter {
        public C12557b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryUnRead intlLiveActivitiesEntryUnRead = IntlLiveActivitiesEntryUnRead.this;
            intlLiveActivitiesEntryUnRead.setBackground(intlLiveActivitiesEntryUnRead.f45763h);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45759d.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45760e.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45761f.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f45762g.setAlpha(1.0f);
            xdl0.m208344M(IntlLiveActivitiesEntryUnRead.this, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryUnRead.this.setBackground(null);
        }
    }

    public IntlLiveActivitiesEntryUnRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: L */
    private void m70293L() {
        if (this.f45763h != null || getBackground() == null) {
            return;
        }
        this.f45763h = getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m70294P(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        float f = (-i) * animatedFraction;
        this.f45759d.setTranslationX(f);
        float f2 = (-i2) * animatedFraction;
        this.f45759d.setTranslationY(f2);
        float f3 = 1.0f - animatedFraction;
        this.f45759d.setAlpha(f3);
        this.f45760e.setTranslationX(f);
        this.f45760e.setTranslationY(f2);
        this.f45760e.setAlpha(f3);
        this.f45761f.setTranslationX(f);
        this.f45761f.setTranslationY(f2);
        this.f45761f.setAlpha(f3);
        this.f45762g.setTranslationX(f);
        this.f45762g.setTranslationY(f2);
        this.f45762g.setAlpha(1.0f - fMin);
    }

    /* JADX INFO: renamed from: H */
    public final void m70298H(View view) {
        zsn.m220044a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final String m70299I(BLiveActivitySummary bLiveActivitySummary) {
        if (vwb.m200296J(bLiveActivitySummary.icons)) {
            return null;
        }
        return bLiveActivitySummary.icons.get(0);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m70300M(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = (-i) * f;
        this.f45759d.setTranslationX(f2);
        float f3 = (-i2) * f;
        this.f45759d.setTranslationY(f3);
        this.f45760e.setTranslationX(f2);
        this.f45760e.setTranslationY(f3);
        this.f45761f.setTranslationX(f2);
        this.f45761f.setTranslationY(f3);
        this.f45762g.setTranslationX(f2);
        this.f45762g.setTranslationY(f3);
        this.f45759d.setAlpha(animatedFraction);
        this.f45760e.setAlpha(animatedFraction);
        this.f45761f.setAlpha(animatedFraction);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m70301O(ValueAnimator valueAnimator) {
        this.f45762g.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: renamed from: Q */
    public void m70302Q(BLiveActivitySummary bLiveActivitySummary, ppr pprVar) {
        this.f45760e.setText(bLiveActivitySummary.description.unread);
        this.f45761f.setText(bLiveActivitySummary.description.subtitle);
        String strM70299I = m70299I(bLiveActivitySummary);
        if (strM70299I != null) {
            hxs.m133406s("context_square", this.f45759d, strM70299I);
        } else {
            qib0.f154691G.m184725o(this.f45759d);
        }
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
        return t100.f167266o;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70298H(this);
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: s */
    public Animator mo70273s(frn frnVar) {
        m70293L();
        final int iMo70270e = frnVar.mo70270e() - mo70270e();
        final int iMo70271f = frnVar.mo70271f() - mo70271f();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wsn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f187951a.m70300M(iMo70270e, iMo70271f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xsn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f194291a.m70301O(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.setDuration(600L);
        valueAnimatorOfFloat2.setStartDelay(200L);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new C12556a(iMo70270e, iMo70271f));
        return animatorSet;
    }

    public void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f45762g, onClickListener);
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: v */
    public Animator mo70274v(frn frnVar) {
        m70293L();
        final int iMo70270e = frnVar.mo70270e() - mo70270e();
        final int iMo70271f = frnVar.mo70271f() - mo70271f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ysn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f199796a.m70294P(iMo70270e, iMo70271f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12557b());
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }
}
