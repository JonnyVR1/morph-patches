package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zbx0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f202498a;

    /* JADX INFO: renamed from: b */
    public Object f202499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fcx0 f202500c;

    public zbx0(fcx0 fcx0Var, Comparable comparable, Object obj) {
        this.f202500c = fcx0Var;
        this.f202498a = comparable;
        this.f202499b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m218005b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m218006a() {
        return this.f202498a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f202498a.compareTo(((zbx0) obj).f202498a);
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
        return m218005b(this.f202498a, entry.getKey()) && m218005b(this.f202499b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f202498a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f202499b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f202498a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f202499b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f202500c.m120502n();
        Object obj2 = this.f202499b;
        this.f202499b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f202498a) + "=" + String.valueOf(this.f202499b);
    }
}
