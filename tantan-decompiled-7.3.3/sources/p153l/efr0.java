package p153l;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class efr0 {

    /* JADX INFO: renamed from: d */
    public static final ImmutableSet<String> f93816d = ImmutableSet.m15825of("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a */
    public String f93817a;

    /* JADX INFO: renamed from: b */
    public long f93818b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f93819c;

    public efr0(String str, long j, Map<String, Object> map) {
        this.f93817a = str;
        this.f93818b = j;
        HashMap map2 = new HashMap();
        this.f93819c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m120709c(String str, Object obj, Object obj2) {
        if (f93816d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else {
            if (obj instanceof Double) {
                return obj2;
            }
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a */
    public final long m120710a() {
        return this.f93818b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m120711b(String str) {
        if (this.f93819c.containsKey(str)) {
            return this.f93819c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new efr0(this.f93817a, this.f93818b, new HashMap(this.f93819c));
    }

    /* JADX INFO: renamed from: d */
    public final void m120712d(String str, Object obj) {
        Map<String, Object> map = this.f93819c;
        if (obj == null) {
            map.remove(str);
        } else {
            this.f93819c.put(str, m120709c(str, map.get(str), obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m120713e() {
        return this.f93817a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efr0)) {
            return false;
        }
        efr0 efr0Var = (efr0) obj;
        if (this.f93818b == efr0Var.f93818b && this.f93817a.equals(efr0Var.f93817a)) {
            return this.f93819c.equals(efr0Var.f93819c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m120714f(String str) {
        this.f93817a = str;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> m120715g() {
        return this.f93819c;
    }

    public final int hashCode() {
        int iHashCode = this.f93817a.hashCode() * 31;
        long j = this.f93818b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f93819c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f93817a + "', timestamp=" + this.f93818b + ", params=" + String.valueOf(this.f93819c) + "}";
    }
}
