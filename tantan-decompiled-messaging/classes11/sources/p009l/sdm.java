package p009l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class sdm<V extends View> {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f20189a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int mo13034a();

    /* JADX INFO: renamed from: b */
    public void m22102b() {
        this.f20189a.notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    public abstract V mo22103c(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: d */
    public void m22104d(DataSetObserver dataSetObserver) {
        this.f20189a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: e */
    public void m22105e() {
        this.f20189a.unregisterAll();
    }
}
