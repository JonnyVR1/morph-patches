package com.p046p1.mobile.putong.live.external.intl.view.widgets;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p147v.VRelative;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.ffw;
import p149l.frn;
import p149l.hxs;
import p149l.jo0;
import p149l.mkd0;
import p149l.osn;
import p149l.ppr;
import p149l.t100;
import p149l.tsn;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesEntryRead extends VRelative implements frn {

    /* JADX INFO: renamed from: d */
    public VDraweeView f45743d;

    /* JADX INFO: renamed from: e */
    public VMarqueeText f45744e;

    /* JADX INFO: renamed from: f */
    public VText f45745f;

    /* JADX INFO: renamed from: g */
    public final List<String> f45746g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Animator f45747h;

    /* JADX INFO: renamed from: i */
    public c4g0 f45748i;

    /* JADX INFO: renamed from: j */
    public int f45749j;

    /* JADX INFO: renamed from: k */
    public Drawable f45750k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead$a */
    public class C12554a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f45751a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f45752b;

        public C12554a(int i, int i2) {
            this.f45751a = i;
            this.f45752b = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryRead intlLiveActivitiesEntryRead = IntlLiveActivitiesEntryRead.this;
            intlLiveActivitiesEntryRead.setBackground(intlLiveActivitiesEntryRead.f45750k);
            IntlLiveActivitiesEntryRead.this.f45743d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f45743d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f45743d.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryRead.this.setBackground(null);
            IntlLiveActivitiesEntryRead.this.f45743d.setTranslationX(-this.f45751a);
            IntlLiveActivitiesEntryRead.this.f45743d.setTranslationY(-this.f45752b);
            IntlLiveActivitiesEntryRead.this.f45743d.setAlpha(0.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setTranslationX(-this.f45751a);
            IntlLiveActivitiesEntryRead.this.f45744e.setTranslationY(-this.f45752b);
            IntlLiveActivitiesEntryRead.this.f45744e.setAlpha(0.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setTranslationX(-this.f45751a);
            IntlLiveActivitiesEntryRead.this.f45745f.setTranslationY(-this.f45752b);
            IntlLiveActivitiesEntryRead.this.f45745f.setAlpha(0.0f);
            xdl0.m208344M(IntlLiveActivitiesEntryRead.this, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.view.widgets.IntlLiveActivitiesEntryRead$b */
    public class C12555b extends AnimatorListenerAdapter {
        public C12555b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IntlLiveActivitiesEntryRead intlLiveActivitiesEntryRead = IntlLiveActivitiesEntryRead.this;
            intlLiveActivitiesEntryRead.setBackground(intlLiveActivitiesEntryRead.f45750k);
            IntlLiveActivitiesEntryRead.this.f45743d.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f45743d.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f45743d.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f45744e.setAlpha(1.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setTranslationX(0.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setTranslationY(0.0f);
            IntlLiveActivitiesEntryRead.this.f45745f.setAlpha(1.0f);
            xdl0.m208344M(IntlLiveActivitiesEntryRead.this, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IntlLiveActivitiesEntryRead.this.setBackground(null);
        }
    }

    public IntlLiveActivitiesEntryRead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45746g = new ArrayList();
        this.f45749j = 0;
    }

    /* JADX INFO: renamed from: I */
    public final void m70280I(View view) {
        tsn.m190566a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m70281L() {
        mkd0.m154992z(this.f45748i);
        Animator animator = this.f45747h;
        if (animator != null) {
            animator.cancel();
        }
        this.f45749j = 0;
    }

    /* JADX INFO: renamed from: M */
    public final void m70282M() {
        if (this.f45750k != null || getBackground() == null) {
            return;
        }
        this.f45750k = getBackground();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m70283O(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = 1.0f - animatedFraction;
        float f2 = (-i) * f;
        this.f45743d.setTranslationX(f2);
        float f3 = (-i2) * f;
        this.f45743d.setTranslationY(f3);
        this.f45744e.setTranslationX(f2);
        this.f45744e.setTranslationY(f3);
        this.f45745f.setTranslationX(f2);
        this.f45745f.setTranslationY(f3);
        this.f45743d.setAlpha(animatedFraction);
        this.f45744e.setAlpha(animatedFraction);
        this.f45745f.setAlpha(animatedFraction);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m70284P(int i, int i2, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (-i) * animatedFraction;
        this.f45743d.setTranslationX(f);
        float f2 = (-i2) * animatedFraction;
        this.f45743d.setTranslationY(f2);
        float f3 = 1.0f - animatedFraction;
        this.f45743d.setAlpha(f3);
        this.f45744e.setTranslationX(f);
        this.f45744e.setTranslationY(f2);
        this.f45744e.setAlpha(f3);
        this.f45745f.setTranslationX(f);
        this.f45745f.setTranslationY(f2);
        this.f45745f.setAlpha(f3);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m70285Q(Long l2) {
        Animator animator = this.f45747h;
        if (animator != null) {
            animator.cancel();
            this.f45747h.start();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m70286R() {
        if (vwb.m200296J(this.f45746g)) {
            return;
        }
        int size = (this.f45749j + 1) % this.f45746g.size();
        this.f45749j = size;
        hxs.m133408u("context_square", this.f45743d, this.f45746g.get(size), xdl0.m208407w(37.0f), xdl0.m208407w(46.0f));
    }

    /* JADX INFO: renamed from: S */
    public void m70287S(Act act) {
        if (act == null) {
            return;
        }
        hxs.m133408u("context_square", this.f45743d, this.f45746g.get(0), xdl0.m208407w(37.0f), xdl0.m208407w(46.0f));
        if (this.f45747h == null) {
            this.f45747h = bt0.m103746s(bt0.m103733f(bt0.m103743p(this.f45743d, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.qsn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156243a.m70286R();
                }
            }), bt0.m103743p(this.f45743d, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103737j(2000));
        }
        this.f45748i = act.duringCreated(C22306c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.rsn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160881a.m70285Q((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m70288T(BLiveActivitySummary bLiveActivitySummary, osn osnVar, ppr pprVar) {
        m70281L();
        String[] strArrSplit = bLiveActivitySummary.description.read.split(SignParameters.NEW_LINE);
        if (strArrSplit.length > 0) {
            this.f45744e.setText(strArrSplit[0]);
            this.f45744e.setTag(strArrSplit[0]);
            this.f45745f.setText(strArrSplit[strArrSplit.length - 1]);
        }
        m70289V(bLiveActivitySummary.ongoingLiveIds, pprVar, osnVar.act());
        osnVar.m165854D3(BLiveUnreadTypeEnum.get("unknown_"), 0);
    }

    /* JADX INFO: renamed from: V */
    public final void m70289V(@Nullable List<String> list, ppr pprVar, Act act) {
        this.f45746g.clear();
        if (vwb.m200296J(list) || pprVar == null) {
            return;
        }
        if (pprVar.m170767i()) {
            this.f45746g.addAll(pprVar.m170764f());
        }
        if (this.f45746g.size() >= 2) {
            m70287S(act);
        } else {
            if (this.f45746g.isEmpty()) {
                return;
            }
            hxs.m133408u("context_square", this.f45743d, this.f45746g.get(0), xdl0.m208407w(37.0f), xdl0.m208407w(46.0f));
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

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m70281L();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70280I(this);
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: s */
    public Animator mo70273s(frn frnVar) {
        m70282M();
        final int iMo70270e = frnVar.mo70270e() - mo70270e();
        final int iMo70271f = frnVar.mo70271f() - mo70271f();
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ssn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f166227a.m70283O(iMo70270e, iMo70271f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(800L);
        animatorSet.playTogether(valueAnimatorOfFloat);
        animatorSet.addListener(new C12554a(iMo70270e, iMo70271f));
        return animatorSet;
    }

    @Override // p149l.frn
    /* JADX INFO: renamed from: v */
    public Animator mo70274v(frn frnVar) {
        m70282M();
        final int iMo70270e = frnVar.mo70270e() - mo70270e();
        final int iMo70271f = frnVar.mo70271f() - mo70271f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.psn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f151020a.m70284P(iMo70270e, iMo70271f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12555b());
        valueAnimatorOfFloat.setDuration(800L);
        return valueAnimatorOfFloat;
    }
}
