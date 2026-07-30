package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class czx0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f84503a;

    /* JADX INFO: renamed from: b */
    public Object f84504b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uzx0 f84505c;

    public czx0(uzx0 uzx0Var, Comparable comparable, Object obj) {
        this.f84505c = uzx0Var;
        this.f84503a = comparable;
        this.f84504b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m113351b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m113352a() {
        return this.f84503a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f84503a.compareTo(((czx0) obj).f84503a);
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
        return m113351b(this.f84503a, entry.getKey()) && m113351b(this.f84504b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f84503a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84504b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f84503a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f84504b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f84505c.m198877o();
        Object obj2 = this.f84504b;
        this.f84504b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f84503a) + "=" + String.valueOf(this.f84504b);
    }
}
