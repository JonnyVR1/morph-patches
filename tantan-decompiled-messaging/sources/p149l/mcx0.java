package p149l;

import com.google.android.gms.internal.ads.zzgyl;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class mcx0 extends AbstractList implements RandomAccess, dax0 {

    /* JADX INFO: renamed from: a */
    public final dax0 f133192a;

    public mcx0(dax0 dax0Var) {
        this.f133192a = dax0Var;
    }

    @Override // p149l.dax0
    /* JADX INFO: renamed from: Y */
    public final void mo105952Y(zzgyl zzgylVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((cax0) this.f133192a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new lcx0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new kcx0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f133192a.size();
    }

    @Override // p149l.dax0
    public final Object zzf(int i) {
        return this.f133192a.zzf(i);
    }

    @Override // p149l.dax0
    public final List zzh() {
        return this.f133192a.zzh();
    }

    @Override // p149l.dax0
    public final dax0 zze() {
        return this;
    }
}
