package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class psr implements grr {

    /* JADX INFO: renamed from: b */
    public final VDraweeView f153962b;

    /* JADX INFO: renamed from: c */
    public Act f153963c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Animator f153964d;

    /* JADX INFO: renamed from: e */
    public kcg0 f153965e;

    /* JADX INFO: renamed from: a */
    public final List<String> f153961a = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f153966f = 0;

    public psr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f153962b = liveActivitiesEntryAll.f47101g;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: a */
    public int mo131858a() {
        return -90880;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: b */
    public void mo131859b(msr msrVar, BLiveActivitySummary bLiveActivitySummary) {
        this.f153963c = msrVar.getAct();
        bnl0.m105524M(this.f153962b, true);
        m173691m();
        m173695q(bLiveActivitySummary, bLiveActivitySummary.ongoingLiveIds, bLiveActivitySummary.icons);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: d */
    public int mo131861d() {
        return -370374;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: e */
    public int mo131862e() {
        return qa00.m175859d(164.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: f */
    public int mo131863f() {
        return qa00.m175859d(62.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: g */
    public int mo131864g() {
        return nbc0.f141199t;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: i */
    public int mo131866i() {
        return qa00.f156322i;
    }

    /* JADX INFO: renamed from: m */
    public void m173691m() {
        psd0.m173633z(this.f153965e);
        Animator animator = this.f153964d;
        if (animator != null) {
            animator.cancel();
        }
        this.f153966f = 0;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m173692n(Long l2) {
        Animator animator = this.f153964d;
        if (animator != null) {
            animator.cancel();
            this.f153964d.start();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m173693o() {
        if (jyb.m147479J(this.f153961a)) {
            return;
        }
        int size = (this.f153966f + 1) % this.f153961a.size();
        this.f153966f = size;
        izs.m142870u("context_square", this.f153962b, this.f153961a.get(size), bnl0.m105587w(37.0f), bnl0.m105587w(46.0f));
    }

    /* JADX INFO: renamed from: p */
    public void m173694p(Act act) {
        if (act == null) {
            return;
        }
        izs.m142870u("context_square", this.f153962b, this.f153961a.get(0), bnl0.m105587w(37.0f), bnl0.m105587w(46.0f));
        if (this.f153964d == null) {
            this.f153964d = gt0.m132173s(gt0.m132160f(gt0.m132170p(this.f153962b, "alpha", 0L, 200L, new LinearInterpolator(), 1.0f, 0.0f), new Runnable() { // from class: l.nsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143529a.m173693o();
                }
            }), gt0.m132170p(this.f153962b, "alpha", 0L, 200L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132164j(2000));
        }
        this.f153965e = act.duringCreated(C22421c.interval(0L, 2410L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.osr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148890a.m173692n((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m173695q(BLiveActivitySummary bLiveActivitySummary, @Nullable List<String> list, List<String> list2) {
        this.f153961a.clear();
        if (jyb.m147479J(list) || jyb.m147479J(list2)) {
            return;
        }
        this.f153961a.addAll(list2);
        if (this.f153961a.size() >= 2) {
            m173694p(this.f153963c);
        } else {
            if (this.f153961a.isEmpty()) {
                return;
            }
            izs.m142870u("context_square", this.f153962b, this.f153961a.get(0), bnl0.m105587w(37.0f), bnl0.m105587w(46.0f));
        }
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: c */
    public void mo131860c() {
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: h */
    public void mo131865h(ValueAnimator valueAnimator, grr grrVar) {
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: j */
    public void mo131867j(ValueAnimator valueAnimator, grr grrVar) {
    }
}
