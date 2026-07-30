package p153l;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class f5x0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f97349c = Logger.getLogger(f5x0.class.getName());

    /* JADX INFO: renamed from: d */
    public static final f5x0 f97350d = new f5x0();

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap f97351a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f97352b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static f5x0 m124252c() {
        return f97350d;
    }

    /* JADX INFO: renamed from: a */
    public final yww0 m124253a(String str, Class cls) throws GeneralSecurityException {
        e5x0 e5x0VarM124258g = m124258g(str);
        if (e5x0VarM124258g.m119560b().contains(cls)) {
            if (((o5x0) e5x0VarM124258g.f92246a).f145122b.equals(cls)) {
                return e5x0VarM124258g.f92246a;
            }
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(e5x0VarM124258g.m119559a());
        Set<Class> setM119560b = e5x0VarM124258g.m119560b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : setM119560b) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public final yww0 m124254b(String str) throws GeneralSecurityException {
        return m124258g(str).f92246a;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m124255d(yww0 yww0Var, boolean z) throws GeneralSecurityException {
        m124257f(yww0Var, 1, true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m124256e(String str) {
        return ((Boolean) this.f97352b.get(str)).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m124257f(yww0 yww0Var, int i, boolean z) throws GeneralSecurityException {
        if (!s4x0.m184598a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        m124259h(new e5x0(yww0Var), false, true);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized e5x0 m124258g(String str) throws GeneralSecurityException {
        if (!this.f97351a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (e5x0) this.f97351a.get(str);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m124259h(e5x0 e5x0Var, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String str = ((o5x0) e5x0Var.f92246a).f145121a;
            if (this.f97352b.containsKey(str) && !((Boolean) this.f97352b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            e5x0 e5x0Var2 = (e5x0) this.f97351a.get(str);
            if (e5x0Var2 != null && !e5x0Var2.m119559a().equals(e5x0Var.m119559a())) {
                f97349c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, e5x0Var2.m119559a().getName(), e5x0Var.m119559a().getName()));
            }
            this.f97351a.putIfAbsent(str, e5x0Var);
            this.f97352b.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }
}
