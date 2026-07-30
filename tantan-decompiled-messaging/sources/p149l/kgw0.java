package p149l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class kgw0 extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lgw0 f123105a;

    public kgw0(lgw0 lgw0Var) {
        this.f123105a = lgw0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f123105a.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f123105a.zzs().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f123105a.zzg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f123105a.zze();
    }
}
