package p153l;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class r4x0 implements jww0 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f161252c = ofx0.m167517b("7a806c");

    /* JADX INFO: renamed from: d */
    public static final byte[] f161253d = ofx0.m167517b("46bb91c3c5");

    /* JADX INFO: renamed from: e */
    public static final byte[] f161254e = ofx0.m167517b("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f */
    public static final byte[] f161255f = ofx0.m167517b("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g */
    public static final byte[] f161256g = ofx0.m167517b("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal f161257h = new q4x0();

    /* JADX INFO: renamed from: a */
    public final SecretKey f161258a;

    /* JADX INFO: renamed from: b */
    public final byte[] f161259b;

    public r4x0(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f161259b = bArr2;
        ufx0.m195878a(bArr.length);
        this.f161258a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: b */
    public static jww0 m179828b(s0x0 s0x0Var) throws GeneralSecurityException {
        return new r4x0(s0x0Var.m183989c().m210864d(www0.m208321a()), s0x0Var.m183988b().m206172c());
    }

    /* JADX INFO: renamed from: d */
    public static AlgorithmParameterSpec m179830d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        return new GCMParameterSpec(128, bArr, 0, i2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m179831e(Cipher cipher) {
        try {
            byte[] bArr = f161255f;
            cipher.init(2, new SecretKeySpec(f161254e, "AES"), m179830d(bArr, 0, bArr.length));
            cipher.updateAAD(f161253d);
            byte[] bArr2 = f161256g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f161252c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f161259b;
        if (bArr3.length == 0) {
            return m179832f(bArr, bArr2);
        }
        if (!u7x0.m194895b(bArr3, bArr)) {
            phw0.m172339a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f161259b;
        return m179832f(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m179832f(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f161257h.get();
        if (cipher == null) {
            phw0.m172339a("AES GCM SIV cipher is not available or is invalid.");
            return null;
        }
        int length = bArr.length;
        if (length < 28) {
            phw0.m172339a("ciphertext too short");
            return null;
        }
        cipher.init(2, this.f161258a, m179830d(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }
}
