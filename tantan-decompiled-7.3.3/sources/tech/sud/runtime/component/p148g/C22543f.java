package tech.sud.runtime.component.p148g;

import com.facebook.AuthenticationTokenClaims;
import p153l.wg3;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C22543f {

    /* JADX INFO: renamed from: a */
    public static final C22543f f208691a = new C22543f("tableDirectory");

    /* JADX INFO: renamed from: b */
    public static final C22543f f208692b = new C22543f(AuthenticationTokenClaims.JSON_KEY_NAME);

    /* JADX INFO: renamed from: c */
    private final String f208693c;

    private C22543f(String str) {
        this.f208693c = str;
    }

    /* JADX INFO: renamed from: a */
    public static C22543f m223083a(String str) {
        if (str != null) {
            return new C22543f(str);
        }
        wg3.m206174a("A TrueType font table name must not be null");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22543f) {
            return this.f208693c.equals(((C22543f) obj).m223084a());
        }
        return false;
    }

    public int hashCode() {
        return this.f208693c.hashCode();
    }

    public String toString() {
        return this.f208693c;
    }

    /* JADX INFO: renamed from: a */
    public String m223084a() {
        return this.f208693c;
    }
}
