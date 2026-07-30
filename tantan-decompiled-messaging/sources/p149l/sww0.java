package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sww0 {

    /* JADX INFO: renamed from: b */
    public static final sww0 f166758b = new sww0();

    /* JADX INFO: renamed from: a */
    public final Map f166759a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static sww0 m186387a() {
        return f166758b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m186388b(rww0 rww0Var, Class cls) throws GeneralSecurityException {
        try {
            rww0 rww0Var2 = (rww0) this.f166759a.get(cls);
            if (rww0Var2 != null && !rww0Var2.equals(rww0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f166759a.put(cls, rww0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
