package p153l;

import android.app.Activity;
import android.graphics.Point;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.NewPostAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedGlobalPlayerView;
import com.p051p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class k5h extends k1i implements npg {

    /* JADX INFO: renamed from: k */
    public static Point f124056k;

    /* JADX INFO: renamed from: d */
    public int f124060d;

    /* JADX INFO: renamed from: f */
    public FeedFloatingDraggableContainerView f124062f;

    /* JADX INFO: renamed from: g */
    public FeedGlobalPlayerView f124063g;

    /* JADX INFO: renamed from: h */
    public Activity f124064h;

    /* JADX INFO: renamed from: i */
    public String f124065i;

    /* JADX INFO: renamed from: j */
    public qgh f124066j;

    /* JADX INFO: renamed from: a */
    public final int f124057a = bnl0.m105592y0();

    /* JADX INFO: renamed from: b */
    public final int f124058b = 0;

    /* JADX INFO: renamed from: c */
    public final int f124059c = qa00.m175859d(24.0f);

    /* JADX INFO: renamed from: e */
    public int f124061e = 0;

    public k5h(Activity activity, Moment moment) {
        this.f124064h = activity;
        m148390o();
        m148389n(moment);
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: a */
    public void mo67474a(Exception exc) {
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.mo67474a(exc);
        }
        m148396u(this.f124064h);
    }

    /* JADX INFO: renamed from: f */
    public final void m148384f() {
        Activity activity = this.f124064h;
        if (activity instanceof Act) {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: l.g5h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102329a.m148392q();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final Point m148385g(Point point) {
        m148395t();
        int i = point.x;
        if (i < 0) {
            point.x = 0;
        } else {
            int i2 = this.f124061e;
            if (i > i2) {
                point.x = i2;
            }
        }
        int i3 = point.y;
        int i4 = this.f124059c;
        if (i3 < i4) {
            point.y = i4;
            return point;
        }
        int i5 = this.f124060d;
        if (i3 > i5) {
            point.y = i5;
        }
        return point;
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: h */
    public void mo67522h() {
        m148397v(this.f124064h);
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.mo67522h();
        }
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: i */
    public void mo67475i(boolean z) {
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.mo67475i(z);
        }
        if (z) {
            return;
        }
        m148396u(this.f124064h);
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: j */
    public void mo67476j(float f) {
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.mo67476j(f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m148386k() {
        if (NullChecker.m82486a(this.f124066j)) {
            this.f124066j.m176472a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m148387l() {
        int i = this.f124063g.getChildAt(0).getLayoutParams().width;
        return i < 0 ? this.f124063g.getWidth() : i;
    }

    /* JADX INFO: renamed from: m */
    public final void m148388m() {
        if (NullChecker.m82486a(this.f124064h)) {
            Activity activity = this.f124064h;
            if (activity instanceof Act) {
                ((Act) activity).hideInput();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m148389n(Moment moment) {
        if (moment == null) {
            return;
        }
        FeedGlobalPlayerView feedGlobalPlayerView = this.f124063g;
        if (feedGlobalPlayerView != null) {
            feedGlobalPlayerView.setFrom(this.f124065i);
            this.f124063g.m67512L(moment);
        } else {
            this.f124063g = new FeedGlobalPlayerView(this.f124064h, moment);
            this.f124062f = new FeedFloatingDraggableContainerView(this.f124064h, this.f124063g).m67652K().m67648C(new FeedFloatingDraggableContainerView.InterfaceC11556a() { // from class: l.h5h
                @Override // com.p051p1.mobile.putong.feed.newui.view.suspenddraggableview.FeedFloatingDraggableContainerView.InterfaceC11556a
                /* JADX INFO: renamed from: a */
                public final Point mo67659a(Point point) {
                    return this.f107942a.m148385g(point);
                }
            }).m67649E(new y20() { // from class: l.i5h
                @Override // p153l.y20
                public final void call(Object obj) {
                    k5h.f124056k = (Point) obj;
                }
            }).m67650F(new x20() { // from class: l.j5h
                @Override // p153l.x20
                public final void call() {
                    this.f118437a.m148388m();
                }
            });
            m148384f();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m148390o() {
        if (f124056k == null) {
            f124056k = new Point(0, (bnl0.m105590x0(this.f124064h) - qa00.m175859d(142.0f)) - bnl0.m105516I(this.f124064h));
        }
    }

    @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        if (lpg.m155193v().m155197D()) {
            m148396u(activity);
        }
    }

    @Override // p153l.k1i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f124064h = activity;
        m148384f();
        if (lpg.m155193v().m155197D()) {
            m148397v(activity);
        }
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.setCurrentShowAct(activity);
        }
    }

    @Override // p153l.npg
    public void onComplete() {
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.onComplete();
        }
        m148396u(this.f124064h);
    }

    @Override // p153l.npg
    public void onPause() {
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.onPause();
        }
    }

    @Override // p153l.npg
    public void onResume() {
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.onResume();
        }
    }

    @Override // p153l.npg
    public void onStart() {
        m148397v(this.f124064h);
        if (NullChecker.m82486a(this.f124063g)) {
            this.f124063g.onStart();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m148391p(Activity activity) {
        return activity instanceof NewPostAct;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m148392q() {
        m148386k();
        qgh qghVar = new qgh(this.f124063g, this.f124062f, qa00.m175859d(140.0f));
        this.f124066j = qghVar;
        qghVar.m176476e((Act) this.f124064h);
    }

    /* JADX INFO: renamed from: r */
    public final Point m148393r(Point point) {
        if (!ksg.m151215l0(point.x, this.f124063g.getWidth())) {
            point.x = 0;
            return point;
        }
        m148395t();
        point.x = this.f124061e;
        return point;
    }

    /* JADX INFO: renamed from: s */
    public void m148394s(Moment moment) {
        m148389n(moment);
    }

    /* JADX INFO: renamed from: t */
    public final void m148395t() {
        this.f124061e = (this.f124057a - m148387l()) - qa00.m175859d(20.0f);
        this.f124060d = (bnl0.m105590x0(this.f124064h) - this.f124063g.getHeight()) - bnl0.m105516I(this.f124064h);
    }

    /* JADX INFO: renamed from: u */
    public final void m148396u(Activity activity) {
        if (!m148391p(activity) && NullChecker.m82486a(this.f124062f)) {
            this.f124062f.m67647B(activity);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m148397v(Activity activity) {
        if (!m148391p(activity) && NullChecker.m82486a(this.f124062f)) {
            this.f124062f.m67651G(activity, m148393r(f124056k));
        }
    }
}
