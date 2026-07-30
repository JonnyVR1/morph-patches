package p149l;

import android.app.Activity;
import android.graphics.Point;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedGlobalPlayerView;
import com.p046p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class v3h extends vzh implements yng {

    /* JADX INFO: renamed from: k */
    public static Point f179799k;

    /* JADX INFO: renamed from: d */
    public int f179803d;

    /* JADX INFO: renamed from: f */
    public FeedFloatingDraggableContainerView f179805f;

    /* JADX INFO: renamed from: g */
    public FeedGlobalPlayerView f179806g;

    /* JADX INFO: renamed from: h */
    public Activity f179807h;

    /* JADX INFO: renamed from: i */
    public String f179808i;

    /* JADX INFO: renamed from: j */
    public bfh f179809j;

    /* JADX INFO: renamed from: a */
    public final int f179800a = xdl0.m208412y0();

    /* JADX INFO: renamed from: b */
    public final int f179801b = 0;

    /* JADX INFO: renamed from: c */
    public final int f179802c = t100.m186890d(24.0f);

    /* JADX INFO: renamed from: e */
    public int f179804e = 0;

    public v3h(Activity activity, Moment moment) {
        this.f179807h = activity;
        m196862o();
        m196861n(moment);
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: a */
    public void mo66291a(Exception exc) {
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.mo66291a(exc);
        }
        m196868u(this.f179807h);
    }

    /* JADX INFO: renamed from: f */
    public final void m196856f() {
        Activity activity = this.f179807h;
        if (activity instanceof Act) {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: l.r3h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157533a.m196864q();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final Point m196857g(Point point) {
        m196867t();
        int i = point.x;
        if (i < 0) {
            point.x = 0;
        } else {
            int i2 = this.f179804e;
            if (i > i2) {
                point.x = i2;
            }
        }
        int i3 = point.y;
        int i4 = this.f179802c;
        if (i3 < i4) {
            point.y = i4;
            return point;
        }
        int i5 = this.f179803d;
        if (i3 > i5) {
            point.y = i5;
        }
        return point;
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: h */
    public void mo66339h() {
        m196869v(this.f179807h);
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.mo66339h();
        }
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: i */
    public void mo66292i(boolean z) {
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.mo66292i(z);
        }
        if (z) {
            return;
        }
        m196868u(this.f179807h);
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: j */
    public void mo66293j(float f) {
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.mo66293j(f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m196858k() {
        if (NullChecker.m81303a(this.f179809j)) {
            this.f179809j.m101531a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m196859l() {
        int i = this.f179806g.getChildAt(0).getLayoutParams().width;
        return i < 0 ? this.f179806g.getWidth() : i;
    }

    /* JADX INFO: renamed from: m */
    public final void m196860m() {
        if (NullChecker.m81303a(this.f179807h)) {
            Activity activity = this.f179807h;
            if (activity instanceof Act) {
                ((Act) activity).hideInput();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m196861n(Moment moment) {
        if (moment == null) {
            return;
        }
        FeedGlobalPlayerView feedGlobalPlayerView = this.f179806g;
        if (feedGlobalPlayerView != null) {
            feedGlobalPlayerView.setFrom(this.f179808i);
            this.f179806g.m66329L(moment);
        } else {
            this.f179806g = new FeedGlobalPlayerView(this.f179807h, moment);
            this.f179805f = new FeedFloatingDraggableContainerView(this.f179807h, this.f179806g).m66469K().m66465C(new FeedFloatingDraggableContainerView.InterfaceC11393a() { // from class: l.s3h
                @Override // com.p046p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView.InterfaceC11393a
                /* JADX INFO: renamed from: a */
                public final Point mo66476a(Point point) {
                    return this.f162139a.m196857g(point);
                }
            }).m66466E(new e30() { // from class: l.t3h
                @Override // p149l.e30
                public final void call(Object obj) {
                    v3h.f179799k = (Point) obj;
                }
            }).m66467F(new d30() { // from class: l.u3h
                @Override // p149l.d30
                public final void call() {
                    this.f173613a.m196860m();
                }
            });
            m196856f();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m196862o() {
        if (f179799k == null) {
            f179799k = new Point(0, (xdl0.m208410x0(this.f179807h) - t100.m186890d(142.0f)) - xdl0.m208336I(this.f179807h));
        }
    }

    @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        if (wng.m204695v().m204699D()) {
            m196868u(activity);
        }
    }

    @Override // p149l.vzh, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f179807h = activity;
        m196856f();
        if (wng.m204695v().m204699D()) {
            m196869v(activity);
        }
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.setCurrentShowAct(activity);
        }
    }

    @Override // p149l.yng
    public void onComplete() {
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.onComplete();
        }
        m196868u(this.f179807h);
    }

    @Override // p149l.yng
    public void onPause() {
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.onPause();
        }
    }

    @Override // p149l.yng
    public void onResume() {
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.onResume();
        }
    }

    @Override // p149l.yng
    public void onStart() {
        m196869v(this.f179807h);
        if (NullChecker.m81303a(this.f179806g)) {
            this.f179806g.onStart();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m196863p(Activity activity) {
        return activity instanceof NewPostAct;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m196864q() {
        m196858k();
        bfh bfhVar = new bfh(this.f179806g, this.f179805f, t100.m186890d(140.0f));
        this.f179809j = bfhVar;
        bfhVar.m101535e((Act) this.f179807h);
    }

    /* JADX INFO: renamed from: r */
    public final Point m196865r(Point point) {
        if (!vqg.m199556l0(point.x, this.f179806g.getWidth())) {
            point.x = 0;
            return point;
        }
        m196867t();
        point.x = this.f179804e;
        return point;
    }

    /* JADX INFO: renamed from: s */
    public void m196866s(Moment moment) {
        m196861n(moment);
    }

    /* JADX INFO: renamed from: t */
    public final void m196867t() {
        this.f179804e = (this.f179800a - m196859l()) - t100.m186890d(20.0f);
        this.f179803d = (xdl0.m208410x0(this.f179807h) - this.f179806g.getHeight()) - xdl0.m208336I(this.f179807h);
    }

    /* JADX INFO: renamed from: u */
    public final void m196868u(Activity activity) {
        if (!m196863p(activity) && NullChecker.m81303a(this.f179805f)) {
            this.f179805f.m66464B(activity);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m196869v(Activity activity) {
        if (!m196863p(activity) && NullChecker.m81303a(this.f179805f)) {
            this.f179805f.m66468G(activity, m196865r(f179799k));
        }
    }
}
