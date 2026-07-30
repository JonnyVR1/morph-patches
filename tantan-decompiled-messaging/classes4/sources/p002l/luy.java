package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import l.mcr;
import l.mkd0;
import l.v9j;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class luy<T> extends RecyclerView.Adapter<RecyclerView.d0> implements swl {

    /* JADX INFO: renamed from: a */
    public View f15077a = null;

    /* JADX INFO: renamed from: b */
    public b<View> f15078b = b.b();

    /* JADX INFO: renamed from: l.luy$a */
    public static class C0669a extends RecyclerView.d0 {
        public C0669a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ c m17473y(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo16901A(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract int mo16902C();

    /* JADX INFO: renamed from: D */
    public abstract T mo16903D(int i);

    /* JADX INFO: renamed from: E */
    public abstract View mo16904E(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: F */
    public abstract void mo16905F(int i);

    /* JADX INFO: renamed from: c */
    public final <V> c<V> m17475c(mcr mcrVar, c<V> cVar) {
        return m17476g(mcrVar, cVar, true);
    }

    /* JADX INFO: renamed from: g */
    public final <V> c<V> m17476g(mcr mcrVar, final c<V> cVar, boolean z) {
        final View view = this.f15077a;
        return mkd0.D(new v9j() { // from class: l.kuy
            public final Object call() {
                return luy.m17473y(cVar);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()).takeUntil(this.f15078b.filter(new w9j() { // from class: l.juy
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    public final int getItemCount() {
        return mo16902C();
    }

    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        View view = d0Var.itemView;
        this.f15077a = view;
        mo16901A(view, mo16903D(i), getItemViewType(i), i);
        mo16905F(i);
    }

    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0669a(mo16904E(viewGroup, i));
    }

    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        if (view != null) {
            this.f15078b.onNext(view);
        }
        super.onViewRecycled(d0Var);
    }
}
