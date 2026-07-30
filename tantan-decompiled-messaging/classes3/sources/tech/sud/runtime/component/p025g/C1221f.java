package tech.sud.runtime.component.p025g;

import l.ig3;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1221f {

    /* JADX INFO: renamed from: a */
    public static final C1221f f11394a = new C1221f("tableDirectory");

    /* JADX INFO: renamed from: b */
    public static final C1221f f11395b = new C1221f("name");

    /* JADX INFO: renamed from: c */
    private final String f11396c;

    private C1221f(String str) {
        this.f11396c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1221f m10308a(String str) {
        if (str != null) {
            return new C1221f(str);
        }
        ig3.a("A TrueType font table name must not be null");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1221f) {
            return this.f11396c.equals(((C1221f) obj).m10309a());
        }
        return false;
    }

    public int hashCode() {
        return this.f11396c.hashCode();
    }

    public String toString() {
        return this.f11396c;
    }

    /* JADX INFO: renamed from: a */
    public String m10309a() {
        return this.f11396c;
    }
}
