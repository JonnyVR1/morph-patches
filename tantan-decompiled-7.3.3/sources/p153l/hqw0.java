package p153l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hqw0 extends iqw0 implements Map {
    /* JADX INFO: renamed from: b */
    public abstract Map mo136708b();

    @Override // java.util.Map
    public final void clear() {
        mo136708b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo136708b().containsKey(obj);
    }

    @Override // java.util.Map
    public abstract Set entrySet();

    /* JADX INFO: renamed from: f */
    public final int m136709f() {
        return btw0.m106403a(entrySet());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m136710g(Object obj) {
        yrw0 yrw0Var = new yrw0(entrySet().iterator());
        if (obj == null) {
            while (yrw0Var.hasNext()) {
                if (yrw0Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (yrw0Var.hasNext()) {
            if (obj.equals(yrw0Var.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m136711i(Object obj) {
        return dsw0.m117780b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return mo136708b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo136708b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return mo136708b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo136708b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return mo136708b().values();
    }
}
