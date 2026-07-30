package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dac0<T> extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> implements dml {

    /* JADX INFO: renamed from: a */
    public View f85220a = null;

    /* JADX INFO: renamed from: b */
    public C22393b<View> f85221b = C22393b.m221521b();

    /* JADX INFO: renamed from: l.dac0$a */
    public static class C16326a extends RecyclerView.AbstractC0566d0 {
        public C16326a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C22306c m110588y(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo28823A(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract int mo28824C();

    /* JADX INFO: renamed from: D */
    public abstract View mo28825D(ViewGroup viewGroup, int i);

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return mo67378g(mcrVar, c22306c, true);
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public <V> C22306c<V> mo67378g(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f85220a;
        return mkd0.m154952D(new v9j() { // from class: l.cac0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return dac0.m110588y(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f85221b.filter(new w9j() { // from class: l.bac0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    public abstract T getItem(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return mo28824C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view = abstractC0566d0.itemView;
        this.f85220a = view;
        mo28823A(view, getItem(i), getItemViewType(i), i);
        mo47327e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C16326a(mo28825D(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        View view = abstractC0566d0.itemView;
        if (view != null) {
            this.f85221b.onNext(view);
        }
        super.onViewRecycled(abstractC0566d0);
    }

    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
    }
}
