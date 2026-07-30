package p149l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bth0<V extends View> {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f77226a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int mo100890a();

    /* JADX INFO: renamed from: b */
    public void m103834b() {
        this.f77226a.notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    public abstract V mo103835c(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: d */
    public void m103836d(DataSetObserver dataSetObserver) {
        this.f77226a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: e */
    public void m103837e() {
        this.f77226a.unregisterAll();
    }
}
