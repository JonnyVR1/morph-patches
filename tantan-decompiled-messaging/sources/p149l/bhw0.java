package p149l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bhw0 extends chw0 implements Map {
    /* JADX INFO: renamed from: b */
    public abstract Map mo101945b();

    @Override // java.util.Map
    public final void clear() {
        mo101945b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo101945b().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    /* JADX INFO: renamed from: f */
    public final int m101946f() {
        return vjw0.m198701a(entrySet());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m101947g(Object obj) {
        siw0 siw0Var = new siw0(entrySet().iterator());
        if (obj == null) {
            while (siw0Var.hasNext()) {
                if (siw0Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (siw0Var.hasNext()) {
            if (obj.equals(siw0Var.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m101948i(Object obj) {
        return xiw0.m209681b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo101945b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo101945b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo101945b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo101945b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return mo101945b().values();
    }
}
