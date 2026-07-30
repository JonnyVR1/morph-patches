package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class oqr implements fpr {

    /* JADX INFO: renamed from: b */
    public final VDraweeView f145182b;

    /* JADX INFO: renamed from: c */
    public Act f145183c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Animator f145184d;

    /* JADX INFO: renamed from: e */
    public c4g0 f145185e;

    /* JADX INFO: renamed from: a */
    public final List<String> f145181a = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f145186f = 0;

    public oqr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f145182b = liveActivitiesEntryAll.f46253g;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: a */
    public int mo122629a() {
        return -90880;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: b */
    public void mo122630b(lqr lqrVar, BLiveActivitySummary bLiveActivitySummary) {
        this.f145183c = lqrVar.getAct();
        xdl0.m208344M(this.f145182b, true);
        m165486m();
        m165490q(bLiveActivitySummary, bLiveActivitySummary.ongoingLiveIds, bLiveActivitySummary.icons);
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: d */
    public int mo122632d() {
        return -370374;
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: e */
    public int mo122633e() {
        return t100.m186890d(164.0f);
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
    /* JADX INFO: renamed from: i */
    public int mo122637i() {
        return t100.f167260i;
    }

    /* JADX INFO: renamed from: m */
    public void m165486m() {
        mkd0.m154992z(this.f145185e);
        Animator animator = this.f145184d;
        if (animator != null) {
            animator.cancel();
        }
        this.f145186f = 0;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m165487n(Long l2) {
        Animator animator = this.f145184d;
        if (animator != null) {
            animator.cancel();
            this.f145184d.start();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m165488o() {
        if (vwb.m200296J(this.f145181a)) {
            return;
        }
        int size = (this.f145186f + 1) % this.f145181a.size();
        this.f145186f = size;
        hxs.m133408u("context_square", this.f145182b, this.f145181a.get(size), xdl0.m208407w(37.0f), xdl0.m208407w(46.0f));
    }

    /* JADX INFO: renamed from: p */
    public void m165489p(Act act) {
        if (act == null) {
            return;
        }
        hxs.m133408u("context_square", this.f145182b, this.f145181a.get(0), xdl0.m208407w(37.0f), xdl0.m208407w(46.0f));
        if (this.f145184d == null) {
            this.f145184d = bt0.m103746s(bt0.m103733f(bt0.m103743p(this.f145182b, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.mqr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135289a.m165488o();
                }
            }), bt0.m103743p(this.f145182b, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103737j(2000));
        }
        this.f145185e = act.duringCreated(C22306c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.nqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140097a.m165487n((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m165490q(BLiveActivitySummary bLiveActivitySummary, @Nullable List<String> list, List<String> list2) {
        this.f145181a.clear();
        if (vwb.m200296J(list) || vwb.m200296J(list2)) {
            return;
        }
        this.f145181a.addAll(list2);
        if (this.f145181a.size() >= 2) {
            m165489p(this.f145183c);
        } else {
            if (this.f145181a.isEmpty()) {
                return;
            }
            hxs.m133408u("context_square", this.f145182b, this.f145181a.get(0), xdl0.m208407w(37.0f), xdl0.m208407w(46.0f));
        }
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: c */
    public void mo122631c() {
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: h */
    public void mo122636h(ValueAnimator valueAnimator, fpr fprVar) {
    }

    @Override // p149l.fpr
    /* JADX INFO: renamed from: j */
    public void mo122638j(ValueAnimator valueAnimator, fpr fprVar) {
    }
}
