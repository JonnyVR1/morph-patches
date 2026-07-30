package com.p051p1.mobile.putong.live.base.arch;

import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0603g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.bnl0;
import p153l.d3q;
import p153l.d6m;
import p153l.f9j;
import p153l.jyb;
import p153l.ner;
import p153l.pcj;
import p153l.pol;
import p153l.psd0;
import p153l.qcj;
import p153l.we2;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBaseAdapter extends RecyclerView.Adapter<C11588c> implements pol {

    /* JADX INFO: renamed from: a */
    public List<d3q<?>> f45086a;

    /* JADX INFO: renamed from: g */
    public View f45092g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f45093h;

    /* JADX INFO: renamed from: b */
    public SparseArray<d3q<?>> f45087b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public boolean f45088c = false;

    /* JADX INFO: renamed from: d */
    public y20<Integer> f45089d = null;

    /* JADX INFO: renamed from: e */
    public View f45090e = null;

    /* JADX INFO: renamed from: f */
    public C22508b<View> f45091f = C22508b.m222767b();

    /* JADX INFO: renamed from: i */
    public final RecyclerView.AbstractC0584t f45094i = new C11586a();

    public static class AdapterException extends Exception {
        public AdapterException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.LiveBaseAdapter$a */
    public class C11586a extends RecyclerView.AbstractC0584t {
        public C11586a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (LiveBaseAdapter.this.f45088c) {
                if (i == 0) {
                    f9j.m124659a().m181736y();
                } else {
                    f9j.m124659a().m181730s();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.LiveBaseAdapter$b */
    public class C11587b extends C0603g.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f45096a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f45097b;

        public C11587b(List list, List list2) {
            this.f45096a = list;
            this.f45097b = list2;
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: a */
        public boolean mo3646a(int i, int i2) {
            return ((d3q) this.f45097b.get(i)).equals(this.f45096a.get(i2));
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: b */
        public boolean mo3647b(int i, int i2) {
            return ((d3q) this.f45097b.get(i)).mo95343r() == ((d3q) this.f45096a.get(i2)).mo95343r();
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Object mo3648c(int i, int i2) {
            return ((d3q) this.f45096a.get(i2)).mo107030n();
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: d */
        public int mo3649d() {
            return this.f45096a.size();
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: e */
        public int mo3650e() {
            return this.f45097b.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.LiveBaseAdapter$c */
    public static class C11588c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public d3q f45098a;

        public C11588c(View view) {
            super(view);
        }

        /* JADX INFO: renamed from: c */
        public final void m68564c() {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                CrashHelper.m82479c(new IllegalStateException("Should be called from main thread,current thread Name:" + Thread.currentThread().getName() + " thread id:" + Thread.currentThread().getId()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public final void m68565d(d3q d3qVar) {
            m68564c();
            this.f45098a = d3qVar;
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if ((layoutParams instanceof StaggeredGridLayoutManager.C0595c) && (d3qVar instanceof d6m)) {
                ((d6m) d3qVar).mo71534b(this, (StaggeredGridLayoutManager.C0595c) layoutParams);
                this.itemView.setLayoutParams(layoutParams);
            }
        }

        /* JADX INFO: renamed from: e */
        public final d3q m68566e() {
            return this.f45098a;
        }

        /* JADX INFO: renamed from: f */
        public final void m68567f() {
            m68564c();
            d3q d3qVar = this.f45098a;
            if (d3qVar == null) {
                return;
            }
            try {
                d3qVar.mo72183w(this.itemView);
            } catch (Exception e) {
                CrashHelper.m82479c(new AdapterException("error occurs in unBind time: " + this.f45098a.toString() + ",thread = " + Thread.currentThread().getName(), e));
            } finally {
                this.f45098a = null;
            }
        }
    }

    public LiveBaseAdapter() {
        m68541M();
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public static C0603g.b m68530G(List<? extends d3q<?>> list, List<d3q<?>> list2) {
        return new C11587b(list, list2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C22421c m68531y(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: D */
    public final void m68533D(d3q<?> d3qVar) {
        this.f45087b.put(d3qVar.mo95343r(), d3qVar);
        this.f45086a.add(d3qVar);
    }

    /* JADX INFO: renamed from: E */
    public void m68534E(d3q<?> d3qVar) {
        if (this.f45086a.contains(d3qVar)) {
            return;
        }
        m68533D(d3qVar);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public final void m68535F(Iterable<? extends d3q<?>> iterable) {
        Iterator<? extends d3q<?>> it = iterable.iterator();
        while (it.hasNext()) {
            m68533D(it.next());
        }
    }

    /* JADX INFO: renamed from: H */
    public d3q m68536H(int i) {
        return this.f45086a.get(i);
    }

    /* JADX INFO: renamed from: I */
    public int m68537I(final d3q<?> d3qVar) {
        return jyb.m147476G(this.f45086a, new qcj() { // from class: l.hxr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((d3q) obj) == d3qVar);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public List<d3q<?>> m68538J() {
        return this.f45086a;
    }

    /* JADX INFO: renamed from: K */
    public int m68539K(int i) {
        if (i >= getItemCount() || i < 0) {
            return 1;
        }
        return this.f45086a.get(i).mo96608q();
    }

    /* JADX INFO: renamed from: L */
    public View mo68540L(ViewGroup viewGroup, int i) {
        d3q<?> d3qVar = this.f45087b.get(i, null);
        if (d3qVar != null) {
            return d3qVar.m113887s(viewGroup);
        }
        for (d3q<?> d3qVar2 : this.f45086a) {
            if (d3qVar2.mo95343r() == i) {
                this.f45087b.put(i, d3qVar2);
                return d3qVar2.m113887s(viewGroup);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public void m68541M() {
        this.f45086a = new ArrayList();
    }

    /* JADX INFO: renamed from: N */
    public void m68542N(int i, d3q<?> d3qVar) {
        this.f45086a.add(i, d3qVar);
        notifyItemInserted(i);
    }

    /* JADX INFO: renamed from: O */
    public void m68543O(d3q<?> d3qVar) {
        int iM68537I = m68537I(d3qVar);
        if (iM68537I != -1) {
            notifyItemChanged(iM68537I);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m68544P(d3q<?> d3qVar, we2 we2Var) {
        int iM68537I = m68537I(d3qVar);
        if (iM68537I != -1) {
            notifyItemChanged(iM68537I, we2Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C11588c c11588c, int i) {
        try {
            this.f45090e = c11588c.itemView;
            d3q d3qVarM68536H = m68536H(i);
            d3q d3qVarM68566e = c11588c.m68566e();
            if (d3qVarM68566e != null && d3qVarM68566e != d3qVarM68536H) {
                c11588c.m68567f();
            }
            c11588c.m68565d(d3qVarM68536H);
            d3qVarM68536H.mo71749u(c11588c.itemView);
            mo68560e(i);
        } catch (Exception e) {
            CrashHelper.m82480d(new IllegalStateException("liveBaseAdapter onBinder" + e.getMessage()), 5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C11588c c11588c, int i, @NonNull List<Object> list) {
        try {
            if (list.isEmpty()) {
                onBindViewHolder(c11588c, i);
                return;
            }
            d3q d3qVarM68536H = m68536H(i);
            d3q d3qVarM68566e = c11588c.m68566e();
            if (d3qVarM68566e != null && d3qVarM68566e != d3qVarM68536H) {
                c11588c.m68567f();
            }
            c11588c.m68565d(d3qVarM68536H);
            if (!d3qVarM68536H.m113888t()) {
                d3qVarM68536H.mo71749u(c11588c.itemView);
            }
            d3qVarM68536H.mo71942v(c11588c.itemView, list);
        } catch (Exception e) {
            CrashHelper.m82480d(new IllegalStateException("liveBaseAdapter onBinderWithPay" + e.getMessage()), 5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public C11588c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C11588c(mo68540L(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull C11588c c11588c) {
        super.onViewAttachedToWindow(c11588c);
        if (c11588c.m68566e() != null) {
            c11588c.m68566e().m113889x(c11588c.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull C11588c c11588c) {
        super.onViewDetachedFromWindow(c11588c);
        if (c11588c.m68566e() != null) {
            c11588c.m68566e().mo113890y(c11588c.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@NonNull C11588c c11588c) {
        super.onViewRecycled(c11588c);
        this.f45091f.onNext(c11588c.itemView);
        c11588c.m68567f();
    }

    /* JADX INFO: renamed from: W */
    public void m68551W(d3q<?> d3qVar) {
        int iM68537I = m68537I(d3qVar);
        if (iM68537I >= 0) {
            this.f45086a.remove(d3qVar);
            notifyItemRemoved(iM68537I);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m68552X(boolean z) {
        this.f45088c = z;
    }

    /* JADX INFO: renamed from: Y */
    public void m68553Y(RecyclerView recyclerView, View view) {
        this.f45092g = view;
        this.f45093h = recyclerView;
        m68559d0();
    }

    /* JADX INFO: renamed from: Z */
    public void m68554Z(List<? extends d3q<?>> list) {
        m68555a0(list, false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m68555a0(List<? extends d3q<?>> list, boolean z) {
        if (z) {
            C0603g.e eVarM3682c = C0603g.m3682c(m68530G(list, new ArrayList(this.f45086a)), true);
            this.f45086a.clear();
            m68535F(list);
            eVarM3682c.m3693b(this);
            m68559d0();
            return;
        }
        this.f45086a.clear();
        this.f45087b.clear();
        m68535F(list);
        notifyDataSetChanged();
        m68559d0();
    }

    /* JADX INFO: renamed from: b0 */
    public void m68556b0(List<? extends d3q<?>> list) {
        this.f45086a.clear();
        this.f45087b.clear();
        m68535F(list);
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return mo68561g(nerVar, c22421c, true);
    }

    /* JADX INFO: renamed from: c0 */
    public void m68558c0(y20<Integer> y20Var) {
        this.f45089d = y20Var;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m68559d0() {
        if (this.f45092g != null) {
            List<d3q<?>> list = this.f45086a;
            if (list == null || list.size() == 0) {
                bnl0.m105524M(this.f45092g, true);
            } else {
                bnl0.m105524M(this.f45092g, false);
            }
        }
        if (this.f45093h != null) {
            List<d3q<?>> list2 = this.f45086a;
            if (list2 == null || list2.size() == 0) {
                bnl0.m105524M(this.f45093h, false);
            } else {
                bnl0.m105524M(this.f45093h, true);
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo68560e(int i) {
        y20<Integer> y20Var = this.f45089d;
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(i));
        }
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public <V> C22421c<V> mo68561g(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f45090e;
        return psd0.m173593D(new pcj() { // from class: l.jxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveBaseAdapter.m68531y(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f45091f.filter(new qcj() { // from class: l.ixr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45086a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f45086a.get(i).mo95343r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f45094i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f45094i);
    }
}
