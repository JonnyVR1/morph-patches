package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.AbstractC0566d0;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0610p<T, VH extends RecyclerView.AbstractC0566d0> extends RecyclerView.Adapter<VH> {
    final C0598d<T> mDiffer;
    private final C0598d.b<T> mListener;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.p$a */
    public class a implements C0598d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C0598d.b
        /* JADX INFO: renamed from: a */
        public void mo3650a(@NonNull List<T> list, @NonNull List<T> list2) {
            AbstractC0610p.this.onCurrentListChanged(list, list2);
        }
    }

    public AbstractC0610p(@NonNull C0601g.f<T> fVar) {
        a aVar = new a();
        this.mListener = aVar;
        C0598d<T> c0598d = new C0598d<>(new C0596b(this), new C0597c.a(fVar).m3638a());
        this.mDiffer = c0598d;
        c0598d.m3639a(aVar);
    }

    @NonNull
    public List<T> getCurrentList() {
        return this.mDiffer.m3640b();
    }

    public T getItem(int i) {
        return this.mDiffer.m3640b().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDiffer.m3640b().size();
    }

    public void onCurrentListChanged(@NonNull List<T> list, @NonNull List<T> list2) {
    }

    public void submitList(@Nullable List<T> list) {
        this.mDiffer.m3643e(list);
    }

    public void submitList(@Nullable List<T> list, @Nullable Runnable runnable) {
        this.mDiffer.m3644f(list, runnable);
    }

    public AbstractC0610p(@NonNull C0597c<T> c0597c) {
        a aVar = new a();
        this.mListener = aVar;
        C0598d<T> c0598d = new C0598d<>(new C0596b(this), c0597c);
        this.mDiffer = c0598d;
        c0598d.m3639a(aVar);
    }
}
