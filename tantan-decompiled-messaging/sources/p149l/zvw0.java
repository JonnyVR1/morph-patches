package p149l;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class zvw0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f205070c = Logger.getLogger(zvw0.class.getName());

    /* JADX INFO: renamed from: d */
    public static final zvw0 f205071d = new zvw0();

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap f205072a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f205073b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static zvw0 m220487c() {
        return f205071d;
    }

    /* JADX INFO: renamed from: a */
    public final snw0 m220488a(String str, Class cls) throws GeneralSecurityException {
        yvw0 yvw0VarM220493g = m220493g(str);
        if (yvw0VarM220493g.m216244b().contains(cls)) {
            if (((iww0) yvw0VarM220493g.f200295a).f115311b.equals(cls)) {
                return yvw0VarM220493g.f200295a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(yvw0VarM220493g.m216243a());
        Set<Class> setM216244b = yvw0VarM220493g.m216244b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setM216244b) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final snw0 m220489b(String str) throws GeneralSecurityException {
        return m220493g(str).f200295a;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m220490d(snw0 snw0Var, boolean z) throws GeneralSecurityException {
        m220492f(snw0Var, 1, true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m220491e(String str) {
        return ((Boolean) this.f205073b.get(str)).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m220492f(snw0 snw0Var, int i, boolean z) throws GeneralSecurityException {
        if (!mvw0.m156606a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        m220494h(new yvw0(snw0Var), false, true);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized yvw0 m220493g(String str) throws GeneralSecurityException {
        if (!this.f205072a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (yvw0) this.f205072a.get(str);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m220494h(yvw0 yvw0Var, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String str = ((iww0) yvw0Var.f200295a).f115310a;
            if (this.f205073b.containsKey(str) && !((Boolean) this.f205073b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            yvw0 yvw0Var2 = (yvw0) this.f205072a.get(str);
            if (yvw0Var2 != null && !yvw0Var2.m216243a().equals(yvw0Var.m216243a())) {
                f205070c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, yvw0Var2.m216243a().getName(), yvw0Var.m216243a().getName()));
            }
            this.f205072a.putIfAbsent(str, yvw0Var);
            this.f205073b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
