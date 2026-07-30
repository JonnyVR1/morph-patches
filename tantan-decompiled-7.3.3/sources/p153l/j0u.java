package p153l;

import android.view.ViewTreeObserver;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.util.IntSet;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class j0u extends v6u {

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ij1 f117859q;

    /* JADX INFO: renamed from: o */
    public String f117857o = getClass().getSimpleName();

    /* JADX INFO: renamed from: p */
    public final ft5 f117858p = new ft5();

    /* JADX INFO: renamed from: r */
    public boolean f117860r = false;

    /* JADX INFO: renamed from: s */
    public final C22508b<IntSet> f117861s = C22508b.m222767b();

    /* JADX INFO: renamed from: t */
    public final RecyclerView.AbstractC0584t f117862t = new C17842a();

    /* JADX INFO: renamed from: l.j0u$a */
    public class C17842a extends RecyclerView.AbstractC0584t {
        public C17842a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                yem0 yem0VarM212808d = xrc0.m212808d(recyclerView);
                if (yem0VarM212808d.m215422a()) {
                    j0u.this.f117861s.onNext(IntSet.interval(yem0VarM212808d.f199383c, yem0VarM212808d.f199384d));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.j0u$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC17843b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17843b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView recyclerView = j0u.this.f182687k;
            if (recyclerView == null) {
                return;
            }
            yem0 yem0VarM212808d = xrc0.m212808d(recyclerView);
            if (!yem0VarM212808d.m215422a() || yem0VarM212808d.f199383c < 0 || yem0VarM212808d.f199384d >= j0u.this.m68538J().size()) {
                return;
            }
            j0u.this.f117861s.onNext(IntSet.interval(yem0VarM212808d.f199383c, yem0VarM212808d.f199384d));
            j0u.this.f182687k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public j0u(@NonNull ij1 ij1Var) {
        this.f117859q = ij1Var;
        ij1Var.m140176e(this);
    }

    /* JADX INFO: renamed from: H0 */
    public static j0u m143007H0() {
        return new j0u(new dv80());
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m143010t0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m143016A0(C22421c<Boolean> c22421c, final Frag frag, final String str) {
        this.f117858p.m127297a(c22421c.throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.i0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112452a.m143019D0(frag, str, (Boolean) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: B0 */
    public C22421c<IntSet> m143017B0() {
        return this.f117861s;
    }

    @MainThread
    /* JADX INFO: renamed from: C0 */
    public void m143018C0(final Frag frag, final boolean z) {
        this.f117857o += "-" + frag.getClass().getSimpleName();
        this.f117858p.m127299c();
        this.f117858p.m127298b(frag.duringCreated(m143017B0()).distinctUntilChanged().throttleLast(300L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.c0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C4470c.f16267i.equals(frag.lifecycle_()));
            }
        }).filter(new qcj() { // from class: l.d0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!z || frag.getUserVisibleHint());
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.e0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91549a.m143020E0((IntSet) obj);
            }
        }, new y20() { // from class: l.f0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96719a.m143021F0((Throwable) obj);
            }
        })), frag.lifecycle().skip(1).subscribe(dhw.m115826e(new y20() { // from class: l.g0u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101682a.m143022G0(z, frag, (C4470c) obj);
            }
        }, new y20() { // from class: l.h0u
            @Override // p153l.y20
            public final void call(Object obj) {
                j0u.m143010t0((Throwable) obj);
            }
        })));
        m143023I0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m143019D0(Frag frag, String str, Boolean bool) {
        this.f117860r = !bool.booleanValue();
        if (bool.booleanValue() && frag.getUserVisibleHint()) {
            m143023I0();
        }
        if (bool.booleanValue()) {
            return;
        }
        m143025K0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m143020E0(IntSet intSet) {
        intSet.toString();
        if (intSet.isEmpty() || this.f117860r) {
            return;
        }
        this.f117859q.mo118266d(intSet);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m143022G0(boolean z, Frag frag, C4470c c4470c) {
        if (C4470c.f16267i.equals(c4470c) && (!z || frag.getUserVisibleHint())) {
            m143023I0();
        }
        if (C4470c.f16268j.equals(c4470c)) {
            m143025K0();
        }
        if (C4470c.f16270l.equals(c4470c) || C4470c.f16271m.equals(c4470c) || C4470c.f16272n.equals(c4470c)) {
            mo143026i0();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: I0 */
    public void m143023I0() {
        if (this.f182687k == null) {
            return;
        }
        this.f117861s.onNext(IntSet.emptySet());
        this.f182687k.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17843b());
    }

    /* JADX INFO: renamed from: J0 */
    public void m143024J0(y20<d3q<?>> y20Var) {
        this.f117859q.f115166d = y20Var;
    }

    /* JADX INFO: renamed from: K0 */
    public void m143025K0() {
        this.f117859q.mo118267h();
    }

    @Override // p153l.v6u
    /* JADX INFO: renamed from: i0 */
    public void mo143026i0() {
        super.mo143026i0();
        m143025K0();
        this.f117858p.m127299c();
    }

    @Override // p153l.v6u, com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f117862t);
    }

    @Override // p153l.v6u, com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f117862t);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m143021F0(Throwable th) {
    }
}
