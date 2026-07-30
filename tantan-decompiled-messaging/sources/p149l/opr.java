package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCardLive;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VMarqueeText;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class opr implements fpr {

    /* JADX INFO: renamed from: a */
    public final VMarqueeText f145032a;

    /* JADX INFO: renamed from: b */
    public final VText f145033b;

    /* JADX INFO: renamed from: c */
    public int f145034c = 0;

    /* JADX INFO: renamed from: d */
    public Animator f145035d;

    /* JADX INFO: renamed from: e */
    public c4g0 f145036e;

    /* JADX INFO: renamed from: f */
    public LiveSquareMediaView f145037f;

    /* JADX INFO: renamed from: g */
    public LiveSquareMediaView f145038g;

    /* JADX INFO: renamed from: h */
    public final FrameLayout f145039h;

    /* JADX INFO: renamed from: i */
    public final LiveActivitiesEntryAll f145040i;

    /* JADX INFO: renamed from: l.opr$a */
    public class C18993a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f145041a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ fpr f145042b;

        public C18993a(View view, fpr fprVar) {
            this.f145041a = view;
            this.f145042b = fprVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            opr oprVar = opr.this;
            oprVar.m165373A(oprVar.f145040i.f46254h, 0.0f, t100.m186890d(40.0f), 1.0f);
            opr oprVar2 = opr.this;
            oprVar2.m165373A(oprVar2.f145040i.f46250d, 0.0f, 0.0f, 1.0f);
            xdl0.m208358V(opr.this.f145040i.f46254h, t100.m186890d(10.0f));
            xdl0.m208345M0(this.f145041a, false);
            opr.this.m165373A(this.f145041a, 0.0f, 0.0f, 1.0f);
            this.f145041a.setScaleX(0.0f);
            this.f145041a.setScaleY(0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) opr.this.f145039h.getLayoutParams();
            layoutParams.height = this.f145042b.mo122634f() - t100.m186890d(4.0f);
            opr.this.f145039h.setLayoutParams(layoutParams);
            opr.this.f145039h.setAlpha(0.0f);
            xdl0.m208344M(opr.this.f145039h, true);
            xdl0.m208344M(opr.this.f145040i.f46250d, true);
            opr.this.f145040i.f46250d.setAlpha(0.0f);
            xdl0.m208345M0(this.f145041a, true);
            this.f145041a.setScaleX(1.0f);
            this.f145041a.setScaleY(1.0f);
        }
    }

    /* JADX INFO: renamed from: l.opr$b */
    public class C18994b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f145044a;

        public C18994b(View view) {
            this.f145044a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(opr.this.f145039h, false);
            xdl0.m208344M(opr.this.f145040i.f46250d, false);
            opr.this.m165373A(this.f145044a, 0.0f, 0.0f, 1.0f);
            this.f145044a.setScaleX(1.0f);
            this.f145044a.setScaleY(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            opr.this.m165373A(this.f145044a, 0.0f, 0.0f, 0.0f);
            this.f145044a.setScaleX(0.0f);
            this.f145044a.setScaleY(0.0f);
            xdl0.m208344M(opr.this.f145039h, true);
            xdl0.m208344M(opr.this.f145040i.f46250d, true);
            opr oprVar = opr.this;
            oprVar.m165373A(oprVar.f145040i.f46254h, 0.0f, t100.m186890d(40.0f), 1.0f);
            xdl0.m208358V(opr.this.f145040i.f46254h, t100.m186890d(10.0f));
        }
    }

    public opr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f145040i = liveActivitiesEntryAll;
        FrameLayout frameLayout = liveActivitiesEntryAll.f46248b;
        this.f145039h = frameLayout;
        this.f145032a = liveActivitiesEntryAll.f46255i;
        this.f145033b = liveActivitiesEntryAll.f46256j;
        uep0.m193326m(frameLayout, t100.f167260i);
        LiveSquareMediaView liveSquareMediaView = new LiveSquareMediaView(liveActivitiesEntryAll.getContext());
        this.f145037f = liveSquareMediaView;
        FrameLayout frameLayout2 = liveActivitiesEntryAll.f46249c;
        int i = xdl0.f192403e;
        frameLayout2.addView(liveSquareMediaView, new FrameLayout.LayoutParams(i, i));
    }

    /* JADX INFO: renamed from: A */
    public void m165373A(View view, float f, float f2, float f3) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        view.setAlpha(f3);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: a */
    public int mo122629a() {
        return -90880;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: b */
    public void mo122630b(final lqr lqrVar, final BLiveActivitySummary bLiveActivitySummary) {
        this.f145034c = 0;
        final List<BLiveActivityCardLive> list = bLiveActivitySummary.cardLives;
        BLiveActivityCardLive bLiveActivityCardLive = list.get(0);
        mkd0.m154992z(this.f145036e);
        m165381z(lqrVar, bLiveActivityCardLive);
        xdl0.m208329E0(this.f145039h, new View.OnClickListener() { // from class: l.ipr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114342a.m165378w(lqrVar, list, bLiveActivitySummary, view);
            }
        });
        this.f145036e = lqrVar.duringCreated(C22306c.interval(8L, 4L, TimeUnit.SECONDS)).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.jpr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119220a.m165379x(lqrVar, list, (Long) obj);
            }
        }));
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: c */
    public void mo122631c() {
        m165373A(this.f145040i.f46254h, 0.0f, t100.m186890d(40.0f), 1.0f);
        xdl0.m208358V(this.f145040i.f46254h, t100.m186890d(10.0f));
        this.f145040i.f46253g.setVisibility(4);
        this.f145040i.f46253g.setScaleY(1.0f);
        this.f145040i.f46253g.setScaleX(1.0f);
        this.f145040i.f46253g.setAlpha(1.0f);
        this.f145040i.f46252f.setScaleY(1.0f);
        this.f145040i.f46252f.setScaleY(1.0f);
        this.f145040i.f46252f.setAlpha(1.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f145039h.getLayoutParams();
        layoutParams.height = t100.m186890d(132.0f);
        this.f145039h.setLayoutParams(layoutParams);
        m165373A(this.f145039h, 0.0f, 0.0f, 1.0f);
        xdl0.m208344M(this.f145039h, true);
        m165373A(this.f145040i.f46250d, 0.0f, 0.0f, 1.0f);
        xdl0.m208344M(this.f145040i.f46250d, true);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: d */
    public int mo122632d() {
        return -370374;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: e */
    public int mo122633e() {
        return t100.m186890d(136.0f);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: f */
    public int mo122634f() {
        return t100.m186890d(136.0f);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: g */
    public int mo122635g() {
        return h3c0.f105708t;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: h */
    public void mo122636h(ValueAnimator valueAnimator, final fpr fprVar) {
        boolean z = fprVar instanceof upr;
        final int iM186890d = t100.m186890d(z ? 44.0f : 55.0f) - t100.m186890d(10.0f);
        LiveActivitiesEntryAll liveActivitiesEntryAll = this.f145040i;
        final View view = z ? liveActivitiesEntryAll.f46252f : liveActivitiesEntryAll.f46253g;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kpr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f124185a.m165377v(iM186890d, fprVar, view, valueAnimator2);
            }
        });
        valueAnimator.addListener(new C18994b(view));
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: i */
    public int mo122637i() {
        return t100.f167260i;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: j */
    public void mo122638j(ValueAnimator valueAnimator, final fpr fprVar) {
        boolean z = fprVar instanceof upr;
        final int iM186890d = t100.m186890d(z ? 44.0f : 55.0f) - t100.m186890d(10.0f);
        LiveActivitiesEntryAll liveActivitiesEntryAll = this.f145040i;
        final View view = z ? liveActivitiesEntryAll.f46252f : liveActivitiesEntryAll.f46253g;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.npr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f139994a.m165374s(iM186890d, fprVar, view, valueAnimator2);
            }
        });
        valueAnimator.addListener(new C18993a(view, fprVar));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m165374s(int i, fpr fprVar, View view, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m165373A(this.f145040i.f46250d, 0.0f, 0.0f, fFloatValue);
        m165373A(this.f145040i.f46254h, 0.0f, t100.m186890d(40.0f) * fFloatValue, 1.0f);
        float f = 1.0f - fFloatValue;
        xdl0.m208358V(this.f145040i.f46254h, (int) (t100.m186890d(10.0f) + (i * f)));
        int iMo122634f = fprVar.mo122634f() - t100.m186890d(4.0f);
        xdl0.m208325C0(this.f145039h, (int) (((t100.m186890d(132.0f) - iMo122634f) * fFloatValue) + iMo122634f));
        m165373A(this.f145039h, 0.0f, 0.0f, fFloatValue);
        m165373A(view, 0.0f, 0.0f, Math.abs(1.0f - (fFloatValue * 2.0f)));
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m165375t(lqr lqrVar, List list) {
        LiveSquareMediaView liveSquareMediaView = this.f145037f;
        if (liveSquareMediaView != null) {
            xdl0.m208344M(liveSquareMediaView, true);
        }
        LiveSquareMediaView liveSquareMediaView2 = this.f145038g;
        if (liveSquareMediaView2 != null) {
            xdl0.m208344M(liveSquareMediaView2, true);
        }
        m165381z(lqrVar, (BLiveActivityCardLive) list.get(this.f145034c));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m165376u() {
        LiveSquareMediaView liveSquareMediaView = this.f145038g;
        if (liveSquareMediaView != null) {
            liveSquareMediaView.m68775q();
            this.f145040i.f46249c.removeView(this.f145038g);
            this.f145038g = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m165377v(int i, fpr fprVar, View view, ValueAnimator valueAnimator) {
        float fFloatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m165373A(this.f145039h, 0.0f, 0.0f, fFloatValue);
        m165373A(this.f145040i.f46250d, 0.0f, 0.0f, fFloatValue);
        m165373A(this.f145040i.f46254h, 0.0f, t100.m186890d(40.0f) * fFloatValue, 1.0f);
        float f = 1.0f - fFloatValue;
        xdl0.m208358V(this.f145040i.f46254h, (int) (t100.m186890d(10.0f) + (i * f)));
        int iMo122634f = fprVar.mo122634f() - t100.m186890d(4.0f);
        xdl0.m208325C0(this.f145039h, (int) (((t100.m186890d(132.0f) - iMo122634f) * fFloatValue) + iMo122634f));
        m165373A(view, 0.0f, 0.0f, Math.abs(1.0f - (fFloatValue * 2.0f)));
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m165378w(lqr lqrVar, List list, BLiveActivitySummary bLiveActivitySummary, View view) {
        if (lqrVar != null) {
            lqrVar.m151076j3();
            int size = list.size();
            int i = this.f145034c;
            BLiveActivityCardLive bLiveActivityCardLive = size > i ? (BLiveActivityCardLive) list.get(i) : null;
            if (!bLiveActivitySummary.cardEnterLive || bLiveActivityCardLive == null || TextUtils.isEmpty(bLiveActivityCardLive.liveId)) {
                return;
            }
            lqrVar.m151073f3(bLiveActivityCardLive.liveId, true);
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m165379x(lqr lqrVar, List list, Long l2) {
        m165380y(lqrVar, list);
    }

    /* JADX INFO: renamed from: y */
    public final void m165380y(final lqr lqrVar, final List<BLiveActivityCardLive> list) {
        this.f145034c++;
        this.f145038g = this.f145037f;
        LiveSquareMediaView liveSquareMediaView = new LiveSquareMediaView(this.f145039h.getContext());
        this.f145037f = liveSquareMediaView;
        FrameLayout frameLayout = this.f145040i.f46249c;
        int i = xdl0.f192403e;
        frameLayout.addView(liveSquareMediaView, new FrameLayout.LayoutParams(i, i));
        if (this.f145034c >= list.size()) {
            this.f145034c = 0;
        }
        Interpolator interpolator = bt0.f77154a;
        LiveSquareMediaView liveSquareMediaView2 = this.f145038g;
        int i2 = t100.f167261j;
        Animator animatorM103743p = bt0.m103743p(liveSquareMediaView2, "translationX", 0L, 200L, interpolator, 0.0f, -i2);
        Animator animatorM103743p2 = bt0.m103743p(this.f145038g, "alpha", 0L, 200L, interpolator, 1.0f, 0.0f);
        Animator animatorM103743p3 = bt0.m103743p(this.f145037f, "translationX", 0L, 200L, interpolator, i2, 0.0f);
        Animator animatorM103743p4 = bt0.m103743p(this.f145037f, "alpha", 0L, 200L, interpolator, 0.8f, 1.0f);
        Animator animator = this.f145035d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, animatorM103743p2, animatorM103743p3, animatorM103743p4);
        this.f145035d = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.lpr
            @Override // java.lang.Runnable
            public final void run() {
                this.f129243a.m165375t(lqrVar, list);
            }
        });
        bt0.m103733f(this.f145035d, new Runnable() { // from class: l.mpr
            @Override // java.lang.Runnable
            public final void run() {
                this.f135079a.m165376u();
            }
        });
        this.f145035d.start();
    }

    /* JADX INFO: renamed from: z */
    public final void m165381z(lqr lqrVar, BLiveActivityCardLive bLiveActivityCardLive) {
        LiveSquareMediaView liveSquareMediaView = this.f145037f;
        if (liveSquareMediaView == null) {
            return;
        }
        xdl0.m208344M(liveSquareMediaView, true);
        if (!TextUtils.isEmpty(bLiveActivityCardLive.roomCoverUrl)) {
            hxs.m133408u("context_square", this.f145037f.getSimpleDraweeView(), bLiveActivityCardLive.roomCoverUrl, t100.m186890d(132.0f), t100.m186890d(132.0f));
        }
        if (!TextUtils.isEmpty(bLiveActivityCardLive.videoCaptureUrl)) {
            this.f145037f.m68772n(bLiveActivityCardLive.videoCaptureUrl);
        }
        this.f145032a.setText(bLiveActivityCardLive.title);
        this.f145033b.setText(bLiveActivityCardLive.subTitle);
    }
}
