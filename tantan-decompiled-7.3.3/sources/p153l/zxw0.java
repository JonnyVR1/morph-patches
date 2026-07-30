package p153l;

import com.google.android.gms.internal.ads.C2276t4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class zxw0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f206524a = Logger.getLogger(zxw0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap f206525b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final Set f206526c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(jww0.class);
        hashSet.add(pww0.class);
        hashSet.add(byw0.class);
        hashSet.add(vww0.class);
        hashSet.add(qww0.class);
        hashSet.add(kxw0.class);
        hashSet.add(zax0.class);
        hashSet.add(uxw0.class);
        hashSet.add(yxw0.class);
        f206526c = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2276t4 m222088a(C2284u4 c2284u4) throws GeneralSecurityException {
        yww0 yww0VarM124254b;
        yww0VarM124254b = f5x0.m124252c().m124254b(c2284u4.m13406R());
        if (!f5x0.m124252c().m124256e(c2284u4.m13406R())) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c2284u4.m13406R())));
        }
        return yww0VarM124254b.mo166182b(c2284u4.m13405Q());
    }

    /* JADX INFO: renamed from: b */
    public static Class m222089b(Class cls) {
        try {
            return g6x0.m129300a().m129301b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m222090c(C2276t4 c2276t4, Class cls) throws GeneralSecurityException {
        return m222091d(c2276t4.m13381Q(), c2276t4.m13380P(), cls);
    }

    /* JADX INFO: renamed from: d */
    public static Object m222091d(String str, zzgyl zzgylVar, Class cls) throws GeneralSecurityException {
        return f5x0.m124252c().m124253a(str, cls).mo166181a(zzgylVar);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m222092e(yww0 yww0Var, boolean z) throws GeneralSecurityException {
        try {
            if (yww0Var == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (!f206526c.contains(yww0Var.zzb())) {
                throw new GeneralSecurityException("Registration of key managers for class " + yww0Var.zzb().toString() + " has been disabled. Please file an issue on https://github.com/tink-crypto/tink-java");
            }
            if (!s4x0.m184598a(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            f5x0.m124252c().m124255d(yww0Var, true);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m222093f(txw0 txw0Var) throws GeneralSecurityException {
        g6x0.m129300a().m129305f(txw0Var);
    }
}
