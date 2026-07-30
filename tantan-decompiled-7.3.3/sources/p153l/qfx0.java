package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class qfx0 implements zax0 {

    /* JADX INFO: renamed from: a */
    public final SecretKey f157356a;

    /* JADX INFO: renamed from: b */
    public final byte[] f157357b;

    /* JADX INFO: renamed from: c */
    public final byte[] f157358c;

    public qfx0(byte[] bArr) throws GeneralSecurityException {
        ufx0.m195878a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f157356a = secretKeySpec;
        Cipher cipherM176426b = m176426b();
        cipherM176426b.init(1, secretKeySpec);
        byte[] bArrM108515a = cax0.m108515a(cipherM176426b.doFinal(new byte[16]));
        this.f157357b = bArrM108515a;
        this.f157358c = cax0.m108515a(bArrM108515a);
    }

    /* JADX INFO: renamed from: b */
    public static Cipher m176426b() throws GeneralSecurityException {
        if (s4x0.m184598a(1)) {
            return (Cipher) cfx0.f81598b.m109659a("AES/ECB/NoPadding");
        }
        phw0.m172339a("Can not use AES-CMAC in FIPS-mode.");
        return null;
    }

    @Override // p153l.zax0
    /* JADX INFO: renamed from: a */
    public final byte[] mo176427a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrM185578c;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f157356a;
        Cipher cipherM176426b = m176426b();
        cipherM176426b.init(1, secretKey);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        int i2 = iMax - 1;
        int i3 = i2 * 16;
        if (iMax * 16 == length) {
            bArrM185578c = sex0.m185579d(bArr, i3, this.f157357b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                wg3.m206174a("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrM185578c = sex0.m185578c(bArrCopyOf, this.f157358c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i4 = 0; i4 < i2; i4++) {
            bArrDoFinal = cipherM176426b.doFinal(sex0.m185579d(bArrDoFinal, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(cipherM176426b.doFinal(sex0.m185578c(bArrM185578c, bArrDoFinal)), i);
    }
}
