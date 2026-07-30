package p003l;

import java.util.List;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractC0158a<T> extends wp1<T> {
    @Override // android.widget.Adapter
    public int getCount() {
        return mo1912p().size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        return mo1912p().get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX INFO: renamed from: p */
    public abstract List<T> mo1912p();
}
