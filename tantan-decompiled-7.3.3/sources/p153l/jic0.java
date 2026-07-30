package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jic0<T> extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> implements pol {

    /* JADX INFO: renamed from: a */
    public View f121061a = null;

    /* JADX INFO: renamed from: b */
    public C22508b<View> f121062b = C22508b.m222767b();

    /* JADX INFO: renamed from: l.jic0$a */
    public static class C17956a extends RecyclerView.AbstractC0569e0 {
        public C17956a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C22421c m144974y(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo29822A(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract int mo29823C();

    /* JADX INFO: renamed from: D */
    public abstract View mo29824D(ViewGroup viewGroup, int i);

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return mo68561g(nerVar, c22421c, true);
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public <V> C22421c<V> mo68561g(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f121061a;
        return psd0.m173593D(new pcj() { // from class: l.iic0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jic0.m144974y(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f121062b.filter(new qcj() { // from class: l.hic0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    public abstract T getItem(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return mo29823C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view = abstractC0569e0.itemView;
        this.f121061a = view;
        mo29822A(view, getItem(i), getItemViewType(i), i);
        mo48510e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17956a(mo29824D(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        if (view != null) {
            this.f121062b.onNext(view);
        }
        super.onViewRecycled(abstractC0569e0);
    }

    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
    }
}
