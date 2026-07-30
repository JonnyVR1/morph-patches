package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wp1<T> extends BaseAdapter implements AbsListView.RecyclerListener, dml {

    /* JADX INFO: renamed from: a */
    public View f187483a = null;

    /* JADX INFO: renamed from: b */
    public C22393b<View> f187484b = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22306c m204894d(C22306c c22306c) {
        return c22306c;
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return mo67378g(mcrVar, c22306c, true);
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public <V> C22306c<V> mo67378g(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f187483a;
        return mkd0.m154952D(new v9j() { // from class: l.vp1
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wp1.m204894d(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f187484b.filter(new w9j() { // from class: l.up1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        if (view == null) {
            view = mo20403m(viewGroup, itemViewType);
        }
        this.f187483a = view;
        mo20402j(view, getItem(i), itemViewType, i);
        mo41518e(i);
        return view;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo20402j(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract View mo20403m(ViewGroup viewGroup, int i);

    @Override // android.widget.AbsListView.RecyclerListener
    public void onMovedToScrapHeap(View view) {
        if (view != null) {
            this.f187484b.onNext(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo41518e(int i) {
    }
}
