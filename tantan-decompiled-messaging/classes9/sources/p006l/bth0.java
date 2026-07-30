package p006l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class bth0<V extends View> {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f9085a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int mo12578a();

    /* JADX INFO: renamed from: b */
    public void m12897b() {
        this.f9085a.notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    public abstract V mo12898c(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: d */
    public void m12899d(DataSetObserver dataSetObserver) {
        this.f9085a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: e */
    public void m12900e() {
        this.f9085a.unregisterAll();
    }
}
