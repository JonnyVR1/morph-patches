package p153l;

import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public class v6u extends LiveBaseAdapter implements rft.InterfaceC19833b {

    /* JADX INFO: renamed from: k */
    @Nullable
    public RecyclerView f182687k;

    /* JADX INFO: renamed from: l */
    public rft f182688l;

    /* JADX INFO: renamed from: m */
    public dtl f182689m;

    /* JADX INFO: renamed from: j */
    public boolean f182686j = true;

    /* JADX INFO: renamed from: n */
    public final ViewTreeObserver.OnGlobalLayoutListener f182690n = new ViewTreeObserverOnGlobalLayoutListenerC20774a();

    /* JADX INFO: renamed from: l.v6u$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC20774a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC20774a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            v6u v6uVar = v6u.this;
            if (v6uVar.f182687k == null || v6uVar.f182688l == null) {
                return;
            }
            yem0 yem0VarM212808d = xrc0.m212808d(v6u.this.f182687k);
            boolean z = yem0VarM212808d.f199381a >= 0 && yem0VarM212808d.f199382b < v6u.this.getItemCount();
            if (yem0VarM212808d.m215422a() && z) {
                v6u.this.m200150p0();
                v6u.this.f182687k.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: i0 */
    public void mo143026i0() {
        rft rftVar = this.f182688l;
        if (rftVar != null) {
            rftVar.m181294m();
            this.f182688l = null;
        }
        RecyclerView recyclerView = this.f182687k;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.f182690n);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m200144j0(boolean z, d3q d3qVar) {
        dtl dtlVar;
        j80 j80Var = new j80();
        j80Var.m143822d(z);
        if (d3qVar.mo96605F(j80Var) || (dtlVar = this.f182689m) == null) {
            return;
        }
        dtlVar.mo117882a(d3qVar, j80Var);
    }

    /* JADX INFO: renamed from: k0 */
    public void m200145k0() {
        RecyclerView recyclerView = this.f182687k;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.f182690n);
    }

    /* JADX INFO: renamed from: l0 */
    public void m200146l0(ner nerVar) {
        m200147m0(null, nerVar, new pcj() { // from class: l.u6u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.TRUE;
            }
        });
    }

    @Override // p153l.rft.InterfaceC19833b
    /* JADX INFO: renamed from: m */
    public void mo100705m(List<Integer> list, final boolean z) {
        x7s.m209646s0(m68538J(), list, new y20() { // from class: l.t6u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172361a.m200144j0(z, (d3q) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m200147m0(@Nullable dtl dtlVar, @NonNull ner nerVar, @Nullable pcj<Boolean> pcjVar) {
        this.f182689m = dtlVar;
        rft rftVar = this.f182688l;
        if (rftVar != null) {
            rftVar.m181304w();
        }
        rft rftVar2 = new rft(this.f182686j, nerVar, pcjVar, 0.5f);
        this.f182688l = rftVar2;
        rftVar2.m181300s(this);
        RecyclerView recyclerView = this.f182687k;
        if (recyclerView != null) {
            this.f182688l.m181292k(recyclerView);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m200148n0(@NonNull final Frag frag, C22508b<Boolean> c22508b) {
        m200147m0(null, frag, new pcj() { // from class: l.s6u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(frag.getUserVisibleHint());
            }
        });
        this.f182688l.m181299r(frag, c22508b);
    }

    /* JADX INFO: renamed from: o0 */
    public void m200149o0(@NonNull Frag frag, @Nullable pcj<Boolean> pcjVar, C22508b<Boolean> c22508b) {
        m200147m0(null, frag, pcjVar);
        this.f182688l.m181299r(frag, c22508b);
    }

    @Override // com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        rft rftVar = this.f182688l;
        if (rftVar != null) {
            rftVar.m181292k(recyclerView);
        }
        this.f182687k = recyclerView;
    }

    @Override // com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        rft rftVar = this.f182688l;
        if (rftVar != null) {
            rftVar.m181304w();
        }
        this.f182687k = null;
    }

    /* JADX INFO: renamed from: p0 */
    public synchronized void m200150p0() {
        rft rftVar = this.f182688l;
        if (rftVar != null) {
            rftVar.m181302u();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public synchronized void m200151q0() {
        rft rftVar = this.f182688l;
        if (rftVar != null) {
            rftVar.m181303v();
        }
    }
}
