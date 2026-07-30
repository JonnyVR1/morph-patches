package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.AbstractC0569e0;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0612p<T, VH extends RecyclerView.AbstractC0569e0> extends RecyclerView.Adapter<VH> {
    final C0600d<T> mDiffer;
    private final C0600d.b<T> mListener;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$a */
    public class a implements C0600d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C0600d.b
        /* JADX INFO: renamed from: a */
        public void mo3651a(@NonNull List<T> list, @NonNull List<T> list2) {
            AbstractC0612p.this.onCurrentListChanged(list, list2);
        }
    }

    public AbstractC0612p(@NonNull C0603g.f<T> fVar) {
        a aVar = new a();
        this.mListener = aVar;
        C0600d<T> c0600d = new C0600d<>(new C0598b(this), new C0599c.a(fVar).m3639a());
        this.mDiffer = c0600d;
        c0600d.m3640a(aVar);
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.mDiffer.m3641b();
    }

    public T getItem(int i) {
        return this.mDiffer.m3641b().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.m3641b().size();
    }

    public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
    }

    public void submitList(@Nullable List<T> list) {
        this.mDiffer.m3644e(list);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        this.mDiffer.m3645f(list, runnable);
    }

    public AbstractC0612p(@NonNull C0599c<T> c0599c) {
        a aVar = new a();
        this.mListener = aVar;
        C0600d<T> c0600d = new C0600d<>(new C0598b(this), c0599c);
        this.mDiffer = c0600d;
        c0600d.m3640a(aVar);
    }
}
