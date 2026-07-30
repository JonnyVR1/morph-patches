package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r2j<T> extends v2j implements Iterator<T> {
    /* JADX INFO: renamed from: a */
    public abstract Iterator<T> mo15685a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return mo15685a().hasNext();
    }

    public T next() {
        return mo15685a().next();
    }
}
