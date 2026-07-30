package p153l;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes6.dex */
public final class j7x0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f118740a = new e7x0();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SecureRandom m143816a() {
        SecureRandom secureRandomM143818c = m143818c();
        secureRandomM143818c.nextLong();
        return secureRandomM143818c;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m143817b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f118740a.get()).nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static SecureRandom m143818c() {
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
