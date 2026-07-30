package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i3z<T> extends RecyclerView.Adapter<RecyclerView.AbstractC0569e0> implements kzl {

    /* JADX INFO: renamed from: a */
    public View f112797a = null;

    /* JADX INFO: renamed from: b */
    public C22508b<View> f112798b = C22508b.m222767b();

    /* JADX INFO: renamed from: l.i3z$a */
    public static class C17633a extends RecyclerView.AbstractC0569e0 {
        public C17633a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C22421c m138361y(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo138363A(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract int mo138364C();

    /* JADX INFO: renamed from: D */
    public abstract T mo138365D(int i);

    /* JADX INFO: renamed from: E */
    public abstract View mo138366E(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: F */
    public abstract void mo138367F(int i);

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public final <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return mo68561g(nerVar, c22421c, true);
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public final <V> C22421c<V> mo68561g(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f112797a;
        return psd0.m173593D(new pcj() { // from class: l.h3z
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return i3z.m138361y(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f112798b.filter(new qcj() { // from class: l.g3z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return mo138364C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view = abstractC0569e0.itemView;
        this.f112797a = view;
        mo138363A(view, mo138365D(i), getItemViewType(i), i);
        mo138367F(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.AbstractC0569e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C17633a(mo138366E(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        if (view != null) {
            this.f112798b.onNext(view);
        }
        super.onViewRecycled(abstractC0569e0);
    }
}
