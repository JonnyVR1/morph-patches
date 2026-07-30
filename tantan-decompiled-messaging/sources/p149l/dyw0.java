package p149l;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public final class dyw0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f88437a = new yxw0();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SecureRandom m114095a() {
        SecureRandom secureRandomM114097c = m114097c();
        secureRandomM114097c.nextLong();
        return secureRandomM114097c;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m114096b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f88437a.get()).nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static SecureRandom m114097c() {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused) {
                        return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null));
            }
        } catch (GeneralSecurityException unused4) {
            return new SecureRandom();
        }
    }
}
