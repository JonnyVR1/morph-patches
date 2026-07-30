package p149l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public final class nvw0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f140852a = Logger.getLogger(nvw0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f140853b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static Boolean m161764a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f140852a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m161765b() {
        return f140853b.get();
    }
}
