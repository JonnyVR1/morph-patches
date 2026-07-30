package org.spongycastle.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CollectionStore<T> implements Store<T>, Iterable<T> {
    private Collection<T> _local;

    public CollectionStore(Collection<T> collection) {
        this._local = new ArrayList(collection);
    }

    @Override // org.spongycastle.util.Store
    public Collection<T> getMatches(Selector<T> selector) {
        if (selector == null) {
            return new ArrayList(this._local);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : this._local) {
            if (selector.match(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @Override // org.spongycastle.util.Iterable, java.lang.Iterable
    public Iterator<T> iterator() {
        return getMatches(null).iterator();
    }
}
