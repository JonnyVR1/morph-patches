package p149l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sdm<V extends View> {

    /* JADX INFO: renamed from: a */
    public final DataSetObservable f163861a = new DataSetObservable();

    /* JADX INFO: renamed from: a */
    public abstract int mo110558a();

    /* JADX INFO: renamed from: b */
    public void m183506b() {
        this.f163861a.notifyChanged();
    }

    /* JADX INFO: renamed from: c */
    public abstract V mo183507c(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: d */
    public void m183508d(DataSetObserver dataSetObserver) {
        this.f163861a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: e */
    public void m183509e() {
        this.f163861a.unregisterAll();
    }
}
