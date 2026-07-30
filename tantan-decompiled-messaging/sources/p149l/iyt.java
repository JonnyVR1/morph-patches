package p149l;

import android.view.ViewTreeObserver;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.util.IntSet;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class iyt extends u4u {

    /* JADX INFO: renamed from: q */
    @NonNull
    public final bj1 f115480q;

    /* JADX INFO: renamed from: o */
    public String f115478o = getClass().getSimpleName();

    /* JADX INFO: renamed from: p */
    public final bs5 f115479p = new bs5();

    /* JADX INFO: renamed from: r */
    public boolean f115481r = false;

    /* JADX INFO: renamed from: s */
    public final C22393b<IntSet> f115482s = C22393b.m221521b();

    /* JADX INFO: renamed from: t */
    public final RecyclerView.AbstractC0582t f115483t = new C17646a();

    /* JADX INFO: renamed from: l.iyt$a */
    public class C17646a extends RecyclerView.AbstractC0582t {
        public C17646a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                u5m0 u5m0VarM174985d = qjc0.m174985d(recyclerView);
                if (u5m0VarM174985d.m191872a()) {
                    iyt.this.f115482s.onNext(IntSet.interval(u5m0VarM174985d.f174739c, u5m0VarM174985d.f174740d));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.iyt$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC17647b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17647b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RecyclerView recyclerView = iyt.this.f174626k;
            if (recyclerView == null) {
                return;
            }
            u5m0 u5m0VarM174985d = qjc0.m174985d(recyclerView);
            if (!u5m0VarM174985d.m191872a() || u5m0VarM174985d.f174739c < 0 || u5m0VarM174985d.f174740d >= iyt.this.m67355J().size()) {
                return;
            }
            iyt.this.f115482s.onNext(IntSet.interval(u5m0VarM174985d.f174739c, u5m0VarM174985d.f174740d));
            iyt.this.f174626k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public iyt(@NonNull bj1 bj1Var) {
        this.f115480q = bj1Var;
        bj1Var.m102140e(this);
    }

    /* JADX INFO: renamed from: H0 */
    public static iyt m138989H0() {
        return new iyt(new zm80());
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m138992t0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public void m138998A0(C22306c<Boolean> c22306c, final Frag frag, final String str) {
        this.f115479p.m103655a(c22306c.throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.hyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110144a.m139001D0(frag, str, (Boolean) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: B0 */
    public C22306c<IntSet> m138999B0() {
        return this.f115482s;
    }

    @MainThread
    /* JADX INFO: renamed from: C0 */
    public void m139000C0(final Frag frag, final boolean z) {
        this.f115478o += "-" + frag.getClass().getSimpleName();
        this.f115479p.m103657c();
        this.f115479p.m103656b(frag.duringCreated(m138999B0()).distinctUntilChanged().throttleLast(300L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.byt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C4319c.f15548i.equals(frag.lifecycle_()));
            }
        }).filter(new w9j() { // from class: l.cyt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!z || frag.getUserVisibleHint());
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.dyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88431a.m139002E0((IntSet) obj);
            }
        }, new e30() { // from class: l.eyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93789a.m139003F0((Throwable) obj);
            }
        })), frag.lifecycle().skip(1).subscribe(ffw.m121194e(new e30() { // from class: l.fyt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99898a.m139004G0(z, frag, (C4319c) obj);
            }
        }, new e30() { // from class: l.gyt
            @Override // p149l.e30
            public final void call(Object obj) {
                iyt.m138992t0((Throwable) obj);
            }
        })));
        m139005I0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m139001D0(Frag frag, String str, Boolean bool) {
        this.f115481r = !bool.booleanValue();
        if (bool.booleanValue() && frag.getUserVisibleHint()) {
            m139005I0();
        }
        if (bool.booleanValue()) {
            return;
        }
        m139007K0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m139002E0(IntSet intSet) {
        intSet.toString();
        if (intSet.isEmpty() || this.f115481r) {
            return;
        }
        this.f115480q.mo102139d(intSet);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m139004G0(boolean z, Frag frag, C4319c c4319c) {
        if (C4319c.f15548i.equals(c4319c) && (!z || frag.getUserVisibleHint())) {
            m139005I0();
        }
        if (C4319c.f15549j.equals(c4319c)) {
            m139007K0();
        }
        if (C4319c.f15551l.equals(c4319c) || C4319c.f15552m.equals(c4319c) || C4319c.f15553n.equals(c4319c)) {
            mo139008i0();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: I0 */
    public void m139005I0() {
        if (this.f174626k == null) {
            return;
        }
        this.f115482s.onNext(IntSet.emptySet());
        this.f174626k.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17647b());
    }

    /* JADX INFO: renamed from: J0 */
    public void m139006J0(e30<d1q<?>> e30Var) {
        this.f115480q.f75856d = e30Var;
    }

    /* JADX INFO: renamed from: K0 */
    public void m139007K0() {
        this.f115480q.mo102143h();
    }

    @Override // p149l.u4u
    /* JADX INFO: renamed from: i0 */
    public void mo139008i0() {
        super.mo139008i0();
        m139007K0();
        this.f115479p.m103657c();
    }

    @Override // p149l.u4u, com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f115483t);
    }

    @Override // p149l.u4u, com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f115483t);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m139003F0(Throwable th) {
    }
}
