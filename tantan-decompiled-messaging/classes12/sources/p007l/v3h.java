package p007l;

import android.app.Activity;
import android.graphics.Point;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedGlobalPlayerView;
import com.p000p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v3h extends vzh implements yng {

    /* JADX INFO: renamed from: k */
    public static Point f14038k;

    /* JADX INFO: renamed from: d */
    public int f14042d;

    /* JADX INFO: renamed from: f */
    public FeedFloatingDraggableContainerView f14044f;

    /* JADX INFO: renamed from: g */
    public FeedGlobalPlayerView f14045g;

    /* JADX INFO: renamed from: h */
    public Activity f14046h;

    /* JADX INFO: renamed from: i */
    public String f14047i;

    /* JADX INFO: renamed from: j */
    public bfh f14048j;

    /* JADX INFO: renamed from: a */
    public final int f14039a = xdl0.y0();

    /* JADX INFO: renamed from: b */
    public final int f14040b = 0;

    /* JADX INFO: renamed from: c */
    public final int f14041c = t100.d(24.0f);

    /* JADX INFO: renamed from: e */
    public int f14043e = 0;

    public v3h(Activity activity, Moment moment) {
        this.f14046h = activity;
        m15297o();
        m15296n(moment);
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: a */
    public void mo7451a(Exception exc) {
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.mo7451a(exc);
        }
        m15303u(this.f14046h);
    }

    /* JADX INFO: renamed from: f */
    public final void m15291f() {
        Activity activity = this.f14046h;
        if (activity instanceof Act) {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: l.r3h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12470a.m15299q();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final Point m15292g(Point point) {
        m15302t();
        int i = point.x;
        if (i < 0) {
            point.x = 0;
        } else {
            int i2 = this.f14043e;
            if (i > i2) {
                point.x = i2;
            }
        }
        int i3 = point.y;
        int i4 = this.f14041c;
        if (i3 < i4) {
            point.y = i4;
            return point;
        }
        int i5 = this.f14042d;
        if (i3 > i5) {
            point.y = i5;
        }
        return point;
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: h */
    public void mo7504h() {
        m15304v(this.f14046h);
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.mo7504h();
        }
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: i */
    public void mo7452i(boolean z) {
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.mo7452i(z);
        }
        if (z) {
            return;
        }
        m15303u(this.f14046h);
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: j */
    public void mo7453j(float f) {
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.mo7453j(f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m15293k() {
        if (NullChecker.a(this.f14048j)) {
            this.f14048j.m8813a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m15294l() {
        int i = this.f14045g.getChildAt(0).getLayoutParams().width;
        return i < 0 ? this.f14045g.getWidth() : i;
    }

    /* JADX INFO: renamed from: m */
    public final void m15295m() {
        if (NullChecker.a(this.f14046h)) {
            Act act = this.f14046h;
            if (act instanceof Act) {
                act.hideInput();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15296n(Moment moment) {
        if (moment == null) {
            return;
        }
        FeedGlobalPlayerView feedGlobalPlayerView = this.f14045g;
        if (feedGlobalPlayerView != null) {
            feedGlobalPlayerView.setFrom(this.f14047i);
            this.f14045g.m7494L(moment);
        } else {
            this.f14045g = new FeedGlobalPlayerView(this.f14046h, moment);
            this.f14044f = new FeedFloatingDraggableContainerView(this.f14046h, this.f14045g).m7636K().m7632C(new FeedFloatingDraggableContainerView.InterfaceC2237a() { // from class: l.s3h
                @Override // com.p000p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView.InterfaceC2237a
                /* JADX INFO: renamed from: a */
                public final Point mo7643a(Point point) {
                    return this.f12782a.m15292g(point);
                }
            }).m7633E(new e30() { // from class: l.t3h
                public final void call(Object obj) {
                    v3h.f14038k = (Point) obj;
                }
            }).m7634F(new d30() { // from class: l.u3h
                public final void call() {
                    this.f13521a.m15295m();
                }
            });
            m15291f();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m15297o() {
        if (f14038k == null) {
            f14038k = new Point(0, (xdl0.x0(this.f14046h) - t100.d(142.0f)) - xdl0.I(this.f14046h));
        }
    }

    @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        if (wng.m15855v().m15859D()) {
            m15303u(activity);
        }
    }

    @Override // p007l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f14046h = activity;
        m15291f();
        if (wng.m15855v().m15859D()) {
            m15304v(activity);
        }
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.setCurrentShowAct(activity);
        }
    }

    @Override // p007l.yng
    public void onComplete() {
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.onComplete();
        }
        m15303u(this.f14046h);
    }

    @Override // p007l.yng
    public void onPause() {
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.onPause();
        }
    }

    @Override // p007l.yng
    public void onResume() {
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.onResume();
        }
    }

    @Override // p007l.yng
    public void onStart() {
        m15304v(this.f14046h);
        if (NullChecker.a(this.f14045g)) {
            this.f14045g.onStart();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15298p(Activity activity) {
        return activity instanceof NewPostAct;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m15299q() {
        m15293k();
        bfh bfhVar = new bfh(this.f14045g, this.f14044f, t100.d(140.0f));
        this.f14048j = bfhVar;
        bfhVar.m8817e((Act) this.f14046h);
    }

    /* JADX INFO: renamed from: r */
    public final Point m15300r(Point point) {
        if (!vqg.m15526l0(point.x, this.f14045g.getWidth())) {
            point.x = 0;
            return point;
        }
        m15302t();
        point.x = this.f14043e;
        return point;
    }

    /* JADX INFO: renamed from: s */
    public void m15301s(Moment moment) {
        m15296n(moment);
    }

    /* JADX INFO: renamed from: t */
    public final void m15302t() {
        this.f14043e = (this.f14039a - m15294l()) - t100.d(20.0f);
        this.f14042d = (xdl0.x0(this.f14046h) - this.f14045g.getHeight()) - xdl0.I(this.f14046h);
    }

    /* JADX INFO: renamed from: u */
    public final void m15303u(Activity activity) {
        if (!m15298p(activity) && NullChecker.a(this.f14044f)) {
            this.f14044f.m7631B(activity);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m15304v(Activity activity) {
        if (!m15298p(activity) && NullChecker.a(this.f14044f)) {
            this.f14044f.m7635G(activity, m15300r(f14038k));
        }
    }
}
