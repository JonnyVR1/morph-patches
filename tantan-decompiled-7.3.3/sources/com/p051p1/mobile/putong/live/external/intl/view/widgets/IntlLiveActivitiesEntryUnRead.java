package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.ftn;
import p153l.izs;
import p153l.jyb;
import p153l.qa00;
import p153l.qrr;
import p153l.uqb0;
import p153l.zun;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesEntryUnRead extends VRelative implements ftn {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46607d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f46608e;

    /* JADX INFO: renamed from: f */
    public VText f46609f;

    /* JADX INFO: renamed from: g */
    public VFrame f46610g;

    /* JADX INFO: renamed from: h */
    public Drawable f46611h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead$a */
    public class C12719a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f46612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46613b;

        public C12719a(int i, int i2) {
            this.f46612a = i;
            this.f46613b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryUnRead intlLiveActivitiesEntryUnRead = IntlLiveActivitiesEntryUnRead.this;
            intlLiveActivitiesEntryUnRead.setBackground(intlLiveActivitiesEntryUnRead.f46611h);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryUnRead.this.setBackground(null);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setTranslationX(-this.f46612a);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setTranslationY(-this.f46613b);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setAlpha(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setTranslationX(-this.f46612a);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setTranslationY(-this.f46613b);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setAlpha(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setTranslationX(-this.f46612a);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setTranslationY(-this.f46613b);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setAlpha(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setTranslationX(-this.f46612a);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setTranslationY(-this.f46613b);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setAlpha(0.0f);
            bnl0.m105524M(IntlLiveActivitiesEntryUnRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryUnRead$b */
    public class C12720b extends AnimatorListenerAdapter {
        public C12720b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryUnRead intlLiveActivitiesEntryUnRead = IntlLiveActivitiesEntryUnRead.this;
            intlLiveActivitiesEntryUnRead.setBackground(intlLiveActivitiesEntryUnRead.f46611h);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46607d.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46608e.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46609f.setAlpha(1.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setTranslationX(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setTranslationY(0.0f);
            IntlLiveActivitiesEntryUnRead.this.f46610g.setAlpha(1.0f);
            bnl0.m105524M(IntlLiveActivitiesEntryUnRead.this, false);
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
    private void m71476L() {
        if (this.f46611h != null || getBackground() == null) {
            return;
        }
        this.f46611h = getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m71477P(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float fMin = Math.min(1.0f, 2.0f * animatedFraction);
        float f = (-i) * animatedFraction;
        this.f46607d.setTranslationX(f);
        float f2 = (-i2) * animatedFraction;
        this.f46607d.setTranslationY(f2);
        float f3 = 1.0f - animatedFraction;
        this.f46607d.setAlpha(f3);
        this.f46608e.setTranslationX(f);
        this.f46608e.setTranslationY(f2);
        this.f46608e.setAlpha(f3);
        this.f46609f.setTranslationX(f);
        this.f46609f.setTranslationY(f2);
        this.f46609f.setAlpha(f3);
        this.f46610g.setTranslationX(f);
        this.f46610g.setTranslationY(f2);
        this.f46610g.setAlpha(1.0f - fMin);
    }

    /* JADX INFO: renamed from: H */
    public final void m71481H(View view) {
        zun.m221676a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public final String m71482I(BLiveActivitySummary bLiveActivitySummary) {
        if (jyb.m147479J(bLiveActivitySummary.icons)) {
            return null;
        }
        return bLiveActivitySummary.icons.get(0);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m71483M(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = (-i) * f;
        this.f46607d.setTranslationX(f2);
        float f3 = (-i2) * f;
        this.f46607d.setTranslationY(f3);
        this.f46608e.setTranslationX(f2);
        this.f46608e.setTranslationY(f3);
        this.f46609f.setTranslationX(f2);
        this.f46609f.setTranslationY(f3);
        this.f46610g.setTranslationX(f2);
        this.f46610g.setTranslationY(f3);
        this.f46607d.setAlpha(animatedFraction);
        this.f46608e.setAlpha(animatedFraction);
        this.f46609f.setAlpha(animatedFraction);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m71484O(ValueAnimator valueAnimator) {
        this.f46610g.setAlpha(valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: renamed from: Q */
    public void m71485Q(BLiveActivitySummary bLiveActivitySummary, qrr qrrVar) {
        this.f46608e.setText(bLiveActivitySummary.description.unread);
        this.f46609f.setText(bLiveActivitySummary.description.subtitle);
        String strM71482I = m71482I(bLiveActivitySummary);
        if (strM71482I != null) {
            izs.m142868s("context_square", this.f46607d, strM71482I);
        } else {
            uqb0.f180374G.m98798o(this.f46607d);
        }
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
        return qa00.f156328o;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71481H(this);
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: s */
    public Animator mo71456s(ftn ftnVar) {
        m71476L();
        final int iMo71453e = ftnVar.mo71453e() - mo71453e();
        final int iMo71454f = ftnVar.mo71454f() - mo71454f();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wun
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f190874a.m71483M(iMo71453e, iMo71454f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xun
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f196299a.m71484O(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.setDuration(600L);
        valueAnimatorOfFloat2.setStartDelay(200L);
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.addListener(new C12719a(iMo71453e, iMo71454f));
        return animatorSet;
    }

    public void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f46610g, onClickListener);
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: v */
    public Animator mo71457v(ftn ftnVar) {
        m71476L();
        final int iMo71453e = ftnVar.mo71453e() - mo71453e();
        final int iMo71454f = ftnVar.mo71454f() - mo71454f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yun
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f201648a.m71477P(iMo71453e, iMo71454f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12720b());
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }
}
