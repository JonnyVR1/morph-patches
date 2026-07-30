package p153l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j1i0<V extends View> {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f117970a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int mo143134a();

    /* JADX INFO: renamed from: b */
    public void m143135b() {
        this.f117970a.notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    public abstract V mo143136c(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: d */
    public void m143137d(DataSetObserver dataSetObserver) {
        this.f117970a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: e */
    public void m143138e() {
        this.f117970a.unregisterAll();
    }
}
