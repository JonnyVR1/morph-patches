package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class z3y0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Comparable f201423a;

    /* JADX INFO: renamed from: b */
    public Object f201424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m3y0 f201425c;

    public z3y0(m3y0 m3y0Var, Map.Entry entry) {
        this(m3y0Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m217060a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((z3y0) obj).getKey());
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
        return m217060a(this.f201423a, entry.getKey()) && m217060a(this.f201424b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f201423a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f201424b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f201423a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f201424b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f201425c.m152979q();
        Object obj2 = this.f201424b;
        this.f201424b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f201423a) + "=" + String.valueOf(this.f201424b);
    }

    public z3y0(m3y0 m3y0Var, Comparable comparable, Object obj) {
        this.f201425c = m3y0Var;
        this.f201423a = comparable;
        this.f201424b = obj;
    }
}
