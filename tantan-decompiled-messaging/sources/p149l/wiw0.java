package p149l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wiw0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public transient Set f186582a;

    /* JADX INFO: renamed from: b */
    public transient Collection f186583b;

    /* JADX INFO: renamed from: a */
    public abstract Set mo12531a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f186582a;
        if (set != null) {
            return set;
        }
        Set setMo12531a = mo12531a();
        this.f186582a = setMo12531a;
        return setMo12531a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f186583b;
        if (collection != null) {
            return collection;
        }
        viw0 viw0Var = new viw0(this);
        this.f186583b = viw0Var;
        return viw0Var;
    }
}
