package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import l.mcr;
import l.mkd0;
import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class dac0<T> extends RecyclerView.Adapter<RecyclerView.d0> implements dml {

    /* JADX INFO: renamed from: a */
    public View f2921a = null;

    /* JADX INFO: renamed from: b */
    public C1186b<View> f2922b = C1186b.m9978b();

    /* JADX INFO: renamed from: l.dac0$a */
    public static class C0220a extends RecyclerView.d0 {
        public C0220a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ C1099c m3520y(C1099c c1099c) {
        return c1099c;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo202A(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: C */
    public abstract int mo203C();

    /* JADX INFO: renamed from: D */
    public abstract View mo204D(ViewGroup viewGroup, int i);

    @Override // p003l.dml
    /* JADX INFO: renamed from: c */
    public <V> C1099c<V> mo3522c(mcr mcrVar, C1099c<V> c1099c) {
        return mo3523g(mcrVar, c1099c, true);
    }

    @Override // p003l.dml
    /* JADX INFO: renamed from: g */
    public <V> C1099c<V> mo3523g(mcr mcrVar, final C1099c<V> c1099c, boolean z) {
        final View view = this.f2921a;
        return mkd0.D(new v9j() { // from class: l.cac0
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return dac0.m3520y(c1099c);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()).takeUntil(this.f2922b.filter(new w9j() { // from class: l.bac0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    public abstract T getItem(int i);

    public int getItemCount() {
        return mo203C();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        View view = d0Var.itemView;
        this.f2921a = view;
        mo202A(view, getItem(i), getItemViewType(i), i);
        mo358e(i);
    }

    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0220a(mo204D(viewGroup, i));
    }

    public void onViewRecycled(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        if (view != null) {
            this.f2922b.onNext(view);
        }
        super.onViewRecycled(d0Var);
    }

    /* JADX INFO: renamed from: e */
    public void mo358e(int i) {
    }
}
