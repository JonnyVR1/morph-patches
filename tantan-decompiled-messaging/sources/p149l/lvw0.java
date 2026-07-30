package p149l;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class lvw0 implements dnw0 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f130208c = i6x0.m134670b("7a806c");

    /* JADX INFO: renamed from: d */
    public static final byte[] f130209d = i6x0.m134670b("46bb91c3c5");

    /* JADX INFO: renamed from: e */
    public static final byte[] f130210e = i6x0.m134670b("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f */
    public static final byte[] f130211f = i6x0.m134670b("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g */
    public static final byte[] f130212g = i6x0.m134670b("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal f130213h = new kvw0();

    /* JADX INFO: renamed from: a */
    public final SecretKey f130214a;

    /* JADX INFO: renamed from: b */
    public final byte[] f130215b;

    public lvw0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f130215b = bArr2;
        o6x0.m162948a(bArr.length);
        this.f130214a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: b */
    public static dnw0 m151917b(mrw0 mrw0Var) throws GeneralSecurityException {
        return new lvw0(mrw0Var.m156090c().m178105d(qnw0.m175705a()), mrw0Var.m156089b().m173181c());
    }

    /* JADX INFO: renamed from: d */
    public static AlgorithmParameterSpec m151919d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        return new GCMParameterSpec(128, bArr, 0, i2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m151920e(Cipher cipher) {
        try {
            byte[] bArr = f130211f;
            cipher.init(2, new SecretKeySpec(f130210e, "AES"), m151919d(bArr, 0, bArr.length));
            cipher.updateAAD(f130209d);
            byte[] bArr2 = f130212g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f130208c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f130215b;
        if (bArr3.length == 0) {
            return m151921f(bArr, bArr2);
        }
        if (!oyw0.m166726b(bArr3, bArr)) {
            j8w0.m140474a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f130215b;
        return m151921f(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m151921f(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f130213h.get();
        if (cipher == null) {
            j8w0.m140474a("AES GCM SIV cipher is not available or is invalid.");
            return null;
        }
        int length = bArr.length;
        if (length < 28) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        cipher.init(2, this.f130214a, m151919d(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }
}
