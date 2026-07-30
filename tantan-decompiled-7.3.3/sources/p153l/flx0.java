package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class flx0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f99698a;

    /* JADX INFO: renamed from: b */
    public Object f99699b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ llx0 f99700c;

    public flx0(llx0 llx0Var, Comparable comparable, Object obj) {
        this.f99700c = llx0Var;
        this.f99698a = comparable;
        this.f99699b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m126171b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m126172a() {
        return this.f99698a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f99698a.compareTo(((flx0) obj).f99698a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m126171b(this.f99698a, entry.getKey()) && m126171b(this.f99699b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f99698a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f99699b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f99698a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f99699b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f99700c.m154812n();
        Object obj2 = this.f99699b;
        this.f99699b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f99698a) + "=" + String.valueOf(this.f99699b);
    }
}
