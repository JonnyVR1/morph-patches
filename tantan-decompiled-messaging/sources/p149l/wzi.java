package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class wzi<T> extends a0j implements Iterator<T> {
    /* JADX INFO: renamed from: a */
    public abstract Iterator<T> mo15631a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return mo15631a().hasNext();
    }

    public T next() {
        return mo15631a().next();
    }
}
