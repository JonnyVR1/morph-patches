package p153l;

import android.view.ViewTreeObserver;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.util.IntSet;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class r0u extends v6u {

    /* JADX INFO: renamed from: q */
    @NonNull
    public final kj1 f160685q;

    /* JADX INFO: renamed from: o */
    public String f160683o = getClass().getSimpleName();

    /* JADX INFO: renamed from: p */
    public final ft5 f160684p = new ft5();

    /* JADX INFO: renamed from: r */
    public boolean f160686r = false;

    /* JADX INFO: renamed from: s */
    public final C22508b<IntSet> f160687s = C22508b.m222767b();

    /* JADX INFO: renamed from: t */
    public final RecyclerView.AbstractC0584t f160688t = new C19717a();

    /* JADX INFO: renamed from: l.r0u$a */
    public class C19717a extends RecyclerView.AbstractC0584t {
        public C19717a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                yem0 yem0VarM212808d = xrc0.m212808d(recyclerView);
                if (yem0VarM212808d.m215422a()) {
                    r0u.this.f160687s.onNext(IntSet.interval(yem0VarM212808d.f199383c, yem0VarM212808d.f199384d));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.r0u$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC19718b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC19718b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (r0u.this.f182687k == null) {
                return;
            }
            yem0 yem0VarM212808d = xrc0.m212808d(r0u.this.f182687k);
            if (!yem0VarM212808d.m215422a() || yem0VarM212808d.f199383c < 0 || yem0VarM212808d.f199384d >= r0u.this.m68538J().size()) {
                return;
            }
            r0u.this.f160687s.onNext(IntSet.interval(yem0VarM212808d.f199383c, yem0VarM212808d.f199384d));
            r0u.this.f182687k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public r0u(@NonNull kj1 kj1Var) {
        this.f160685q = kj1Var;
        kj1Var.m150000e(this);
    }

    /* JADX INFO: renamed from: J0 */
    public static r0u m179247J0() {
        return new r0u(new gv80());
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m179251u0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m179254y0(Throwable th) {
    }

    /* JADX INFO: renamed from: D0 */
    public C22421c<IntSet> m179256D0() {
        return this.f160687s;
    }

    @MainThread
    /* JADX INFO: renamed from: E0 */
    public void m179257E0(final LiveVPagerBaseFrag liveVPagerBaseFrag, boolean z) {
        this.f160683o += "-" + liveVPagerBaseFrag.getClass().getSimpleName();
        this.f160684p.m127299c();
        C22421c c22421cDistinctUntilChanged = liveVPagerBaseFrag.duringCreated(m179256D0()).distinctUntilChanged();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f160684p.m127298b(c22421cDistinctUntilChanged.throttleLast(300L, timeUnit).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.k0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(liveVPagerBaseFrag.m72004Q4());
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.l0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129590a.m179258F0((IntSet) obj);
            }
        }, new y20() { // from class: l.m0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134353a.m179259G0((Throwable) obj);
            }
        })), liveVPagerBaseFrag.lifecycle().subscribe(dhw.m115826e(new y20() { // from class: l.p0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150098a.m179261I0((C4470c) obj);
            }
        }, new y20() { // from class: l.q0u
            @Override // p153l.y20
            public final void call(Object obj) {
                r0u.m179251u0((Throwable) obj);
            }
        })), liveVPagerBaseFrag.m72003P4().delay(500L, timeUnit).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.n0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139670a.m179260H0((Boolean) obj);
            }
        }, new y20() { // from class: l.o0u
            @Override // p153l.y20
            public final void call(Object obj) {
                r0u.m179254y0((Throwable) obj);
            }
        })));
        m179262K0();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m179258F0(IntSet intSet) {
        intSet.toString();
        if (intSet.isEmpty()) {
            return;
        }
        this.f160685q.mo132518d(intSet);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m179260H0(Boolean bool) {
        if (bool.booleanValue()) {
            m179262K0();
        } else {
            m179263L0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m179261I0(C4470c c4470c) {
        if (C4470c.f16270l.equals(c4470c) || C4470c.f16271m.equals(c4470c) || C4470c.f16272n.equals(c4470c)) {
            mo143026i0();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: K0 */
    public void m179262K0() {
        if (this.f182687k == null) {
            return;
        }
        this.f160687s.onNext(IntSet.emptySet());
        this.f182687k.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC19718b());
    }

    /* JADX INFO: renamed from: L0 */
    public void m179263L0() {
        this.f160685q.mo132519h();
    }

    @Override // p153l.v6u
    /* JADX INFO: renamed from: i0 */
    public void mo143026i0() {
        super.mo143026i0();
        m179263L0();
        this.f160684p.m127299c();
    }

    @Override // p153l.v6u, com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f160688t);
    }

    @Override // p153l.v6u, com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f160688t);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m179259G0(Throwable th) {
    }
}
