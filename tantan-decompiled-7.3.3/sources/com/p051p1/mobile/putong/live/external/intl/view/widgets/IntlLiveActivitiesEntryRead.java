package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.ftn;
import p153l.gt0;
import p153l.izs;
import p153l.jyb;
import p153l.kcg0;
import p153l.oun;
import p153l.psd0;
import p153l.qa00;
import p153l.qrr;
import p153l.tun;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesEntryRead extends VRelative implements ftn {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46591d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f46592e;

    /* JADX INFO: renamed from: f */
    public VText f46593f;

    /* JADX INFO: renamed from: g */
    public final List<String> f46594g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Animator f46595h;

    /* JADX INFO: renamed from: i */
    public kcg0 f46596i;

    /* JADX INFO: renamed from: j */
    public int f46597j;

    /* JADX INFO: renamed from: k */
    public Drawable f46598k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead$a */
    public class C12717a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f46599a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f46600b;

        public C12717a(int i, int i2) {
            this.f46599a = i;
            this.f46600b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryRead intlLiveActivitiesEntryRead = IntlLiveActivitiesEntryRead.this;
            intlLiveActivitiesEntryRead.setBackground(intlLiveActivitiesEntryRead.f46598k);
            IntlLiveActivitiesEntryRead.this.f46591d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f46591d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f46591d.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryRead.this.setBackground(null);
            IntlLiveActivitiesEntryRead.this.f46591d.setTranslationX(-this.f46599a);
            IntlLiveActivitiesEntryRead.this.f46591d.setTranslationY(-this.f46600b);
            IntlLiveActivitiesEntryRead.this.f46591d.setAlpha(0.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setTranslationX(-this.f46599a);
            IntlLiveActivitiesEntryRead.this.f46592e.setTranslationY(-this.f46600b);
            IntlLiveActivitiesEntryRead.this.f46592e.setAlpha(0.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setTranslationX(-this.f46599a);
            IntlLiveActivitiesEntryRead.this.f46593f.setTranslationY(-this.f46600b);
            IntlLiveActivitiesEntryRead.this.f46593f.setAlpha(0.0f);
            bnl0.m105524M(IntlLiveActivitiesEntryRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead$b */
    public class C12718b extends AnimatorListenerAdapter {
        public C12718b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryRead intlLiveActivitiesEntryRead = IntlLiveActivitiesEntryRead.this;
            intlLiveActivitiesEntryRead.setBackground(intlLiveActivitiesEntryRead.f46598k);
            IntlLiveActivitiesEntryRead.this.f46591d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f46591d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f46591d.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f46592e.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f46593f.setAlpha(1.0f);
            bnl0.m105524M(IntlLiveActivitiesEntryRead.this, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryRead.this.setBackground(null);
        }
    }

    public IntlLiveActivitiesEntryRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46594g = new ArrayList();
        this.f46597j = 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m71463I(View view) {
        tun.m192757a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m71464L() {
        psd0.m173633z(this.f46596i);
        Animator animator = this.f46595h;
        if (animator != null) {
            animator.cancel();
        }
        this.f46597j = 0;
    }

    /* JADX INFO: renamed from: M */
    public final void m71465M() {
        if (this.f46598k != null || getBackground() == null) {
            return;
        }
        this.f46598k = getBackground();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m71466O(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = (-i) * f;
        this.f46591d.setTranslationX(f2);
        float f3 = (-i2) * f;
        this.f46591d.setTranslationY(f3);
        this.f46592e.setTranslationX(f2);
        this.f46592e.setTranslationY(f3);
        this.f46593f.setTranslationX(f2);
        this.f46593f.setTranslationY(f3);
        this.f46591d.setAlpha(animatedFraction);
        this.f46592e.setAlpha(animatedFraction);
        this.f46593f.setAlpha(animatedFraction);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m71467P(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (-i) * animatedFraction;
        this.f46591d.setTranslationX(f);
        float f2 = (-i2) * animatedFraction;
        this.f46591d.setTranslationY(f2);
        float f3 = 1.0f - animatedFraction;
        this.f46591d.setAlpha(f3);
        this.f46592e.setTranslationX(f);
        this.f46592e.setTranslationY(f2);
        this.f46592e.setAlpha(f3);
        this.f46593f.setTranslationX(f);
        this.f46593f.setTranslationY(f2);
        this.f46593f.setAlpha(f3);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m71468Q(Long l2) {
        Animator animator = this.f46595h;
        if (animator != null) {
            animator.cancel();
            this.f46595h.start();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m71469R() {
        if (jyb.m147479J(this.f46594g)) {
            return;
        }
        int size = (this.f46597j + 1) % this.f46594g.size();
        this.f46597j = size;
        izs.m142870u("context_square", this.f46591d, this.f46594g.get(size), bnl0.m105587w(37.0f), bnl0.m105587w(46.0f));
    }

    /* JADX INFO: renamed from: S */
    public void m71470S(Act act) {
        if (act == null) {
            return;
        }
        izs.m142870u("context_square", this.f46591d, this.f46594g.get(0), bnl0.m105587w(37.0f), bnl0.m105587w(46.0f));
        if (this.f46595h == null) {
            this.f46595h = gt0.m132173s(gt0.m132160f(gt0.m132170p(this.f46591d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.qun
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159593a.m71469R();
                }
            }), gt0.m132170p(this.f46591d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132164j(2000));
        }
        this.f46596i = act.duringCreated(C22421c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.run
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164926a.m71468Q((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m71471T(BLiveActivitySummary bLiveActivitySummary, oun ounVar, qrr qrrVar) {
        m71464L();
        String[] strArrSplit = bLiveActivitySummary.description.read.split(SignParameters.NEW_LINE);
        if (strArrSplit.length > 0) {
            this.f46592e.setText(strArrSplit[0]);
            this.f46592e.setTag(strArrSplit[0]);
            this.f46593f.setText(strArrSplit[strArrSplit.length - 1]);
        }
        m71472V(bLiveActivitySummary.ongoingLiveIds, qrrVar, ounVar.act());
        ounVar.m169348D3(BLiveUnreadTypeEnum.get("unknown_"), 0);
    }

    /* JADX INFO: renamed from: V */
    public final void m71472V(@Nullable List<String> list, qrr qrrVar, Act act) {
        this.f46594g.clear();
        if (jyb.m147479J(list) || qrrVar == null) {
            return;
        }
        if (qrrVar.m177603i()) {
            this.f46594g.addAll(qrrVar.m177600f());
        }
        if (this.f46594g.size() >= 2) {
            m71470S(act);
        } else {
            if (this.f46594g.isEmpty()) {
                return;
            }
            izs.m142870u("context_square", this.f46591d, this.f46594g.get(0), bnl0.m105587w(37.0f), bnl0.m105587w(46.0f));
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

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m71464L();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71463I(this);
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: s */
    public Animator mo71456s(ftn ftnVar) {
        m71465M();
        final int iMo71453e = ftnVar.mo71453e() - mo71453e();
        final int iMo71454f = ftnVar.mo71454f() - mo71454f();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sun
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f170700a.m71466O(iMo71453e, iMo71454f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        animatorSet.playTogether(valueAnimatorOfFloat);
        animatorSet.addListener(new C12717a(iMo71453e, iMo71454f));
        return animatorSet;
    }

    @Override // p153l.ftn
    /* JADX INFO: renamed from: v */
    public Animator mo71457v(ftn ftnVar) {
        m71465M();
        final int iMo71453e = ftnVar.mo71453e() - mo71453e();
        final int iMo71454f = ftnVar.mo71454f() - mo71454f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pun
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f154203a.m71467P(iMo71453e, iMo71454f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12718b());
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }
}
