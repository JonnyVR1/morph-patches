package p153l;

import com.google.android.gms.internal.ads.zzgyl;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class slx0 extends AbstractList implements RandomAccess, jjx0 {

    /* JADX INFO: renamed from: a */
    public final jjx0 f169464a;

    public slx0(jjx0 jjx0Var) {
        this.f169464a = jjx0Var;
    }

    @Override // p153l.jjx0
    /* JADX INFO: renamed from: Z */
    public final void mo140242Z(zzgyl zzgylVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((ijx0) this.f169464a).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new rlx0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new qlx0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f169464a.size();
    }

    @Override // p153l.jjx0
    public final Object zzf(int i) {
        return this.f169464a.zzf(i);
    }

    @Override // p153l.jjx0
    public final List zzh() {
        return this.f169464a.zzh();
    }

    @Override // p153l.jjx0
    public final jjx0 zze() {
        return this;
    }
}
