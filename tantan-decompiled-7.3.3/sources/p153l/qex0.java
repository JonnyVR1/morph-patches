package p153l;

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
public final class qex0 implements jww0 {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal f157223f = new oex0();

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal f157224g = new pex0();

    /* JADX INFO: renamed from: a */
    public final byte[] f157225a;

    /* JADX INFO: renamed from: b */
    public final byte[] f157226b;

    /* JADX INFO: renamed from: c */
    public final byte[] f157227c;

    /* JADX INFO: renamed from: d */
    public final SecretKeySpec f157228d;

    /* JADX INFO: renamed from: e */
    public final int f157229e;

    public qex0(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!s4x0.m184598a(1)) {
            phw0.m172339a("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            wg3.m206174a("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.f157229e = i;
        ufx0.m195878a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f157228d = secretKeySpec;
        Cipher cipher = (Cipher) f157223f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM176278c = m176278c(cipher.doFinal(new byte[16]));
        this.f157225a = bArrM176278c;
        this.f157226b = m176278c(bArrM176278c);
        this.f157227c = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static jww0 m176277b(jzw0 jzw0Var) throws GeneralSecurityException {
        if (s4x0.m184598a(1)) {
            jzw0Var.m147745a();
            return new qex0(jzw0Var.m147747c().m210864d(www0.m208321a()), jzw0Var.m147745a().m183862b(), jzw0Var.m147746b().m206172c());
        }
        phw0.m172339a("Can not use AES-EAX in FIPS-mode.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m176278c(byte[] bArr) {
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
    private static byte[] m176279f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f157227c;
        if (bArr3.length == 0) {
            return m176281e(bArr, bArr2);
        }
        if (!u7x0.m194895b(bArr3, bArr)) {
            phw0.m172339a("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArr4 = this.f157227c;
        return m176281e(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m176280d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m176279f(bArr2, this.f157225a));
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
            bArrCopyOf = m176279f(bArrCopyOfRange, this.f157225a);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f157226b, 16);
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
        return cipher.doFinal(m176279f(bArrDoFinal, bArrCopyOf));
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m176281e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.f157229e) - 16;
        if (i < 0) {
            phw0.m172339a("ciphertext too short");
            return null;
        }
        Cipher cipher = (Cipher) f157223f.get();
        cipher.init(1, this.f157228d);
        byte[] bArrM176280d = m176280d(cipher, 0, bArr, 0, this.f157229e);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM176280d2 = m176280d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrM176280d3 = m176280d(cipher, 2, bArr, this.f157229e, i);
        int i2 = length - 16;
        byte b = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b = (byte) (b | (((bArr[i2 + i3] ^ bArrM176280d2[i3]) ^ bArrM176280d[i3]) ^ bArrM176280d3[i3]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f157224g.get();
        cipher2.init(1, this.f157228d, new IvParameterSpec(bArrM176280d));
        return cipher2.doFinal(bArr, this.f157229e, i);
    }
}
