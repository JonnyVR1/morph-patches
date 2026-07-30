package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class luy<T> extends RecyclerView.Adapter<RecyclerView.AbstractC0566d0> implements swl {

    /* JADX INFO: renamed from: a */
    public View f130103a = null;

    /* JADX INFO: renamed from: b */
    public C22393b<View> f130104b = C22393b.m221521b();

    /* JADX INFO: renamed from: l.luy$a */
    public static class C18320a extends RecyclerView.AbstractC0566d0 {
        public C18320a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C22306c m151827y(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo147967A(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract int mo147968C();

    /* JADX INFO: renamed from: D */
    public abstract T mo147969D(int i);

    /* JADX INFO: renamed from: E */
    public abstract View mo147970E(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: F */
    public abstract void mo147971F(int i);

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public final <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return mo67378g(mcrVar, c22306c, true);
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public final <V> C22306c<V> mo67378g(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f130103a;
        return mkd0.m154952D(new v9j() { // from class: l.kuy
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return luy.m151827y(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f130104b.filter(new w9j() { // from class: l.juy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return mo147968C();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view = abstractC0566d0.itemView;
        this.f130103a = view;
        mo147967A(view, mo147969D(i), getItemViewType(i), i);
        mo147971F(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.AbstractC0566d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C18320a(mo147970E(viewGroup, i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        View view = abstractC0566d0.itemView;
        if (view != null) {
            this.f130104b.onNext(view);
        }
        super.onViewRecycled(abstractC0566d0);
    }
}
