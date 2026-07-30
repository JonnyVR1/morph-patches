package p149l;

import android.animation.ValueAnimator;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class uqr implements fpr {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f177770a;

    /* JADX INFO: renamed from: b */
    public final VFrame f177771b;

    public uqr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f177770a = liveActivitiesEntryAll.f46253g;
        this.f177771b = liveActivitiesEntryAll.f46257k;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: a */
    public int mo122629a() {
        return -90880;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: b */
    public void mo122630b(lqr lqrVar, BLiveActivitySummary bLiveActivitySummary) {
        String strM195003o = m195003o(bLiveActivitySummary);
        if (strM195003o != null) {
            hxs.m133406s("context_square", this.f177770a, strM195003o);
        } else {
            qib0.f154691G.m184725o(this.f177770a);
        }
        xdl0.m208344M(this.f177770a, true);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: c */
    public void mo122631c() {
        this.f177771b.setAlpha(1.0f);
        xdl0.m208344M(this.f177771b, true);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: d */
    public int mo122632d() {
        return -370374;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: e */
    public int mo122633e() {
        return t100.m186890d(190.0f);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: f */
    public int mo122634f() {
        return t100.m186890d(62.0f);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: g */
    public int mo122635g() {
        return h3c0.f105708t;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: h */
    public void mo122636h(ValueAnimator valueAnimator, fpr fprVar) {
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.sqr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f166018a.m195006r(valueAnimator2);
            }
        });
        bt0.m103733f(valueAnimator, new Runnable() { // from class: l.tqr
            @Override // java.lang.Runnable
            public final void run() {
                this.f171618a.m195007s();
            }
        });
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: i */
    public int mo122637i() {
        return t100.f167260i;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: j */
    public void mo122638j(ValueAnimator valueAnimator, fpr fprVar) {
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qqr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f155931a.m195004p(valueAnimator2);
            }
        });
        bt0.m103749v(valueAnimator, new Runnable() { // from class: l.rqr
            @Override // java.lang.Runnable
            public final void run() {
                this.f160689a.m195005q();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final String m195003o(BLiveActivitySummary bLiveActivitySummary) {
        if (vwb.m200296J(bLiveActivitySummary.icons)) {
            return null;
        }
        return bLiveActivitySummary.icons.get(0);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m195004p(ValueAnimator valueAnimator) {
        this.f177771b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m195005q() {
        xdl0.m208344M(this.f177771b, true);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m195006r(ValueAnimator valueAnimator) {
        this.f177771b.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m195007s() {
        xdl0.m208344M(this.f177771b, false);
    }
}
