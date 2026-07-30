package p149l;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class y5r0 {

    /* JADX INFO: renamed from: d */
    public static final ImmutableSet<String> f196473d = ImmutableSet.m15771of("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a */
    public String f196474a;

    /* JADX INFO: renamed from: b */
    public long f196475b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f196476c;

    public y5r0(String str, long j, Map<String, Object> map) {
        this.f196474a = str;
        this.f196475b = j;
        HashMap map2 = new HashMap();
        this.f196476c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m213010c(String str, Object obj, Object obj2) {
        if (f196473d.contains(str) && (obj2 instanceof Double)) {
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
    public final long m213011a() {
        return this.f196475b;
    }

    /* JADX INFO: renamed from: b */
    public final Object m213012b(String str) {
        if (this.f196476c.containsKey(str)) {
            return this.f196476c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new y5r0(this.f196474a, this.f196475b, new HashMap(this.f196476c));
    }

    /* JADX INFO: renamed from: d */
    public final void m213013d(String str, Object obj) {
        Map<String, Object> map = this.f196476c;
        if (obj == null) {
            map.remove(str);
        } else {
            this.f196476c.put(str, m213010c(str, map.get(str), obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m213014e() {
        return this.f196474a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5r0)) {
            return false;
        }
        y5r0 y5r0Var = (y5r0) obj;
        if (this.f196475b == y5r0Var.f196475b && this.f196474a.equals(y5r0Var.f196474a)) {
            return this.f196476c.equals(y5r0Var.f196476c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m213015f(String str) {
        this.f196474a = str;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> m213016g() {
        return this.f196476c;
    }

    public final int hashCode() {
        int iHashCode = this.f196474a.hashCode() * 31;
        long j = this.f196475b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f196476c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f196474a + "', timestamp=" + this.f196475b + ", params=" + String.valueOf(this.f196476c) + "}";
    }
}
