package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityCardLive;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VMarqueeText;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class prr implements grr {

    /* JADX INFO: renamed from: a */
    public final VMarqueeText f153828a;

    /* JADX INFO: renamed from: b */
    public final VText f153829b;

    /* JADX INFO: renamed from: c */
    public int f153830c = 0;

    /* JADX INFO: renamed from: d */
    public Animator f153831d;

    /* JADX INFO: renamed from: e */
    public kcg0 f153832e;

    /* JADX INFO: renamed from: f */
    public LiveSquareMediaView f153833f;

    /* JADX INFO: renamed from: g */
    public LiveSquareMediaView f153834g;

    /* JADX INFO: renamed from: h */
    public final FrameLayout f153835h;

    /* JADX INFO: renamed from: i */
    public final LiveActivitiesEntryAll f153836i;

    /* JADX INFO: renamed from: l.prr$a */
    public class C19428a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f153837a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ grr f153838b;

        public C19428a(View view, grr grrVar) {
            this.f153837a = view;
            this.f153838b = grrVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            prr prrVar = prr.this;
            prrVar.m173552A(prrVar.f153836i.f47102h, 0.0f, qa00.m175859d(40.0f), 1.0f);
            prr prrVar2 = prr.this;
            prrVar2.m173552A(prrVar2.f153836i.f47098d, 0.0f, 0.0f, 1.0f);
            bnl0.m105538V(prr.this.f153836i.f47102h, qa00.m175859d(10.0f));
            bnl0.m105525M0(this.f153837a, false);
            prr.this.m173552A(this.f153837a, 0.0f, 0.0f, 1.0f);
            this.f153837a.setScaleX(0.0f);
            this.f153837a.setScaleY(0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) prr.this.f153835h.getLayoutParams();
            layoutParams.height = this.f153838b.mo131863f() - qa00.m175859d(4.0f);
            prr.this.f153835h.setLayoutParams(layoutParams);
            prr.this.f153835h.setAlpha(0.0f);
            bnl0.m105524M(prr.this.f153835h, true);
            bnl0.m105524M(prr.this.f153836i.f47098d, true);
            prr.this.f153836i.f47098d.setAlpha(0.0f);
            bnl0.m105525M0(this.f153837a, true);
            this.f153837a.setScaleX(1.0f);
            this.f153837a.setScaleY(1.0f);
        }
    }

    /* JADX INFO: renamed from: l.prr$b */
    public class C19429b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f153840a;

        public C19429b(View view) {
            this.f153840a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(prr.this.f153835h, false);
            bnl0.m105524M(prr.this.f153836i.f47098d, false);
            prr.this.m173552A(this.f153840a, 0.0f, 0.0f, 1.0f);
            this.f153840a.setScaleX(1.0f);
            this.f153840a.setScaleY(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            prr.this.m173552A(this.f153840a, 0.0f, 0.0f, 0.0f);
            this.f153840a.setScaleX(0.0f);
            this.f153840a.setScaleY(0.0f);
            bnl0.m105524M(prr.this.f153835h, true);
            bnl0.m105524M(prr.this.f153836i.f47098d, true);
            prr prrVar = prr.this;
            prrVar.m173552A(prrVar.f153836i.f47102h, 0.0f, qa00.m175859d(40.0f), 1.0f);
            bnl0.m105538V(prr.this.f153836i.f47102h, qa00.m175859d(10.0f));
        }
    }

    public prr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f153836i = liveActivitiesEntryAll;
        FrameLayout frameLayout = liveActivitiesEntryAll.f47096b;
        this.f153835h = frameLayout;
        this.f153828a = liveActivitiesEntryAll.f47103i;
        this.f153829b = liveActivitiesEntryAll.f47104j;
        ynp0.m216936m(frameLayout, qa00.f156322i);
        LiveSquareMediaView liveSquareMediaView = new LiveSquareMediaView(liveActivitiesEntryAll.getContext());
        this.f153833f = liveSquareMediaView;
        FrameLayout frameLayout2 = liveActivitiesEntryAll.f47097c;
        int i = bnl0.f77544e;
        frameLayout2.addView(liveSquareMediaView, new FrameLayout.LayoutParams(i, i));
    }

    /* JADX INFO: renamed from: A */
    public void m173552A(View view, float f, float f2, float f3) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        view.setAlpha(f3);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: a */
    public int mo131858a() {
        return -90880;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: b */
    public void mo131859b(final msr msrVar, final BLiveActivitySummary bLiveActivitySummary) {
        this.f153830c = 0;
        final List<BLiveActivityCardLive> list = bLiveActivitySummary.cardLives;
        BLiveActivityCardLive bLiveActivityCardLive = list.get(0);
        psd0.m173633z(this.f153832e);
        m173560z(msrVar, bLiveActivityCardLive);
        bnl0.m105509E0(this.f153835h, new View.OnClickListener() { // from class: l.jrr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122402a.m173557w(msrVar, list, bLiveActivitySummary, view);
            }
        });
        this.f153832e = msrVar.duringCreated(C22421c.interval(8L, 4L, TimeUnit.SECONDS)).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.krr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128498a.m173558x(msrVar, list, (Long) obj);
            }
        }));
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: c */
    public void mo131860c() {
        m173552A(this.f153836i.f47102h, 0.0f, qa00.m175859d(40.0f), 1.0f);
        bnl0.m105538V(this.f153836i.f47102h, qa00.m175859d(10.0f));
        this.f153836i.f47101g.setVisibility(4);
        this.f153836i.f47101g.setScaleY(1.0f);
        this.f153836i.f47101g.setScaleX(1.0f);
        this.f153836i.f47101g.setAlpha(1.0f);
        this.f153836i.f47100f.setScaleY(1.0f);
        this.f153836i.f47100f.setScaleY(1.0f);
        this.f153836i.f47100f.setAlpha(1.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f153835h.getLayoutParams();
        layoutParams.height = qa00.m175859d(132.0f);
        this.f153835h.setLayoutParams(layoutParams);
        m173552A(this.f153835h, 0.0f, 0.0f, 1.0f);
        bnl0.m105524M(this.f153835h, true);
        m173552A(this.f153836i.f47098d, 0.0f, 0.0f, 1.0f);
        bnl0.m105524M(this.f153836i.f47098d, true);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: d */
    public int mo131861d() {
        return -370374;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: e */
    public int mo131862e() {
        return qa00.m175859d(136.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: f */
    public int mo131863f() {
        return qa00.m175859d(136.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: g */
    public int mo131864g() {
        return nbc0.f141199t;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: h */
    public void mo131865h(ValueAnimator valueAnimator, final grr grrVar) {
        boolean z = grrVar instanceof vrr;
        final int iM175859d = qa00.m175859d(z ? 44.0f : 55.0f) - qa00.m175859d(10.0f);
        LiveActivitiesEntryAll liveActivitiesEntryAll = this.f153836i;
        final View view = z ? liveActivitiesEntryAll.f47100f : liveActivitiesEntryAll.f47101g;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.lrr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f133356a.m173556v(iM175859d, grrVar, view, valueAnimator2);
            }
        });
        valueAnimator.addListener(new C19429b(view));
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: i */
    public int mo131866i() {
        return qa00.f156322i;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: j */
    public void mo131867j(ValueAnimator valueAnimator, final grr grrVar) {
        boolean z = grrVar instanceof vrr;
        final int iM175859d = qa00.m175859d(z ? 44.0f : 55.0f) - qa00.m175859d(10.0f);
        LiveActivitiesEntryAll liveActivitiesEntryAll = this.f153836i;
        final View view = z ? liveActivitiesEntryAll.f47100f : liveActivitiesEntryAll.f47101g;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.orr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f148742a.m173553s(iM175859d, grrVar, view, valueAnimator2);
            }
        });
        valueAnimator.addListener(new C19428a(view, grrVar));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m173553s(int i, grr grrVar, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m173552A(this.f153836i.f47098d, 0.0f, 0.0f, fFloatValue);
        m173552A(this.f153836i.f47102h, 0.0f, qa00.m175859d(40.0f) * fFloatValue, 1.0f);
        float f = 1.0f - fFloatValue;
        bnl0.m105538V(this.f153836i.f47102h, (int) (qa00.m175859d(10.0f) + (i * f)));
        int iMo131863f = grrVar.mo131863f() - qa00.m175859d(4.0f);
        bnl0.m105505C0(this.f153835h, (int) (((qa00.m175859d(132.0f) - iMo131863f) * fFloatValue) + iMo131863f));
        m173552A(this.f153835h, 0.0f, 0.0f, fFloatValue);
        m173552A(view, 0.0f, 0.0f, Math.abs(1.0f - (fFloatValue * 2.0f)));
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m173554t(msr msrVar, List list) {
        LiveSquareMediaView liveSquareMediaView = this.f153833f;
        if (liveSquareMediaView != null) {
            bnl0.m105524M(liveSquareMediaView, true);
        }
        LiveSquareMediaView liveSquareMediaView2 = this.f153834g;
        if (liveSquareMediaView2 != null) {
            bnl0.m105524M(liveSquareMediaView2, true);
        }
        m173560z(msrVar, (BLiveActivityCardLive) list.get(this.f153830c));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m173555u() {
        LiveSquareMediaView liveSquareMediaView = this.f153834g;
        if (liveSquareMediaView != null) {
            liveSquareMediaView.m69958q();
            this.f153836i.f47097c.removeView(this.f153834g);
            this.f153834g = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m173556v(int i, grr grrVar, View view, ValueAnimator valueAnimator) {
        float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m173552A(this.f153835h, 0.0f, 0.0f, fFloatValue);
        m173552A(this.f153836i.f47098d, 0.0f, 0.0f, fFloatValue);
        m173552A(this.f153836i.f47102h, 0.0f, qa00.m175859d(40.0f) * fFloatValue, 1.0f);
        float f = 1.0f - fFloatValue;
        bnl0.m105538V(this.f153836i.f47102h, (int) (qa00.m175859d(10.0f) + (i * f)));
        int iMo131863f = grrVar.mo131863f() - qa00.m175859d(4.0f);
        bnl0.m105505C0(this.f153835h, (int) (((qa00.m175859d(132.0f) - iMo131863f) * fFloatValue) + iMo131863f));
        m173552A(view, 0.0f, 0.0f, Math.abs(1.0f - (fFloatValue * 2.0f)));
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m173557w(msr msrVar, List list, BLiveActivitySummary bLiveActivitySummary, View view) {
        if (msrVar != null) {
            msrVar.m159918j3();
            int size = list.size();
            int i = this.f153830c;
            BLiveActivityCardLive bLiveActivityCardLive = size > i ? (BLiveActivityCardLive) list.get(i) : null;
            if (!bLiveActivitySummary.cardEnterLive || bLiveActivityCardLive == null || TextUtils.isEmpty(bLiveActivityCardLive.liveId)) {
                return;
            }
            msrVar.m159915f3(bLiveActivityCardLive.liveId, true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m173558x(msr msrVar, List list, Long l2) {
        m173559y(msrVar, list);
    }

    /* JADX INFO: renamed from: y */
    public final void m173559y(final msr msrVar, final List<BLiveActivityCardLive> list) {
        this.f153830c++;
        this.f153834g = this.f153833f;
        LiveSquareMediaView liveSquareMediaView = new LiveSquareMediaView(this.f153835h.getContext());
        this.f153833f = liveSquareMediaView;
        FrameLayout frameLayout = this.f153836i.f47097c;
        int i = bnl0.f77544e;
        frameLayout.addView(liveSquareMediaView, new FrameLayout.LayoutParams(i, i));
        if (this.f153830c >= list.size()) {
            this.f153830c = 0;
        }
        Interpolator interpolator = gt0.f106346a;
        LiveSquareMediaView liveSquareMediaView2 = this.f153834g;
        int i2 = qa00.f156323j;
        Animator animatorM132170p = gt0.m132170p(liveSquareMediaView2, "translationX", 0L, 200L, interpolator, 0.0f, -i2);
        Animator animatorM132170p2 = gt0.m132170p(this.f153834g, "alpha", 0L, 200L, interpolator, 1.0f, 0.0f);
        Animator animatorM132170p3 = gt0.m132170p(this.f153833f, "translationX", 0L, 200L, interpolator, i2, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(this.f153833f, "alpha", 0L, 200L, interpolator, 0.8f, 1.0f);
        Animator animator = this.f153831d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, animatorM132170p2, animatorM132170p3, animatorM132170p4);
        this.f153831d = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.mrr
            @Override // java.lang.Runnable
            public final void run() {
                this.f138406a.m173554t(msrVar, list);
            }
        });
        gt0.m132160f(this.f153831d, new Runnable() { // from class: l.nrr
            @Override // java.lang.Runnable
            public final void run() {
                this.f143425a.m173555u();
            }
        });
        this.f153831d.start();
    }

    /* JADX INFO: renamed from: z */
    public final void m173560z(msr msrVar, BLiveActivityCardLive bLiveActivityCardLive) {
        LiveSquareMediaView liveSquareMediaView = this.f153833f;
        if (liveSquareMediaView == null) {
            return;
        }
        bnl0.m105524M(liveSquareMediaView, true);
        if (!TextUtils.isEmpty(bLiveActivityCardLive.roomCoverUrl)) {
            izs.m142870u("context_square", this.f153833f.getSimpleDraweeView(), bLiveActivityCardLive.roomCoverUrl, qa00.m175859d(132.0f), qa00.m175859d(132.0f));
        }
        if (!TextUtils.isEmpty(bLiveActivityCardLive.videoCaptureUrl)) {
            this.f153833f.m69955n(bLiveActivityCardLive.videoCaptureUrl);
        }
        this.f153828a.setText(bLiveActivityCardLive.title);
        this.f153829b.setText(bLiveActivityCardLive.subTitle);
    }
}
