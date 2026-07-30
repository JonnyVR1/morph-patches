package p153l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public abstract class igm<V extends View> {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f114801a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int mo139944a();

    /* JADX INFO: renamed from: b */
    public void m139945b() {
        this.f114801a.notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    public abstract V mo139946c(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: d */
    public void m139947d(DataSetObserver dataSetObserver) {
        this.f114801a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: e */
    public void m139948e() {
        this.f114801a.unregisterAll();
    }
}
