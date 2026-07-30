package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class y5x0 {

    /* JADX INFO: renamed from: b */
    public static final y5x0 f197602b = new y5x0();

    /* JADX INFO: renamed from: a */
    public final Map f197603a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static y5x0 m214337a() {
        return f197602b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m214338b(x5x0 x5x0Var, Class cls) throws GeneralSecurityException {
        try {
            x5x0 x5x0Var2 = (x5x0) this.f197603a.get(cls);
            if (x5x0Var2 != null && !x5x0Var2.equals(x5x0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f197603a.put(cls, x5x0Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
