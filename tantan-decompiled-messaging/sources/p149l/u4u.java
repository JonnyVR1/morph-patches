package p149l;

import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class u4u extends LiveBaseAdapter implements qdt.InterfaceC19468b {

    /* JADX INFO: renamed from: k */
    @Nullable
    public RecyclerView f174626k;

    /* JADX INFO: renamed from: l */
    public qdt f174627l;

    /* JADX INFO: renamed from: m */
    public rql f174628m;

    /* JADX INFO: renamed from: j */
    public boolean f174625j = true;

    /* JADX INFO: renamed from: n */
    public final ViewTreeObserver.OnGlobalLayoutListener f174629n = new ViewTreeObserverOnGlobalLayoutListenerC20356a();

    /* JADX INFO: renamed from: l.u4u$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC20356a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC20356a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            u4u u4uVar = u4u.this;
            if (u4uVar.f174626k == null || u4uVar.f174627l == null) {
                return;
            }
            u5m0 u5m0VarM174985d = qjc0.m174985d(u4u.this.f174626k);
            boolean z = u5m0VarM174985d.f174737a >= 0 && u5m0VarM174985d.f174738b < u4u.this.getItemCount();
            if (u5m0VarM174985d.m191872a() && z) {
                u4u.this.m191782p0();
                u4u.this.f174626k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: i0 */
    public void mo139008i0() {
        qdt qdtVar = this.f174627l;
        if (qdtVar != null) {
            qdtVar.m174109m();
            this.f174627l = null;
        }
        RecyclerView recyclerView = this.f174626k;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f174629n);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m191776j0(boolean z, d1q d1qVar) {
        rql rqlVar;
        n80 n80Var = new n80();
        n80Var.m158176d(z);
        if (d1qVar.mo101239F(n80Var) || (rqlVar = this.f174628m) == null) {
            return;
        }
        rqlVar.mo138634a(d1qVar, n80Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m191777k0() {
        RecyclerView recyclerView = this.f174626k;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.f174629n);
    }

    /* JADX INFO: renamed from: l0 */
    public void m191778l0(mcr mcrVar) {
        m191779m0(null, mcrVar, new v9j() { // from class: l.t4u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.TRUE;
            }
        });
    }

    @Override // p149l.qdt.InterfaceC19468b
    /* JADX INFO: renamed from: m */
    public void mo102830m(List<Integer> list, final boolean z) {
        w5s.m201682s0(m67355J(), list, new e30() { // from class: l.s4u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162463a.m191776j0(z, (d1q) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m191779m0(@Nullable rql rqlVar, @NonNull mcr mcrVar, @Nullable v9j<Boolean> v9jVar) {
        this.f174628m = rqlVar;
        qdt qdtVar = this.f174627l;
        if (qdtVar != null) {
            qdtVar.m174119w();
        }
        qdt qdtVar2 = new qdt(this.f174625j, mcrVar, v9jVar, 0.5f);
        this.f174627l = qdtVar2;
        qdtVar2.m174115s(this);
        RecyclerView recyclerView = this.f174626k;
        if (recyclerView != null) {
            this.f174627l.m174107k(recyclerView);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m191780n0(@NonNull final Frag frag, C22393b<Boolean> c22393b) {
        m191779m0(null, frag, new v9j() { // from class: l.r4u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(frag.getUserVisibleHint());
            }
        });
        this.f174627l.m174114r(frag, c22393b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m191781o0(@NonNull Frag frag, @Nullable v9j<Boolean> v9jVar, C22393b<Boolean> c22393b) {
        m191779m0(null, frag, v9jVar);
        this.f174627l.m174114r(frag, c22393b);
    }

    @Override // com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        qdt qdtVar = this.f174627l;
        if (qdtVar != null) {
            qdtVar.m174107k(recyclerView);
        }
        this.f174626k = recyclerView;
    }

    @Override // com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        qdt qdtVar = this.f174627l;
        if (qdtVar != null) {
            qdtVar.m174119w();
        }
        this.f174626k = null;
    }

    /* JADX INFO: renamed from: p0 */
    public synchronized void m191782p0() {
        qdt qdtVar = this.f174627l;
        if (qdtVar != null) {
            qdtVar.m174117u();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public synchronized void m191783q0() {
        qdt qdtVar = this.f174627l;
        if (qdtVar != null) {
            qdtVar.m174118v();
        }
    }
}
