package p153l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class d4x0 {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f85084b = new c4x0();

    /* JADX INFO: renamed from: a */
    public final SecretKey f85085a;

    public d4x0(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!s4x0.m184598a(2)) {
            phw0.m172339a("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        ufx0.m195878a(bArr.length);
        this.f85085a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m114247a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            phw0.m172339a("iv is wrong size");
            return null;
        }
        int length = bArr2.length;
        if (length < 28) {
            phw0.m172339a("ciphertext too short");
            return null;
        }
        if (!ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            phw0.m172339a("iv does not match prepended iv");
            return null;
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        ThreadLocal threadLocal = f85084b;
        ((Cipher) threadLocal.get()).init(2, this.f85085a, gCMParameterSpec);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, 12, length - 12);
    }
}
