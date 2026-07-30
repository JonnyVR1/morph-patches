package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wpx0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f187585a;

    /* JADX INFO: renamed from: b */
    public Object f187586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oqx0 f187587c;

    public wpx0(oqx0 oqx0Var, Comparable comparable, Object obj) {
        this.f187587c = oqx0Var;
        this.f187585a = comparable;
        this.f187586b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m204950b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m204951a() {
        return this.f187585a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f187585a.compareTo(((wpx0) obj).f187585a);
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
        return m204950b(this.f187585a, entry.getKey()) && m204950b(this.f187586b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f187585a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f187586b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f187585a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f187586b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f187587c.m165508o();
        Object obj2 = this.f187586b;
        this.f187586b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f187585a) + "=" + String.valueOf(this.f187586b);
    }
}
