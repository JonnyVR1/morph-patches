package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import l.mcr;
import l.mkd0;
import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class wp1<T> extends BaseAdapter implements AbsListView.RecyclerListener, dml {

    /* JADX INFO: renamed from: a */
    public View f8583a = null;

    /* JADX INFO: renamed from: b */
    public C1186b<View> f8584b = C1186b.m9978b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C1099c m8574d(C1099c c1099c) {
        return c1099c;
    }

    @Override // p003l.dml
    /* JADX INFO: renamed from: c */
    public <V> C1099c<V> mo3522c(mcr mcrVar, C1099c<V> c1099c) {
        return mo3523g(mcrVar, c1099c, true);
    }

    @Override // p003l.dml
    /* JADX INFO: renamed from: g */
    public <V> C1099c<V> mo3523g(mcr mcrVar, final C1099c<V> c1099c, boolean z) {
        final View view = this.f8583a;
        return mkd0.D(new v9j() { // from class: l.vp1
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return wp1.m8574d(c1099c);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()).takeUntil(this.f8584b.filter(new w9j() { // from class: l.up1
            @Override // p003l.w9j
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
            view = mo1006m(viewGroup, itemViewType);
        }
        this.f8583a = view;
        mo1005j(view, getItem(i), itemViewType, i);
        mo6564e(i);
        return view;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1005j(View view, T t, int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract View mo1006m(ViewGroup viewGroup, int i);

    @Override // android.widget.AbsListView.RecyclerListener
    public void onMovedToScrapHeap(View view) {
        if (view != null) {
            this.f8584b.onNext(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo6564e(int i) {
    }
}
