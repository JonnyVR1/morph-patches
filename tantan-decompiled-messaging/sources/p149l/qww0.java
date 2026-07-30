package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class qww0 {

    /* JADX INFO: renamed from: b */
    public static final qww0 f156791b = new qww0();

    /* JADX INFO: renamed from: a */
    public final Map f156792a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static qww0 m176927b() {
        return f156791b;
    }

    /* JADX INFO: renamed from: a */
    public final rnw0 m176928a(fow0 fow0Var, Integer num) throws GeneralSecurityException {
        return m176930d(fow0Var, null);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m176929c(pww0 pww0Var, Class cls) throws GeneralSecurityException {
        try {
            pww0 pww0Var2 = (pww0) this.f156792a.get(cls);
            if (pww0Var2 != null && !pww0Var2.equals(pww0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f156792a.put(cls, pww0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized rnw0 m176930d(fow0 fow0Var, Integer num) throws GeneralSecurityException {
        pww0 pww0Var;
        pww0Var = (pww0) this.f156792a.get(fow0Var.getClass());
        if (pww0Var == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(fow0Var) + ": no key creator for this class was registered.");
        }
        return pww0Var.mo108458a(fow0Var, null);
    }
}
