package tech.sud.runtime.component.p144g;

import com.facebook.AuthenticationTokenClaims;
import p149l.ig3;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C22428f {

    /* JADX INFO: renamed from: a */
    public static final C22428f f207769a = new C22428f("tableDirectory");

    /* JADX INFO: renamed from: b */
    public static final C22428f f207770b = new C22428f(AuthenticationTokenClaims.JSON_KEY_NAME);

    /* JADX INFO: renamed from: c */
    private final String f207771c;

    private C22428f(String str) {
        this.f207771c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C22428f m221837a(String str) {
        if (str != null) {
            return new C22428f(str);
        }
        ig3.m135964a("A TrueType font table name must not be null");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22428f) {
            return this.f207771c.equals(((C22428f) obj).m221838a());
        }
        return false;
    }

    public int hashCode() {
        return this.f207771c.hashCode();
    }

    public String toString() {
        return this.f207771c;
    }

    /* JADX INFO: renamed from: a */
    public String m221838a() {
        return this.f207771c;
    }
}
