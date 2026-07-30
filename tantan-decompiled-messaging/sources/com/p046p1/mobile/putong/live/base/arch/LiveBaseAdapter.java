package com.p046p1.mobile.putong.live.base.arch;

import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0601g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.d1q;
import p149l.dml;
import p149l.e30;
import p149l.l6j;
import p149l.m3m;
import p149l.mcr;
import p149l.mkd0;
import p149l.oe2;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBaseAdapter extends RecyclerView.Adapter<C11425c> implements dml {

    /* JADX INFO: renamed from: a */
    public List<d1q<?>> f44238a;

    /* JADX INFO: renamed from: g */
    public View f44244g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f44245h;

    /* JADX INFO: renamed from: b */
    public SparseArray<d1q<?>> f44239b = new SparseArray<>();

    /* JADX INFO: renamed from: c */
    public boolean f44240c = false;

    /* JADX INFO: renamed from: d */
    public e30<Integer> f44241d = null;

    /* JADX INFO: renamed from: e */
    public View f44242e = null;

    /* JADX INFO: renamed from: f */
    public C22393b<View> f44243f = C22393b.m221521b();

    /* JADX INFO: renamed from: i */
    public final RecyclerView.AbstractC0582t f44246i = new C11423a();

    public static class AdapterException extends Exception {
        public AdapterException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.LiveBaseAdapter$a */
    public class C11423a extends RecyclerView.AbstractC0582t {
        public C11423a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (LiveBaseAdapter.this.f44240c) {
                if (i == 0) {
                    l6j.m148744a().m164425y();
                } else {
                    l6j.m148744a().m164419s();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.LiveBaseAdapter$b */
    public class C11424b extends C0601g.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f44248a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f44249b;

        public C11424b(List list, List list2) {
            this.f44248a = list;
            this.f44249b = list2;
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: a */
        public boolean mo3645a(int i, int i2) {
            return ((d1q) this.f44249b.get(i)).equals(this.f44248a.get(i2));
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: b */
        public boolean mo3646b(int i, int i2) {
            return ((d1q) this.f44249b.get(i)).mo109066r() == ((d1q) this.f44248a.get(i2)).mo109066r();
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        @Nullable
        /* JADX INFO: renamed from: c */
        public Object mo3647c(int i, int i2) {
            return ((d1q) this.f44248a.get(i2)).mo109666n();
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: d */
        public int mo3648d() {
            return this.f44248a.size();
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: e */
        public int mo3649e() {
            return this.f44249b.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.arch.LiveBaseAdapter$c */
    public static class C11425c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public d1q f44250a;

        public C11425c(View view) {
            super(view);
        }

        /* JADX INFO: renamed from: c */
        public final void m67381c() {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                CrashHelper.m81296c(new IllegalStateException("Should be called from main thread,current thread Name:" + Thread.currentThread().getName() + " thread id:" + Thread.currentThread().getId()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: d */
        public final void m67382d(d1q d1qVar) {
            m67381c();
            this.f44250a = d1qVar;
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if ((layoutParams instanceof StaggeredGridLayoutManager.C0593c) && (d1qVar instanceof m3m)) {
                ((m3m) d1qVar).mo70351b(this, (StaggeredGridLayoutManager.C0593c) layoutParams);
                this.itemView.setLayoutParams(layoutParams);
            }
        }

        /* JADX INFO: renamed from: e */
        public final d1q m67383e() {
            return this.f44250a;
        }

        /* JADX INFO: renamed from: f */
        public final void m67384f() {
            m67381c();
            d1q d1qVar = this.f44250a;
            if (d1qVar == null) {
                return;
            }
            try {
                d1qVar.mo71000w(this.itemView);
            } catch (Exception e) {
                CrashHelper.m81296c(new AdapterException("error occurs in unBind time: " + this.f44250a.toString() + ",thread = " + Thread.currentThread().getName(), e));
            } finally {
                this.f44250a = null;
            }
        }
    }

    public LiveBaseAdapter() {
        m67358M();
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public static C0601g.b m67347G(List<? extends d1q<?>> list, List<d1q<?>> list2) {
        return new C11424b(list, list2);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C22306c m67348y(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: D */
    public final void m67350D(d1q<?> d1qVar) {
        this.f44239b.put(d1qVar.mo109066r(), d1qVar);
        this.f44238a.add(d1qVar);
    }

    /* JADX INFO: renamed from: E */
    public void m67351E(d1q<?> d1qVar) {
        if (this.f44238a.contains(d1qVar)) {
            return;
        }
        m67350D(d1qVar);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public final void m67352F(Iterable<? extends d1q<?>> iterable) {
        Iterator<? extends d1q<?>> it = iterable.iterator();
        while (it.hasNext()) {
            m67350D(it.next());
        }
    }

    /* JADX INFO: renamed from: H */
    public d1q m67353H(int i) {
        return this.f44238a.get(i);
    }

    /* JADX INFO: renamed from: I */
    public int m67354I(final d1q<?> d1qVar) {
        return vwb.m200293G(this.f44238a, new w9j() { // from class: l.gvr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((d1q) obj) == d1qVar);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public List<d1q<?>> m67355J() {
        return this.f44238a;
    }

    /* JADX INFO: renamed from: K */
    public int m67356K(int i) {
        if (i >= getItemCount() || i < 0) {
            return 1;
        }
        return this.f44238a.get(i).mo95844q();
    }

    /* JADX INFO: renamed from: L */
    public View mo67357L(ViewGroup viewGroup, int i) {
        d1q<?> d1qVar = this.f44239b.get(i, null);
        if (d1qVar != null) {
            return d1qVar.m109669s(viewGroup);
        }
        for (d1q<?> d1qVar2 : this.f44238a) {
            if (d1qVar2.mo109066r() == i) {
                this.f44239b.put(i, d1qVar2);
                return d1qVar2.m109669s(viewGroup);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public void m67358M() {
        this.f44238a = new ArrayList();
    }

    /* JADX INFO: renamed from: N */
    public void m67359N(int i, d1q<?> d1qVar) {
        this.f44238a.add(i, d1qVar);
        notifyItemInserted(i);
    }

    /* JADX INFO: renamed from: O */
    public void m67360O(d1q<?> d1qVar) {
        int iM67354I = m67354I(d1qVar);
        if (iM67354I != -1) {
            notifyItemChanged(iM67354I);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m67361P(d1q<?> d1qVar, oe2 oe2Var) {
        int iM67354I = m67354I(d1qVar);
        if (iM67354I != -1) {
            notifyItemChanged(iM67354I, oe2Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C11425c c11425c, int i) {
        try {
            this.f44242e = c11425c.itemView;
            d1q d1qVarM67353H = m67353H(i);
            d1q d1qVarM67383e = c11425c.m67383e();
            if (d1qVarM67383e != null && d1qVarM67383e != d1qVarM67353H) {
                c11425c.m67384f();
            }
            c11425c.m67382d(d1qVarM67353H);
            d1qVarM67353H.mo70566u(c11425c.itemView);
            mo67377e(i);
        } catch (Exception e) {
            CrashHelper.m81297d(new IllegalStateException("liveBaseAdapter onBinder" + e.getMessage()), 5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull C11425c c11425c, int i, @NonNull List<Object> list) {
        try {
            if (list.isEmpty()) {
                onBindViewHolder(c11425c, i);
                return;
            }
            d1q d1qVarM67353H = m67353H(i);
            d1q d1qVarM67383e = c11425c.m67383e();
            if (d1qVarM67383e != null && d1qVarM67383e != d1qVarM67353H) {
                c11425c.m67384f();
            }
            c11425c.m67382d(d1qVarM67353H);
            if (!d1qVarM67353H.m109670t()) {
                d1qVarM67353H.mo70566u(c11425c.itemView);
            }
            d1qVarM67353H.mo70759v(c11425c.itemView, list);
        } catch (Exception e) {
            CrashHelper.m81297d(new IllegalStateException("liveBaseAdapter onBinderWithPay" + e.getMessage()), 5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public C11425c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C11425c(mo67357L(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NonNull C11425c c11425c) {
        super.onViewAttachedToWindow(c11425c);
        if (c11425c.m67383e() != null) {
            c11425c.m67383e().m109671x(c11425c.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NonNull C11425c c11425c) {
        super.onViewDetachedFromWindow(c11425c);
        if (c11425c.m67383e() != null) {
            c11425c.m67383e().mo109672y(c11425c.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void onViewRecycled(@NonNull C11425c c11425c) {
        super.onViewRecycled(c11425c);
        this.f44243f.onNext(c11425c.itemView);
        c11425c.m67384f();
    }

    /* JADX INFO: renamed from: W */
    public void m67368W(d1q<?> d1qVar) {
        int iM67354I = m67354I(d1qVar);
        if (iM67354I >= 0) {
            this.f44238a.remove(d1qVar);
            notifyItemRemoved(iM67354I);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m67369X(boolean z) {
        this.f44240c = z;
    }

    /* JADX INFO: renamed from: Y */
    public void m67370Y(RecyclerView recyclerView, View view) {
        this.f44244g = view;
        this.f44245h = recyclerView;
        m67376d0();
    }

    /* JADX INFO: renamed from: Z */
    public void m67371Z(List<? extends d1q<?>> list) {
        m67372a0(list, false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m67372a0(List<? extends d1q<?>> list, boolean z) {
        if (z) {
            C0601g.e eVarM3681c = C0601g.m3681c(m67347G(list, new ArrayList(this.f44238a)), true);
            this.f44238a.clear();
            m67352F(list);
            eVarM3681c.m3692b(this);
            m67376d0();
            return;
        }
        this.f44238a.clear();
        this.f44239b.clear();
        m67352F(list);
        notifyDataSetChanged();
        m67376d0();
    }

    /* JADX INFO: renamed from: b0 */
    public void m67373b0(List<? extends d1q<?>> list) {
        this.f44238a.clear();
        this.f44239b.clear();
        m67352F(list);
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return mo67378g(mcrVar, c22306c, true);
    }

    /* JADX INFO: renamed from: c0 */
    public void m67375c0(e30<Integer> e30Var) {
        this.f44241d = e30Var;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m67376d0() {
        if (this.f44244g != null) {
            List<d1q<?>> list = this.f44238a;
            if (list == null || list.size() == 0) {
                xdl0.m208344M(this.f44244g, true);
            } else {
                xdl0.m208344M(this.f44244g, false);
            }
        }
        if (this.f44245h != null) {
            List<d1q<?>> list2 = this.f44238a;
            if (list2 == null || list2.size() == 0) {
                xdl0.m208344M(this.f44245h, false);
            } else {
                xdl0.m208344M(this.f44245h, true);
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: e */
    public void mo67377e(int i) {
        e30<Integer> e30Var = this.f44241d;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public <V> C22306c<V> mo67378g(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f44242e;
        return mkd0.m154952D(new v9j() { // from class: l.ivr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveBaseAdapter.m67348y(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f44243f.filter(new w9j() { // from class: l.hvr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f44238a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f44238a.get(i).mo109066r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(this.f44246i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.removeOnScrollListener(this.f44246i);
    }
}
