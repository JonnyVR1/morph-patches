package p153l;

import java.util.List;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15610a<T> extends dq1<T> {
    @Override // android.widget.Adapter
    public int getCount() {
        return mo21403p().size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        return mo21403p().get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX INFO: renamed from: p */
    public abstract List<T> mo21403p();
}
