package p149l;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class k5x0 implements dnw0 {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal f121242f = new i5x0();

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal f121243g = new j5x0();

    /* JADX INFO: renamed from: a */
    public final byte[] f121244a;

    /* JADX INFO: renamed from: b */
    public final byte[] f121245b;

    /* JADX INFO: renamed from: c */
    public final byte[] f121246c;

    /* JADX INFO: renamed from: d */
    public final SecretKeySpec f121247d;

    /* JADX INFO: renamed from: e */
    public final int f121248e;

    public k5x0(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!mvw0.m156606a(1)) {
            j8w0.m140474a("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            ig3.m135964a("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.f121248e = i;
        o6x0.m162948a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f121247d = secretKeySpec;
        Cipher cipher = (Cipher) f121242f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM144557c = m144557c(cipher.doFinal(new byte[16]));
        this.f121244a = bArrM144557c;
        this.f121245b = m144557c(bArrM144557c);
        this.f121246c = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static dnw0 m144556b(dqw0 dqw0Var) throws GeneralSecurityException {
        if (mvw0.m156606a(1)) {
            dqw0Var.m113147a();
            return new k5x0(dqw0Var.m113149c().m178105d(qnw0.m175705a()), dqw0Var.m113147a().m151105b(), dqw0Var.m113148b().m173181c());
        }
        j8w0.m140474a("Can not use AES-EAX in FIPS-mode.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m144557c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA) ^ (b2 + b2));
        return bArr2;
    }

    /* JADX INFO: renamed from: f */
    private static byte[] m144558f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f121246c;
        if (bArr3.length == 0) {
            return m144560e(bArr, bArr2);
        }
        if (!oyw0.m166726b(bArr3, bArr)) {
            j8w0.m140474a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f121246c;
        return m144560e(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m144559d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m144558f(bArr2, this.f121244a));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArrDoFinal[i6] = (byte) (bArr[(i2 + i5) + i6] ^ bArrDoFinal[i6]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i5 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = m144558f(bArrCopyOfRange, this.f121244a);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f121245b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                bArrCopyOf[i4] = (byte) (bArrCopyOf[i4] ^ bArrCopyOfRange[i4]);
                i4++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
        }
        return cipher.doFinal(m144558f(bArrDoFinal, bArrCopyOf));
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m144560e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.f121248e) - 16;
        if (i < 0) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        Cipher cipher = (Cipher) f121242f.get();
        cipher.init(1, this.f121247d);
        byte[] bArrM144559d = m144559d(cipher, 0, bArr, 0, this.f121248e);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM144559d2 = m144559d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM144559d3 = m144559d(cipher, 2, bArr, this.f121248e, i);
        int i2 = length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[i2 + i3] ^ bArrM144559d2[i3]) ^ bArrM144559d[i3]) ^ bArrM144559d3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f121243g.get();
        cipher2.init(1, this.f121247d, new IvParameterSpec(bArrM144559d));
        return cipher2.doFinal(bArr, this.f121248e, i);
    }
}
