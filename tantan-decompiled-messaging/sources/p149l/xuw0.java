package p149l;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class xuw0 {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f194561b = new wuw0();

    /* JADX INFO: renamed from: a */
    public final SecretKey f194562a;

    public xuw0(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!mvw0.m156606a(2)) {
            j8w0.m140474a("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        o6x0.m162948a(bArr.length);
        this.f194562a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m211223a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            j8w0.m140474a("iv is wrong size");
            return null;
        }
        int length = bArr2.length;
        if (length < 28) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        if (!ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            j8w0.m140474a("iv does not match prepended iv");
            return null;
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        ThreadLocal threadLocal = f194561b;
        ((Cipher) threadLocal.get()).init(2, this.f194562a, gCMParameterSpec);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, 12, length - 12);
    }
}
