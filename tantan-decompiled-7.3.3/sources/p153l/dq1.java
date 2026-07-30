package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dq1<T> extends BaseAdapter implements AbsListView.RecyclerListener, pol {

    /* JADX INFO: renamed from: a */
    public View f90098a = null;

    /* JADX INFO: renamed from: b */
    public C22508b<View> f90099b = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22421c m117438d(C22421c c22421c) {
        return c22421c;
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return mo68561g(nerVar, c22421c, true);
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public <V> C22421c<V> mo68561g(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f90098a;
        return psd0.m173593D(new pcj() { // from class: l.cq1
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dq1.m117438d(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f90099b.filter(new qcj() { // from class: l.bq1
            @Override // p153l.qcj
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
            view = mo21402m(viewGroup, itemViewType);
        }
        this.f90098a = view;
        mo21401j(view, getItem(i), itemViewType, i);
        mo42529e(i);
        return view;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo21401j(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract View mo21402m(ViewGroup viewGroup, int i);

    @Override // android.widget.AbsListView.RecyclerListener
    public void onMovedToScrapHeap(View view) {
        if (view != null) {
            this.f90099b.onNext(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
    }
}
