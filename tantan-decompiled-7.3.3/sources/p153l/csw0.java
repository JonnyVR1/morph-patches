package p153l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class csw0 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public transient Set f83499a;

    /* JADX INFO: renamed from: b */
    public transient Collection f83500b;

    /* JADX INFO: renamed from: a */
    public abstract Set mo12585a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f83499a;
        if (set != null) {
            return set;
        }
        Set setMo12585a = mo12585a();
        this.f83499a = setMo12585a;
        return setMo12585a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f83500b;
        if (collection != null) {
            return collection;
        }
        bsw0 bsw0Var = new bsw0(this);
        this.f83500b = bsw0Var;
        return bsw0Var;
    }
}
