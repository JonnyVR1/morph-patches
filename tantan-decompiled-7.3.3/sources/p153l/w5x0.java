package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class w5x0 {

    /* JADX INFO: renamed from: b */
    public static final w5x0 f187565b = new w5x0();

    /* JADX INFO: renamed from: a */
    public final Map f187566a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static w5x0 m204996b() {
        return f187565b;
    }

    /* JADX INFO: renamed from: a */
    public final xww0 m204997a(lxw0 lxw0Var, Integer num) throws GeneralSecurityException {
        return m204999d(lxw0Var, null);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m204998c(v5x0 v5x0Var, Class cls) throws GeneralSecurityException {
        try {
            v5x0 v5x0Var2 = (v5x0) this.f187566a.get(cls);
            if (v5x0Var2 != null && !v5x0Var2.equals(v5x0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f187566a.put(cls, v5x0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized xww0 m204999d(lxw0 lxw0Var, Integer num) throws GeneralSecurityException {
        v5x0 v5x0Var;
        v5x0Var = (v5x0) this.f187566a.get(lxw0Var.getClass());
        if (v5x0Var == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(lxw0Var) + ": no key creator for this class was registered.");
        }
        return v5x0Var.mo102265a(lxw0Var, null);
    }
}
