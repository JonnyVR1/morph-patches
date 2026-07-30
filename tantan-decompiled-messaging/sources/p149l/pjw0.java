package p149l;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pjw0 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return vjw0.m198705e(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
