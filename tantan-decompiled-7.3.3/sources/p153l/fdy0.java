package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fdy0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Comparable f98529a;

    /* JADX INFO: renamed from: b */
    public Object f98530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ scy0 f98531c;

    public fdy0(scy0 scy0Var, Map.Entry entry) {
        this(scy0Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m125153a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((fdy0) obj).getKey());
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
        return m125153a(this.f98529a, entry.getKey()) && m125153a(this.f98530b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f98529a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f98530b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f98529a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f98530b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f98531c.m185410q();
        Object obj2 = this.f98530b;
        this.f98530b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f98529a) + "=" + String.valueOf(this.f98530b);
    }

    public fdy0(scy0 scy0Var, Comparable comparable, Object obj) {
        this.f98531c = scy0Var;
        this.f98529a = comparable;
        this.f98530b = obj;
    }
}
