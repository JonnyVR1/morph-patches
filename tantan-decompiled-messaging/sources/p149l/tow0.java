package p149l;

import com.google.android.gms.internal.ads.C2253t4;
import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgyl;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class tow0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f171416a = Logger.getLogger(tow0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final ConcurrentMap f171417b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final Set f171418c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(dnw0.class);
        hashSet.add(jnw0.class);
        hashSet.add(vow0.class);
        hashSet.add(pnw0.class);
        hashSet.add(knw0.class);
        hashSet.add(eow0.class);
        hashSet.add(t1x0.class);
        hashSet.add(oow0.class);
        hashSet.add(sow0.class);
        f171418c = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C2253t4 m189935a(C2261u4 c2261u4) throws GeneralSecurityException {
        snw0 snw0VarM220489b;
        snw0VarM220489b = zvw0.m220487c().m220489b(c2261u4.m13352R());
        if (!zvw0.m220487c().m220491e(c2261u4.m13352R())) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(c2261u4.m13352R())));
        }
        return snw0VarM220489b.mo138780b(c2261u4.m13351Q());
    }

    /* JADX INFO: renamed from: b */
    public static Class m189936b(Class cls) {
        try {
            return axw0.m99526a().m99527b(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Object m189937c(C2253t4 c2253t4, Class cls) throws GeneralSecurityException {
        return m189938d(c2253t4.m13327Q(), c2253t4.m13326P(), cls);
    }

    /* JADX INFO: renamed from: d */
    public static Object m189938d(String str, zzgyl zzgylVar, Class cls) throws GeneralSecurityException {
        return zvw0.m220487c().m220488a(str, cls).mo138779a(zzgylVar);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m189939e(snw0 snw0Var, boolean z) throws GeneralSecurityException {
        try {
            if (snw0Var == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (!f171418c.contains(snw0Var.zzb())) {
                throw new GeneralSecurityException("Registration of key managers for class " + snw0Var.zzb().toString() + " has been disabled. Please file an issue on https://github.com/tink-crypto/tink-java");
            }
            if (!mvw0.m156606a(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            zvw0.m220487c().m220490d(snw0Var, true);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static synchronized void m189940f(now0 now0Var) throws GeneralSecurityException {
        axw0.m99526a().m99531f(now0Var);
    }
}
