package p153l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class t4x0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f172151a = Logger.getLogger(t4x0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f172152b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static Boolean m189330a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f172151a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m189331b() {
        return f172152b.get();
    }
}
