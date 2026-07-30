package p149l;

import android.view.ViewTreeObserver;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.util.IntSet;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class qyt extends u4u {

    /* JADX INFO: renamed from: q */
    @NonNull
    public final dj1 f156956q;

    /* JADX INFO: renamed from: o */
    public String f156954o = getClass().getSimpleName();

    /* JADX INFO: renamed from: p */
    public final bs5 f156955p = new bs5();

    /* JADX INFO: renamed from: r */
    public boolean f156957r = false;

    /* JADX INFO: renamed from: s */
    public final C22393b<IntSet> f156958s = C22393b.m221521b();

    /* JADX INFO: renamed from: t */
    public final RecyclerView.AbstractC0582t f156959t = new C19607a();

    /* JADX INFO: renamed from: l.qyt$a */
    public class C19607a extends RecyclerView.AbstractC0582t {
        public C19607a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                u5m0 u5m0VarM174985d = qjc0.m174985d(recyclerView);
                if (u5m0VarM174985d.m191872a()) {
                    qyt.this.f156958s.onNext(IntSet.interval(u5m0VarM174985d.f174739c, u5m0VarM174985d.f174740d));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.qyt$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC19608b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC19608b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (qyt.this.f174626k == null) {
                return;
            }
            u5m0 u5m0VarM174985d = qjc0.m174985d(qyt.this.f174626k);
            if (!u5m0VarM174985d.m191872a() || u5m0VarM174985d.f174739c < 0 || u5m0VarM174985d.f174740d >= qyt.this.m67355J().size()) {
                return;
            }
            qyt.this.f156958s.onNext(IntSet.interval(u5m0VarM174985d.f174739c, u5m0VarM174985d.f174740d));
            qyt.this.f174626k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public qyt(@NonNull dj1 dj1Var) {
        this.f156956q = dj1Var;
        dj1Var.m111973e(this);
    }

    /* JADX INFO: renamed from: J0 */
    public static qyt m177065J0() {
        return new qyt(new cn80());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m177069u0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m177072y0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    public C22306c<IntSet> m177074D0() {
        return this.f156958s;
    }

    @MainThread
    /* JADX INFO: renamed from: E0 */
    public void m177075E0(final LiveVPagerBaseFrag liveVPagerBaseFrag, boolean z) {
        this.f156954o += "-" + liveVPagerBaseFrag.getClass().getSimpleName();
        this.f156955p.m103657c();
        C22306c c22306cDistinctUntilChanged = liveVPagerBaseFrag.duringCreated(m177074D0()).distinctUntilChanged();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f156955p.m103656b(c22306cDistinctUntilChanged.throttleLast(300L, timeUnit).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.jyt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(liveVPagerBaseFrag.m70821Q4());
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.kyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125334a.m177076F0((IntSet) obj);
            }
        }, new e30() { // from class: l.lyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130601a.m177077G0((Throwable) obj);
            }
        })), liveVPagerBaseFrag.lifecycle().subscribe(ffw.m121194e(new e30() { // from class: l.oyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146352a.m177079I0((C4319c) obj);
            }
        }, new e30() { // from class: l.pyt
            @Override // p149l.e30
            public final void call(Object obj) {
                qyt.m177069u0((Throwable) obj);
            }
        })), liveVPagerBaseFrag.m70820P4().delay(500L, timeUnit).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.myt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136326a.m177078H0((Boolean) obj);
            }
        }, new e30() { // from class: l.nyt
            @Override // p149l.e30
            public final void call(Object obj) {
                qyt.m177072y0((Throwable) obj);
            }
        })));
        m177080K0();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m177076F0(IntSet intSet) {
        intSet.toString();
        if (intSet.isEmpty()) {
            return;
        }
        this.f156956q.mo107739d(intSet);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m177078H0(Boolean bool) {
        if (bool.booleanValue()) {
            m177080K0();
        } else {
            m177081L0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m177079I0(C4319c c4319c) {
        if (C4319c.f15551l.equals(c4319c) || C4319c.f15552m.equals(c4319c) || C4319c.f15553n.equals(c4319c)) {
            mo139008i0();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: K0 */
    public void m177080K0() {
        if (this.f174626k == null) {
            return;
        }
        this.f156958s.onNext(IntSet.emptySet());
        this.f174626k.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC19608b());
    }

    /* JADX INFO: renamed from: L0 */
    public void m177081L0() {
        this.f156956q.mo107740h();
    }

    @Override // p149l.u4u
    /* JADX INFO: renamed from: i0 */
    public void mo139008i0() {
        super.mo139008i0();
        m177081L0();
        this.f156955p.m103657c();
    }

    @Override // p149l.u4u, com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f156959t);
    }

    @Override // p149l.u4u, com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f156959t);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m177077G0(Throwable th) {
    }
}
